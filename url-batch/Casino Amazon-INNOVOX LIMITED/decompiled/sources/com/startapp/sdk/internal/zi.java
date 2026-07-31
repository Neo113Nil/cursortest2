package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class zi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f529a;

    public zi(com.startapp.sdk.ads.video.a aVar) {
        this.f529a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r9 <= 0) goto L28;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        xc xcVar;
        long j;
        com.startapp.sdk.ads.video.a aVar = this.f529a;
        if (aVar.S && (xcVar = aVar.L) != null && xcVar.g != null && aVar.T) {
            int v = aVar.v();
            com.startapp.sdk.ads.video.a aVar2 = this.f529a;
            int w = aVar2.w();
            long j2 = v / 1000;
            if (j2 > aVar2.c0) {
                aVar2.c0 = j2;
                zh.a(aVar2.t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(j2));
                if (v != w || aVar2.a0) {
                    w -= v;
                }
                zh.a(aVar2.t, true, "videoApi.setVideoRemainingTimer", Long.valueOf(w / 1000));
                if (aVar2.D()) {
                    if (!aVar2.W && aVar2.A <= 0) {
                        j = (aVar2.x() / 1000) - j2;
                    }
                    j = 0;
                    zh.a(aVar2.t, true, "videoApi.setSkipTimer", Long.valueOf(j));
                }
            }
            this.f529a.c(v);
        }
        com.startapp.sdk.ads.video.a aVar3 = this.f529a;
        long j3 = aVar3.K;
        if (j3 > 0) {
            long j4 = j3 - 200;
            aVar3.K = j4;
            if (j4 <= 0) {
                aVar3.j();
                this.f529a.t();
            }
        }
        this.f529a.i0.postDelayed(this, 200L);
    }
}
