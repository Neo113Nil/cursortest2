package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f2041a;

    public k(TimePickerView timePickerView) {
        this.f2041a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f2030u;
        this.f2041a.getClass();
        return false;
    }
}
