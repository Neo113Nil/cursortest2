package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2090a;

    public b(ClockFaceView clockFaceView) {
        this.f2090a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2090a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2071v.d) - clockFaceView.f2065D;
        if (height != clockFaceView.f2092t) {
            clockFaceView.f2092t = height;
            clockFaceView.m();
            int i = clockFaceView.f2092t;
            ClockHandView clockHandView = clockFaceView.f2071v;
            clockHandView.f2085l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
