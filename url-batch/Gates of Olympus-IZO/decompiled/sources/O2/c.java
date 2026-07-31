package O2;

import H2.AbstractC0080b;
import M1.l;
import M1.m;
import N2.C0150f;
import N2.C0153i;
import N2.v;
import Z1.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0153i f2992a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0153i f2993b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0153i f2994c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0153i f2995d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0153i f2996e;

    static {
        C0153i c0153i = C0153i.f2930g;
        f2992a = F0.a.k("/");
        f2993b = F0.a.k("\\");
        f2994c = F0.a.k("/\\");
        f2995d = F0.a.k(".");
        f2996e = F0.a.k("..");
    }

    public static final int a(v vVar) {
        if (vVar.f2967d.b() == 0) {
            return -1;
        }
        C0153i c0153i = vVar.f2967d;
        if (c0153i.g(0) != 47) {
            if (c0153i.g(0) != 92) {
                if (c0153i.b() <= 2 || c0153i.g(1) != 58 || c0153i.g(2) != 92) {
                    return -1;
                }
                char g3 = (char) c0153i.g(0);
                return (('a' > g3 || g3 >= '{') && ('A' > g3 || g3 >= '[')) ? -1 : 3;
            }
            if (c0153i.b() > 2 && c0153i.g(1) == 92) {
                C0153i c0153i2 = f2993b;
                i.f(c0153i2, "other");
                int d3 = c0153i.d(2, c0153i2.f2931d);
                return d3 == -1 ? c0153i.b() : d3;
            }
        }
        return 1;
    }

    public static final v b(v vVar, v vVar2, boolean z3) {
        i.f(vVar, "<this>");
        i.f(vVar2, "child");
        if (a(vVar2) != -1 || vVar2.h() != null) {
            return vVar2;
        }
        C0153i c3 = c(vVar);
        if (c3 == null && (c3 = c(vVar2)) == null) {
            c3 = f(v.f2966e);
        }
        C0150f c0150f = new C0150f();
        c0150f.L(vVar.f2967d);
        if (c0150f.f2929e > 0) {
            c0150f.L(c3);
        }
        c0150f.L(vVar2.f2967d);
        return d(c0150f, z3);
    }

    public static final C0153i c(v vVar) {
        C0153i c0153i = vVar.f2967d;
        C0153i c0153i2 = f2992a;
        if (C0153i.e(c0153i, c0153i2) != -1) {
            return c0153i2;
        }
        C0153i c0153i3 = f2993b;
        if (C0153i.e(vVar.f2967d, c0153i3) != -1) {
            return c0153i3;
        }
        return null;
    }

    public static final v d(C0150f c0150f, boolean z3) {
        C0153i c0153i;
        C0153i c0153i2;
        char b2;
        C0153i c0153i3;
        C0153i m3;
        C0150f c0150f2 = new C0150f();
        C0153i c0153i4 = null;
        int i3 = 0;
        while (true) {
            if (!c0150f.h(f2992a)) {
                c0153i = f2993b;
                if (!c0150f.h(c0153i)) {
                    break;
                }
            }
            byte j3 = c0150f.j();
            if (c0153i4 == null) {
                c0153i4 = e(j3);
            }
            i3++;
        }
        boolean z4 = i3 >= 2 && i.a(c0153i4, c0153i);
        C0153i c0153i5 = f2994c;
        if (z4) {
            i.c(c0153i4);
            c0150f2.L(c0153i4);
            c0150f2.L(c0153i4);
        } else if (i3 > 0) {
            i.c(c0153i4);
            c0150f2.L(c0153i4);
        } else {
            long e3 = c0150f.e(c0153i5);
            if (c0153i4 == null) {
                c0153i4 = e3 == -1 ? f(v.f2966e) : e(c0150f.b(e3));
            }
            if (i.a(c0153i4, c0153i)) {
                c0153i2 = c0153i4;
                if (c0150f.f2929e >= 2 && c0150f.b(1L) == 58 && (('a' <= (b2 = (char) c0150f.b(0L)) && b2 < '{') || ('A' <= b2 && b2 < '['))) {
                    if (e3 == 2) {
                        c0150f2.g(c0150f, 3L);
                    } else {
                        c0150f2.g(c0150f, 2L);
                    }
                }
            } else {
                c0153i2 = c0153i4;
            }
            c0153i4 = c0153i2;
        }
        boolean z5 = c0150f2.f2929e > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean a3 = c0150f.a();
            c0153i3 = f2995d;
            if (a3) {
                break;
            }
            long e4 = c0150f.e(c0153i5);
            if (e4 == -1) {
                m3 = c0150f.m(c0150f.f2929e);
            } else {
                m3 = c0150f.m(e4);
                c0150f.j();
            }
            C0153i c0153i6 = f2996e;
            if (i.a(m3, c0153i6)) {
                if (!z5 || !arrayList.isEmpty()) {
                    if (!z3 || (!z5 && (arrayList.isEmpty() || i.a(l.s0(arrayList), c0153i6)))) {
                        arrayList.add(m3);
                    } else if ((!z4 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(m.b0(arrayList));
                    }
                }
            } else if (!i.a(m3, c0153i3) && !i.a(m3, C0153i.f2930g)) {
                arrayList.add(m3);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                c0150f2.L(c0153i4);
            }
            c0150f2.L((C0153i) arrayList.get(i4));
        }
        if (c0150f2.f2929e == 0) {
            c0150f2.L(c0153i3);
        }
        return new v(c0150f2.m(c0150f2.f2929e));
    }

    public static final C0153i e(byte b2) {
        if (b2 == 47) {
            return f2992a;
        }
        if (b2 == 92) {
            return f2993b;
        }
        throw new IllegalArgumentException(AbstractC0080b.h("not a directory separator: ", b2));
    }

    public static final C0153i f(String str) {
        if (i.a(str, "/")) {
            return f2992a;
        }
        if (i.a(str, "\\")) {
            return f2993b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
