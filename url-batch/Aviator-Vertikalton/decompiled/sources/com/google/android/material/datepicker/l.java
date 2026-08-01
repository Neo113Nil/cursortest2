package com.google.android.material.datepicker;

import K.B0;
import K.InterfaceC0025v;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements InterfaceC0025v {

    /* renamed from: a, reason: collision with root package name */
    public final View f1889a;

    /* renamed from: b, reason: collision with root package name */
    public int f1890b;

    /* renamed from: c, reason: collision with root package name */
    public int f1891c;

    public l(View view) {
        this.f1889a = view;
    }

    @Override // K.InterfaceC0025v
    public B0 c(View view, B0 b02) {
        int i = b02.f395a.f(7).f159b;
        View view2 = this.f1889a;
        int i2 = this.f1890b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1891c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return b02;
    }

    public l(View view, int i, int i2) {
        this.f1890b = i;
        this.f1889a = view;
        this.f1891c = i2;
    }
}
