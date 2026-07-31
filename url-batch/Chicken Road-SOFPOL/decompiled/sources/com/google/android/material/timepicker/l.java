package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2042d;

    public l(GestureDetector gestureDetector) {
        this.f2042d = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2042d.onTouchEvent(motionEvent);
        }
        return false;
    }
}
