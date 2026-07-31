package r3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class g extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final q3.k f6560a;

    public g(q3.k kVar) {
        this.f6560a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        f f6 = this.f6560a.f(i);
        if (f6 == null) {
            return null;
        }
        return f6.f6557a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f6560a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        f g3 = this.f6560a.g(i);
        if (g3 == null) {
            return null;
        }
        return g3.f6557a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i8, Bundle bundle) {
        return this.f6560a.p(i, i8, bundle);
    }
}
