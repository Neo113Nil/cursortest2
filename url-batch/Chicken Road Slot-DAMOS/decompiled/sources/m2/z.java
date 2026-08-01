package m2;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final c6.c f6544a;

    /* renamed from: b, reason: collision with root package name */
    public static final c6.c f6545b;

    /* renamed from: c, reason: collision with root package name */
    public static final c6.c f6546c;

    /* renamed from: d, reason: collision with root package name */
    public static final c6.c f6547d;

    /* renamed from: e, reason: collision with root package name */
    public static final c6.c f6548e;

    static {
        int i3 = 1;
        f6544a = new c6.c(i3, new t(19), new u(7));
        f6545b = new c6.c(i3, new t(20), new u(8));
        f6546c = new c6.c(i3, new t(21), new u(9));
        f6547d = new c6.c(i3, new t(22), new u(10));
        f6548e = new c6.c(i3, new t(23), new u(11));
    }

    public static a a(String str, h0 h0Var, long j, x2.d dVar, p2.h hVar, int i3) {
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f5574d;
        return new a(new t2.c(str, h0Var, j0Var, j0Var, hVar, dVar), i3, 1, j);
    }

    public static final long b(int i3, int i10) {
        if (i3 < 0 || i10 < 0) {
            r2.a.a("start and end cannot be negative. [start: " + i3 + ", end: " + i10 + ']');
        }
        long j = (i10 & 4294967295L) | (i3 << 32);
        int i11 = g0.f6477c;
        return j;
    }

    public static final int c(int i3, List list) {
        int i10;
        int i11 = ((m) CollectionsKt.C(list)).f6494c;
        if (i3 > ((m) CollectionsKt.C(list)).f6494c) {
            r2.a.a("Index " + i3 + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i10 = -(i12 + 1);
                break;
            }
            i10 = (i12 + size) >>> 1;
            m mVar = (m) list.get(i10);
            char c10 = mVar.f6493b > i3 ? (char) 1 : mVar.f6494c <= i3 ? (char) 65535 : (char) 0;
            if (c10 >= 0) {
                if (c10 <= 0) {
                    break;
                }
                size = i10 - 1;
            } else {
                i12 = i10 + 1;
            }
        }
        if (i10 >= 0 && i10 < list.size()) {
            return i10;
        }
        StringBuilder i13 = n0.l.i(i10, "Found paragraph index ", " should be in range [0, ");
        i13.append(list.size());
        i13.append(").\nDebug info: index=");
        i13.append(i3);
        i13.append(", paragraphs=[");
        i13.append(z2.a.a(list, null, new l9.d(5), 31));
        i13.append(']');
        r2.a.a(i13.toString());
        return i10;
    }

    public static final int d(int i3, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            m mVar = (m) list.get(i11);
            char c10 = mVar.f6495d > i3 ? (char) 1 : mVar.f6496e <= i3 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h0 e(h0 h0Var, x2.l lVar) {
        long j;
        w2.q qVar;
        int i3;
        int i10;
        w2.s sVar;
        a0 a0Var = h0Var.f6481a;
        w2.o oVar = b0.f6438d;
        w2.o oVar2 = a0Var.f6422a;
        if (oVar2.equals(w2.n.f10048a)) {
            oVar2 = b0.f6438d;
        }
        w2.o oVar3 = oVar2;
        long j3 = a0Var.f6423b;
        x2.o[] oVarArr = x2.n.f10334b;
        if ((j3 & 1095216660480L) == 0) {
            j3 = b0.f6435a;
        }
        long j10 = j3;
        p2.s sVar2 = a0Var.f6424c;
        if (sVar2 == null) {
            sVar2 = p2.s.f7645s;
        }
        p2.s sVar3 = sVar2;
        p2.o oVar4 = a0Var.f6425d;
        p2.o oVar5 = new p2.o(oVar4 != null ? oVar4.f7639a : 0);
        p2.p pVar = a0Var.f6426e;
        p2.p pVar2 = new p2.p(pVar != null ? pVar.f7640a : 65535);
        p2.i iVar = a0Var.f6427f;
        if (iVar == null) {
            iVar = p2.i.f7625d;
        }
        p2.i iVar2 = iVar;
        String str = a0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j11 = a0Var.f6428h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = b0.f6436b;
        }
        long j12 = j11;
        w2.a aVar = a0Var.f6429i;
        float f3 = aVar != null ? aVar.f10023a : 0.0f;
        w2.a aVar2 = new w2.a(Float.isNaN(f3) ? 0.0f : f3);
        w2.p pVar3 = a0Var.j;
        if (pVar3 == null) {
            pVar3 = w2.p.f10049c;
        }
        w2.p pVar4 = pVar3;
        s2.b bVar = a0Var.f6430k;
        if (bVar == null) {
            s2.b bVar2 = s2.b.f8409i;
            bVar = k7.e.t();
        }
        s2.b bVar3 = bVar;
        long j13 = a0Var.f6431l;
        if (j13 == 16) {
            j13 = b0.f6437c;
        }
        long j14 = j13;
        w2.l lVar2 = a0Var.f6432m;
        if (lVar2 == null) {
            lVar2 = w2.l.f10044b;
        }
        w2.l lVar3 = lVar2;
        k1.e0 e0Var = a0Var.f6433n;
        if (e0Var == null) {
            e0Var = k1.e0.f5315d;
        }
        k1.e0 e0Var2 = e0Var;
        m1.c cVar = a0Var.f6434o;
        if (cVar == null) {
            cVar = m1.f.f6411b;
        }
        a0 a0Var2 = new a0(oVar3, j10, sVar3, oVar5, pVar2, iVar2, str2, j12, aVar2, pVar4, bVar3, j14, lVar3, e0Var2, cVar);
        p pVar5 = h0Var.f6482b;
        int i11 = q.f6510b;
        int i12 = pVar5.f6501a;
        int i13 = 5;
        if (i12 == 0) {
            i12 = 5;
        }
        int i14 = pVar5.f6502b;
        if (i14 != 3) {
            if (i14 == 0) {
                int ordinal = lVar.ordinal();
                if (ordinal == 0) {
                    i14 = 1;
                } else {
                    if (ordinal != 1) {
                        a2.r.p();
                        return null;
                    }
                    i13 = 2;
                }
            }
            j = pVar5.f6503c;
            if ((j & 1095216660480L) == 0) {
                j = q.f6509a;
            }
            qVar = pVar5.f6504d;
            if (qVar == null) {
                qVar = w2.q.f10052c;
            }
            r rVar = pVar5.f6505e;
            w2.i iVar3 = pVar5.f6506f;
            i3 = pVar5.g;
            if (i3 == 0) {
                i3 = w2.e.f10028b;
            }
            i10 = pVar5.f6507h;
            if (i10 == 0) {
                i10 = 1;
            }
            sVar = pVar5.f6508i;
            if (sVar == null) {
                sVar = w2.s.f10056c;
            }
            return new h0(a0Var2, new p(i12, i14, j, qVar, rVar, iVar3, i3, i10, sVar), h0Var.f6483c);
        }
        int ordinal2 = lVar.ordinal();
        if (ordinal2 == 0) {
            i13 = 4;
        } else if (ordinal2 != 1) {
            a2.r.p();
            return null;
        }
        i14 = i13;
        j = pVar5.f6503c;
        if ((j & 1095216660480L) == 0) {
        }
        qVar = pVar5.f6504d;
        if (qVar == null) {
        }
        r rVar2 = pVar5.f6505e;
        w2.i iVar32 = pVar5.f6506f;
        i3 = pVar5.g;
        if (i3 == 0) {
        }
        i10 = pVar5.f6507h;
        if (i10 == 0) {
        }
        sVar = pVar5.f6508i;
        if (sVar == null) {
        }
        return new h0(a0Var2, new p(i12, i14, j, qVar, rVar2, iVar32, i3, i10, sVar), h0Var.f6483c);
    }
}
