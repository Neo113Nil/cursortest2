package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1920a;

    public b(ClockFaceView clockFaceView) {
        this.f1920a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1920a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1902v.d) - clockFaceView.f1896D;
        if (height != clockFaceView.f1922t) {
            clockFaceView.f1922t = height;
            clockFaceView.m();
            int i = clockFaceView.f1922t;
            ClockHandView clockHandView = clockFaceView.f1902v;
            clockHandView.f1915l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
