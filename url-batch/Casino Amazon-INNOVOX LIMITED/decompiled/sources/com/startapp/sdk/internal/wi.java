package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class wi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f486a;

    public wi(com.startapp.sdk.ads.video.a aVar) {
        this.f486a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.a aVar = this.f486a;
        if (aVar.L == null) {
            return;
        }
        aVar.R = !aVar.R;
        aVar.E();
        com.startapp.sdk.ads.video.a aVar2 = this.f486a;
        aVar2.a(aVar2.R);
    }
}
