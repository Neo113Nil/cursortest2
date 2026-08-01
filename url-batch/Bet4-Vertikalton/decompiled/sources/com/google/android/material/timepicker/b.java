package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1980a;

    public b(ClockFaceView clockFaceView) {
        this.f1980a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1980a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1962v.d) - clockFaceView.f1956D;
        if (height != clockFaceView.f1982t) {
            clockFaceView.f1982t = height;
            clockFaceView.m();
            int i = clockFaceView.f1982t;
            ClockHandView clockHandView = clockFaceView.f1962v;
            clockHandView.f1975l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
