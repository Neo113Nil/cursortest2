package U2;

import A.k;
import A1.i;
import S1.l;
import S1.m;
import T2.C0231f;
import T2.C0234i;
import T2.v;
import f2.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0234i f4517a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0234i f4518b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0234i f4519c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0234i f4520d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0234i f4521e;

    static {
        C0234i c0234i = C0234i.f4410g;
        f4517a = i.k("/");
        f4518b = i.k("\\");
        f4519c = i.k("/\\");
        f4520d = i.k(".");
        f4521e = i.k("..");
    }

    public static final int a(v vVar) {
        if (vVar.f4447d.b() == 0) {
            return -1;
        }
        C0234i c0234i = vVar.f4447d;
        if (c0234i.g(0) != 47) {
            if (c0234i.g(0) != 92) {
                if (c0234i.b() <= 2 || c0234i.g(1) != 58 || c0234i.g(2) != 92) {
                    return -1;
                }
                char g3 = (char) c0234i.g(0);
                return (('a' > g3 || g3 >= '{') && ('A' > g3 || g3 >= '[')) ? -1 : 3;
            }
            if (c0234i.b() > 2 && c0234i.g(1) == 92) {
                C0234i c0234i2 = f4518b;
                j.f(c0234i2, "other");
                int d3 = c0234i.d(2, c0234i2.f4411d);
                return d3 == -1 ? c0234i.b() : d3;
            }
        }
        return 1;
    }

    public static final v b(v vVar, v vVar2, boolean z3) {
        j.f(vVar, "<this>");
        j.f(vVar2, "child");
        if (a(vVar2) != -1 || vVar2.h() != null) {
            return vVar2;
        }
        C0234i c2 = c(vVar);
        if (c2 == null && (c2 = c(vVar2)) == null) {
            c2 = f(v.f4446e);
        }
        C0231f c0231f = new C0231f();
        c0231f.y(vVar.f4447d);
        if (c0231f.f4409e > 0) {
            c0231f.y(c2);
        }
        c0231f.y(vVar2.f4447d);
        return d(c0231f, z3);
    }

    public static final C0234i c(v vVar) {
        C0234i c0234i = vVar.f4447d;
        C0234i c0234i2 = f4517a;
        if (C0234i.e(c0234i, c0234i2) != -1) {
            return c0234i2;
        }
        C0234i c0234i3 = f4518b;
        if (C0234i.e(vVar.f4447d, c0234i3) != -1) {
            return c0234i3;
        }
        return null;
    }

    public static final v d(C0231f c0231f, boolean z3) {
        C0234i c0234i;
        C0234i c0234i2;
        char b3;
        C0234i c0234i3;
        C0234i n3;
        C0231f c0231f2 = new C0231f();
        C0234i c0234i4 = null;
        int i3 = 0;
        while (true) {
            if (!c0231f.e(f4517a)) {
                c0234i = f4518b;
                if (!c0231f.e(c0234i)) {
                    break;
                }
            }
            byte h3 = c0231f.h();
            if (c0234i4 == null) {
                c0234i4 = e(h3);
            }
            i3++;
        }
        boolean z4 = i3 >= 2 && j.a(c0234i4, c0234i);
        C0234i c0234i5 = f4519c;
        if (z4) {
            j.c(c0234i4);
            c0231f2.y(c0234i4);
            c0231f2.y(c0234i4);
        } else if (i3 > 0) {
            j.c(c0234i4);
            c0231f2.y(c0234i4);
        } else {
            long d3 = c0231f.d(c0234i5);
            if (c0234i4 == null) {
                c0234i4 = d3 == -1 ? f(v.f4446e) : e(c0231f.b(d3));
            }
            if (j.a(c0234i4, c0234i)) {
                c0234i2 = c0234i4;
                if (c0231f.f4409e >= 2 && c0231f.b(1L) == 58 && (('a' <= (b3 = (char) c0231f.b(0L)) && b3 < '{') || ('A' <= b3 && b3 < '['))) {
                    if (d3 == 2) {
                        c0231f2.p(c0231f, 3L);
                    } else {
                        c0231f2.p(c0231f, 2L);
                    }
                }
            } else {
                c0234i2 = c0234i4;
            }
            c0234i4 = c0234i2;
        }
        boolean z5 = c0231f2.f4409e > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean a3 = c0231f.a();
            c0234i3 = f4520d;
            if (a3) {
                break;
            }
            long d4 = c0231f.d(c0234i5);
            if (d4 == -1) {
                n3 = c0231f.n(c0231f.f4409e);
            } else {
                n3 = c0231f.n(d4);
                c0231f.h();
            }
            C0234i c0234i6 = f4521e;
            if (j.a(n3, c0234i6)) {
                if (!z5 || !arrayList.isEmpty()) {
                    if (!z3 || (!z5 && (arrayList.isEmpty() || j.a(l.Q0(arrayList), c0234i6)))) {
                        arrayList.add(n3);
                    } else if ((!z4 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(m.z0(arrayList));
                    }
                }
            } else if (!j.a(n3, c0234i3) && !j.a(n3, C0234i.f4410g)) {
                arrayList.add(n3);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                c0231f2.y(c0234i4);
            }
            c0231f2.y((C0234i) arrayList.get(i4));
        }
        if (c0231f2.f4409e == 0) {
            c0231f2.y(c0234i3);
        }
        return new v(c0231f2.n(c0231f2.f4409e));
    }

    public static final C0234i e(byte b3) {
        if (b3 == 47) {
            return f4517a;
        }
        if (b3 == 92) {
            return f4518b;
        }
        throw new IllegalArgumentException(k.h("not a directory separator: ", b3));
    }

    public static final C0234i f(String str) {
        if (j.a(str, "/")) {
            return f4517a;
        }
        if (j.a(str, "\\")) {
            return f4518b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
