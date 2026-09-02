package q;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3032a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3033b = new Object();

    public static final int a(g gVar, Object obj, int i) {
        int i4 = gVar.f3028h;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a2 = r.a.a(i4, i, gVar.f3026f);
            if (a2 < 0 || f3.d.a(obj, gVar.f3027g[a2])) {
                return a2;
            }
            int i5 = a2 + 1;
            while (i5 < i4 && gVar.f3026f[i5] == i) {
                if (f3.d.a(obj, gVar.f3027g[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a2 - 1; i6 >= 0 && gVar.f3026f[i6] == i; i6--) {
                if (f3.d.a(obj, gVar.f3027g[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
