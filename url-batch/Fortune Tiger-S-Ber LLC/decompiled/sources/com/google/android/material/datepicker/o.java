package com.google.android.material.datepicker;

import android.view.View;
import k0.m1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o implements k0.m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1306f;
    public final /* synthetic */ View g;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1307i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1308j;

    public o(View view, int i4, int i5, int i6, int i7) {
        this.f1306f = i4;
        this.g = view;
        this.h = i5;
        this.f1307i = i6;
        this.f1308j = i7;
    }

    @Override // k0.m
    public final m1 d(View view, m1 m1Var) {
        c0.c f4 = m1Var.f2760a.f(519);
        View view2 = this.g;
        int i4 = this.f1306f;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + f4.f979b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + f4.f978a, this.f1307i + f4.f979b, this.f1308j + f4.c, view2.getPaddingBottom());
        return m1Var;
    }
}
