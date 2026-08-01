package com.google.android.material.datepicker;

import M.InterfaceC0020p;
import M.t0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements InterfaceC0020p {

    /* renamed from: a, reason: collision with root package name */
    public final View f2389a;

    /* renamed from: b, reason: collision with root package name */
    public int f2390b;

    /* renamed from: c, reason: collision with root package name */
    public int f2391c;

    public l(View view) {
        this.f2389a = view;
    }

    @Override // M.InterfaceC0020p
    public t0 e(View view, t0 t0Var) {
        int i = t0Var.f794a.f(7).f280b;
        View view2 = this.f2389a;
        int i2 = this.f2390b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2391c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return t0Var;
    }

    public l(View view, int i, int i2) {
        this.f2390b = i;
        this.f2389a = view;
        this.f2391c = i2;
    }
}
