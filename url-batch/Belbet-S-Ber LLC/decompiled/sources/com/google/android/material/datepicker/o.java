package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g1.a1;
import g1.d1;
import g1.m0;
import g1.q1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1083b;

    public o(q qVar, c0 c0Var) {
        this.f1083b = qVar;
        this.f1082a = c0Var;
    }

    @Override // g1.d1
    public final void a(RecyclerView recyclerView, int i) {
        q qVar;
        m0 m0Var;
        RecyclerView recyclerView2;
        if (i != 0 || (m0Var = (qVar = this.f1083b).f1097n0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) qVar.f1091g0.getLayoutManager();
        View c5 = linearLayoutManager.e() ? m0.c(linearLayoutManager, m0Var.e(linearLayoutManager)) : linearLayoutManager.d() ? m0.c(linearLayoutManager, m0Var.d(linearLayoutManager)) : null;
        if (c5 != null) {
            q1 M = RecyclerView.M(c5);
            int J = (M == null || (recyclerView2 = M.f1782r) == null) ? -1 : recyclerView2.J(M);
            if (J != -1) {
                c0 c0Var = this.f1082a;
                qVar.f1088c0 = c0Var.e(J);
                qVar.f1095l0.setText(c0Var.e(J).d());
                qVar.M(J);
            }
        }
        qVar.L();
    }

    @Override // g1.d1
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int N0;
        q qVar = this.f1083b;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) qVar.f1091g0.getLayoutManager();
            View P0 = linearLayoutManager.P0(0, linearLayoutManager.v(), false);
            N0 = P0 == null ? -1 : a1.G(P0);
        } else {
            N0 = ((LinearLayoutManager) qVar.f1091g0.getLayoutManager()).N0();
        }
        m0 m0Var = qVar.f1097n0;
        c0 c0Var = this.f1082a;
        if (m0Var == null) {
            qVar.f1088c0 = c0Var.e(N0);
        }
        qVar.f1095l0.setText(c0Var.e(N0).d());
        qVar.M(N0);
    }
}
