package com.google.android.material.datepicker;

import android.view.View;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t implements n0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f1104g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1105j;

    public t(View view, int i, int i4, int i5, int i6) {
        this.f1103f = i;
        this.f1104g = view;
        this.h = i4;
        this.i = i5;
        this.f1105j = i6;
    }

    @Override // n0.p
    public final v1 l(View view, v1 v1Var) {
        f0.c h = v1Var.f2842a.h(519);
        View view2 = this.f1104g;
        int i = this.f1103f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.f1416b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.h + h.f1415a, this.i + h.f1416b, this.f1105j + h.f1417c, view2.getPaddingBottom());
        return v1Var;
    }
}
