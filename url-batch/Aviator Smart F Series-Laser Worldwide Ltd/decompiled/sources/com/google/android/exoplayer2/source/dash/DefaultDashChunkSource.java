package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final BaseUrlExclusionList baseUrlExclusionList;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;

    @Nullable
    private IOException fatalError;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i8, int[] iArr, ExoTrackSelection exoTrackSelection, int i9, long j8, boolean z7, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
            DataSource createDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                createDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i8, iArr, exoTrackSelection, i9, createDataSource, j8, this.maxSegmentsPerLoad, z7, list, playerTrackEmsgHandler, playerId, cmcdConfiguration);
        }

        public Factory(DataSource.Factory factory, int i8) {
            this(BundledChunkExtractor.FACTORY, factory, i8);
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i8) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i8;
        }
    }

    protected static final class RepresentationHolder {

        @Nullable
        final ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final BaseUrl selectedBaseUrl;

        RepresentationHolder(long j8, Representation representation, BaseUrl baseUrl, @Nullable ChunkExtractor chunkExtractor, long j9, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j8;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j9;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        @CheckResult
        RepresentationHolder copyWithNewRepresentation(long j8, Representation representation) {
            long segmentNum;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j8, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(j8, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j8);
            if (segmentCount == 0) {
                return new RepresentationHolder(j8, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j9 = segmentCount + firstSegmentNum;
            long j10 = j9 - 1;
            long timeUs2 = index.getTimeUs(j10) + index.getDurationUs(j10, j8);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j11 = this.segmentNumShift;
            if (timeUs2 != timeUs3) {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum = j11 - (index2.getSegmentNum(timeUs, j8) - firstSegmentNum);
                    return new RepresentationHolder(j8, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum, index2);
                }
                j9 = index.getSegmentNum(timeUs3, j8);
            }
            segmentNum = j11 + (j9 - firstSegmentNum2);
            return new RepresentationHolder(j8, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum, index2);
        }

        @CheckResult
        RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        @CheckResult
        RepresentationHolder copyWithNewSelectedBaseUrl(BaseUrl baseUrl) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public long getFirstAvailableSegmentNum(long j8) {
            return this.segmentIndex.getFirstAvailableSegmentNum(this.periodDurationUs, j8) + this.segmentNumShift;
        }

        public long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getLastAvailableSegmentNum(long j8) {
            return (getFirstAvailableSegmentNum(j8) + this.segmentIndex.getAvailableSegmentCount(this.periodDurationUs, j8)) - 1;
        }

        public long getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentEndTimeUs(long j8) {
            return getSegmentStartTimeUs(j8) + this.segmentIndex.getDurationUs(j8 - this.segmentNumShift, this.periodDurationUs);
        }

        public long getSegmentNum(long j8) {
            return this.segmentIndex.getSegmentNum(j8, this.periodDurationUs) + this.segmentNumShift;
        }

        public long getSegmentStartTimeUs(long j8) {
            return this.segmentIndex.getTimeUs(j8 - this.segmentNumShift);
        }

        public RangedUri getSegmentUrl(long j8) {
            return this.segmentIndex.getSegmentUrl(j8 - this.segmentNumShift);
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j8, long j9) {
            return this.segmentIndex.isExplicit() || j9 == C.TIME_UNSET || getSegmentEndTimeUs(j8) <= j9;
        }
    }

    protected static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j8, long j9, long j10) {
            super(j8, j9);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j10;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            RangedUri segmentUrl = this.representationHolder.getSegmentUrl(currentIndex);
            int i8 = this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8;
            RepresentationHolder representationHolder = this.representationHolder;
            return DashUtil.buildDataSpec(representationHolder.representation, representationHolder.selectedBaseUrl.url, segmentUrl, i8, ImmutableMap.of());
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i8, int[] iArr, ExoTrackSelection exoTrackSelection, int i9, DataSource dataSource, long j8, int i10, boolean z7, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        this.trackType = i9;
        this.dataSource = dataSource;
        this.periodIndex = i8;
        this.elapsedRealtimeOffsetMs = j8;
        this.maxSegmentsPerLoad = i10;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler;
        this.cmcdConfiguration = cmcdConfiguration;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i8);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i11 = 0;
        while (i11 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i11));
            BaseUrl selectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            int i12 = i11;
            this.representationHolders[i12] = new RepresentationHolder(periodDurationUs, representation, selectBaseUrl == null ? representation.baseUrls.get(0) : selectBaseUrl, factory.createProgressiveMediaExtractor(i9, representation.format, z7, list, playerTrackEmsgHandler, playerId), 0L, representation.getIndex());
            i11 = i12 + 1;
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (exoTrackSelection.isTrackExcluded(i9, elapsedRealtime)) {
                i8++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i8);
    }

    private long getAvailableLiveDurationUs(long j8, long j9) {
        if (!this.manifest.dynamic || this.representationHolders[0].getSegmentCount() == 0) {
            return C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(getNowPeriodTimeUs(j8), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j8))) - j9);
    }

    private long getNowPeriodTimeUs(long j8) {
        DashManifest dashManifest = this.manifest;
        long j9 = dashManifest.availabilityStartTimeMs;
        return j9 == C.TIME_UNSET ? C.TIME_UNSET : j8 - Util.msToUs(j9 + dashManifest.getPeriod(this.periodIndex).startMs);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i8 : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i8).representations);
        }
        return arrayList;
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j8, long j9, long j10) {
        return mediaChunk != null ? mediaChunk.getNextChunkIndex() : Util.constrainValue(representationHolder.getSegmentNum(j8), j9, j10);
    }

    private RepresentationHolder updateSelectedBaseUrl(int i8) {
        RepresentationHolder representationHolder = this.representationHolders[i8];
        BaseUrl selectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (selectBaseUrl == null || selectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        RepresentationHolder copyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(selectBaseUrl);
        this.representationHolders[i8] = copyWithNewSelectedBaseUrl;
        return copyWithNewSelectedBaseUrl;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = representationHolder.getSegmentNum(j8);
                    long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                    return seekParameters.resolveSeekPositionUs(j8, segmentStartTimeUs, (segmentStartTimeUs >= j8 || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
        }
        return j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getNextChunk(long j8, long j9, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        boolean z7;
        boolean z8;
        ?? r10;
        int i8;
        int i9;
        MediaChunkIterator[] mediaChunkIteratorArr;
        long j10;
        long j11;
        if (this.fatalError != null) {
            return;
        }
        long j12 = j9 - j8;
        long msToUs = Util.msToUs(this.manifest.availabilityStartTimeMs) + Util.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + j9;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(msToUs)) {
            return;
        }
        long msToUs2 = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long nowPeriodTimeUs = getNowPeriodTimeUs(msToUs2);
        MediaChunk mediaChunk = list.isEmpty() ? null : list.get(list.size() - 1);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
        int i10 = 0;
        while (i10 < length) {
            RepresentationHolder representationHolder = this.representationHolders[i10];
            if (representationHolder.segmentIndex == null) {
                mediaChunkIteratorArr2[i10] = MediaChunkIterator.EMPTY;
                i8 = i10;
                i9 = length;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                j10 = j12;
                j11 = msToUs2;
            } else {
                long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(msToUs2);
                long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(msToUs2);
                i8 = i10;
                i9 = length;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                j10 = j12;
                j11 = msToUs2;
                long segmentNum = getSegmentNum(representationHolder, mediaChunk, j9, firstAvailableSegmentNum, lastAvailableSegmentNum);
                if (segmentNum < firstAvailableSegmentNum) {
                    mediaChunkIteratorArr[i8] = MediaChunkIterator.EMPTY;
                } else {
                    mediaChunkIteratorArr[i8] = new RepresentationSegmentIterator(updateSelectedBaseUrl(i8), segmentNum, lastAvailableSegmentNum, nowPeriodTimeUs);
                }
            }
            i10 = i8 + 1;
            msToUs2 = j11;
            length = i9;
            mediaChunkIteratorArr2 = mediaChunkIteratorArr;
            j12 = j10;
        }
        long j13 = j12;
        long j14 = msToUs2;
        this.trackSelection.updateSelectedTrack(j8, j13, getAvailableLiveDurationUs(j14, j8), list, mediaChunkIteratorArr2);
        int selectedIndex = this.trackSelection.getSelectedIndex();
        CmcdConfiguration cmcdConfiguration = this.cmcdConfiguration;
        CmcdHeadersFactory cmcdHeadersFactory = cmcdConfiguration == null ? null : new CmcdHeadersFactory(cmcdConfiguration, this.trackSelection, j13, "d", this.manifest.dynamic);
        RepresentationHolder updateSelectedBaseUrl = updateSelectedBaseUrl(selectedIndex);
        ChunkExtractor chunkExtractor = updateSelectedBaseUrl.chunkExtractor;
        if (chunkExtractor != null) {
            Representation representation = updateSelectedBaseUrl.representation;
            RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
            RangedUri indexUri = updateSelectedBaseUrl.segmentIndex == null ? representation.getIndexUri() : null;
            if (initializationUri != null || indexUri != null) {
                chunkHolder.chunk = newInitializationChunk(updateSelectedBaseUrl, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri, cmcdHeadersFactory);
                return;
            }
        }
        long j15 = updateSelectedBaseUrl.periodDurationUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            z7 = true;
            r10 = 1;
            if (this.periodIndex == dashManifest.getPeriodCount() - 1) {
                z8 = true;
                long j16 = C.TIME_UNSET;
                boolean z9 = z8 || j15 != C.TIME_UNSET;
                if (updateSelectedBaseUrl.getSegmentCount() != 0) {
                    chunkHolder.endOfStream = z9;
                    return;
                }
                long firstAvailableSegmentNum2 = updateSelectedBaseUrl.getFirstAvailableSegmentNum(j14);
                long lastAvailableSegmentNum2 = updateSelectedBaseUrl.getLastAvailableSegmentNum(j14);
                if (z8) {
                    long segmentEndTimeUs = updateSelectedBaseUrl.getSegmentEndTimeUs(lastAvailableSegmentNum2);
                    z9 &= segmentEndTimeUs + (segmentEndTimeUs - updateSelectedBaseUrl.getSegmentStartTimeUs(lastAvailableSegmentNum2)) >= j15;
                }
                boolean z10 = z9;
                long segmentNum2 = getSegmentNum(updateSelectedBaseUrl, mediaChunk, j9, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
                if (segmentNum2 < firstAvailableSegmentNum2) {
                    this.fatalError = new BehindLiveWindowException();
                    return;
                }
                if (segmentNum2 > lastAvailableSegmentNum2 || (this.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                    chunkHolder.endOfStream = z10;
                    return;
                }
                if (z10 && updateSelectedBaseUrl.getSegmentStartTimeUs(segmentNum2) >= j15) {
                    chunkHolder.endOfStream = r10;
                    return;
                }
                int min = (int) Math.min(this.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
                if (j15 != C.TIME_UNSET) {
                    while (min > r10 && updateSelectedBaseUrl.getSegmentStartTimeUs((min + segmentNum2) - 1) >= j15) {
                        min--;
                    }
                }
                int i11 = min;
                if (list.isEmpty()) {
                    j16 = j9;
                }
                chunkHolder.chunk = newMediaChunk(updateSelectedBaseUrl, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum2, i11, j16, nowPeriodTimeUs, cmcdHeadersFactory);
                return;
            }
        } else {
            z7 = true;
        }
        z8 = false;
        r10 = z7;
        long j162 = C.TIME_UNSET;
        if (z8) {
        }
        if (updateSelectedBaseUrl.getSegmentCount() != 0) {
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j8, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j8, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    protected Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format format, int i8, @Nullable Object obj, @Nullable RangedUri rangedUri, @Nullable RangedUri rangedUri2, @Nullable CmcdHeadersFactory cmcdHeadersFactory) {
        RangedUri rangedUri3 = rangedUri;
        Representation representation = representationHolder.representation;
        if (rangedUri3 != null) {
            RangedUri attemptMerge = rangedUri3.attemptMerge(rangedUri2, representationHolder.selectedBaseUrl.url);
            if (attemptMerge != null) {
                rangedUri3 = attemptMerge;
            }
        } else {
            rangedUri3 = rangedUri2;
        }
        return new InitializationChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, rangedUri3, 0, cmcdHeadersFactory == null ? ImmutableMap.of() : cmcdHeadersFactory.setObjectType(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT).createHttpRequestHeaders()), format, i8, obj, representationHolder.chunkExtractor);
    }

    protected Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i8, Format format, int i9, Object obj, long j8, int i10, long j9, long j10, @Nullable CmcdHeadersFactory cmcdHeadersFactory) {
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j8);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j8);
        if (representationHolder.chunkExtractor == null) {
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j8);
            return new SingleSampleMediaChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j8, j10) ? 0 : 8, cmcdHeadersFactory == null ? ImmutableMap.of() : cmcdHeadersFactory.setChunkDurationUs(segmentEndTimeUs - segmentStartTimeUs).setObjectType(CmcdHeadersFactory.getObjectType(this.trackSelection)).createHttpRequestHeaders()), format, i9, obj, segmentStartTimeUs, segmentEndTimeUs, j8, i8, format);
        }
        int i11 = 1;
        int i12 = 1;
        while (i11 < i10) {
            RangedUri attemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(i11 + j8), representationHolder.selectedBaseUrl.url);
            if (attemptMerge == null) {
                break;
            }
            i12++;
            i11++;
            segmentUrl = attemptMerge;
        }
        long j11 = (i12 + j8) - 1;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j11);
        long j12 = representationHolder.periodDurationUs;
        return new ContainerMediaChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j11, j10) ? 0 : 8, cmcdHeadersFactory == null ? ImmutableMap.of() : cmcdHeadersFactory.setChunkDurationUs(segmentEndTimeUs2 - segmentStartTimeUs).setObjectType(CmcdHeadersFactory.getObjectType(this.trackSelection)).createHttpRequestHeaders()), format, i9, obj, segmentStartTimeUs, segmentEndTimeUs2, j9, (j12 == C.TIME_UNSET || j12 > segmentEndTimeUs2) ? -9223372036854775807L : j12, j8, i12, -representation.presentationTimeOffsetUs, representationHolder.chunkExtractor);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int indexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[indexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = representationHolder.chunkExtractor.getChunkIndex()) != null) {
                this.representationHolders[indexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z7, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z7) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk)) {
            IOException iOException = loadErrorInfo.exception;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                        this.missingLastSegment = true;
                        return true;
                    }
                }
            }
        }
        RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        BaseUrl selectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (selectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(selectBaseUrl)) {
            return true;
        }
        LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((!createFallbackOptions.isFallbackAvailable(2) && !createFallbackOptions.isFallbackAvailable(1)) || (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(createFallbackOptions, loadErrorInfo)) == null || !createFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            return false;
        }
        int i8 = fallbackSelectionFor.type;
        if (i8 == 2) {
            ExoTrackSelection exoTrackSelection = this.trackSelection;
            return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
        }
        if (i8 != 1) {
            return false;
        }
        this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j8, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j8, chunk, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i8) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i8;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i8);
            ArrayList<Representation> representations = getRepresentations();
            for (int i9 = 0; i9 < this.representationHolders.length; i9++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i9));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i9] = representationHolderArr[i9].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e8) {
            this.fatalError = e8;
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }
}
