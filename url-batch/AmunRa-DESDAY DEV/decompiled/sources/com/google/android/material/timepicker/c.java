package com.google.android.material.timepicker;

import K.C0001b;
import L.j;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.visualfortune.eyerest.R;

/* loaded from: classes.dex */
public final class c extends C0001b {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // K.C0001b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f374a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f477a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.f1874z.get(intValue - 1));
        }
        jVar.h(L.i.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(L.e.f467e);
    }

    @Override // K.C0001b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.f1871w);
        float centerX = clockFaceView.f1871w.centerX();
        float centerY = clockFaceView.f1871w.centerY();
        clockFaceView.f1870v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f1870v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
