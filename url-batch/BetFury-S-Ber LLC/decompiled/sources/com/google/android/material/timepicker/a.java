package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.trembin.nirefon.betfury.R;
import defpackage.a0;
import defpackage.g0;
import defpackage.m0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a extends a0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.d = i;
        this.e = viewGroup;
    }

    @Override // defpackage.a0
    public final void d(View view, m0 m0Var) {
        int i = this.d;
        ViewGroup viewGroup = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = m0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                m0Var.i(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) viewGroup).h.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = m0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).C.get(intValue - 1));
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
                accessibilityNodeInfo2.setClickable(true);
                m0Var.b(g0.e);
                break;
        }
    }

    @Override // defpackage.a0
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.e;
                ClockHandView clockHandView = clockFaceView.y;
                Rect rect = clockFaceView.z;
                if (i != 16) {
                    break;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(rect);
                    float centerX = rect.centerX();
                    float centerY = rect.centerY();
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
