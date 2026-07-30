package g8;

import e6.l;
import e6.m;
import f8.w;
import java.util.ArrayList;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f8.i f4538a;

    /* renamed from: b, reason: collision with root package name */
    public static final f8.i f4539b;

    /* renamed from: c, reason: collision with root package name */
    public static final f8.i f4540c;

    /* renamed from: d, reason: collision with root package name */
    public static final f8.i f4541d;

    /* renamed from: e, reason: collision with root package name */
    public static final f8.i f4542e;

    static {
        f8.i iVar = f8.i.f3600i;
        f4538a = m4.f.j("/");
        f4539b = m4.f.j("\\");
        f4540c = m4.f.j("/\\");
        f4541d = m4.f.j(".");
        f4542e = m4.f.j("..");
    }

    public static final int a(w wVar) {
        f8.i iVar = wVar.f3646f;
        if (iVar.e() != 0) {
            if (iVar.p(0) != 47) {
                if (iVar.p(0) == 92) {
                    if (iVar.e() > 2 && iVar.p(1) == 92) {
                        f8.i iVar2 = f4539b;
                        k.f(iVar2, "other");
                        int h3 = iVar.h(2, iVar2.m());
                        return h3 == -1 ? iVar.e() : h3;
                    }
                } else if (iVar.e() > 2 && iVar.p(1) == 58 && iVar.p(2) == 92) {
                    char p6 = (char) iVar.p(0);
                    if ('a' <= p6 && p6 < '{') {
                        return 3;
                    }
                    if ('A' <= p6 && p6 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final w b(w wVar, w wVar2, boolean z8) {
        k.f(wVar2, "child");
        if (a(wVar2) != -1) {
            return wVar2;
        }
        if (wVar2.p() != null) {
            return wVar2;
        }
        f8.i c4 = c(wVar);
        if (c4 == null && (c4 = c(wVar2)) == null) {
            c4 = f(w.f3645g);
        }
        f8.f fVar = new f8.f();
        fVar.I(wVar.f3646f);
        if (fVar.f3598g > 0) {
            fVar.I(c4);
        }
        fVar.I(wVar2.f3646f);
        return d(fVar, z8);
    }

    public static final f8.i c(w wVar) {
        f8.i iVar = wVar.f3646f;
        f8.i iVar2 = f4538a;
        if (f8.i.l(iVar, iVar2) != -1) {
            return iVar2;
        }
        f8.i iVar3 = wVar.f3646f;
        f8.i iVar4 = f4539b;
        if (f8.i.l(iVar3, iVar4) != -1) {
            return iVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b A[EDGE_INSN: B:72:0x011b->B:73:0x011b BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w d(f8.f fVar, boolean z8) {
        f8.i iVar;
        long j8;
        char k8;
        boolean c4;
        f8.i iVar2;
        int size;
        int i7;
        f8.i h3;
        f8.f fVar2 = new f8.f();
        f8.i iVar3 = null;
        int i8 = 0;
        while (true) {
            if (!fVar.u(f4538a)) {
                iVar = f4539b;
                if (!fVar.u(iVar)) {
                    break;
                }
            }
            byte readByte = fVar.readByte();
            if (iVar3 == null) {
                iVar3 = e(readByte);
            }
            i8++;
        }
        boolean z9 = i8 >= 2 && k.a(iVar3, iVar);
        f8.i iVar4 = f4540c;
        if (z9) {
            k.c(iVar3);
            fVar2.I(iVar3);
            fVar2.I(iVar3);
        } else if (i8 > 0) {
            k.c(iVar3);
            fVar2.I(iVar3);
        } else {
            long t2 = fVar.t(iVar4);
            if (iVar3 == null) {
                iVar3 = t2 == -1 ? f(w.f3645g) : e(fVar.k(t2));
            }
            if (k.a(iVar3, iVar) && fVar.f3598g >= 2) {
                j8 = -1;
                if (fVar.k(1L) == 58 && (('a' <= (k8 = (char) fVar.k(0L)) && k8 < '{') || ('A' <= k8 && k8 < '['))) {
                    if (t2 == 2) {
                        fVar2.f(3L, fVar);
                    } else {
                        fVar2.f(2L, fVar);
                    }
                }
                boolean z10 = fVar2.f3598g <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    c4 = fVar.c();
                    iVar2 = f4541d;
                    if (!c4) {
                        break;
                    }
                    long t8 = fVar.t(iVar4);
                    if (t8 == j8) {
                        h3 = fVar.h(fVar.f3598g);
                    } else {
                        h3 = fVar.h(t8);
                        fVar.readByte();
                    }
                    f8.i iVar5 = f4542e;
                    if (k.a(h3, iVar5)) {
                        if (!z10 || !arrayList.isEmpty()) {
                            if (!z8 || (!z10 && (arrayList.isEmpty() || k.a(l.n0(arrayList), iVar5)))) {
                                arrayList.add(h3);
                            } else if (!z9 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(m.W(arrayList));
                                }
                            }
                        }
                    } else if (!k.a(h3, iVar2) && !k.a(h3, f8.i.f3600i)) {
                        arrayList.add(h3);
                    }
                }
                size = arrayList.size();
                for (i7 = 0; i7 < size; i7++) {
                    if (i7 > 0) {
                        fVar2.I(iVar3);
                    }
                    fVar2.I((f8.i) arrayList.get(i7));
                }
                if (fVar2.f3598g == 0) {
                    fVar2.I(iVar2);
                }
                return new w(fVar2.h(fVar2.f3598g));
            }
        }
        j8 = -1;
        if (fVar2.f3598g <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            c4 = fVar.c();
            iVar2 = f4541d;
            if (!c4) {
            }
        }
        size = arrayList2.size();
        while (i7 < size) {
        }
        if (fVar2.f3598g == 0) {
        }
        return new w(fVar2.h(fVar2.f3598g));
    }

    public static final f8.i e(byte b9) {
        if (b9 == 47) {
            return f4538a;
        }
        if (b9 == 92) {
            return f4539b;
        }
        throw new IllegalArgumentException(a0.m.i("not a directory separator: ", b9));
    }

    public static final f8.i f(String str) {
        if (k.a(str, "/")) {
            return f4538a;
        }
        if (k.a(str, "\\")) {
            return f4539b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
