package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g1.m1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ q F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, int i, int i4) {
        super(i);
        this.F = qVar;
        this.E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g1.a1
    public final void A0(RecyclerView recyclerView, int i) {
        g0 g0Var = new g0(recyclerView.getContext());
        g0Var.f1675a = i;
        B0(g0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(m1 m1Var, int[] iArr) {
        int i = this.E;
        q qVar = this.F;
        if (i == 0) {
            iArr[0] = qVar.f1091g0.getWidth();
            iArr[1] = qVar.f1091g0.getWidth();
        } else {
            iArr[0] = qVar.f1091g0.getHeight();
            iArr[1] = qVar.f1091g0.getHeight();
        }
    }
}
