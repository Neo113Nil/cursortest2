package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends q3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2034d;

    public c(ClockFaceView clockFaceView) {
        this.f2034d = clockFaceView;
    }

    @Override // q3.b
    public final void d(View view, r3.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        this.f6076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2034d.A.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        fVar.b(r3.d.f6541e);
    }

    @Override // q3.b
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2034d;
        view.getHitRect(clockFaceView.f2014x);
        float centerX = clockFaceView.f2014x.centerX();
        float centerY = clockFaceView.f2014x.centerY();
        clockFaceView.f2013w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2013w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
