package g2;

import a0.g1;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0.a0 f2900a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0.a0 f2901b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0.a0 f2902c;

    static {
        int i = 21;
        f2900a = new a0.a0(i, new v(5), new a4.a(27));
        f2901b = new a0.a0(i, new v(6), new a4.a(28));
        f2902c = new a0.a0(i, new v(7), new a4.a(29));
    }

    public static a a(String str, i0 i0Var, long j7, r2.d dVar, j2.d dVar2, int i) {
        d6.u uVar = d6.u.f2326d;
        return new a(new n2.c(str, i0Var, uVar, uVar, dVar2, dVar), i, 1, j7);
    }

    public static final long b(int i, int i8) {
        if (i < 0 || i8 < 0) {
            l2.a.a("start and end cannot be negative. [start: " + i + ", end: " + i8 + ']');
        }
        long j7 = (i8 & 4294967295L) | (i << 32);
        int i9 = h0.f2959c;
        return j7;
    }

    public static final int c(int i, List list) {
        int i8;
        int i9 = ((o) d6.m.X(list)).f2985c;
        if (i > ((o) d6.m.X(list)).f2985c) {
            l2.a.a("Index " + i + " should be less or equal than last line's end " + i9);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (true) {
            if (i10 > size) {
                i8 = -(i10 + 1);
                break;
            }
            i8 = (i10 + size) >>> 1;
            o oVar = (o) list.get(i8);
            char c8 = oVar.f2984b > i ? (char) 1 : oVar.f2985c <= i ? (char) 65535 : (char) 0;
            if (c8 >= 0) {
                if (c8 <= 0) {
                    break;
                }
                size = i8 - 1;
            } else {
                i10 = i8 + 1;
            }
        }
        if (i8 >= 0 && i8 < list.size()) {
            return i8;
        }
        StringBuilder l3 = a0.q.l("Found paragraph index ", i8, " should be in range [0, ");
        l3.append(list.size());
        l3.append(").\nDebug info: index=");
        l3.append(i);
        l3.append(", paragraphs=[");
        l3.append(t2.a.a(list, null, new a4.a(4), 31));
        l3.append(']');
        l2.a.a(l3.toString());
        return i8;
    }

    public static final int d(int i, List list) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            o oVar = (o) list.get(i9);
            char c8 = oVar.f2986d > i ? (char) 1 : oVar.f2987e <= i ? (char) 65535 : (char) 0;
            if (c8 < 0) {
                i8 = i9 + 1;
            } else {
                if (c8 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final i0 e(i0 i0Var, r2.l lVar) {
        q2.o oVar;
        long j7;
        j2.k kVar;
        j2.i iVar;
        m2.b bVar;
        b0 b0Var = i0Var.f2964a;
        q2.o oVar2 = c0.f2924d;
        q2.o oVar3 = b0Var.f2903a;
        if (oVar3.equals(q2.n.f6060a)) {
            oVar3 = c0.f2924d;
        }
        q2.o oVar4 = oVar3;
        long j8 = b0Var.f2904b;
        r2.p[] pVarArr = r2.n.f6533b;
        if ((j8 & 1095216660480L) == 0) {
            j8 = c0.f2921a;
        }
        long j9 = j8;
        j2.k kVar2 = b0Var.f2905c;
        if (kVar2 == null) {
            kVar2 = j2.k.f3995f;
        }
        j2.k kVar3 = kVar2;
        j2.i iVar2 = b0Var.f2906d;
        j2.i iVar3 = new j2.i(iVar2 != null ? iVar2.f3992a : 0);
        j2.j jVar = b0Var.f2907e;
        j2.j jVar2 = new j2.j(jVar != null ? jVar.f3993a : 65535);
        j2.p pVar = b0Var.f2908f;
        if (pVar == null) {
            pVar = j2.p.f4001a;
        }
        j2.p pVar2 = pVar;
        String str = b0Var.f2909g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j10 = b0Var.f2910h;
        if ((j10 & 1095216660480L) == 0) {
            j10 = c0.f2922b;
        }
        q2.a aVar = b0Var.i;
        q2.a aVar2 = new q2.a(aVar != null ? aVar.f6037a : 0.0f);
        q2.p pVar3 = b0Var.f2911j;
        if (pVar3 == null) {
            pVar3 = q2.p.f6061c;
        }
        q2.p pVar4 = pVar3;
        m2.b bVar2 = b0Var.f2912k;
        if (bVar2 == null) {
            m2.b bVar3 = m2.b.f5217f;
            g1 g1Var = m2.c.f5220a;
            g1Var.getClass();
            LocaleList localeList = LocaleList.getDefault();
            oVar = oVar4;
            synchronized (((w5.f) g1Var.f86d)) {
                j7 = j9;
                try {
                    bVar = (m2.b) g1Var.f85c;
                    if (bVar == null || localeList != ((LocaleList) g1Var.f84b)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        kVar = kVar3;
                        int i = 0;
                        while (i < size) {
                            arrayList.add(new m2.a(localeList.get(i)));
                            i++;
                            size = size;
                            iVar3 = iVar3;
                        }
                        iVar = iVar3;
                        bVar = new m2.b(arrayList);
                        g1Var.f84b = localeList;
                        g1Var.f85c = bVar;
                    } else {
                        kVar = kVar3;
                        iVar = iVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar2 = bVar;
        } else {
            oVar = oVar4;
            j7 = j9;
            kVar = kVar3;
            iVar = iVar3;
        }
        m2.b bVar4 = bVar2;
        long j11 = b0Var.f2913l;
        if (j11 == 16) {
            j11 = c0.f2923c;
        }
        q2.l lVar2 = b0Var.f2914m;
        if (lVar2 == null) {
            lVar2 = q2.l.f6056b;
        }
        f1.h0 h0Var = b0Var.f2915n;
        if (h0Var == null) {
            h0Var = f1.h0.f2663d;
        }
        h1.c cVar = b0Var.f2916o;
        if (cVar == null) {
            cVar = h1.f.f3080b;
        }
        b0 b0Var2 = new b0(oVar, j7, kVar, iVar, jVar2, pVar2, str2, j10, aVar2, pVar4, bVar4, j11, lVar2, h0Var, cVar);
        r rVar = i0Var.f2965b;
        int i8 = s.f3002b;
        int i9 = rVar.f2993a;
        int i10 = 5;
        if (i9 == Integer.MIN_VALUE) {
            i9 = 5;
        }
        int i11 = rVar.f2994b;
        if (i11 == 3) {
            int ordinal = lVar.ordinal();
            if (ordinal == 0) {
                i10 = 4;
            } else if (ordinal != 1) {
                throw new a5.c();
            }
        } else if (i11 == Integer.MIN_VALUE) {
            int ordinal2 = lVar.ordinal();
            if (ordinal2 == 0) {
                i10 = 1;
            } else {
                if (ordinal2 != 1) {
                    throw new a5.c();
                }
                i10 = 2;
            }
        } else {
            i10 = i11;
        }
        long j12 = rVar.f2995c;
        if ((j12 & 1095216660480L) == 0) {
            j12 = s.f3001a;
        }
        q2.q qVar = rVar.f2996d;
        if (qVar == null) {
            qVar = q2.q.f6064c;
        }
        t tVar = rVar.f2997e;
        q2.q qVar2 = qVar;
        q2.i iVar4 = rVar.f2998f;
        int i12 = rVar.f2999g;
        if (i12 == 0) {
            i12 = q2.e.f6042b;
        }
        int i13 = rVar.f3000h;
        if (i13 == Integer.MIN_VALUE) {
            i13 = 1;
        }
        q2.s sVar = rVar.i;
        if (sVar == null) {
            sVar = q2.s.f6068c;
        }
        return new i0(b0Var2, new r(i9, i10, j12, qVar2, tVar, iVar4, i12, i13, sVar), i0Var.f2966c);
    }
}
