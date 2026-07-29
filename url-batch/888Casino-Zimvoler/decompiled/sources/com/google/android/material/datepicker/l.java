package com.google.android.material.datepicker;

import K.x0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f1669a;

    /* renamed from: b, reason: collision with root package name */
    public int f1670b;

    /* renamed from: c, reason: collision with root package name */
    public int f1671c;

    public l(View view) {
        this.f1669a = view;
    }

    @Override // K.r
    public x0 d(View view, x0 x0Var) {
        int i = x0Var.f468a.f(7).f149b;
        View view2 = this.f1669a;
        int i2 = this.f1670b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1671c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x0Var;
    }

    public l(View view, int i, int i2) {
        this.f1670b = i;
        this.f1669a = view;
        this.f1671c = i2;
    }
}
