package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1857a;

    public b(ClockFaceView clockFaceView) {
        this.f1857a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1857a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1839v.d) - clockFaceView.f1833D;
        if (height != clockFaceView.f1859t) {
            clockFaceView.f1859t = height;
            clockFaceView.m();
            int i = clockFaceView.f1859t;
            ClockHandView clockHandView = clockFaceView.f1839v;
            clockHandView.f1852l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
