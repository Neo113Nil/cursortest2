package N2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2966e;

    /* renamed from: d, reason: collision with root package name */
    public final C0153i f2967d;

    static {
        String str = File.separator;
        Z1.i.e(str, "separator");
        f2966e = str;
    }

    public v(C0153i c0153i) {
        Z1.i.f(c0153i, "bytes");
        this.f2967d = c0153i;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a3 = O2.c.a(this);
        C0153i c0153i = this.f2967d;
        if (a3 == -1) {
            a3 = 0;
        } else if (a3 < c0153i.b() && c0153i.g(a3) == 92) {
            a3++;
        }
        int b2 = c0153i.b();
        int i3 = a3;
        while (a3 < b2) {
            if (c0153i.g(a3) == 47 || c0153i.g(a3) == 92) {
                arrayList.add(c0153i.l(i3, a3));
                i3 = a3 + 1;
            }
            a3++;
        }
        if (i3 < c0153i.b()) {
            arrayList.add(c0153i.l(i3, c0153i.b()));
        }
        return arrayList;
    }

    public final String b() {
        C0153i c0153i = O2.c.f2992a;
        C0153i c0153i2 = O2.c.f2992a;
        C0153i c0153i3 = this.f2967d;
        int i3 = C0153i.i(c0153i3, c0153i2);
        if (i3 == -1) {
            i3 = C0153i.i(c0153i3, O2.c.f2993b);
        }
        if (i3 != -1) {
            c0153i3 = C0153i.m(c0153i3, i3 + 1, 0, 2);
        } else if (h() != null && c0153i3.b() == 2) {
            c0153i3 = C0153i.f2930g;
        }
        return c0153i3.o();
    }

    public final v c() {
        C0153i c0153i = O2.c.f2995d;
        C0153i c0153i2 = this.f2967d;
        if (Z1.i.a(c0153i2, c0153i)) {
            return null;
        }
        C0153i c0153i3 = O2.c.f2992a;
        if (Z1.i.a(c0153i2, c0153i3)) {
            return null;
        }
        C0153i c0153i4 = O2.c.f2993b;
        if (Z1.i.a(c0153i2, c0153i4)) {
            return null;
        }
        C0153i c0153i5 = O2.c.f2996e;
        c0153i2.getClass();
        Z1.i.f(c0153i5, "suffix");
        int b2 = c0153i2.b();
        byte[] bArr = c0153i5.f2931d;
        if (c0153i2.j(b2 - bArr.length, c0153i5, bArr.length) && (c0153i2.b() == 2 || c0153i2.j(c0153i2.b() - 3, c0153i3, 1) || c0153i2.j(c0153i2.b() - 3, c0153i4, 1))) {
            return null;
        }
        int i3 = C0153i.i(c0153i2, c0153i3);
        if (i3 == -1) {
            i3 = C0153i.i(c0153i2, c0153i4);
        }
        if (i3 == 2 && h() != null) {
            if (c0153i2.b() == 3) {
                return null;
            }
            return new v(C0153i.m(c0153i2, 0, 3, 1));
        }
        if (i3 == 1) {
            Z1.i.f(c0153i4, "prefix");
            if (c0153i2.j(0, c0153i4, c0153i4.b())) {
                return null;
            }
        }
        if (i3 != -1 || h() == null) {
            return i3 == -1 ? new v(c0153i) : i3 == 0 ? new v(C0153i.m(c0153i2, 0, 1, 1)) : new v(C0153i.m(c0153i2, 0, i3, 1));
        }
        if (c0153i2.b() == 2) {
            return null;
        }
        return new v(C0153i.m(c0153i2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        Z1.i.f(vVar, "other");
        return this.f2967d.compareTo(vVar.f2967d);
    }

    public final v d(v vVar) {
        Z1.i.f(vVar, "other");
        int a3 = O2.c.a(this);
        C0153i c0153i = this.f2967d;
        v vVar2 = a3 == -1 ? null : new v(c0153i.l(0, a3));
        int a4 = O2.c.a(vVar);
        C0153i c0153i2 = vVar.f2967d;
        if (!Z1.i.a(vVar2, a4 != -1 ? new v(c0153i2.l(0, a4)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + vVar).toString());
        }
        ArrayList a5 = a();
        ArrayList a6 = vVar.a();
        int min = Math.min(a5.size(), a6.size());
        int i3 = 0;
        while (i3 < min && Z1.i.a(a5.get(i3), a6.get(i3))) {
            i3++;
        }
        if (i3 == min && c0153i.b() == c0153i2.b()) {
            return F0.a.l(".", false);
        }
        if (a6.subList(i3, a6.size()).indexOf(O2.c.f2996e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + vVar).toString());
        }
        C0150f c0150f = new C0150f();
        C0153i c3 = O2.c.c(vVar);
        if (c3 == null && (c3 = O2.c.c(this)) == null) {
            c3 = O2.c.f(f2966e);
        }
        int size = a6.size();
        for (int i4 = i3; i4 < size; i4++) {
            c0150f.L(O2.c.f2996e);
            c0150f.L(c3);
        }
        int size2 = a5.size();
        while (i3 < size2) {
            c0150f.L((C0153i) a5.get(i3));
            c0150f.L(c3);
            i3++;
        }
        return O2.c.d(c0150f, false);
    }

    public final v e(String str) {
        Z1.i.f(str, "child");
        C0150f c0150f = new C0150f();
        c0150f.U(str);
        return O2.c.b(this, O2.c.d(c0150f, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && Z1.i.a(((v) obj).f2967d, this.f2967d);
    }

    public final File f() {
        return new File(this.f2967d.o());
    }

    public final Path g() {
        Path path;
        path = Paths.get(this.f2967d.o(), new String[0]);
        Z1.i.e(path, "get(...)");
        return path;
    }

    public final Character h() {
        C0153i c0153i = O2.c.f2992a;
        C0153i c0153i2 = this.f2967d;
        if (C0153i.e(c0153i2, c0153i) != -1 || c0153i2.b() < 2 || c0153i2.g(1) != 58) {
            return null;
        }
        char g3 = (char) c0153i2.g(0);
        if (('a' > g3 || g3 >= '{') && ('A' > g3 || g3 >= '[')) {
            return null;
        }
        return Character.valueOf(g3);
    }

    public final int hashCode() {
        return this.f2967d.hashCode();
    }

    public final String toString() {
        return this.f2967d.o();
    }
}
