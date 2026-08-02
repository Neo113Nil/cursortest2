package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class dd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f6808a;

    public dd(ld ldVar) {
        this.f6808a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f6808a;
        if (ldVar.f7223g) {
            return;
        }
        try {
            d9 d9Var = new d9(e9.f6839e);
            d9Var.f6792d = "Failed smart redirect hop info: ".concat(ldVar.f7230p ? "Page Finished" : "Timeout");
            d9Var.f6794f = ldVar.b();
            d9Var.f6795g = ldVar.f7222f;
            d9Var.a();
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            ldVar.o = true;
            g0.d(ldVar.f7217a);
            ldVar.a();
            if (ldVar.f7227k && MetaData.E().i0()) {
                g0.a(ldVar.f7217a, ldVar.f7221e);
            } else {
                g0.b(ldVar.f7217a, ldVar.f7221e);
            }
            Runnable runnable = ldVar.n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
