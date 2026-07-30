package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: com.facebook.ads.redexgen.X.gY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1354gY extends C0654Og {
    @Override // com.instagram.common.viewpoint.core.C0654Og
    public final View.AccessibilityDelegate A00(AbstractC0655Oh abstractC0655Oh) {
        return new C0652Oe(this, abstractC0655Oh);
    }

    @Override // com.instagram.common.viewpoint.core.C0654Og
    public final PU A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new PU(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C0654Og
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
