package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.k;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes5.dex */
public class b implements a.InterfaceC0078a, c.a {
    private final k a;
    private final a b;
    private final c c;

    public b(k kVar) {
        this.a = kVar;
        this.b = new a(kVar);
        this.c = new c(kVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h A;
        if (c3Var == null || (A = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(A.c(), c3Var);
    }

    public void a() {
        this.c.a();
        this.b.a();
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0078a
    public void b(final c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.this.c(c3Var);
            }
        }, c3Var.m0());
    }

    public void e(c3 c3Var) {
        long n0 = c3Var.n0();
        if (n0 >= 0) {
            this.c.a(c3Var, n0);
        }
        if (c3Var.x0() || c3Var.y0()) {
            this.b.a(c3Var, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }
}
