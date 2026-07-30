package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u3 extends c1 {
    public final /* synthetic */ d4 h;
    public final /* synthetic */ jd0 i;
    public final /* synthetic */ d4 j;

    public u3(d4 d4Var, jd0 jd0Var, d4 d4Var2) {
        this.h = d4Var;
        this.i = jd0Var;
        this.j = d4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().g) goto L19;
     */
    @Override // defpackage.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, o1 o1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = o1Var.a;
        this.d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        d4 d4Var = this.h;
        k4 k4Var = d4Var.C;
        if (k4Var.o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        jd0 jd0Var = this.i;
        jd0 s = jd0Var.s();
        while (true) {
            if (s == null) {
                s = null;
                break;
            } else if (s.J.g(8)) {
                break;
            } else {
                s = s.s();
            }
        }
        Integer valueOf = s != null ? Integer.valueOf(s.e) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        o1Var.b = intValue;
        d4 d4Var2 = this.j;
        accessibilityNodeInfo.setParent(d4Var2, intValue);
        int i = jd0Var.e;
        int d = k4Var.G.d(i);
        if (d != -1) {
            c7 M = gb0.M(d4Var.getAndroidViewsHandler$ui(), d);
            if (M != null) {
                accessibilityNodeInfo.setTraversalBefore(M);
            } else {
                accessibilityNodeInfo.setTraversalBefore(d4Var2, d);
            }
            d4.f(d4Var, i, accessibilityNodeInfo, k4Var.I);
        }
        int d2 = k4Var.H.d(i);
        if (d2 != -1) {
            c7 M2 = gb0.M(d4Var.getAndroidViewsHandler$ui(), d2);
            if (M2 != null) {
                accessibilityNodeInfo.setTraversalAfter(M2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(d4Var2, d2);
            }
            d4.f(d4Var, i, accessibilityNodeInfo, k4Var.J);
        }
    }
}
