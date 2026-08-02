package com.startapp.sdk.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class tj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f7633a;

    public tj(com.startapp.sdk.ads.video.c cVar) {
        this.f7633a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r8 <= 0) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j4;
        com.startapp.sdk.ads.video.c cVar = this.f7633a;
        if (cVar.f6245S && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f7633a;
            if (cVar2.f6246T) {
                int u4 = cVar2.u();
                com.startapp.sdk.ads.video.c cVar3 = this.f7633a;
                int v = cVar3.v();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j5 = u4;
                long seconds = timeUnit.toSeconds(j5);
                if (seconds > cVar3.f6260h0) {
                    cVar3.f6260h0 = seconds;
                    si.a(cVar3.f7830t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(seconds));
                    if (u4 != v || cVar3.f6258f0) {
                        v -= u4;
                    }
                    si.a(cVar3.f7830t, true, "videoApi.setVideoRemainingTimer", Long.valueOf(timeUnit.toSeconds(v)));
                    if (cVar3.E()) {
                        if (!cVar3.f6249W && cVar3.f7820A <= 0) {
                            j4 = timeUnit.toSeconds(cVar3.w()) - timeUnit.toSeconds(j5);
                        }
                        j4 = 0;
                        si.a(cVar3.f7830t, true, "videoApi.setSkipTimer", Long.valueOf(j4));
                    }
                }
                this.f7633a.b(u4);
            }
        }
        com.startapp.sdk.ads.video.c cVar4 = this.f7633a;
        long j6 = cVar4.f6238K;
        if (j6 > 0) {
            long j7 = j6 - 200;
            cVar4.f6238K = j7;
            if (j7 <= 0) {
                cVar4.j();
                this.f7633a.t();
            }
        }
        this.f7633a.f6267o0.postDelayed(this, 200L);
    }
}
