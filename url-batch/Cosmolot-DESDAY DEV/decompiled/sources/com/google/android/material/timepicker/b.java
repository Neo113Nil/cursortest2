package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1854a;

    public b(ClockFaceView clockFaceView) {
        this.f1854a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1854a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1836v.d) - clockFaceView.f1830D;
        if (height != clockFaceView.f1856t) {
            clockFaceView.f1856t = height;
            clockFaceView.m();
            int i = clockFaceView.f1856t;
            ClockHandView clockHandView = clockFaceView.f1836v;
            clockHandView.f1849l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
