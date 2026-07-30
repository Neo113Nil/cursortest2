package defpackage;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qz1 implements Comparable {
    public static final String n;
    public final dr m;

    static {
        String str = File.separator;
        str.getClass();
        n = str;
    }

    public qz1(dr drVar) {
        drVar.getClass();
        this.m = drVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = j.a(this);
        dr drVar = this.m;
        if (a == -1) {
            a = 0;
        } else if (a < drVar.c() && drVar.h(a) == 92) {
            a++;
        }
        int c = drVar.c();
        int i = a;
        while (a < c) {
            if (drVar.h(a) == 47 || drVar.h(a) == 92) {
                arrayList.add(drVar.m(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < drVar.c()) {
            arrayList.add(drVar.m(i, drVar.c()));
        }
        return arrayList;
    }

    public final qz1 b() {
        dr drVar = j.d;
        dr drVar2 = this.m;
        if (Intrinsics.b(drVar2, drVar)) {
            return null;
        }
        dr drVar3 = j.a;
        if (Intrinsics.b(drVar2, drVar3)) {
            return null;
        }
        dr drVar4 = j.b;
        if (Intrinsics.b(drVar2, drVar4)) {
            return null;
        }
        dr drVar5 = j.e;
        drVar2.getClass();
        drVar5.getClass();
        int c = drVar2.c();
        byte[] bArr = drVar5.m;
        if (drVar2.k(c - bArr.length, drVar5, bArr.length) && (drVar2.c() == 2 || drVar2.k(drVar2.c() - 3, drVar3, 1) || drVar2.k(drVar2.c() - 3, drVar4, 1))) {
            return null;
        }
        int j = dr.j(drVar2, drVar3);
        if (j == -1) {
            j = dr.j(drVar2, drVar4);
        }
        if (j == 2 && e() != null) {
            if (drVar2.c() == 3) {
                return null;
            }
            return new qz1(dr.n(drVar2, 0, 3, 1));
        }
        if (j == 1) {
            drVar4.getClass();
            if (drVar2.k(0, drVar4, drVar4.c())) {
                return null;
            }
        }
        if (j != -1 || e() == null) {
            return j == -1 ? new qz1(drVar) : j == 0 ? new qz1(dr.n(drVar2, 0, 1, 1)) : new qz1(dr.n(drVar2, 0, j, 1));
        }
        if (drVar2.c() == 2) {
            return null;
        }
        return new qz1(dr.n(drVar2, 0, 2, 1));
    }

    public final qz1 c(qz1 qz1Var) {
        qz1Var.getClass();
        dr drVar = qz1Var.m;
        int a = j.a(this);
        dr drVar2 = this.m;
        qz1 qz1Var2 = a == -1 ? null : new qz1(drVar2.m(0, a));
        int a2 = j.a(qz1Var);
        if (!Intrinsics.b(qz1Var2, a2 == -1 ? null : new qz1(drVar.m(0, a2)))) {
            b71.r("Paths of different roots cannot be relative to each other: ", this, " and ", qz1Var);
            return null;
        }
        ArrayList a3 = a();
        ArrayList a4 = qz1Var.a();
        int min = Math.min(a3.size(), a4.size());
        int i = 0;
        while (i < min && Intrinsics.b(a3.get(i), a4.get(i))) {
            i++;
        }
        if (i == min && drVar2.c() == drVar.c()) {
            return nm1.r(".");
        }
        if (a4.subList(i, a4.size()).indexOf(j.e) != -1) {
            b71.r("Impossible relative path to resolve: ", this, " and ", qz1Var);
            return null;
        }
        fq fqVar = new fq();
        dr c = j.c(qz1Var);
        if (c == null && (c = j.c(this)) == null) {
            c = j.f(n);
        }
        int size = a4.size();
        for (int i2 = i; i2 < size; i2++) {
            fqVar.H(j.e);
            fqVar.H(c);
        }
        int size2 = a3.size();
        while (i < size2) {
            fqVar.H((dr) a3.get(i));
            fqVar.H(c);
            i++;
        }
        return j.d(fqVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qz1 qz1Var = (qz1) obj;
        qz1Var.getClass();
        return this.m.compareTo(qz1Var.m);
    }

    public final qz1 d(String str) {
        str.getClass();
        fq fqVar = new fq();
        fqVar.Q(str);
        return j.b(this, j.d(fqVar, false), false);
    }

    public final Character e() {
        dr drVar = j.a;
        dr drVar2 = this.m;
        if (dr.f(drVar2, drVar) != -1 || drVar2.c() < 2 || drVar2.h(1) != 58) {
            return null;
        }
        char h = (char) drVar2.h(0);
        if (('a' > h || h >= '{') && ('A' > h || h >= '[')) {
            return null;
        }
        return Character.valueOf(h);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qz1) && Intrinsics.b(((qz1) obj).m, this.m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final File toFile() {
        return new File(this.m.p());
    }

    public final String toString() {
        return this.m.p();
    }
}
