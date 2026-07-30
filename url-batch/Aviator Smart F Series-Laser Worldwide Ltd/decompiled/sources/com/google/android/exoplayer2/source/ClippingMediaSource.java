package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;

    @Nullable
    private IllegalClippingException clippingError;

    @Nullable
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    private static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j8, long j9) {
            super(timeline);
            boolean z7 = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long max = Math.max(0L, j8);
            if (!window.isPlaceholder && max != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long max2 = j9 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j9);
            long j10 = window.durationUs;
            if (j10 != C.TIME_UNSET) {
                max2 = max2 > j10 ? j10 : max2;
                if (max > max2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.startUs = max;
            this.endUs = max2;
            this.durationUs = max2 == C.TIME_UNSET ? -9223372036854775807L : max2 - max;
            if (window.isDynamic && (max2 == C.TIME_UNSET || (j10 != C.TIME_UNSET && max2 == j10))) {
                z7 = true;
            }
            this.isDynamic = z7;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i8, Timeline.Period period, boolean z7) {
            this.timeline.getPeriod(0, period, z7);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j8 = this.durationUs;
            return period.set(period.id, period.uid, 0, j8 == C.TIME_UNSET ? -9223372036854775807L : j8 - positionInWindowUs, positionInWindowUs);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i8, Timeline.Window window, long j8) {
            this.timeline.getWindow(0, window, 0L);
            long j9 = window.positionInFirstPeriodUs;
            long j10 = this.startUs;
            window.positionInFirstPeriodUs = j9 + j10;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j11 = window.defaultPositionUs;
            if (j11 != C.TIME_UNSET) {
                long max = Math.max(j11, j10);
                window.defaultPositionUs = max;
                long j12 = this.endUs;
                if (j12 != C.TIME_UNSET) {
                    max = Math.min(max, j12);
                }
                window.defaultPositionUs = max - this.startUs;
            }
            long usToMs = Util.usToMs(this.startUs);
            long j13 = window.presentationStartTimeMs;
            if (j13 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j13 + usToMs;
            }
            long j14 = window.windowStartTimeMs;
            if (j14 != C.TIME_UNSET) {
                window.windowStartTimeMs = j14 + usToMs;
            }
            return window;
        }
    }

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i8) {
            super("Illegal clipping: " + getReasonDescription(i8));
            this.reason = i8;
        }

        private static String getReasonDescription(int i8) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j8, long j9) {
        this(mediaSource, j8, j9, true, false, false);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j8;
        long j9;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            long j10 = this.startUs;
            long j11 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j10 += defaultPositionUs;
                j11 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j10;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j11 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.mediaPeriods.get(i8).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j8 = j10;
            j9 = j11;
        } else {
            long j12 = this.periodStartUs - positionInFirstPeriodUs;
            j9 = this.endUs != Long.MIN_VALUE ? this.periodEndUs - positionInFirstPeriodUs : Long.MIN_VALUE;
            j8 = j12;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j8, j9);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e8) {
            this.clippingError = e8;
            for (int i9 = 0; i9 < this.mediaPeriods.size(); i9++) {
                this.mediaPeriods.get(i9).setClippingError(this.clippingError);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j8) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j8), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((ClippingTimeline) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    public ClippingMediaSource(MediaSource mediaSource, long j8) {
        this(mediaSource, 0L, j8, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j8, long j9, boolean z7, boolean z8, boolean z9) {
        super((MediaSource) Assertions.checkNotNull(mediaSource));
        Assertions.checkArgument(j8 >= 0);
        this.startUs = j8;
        this.endUs = j9;
        this.enableInitialDiscontinuity = z7;
        this.allowDynamicClippingUpdates = z8;
        this.relativeToDefaultPosition = z9;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}
