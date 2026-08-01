package l0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final a2.e f2857a;

    public f(a2.e eVar) {
        this.f2857a = eVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f2857a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        e w3 = this.f2857a.w(i4);
        if (w3 == null) {
            return null;
        }
        return w3.f2855a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i4) {
        this.f2857a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        e x3 = this.f2857a.x(i4);
        if (x3 == null) {
            return null;
        }
        return x3.f2855a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i5, Bundle bundle) {
        return this.f2857a.z(i4, i5, bundle);
    }
}
