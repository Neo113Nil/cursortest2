package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes.dex */
final class zf extends yf {

    /* renamed from: j, reason: collision with root package name */
    private final AudioTimestamp f15097j;

    /* renamed from: k, reason: collision with root package name */
    private long f15098k;

    /* renamed from: l, reason: collision with root package name */
    private long f15099l;

    /* renamed from: m, reason: collision with root package name */
    private long f15100m;

    public zf() {
        super(null);
        this.f15097j = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.yf
    public final long c() {
        return this.f15100m;
    }

    @Override // com.google.android.gms.internal.ads.yf
    public final long d() {
        return this.f15097j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.yf
    public final void g(AudioTrack audioTrack, boolean z6) {
        super.g(audioTrack, z6);
        this.f15098k = 0L;
        this.f15099l = 0L;
        this.f15100m = 0L;
    }

    @Override // com.google.android.gms.internal.ads.yf
    public final boolean h() {
        boolean timestamp = this.f14639a.getTimestamp(this.f15097j);
        if (timestamp) {
            long j7 = this.f15097j.framePosition;
            if (this.f15099l > j7) {
                this.f15098k++;
            }
            this.f15099l = j7;
            this.f15100m = j7 + (this.f15098k << 32);
        }
        return timestamp;
    }
}
