package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;

/* loaded from: classes.dex */
public final class oj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj f7405a;

    public oj(pj pjVar) {
        this.f7405a = pjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.startapp.sdk.ads.video.c cVar = this.f7405a.f7461a;
            int i4 = com.startapp.sdk.ads.video.c.f6237s0;
            cVar.I();
            com.startapp.sdk.ads.video.c cVar2 = this.f7405a.f7461a;
            cVar2.a(new ak(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", cVar2.u()));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
