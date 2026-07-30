package f8;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f3645g;

    /* renamed from: f, reason: collision with root package name */
    public final i f3646f;

    static {
        String str = File.separator;
        r6.k.e(str, "separator");
        f3645g = str;
    }

    public w(i iVar) {
        r6.k.f(iVar, "bytes");
        this.f3646f = iVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a3 = g8.c.a(this);
        i iVar = this.f3646f;
        if (a3 == -1) {
            a3 = 0;
        } else if (a3 < iVar.e() && iVar.p(a3) == 92) {
            a3++;
        }
        int e9 = iVar.e();
        int i7 = a3;
        while (a3 < e9) {
            if (iVar.p(a3) == 47 || iVar.p(a3) == 92) {
                arrayList.add(iVar.z(i7, a3));
                i7 = a3 + 1;
            }
            a3++;
        }
        if (i7 < iVar.e()) {
            arrayList.add(iVar.z(i7, iVar.e()));
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        r6.k.f(wVar, "other");
        return this.f3646f.compareTo(wVar.f3646f);
    }

    public final String e() {
        i iVar = g8.c.f4538a;
        i iVar2 = this.f3646f;
        int w4 = i.w(iVar2, iVar);
        if (w4 == -1) {
            w4 = i.w(iVar2, g8.c.f4539b);
        }
        if (w4 != -1) {
            iVar2 = i.A(iVar2, w4 + 1, 0, 2);
        } else if (p() != null && iVar2.e() == 2) {
            iVar2 = i.f3600i;
        }
        return iVar2.C();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && r6.k.a(((w) obj).f3646f, this.f3646f);
    }

    public final w g() {
        i iVar = g8.c.f4541d;
        i iVar2 = this.f3646f;
        if (r6.k.a(iVar2, iVar)) {
            return null;
        }
        i iVar3 = g8.c.f4538a;
        if (r6.k.a(iVar2, iVar3)) {
            return null;
        }
        i iVar4 = g8.c.f4539b;
        if (r6.k.a(iVar2, iVar4)) {
            return null;
        }
        i iVar5 = g8.c.f4542e;
        iVar2.getClass();
        r6.k.f(iVar5, "suffix");
        int e9 = iVar2.e();
        byte[] bArr = iVar5.f3601f;
        if (iVar2.x(e9 - bArr.length, iVar5, bArr.length) && (iVar2.e() == 2 || iVar2.x(iVar2.e() - 3, iVar3, 1) || iVar2.x(iVar2.e() - 3, iVar4, 1))) {
            return null;
        }
        int w4 = i.w(iVar2, iVar3);
        if (w4 == -1) {
            w4 = i.w(iVar2, iVar4);
        }
        if (w4 == 2 && p() != null) {
            if (iVar2.e() == 3) {
                return null;
            }
            return new w(i.A(iVar2, 0, 3, 1));
        }
        if (w4 == 1) {
            r6.k.f(iVar4, "prefix");
            if (iVar2.x(0, iVar4, iVar4.e())) {
                return null;
            }
        }
        if (w4 != -1 || p() == null) {
            return w4 == -1 ? new w(iVar) : w4 == 0 ? new w(i.A(iVar2, 0, 1, 1)) : new w(i.A(iVar2, 0, w4, 1));
        }
        if (iVar2.e() == 2) {
            return null;
        }
        return new w(i.A(iVar2, 0, 2, 1));
    }

    public final w h(w wVar) {
        r6.k.f(wVar, "other");
        i iVar = wVar.f3646f;
        int a3 = g8.c.a(this);
        i iVar2 = this.f3646f;
        w wVar2 = a3 == -1 ? null : new w(iVar2.z(0, a3));
        int a9 = g8.c.a(wVar);
        if (!r6.k.a(wVar2, a9 != -1 ? new w(iVar.z(0, a9)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + wVar).toString());
        }
        ArrayList a10 = a();
        ArrayList a11 = wVar.a();
        int min = Math.min(a10.size(), a11.size());
        int i7 = 0;
        while (i7 < min && r6.k.a(a10.get(i7), a11.get(i7))) {
            i7++;
        }
        if (i7 == min && iVar2.e() == iVar.e()) {
            return j4.i.m(".", false);
        }
        if (a11.subList(i7, a11.size()).indexOf(g8.c.f4542e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + wVar).toString());
        }
        f fVar = new f();
        i c4 = g8.c.c(wVar);
        if (c4 == null && (c4 = g8.c.c(this)) == null) {
            c4 = g8.c.f(f3645g);
        }
        int size = a11.size();
        for (int i8 = i7; i8 < size; i8++) {
            fVar.I(g8.c.f4542e);
            fVar.I(c4);
        }
        int size2 = a10.size();
        while (i7 < size2) {
            fVar.I((i) a10.get(i7));
            fVar.I(c4);
            i7++;
        }
        return g8.c.d(fVar, false);
    }

    public final int hashCode() {
        return this.f3646f.hashCode();
    }

    public final w l(String str) {
        r6.k.f(str, "child");
        f fVar = new f();
        fVar.X(str);
        return g8.c.b(this, g8.c.d(fVar, false), false);
    }

    public final Path m() {
        Path path;
        path = Paths.get(this.f3646f.C(), new String[0]);
        r6.k.e(path, "get(...)");
        return path;
    }

    public final Character p() {
        i iVar = g8.c.f4538a;
        i iVar2 = this.f3646f;
        if (i.l(iVar2, iVar) != -1 || iVar2.e() < 2 || iVar2.p(1) != 58) {
            return null;
        }
        char p6 = (char) iVar2.p(0);
        if (('a' > p6 || p6 >= '{') && ('A' > p6 || p6 >= '[')) {
            return null;
        }
        return Character.valueOf(p6);
    }

    public final File toFile() {
        return new File(this.f3646f.C());
    }

    public final String toString() {
        return this.f3646f.C();
    }
}
