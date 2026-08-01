package com.google.android.material.timepicker;

import K.C0002b;
import L.j;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fortuneink.neonpad.R;

/* loaded from: classes.dex */
public final class c extends C0002b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2080d;

    public c(ClockFaceView clockFaceView) {
        this.f2080d = clockFaceView;
    }

    @Override // K.C0002b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f426a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f665a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2080d.f2064z.get(intValue - 1));
        }
        jVar.h(L.i.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(L.e.f654e);
    }

    @Override // K.C0002b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2080d;
        view.getHitRect(clockFaceView.f2061w);
        float centerX = clockFaceView.f2061w.centerX();
        float centerY = clockFaceView.f2061w.centerY();
        clockFaceView.f2060v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2060v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
