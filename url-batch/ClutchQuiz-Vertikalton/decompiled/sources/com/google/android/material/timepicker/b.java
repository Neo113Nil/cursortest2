package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2065a;

    public b(ClockFaceView clockFaceView) {
        this.f2065a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2065a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2047v.d) - clockFaceView.f2041D;
        if (height != clockFaceView.f2067t) {
            clockFaceView.f2067t = height;
            clockFaceView.m();
            int i = clockFaceView.f2067t;
            ClockHandView clockHandView = clockFaceView.f2047v;
            clockHandView.f2060l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
