package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.S;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f2370E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f2371F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i2) {
        super(i);
        this.f2371F = kVar;
        this.f2370E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(S s2, int[] iArr) {
        int i = this.f2370E;
        k kVar = this.f2371F;
        if (i == 0) {
            iArr[0] = kVar.f2384a0.getWidth();
            iArr[1] = kVar.f2384a0.getWidth();
        } else {
            iArr[0] = kVar.f2384a0.getHeight();
            iArr[1] = kVar.f2384a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.AbstractC0141G
    public final void x0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f3117a = i;
        y0(uVar);
    }
}
