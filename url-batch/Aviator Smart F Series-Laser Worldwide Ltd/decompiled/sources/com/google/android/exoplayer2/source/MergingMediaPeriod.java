package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaPeriod[] periods;

    @Nullable
    private TrackGroupArray trackGroups;
    private final ArrayList<MediaPeriod> childrenPendingPreparation = new ArrayList<>();
    private final HashMap<TrackGroup, TrackGroup> childTrackGroupByMergedTrackGroup = new HashMap<>();
    private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices = new IdentityHashMap<>();
    private MediaPeriod[] enabledPeriods = new MediaPeriod[0];

    private static final class ForwardingTrackSelection implements ExoTrackSelection {
        private final TrackGroup trackGroup;
        private final ExoTrackSelection trackSelection;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.trackSelection = exoTrackSelection;
            this.trackGroup = trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void disable() {
            this.trackSelection.disable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void enable() {
            this.trackSelection.enable();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingTrackSelection)) {
                return false;
            }
            ForwardingTrackSelection forwardingTrackSelection = (ForwardingTrackSelection) obj;
            return this.trackSelection.equals(forwardingTrackSelection.trackSelection) && this.trackGroup.equals(forwardingTrackSelection.trackGroup);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
            return this.trackSelection.evaluateQueueSize(j8, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean excludeTrack(int i8, long j8) {
            return this.trackSelection.excludeTrack(i8, j8);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public Format getFormat(int i8) {
            return this.trackSelection.getFormat(i8);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getIndexInTrackGroup(int i8) {
            return this.trackSelection.getIndexInTrackGroup(i8);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public long getLatestBitrateEstimate() {
            return this.trackSelection.getLatestBitrateEstimate();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Format getSelectedFormat() {
            return this.trackSelection.getSelectedFormat();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.trackSelection.getSelectedIndex();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
            return this.trackSelection.getSelectedIndexInTrackGroup();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return this.trackSelection.getSelectionData();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return this.trackSelection.getSelectionReason();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getType() {
            return this.trackSelection.getType();
        }

        public int hashCode() {
            return ((527 + this.trackGroup.hashCode()) * 31) + this.trackSelection.hashCode();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(Format format) {
            return this.trackSelection.indexOf(format);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean isTrackExcluded(int i8, long j8) {
            return this.trackSelection.isTrackExcluded(i8, j8);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int length() {
            return this.trackSelection.length();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
            this.trackSelection.onDiscontinuity();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean z7) {
            this.trackSelection.onPlayWhenReadyChanged(z7);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float f8) {
            this.trackSelection.onPlaybackSpeed(f8);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onRebuffer() {
            this.trackSelection.onRebuffer();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long j8, Chunk chunk, List<? extends MediaChunk> list) {
            return this.trackSelection.shouldCancelChunkLoad(j8, chunk, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j8, long j9, long j10, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            this.trackSelection.updateSelectedTrack(j8, j9, j10, list, mediaChunkIteratorArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(int i8) {
            return this.trackSelection.indexOf(i8);
        }
    }

    private static final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        private MediaPeriod.Callback callback;
        private final MediaPeriod mediaPeriod;
        private final long timeOffsetUs;

        public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j8) {
            this.mediaPeriod = mediaPeriod;
            this.timeOffsetUs = j8;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j8) {
            return this.mediaPeriod.continueLoading(j8 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j8, boolean z7) {
            this.mediaPeriod.discardBuffer(j8 - this.timeOffsetUs, z7);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
            return this.mediaPeriod.getAdjustedSeekPositionUs(j8 - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.timeOffsetUs + bufferedPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.timeOffsetUs + nextLoadPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.mediaPeriod.getStreamKeys(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.mediaPeriod.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.mediaPeriod.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
            this.mediaPeriod.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j8) {
            this.callback = callback;
            this.mediaPeriod.prepare(this, j8 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            long readDiscontinuity = this.mediaPeriod.readDiscontinuity();
            return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : this.timeOffsetUs + readDiscontinuity;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j8) {
            this.mediaPeriod.reevaluateBuffer(j8 - this.timeOffsetUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j8) {
            return this.mediaPeriod.seekToUs(j8 - this.timeOffsetUs) + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i8 = 0;
            while (true) {
                SampleStream sampleStream = null;
                if (i8 >= sampleStreamArr.length) {
                    break;
                }
                TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i8];
                if (timeOffsetSampleStream != null) {
                    sampleStream = timeOffsetSampleStream.getChildStream();
                }
                sampleStreamArr2[i8] = sampleStream;
                i8++;
            }
            long selectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j8 - this.timeOffsetUs);
            for (int i9 = 0; i9 < sampleStreamArr.length; i9++) {
                SampleStream sampleStream2 = sampleStreamArr2[i9];
                if (sampleStream2 == null) {
                    sampleStreamArr[i9] = null;
                } else {
                    SampleStream sampleStream3 = sampleStreamArr[i9];
                    if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).getChildStream() != sampleStream2) {
                        sampleStreamArr[i9] = new TimeOffsetSampleStream(sampleStream2, this.timeOffsetUs);
                    }
                }
            }
            return selectTracks + this.timeOffsetUs;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    private static final class TimeOffsetSampleStream implements SampleStream {
        private final SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j8) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j8;
        }

        public SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
            this.sampleStream.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i8) {
            int readData = this.sampleStream.readData(formatHolder, decoderInputBuffer, i8);
            if (readData == -4) {
                decoderInputBuffer.timeUs = Math.max(0L, decoderInputBuffer.timeUs + this.timeOffsetUs);
            }
            return readData;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j8) {
            return this.sampleStream.skipData(j8 - this.timeOffsetUs);
        }
    }

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
        for (int i8 = 0; i8 < mediaPeriodArr.length; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                this.periods[i8] = new TimeOffsetMediaPeriod(mediaPeriodArr[i8], j8);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j8) {
        if (this.childrenPendingPreparation.isEmpty()) {
            return this.compositeSequenceableLoader.continueLoading(j8);
        }
        int size = this.childrenPendingPreparation.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.childrenPendingPreparation.get(i8).continueLoading(j8);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j8, boolean z7) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j8, z7);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j8, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    public MediaPeriod getChildPeriod(int i8) {
        MediaPeriod mediaPeriod = this.periods[i8];
        return mediaPeriod instanceof TimeOffsetMediaPeriod ? ((TimeOffsetMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return s.a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i8 = 0;
        for (MediaPeriod mediaPeriod2 : this.periods) {
            i8 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i8];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            if (i9 >= mediaPeriodArr.length) {
                this.trackGroups = new TrackGroupArray(trackGroupArr);
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
                return;
            }
            TrackGroupArray trackGroups = mediaPeriodArr[i9].getTrackGroups();
            int i11 = trackGroups.length;
            int i12 = 0;
            while (i12 < i11) {
                TrackGroup trackGroup = trackGroups.get(i12);
                TrackGroup copyWithId = trackGroup.copyWithId(i9 + ":" + trackGroup.id);
                this.childTrackGroupByMergedTrackGroup.put(copyWithId, trackGroup);
                trackGroupArr[i10] = copyWithId;
                i12++;
                i10++;
            }
            i9++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j8) {
        this.callback = callback;
        Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j8);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        long j8 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            long readDiscontinuity = mediaPeriod.readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                if (j8 == C.TIME_UNSET) {
                    for (MediaPeriod mediaPeriod2 : this.enabledPeriods) {
                        if (mediaPeriod2 == mediaPeriod) {
                            break;
                        }
                        if (mediaPeriod2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j8 = readDiscontinuity;
                } else if (readDiscontinuity != j8) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j8 != C.TIME_UNSET && mediaPeriod.seekToUs(j8) != j8) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j8;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j8) {
        this.compositeSequenceableLoader.reevaluateBuffer(j8);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j8) {
        long seekToUs = this.enabledPeriods[0].seekToUs(j8);
        int i8 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i8 >= mediaPeriodArr.length) {
                return seekToUs;
            }
            if (mediaPeriodArr[i8].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
        SampleStream sampleStream;
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int i8 = 0;
        while (true) {
            sampleStream = null;
            if (i8 >= exoTrackSelectionArr.length) {
                break;
            }
            SampleStream sampleStream2 = sampleStreamArr[i8];
            Integer num = sampleStream2 != null ? this.streamPeriodIndices.get(sampleStream2) : null;
            iArr[i8] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i8];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().id;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        this.streamPeriodIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j9 = j8;
        int i9 = 0;
        ExoTrackSelection[] exoTrackSelectionArr3 = exoTrackSelectionArr2;
        while (i9 < this.periods.length) {
            for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
                sampleStreamArr3[i10] = iArr[i10] == i9 ? sampleStreamArr[i10] : sampleStream;
                if (iArr2[i10] == i9) {
                    ExoTrackSelection exoTrackSelection2 = (ExoTrackSelection) Assertions.checkNotNull(exoTrackSelectionArr[i10]);
                    exoTrackSelectionArr3[i10] = new ForwardingTrackSelection(exoTrackSelection2, (TrackGroup) Assertions.checkNotNull(this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup())));
                } else {
                    exoTrackSelectionArr3[i10] = sampleStream;
                }
            }
            int i11 = i9;
            ArrayList arrayList2 = arrayList;
            ExoTrackSelection[] exoTrackSelectionArr4 = exoTrackSelectionArr3;
            long selectTracks = this.periods[i9].selectTracks(exoTrackSelectionArr3, zArr, sampleStreamArr3, zArr2, j9);
            if (i11 == 0) {
                j9 = selectTracks;
            } else if (selectTracks != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i12 = 0; i12 < exoTrackSelectionArr.length; i12++) {
                if (iArr2[i12] == i11) {
                    SampleStream sampleStream3 = (SampleStream) Assertions.checkNotNull(sampleStreamArr3[i12]);
                    sampleStreamArr2[i12] = sampleStreamArr3[i12];
                    this.streamPeriodIndices.put(sampleStream3, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr[i12] == i11) {
                    Assertions.checkState(sampleStreamArr3[i12] == null);
                }
            }
            if (z7) {
                arrayList2.add(this.periods[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            exoTrackSelectionArr3 = exoTrackSelectionArr4;
            sampleStream = null;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        MediaPeriod[] mediaPeriodArr = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[0]);
        this.enabledPeriods = mediaPeriodArr;
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(mediaPeriodArr);
        return j9;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }
}
