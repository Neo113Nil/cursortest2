package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.W;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f1877E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f1878F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i2) {
        super(i);
        this.f1878F = kVar;
        this.f1877E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(W w2, int[] iArr) {
        int i = this.f1877E;
        k kVar = this.f1878F;
        if (i == 0) {
            iArr[0] = kVar.f1891a0.getWidth();
            iArr[1] = kVar.f1891a0.getWidth();
        } else {
            iArr[0] = kVar.f1891a0.getHeight();
            iArr[1] = kVar.f1891a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, h0.J
    public final void z0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f2625a = i;
        A0(uVar);
    }
}
