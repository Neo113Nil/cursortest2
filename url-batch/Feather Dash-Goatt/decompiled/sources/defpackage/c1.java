package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final View.AccessibilityDelegate g = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate d = g;
    public final b1 e = new b1(this);

    public s40 a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.d.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new s40(4, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, o1 o1Var) {
        this.d.onInitializeAccessibilityNodeInfo(view, o1Var.a);
    }
}
