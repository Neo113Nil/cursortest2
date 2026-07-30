package com.google.android.exoplayer2;

@Deprecated
/* loaded from: classes3.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i8, long j8) {
        this.timeline = timeline;
        this.windowIndex = i8;
        this.positionMs = j8;
    }
}
