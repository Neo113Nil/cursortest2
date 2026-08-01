package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.U;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f1862E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f1863F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i2) {
        super(i);
        this.f1863F = kVar;
        this.f1862E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(U u2, int[] iArr) {
        int i = this.f1862E;
        k kVar = this.f1863F;
        if (i == 0) {
            iArr[0] = kVar.f1876a0.getWidth();
            iArr[1] = kVar.f1876a0.getWidth();
        } else {
            iArr[0] = kVar.f1876a0.getHeight();
            iArr[1] = kVar.f1876a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.I
    public final void x0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f2593a = i;
        y0(uVar);
    }
}
