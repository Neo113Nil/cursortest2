package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2079a;

    public b(ClockFaceView clockFaceView) {
        this.f2079a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2079a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2060v.f2068d) - clockFaceView.f2054D;
        if (height != clockFaceView.f2082t) {
            clockFaceView.f2082t = height;
            clockFaceView.m();
            int i = clockFaceView.f2082t;
            ClockHandView clockHandView = clockFaceView.f2060v;
            clockHandView.f2074l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
