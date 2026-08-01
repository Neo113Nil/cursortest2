package q0;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import g2.f;
import java.util.Comparator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3104a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3105b = new Rect();
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3106d;

    public c(boolean z3, f fVar) {
        this.c = z3;
        this.f3106d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3106d.getClass();
        AccessibilityNodeInfo accessibilityNodeInfo = ((l0.e) obj).f2855a;
        Rect rect = this.f3104a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((l0.e) obj2).f2855a;
        Rect rect2 = this.f3105b;
        accessibilityNodeInfo2.getBoundsInScreen(rect2);
        int i4 = rect.top;
        int i5 = rect2.top;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z3 = this.c;
        if (i6 < i7) {
            return z3 ? 1 : -1;
        }
        if (i6 > i7) {
            return z3 ? -1 : 1;
        }
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        if (i8 < i9) {
            return -1;
        }
        if (i8 > i9) {
            return 1;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if (i10 < i11) {
            return z3 ? 1 : -1;
        }
        if (i10 > i11) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
