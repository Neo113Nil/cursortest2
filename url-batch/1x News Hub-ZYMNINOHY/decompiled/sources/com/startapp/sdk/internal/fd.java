package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class fd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3797a;

    public fd(ld ldVar) {
        this.f3797a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3797a;
        if (ldVar.o || ldVar.f4094g) {
            return;
        }
        try {
            ldVar.f4094g = true;
            g0.d(ldVar.f4089a);
            if (ldVar.f4098k && MetaData.E().i0()) {
                g0.a(ldVar.f4089a, ldVar.f4093e);
            } else {
                g0.b(ldVar.f4089a, ldVar.f4093e);
            }
            Runnable runnable = ldVar.f4101n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
