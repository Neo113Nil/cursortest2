package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class qj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4374a;

    public qj(com.startapp.sdk.ads.video.c cVar) {
        this.f4374a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f4374a;
        si.a(cVar.f4685t, true, "videoApi.setCloseable", Boolean.TRUE);
    }
}
