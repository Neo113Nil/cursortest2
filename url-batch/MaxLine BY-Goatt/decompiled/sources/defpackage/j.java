package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class j {
    public static final dr a;
    public static final dr b;
    public static final dr c;
    public static final dr d;
    public static final dr e;

    static {
        dr drVar = dr.p;
        a = nj.j("/");
        b = nj.j("\\");
        c = nj.j("/\\");
        d = nj.j(".");
        e = nj.j("..");
    }

    public static final int a(qz1 qz1Var) {
        dr drVar = qz1Var.m;
        if (drVar.c() != 0) {
            if (drVar.h(0) != 47) {
                if (drVar.h(0) == 92) {
                    if (drVar.c() > 2 && drVar.h(1) == 92) {
                        dr drVar2 = b;
                        drVar2.getClass();
                        int e2 = drVar.e(2, drVar2.g());
                        return e2 == -1 ? drVar.c() : e2;
                    }
                } else if (drVar.c() > 2 && drVar.h(1) == 58 && drVar.h(2) == 92) {
                    char h = (char) drVar.h(0);
                    if ('a' <= h && h < '{') {
                        return 3;
                    }
                    if ('A' <= h && h < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final qz1 b(qz1 qz1Var, qz1 qz1Var2, boolean z) {
        qz1Var2.getClass();
        if (a(qz1Var2) != -1 || qz1Var2.e() != null) {
            return qz1Var2;
        }
        dr c2 = c(qz1Var);
        if (c2 == null && (c2 = c(qz1Var2)) == null) {
            c2 = f(qz1.n);
        }
        fq fqVar = new fq();
        fqVar.H(qz1Var.m);
        if (fqVar.n > 0) {
            fqVar.H(c2);
        }
        fqVar.H(qz1Var2.m);
        return d(fqVar, z);
    }

    public static final dr c(qz1 qz1Var) {
        dr drVar = qz1Var.m;
        dr drVar2 = a;
        if (dr.f(drVar, drVar2) != -1) {
            return drVar2;
        }
        dr drVar3 = qz1Var.m;
        dr drVar4 = b;
        if (dr.f(drVar3, drVar4) != -1) {
            return drVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c A[EDGE_INSN: B:72:0x011c->B:73:0x011c BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qz1 d(fq fqVar, boolean z) {
        dr drVar;
        long j;
        char n;
        boolean m;
        dr drVar2;
        int size;
        int i;
        dr k;
        fq fqVar2 = new fq();
        dr drVar3 = null;
        int i2 = 0;
        while (true) {
            if (!fqVar.q(a)) {
                drVar = b;
                if (!fqVar.q(drVar)) {
                    break;
                }
            }
            byte readByte = fqVar.readByte();
            if (drVar3 == null) {
                drVar3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && Intrinsics.b(drVar3, drVar);
        dr drVar4 = c;
        if (z2) {
            drVar3.getClass();
            fqVar2.H(drVar3);
            fqVar2.H(drVar3);
        } else if (i2 > 0) {
            drVar3.getClass();
            fqVar2.H(drVar3);
        } else {
            long p = fqVar.p(drVar4);
            if (drVar3 == null) {
                drVar3 = p == -1 ? f(qz1.n) : e(fqVar.n(p));
            }
            if (Intrinsics.b(drVar3, drVar) && fqVar.n >= 2) {
                j = -1;
                if (fqVar.n(1L) == 58 && (('a' <= (n = (char) fqVar.n(0L)) && n < '{') || ('A' <= n && n < '['))) {
                    if (p == 2) {
                        fqVar2.u(3L, fqVar);
                    } else {
                        fqVar2.u(2L, fqVar);
                    }
                }
                boolean z3 = fqVar2.n <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    m = fqVar.m();
                    drVar2 = d;
                    if (!m) {
                        break;
                    }
                    long p2 = fqVar.p(drVar4);
                    if (p2 == j) {
                        k = fqVar.k(fqVar.n);
                    } else {
                        k = fqVar.k(p2);
                        fqVar.readByte();
                    }
                    dr drVar5 = e;
                    if (Intrinsics.b(k, drVar5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.b(zv.B(arrayList), drVar5)))) {
                                arrayList.add(k);
                            } else if (!z2 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(arrayList.size() - 1);
                                }
                            }
                        }
                    } else if (!Intrinsics.b(k, drVar2) && !Intrinsics.b(k, dr.p)) {
                        arrayList.add(k);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        fqVar2.H(drVar3);
                    }
                    fqVar2.H((dr) arrayList.get(i));
                }
                if (fqVar2.n == 0) {
                    fqVar2.H(drVar2);
                }
                return new qz1(fqVar2.k(fqVar2.n));
            }
        }
        j = -1;
        if (fqVar2.n <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            m = fqVar.m();
            drVar2 = d;
            if (!m) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (fqVar2.n == 0) {
        }
        return new qz1(fqVar2.k(fqVar2.n));
    }

    public static final dr e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        lh.e(in1.k(b2, "not a directory separator: "));
        return null;
    }

    public static final dr f(String str) {
        if (Intrinsics.b(str, "/")) {
            return a;
        }
        if (Intrinsics.b(str, "\\")) {
            return b;
        }
        lh.e(q40.l("not a directory separator: ", str));
        return null;
    }
}
