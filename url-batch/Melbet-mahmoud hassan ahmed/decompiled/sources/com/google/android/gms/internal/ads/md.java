package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class md extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final View f8497i;

    public md(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, View view) {
        super(gcVar, "hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", j8Var, i7, 57);
        this.f8497i = view;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (this.f8497i != null) {
            Boolean bool = (Boolean) sw.c().b(m10.f8179d2);
            kc kcVar = new kc((String) this.f10654f.invoke(null, this.f8497i, this.f10650b.b().getResources().getDisplayMetrics(), bool));
            y8 F = z8.F();
            F.s(kcVar.f7457b.longValue());
            F.t(kcVar.f7458c.longValue());
            F.u(kcVar.f7459d.longValue());
            if (bool.booleanValue()) {
                F.r(kcVar.f7460e.longValue());
            }
            this.f10653e.K(F.o());
        }
    }
}
