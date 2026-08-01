package com.google.android.material.datepicker;

import M.InterfaceC0016q;
import M.v0;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements InterfaceC0016q {

    /* renamed from: a, reason: collision with root package name */
    public final View f1881a;

    /* renamed from: b, reason: collision with root package name */
    public int f1882b;

    /* renamed from: c, reason: collision with root package name */
    public int f1883c;

    public l(View view) {
        this.f1881a = view;
    }

    @Override // M.InterfaceC0016q
    public v0 d(View view, v0 v0Var) {
        int i = v0Var.f596a.f(7).f163b;
        View view2 = this.f1881a;
        int i2 = this.f1882b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1883c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return v0Var;
    }

    public l(View view, int i, int i2) {
        this.f1882b = i;
        this.f1881a = view;
        this.f1883c = i2;
    }
}
