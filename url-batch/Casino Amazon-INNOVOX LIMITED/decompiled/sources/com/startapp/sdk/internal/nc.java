package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class nc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc f350a;

    public nc(tc tcVar) {
        this.f350a = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f350a;
        if (tcVar.o || tcVar.g) {
            return;
        }
        try {
            tcVar.g = true;
            e0.d(tcVar.f440a);
            if (tcVar.k && MetaData.A().c0()) {
                e0.a(tcVar.f440a, tcVar.e);
            } else {
                e0.b(tcVar.f440a, tcVar.e);
            }
            Runnable runnable = tcVar.n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
