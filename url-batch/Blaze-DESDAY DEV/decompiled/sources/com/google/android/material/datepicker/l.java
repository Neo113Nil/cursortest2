package com.google.android.material.datepicker;

import K.z0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f1827a;

    /* renamed from: b, reason: collision with root package name */
    public int f1828b;

    /* renamed from: c, reason: collision with root package name */
    public int f1829c;

    public l(View view) {
        this.f1827a = view;
    }

    @Override // K.r
    public z0 a(View view, z0 z0Var) {
        int i = z0Var.f536a.f(7).f73b;
        View view2 = this.f1827a;
        int i2 = this.f1828b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1829c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return z0Var;
    }

    public l(View view, int i, int i2) {
        this.f1828b = i;
        this.f1827a = view;
        this.f1829c = i2;
    }
}
