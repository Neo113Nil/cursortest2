package T2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f4446e;

    /* renamed from: d, reason: collision with root package name */
    public final C0234i f4447d;

    static {
        String str = File.separator;
        f2.j.e(str, "separator");
        f4446e = str;
    }

    public v(C0234i c0234i) {
        f2.j.f(c0234i, "bytes");
        this.f4447d = c0234i;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a3 = U2.c.a(this);
        C0234i c0234i = this.f4447d;
        if (a3 == -1) {
            a3 = 0;
        } else if (a3 < c0234i.b() && c0234i.g(a3) == 92) {
            a3++;
        }
        int b3 = c0234i.b();
        int i3 = a3;
        while (a3 < b3) {
            if (c0234i.g(a3) == 47 || c0234i.g(a3) == 92) {
                arrayList.add(c0234i.l(i3, a3));
                i3 = a3 + 1;
            }
            a3++;
        }
        if (i3 < c0234i.b()) {
            arrayList.add(c0234i.l(i3, c0234i.b()));
        }
        return arrayList;
    }

    public final String b() {
        C0234i c0234i = U2.c.f4517a;
        C0234i c0234i2 = U2.c.f4517a;
        C0234i c0234i3 = this.f4447d;
        int i3 = C0234i.i(c0234i3, c0234i2);
        if (i3 == -1) {
            i3 = C0234i.i(c0234i3, U2.c.f4518b);
        }
        if (i3 != -1) {
            c0234i3 = C0234i.m(c0234i3, i3 + 1, 0, 2);
        } else if (h() != null && c0234i3.b() == 2) {
            c0234i3 = C0234i.f4410g;
        }
        return c0234i3.o();
    }

    public final v c() {
        C0234i c0234i = U2.c.f4520d;
        C0234i c0234i2 = this.f4447d;
        if (f2.j.a(c0234i2, c0234i)) {
            return null;
        }
        C0234i c0234i3 = U2.c.f4517a;
        if (f2.j.a(c0234i2, c0234i3)) {
            return null;
        }
        C0234i c0234i4 = U2.c.f4518b;
        if (f2.j.a(c0234i2, c0234i4)) {
            return null;
        }
        C0234i c0234i5 = U2.c.f4521e;
        c0234i2.getClass();
        f2.j.f(c0234i5, "suffix");
        int b3 = c0234i2.b();
        byte[] bArr = c0234i5.f4411d;
        if (c0234i2.j(b3 - bArr.length, c0234i5, bArr.length) && (c0234i2.b() == 2 || c0234i2.j(c0234i2.b() - 3, c0234i3, 1) || c0234i2.j(c0234i2.b() - 3, c0234i4, 1))) {
            return null;
        }
        int i3 = C0234i.i(c0234i2, c0234i3);
        if (i3 == -1) {
            i3 = C0234i.i(c0234i2, c0234i4);
        }
        if (i3 == 2 && h() != null) {
            if (c0234i2.b() == 3) {
                return null;
            }
            return new v(C0234i.m(c0234i2, 0, 3, 1));
        }
        if (i3 == 1) {
            f2.j.f(c0234i4, "prefix");
            if (c0234i2.j(0, c0234i4, c0234i4.b())) {
                return null;
            }
        }
        if (i3 != -1 || h() == null) {
            return i3 == -1 ? new v(c0234i) : i3 == 0 ? new v(C0234i.m(c0234i2, 0, 1, 1)) : new v(C0234i.m(c0234i2, 0, i3, 1));
        }
        if (c0234i2.b() == 2) {
            return null;
        }
        return new v(C0234i.m(c0234i2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        f2.j.f(vVar, "other");
        return this.f4447d.compareTo(vVar.f4447d);
    }

    public final v d(v vVar) {
        f2.j.f(vVar, "other");
        int a3 = U2.c.a(this);
        C0234i c0234i = this.f4447d;
        v vVar2 = a3 == -1 ? null : new v(c0234i.l(0, a3));
        int a4 = U2.c.a(vVar);
        C0234i c0234i2 = vVar.f4447d;
        if (!f2.j.a(vVar2, a4 != -1 ? new v(c0234i2.l(0, a4)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + vVar).toString());
        }
        ArrayList a5 = a();
        ArrayList a6 = vVar.a();
        int min = Math.min(a5.size(), a6.size());
        int i3 = 0;
        while (i3 < min && f2.j.a(a5.get(i3), a6.get(i3))) {
            i3++;
        }
        if (i3 == min && c0234i.b() == c0234i2.b()) {
            return A1.i.l(".", false);
        }
        if (a6.subList(i3, a6.size()).indexOf(U2.c.f4521e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + vVar).toString());
        }
        C0231f c0231f = new C0231f();
        C0234i c2 = U2.c.c(vVar);
        if (c2 == null && (c2 = U2.c.c(this)) == null) {
            c2 = U2.c.f(f4446e);
        }
        int size = a6.size();
        for (int i4 = i3; i4 < size; i4++) {
            c0231f.y(U2.c.f4521e);
            c0231f.y(c2);
        }
        int size2 = a5.size();
        while (i3 < size2) {
            c0231f.y((C0234i) a5.get(i3));
            c0231f.y(c2);
            i3++;
        }
        return U2.c.d(c0231f, false);
    }

    public final v e(String str) {
        f2.j.f(str, "child");
        C0231f c0231f = new C0231f();
        c0231f.I(str);
        return U2.c.b(this, U2.c.d(c0231f, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && f2.j.a(((v) obj).f4447d, this.f4447d);
    }

    public final File f() {
        return new File(this.f4447d.o());
    }

    public final Path g() {
        Path path;
        path = Paths.get(this.f4447d.o(), new String[0]);
        f2.j.e(path, "get(...)");
        return path;
    }

    public final Character h() {
        C0234i c0234i = U2.c.f4517a;
        C0234i c0234i2 = this.f4447d;
        if (C0234i.e(c0234i2, c0234i) != -1 || c0234i2.b() < 2 || c0234i2.g(1) != 58) {
            return null;
        }
        char g3 = (char) c0234i2.g(0);
        if (('a' > g3 || g3 >= '{') && ('A' > g3 || g3 >= '[')) {
            return null;
        }
        return Character.valueOf(g3);
    }

    public final int hashCode() {
        return this.f4447d.hashCode();
    }

    public final String toString() {
        return this.f4447d.o();
    }
}
