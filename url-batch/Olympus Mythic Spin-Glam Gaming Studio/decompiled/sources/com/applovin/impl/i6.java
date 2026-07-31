package com.applovin.impl;

import com.applovin.impl.d6;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public class i6 extends i5 {
    private final WeakReference g;
    private final Object h;

    protected i6(s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.g = new WeakReference(s4Var);
        this.h = obj;
    }

    public static void a(long j, s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j <= 0) {
            return;
        }
        kVar.q0().a(new i6(s4Var, obj, str, kVar), d6.b.TIMEOUT, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        s4 s4Var = (s4) this.g.get();
        if (s4Var == null || s4Var.d()) {
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().d(this.b, "Attempting to timeout pending task " + s4Var.c() + " with " + this.h);
        }
        s4Var.c(this.h);
    }
}
