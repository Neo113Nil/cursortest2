package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1074f;

    public b(ClockFaceView clockFaceView) {
        this.f1074f = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1074f;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1056y.i) - clockFaceView.G;
        if (height != clockFaceView.f1078w) {
            clockFaceView.f1078w = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.f1056y;
            clockHandView.f1069q = clockFaceView.f1078w;
            clockHandView.invalidate();
        }
        return true;
    }
}
