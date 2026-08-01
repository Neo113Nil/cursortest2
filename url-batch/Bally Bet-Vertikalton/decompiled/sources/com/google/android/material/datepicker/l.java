package com.google.android.material.datepicker;

import K.x0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f1674a;

    /* renamed from: b, reason: collision with root package name */
    public int f1675b;

    /* renamed from: c, reason: collision with root package name */
    public int f1676c;

    public l(View view) {
        this.f1674a = view;
    }

    @Override // K.r
    public x0 c(View view, x0 x0Var) {
        int i = x0Var.f468a.f(7).f149b;
        View view2 = this.f1674a;
        int i2 = this.f1675b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1676c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return x0Var;
    }

    public l(View view, int i, int i2) {
        this.f1675b = i;
        this.f1674a = view;
        this.f1676c = i2;
    }
}
