package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends k0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1455e;

    public /* synthetic */ a(ViewGroup viewGroup, int i4) {
        this.f1454d = i4;
        this.f1455e = viewGroup;
    }

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        switch (this.f1454d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.h(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) this.f1455e).h.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) this.f1455e).C.get(intValue - 1));
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
                accessibilityNodeInfo2.setClickable(true);
                eVar.b(l0.d.f2847e);
                break;
        }
    }

    @Override // k0.b
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.f1454d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f1455e;
                if (i4 != 16) {
                    break;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(clockFaceView.f1439z);
                    float centerX = clockFaceView.f1439z.centerX();
                    float centerY = clockFaceView.f1439z.centerY();
                    clockFaceView.f1438y.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockFaceView.f1438y.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    break;
                }
        }
        return super.g(view, i4, bundle);
    }
}
