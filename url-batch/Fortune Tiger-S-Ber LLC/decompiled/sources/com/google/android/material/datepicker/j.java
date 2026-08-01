package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.c1;
import b1.n0;
import b1.q0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1290b;

    public j(l lVar, w wVar) {
        this.f1290b = lVar;
        this.f1289a = wVar;
    }

    @Override // b1.q0
    public final void a(RecyclerView recyclerView, int i4) {
        l lVar;
        b1.a0 a0Var;
        RecyclerView recyclerView2;
        if (i4 != 0 || (a0Var = (lVar = this.f1290b).f1302m0) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f0.getLayoutManager();
        View c = linearLayoutManager.e() ? b1.a0.c(linearLayoutManager, a0Var.e(linearLayoutManager)) : linearLayoutManager.d() ? b1.a0.c(linearLayoutManager, a0Var.d(linearLayoutManager)) : null;
        if (c != null) {
            c1 I = RecyclerView.I(c);
            int F = (I == null || (recyclerView2 = I.f761r) == null) ? -1 : recyclerView2.F(I);
            if (F != -1) {
                w wVar = this.f1289a;
                lVar.f1292b0 = wVar.e(F);
                lVar.f1300k0.setText(wVar.e(F).c());
                lVar.M(F);
            }
        }
        lVar.L();
    }

    @Override // b1.q0
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int L0;
        l lVar = this.f1290b;
        if (i4 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f0.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            L0 = N0 == null ? -1 : n0.H(N0);
        } else {
            L0 = ((LinearLayoutManager) lVar.f0.getLayoutManager()).L0();
        }
        b1.a0 a0Var = lVar.f1302m0;
        w wVar = this.f1289a;
        if (a0Var == null) {
            lVar.f1292b0 = wVar.e(L0);
        }
        lVar.f1300k0.setText(wVar.e(L0).c());
        lVar.M(L0);
    }
}
