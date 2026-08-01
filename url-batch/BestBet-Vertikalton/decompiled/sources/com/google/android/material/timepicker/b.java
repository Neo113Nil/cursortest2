package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2462a;

    public b(ClockFaceView clockFaceView) {
        this.f2462a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2462a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2444v.d) - clockFaceView.f2438D;
        if (height != clockFaceView.f2464t) {
            clockFaceView.f2464t = height;
            clockFaceView.m();
            int i = clockFaceView.f2464t;
            ClockHandView clockHandView = clockFaceView.f2444v;
            clockHandView.f2457l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
