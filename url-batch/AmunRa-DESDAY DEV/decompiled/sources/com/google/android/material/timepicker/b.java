package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1888a;

    public b(ClockFaceView clockFaceView) {
        this.f1888a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1888a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1870v.d) - clockFaceView.f1864D;
        if (height != clockFaceView.f1890t) {
            clockFaceView.f1890t = height;
            clockFaceView.m();
            int i = clockFaceView.f1890t;
            ClockHandView clockHandView = clockFaceView.f1870v;
            clockHandView.f1883l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
