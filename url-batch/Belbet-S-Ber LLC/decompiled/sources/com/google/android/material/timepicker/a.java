package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends n0.b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1261e;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.d = i;
        this.f1261e = viewGroup;
    }

    @Override // n0.b
    public final void d(View view, o0.g gVar) {
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
                this.f2757a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                gVar.j(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) this.f1261e).h.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f2882a;
                this.f2757a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) this.f1261e).C.get(intValue - 1));
                }
                gVar.i(o0.f.a(view.isSelected(), 0, 1, intValue, 1));
                accessibilityNodeInfo2.setClickable(true);
                gVar.b(o0.c.f2870e);
                break;
        }
    }

    @Override // n0.b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f1261e;
                if (i != 16) {
                    break;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(clockFaceView.f1246z);
                    float centerX = clockFaceView.f1246z.centerX();
                    float centerY = clockFaceView.f1246z.centerY();
                    clockFaceView.f1245y.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockFaceView.f1245y.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
