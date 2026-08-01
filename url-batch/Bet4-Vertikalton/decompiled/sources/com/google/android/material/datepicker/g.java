package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.Y;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f1778E;
    public final /* synthetic */ k F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i2) {
        super(i);
        this.F = kVar;
        this.f1778E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(Y y2, int[] iArr) {
        int i = this.f1778E;
        k kVar = this.F;
        if (i == 0) {
            iArr[0] = kVar.f1791a0.getWidth();
            iArr[1] = kVar.f1791a0.getWidth();
        } else {
            iArr[0] = kVar.f1791a0.getHeight();
            iArr[1] = kVar.f1791a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.L
    public final void z0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f2497a = i;
        A0(uVar);
    }
}
