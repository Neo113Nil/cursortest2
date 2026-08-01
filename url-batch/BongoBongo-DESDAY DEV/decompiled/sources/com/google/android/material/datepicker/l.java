package com.google.android.material.datepicker;

import L.z0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements L.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f1896a;

    /* renamed from: b, reason: collision with root package name */
    public int f1897b;

    /* renamed from: c, reason: collision with root package name */
    public int f1898c;

    public l(View view) {
        this.f1896a = view;
    }

    @Override // L.r
    public z0 d(View view, z0 z0Var) {
        int i = z0Var.f589a.f(7).f115b;
        View view2 = this.f1896a;
        int i2 = this.f1897b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1898c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return z0Var;
    }

    public l(View view, int i, int i2) {
        this.f1897b = i;
        this.f1896a = view;
        this.f1898c = i2;
    }
}
