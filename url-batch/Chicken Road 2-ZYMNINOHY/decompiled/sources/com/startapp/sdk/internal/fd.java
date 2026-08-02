package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class fd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f6915a;

    public fd(ld ldVar) {
        this.f6915a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f6915a;
        if (ldVar.o || ldVar.f7223g) {
            return;
        }
        try {
            ldVar.f7223g = true;
            g0.d(ldVar.f7217a);
            if (ldVar.f7227k && MetaData.E().i0()) {
                g0.a(ldVar.f7217a, ldVar.f7221e);
            } else {
                g0.b(ldVar.f7217a, ldVar.f7221e);
            }
            Runnable runnable = ldVar.n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
