package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f1100g;

    public /* synthetic */ r(View view, int i) {
        this.f1099f = i;
        this.f1100g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1099f) {
            case 0:
                MaterialCalendarGridView.a((MaterialCalendarGridView) this.f1100g);
                break;
            default:
                View view = this.f1100g;
                view.requestFocus();
                view.post(new a.j(5, view));
                break;
        }
    }
}
