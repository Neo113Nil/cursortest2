package P;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import g1.C4524d;
import java.util.List;

/* loaded from: classes.dex */
public class l extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C4524d f2677a;

    public l(C4524d c4524d) {
        this.f2677a = c4524d;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        k C7 = this.f2677a.C(i);
        if (C7 == null) {
            return null;
        }
        return C7.f2675a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2677a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        k D8 = this.f2677a.D(i);
        if (D8 == null) {
            return null;
        }
        return D8.f2675a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i4, Bundle bundle) {
        return this.f2677a.G(i, i4, bundle);
    }
}
