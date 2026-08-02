package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class dd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3694a;

    public dd(ld ldVar) {
        this.f3694a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3694a;
        if (ldVar.f4094g) {
            return;
        }
        try {
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = "Failed smart redirect hop info: ".concat(ldVar.f4102p ? "Page Finished" : "Timeout");
            d9Var.f = ldVar.b();
            d9Var.f3682g = ldVar.f;
            d9Var.a();
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            ldVar.o = true;
            g0.d(ldVar.f4089a);
            ldVar.a();
            if (ldVar.f4098k && MetaData.E().i0()) {
                g0.a(ldVar.f4089a, ldVar.f4093e);
            } else {
                g0.b(ldVar.f4089a, ldVar.f4093e);
            }
            Runnable runnable = ldVar.f4101n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
