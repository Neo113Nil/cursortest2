package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i4, int i5) {
        super(i4);
        this.F = lVar;
        this.E = i5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(z0 z0Var, int[] iArr) {
        int i4 = this.E;
        l lVar = this.F;
        if (i4 == 0) {
            iArr[0] = lVar.f0.getWidth();
            iArr[1] = lVar.f0.getWidth();
        } else {
            iArr[0] = lVar.f0.getHeight();
            iArr[1] = lVar.f0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b1.n0
    public final void y0(RecyclerView recyclerView, int i4) {
        y yVar = new y(recyclerView.getContext());
        yVar.f936a = i4;
        z0(yVar);
    }
}
