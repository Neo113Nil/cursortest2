package com.google.android.material.datepicker;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1333f;
    public final /* synthetic */ int g;

    public /* synthetic */ t(w wVar, MaterialCalendarGridView materialCalendarGridView, int i4) {
        this.f1333f = materialCalendarGridView;
        this.g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int a4;
        MaterialCalendarGridView materialCalendarGridView = this.f1333f;
        if (!materialCalendarGridView.hasFocus() || (i4 = this.g) == 0) {
            return;
        }
        s b2 = materialCalendarGridView.b();
        if (i4 == 1) {
            a4 = b2.b(b2.f() + 1);
            if (a4 == -1) {
                a4 = b2.f();
            }
        } else {
            a4 = b2.a(b2.c() - 1);
            if (a4 == -1) {
                a4 = b2.c();
            }
        }
        materialCalendarGridView.setSelection(a4);
    }
}
