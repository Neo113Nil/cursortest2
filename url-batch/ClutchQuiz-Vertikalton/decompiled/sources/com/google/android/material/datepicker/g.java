package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f0.T;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f1860E;
    public final /* synthetic */ k F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i2) {
        super(i);
        this.F = kVar;
        this.f1860E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(T t2, int[] iArr) {
        int i = this.f1860E;
        k kVar = this.F;
        if (i == 0) {
            iArr[0] = kVar.f1873a0.getWidth();
            iArr[1] = kVar.f1873a0.getWidth();
        } else {
            iArr[0] = kVar.f1873a0.getHeight();
            iArr[1] = kVar.f1873a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.H
    public final void x0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f2351a = i;
        y0(uVar);
    }
}
