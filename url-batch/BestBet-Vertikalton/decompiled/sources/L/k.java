package L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f698a;

    public k(A0.c cVar) {
        this.f698a = cVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f698a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        j p2 = this.f698a.p(i);
        if (p2 == null) {
            return null;
        }
        return p2.f696a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f698a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        j q2 = this.f698a.q(i);
        if (q2 == null) {
            return null;
        }
        return q2.f696a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f698a.u(i, i2, bundle);
    }
}
