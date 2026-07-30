package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.C5029M;

/* loaded from: classes2.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f36115E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f36116F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i4) {
        super(i);
        this.f36116F = kVar;
        this.f36115E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(C5029M c5029m, int[] iArr) {
        int i = this.f36115E;
        k kVar = this.f36116F;
        if (i == 0) {
            iArr[0] = kVar.f36128G0.getWidth();
            iArr[1] = kVar.f36128G0.getWidth();
        } else {
            iArr[0] = kVar.f36128G0.getHeight();
            iArr[1] = kVar.f36128G0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC5019C
    public final void x0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f40779a = i;
        y0(uVar);
    }
}
