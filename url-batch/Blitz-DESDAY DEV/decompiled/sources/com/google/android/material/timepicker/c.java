package com.google.android.material.timepicker;

import M.C0001b;
import N.j;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.winfour.neondrop.R;

/* loaded from: classes.dex */
public final class c extends C0001b {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // M.C0001b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f525a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f631a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.f2055z.get(intValue - 1));
        }
        jVar.h(N.i.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(N.e.f621e);
    }

    @Override // M.C0001b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.f2052w);
        float centerX = clockFaceView.f2052w.centerX();
        float centerY = clockFaceView.f2052w.centerY();
        clockFaceView.f2051v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2051v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
