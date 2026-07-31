package b1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import u0.C0959F;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        ((C0959F) this.f4320a.f485f).b(i3, new h(accessibilityNodeInfo), str, bundle);
    }
}
