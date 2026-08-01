package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1985a;

    public b(ClockFaceView clockFaceView) {
        this.f1985a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1985a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1967v.d) - clockFaceView.f1961D;
        if (height != clockFaceView.f1987t) {
            clockFaceView.f1987t = height;
            clockFaceView.m();
            int i = clockFaceView.f1987t;
            ClockHandView clockHandView = clockFaceView.f1967v;
            clockHandView.f1980l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
