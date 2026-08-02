package com.squareup.util.android;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class Views$removeAccessibilityClickActionDelegate$1 extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        view.getClass();
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.setClickable(false);
    }
}
