package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2033d;

    public b(ClockFaceView clockFaceView) {
        this.f2033d = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2033d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2013w.f2021g) - clockFaceView.E;
        if (height != clockFaceView.f2038u) {
            clockFaceView.f2038u = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.f2013w;
            clockHandView.f2028o = clockFaceView.f2038u;
            clockHandView.invalidate();
        }
        return true;
    }
}
