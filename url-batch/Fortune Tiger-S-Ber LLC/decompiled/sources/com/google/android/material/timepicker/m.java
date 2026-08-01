package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f1465f;

    public m(GestureDetector gestureDetector) {
        this.f1465f = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f1465f.onTouchEvent(motionEvent);
        }
        return false;
    }
}
