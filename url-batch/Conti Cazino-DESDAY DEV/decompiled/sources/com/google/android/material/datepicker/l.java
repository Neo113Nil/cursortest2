package com.google.android.material.datepicker;

import K.x0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f1671a;

    /* renamed from: b, reason: collision with root package name */
    public int f1672b;

    /* renamed from: c, reason: collision with root package name */
    public int f1673c;

    public l(View view) {
        this.f1671a = view;
    }

    @Override // K.r
    public x0 d(View view, x0 x0Var) {
        int i = x0Var.f468a.f(7).f149b;
        View view2 = this.f1671a;
        int i2 = this.f1672b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1673c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x0Var;
    }

    public l(View view, int i, int i2) {
        this.f1672b = i;
        this.f1671a = view;
        this.f1673c = i2;
    }
}
