package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.awerser.monnit.betplay.R;
import defpackage.c0;
import defpackage.i0;
import defpackage.w;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a extends w {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                i0Var.h(((EditText) view).getText());
                CharSequence text = ((ChipTextInputComboView) viewGroup).h.getText();
                AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
                accessibilityNodeInfo.setHintText(text);
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = i0Var.a;
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).C.get(intValue - 1));
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
                accessibilityNodeInfo2.setClickable(true);
                i0Var.b(c0.e);
                break;
        }
    }

    @Override // defpackage.w
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.a) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.b;
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
        return super.performAccessibilityAction(view, i, bundle);
    }
}
