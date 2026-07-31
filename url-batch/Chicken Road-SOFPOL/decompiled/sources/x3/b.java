package x3;

import android.graphics.Rect;
import java.util.Comparator;
import r3.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8627a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8628b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8629c;

    /* renamed from: d, reason: collision with root package name */
    public final p.b f8630d;

    public b(boolean z3, p.b bVar) {
        this.f8629c = z3;
        this.f8630d = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f8630d.getClass();
        Rect rect = this.f8627a;
        ((f) obj).f(rect);
        Rect rect2 = this.f8628b;
        ((f) obj2).f(rect2);
        int i = rect.top;
        int i8 = rect2.top;
        if (i < i8) {
            return -1;
        }
        if (i > i8) {
            return 1;
        }
        int i9 = rect.left;
        int i10 = rect2.left;
        boolean z3 = this.f8629c;
        if (i9 < i10) {
            return z3 ? 1 : -1;
        }
        if (i9 > i10) {
            return z3 ? -1 : 1;
        }
        int i11 = rect.bottom;
        int i12 = rect2.bottom;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        int i13 = rect.right;
        int i14 = rect2.right;
        if (i13 < i14) {
            return z3 ? 1 : -1;
        }
        if (i13 > i14) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
