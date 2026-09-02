package t0;

import android.graphics.Rect;
import java.util.Comparator;
import l2.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3284a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3285b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3286c;
    public final f d;

    public c(boolean z3, f fVar) {
        this.f3286c = z3;
        this.d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.f3284a;
        ((o0.e) obj).f(rect);
        Rect rect2 = this.f3285b;
        ((o0.e) obj2).f(rect2);
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
        boolean z3 = this.f3286c;
        if (i5 < i6) {
            return z3 ? 1 : -1;
        }
        if (i5 > i6) {
            return z3 ? -1 : 1;
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
            return z3 ? 1 : -1;
        }
        if (i9 > i10) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
