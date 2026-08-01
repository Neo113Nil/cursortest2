package p3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final l.d f7668a;

    public g(l.d dVar) {
        this.f7668a = dVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        f n10 = this.f7668a.n(i3);
        if (n10 == null) {
            return null;
        }
        return n10.f7665a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f7668a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        f q3 = this.f7668a.q(i3);
        if (q3 == null) {
            return null;
        }
        return q3.f7665a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        return this.f7668a.x(i3, i10, bundle);
    }
}
