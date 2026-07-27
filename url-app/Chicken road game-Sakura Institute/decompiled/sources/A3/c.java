package A3;

import A.AbstractC0017m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1441y;
import z3.C1448f;
import z3.C1451i;
import z3.v;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1451i f844a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1451i f845b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1451i f846c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1451i f847d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1451i f848e;

    static {
        C1451i c1451i = C1451i.f12000j;
        f844a = H1.f.n("/");
        f845b = H1.f.n("\\");
        f846c = H1.f.n("/\\");
        f847d = H1.f.n(".");
        f848e = H1.f.n("..");
    }

    public static final int a(v vVar) {
        if (vVar.f12038d.c() == 0) {
            return -1;
        }
        C1451i c1451i = vVar.f12038d;
        if (c1451i.n(0) != 47) {
            if (c1451i.n(0) != 92) {
                if (c1451i.c() <= 2 || c1451i.n(1) != 58 || c1451i.n(2) != 92) {
                    return -1;
                }
                char n2 = (char) c1451i.n(0);
                return (('a' > n2 || n2 >= '{') && ('A' > n2 || n2 >= '[')) ? -1 : 3;
            }
            if (c1451i.c() > 2 && c1451i.n(1) == 92) {
                C1451i other = f845b;
                Intrinsics.checkNotNullParameter(other, "other");
                int h4 = c1451i.h(other.f12001d, 2);
                return h4 == -1 ? c1451i.c() : h4;
            }
        }
        return 1;
    }

    public static final v b(v vVar, v child, boolean z4) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1 || child.o() != null) {
            return child;
        }
        C1451i c4 = c(vVar);
        if (c4 == null && (c4 = c(child)) == null) {
            c4 = f(v.f12037e);
        }
        C1448f c1448f = new C1448f();
        c1448f.v(vVar.f12038d);
        if (c1448f.f11999e > 0) {
            c1448f.v(c4);
        }
        c1448f.v(child.f12038d);
        return d(c1448f, z4);
    }

    public static final C1451i c(v vVar) {
        C1451i c1451i = vVar.f12038d;
        C1451i c1451i2 = f844a;
        if (C1451i.j(c1451i, c1451i2) != -1) {
            return c1451i2;
        }
        C1451i c1451i3 = f845b;
        if (C1451i.j(vVar.f12038d, c1451i3) != -1) {
            return c1451i3;
        }
        return null;
    }

    public static final v d(C1448f c1448f, boolean z4) {
        C1451i c1451i;
        C1451i c1451i2;
        char b4;
        C1451i c1451i3;
        C1451i j4;
        Intrinsics.checkNotNullParameter(c1448f, "<this>");
        C1448f c1448f2 = new C1448f();
        C1451i c1451i4 = null;
        int i2 = 0;
        while (true) {
            if (!c1448f.f(f844a)) {
                c1451i = f845b;
                if (!c1448f.f(c1451i)) {
                    break;
                }
            }
            byte h4 = c1448f.h();
            if (c1451i4 == null) {
                c1451i4 = e(h4);
            }
            i2++;
        }
        boolean z5 = i2 >= 2 && Intrinsics.a(c1451i4, c1451i);
        C1451i c1451i5 = f846c;
        if (z5) {
            Intrinsics.c(c1451i4);
            c1448f2.v(c1451i4);
            c1448f2.v(c1451i4);
        } else if (i2 > 0) {
            Intrinsics.c(c1451i4);
            c1448f2.v(c1451i4);
        } else {
            long d4 = c1448f.d(c1451i5);
            if (c1451i4 == null) {
                c1451i4 = d4 == -1 ? f(v.f12037e) : e(c1448f.b(d4));
            }
            if (Intrinsics.a(c1451i4, c1451i)) {
                c1451i2 = c1451i4;
                if (c1448f.f11999e >= 2 && c1448f.b(1L) == 58 && (('a' <= (b4 = (char) c1448f.b(0L)) && b4 < '{') || ('A' <= b4 && b4 < '['))) {
                    if (d4 == 2) {
                        c1448f2.e(c1448f, 3L);
                    } else {
                        c1448f2.e(c1448f, 2L);
                    }
                }
            } else {
                c1451i2 = c1451i4;
            }
            c1451i4 = c1451i2;
        }
        boolean z6 = c1448f2.f11999e > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean a4 = c1448f.a();
            c1451i3 = f847d;
            if (a4) {
                break;
            }
            long d5 = c1448f.d(c1451i5);
            if (d5 == -1) {
                j4 = c1448f.j(c1448f.f11999e);
            } else {
                j4 = c1448f.j(d5);
                c1448f.h();
            }
            C1451i c1451i6 = f848e;
            if (Intrinsics.a(j4, c1451i6)) {
                if (!z6 || !arrayList.isEmpty()) {
                    if (!z4 || (!z6 && (arrayList.isEmpty() || Intrinsics.a(C1403G.x(arrayList), c1451i6)))) {
                        arrayList.add(j4);
                    } else if (!z5 || arrayList.size() != 1) {
                        Intrinsics.checkNotNullParameter(arrayList, "<this>");
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(C1441y.d(arrayList));
                        }
                    }
                }
            } else if (!Intrinsics.a(j4, c1451i3) && !Intrinsics.a(j4, C1451i.f12000j)) {
                arrayList.add(j4);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                c1448f2.v(c1451i4);
            }
            c1448f2.v((C1451i) arrayList.get(i4));
        }
        if (c1448f2.f11999e == 0) {
            c1448f2.v(c1451i3);
        }
        return new v(c1448f2.j(c1448f2.f11999e));
    }

    public static final C1451i e(byte b4) {
        if (b4 == 47) {
            return f844a;
        }
        if (b4 == 92) {
            return f845b;
        }
        throw new IllegalArgumentException(AbstractC0017m.g(b4, "not a directory separator: "));
    }

    public static final C1451i f(String str) {
        if (Intrinsics.a(str, "/")) {
            return f844a;
        }
        if (Intrinsics.a(str, "\\")) {
            return f845b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
