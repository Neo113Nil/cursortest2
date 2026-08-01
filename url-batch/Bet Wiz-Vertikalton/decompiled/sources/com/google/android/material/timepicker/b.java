package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1957a;

    public b(ClockFaceView clockFaceView) {
        this.f1957a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1957a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1939v.d) - clockFaceView.f1933D;
        if (height != clockFaceView.f1959t) {
            clockFaceView.f1959t = height;
            clockFaceView.m();
            int i = clockFaceView.f1959t;
            ClockHandView clockHandView = clockFaceView.f1939v;
            clockHandView.f1952l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
