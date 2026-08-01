package S;

import L.j;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f750a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f751b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f752c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.e f753d;

    public c(boolean z2, H0.e eVar) {
        this.f752c = z2;
        this.f753d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f753d.getClass();
        Rect rect = this.f750a;
        ((j) obj).f(rect);
        Rect rect2 = this.f751b;
        ((j) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z2 = this.f752c;
        if (i3 < i4) {
            return z2 ? 1 : -1;
        }
        if (i3 > i4) {
            return z2 ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z2 ? 1 : -1;
        }
        if (i7 > i8) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
