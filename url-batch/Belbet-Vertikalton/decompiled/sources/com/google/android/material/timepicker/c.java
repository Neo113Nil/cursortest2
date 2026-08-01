package com.google.android.material.timepicker;

import M.C0006b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.winpower.neonfit.R;

/* loaded from: classes.dex */
public final class c extends C0006b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2585d;

    public c(ClockFaceView clockFaceView) {
        this.f2585d = clockFaceView;
    }

    @Override // M.C0006b
    public final void d(View view, N.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f728a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2585d.f2570z.get(intValue - 1));
        }
        iVar.h(N.h.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        iVar.b(N.d.e);
    }

    @Override // M.C0006b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2585d;
        view.getHitRect(clockFaceView.f2567w);
        float centerX = clockFaceView.f2567w.centerX();
        float centerY = clockFaceView.f2567w.centerY();
        clockFaceView.f2566v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2566v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
