package com.google.android.material.datepicker;

import K.InterfaceC0020p;
import K.w0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements InterfaceC0020p {

    /* renamed from: a, reason: collision with root package name */
    public final View f2276a;

    /* renamed from: b, reason: collision with root package name */
    public int f2277b;

    /* renamed from: c, reason: collision with root package name */
    public int f2278c;

    public l(View view) {
        this.f2276a = view;
    }

    @Override // K.InterfaceC0020p
    public w0 d(View view, w0 w0Var) {
        int i = w0Var.f668a.f(7).f69b;
        View view2 = this.f2276a;
        int i2 = this.f2277b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2278c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return w0Var;
    }

    public l(View view, int i, int i2) {
        this.f2277b = i;
        this.f2276a = view;
        this.f2278c = i2;
    }
}
