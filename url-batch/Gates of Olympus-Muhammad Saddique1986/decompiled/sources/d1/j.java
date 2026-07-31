package d1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import u0.E;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        ((E) this.f5675a.f10467f).b(i3, new h(accessibilityNodeInfo), str, bundle);
    }
}
