package d2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends o3.b {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f3482r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c2.g0 f3483s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f3484t;

    public n(v vVar, c2.g0 g0Var, v vVar2) {
        this.f3482r = vVar;
        this.f3483s = g0Var;
        this.f3484t = vVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().f4985f) goto L19;
     */
    @Override // o3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, p3.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f7665a;
        this.f7365d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        v vVar = this.f3482r;
        b0 b0Var = vVar.M;
        if (b0Var.p()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        c2.g0 g0Var = this.f3483s;
        c2.g0 s3 = g0Var.s();
        while (true) {
            if (s3 == null) {
                s3 = null;
                break;
            } else if (s3.S.d(8)) {
                break;
            } else {
                s3 = s3.s();
            }
        }
        Integer valueOf = s3 != null ? Integer.valueOf(s3.f1550e) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        fVar.f7666b = intValue;
        v vVar2 = this.f3484t;
        accessibilityNodeInfo.setParent(vVar2, intValue);
        int i3 = g0Var.f1550e;
        int d10 = b0Var.M.d(i3);
        if (d10 != -1) {
            a3.n s10 = h0.s(vVar.getAndroidViewsHandler$ui(), d10);
            if (s10 != null) {
                accessibilityNodeInfo.setTraversalBefore(s10);
            } else {
                accessibilityNodeInfo.setTraversalBefore(vVar2, d10);
            }
            v.c(vVar, i3, accessibilityNodeInfo, b0Var.O);
        }
        int d11 = b0Var.N.d(i3);
        if (d11 != -1) {
            a3.n s11 = h0.s(vVar.getAndroidViewsHandler$ui(), d11);
            if (s11 != null) {
                accessibilityNodeInfo.setTraversalAfter(s11);
            } else {
                accessibilityNodeInfo.setTraversalAfter(vVar2, d11);
            }
            v.c(vVar, i3, accessibilityNodeInfo, b0Var.P);
        }
    }
}
