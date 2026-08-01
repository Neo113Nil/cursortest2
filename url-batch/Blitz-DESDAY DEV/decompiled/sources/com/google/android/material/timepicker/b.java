package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2069a;

    public b(ClockFaceView clockFaceView) {
        this.f2069a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2069a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2051v.d) - clockFaceView.f2045D;
        if (height != clockFaceView.f2071t) {
            clockFaceView.f2071t = height;
            clockFaceView.m();
            int i = clockFaceView.f2071t;
            ClockHandView clockHandView = clockFaceView.f2051v;
            clockHandView.f2064l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
