package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class rj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f7540a;

    public rj(com.startapp.sdk.ads.video.c cVar) {
        this.f7540a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f7540a;
        if (cVar.L == null) {
            return;
        }
        cVar.f6244R = !cVar.f6244R;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f7540a;
        cVar2.a(cVar2.f6244R);
    }
}
