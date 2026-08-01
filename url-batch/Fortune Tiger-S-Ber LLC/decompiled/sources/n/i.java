package n;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2933a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2934b = new Object();

    public static final int a(g gVar, Object obj, int i4) {
        int i5 = gVar.h;
        if (i5 == 0) {
            return -1;
        }
        try {
            int a4 = o.a.a(i5, i4, gVar.f2930f);
            if (a4 < 0 || u2.c.a(obj, gVar.g[a4])) {
                return a4;
            }
            int i6 = a4 + 1;
            while (i6 < i5 && gVar.f2930f[i6] == i4) {
                if (u2.c.a(obj, gVar.g[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a4 - 1; i7 >= 0 && gVar.f2930f[i7] == i4; i7--) {
                if (u2.c.a(obj, gVar.g[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
