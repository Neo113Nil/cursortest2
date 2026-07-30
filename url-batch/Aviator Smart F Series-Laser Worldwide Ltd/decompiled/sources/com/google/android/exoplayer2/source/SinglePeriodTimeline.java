package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes3.dex */
public final class SinglePeriodTimeline extends Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;

    @Nullable
    private final MediaItem.LiveConfiguration liveConfiguration;

    @Nullable
    private final Object manifest;

    @Nullable
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final Object UID = new Object();
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    @Deprecated
    public SinglePeriodTimeline(long j8, boolean z7, boolean z8, boolean z9, @Nullable Object obj, @Nullable Object obj2) {
        this(j8, j8, 0L, 0L, z7, z8, z9, obj, obj2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i8, Timeline.Period period, boolean z7) {
        Assertions.checkIndex(i8, 0, 1);
        return period.set(null, z7 ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i8) {
        Assertions.checkIndex(i8, 0, 1);
        return UID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Timeline.Window getWindow(int i8, Timeline.Window window, long j8) {
        long j9;
        Assertions.checkIndex(i8, 0, 1);
        long j10 = this.windowDefaultStartPositionUs;
        boolean z7 = this.isDynamic;
        if (z7 && !this.suppressPositionProjection && j8 != 0) {
            long j11 = this.windowDurationUs;
            if (j11 != C.TIME_UNSET) {
                j10 += j8;
            }
            j9 = -9223372036854775807L;
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, z7, this.liveConfiguration, j9, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
        }
        j9 = j10;
        return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, z7, this.liveConfiguration, j9, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j8, boolean z7, boolean z8, boolean z9, @Nullable Object obj, MediaItem mediaItem) {
        this(j8, j8, 0L, 0L, z7, z8, z9, obj, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, boolean z7, boolean z8, boolean z9, @Nullable Object obj, @Nullable Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j8, j9, j10, j11, z7, z8, z9, obj, obj2);
    }

    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, boolean z7, boolean z8, boolean z9, @Nullable Object obj, MediaItem mediaItem) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j8, j9, j10, j11, z7, z8, false, obj, mediaItem, z9 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z7, boolean z8, boolean z9, @Nullable Object obj, @Nullable Object obj2) {
        this(j8, j9, j10, j11, j12, j13, j14, z7, z8, false, obj, r0.buildUpon().setTag(obj2).build(), z9 ? r0.liveConfiguration : null);
        MediaItem mediaItem = MEDIA_ITEM;
    }

    @Deprecated
    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z7, boolean z8, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this(j8, j9, j10, j11, j12, j13, j14, z7, z8, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z7, boolean z8, boolean z9, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j8;
        this.windowStartTimeMs = j9;
        this.elapsedRealtimeEpochOffsetMs = j10;
        this.periodDurationUs = j11;
        this.windowDurationUs = j12;
        this.windowPositionInPeriodUs = j13;
        this.windowDefaultStartPositionUs = j14;
        this.isSeekable = z7;
        this.isDynamic = z8;
        this.suppressPositionProjection = z9;
        this.manifest = obj;
        this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }
}
