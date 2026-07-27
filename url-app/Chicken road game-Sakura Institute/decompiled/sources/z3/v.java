package z3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f12037e;

    /* renamed from: d, reason: collision with root package name */
    public final C1451i f12038d;

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f12037e = separator;
    }

    public v(C1451i bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f12038d = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a4 = A3.c.a(this);
        C1451i c1451i = this.f12038d;
        if (a4 == -1) {
            a4 = 0;
        } else if (a4 < c1451i.c() && c1451i.n(a4) == 92) {
            a4++;
        }
        int c4 = c1451i.c();
        int i2 = a4;
        while (a4 < c4) {
            if (c1451i.n(a4) == 47 || c1451i.n(a4) == 92) {
                arrayList.add(c1451i.v(i2, a4));
                i2 = a4 + 1;
            }
            a4++;
        }
        if (i2 < c1451i.c()) {
            arrayList.add(c1451i.v(i2, c1451i.c()));
        }
        return arrayList;
    }

    public final String c() {
        C1451i c1451i = A3.c.f844a;
        C1451i c1451i2 = A3.c.f844a;
        C1451i c1451i3 = this.f12038d;
        int q2 = C1451i.q(c1451i3, c1451i2);
        if (q2 == -1) {
            q2 = C1451i.q(c1451i3, A3.c.f845b);
        }
        if (q2 != -1) {
            c1451i3 = C1451i.w(c1451i3, q2 + 1, 0, 2);
        } else if (o() != null && c1451i3.c() == 2) {
            c1451i3 = C1451i.f12000j;
        }
        return c1451i3.C();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v other = (v) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f12038d.compareTo(other.f12038d);
    }

    public final v e() {
        C1451i c1451i = A3.c.f847d;
        C1451i c1451i2 = this.f12038d;
        if (Intrinsics.a(c1451i2, c1451i)) {
            return null;
        }
        C1451i c1451i3 = A3.c.f844a;
        if (Intrinsics.a(c1451i2, c1451i3)) {
            return null;
        }
        C1451i prefix = A3.c.f845b;
        if (Intrinsics.a(c1451i2, prefix)) {
            return null;
        }
        C1451i suffix = A3.c.f848e;
        c1451i2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int c4 = c1451i2.c();
        byte[] bArr = suffix.f12001d;
        if (c1451i2.r(c4 - bArr.length, suffix, bArr.length) && (c1451i2.c() == 2 || c1451i2.r(c1451i2.c() - 3, c1451i3, 1) || c1451i2.r(c1451i2.c() - 3, prefix, 1))) {
            return null;
        }
        int q2 = C1451i.q(c1451i2, c1451i3);
        if (q2 == -1) {
            q2 = C1451i.q(c1451i2, prefix);
        }
        if (q2 == 2 && o() != null) {
            if (c1451i2.c() == 3) {
                return null;
            }
            return new v(C1451i.w(c1451i2, 0, 3, 1));
        }
        if (q2 == 1) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (c1451i2.r(0, prefix, prefix.c())) {
                return null;
            }
        }
        if (q2 != -1 || o() == null) {
            return q2 == -1 ? new v(c1451i) : q2 == 0 ? new v(C1451i.w(c1451i2, 0, 1, 1)) : new v(C1451i.w(c1451i2, 0, q2, 1));
        }
        if (c1451i2.c() == 2) {
            return null;
        }
        return new v(C1451i.w(c1451i2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && Intrinsics.a(((v) obj).f12038d, this.f12038d);
    }

    public final v h(v other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int a4 = A3.c.a(this);
        C1451i c1451i = this.f12038d;
        v vVar = a4 == -1 ? null : new v(c1451i.v(0, a4));
        other.getClass();
        int a5 = A3.c.a(other);
        C1451i c1451i2 = other.f12038d;
        if (!Intrinsics.a(vVar, a5 != -1 ? new v(c1451i2.v(0, a5)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList a6 = a();
        ArrayList a7 = other.a();
        int min = Math.min(a6.size(), a7.size());
        int i2 = 0;
        while (i2 < min && Intrinsics.a(a6.get(i2), a7.get(i2))) {
            i2++;
        }
        if (i2 == min && c1451i.c() == c1451i2.c()) {
            return E1.i.i(".", false);
        }
        if (a7.subList(i2, a7.size()).indexOf(A3.c.f848e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C1448f c1448f = new C1448f();
        C1451i c4 = A3.c.c(other);
        if (c4 == null && (c4 = A3.c.c(this)) == null) {
            c4 = A3.c.f(f12037e);
        }
        int size = a7.size();
        for (int i4 = i2; i4 < size; i4++) {
            c1448f.v(A3.c.f848e);
            c1448f.v(c4);
        }
        int size2 = a6.size();
        while (i2 < size2) {
            c1448f.v((C1451i) a6.get(i2));
            c1448f.v(c4);
            i2++;
        }
        return A3.c.d(c1448f, false);
    }

    public final int hashCode() {
        return this.f12038d.hashCode();
    }

    public final v j(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C1448f c1448f = new C1448f();
        c1448f.B(child);
        return A3.c.b(this, A3.c.d(c1448f, false), false);
    }

    public final File l() {
        return new File(this.f12038d.C());
    }

    public final Path n() {
        Path path = Paths.get(this.f12038d.C(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character o() {
        C1451i c1451i = A3.c.f844a;
        C1451i c1451i2 = this.f12038d;
        if (C1451i.j(c1451i2, c1451i) != -1 || c1451i2.c() < 2 || c1451i2.n(1) != 58) {
            return null;
        }
        char n2 = (char) c1451i2.n(0);
        if (('a' > n2 || n2 >= '{') && ('A' > n2 || n2 >= '[')) {
            return null;
        }
        return Character.valueOf(n2);
    }

    public final String toString() {
        return this.f12038d.C();
    }
}
