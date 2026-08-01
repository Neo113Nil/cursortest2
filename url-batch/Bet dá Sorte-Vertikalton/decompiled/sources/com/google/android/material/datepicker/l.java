package com.google.android.material.datepicker;

import K.w0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements K.r {

    /* renamed from: a, reason: collision with root package name */
    public final View f1800a;

    /* renamed from: b, reason: collision with root package name */
    public int f1801b;

    /* renamed from: c, reason: collision with root package name */
    public int f1802c;

    public l(View view) {
        this.f1800a = view;
    }

    @Override // K.r
    public w0 a(View view, w0 w0Var) {
        int i = w0Var.f438a.f(7).f143b;
        View view2 = this.f1800a;
        int i2 = this.f1801b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1802c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return w0Var;
    }

    public l(View view, int i, int i2) {
        this.f1801b = i;
        this.f1800a = view;
        this.f1802c = i2;
    }
}
