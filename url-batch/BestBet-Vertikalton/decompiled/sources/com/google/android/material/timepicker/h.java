package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f2468a;

    public h(TimePickerView timePickerView) {
        this.f2468a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f2459t;
        this.f2468a.getClass();
        return false;
    }
}
