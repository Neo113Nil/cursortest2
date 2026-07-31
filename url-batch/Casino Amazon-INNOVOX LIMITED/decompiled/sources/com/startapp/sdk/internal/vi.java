package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f472a;

    public vi(com.startapp.sdk.ads.video.a aVar) {
        this.f472a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.a aVar = this.f472a;
        zh.a(aVar.t, true, "videoApi.setCloseable", Boolean.TRUE);
    }
}
