package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f1.y0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, int i, int i4) {
        super(i);
        this.F = mVar;
        this.E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(y0 y0Var, int[] iArr) {
        int i = this.E;
        m mVar = this.F;
        if (i == 0) {
            iArr[0] = mVar.f927f0.getWidth();
            iArr[1] = mVar.f927f0.getWidth();
        } else {
            iArr[0] = mVar.f927f0.getHeight();
            iArr[1] = mVar.f927f0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f1.m0
    public final void y0(RecyclerView recyclerView, int i) {
        x xVar = new x(recyclerView.getContext());
        xVar.f1515a = i;
        z0(xVar);
    }
}
