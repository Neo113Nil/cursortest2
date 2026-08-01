package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2057a;

    public b(ClockFaceView clockFaceView) {
        this.f2057a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2057a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2038v.f2046d) - clockFaceView.f2032D;
        if (height != clockFaceView.f2060t) {
            clockFaceView.f2060t = height;
            clockFaceView.m();
            int i = clockFaceView.f2060t;
            ClockHandView clockHandView = clockFaceView.f2038v;
            clockHandView.f2052l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
