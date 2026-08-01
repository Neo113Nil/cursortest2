package q;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3112a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3113b = new Object();

    public static final int a(g gVar, Object obj, int i) {
        int i4 = gVar.h;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a5 = r.a.a(i4, i, gVar.f3108f);
            if (a5 < 0 || i3.d.a(obj, gVar.f3109g[a5])) {
                return a5;
            }
            int i5 = a5 + 1;
            while (i5 < i4 && gVar.f3108f[i5] == i) {
                if (i3.d.a(obj, gVar.f3109g[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a5 - 1; i6 >= 0 && gVar.f3108f[i6] == i; i6--) {
                if (i3.d.a(obj, gVar.f3109g[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
