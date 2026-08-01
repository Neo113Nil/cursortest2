package com.google.android.material.datepicker;

import defpackage.ku;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ MaterialCalendarGridView f;
    public final /* synthetic */ int g;

    public /* synthetic */ b(e eVar, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.f = materialCalendarGridView;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int a;
        MaterialCalendarGridView materialCalendarGridView = this.f;
        if (!materialCalendarGridView.hasFocus() || (i = this.g) == 0) {
            return;
        }
        ku b = materialCalendarGridView.b();
        if (i == 1) {
            a = b.b(b.f() + 1);
            if (a == -1) {
                a = b.f();
            }
        } else {
            a = b.a(b.c() - 1);
            if (a == -1) {
                a = b.c();
            }
        }
        materialCalendarGridView.setSelection(a);
    }
}
