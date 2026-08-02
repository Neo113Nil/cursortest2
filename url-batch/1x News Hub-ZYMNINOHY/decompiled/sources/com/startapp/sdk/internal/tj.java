package com.startapp.sdk.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class tj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4494a;

    public tj(com.startapp.sdk.ads.video.c cVar) {
        this.f4494a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r8 <= 0) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        com.startapp.sdk.ads.video.c cVar = this.f4494a;
        if (cVar.f3162S && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f4494a;
            if (cVar2.f3163T) {
                int u3 = cVar2.u();
                com.startapp.sdk.ads.video.c cVar3 = this.f4494a;
                int v = cVar3.v();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j4 = u3;
                long seconds = timeUnit.toSeconds(j4);
                if (seconds > cVar3.f3177h0) {
                    cVar3.f3177h0 = seconds;
                    si.a(cVar3.f4685t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(seconds));
                    if (u3 != v || cVar3.f3175f0) {
                        v -= u3;
                    }
                    si.a(cVar3.f4685t, true, "videoApi.setVideoRemainingTimer", Long.valueOf(timeUnit.toSeconds(v)));
                    if (cVar3.E()) {
                        if (!cVar3.f3166W && cVar3.f4675A <= 0) {
                            j3 = timeUnit.toSeconds(cVar3.w()) - timeUnit.toSeconds(j4);
                        }
                        j3 = 0;
                        si.a(cVar3.f4685t, true, "videoApi.setSkipTimer", Long.valueOf(j3));
                    }
                }
                this.f4494a.b(u3);
            }
        }
        com.startapp.sdk.ads.video.c cVar4 = this.f4494a;
        long j5 = cVar4.f3155K;
        if (j5 > 0) {
            long j6 = j5 - 200;
            cVar4.f3155K = j6;
            if (j6 <= 0) {
                cVar4.j();
                this.f4494a.t();
            }
        }
        this.f4494a.o0.postDelayed(this, 200L);
    }
}
