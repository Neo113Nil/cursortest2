package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: com.facebook.ads.redexgen.X.gY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1348gY extends C0648Og {
    @Override // com.instagram.common.viewpoint.core.C0648Og
    public final View.AccessibilityDelegate A00(AbstractC0649Oh abstractC0649Oh) {
        return new C0646Oe(this, abstractC0649Oh);
    }

    @Override // com.instagram.common.viewpoint.core.C0648Og
    public final PU A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new PU(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C0648Og
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
