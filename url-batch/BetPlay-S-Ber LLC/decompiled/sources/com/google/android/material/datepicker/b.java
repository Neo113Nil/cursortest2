package com.google.android.material.datepicker;

import defpackage.zu;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
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
        zu b = materialCalendarGridView.b();
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
