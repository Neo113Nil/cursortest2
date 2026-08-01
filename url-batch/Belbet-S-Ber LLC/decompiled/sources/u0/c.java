package u0;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Comparator;
import o0.g;
import o2.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3552a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3553b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3554c;
    public final f d;

    public c(boolean z4, f fVar) {
        this.f3554c = z4;
        this.d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        AccessibilityNodeInfo accessibilityNodeInfo = ((g) obj).f2882a;
        Rect rect = this.f3552a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((g) obj2).f2882a;
        Rect rect2 = this.f3553b;
        accessibilityNodeInfo2.getBoundsInScreen(rect2);
        int i = rect.top;
        int i4 = rect2.top;
        if (i < i4) {
            return -1;
        }
        if (i > i4) {
            return 1;
        }
        int i5 = rect.left;
        int i6 = rect2.left;
        boolean z4 = this.f3554c;
        if (i5 < i6) {
            return z4 ? 1 : -1;
        }
        if (i5 > i6) {
            return z4 ? -1 : 1;
        }
        int i7 = rect.bottom;
        int i8 = rect2.bottom;
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        int i9 = rect.right;
        int i10 = rect2.right;
        if (i9 < i10) {
            return z4 ? 1 : -1;
        }
        if (i9 > i10) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
