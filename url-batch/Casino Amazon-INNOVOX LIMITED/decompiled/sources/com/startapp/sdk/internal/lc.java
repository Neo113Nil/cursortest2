package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class lc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc f319a;

    public lc(tc tcVar) {
        this.f319a = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f319a;
        if (tcVar.g) {
            return;
        }
        try {
            n8 n8Var = new n8(o8.e);
            n8Var.d = "Failed smart redirect hop info: ".concat(tcVar.p ? "Page Finished" : "Timeout");
            n8Var.f = tcVar.b();
            n8Var.g = tcVar.f;
            n8Var.a();
        } catch (Throwable th) {
            n8.a(th);
        }
        try {
            tcVar.o = true;
            e0.d(tcVar.f440a);
            tcVar.a();
            if (tcVar.k && MetaData.A().c0()) {
                e0.a(tcVar.f440a, tcVar.e);
            } else {
                e0.b(tcVar.f440a, tcVar.e);
            }
            Runnable runnable = tcVar.n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            n8.a(th2);
        }
    }
}
