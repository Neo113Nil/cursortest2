package D;

import G.C0216p;
import G.C0222s0;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;
import l.AbstractC0798y;
import l.C0795v;
import u.C1213a;

/* loaded from: classes.dex */
public abstract class I1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l.u0 f1338a;

    static {
        C0795v c0795v = AbstractC0798y.f7865a;
        AbstractC0779e.j(250, 0, c0795v, 2);
        f1338a = AbstractC0779e.j(250, 0, c0795v, 2);
    }

    public static final void a(int i2, S.o oVar, long j4, long j5, L2.c cVar, Function2 function2, O.a aVar, C0216p c0216p, int i4) {
        int i5;
        S.o oVar2;
        L2.c b4;
        Function2 function22;
        S.o oVar3;
        L2.c cVar2;
        Function2 function23;
        c0216p.U(-1199178586);
        if ((i4 & 6) == 0) {
            i5 = (c0216p.d(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        int i6 = i5 | 48;
        if ((i4 & 384) == 0) {
            i6 |= c0216p.e(j4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0216p.e(j5) ? 2048 : 1024;
        }
        int i7 = i6 | 221184;
        if ((1572864 & i4) == 0) {
            i7 |= c0216p.h(aVar) ? 1048576 : 524288;
        }
        if ((599187 & i7) == 599186 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            cVar2 = cVar;
            function23 = function2;
        } else {
            c0216p.P();
            if ((i4 & 1) == 0 || c0216p.y()) {
                oVar2 = S.l.f3977a;
                b4 = O.f.b(-2052073983, new D1(i2), c0216p);
                function22 = Q.f1593a;
            } else {
                c0216p.N();
                oVar2 = oVar;
                b4 = cVar;
                function22 = function2;
            }
            c0216p.r();
            b(oVar2, j4, j5, b4, function22, aVar, c0216p, (i7 >> 3) & 524286);
            oVar3 = oVar2;
            cVar2 = b4;
            function23 = function22;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new E1(i2, oVar3, j4, j5, cVar2, function23, aVar, i4);
        }
    }

    public static final void b(S.o oVar, long j4, long j5, L2.c cVar, Function2 function2, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-160898917);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.e(j5) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(cVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.h(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            int i5 = i4 << 3;
            AbstractC0161p1.a(y0.k.a(oVar, C1213a.f10886d), null, j4, j5, 0.0f, 0.0f, null, O.f.b(-1617702432, new G1(aVar, function2, cVar, 1), c0216p), c0216p, (i5 & 896) | 12582912 | (i5 & 7168), 114);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new H1(oVar, j4, j5, cVar, function2, aVar, i2);
        }
    }
}
