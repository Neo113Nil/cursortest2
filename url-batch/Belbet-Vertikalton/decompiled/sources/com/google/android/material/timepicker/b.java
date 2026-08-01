package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2584a;

    public b(ClockFaceView clockFaceView) {
        this.f2584a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2584a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2566v.f2574d) - clockFaceView.f2560D;
        if (height != clockFaceView.f2587t) {
            clockFaceView.f2587t = height;
            clockFaceView.m();
            int i = clockFaceView.f2587t;
            ClockHandView clockHandView = clockFaceView.f2566v;
            clockHandView.f2579l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
