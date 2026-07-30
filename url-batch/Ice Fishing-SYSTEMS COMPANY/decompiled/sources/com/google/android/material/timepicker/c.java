package com.google.android.material.timepicker;

import O.C0336b;
import P.j;
import P.k;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes2.dex */
public final class c extends C0336b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f36339d;

    public c(ClockFaceView clockFaceView) {
        this.f36339d = clockFaceView;
    }

    @Override // O.C0336b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(C5284R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f36339d.f36312Q.get(intValue - 1));
        }
        kVar.j(j.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        kVar.b(P.f.f2662g);
    }

    @Override // O.C0336b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f36339d;
        view.getHitRect(clockFaceView.f36309N);
        float centerX = clockFaceView.f36309N.centerX();
        float centerY = clockFaceView.f36309N.centerY();
        clockFaceView.f36308M.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f36308M.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
