package com.google.android.exoplayer2.source.dash.manifest;

@Deprecated
/* loaded from: classes3.dex */
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j8, long j9, long j10, float f8, float f9) {
        this.targetOffsetMs = j8;
        this.minOffsetMs = j9;
        this.maxOffsetMs = j10;
        this.minPlaybackSpeed = f8;
        this.maxPlaybackSpeed = f9;
    }
}
