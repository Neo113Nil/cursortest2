package com.google.android.exoplayer2.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final ImmutableList<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;

    @Nullable
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private long latestBitrateEstimate;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j8, long j9) {
            this.totalBandwidth = j8;
            this.allocatedBandwidth = j9;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        protected AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i8, BandwidthMeter bandwidthMeter, ImmutableList<AdaptationCheckpoint> immutableList) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i8, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            ImmutableList adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            for (int i8 = 0; i8 < definitionArr.length; i8++) {
                ExoTrackSelection.Definition definition = definitionArr[i8];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length != 0) {
                        exoTrackSelectionArr[i8] = iArr.length == 1 ? new FixedTrackSelection(definition.group, iArr[0], definition.type) : createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter, (ImmutableList) adaptationCheckpoints.get(i8));
                    }
                }
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i8, int i9, int i10, float f8) {
            this(i8, i9, i10, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f8, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i8, int i9, int i10, int i11, int i12, float f8) {
            this(i8, i9, i10, i11, i12, f8, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i8, int i9, int i10, float f8, float f9, Clock clock) {
            this(i8, i9, i10, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f8, f9, clock);
        }

        public Factory(int i8, int i9, int i10, int i11, int i12, float f8, float f9, Clock clock) {
            this.minDurationForQualityIncreaseMs = i8;
            this.maxDurationForQualityDecreaseMs = i9;
            this.minDurationToRetainAfterDiscardMs = i10;
            this.maxWidthToDiscard = i11;
            this.maxHeightToDiscard = i12;
            this.bandwidthFraction = f8;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f9;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, 25000L, 25000L, DEFAULT_MAX_WIDTH_TO_DISCARD, DEFAULT_MAX_HEIGHT_TO_DISCARD, 0.7f, 0.75f, ImmutableList.of(), Clock.DEFAULT);
    }

    private static void addCheckpoint(List<ImmutableList.Builder<AdaptationCheckpoint>> list, long[] jArr) {
        long j8 = 0;
        for (long j9 : jArr) {
            j8 += j9;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ImmutableList.Builder<AdaptationCheckpoint> builder = list.get(i8);
            if (builder != null) {
                builder.add((ImmutableList.Builder<AdaptationCheckpoint>) new AdaptationCheckpoint(j8, jArr[i8]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j8, long j9) {
        long allocatedBandwidth = getAllocatedBandwidth(j9);
        int i8 = 0;
        for (int i9 = 0; i9 < this.length; i9++) {
            if (j8 == Long.MIN_VALUE || !isTrackExcluded(i9, j8)) {
                Format format = getFormat(i9);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i9;
                }
                i8 = i9;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add((ImmutableList.Builder) new AdaptationCheckpoint(0L, 0L));
                arrayList.add(builder);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i8 = 0; i8 < sortedTrackBitrates.length; i8++) {
            long[] jArr2 = sortedTrackBitrates[i8];
            jArr[i8] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i9 = 0; i9 < switchOrder.size(); i9++) {
            int intValue = switchOrder.get(i9).intValue();
            int i10 = iArr[intValue] + 1;
            iArr[intValue] = i10;
            jArr[intValue] = sortedTrackBitrates[intValue][i10];
            addCheckpoint(arrayList, jArr);
        }
        for (int i11 = 0; i11 < definitionArr.length; i11++) {
            if (arrayList.get(i11) != null) {
                jArr[i11] = jArr[i11] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i12);
            builder2.add((ImmutableList.Builder) (builder3 == null ? ImmutableList.of() : builder3.build()));
        }
        return builder2.build();
    }

    private long getAllocatedBandwidth(long j8) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j8);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i8 = 1;
        while (i8 < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i8).totalBandwidth < totalAllocatableBandwidth) {
            i8++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i8 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i8);
        long j9 = adaptationCheckpoint.totalBandwidth;
        float f8 = (totalAllocatableBandwidth - j9) / (adaptationCheckpoint2.totalBandwidth - j9);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (f8 * (adaptationCheckpoint2.allocatedBandwidth - r2)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        MediaChunk mediaChunk = (MediaChunk) Iterables.getLast(list);
        long j8 = mediaChunk.startTimeUs;
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j9 = mediaChunk.endTimeUs;
        return j9 != C.TIME_UNSET ? j9 - j8 : C.TIME_UNSET;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i8 = this.selectedIndex;
        if (i8 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i8].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i8 = 0; i8 < definitionArr.length; i8++) {
            ExoTrackSelection.Definition definition = definitionArr[i8];
            if (definition == null) {
                jArr[i8] = new long[0];
            } else {
                jArr[i8] = new long[definition.tracks.length];
                int i9 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    long j8 = definition.group.getFormat(iArr[i9]).bitrate;
                    long[] jArr2 = jArr[i8];
                    if (j8 == -1) {
                        j8 = 0;
                    }
                    jArr2[i9] = j8;
                    i9++;
                }
                Arrays.sort(jArr[i8]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> getSwitchOrder(long[][] jArr) {
        Multimap build = MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i8 = 0; i8 < jArr.length; i8++) {
            long[] jArr2 = jArr[i8];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i9 = 0;
                while (true) {
                    long[] jArr3 = jArr[i8];
                    int length2 = jArr3.length;
                    double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                    if (i9 >= length2) {
                        break;
                    }
                    long j8 = jArr3[i9];
                    if (j8 != -1) {
                        d8 = Math.log(j8);
                    }
                    dArr[i9] = d8;
                    i9++;
                }
                int i10 = length - 1;
                double d9 = dArr[i10] - dArr[0];
                int i11 = 0;
                while (i11 < i10) {
                    double d10 = dArr[i11];
                    i11++;
                    build.put(Double.valueOf(d9 == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? 1.0d : (((d10 + dArr[i11]) * 0.5d) - dArr[0]) / d9), Integer.valueOf(i8));
                }
            }
        }
        return ImmutableList.copyOf(build.values());
    }

    private long getTotalAllocatableBandwidth(long j8) {
        long bitrateEstimate = this.bandwidthMeter.getBitrateEstimate();
        this.latestBitrateEstimate = bitrateEstimate;
        long j9 = (long) (bitrateEstimate * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j8 == C.TIME_UNSET) {
            return (long) (j9 / this.playbackSpeed);
        }
        float f8 = j8;
        return (long) ((j9 * Math.max((f8 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f8);
    }

    private long minDurationForQualityIncreaseUs(long j8, long j9) {
        if (j8 == C.TIME_UNSET) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j9 != C.TIME_UNSET) {
            j8 -= j9;
        }
        return Math.min((long) (j8 * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    protected boolean canSelectFormat(Format format, int i8, long j8) {
        return ((long) i8) <= j8;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        int i8;
        int i9;
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(elapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j8, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration < minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime, getLastChunkDurationUs(list)));
        for (int i10 = 0; i10 < size; i10++) {
            MediaChunk mediaChunk = list.get(i10);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j8, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i8 = format2.height) != -1 && i8 <= this.maxHeightToDiscard && (i9 = format2.width) != -1 && i9 <= this.maxWidthToDiscard && i8 < format.height) {
                return i10;
            }
        }
        return size;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.latestBitrateEstimate;
    }

    protected long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f8) {
        this.playbackSpeed = f8;
    }

    protected boolean shouldEvaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        long j9 = this.lastBufferEvaluationMs;
        return j9 == C.TIME_UNSET || j8 - j9 >= 1000 || !(list.isEmpty() || ((MediaChunk) Iterables.getLast(list)).equals(this.lastBufferEvaluationMediaChunk));
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j8, long j9, long j10, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i8 = this.reason;
        if (i8 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i9 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) Iterables.getLast(list)).trackFormat);
        if (indexOf != -1) {
            i8 = ((MediaChunk) Iterables.getLast(list)).trackSelectionReason;
            i9 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
        if (determineIdealSelectedIndex != i9 && !isTrackExcluded(i9, elapsedRealtime)) {
            Format format = getFormat(i9);
            Format format2 = getFormat(determineIdealSelectedIndex);
            long minDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j10, nextChunkDurationUs);
            int i10 = format2.bitrate;
            int i11 = format.bitrate;
            if ((i10 > i11 && j9 < minDurationForQualityIncreaseUs) || (i10 < i11 && j9 >= this.maxDurationForQualityDecreaseUs)) {
                determineIdealSelectedIndex = i9;
            }
        }
        if (determineIdealSelectedIndex != i9) {
            i8 = 3;
        }
        this.reason = i8;
        this.selectedIndex = determineIdealSelectedIndex;
    }

    protected AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i8, BandwidthMeter bandwidthMeter, long j8, long j9, long j10, int i9, int i10, float f8, float f9, List<AdaptationCheckpoint> list, Clock clock) {
        super(trackGroup, iArr, i8);
        BandwidthMeter bandwidthMeter2;
        long j11;
        if (j10 < j8) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            bandwidthMeter2 = bandwidthMeter;
            j11 = j8;
        } else {
            bandwidthMeter2 = bandwidthMeter;
            j11 = j10;
        }
        this.bandwidthMeter = bandwidthMeter2;
        this.minDurationForQualityIncreaseUs = j8 * 1000;
        this.maxDurationForQualityDecreaseUs = j9 * 1000;
        this.minDurationToRetainAfterDiscardUs = j11 * 1000;
        this.maxWidthToDiscard = i9;
        this.maxHeightToDiscard = i10;
        this.bandwidthFraction = f8;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f9;
        this.adaptationCheckpoints = ImmutableList.copyOf((Collection) list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.latestBitrateEstimate = Long.MIN_VALUE;
    }
}
