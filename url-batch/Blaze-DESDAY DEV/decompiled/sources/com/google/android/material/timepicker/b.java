package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2013a;

    public b(ClockFaceView clockFaceView) {
        this.f2013a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2013a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1995v.d) - clockFaceView.f1989D;
        if (height != clockFaceView.f2015t) {
            clockFaceView.f2015t = height;
            clockFaceView.m();
            int i = clockFaceView.f2015t;
            ClockHandView clockHandView = clockFaceView.f1995v;
            clockHandView.f2008l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
