package o0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final a0.a f2863a;

    public f(a0.a aVar) {
        this.f2863a = aVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        e y3 = this.f2863a.y(i);
        if (y3 == null) {
            return null;
        }
        return y3.f2861a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2863a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        e z3 = this.f2863a.z(i);
        if (z3 == null) {
            return null;
        }
        return z3.f2861a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i4, Bundle bundle) {
        return this.f2863a.B(i, i4, bundle);
    }
}
