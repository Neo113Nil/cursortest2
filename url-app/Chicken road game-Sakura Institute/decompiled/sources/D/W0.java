package D;

import A.AbstractC0017m;
import C.C0113h;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import Z.C0323u;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0778d;
import l.C0788n;
import m.C0847u;
import p.C0928d;
import p.C0931g;
import p.C0935k;
import p.C0937m;
import p.InterfaceC0933i;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import q.InterfaceC1021Z;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z2.C1403G;

/* loaded from: classes.dex */
public abstract class W0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0113h f1671a = new C0113h(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Function0 function0, O.a aVar, S.o oVar, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Z.P p4, long j4, long j5, long j6, long j7, float f4, P0.w wVar, C0216p c0216p, int i2, int i4, int i5) {
        int i6;
        Function2 function25;
        int i7;
        int i8;
        int i9;
        Function2 function26;
        Z.P p5;
        float f5;
        Function2 function27;
        P0.w wVar2;
        long j8;
        long j9;
        long j10;
        S.o oVar2;
        int i10;
        S.o oVar3;
        Function2 function28;
        Function2 function29;
        Z.P p6;
        long j11;
        long j12;
        long j13;
        float f6;
        P0.w wVar3;
        C0222s0 s4;
        c0216p.U(-2081346864);
        if ((i2 & 6) == 0) {
            i6 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= c0216p.h(aVar) ? 32 : 16;
        }
        int i11 = i6 | 384;
        int i12 = i5 & 8;
        if (i12 != 0) {
            i11 = i6 | 3456;
        } else if ((i2 & 3072) == 0) {
            function25 = function2;
            i11 |= c0216p.h(function25) ? 2048 : 1024;
            i7 = i11 | 24576;
            if ((196608 & i2) == 0) {
                i7 |= c0216p.h(function23) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i7 |= c0216p.h(function24) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                i7 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i7 |= c0216p.e(j4) ? 67108864 : 33554432;
            }
            if ((805306368 & i2) == 0) {
                i7 |= 268435456;
            }
            int i13 = (i4 & 6) != 0 ? i4 | 2 : i4;
            if ((i4 & 48) == 0) {
                i13 |= 16;
            }
            i8 = i13 | 3456;
            if ((306783379 & i7) != 306783378 && (i8 & 1171) == 1170 && c0216p.z()) {
                c0216p.N();
                oVar3 = oVar;
                function29 = function22;
                p6 = p4;
                j11 = j5;
                j12 = j6;
                j13 = j7;
                f6 = f4;
                wVar3 = wVar;
                function28 = function25;
            } else {
                c0216p.P();
                if ((i2 & 1) != 0 || c0216p.y()) {
                    S.l lVar = S.l.f3977a;
                    if (i12 != 0) {
                        function25 = null;
                    }
                    float f7 = AbstractC0114a.f1698a;
                    Z.P a4 = AbstractC0146k1.a(F.c.f2376a, c0216p);
                    long d4 = M.d(F.c.f2381f, c0216p);
                    long d5 = M.d(F.c.f2377b, c0216p);
                    long d6 = M.d(F.c.f2379d, c0216p);
                    i9 = i8 & (-127);
                    function26 = function25;
                    p5 = a4;
                    f5 = AbstractC0114a.f1698a;
                    function27 = null;
                    wVar2 = new P0.w();
                    j8 = d4;
                    j9 = d5;
                    j10 = d6;
                    oVar2 = lVar;
                    i10 = i7 & (-1908408321);
                } else {
                    c0216p.N();
                    i10 = i7 & (-1908408321);
                    i9 = i8 & (-127);
                    oVar2 = oVar;
                    function27 = function22;
                    p5 = p4;
                    j8 = j5;
                    j9 = j6;
                    j10 = j7;
                    f5 = f4;
                    wVar2 = wVar;
                    function26 = function25;
                }
                c0216p.r();
                AbstractC0150m.c(function0, aVar, oVar2, function26, function27, function23, function24, p5, j4, j8, j9, j10, f5, wVar2, c0216p, i10 & 2147483646, i9 & 8190);
                oVar3 = oVar2;
                function28 = function26;
                function29 = function27;
                p6 = p5;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                f6 = f5;
                wVar3 = wVar2;
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new C0153n(function0, aVar, oVar3, function28, function29, function23, function24, p6, j4, j11, j12, j13, f6, wVar3, i2, i4, i5);
                return;
            }
            return;
        }
        function25 = function2;
        i7 = i11 | 24576;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if ((i4 & 6) != 0) {
        }
        if ((i4 & 48) == 0) {
        }
        i8 = i13 | 3456;
        if ((306783379 & i7) != 306783378) {
        }
        c0216p.P();
        if ((i2 & 1) != 0) {
        }
        S.l lVar2 = S.l.f3977a;
        if (i12 != 0) {
        }
        float f72 = AbstractC0114a.f1698a;
        Z.P a42 = AbstractC0146k1.a(F.c.f2376a, c0216p);
        long d42 = M.d(F.c.f2381f, c0216p);
        long d52 = M.d(F.c.f2377b, c0216p);
        long d62 = M.d(F.c.f2379d, c0216p);
        i9 = i8 & (-127);
        function26 = function25;
        p5 = a42;
        f5 = AbstractC0114a.f1698a;
        function27 = null;
        wVar2 = new P0.w();
        j8 = d42;
        j9 = d52;
        j10 = d62;
        oVar2 = lVar2;
        i10 = i7 & (-1908408321);
        c0216p.r();
        AbstractC0150m.c(function0, aVar, oVar2, function26, function27, function23, function24, p5, j4, j8, j9, j10, f5, wVar2, c0216p, i10 & 2147483646, i9 & 8190);
        oVar3 = oVar2;
        function28 = function26;
        function29 = function27;
        p6 = p5;
        j11 = j8;
        j12 = j9;
        j13 = j10;
        f6 = f5;
        wVar3 = wVar2;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function0 function0, S.o oVar, boolean z4, Z.P p4, C0156o c0156o, C0170t c0170t, C0847u c0847u, InterfaceC1021Z interfaceC1021Z, C0935k c0935k, L2.c cVar, C0216p c0216p, int i2, int i4) {
        int i5;
        S.o oVar2;
        int i6;
        boolean z5;
        int i7;
        C0847u c0847u2;
        int i8;
        int i9;
        Z.P p5;
        C0170t c0170t2;
        C0935k c0935k2;
        InterfaceC1021Z interfaceC1021Z2;
        S.o oVar3;
        Z.P p6;
        C0847u c0847u3;
        int i10;
        boolean z6;
        C0170t c0170t3;
        C0935k c0935k3;
        C0935k c0935k4;
        C0935k c0935k5;
        int i11;
        C0170t c0170t4;
        ?? r32;
        boolean z7;
        Z.P p7;
        C0847u c0847u4;
        InterfaceC1021Z interfaceC1021Z3;
        C0935k c0935k6;
        C0170t c0170t5;
        S.o oVar4;
        C0222s0 s4;
        int i12;
        int i13;
        c0216p.U(650121315);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i14 = 2 & i4;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            oVar2 = oVar;
            i5 |= c0216p.f(oVar2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z5 = z4;
                i5 |= c0216p.g(z5) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i4 & 8) == 0 && c0216p.f(p4)) {
                        i13 = 2048;
                        i5 |= i13;
                    }
                    i13 = 1024;
                    i5 |= i13;
                }
                if ((i2 & 24576) == 0) {
                    i5 |= c0216p.f(c0156o) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    if ((i4 & 32) == 0 && c0216p.f(c0170t)) {
                        i12 = 131072;
                        i5 |= i12;
                    }
                    i12 = 65536;
                    i5 |= i12;
                }
                i7 = i4 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                    c0847u2 = c0847u;
                } else {
                    c0847u2 = c0847u;
                    if ((i2 & 1572864) == 0) {
                        i5 |= c0216p.f(c0847u2) ? 1048576 : 524288;
                    }
                }
                i8 = 128 & i4;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= c0216p.f(interfaceC1021Z) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= c0216p.f(c0935k) ? 67108864 : 33554432;
                }
                if ((i2 & 805306368) == 0) {
                    i5 |= c0216p.h(cVar) ? 536870912 : 268435456;
                }
                if ((i5 & 306783379) == 306783378 || !c0216p.z()) {
                    c0216p.P();
                    C0788n c0788n = null;
                    if ((i2 & 1) != 0 || c0216p.y()) {
                        S.o oVar5 = i14 != 0 ? S.l.f3977a : oVar2;
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if ((i4 & 8) != 0) {
                            q.a0 a0Var = AbstractC0159p.f1957a;
                            p5 = AbstractC0146k1.a(F.i.f2397b, c0216p);
                            i5 &= -7169;
                        } else {
                            p5 = p4;
                        }
                        if ((32 & i4) != 0) {
                            q.a0 a0Var2 = AbstractC0159p.f1957a;
                            c0170t2 = new C0170t(F.i.f2396a, F.i.f2404i, F.i.f2401f, F.i.f2402g, F.i.f2399d);
                            i5 &= -458753;
                        } else {
                            c0170t2 = c0170t;
                        }
                        if (i7 != 0) {
                            c0847u2 = null;
                        }
                        InterfaceC1021Z interfaceC1021Z4 = i8 != 0 ? AbstractC0159p.f1957a : interfaceC1021Z;
                        if (i9 != 0) {
                            interfaceC1021Z2 = interfaceC1021Z4;
                            c0935k2 = null;
                        } else {
                            c0935k2 = c0935k;
                            interfaceC1021Z2 = interfaceC1021Z4;
                        }
                        oVar3 = oVar5;
                        p6 = p5;
                        c0847u3 = c0847u2;
                        i10 = i5;
                        z6 = z5;
                        c0170t3 = c0170t2;
                    } else {
                        c0216p.N();
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((32 & i4) != 0) {
                            i5 &= -458753;
                        }
                        p6 = p4;
                        interfaceC1021Z2 = interfaceC1021Z;
                        c0935k2 = c0935k;
                        c0847u3 = c0847u2;
                        i10 = i5;
                        oVar3 = oVar2;
                        z6 = z5;
                        c0170t3 = c0170t;
                    }
                    c0216p.r();
                    c0216p.S(-239156623);
                    Object obj = C0208l.f2826a;
                    if (c0935k2 == null) {
                        Object I3 = c0216p.I();
                        if (I3 == obj) {
                            I3 = new C0935k();
                            c0216p.c0(I3);
                        }
                        c0935k3 = (C0935k) I3;
                    } else {
                        c0935k3 = c0935k2;
                    }
                    c0216p.q(false);
                    long j4 = z6 ? c0156o.f1934a : c0156o.f1936c;
                    long j5 = z6 ? c0156o.f1935b : c0156o.f1937d;
                    c0216p.S(-239150048);
                    if (c0170t3 == null) {
                        r32 = 0;
                        c0935k5 = c0935k3;
                        i11 = i10;
                        c0170t4 = c0170t3;
                    } else {
                        int i15 = ((i10 >> 6) & 14) | ((i10 >> 9) & 896);
                        Object I4 = c0216p.I();
                        if (I4 == obj) {
                            I4 = new Q.v();
                            c0216p.c0(I4);
                        }
                        Q.v vVar = (Q.v) I4;
                        boolean f4 = c0216p.f(c0935k3);
                        Object I5 = c0216p.I();
                        if (f4 || I5 == obj) {
                            I5 = new r(c0935k3, vVar, null);
                            c0216p.c0(I5);
                        }
                        C0192d.e(c0216p, c0935k3, (Function2) I5);
                        InterfaceC0933i interfaceC0933i = (InterfaceC0933i) C1403G.y(vVar);
                        float f5 = !z6 ? c0170t3.f2024e : interfaceC0933i instanceof C0937m ? c0170t3.f2021b : interfaceC0933i instanceof C0931g ? c0170t3.f2023d : interfaceC0933i instanceof C0928d ? c0170t3.f2022c : c0170t3.f2020a;
                        Object I6 = c0216p.I();
                        if (I6 == obj) {
                            c0935k4 = c0935k3;
                            I6 = new C0778d(new M0.e(f5), l.w0.f7858c, null, 12);
                            c0216p.c0(I6);
                        } else {
                            c0935k4 = c0935k3;
                        }
                        C0778d c0778d = (C0778d) I6;
                        M0.e eVar = new M0.e(f5);
                        boolean h4 = c0216p.h(c0778d) | c0216p.c(f5) | ((((i15 & 14) ^ 6) > 4 && c0216p.g(z6)) || (i15 & 6) == 4) | ((((i15 & 896) ^ 384) > 256 && c0216p.f(c0170t3)) || (i15 & 384) == 256) | c0216p.h(interfaceC0933i);
                        Object I7 = c0216p.I();
                        if (h4 || I7 == obj) {
                            c0935k5 = c0935k4;
                            i11 = i10;
                            c0170t4 = c0170t3;
                            I7 = new C0167s(c0778d, f5, z6, c0170t3, interfaceC0933i, null);
                            c0216p.c0(I7);
                        } else {
                            i11 = i10;
                            c0170t4 = c0170t3;
                            c0935k5 = c0935k4;
                        }
                        C0192d.e(c0216p, eVar, (Function2) I7);
                        c0788n = c0778d.f7700c;
                        r32 = 0;
                    }
                    c0216p.q(r32);
                    AbstractC0161p1.b(function0, y0.k.a(oVar3, C0173u.f2032e), z6, p6, j4, j5, 0.0f, c0788n != null ? ((M0.e) c0788n.f7813e.getValue()).f3545d : (float) r32, c0847u3, c0935k5, O.f.b(956488494, new C0176v(j5, interfaceC1021Z2, cVar, 0), c0216p), c0216p, (i11 & 8078) | (234881024 & (i11 << 6)), 64);
                    z7 = z6;
                    p7 = p6;
                    c0847u4 = c0847u3;
                    interfaceC1021Z3 = interfaceC1021Z2;
                    c0935k6 = c0935k2;
                    c0170t5 = c0170t4;
                    oVar4 = oVar3;
                } else {
                    c0216p.N();
                    p7 = p4;
                    c0170t5 = c0170t;
                    interfaceC1021Z3 = interfaceC1021Z;
                    c0847u4 = c0847u2;
                    oVar4 = oVar2;
                    z7 = z5;
                    c0935k6 = c0935k;
                }
                s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C0178w(function0, oVar4, z7, p7, c0156o, c0170t5, c0847u4, interfaceC1021Z3, c0935k6, cVar, i2, i4, 0);
                    return;
                }
                return;
            }
            z5 = z4;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i7 = i4 & 64;
            if (i7 != 0) {
            }
            i8 = 128 & i4;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            c0216p.P();
            C0788n c0788n2 = null;
            if ((i2 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i4 & 8) != 0) {
            }
            if ((32 & i4) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            oVar3 = oVar5;
            p6 = p5;
            c0847u3 = c0847u2;
            i10 = i5;
            z6 = z5;
            c0170t3 = c0170t2;
            c0216p.r();
            c0216p.S(-239156623);
            Object obj2 = C0208l.f2826a;
            if (c0935k2 == null) {
            }
            c0216p.q(false);
            long j42 = z6 ? c0156o.f1934a : c0156o.f1936c;
            long j52 = z6 ? c0156o.f1935b : c0156o.f1937d;
            c0216p.S(-239150048);
            if (c0170t3 == null) {
            }
            c0216p.q(r32);
            AbstractC0161p1.b(function0, y0.k.a(oVar3, C0173u.f2032e), z6, p6, j42, j52, 0.0f, c0788n2 != null ? ((M0.e) c0788n2.f7813e.getValue()).f3545d : (float) r32, c0847u3, c0935k5, O.f.b(956488494, new C0176v(j52, interfaceC1021Z2, cVar, 0), c0216p), c0216p, (i11 & 8078) | (234881024 & (i11 << 6)), 64);
            z7 = z6;
            p7 = p6;
            c0847u4 = c0847u3;
            interfaceC1021Z3 = interfaceC1021Z2;
            c0935k6 = c0935k2;
            c0170t5 = c0170t4;
            oVar4 = oVar3;
            s4 = c0216p.s();
            if (s4 != null) {
            }
        }
        oVar2 = oVar;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z5 = z4;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i7 = i4 & 64;
        if (i7 != 0) {
        }
        i8 = 128 & i4;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        c0216p.P();
        C0788n c0788n22 = null;
        if ((i2 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i4 & 8) != 0) {
        }
        if ((32 & i4) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        oVar3 = oVar5;
        p6 = p5;
        c0847u3 = c0847u2;
        i10 = i5;
        z6 = z5;
        c0170t3 = c0170t2;
        c0216p.r();
        c0216p.S(-239156623);
        Object obj22 = C0208l.f2826a;
        if (c0935k2 == null) {
        }
        c0216p.q(false);
        long j422 = z6 ? c0156o.f1934a : c0156o.f1936c;
        long j522 = z6 ? c0156o.f1935b : c0156o.f1937d;
        c0216p.S(-239150048);
        if (c0170t3 == null) {
        }
        c0216p.q(r32);
        AbstractC0161p1.b(function0, y0.k.a(oVar3, C0173u.f2032e), z6, p6, j422, j522, 0.0f, c0788n22 != null ? ((M0.e) c0788n22.f7813e.getValue()).f3545d : (float) r32, c0847u3, c0935k5, O.f.b(956488494, new C0176v(j522, interfaceC1021Z2, cVar, 0), c0216p), c0216p, (i11 & 8078) | (234881024 & (i11 << 6)), 64);
        z7 = z6;
        p7 = p6;
        c0847u4 = c0847u3;
        interfaceC1021Z3 = interfaceC1021Z2;
        c0935k6 = c0935k2;
        c0170t5 = c0170t4;
        oVar4 = oVar3;
        s4 = c0216p.s();
        if (s4 != null) {
        }
    }

    public static final void c(S.o oVar, Z.P p4, C0182y c0182y, C0184z c0184z, C0847u c0847u, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(1179621553);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(p4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(c0182y) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.f(c0184z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.f(c0847u) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i2 & 1) != 0 && !c0216p.y()) {
                c0216p.N();
            }
            c0216p.r();
            long j4 = c0182y.f2103a;
            c0184z.getClass();
            c0216p.S(-1763481333);
            c0216p.S(-734838460);
            G.W w4 = C0208l.f2826a;
            Object I3 = c0216p.I();
            if (I3 == w4) {
                I3 = C0192d.K(new M0.e(c0184z.f2119a), G.W.f2779l);
                c0216p.c0(I3);
            }
            c0216p.q(false);
            c0216p.q(false);
            AbstractC0161p1.a(oVar, p4, j4, c0182y.f2104b, 0.0f, ((M0.e) ((InterfaceC0191c0) I3).getValue()).f3545d, c0847u, O.f.b(664103990, new A(aVar, 0), c0216p), c0216p, (i4 & 14) | 12582912 | (i4 & 112) | ((i4 << 6) & 3670016), 16);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new B(oVar, p4, c0182y, c0184z, c0847u, aVar, i2);
        }
    }

    public static final void d(Function0 function0, S.o oVar, boolean z4, Z.P p4, C0156o c0156o, C0170t c0170t, C0847u c0847u, InterfaceC1021Z interfaceC1021Z, C0935k c0935k, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        boolean z5;
        int i5;
        InterfaceC1021Z interfaceC1021Z2;
        Z.P p5;
        C0847u c0847u2;
        C0935k c0935k2;
        C0170t c0170t2;
        S.o oVar2;
        S.o oVar3;
        boolean z6;
        Z.P p6;
        C0170t c0170t3;
        C0847u c0847u3;
        InterfaceC1021Z interfaceC1021Z3;
        C0935k c0935k3;
        c0216p.U(-1717924381);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 = i4 | 1456;
        }
        if ((i2 & 24576) == 0) {
            i6 |= c0216p.f(c0156o) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= 65536;
        }
        int i7 = 114819072 | i6;
        if ((805306368 & i2) == 0) {
            i7 |= c0216p.h(aVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i7) == 306783378 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            z6 = z4;
            p6 = p4;
            c0170t3 = c0170t;
            c0847u3 = c0847u;
            interfaceC1021Z3 = interfaceC1021Z;
            c0935k3 = c0935k;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                S.l lVar = S.l.f3977a;
                q.a0 a0Var = AbstractC0159p.f1957a;
                Z.P a4 = AbstractC0146k1.a(F.k.f2414b, c0216p);
                C0170t c0170t4 = new C0170t(F.k.f2413a, F.k.f2420h, F.k.f2417e, F.k.f2418f, 0);
                z5 = true;
                i5 = i7 & (-465921);
                interfaceC1021Z2 = AbstractC0159p.f1957a;
                p5 = a4;
                c0847u2 = null;
                c0935k2 = null;
                c0170t2 = c0170t4;
                oVar2 = lVar;
            } else {
                c0216p.N();
                i5 = i7 & (-465921);
                oVar2 = oVar;
                z5 = z4;
                p5 = p4;
                c0170t2 = c0170t;
                c0847u2 = c0847u;
                interfaceC1021Z2 = interfaceC1021Z;
                c0935k2 = c0935k;
            }
            c0216p.r();
            b(function0, oVar2, z5, p5, c0156o, c0170t2, c0847u2, interfaceC1021Z2, c0935k2, aVar, c0216p, i5 & 2147483646, 0);
            oVar3 = oVar2;
            z6 = z5;
            p6 = p5;
            c0170t3 = c0170t2;
            c0847u3 = c0847u2;
            interfaceC1021Z3 = interfaceC1021Z2;
            c0935k3 = c0935k2;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0180x(function0, oVar3, z6, p6, c0156o, c0170t3, c0847u3, interfaceC1021Z3, c0935k3, aVar, i2, 0);
        }
    }

    public static final void e(S.o oVar, float f4, long j4, C0216p c0216p, int i2) {
        S.o oVar2;
        float f5;
        long d4;
        int i4;
        S.o oVar3;
        float f6;
        long j5;
        c0216p.U(75144485);
        int i5 = i2 | 54;
        if ((i2 & 384) == 0) {
            i5 = i2 | 182;
        }
        if ((i5 & 147) == 146 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            f6 = f4;
            j5 = j4;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                oVar2 = S.l.f3977a;
                f5 = W.f1670a;
                float f7 = F.d.f2382a;
                d4 = M.d(25, c0216p);
                i4 = i5 & (-897);
            } else {
                c0216p.N();
                i4 = i5 & (-897);
                oVar2 = oVar;
                f5 = f4;
                d4 = j4;
            }
            c0216p.r();
            S.o b4 = androidx.compose.foundation.layout.c.b(oVar2.h(androidx.compose.foundation.layout.c.f5081a), f5);
            boolean e4 = ((i4 & 112) == 32) | c0216p.e(d4);
            Object I3 = c0216p.I();
            if (e4 || I3 == C0208l.f2826a) {
                I3 = new X(f5, d4);
                c0216p.c0(I3);
            }
            u3.l.H(b4, (Function1) I3, c0216p, 0);
            oVar3 = oVar2;
            f6 = f5;
            j5 = d4;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new Y(oVar3, f6, j5, i2);
        }
    }

    public static final void f(Function0 function0, S.o oVar, boolean z4, C0154n0 c0154n0, C0935k c0935k, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        S.o oVar2;
        int i5;
        C0935k c0935k2;
        C0154n0 c0154n02;
        boolean z5;
        boolean z6;
        C0154n0 c0154n03;
        c0216p.U(-1142896114);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 = i4 | 1456;
        }
        int i7 = i6 | 24576;
        if ((196608 & i2) == 0) {
            i7 |= c0216p.h(function2) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && c0216p.z()) {
            c0216p.N();
            oVar2 = oVar;
            z6 = z4;
            c0154n03 = c0154n0;
            c0935k2 = c0935k;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                oVar2 = S.l.f3977a;
                c0216p.S(-1519621781);
                long j4 = ((C0323u) c0216p.k(S.f1616a)).f4549a;
                K k4 = (K) c0216p.k(M.f1481a);
                C0154n0 c0154n04 = k4.f1371Q;
                if (c0154n04 == null) {
                    long j5 = C0323u.f4546f;
                    c0154n04 = new C0154n0(j5, j4, j5, C0323u.b(0.38f, j4));
                    k4.f1371Q = c0154n04;
                }
                long j6 = c0154n04.f1921b;
                if (C0323u.c(j6, j4)) {
                    c0216p.q(false);
                } else {
                    long b4 = C0323u.b(0.38f, j4);
                    C0154n0 c0154n05 = new C0154n0(c0154n04.f1920a, j4 != 16 ? j4 : j6, c0154n04.f1922c, b4 != 16 ? b4 : c0154n04.f1923d);
                    c0216p.q(false);
                    c0154n04 = c0154n05;
                }
                i5 = i7 & (-7169);
                c0935k2 = null;
                c0154n02 = c0154n04;
                z5 = true;
            } else {
                c0216p.N();
                oVar2 = oVar;
                c0154n02 = c0154n0;
                c0935k2 = c0935k;
                i5 = i7 & (-7169);
                z5 = z4;
            }
            c0216p.r();
            G.Y0 y02 = AbstractC0168s0.f2009a;
            S.o h4 = oVar2.h(MinimumInteractiveModifier.f5147a);
            float f4 = F.m.f2443b;
            C0154n0 c0154n06 = c0154n02;
            S.o d4 = androidx.compose.foundation.a.d(androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(h4, f4), AbstractC0146k1.a(5, c0216p)), z5 ? c0154n02.f1920a : c0154n02.f1922c, Z.K.f4461a), c0935k2, X0.a(false, f4 / 2, 0L, c0216p, 54, 4), z5, new y0.f(0), function0, 8);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3956k, false);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d5 = S.a.d(c0216p, d4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                AbstractC0017m.r(i8, c0216p, i8, c1067h);
            }
            C0192d.R(c0216p, d5, C1069j.f9818d);
            C0192d.a(S.f1616a.a(new C0323u(z5 ? c0154n06.f1921b : c0154n06.f1923d)), function2, c0216p, ((i5 >> 12) & 112) | 8);
            c0216p.q(true);
            z6 = z5;
            c0154n03 = c0154n06;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0157o0(function0, oVar2, z6, c0154n03, c0935k2, function2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(Function0 function0, S.o oVar, boolean z4, Z.P p4, C0156o c0156o, C0170t c0170t, C0847u c0847u, InterfaceC1021Z interfaceC1021Z, C0935k c0935k, O.a aVar, C0216p c0216p, int i2, int i4) {
        int i5;
        S.o oVar2;
        C0156o c0156o2;
        int i6;
        boolean z5;
        Z.P p5;
        int i7;
        C0156o c0156o3;
        S.o oVar3;
        C0847u c0847u2;
        InterfaceC1021Z interfaceC1021Z2;
        C0170t c0170t2;
        C0935k c0935k2;
        S.o oVar4;
        boolean z6;
        Z.P p6;
        C0156o c0156o4;
        C0170t c0170t3;
        C0847u c0847u3;
        InterfaceC1021Z interfaceC1021Z3;
        C0935k c0935k3;
        C0222s0 s4;
        int i8;
        c0216p.U(-1694808287);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i4 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            oVar2 = oVar;
            i5 |= c0216p.f(oVar2) ? 32 : 16;
            int i10 = i5 | 384;
            if ((i2 & 3072) == 0) {
                i10 = i5 | 1408;
            }
            if ((i2 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    c0156o2 = c0156o;
                    if (c0216p.f(c0156o2)) {
                        i8 = 16384;
                        i10 |= i8;
                    }
                } else {
                    c0156o2 = c0156o;
                }
                i8 = 8192;
                i10 |= i8;
            } else {
                c0156o2 = c0156o;
            }
            int i11 = 196608 | i10;
            if ((1572864 & i2) == 0) {
                i11 = 720896 | i10;
            }
            i6 = 113246208 | i11;
            if ((805306368 & i2) == 0) {
                i6 |= c0216p.h(aVar) ? 536870912 : 268435456;
            }
            if ((306783379 & i6) == 306783378 || !c0216p.z()) {
                c0216p.P();
                if ((i2 & 1) != 0 || c0216p.y()) {
                    if (i9 != 0) {
                        oVar2 = S.l.f3977a;
                    }
                    q.a0 a0Var = AbstractC0159p.f1957a;
                    float f4 = F.p.f2453a;
                    Z.P a4 = AbstractC0146k1.a(5, c0216p);
                    int i12 = i6 & (-7169);
                    if ((i4 & 16) != 0) {
                        i12 = i6 & (-64513);
                        c0156o2 = AbstractC0159p.c((K) c0216p.k(M.f1481a));
                    }
                    float f5 = F.p.f2453a;
                    c0216p.S(-855870548);
                    long d4 = M.d(24, c0216p);
                    c0216p.q(false);
                    z5 = true;
                    p5 = a4;
                    i7 = i12 & (-3670017);
                    c0156o3 = c0156o2;
                    oVar3 = oVar2;
                    c0847u2 = new C0847u(f5, new Z.S(d4));
                    interfaceC1021Z2 = AbstractC0159p.f1957a;
                    c0170t2 = null;
                    c0935k2 = null;
                } else {
                    c0216p.N();
                    int i13 = i6 & (-7169);
                    if ((i4 & 16) != 0) {
                        i13 = i6 & (-64513);
                    }
                    i7 = i13 & (-3670017);
                    z5 = z4;
                    p5 = p4;
                    c0170t2 = c0170t;
                    c0847u2 = c0847u;
                    interfaceC1021Z2 = interfaceC1021Z;
                    c0935k2 = c0935k;
                    c0156o3 = c0156o2;
                    oVar3 = oVar2;
                }
                c0216p.r();
                b(function0, oVar3, z5, p5, c0156o3, c0170t2, c0847u2, interfaceC1021Z2, c0935k2, aVar, c0216p, i7 & 2147483646, 0);
                oVar4 = oVar3;
                z6 = z5;
                p6 = p5;
                c0156o4 = c0156o3;
                c0170t3 = c0170t2;
                c0847u3 = c0847u2;
                interfaceC1021Z3 = interfaceC1021Z2;
                c0935k3 = c0935k2;
            } else {
                c0216p.N();
                c0170t3 = c0170t;
                c0847u3 = c0847u;
                interfaceC1021Z3 = interfaceC1021Z;
                c0935k3 = c0935k;
                c0156o4 = c0156o2;
                oVar4 = oVar2;
                z6 = z4;
                p6 = p4;
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new C0178w(function0, oVar4, z6, p6, c0156o4, c0170t3, c0847u3, interfaceC1021Z3, c0935k3, aVar, i2, i4, 1);
                return;
            }
            return;
        }
        oVar2 = oVar;
        int i102 = i5 | 384;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        int i112 = 196608 | i102;
        if ((1572864 & i2) == 0) {
        }
        i6 = 113246208 | i112;
        if ((805306368 & i2) == 0) {
        }
        if ((306783379 & i6) == 306783378) {
        }
        c0216p.P();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        q.a0 a0Var2 = AbstractC0159p.f1957a;
        float f42 = F.p.f2453a;
        Z.P a42 = AbstractC0146k1.a(5, c0216p);
        int i122 = i6 & (-7169);
        if ((i4 & 16) != 0) {
        }
        float f52 = F.p.f2453a;
        c0216p.S(-855870548);
        long d42 = M.d(24, c0216p);
        c0216p.q(false);
        z5 = true;
        p5 = a42;
        i7 = i122 & (-3670017);
        c0156o3 = c0156o2;
        oVar3 = oVar2;
        c0847u2 = new C0847u(f52, new Z.S(d42));
        interfaceC1021Z2 = AbstractC0159p.f1957a;
        c0170t2 = null;
        c0935k2 = null;
        c0216p.r();
        b(function0, oVar3, z5, p5, c0156o3, c0170t2, c0847u2, interfaceC1021Z2, c0935k2, aVar, c0216p, i7 & 2147483646, 0);
        oVar4 = oVar3;
        z6 = z5;
        p6 = p5;
        c0156o4 = c0156o3;
        c0170t3 = c0170t2;
        c0847u3 = c0847u2;
        interfaceC1021Z3 = interfaceC1021Z2;
        c0935k3 = c0935k2;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final void h(Function0 function0, S.o oVar, boolean z4, Z.P p4, C0156o c0156o, C0170t c0170t, C0847u c0847u, InterfaceC1021Z interfaceC1021Z, C0935k c0935k, L2.c cVar, C0216p c0216p, int i2) {
        int i4;
        boolean z5;
        int i5;
        S.o oVar2;
        InterfaceC1021Z interfaceC1021Z2;
        Z.P p5;
        C0170t c0170t2;
        C0847u c0847u2;
        C0935k c0935k2;
        C0156o c0156o2;
        S.o oVar3;
        boolean z6;
        Z.P p6;
        C0156o c0156o3;
        C0170t c0170t3;
        C0847u c0847u3;
        InterfaceC1021Z interfaceC1021Z3;
        C0935k c0935k3;
        c0216p.U(-2106428362);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 = i4 | 1456;
        }
        if ((i2 & 24576) == 0) {
            i6 |= 8192;
        }
        int i7 = 115015680 | i6;
        if ((805306368 & i2) == 0) {
            i7 |= c0216p.h(cVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i7) == 306783378 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            z6 = z4;
            p6 = p4;
            c0156o3 = c0156o;
            c0170t3 = c0170t;
            c0847u3 = c0847u;
            interfaceC1021Z3 = interfaceC1021Z;
            c0935k3 = c0935k;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                S.l lVar = S.l.f3977a;
                q.a0 a0Var = AbstractC0159p.f1957a;
                Z.P a4 = AbstractC0146k1.a(5, c0216p);
                K k4 = (K) c0216p.k(M.f1481a);
                C0156o c0156o4 = k4.f1368N;
                if (c0156o4 == null) {
                    long j4 = C0323u.f4546f;
                    c0156o4 = new C0156o(j4, M.c(k4, 26), j4, C0323u.b(0.38f, M.c(k4, 18)));
                    k4.f1368N = c0156o4;
                }
                z5 = true;
                i5 = i7 & (-64513);
                oVar2 = lVar;
                interfaceC1021Z2 = AbstractC0159p.f1958b;
                p5 = a4;
                c0170t2 = null;
                c0847u2 = null;
                c0935k2 = null;
                c0156o2 = c0156o4;
            } else {
                c0216p.N();
                i5 = i7 & (-64513);
                oVar2 = oVar;
                z5 = z4;
                p5 = p4;
                c0156o2 = c0156o;
                c0170t2 = c0170t;
                c0847u2 = c0847u;
                interfaceC1021Z2 = interfaceC1021Z;
                c0935k2 = c0935k;
            }
            c0216p.r();
            b(function0, oVar2, z5, p5, c0156o2, c0170t2, c0847u2, interfaceC1021Z2, c0935k2, cVar, c0216p, i5 & 2147483646, 0);
            oVar3 = oVar2;
            z6 = z5;
            p6 = p5;
            c0156o3 = c0156o2;
            c0170t3 = c0170t2;
            c0847u3 = c0847u2;
            interfaceC1021Z3 = interfaceC1021Z2;
            c0935k3 = c0935k2;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0180x(function0, oVar3, z6, p6, c0156o3, c0170t3, c0847u3, interfaceC1021Z3, c0935k3, cVar, i2, 1);
        }
    }

    public static C0164q1 i(long j4, long j5, C0216p c0216p) {
        long j6 = C0323u.f4546f;
        float f4 = F.t.f2506a;
        long d4 = M.d(11, c0216p);
        long d5 = M.d(24, c0216p);
        long d6 = M.d(39, c0216p);
        long d7 = M.d(24, c0216p);
        long d8 = M.d(39, c0216p);
        long b4 = C0323u.b(1.0f, M.d(35, c0216p));
        G.Y0 y02 = M.f1481a;
        return new C0164q1(j4, j5, j6, d4, d5, d6, d7, d8, Z.K.l(b4, ((K) c0216p.k(y02)).f1389p), Z.K.l(C0323u.b(0.12f, M.d(18, c0216p)), ((K) c0216p.k(y02)).f1389p), j6, Z.K.l(C0323u.b(0.38f, M.d(18, c0216p)), ((K) c0216p.k(y02)).f1389p), Z.K.l(C0323u.b(0.38f, M.d(18, c0216p)), ((K) c0216p.k(y02)).f1389p), Z.K.l(C0323u.b(0.12f, M.d(39, c0216p)), ((K) c0216p.k(y02)).f1389p), Z.K.l(C0323u.b(0.12f, M.d(18, c0216p)), ((K) c0216p.k(y02)).f1389p), Z.K.l(C0323u.b(0.38f, M.d(39, c0216p)), ((K) c0216p.k(y02)).f1389p));
    }
}
