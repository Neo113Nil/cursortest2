package com.google.android.exoplayer2.upstream.cache;

@Deprecated
/* loaded from: classes3.dex */
final class CacheFileMetadata {
    public final long lastTouchTimestamp;
    public final long length;

    public CacheFileMetadata(long j8, long j9) {
        this.length = j8;
        this.lastTouchTimestamp = j9;
    }
}
