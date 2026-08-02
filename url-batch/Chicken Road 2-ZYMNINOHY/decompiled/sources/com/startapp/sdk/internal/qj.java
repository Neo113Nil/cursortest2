package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class qj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f7511a;

    public qj(com.startapp.sdk.ads.video.c cVar) {
        this.f7511a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f7511a;
        si.a(cVar.f7830t, true, "videoApi.setCloseable", Boolean.TRUE);
    }
}
