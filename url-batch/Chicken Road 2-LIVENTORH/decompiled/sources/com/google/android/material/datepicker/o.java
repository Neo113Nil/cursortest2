package com.google.android.material.datepicker;

import android.view.View;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o implements n0.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f937h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f938j;

    public o(View view, int i, int i4, int i5, int i6) {
        this.f935f = i;
        this.f936g = view;
        this.f937h = i4;
        this.i = i5;
        this.f938j = i6;
    }

    @Override // n0.n
    public final q1 t(View view, q1 q1Var) {
        f0.c f2 = q1Var.f2775a.f(519);
        View view2 = this.f936g;
        int i = this.f935f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + f2.f1267b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f937h + f2.f1266a, this.i + f2.f1267b, this.f938j + f2.f1268c, view2.getPaddingBottom());
        return q1Var;
    }
}
