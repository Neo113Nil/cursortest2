package E;

import A.AbstractC0017m;
import A.C0022s;
import A.g0;
import A0.C0036g;
import A0.L;
import B1.C0097d;
import D.C0176v;
import D.K1;
import D.S;
import D.S0;
import D.T1;
import D.U1;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.N0;
import G.W;
import G.X0;
import G0.F;
import Z.C0323u;
import a0.AbstractC0348c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;
import l.InterfaceC0799z;
import l.j0;
import l.m0;
import l.s0;
import l.t0;
import l.u0;
import l.v0;
import l.w0;
import p.InterfaceC0934j;
import p0.AbstractC0954O;
import p0.C0981q;
import p0.InterfaceC0944E;
import q.InterfaceC1021Z;
import y2.C1338m;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: b, reason: collision with root package name */
    public static final float f2252b;

    /* renamed from: g, reason: collision with root package name */
    public static final float f2257g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f2258h;

    /* renamed from: i, reason: collision with root package name */
    public static final S.o f2259i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f2251a = u3.d.a(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final float f2253c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2254d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2255e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2256f = 24;

    static {
        float f4 = 16;
        f2252b = f4;
        f2257g = f4;
        f2258h = f4;
        float f5 = 48;
        f2259i = androidx.compose.foundation.layout.c.a(S.l.f3977a, f5, f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x03fc, code lost:
    
        if (r36 != false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0386, code lost:
    
        if (r36 != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x035a, code lost:
    
        if (r36 != false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x045a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x076b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i2, int i4, C0022s c0022s, K1 k12, C0216p c0216p, String str, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, Function2 function29, InterfaceC0934j interfaceC0934j, InterfaceC1021Z interfaceC1021Z, boolean z4, boolean z5, boolean z6) {
        int i5;
        int i6;
        Object f4;
        float f5;
        int ordinal;
        L l4;
        float f6;
        L l5;
        int ordinal2;
        int i7;
        float f7;
        int ordinal3;
        float f8;
        int ordinal4;
        float f9;
        int ordinal5;
        int[] iArr;
        boolean f10;
        Object I3;
        c cVar;
        int[] iArr2;
        long j4;
        boolean f11;
        Object I4;
        float floatValue;
        Object I5;
        W w4;
        j0 j0Var;
        W w5;
        O.a aVar;
        Object I6;
        j0 j0Var2;
        float f12;
        O.a aVar2;
        boolean z7;
        O.a b4;
        Object f13;
        boolean c4;
        Object I7;
        w wVar = w.f2260d;
        c0216p.U(1514469103);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.f(wVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.h(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= c0216p.f(c0022s) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= c0216p.h(function22) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= c0216p.h(function23) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= c0216p.h(function24) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= c0216p.h(function25) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= c0216p.h(function26) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= c0216p.h(function27) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0216p.h(function28) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0216p.g(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0216p.g(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0216p.g(z6) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0216p.f(interfaceC0934j) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= c0216p.f(interfaceC1021Z) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c0216p.f(k12) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= c0216p.h(function29) ? 8388608 : 4194304;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 4793491) == 4793490 && c0216p.z()) {
            c0216p.N();
        } else {
            int i8 = i5;
            boolean z8 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048);
            Object I8 = c0216p.I();
            W w6 = C0208l.f2826a;
            if (z8 || I8 == w6) {
                C0036g c0036g = new C0036g(str, null, 6);
                c0022s.getClass();
                f4 = new F(c0036g, G0.r.f3078a);
                c0216p.c0(f4);
            } else {
                f4 = I8;
            }
            String str2 = ((F) f4).f3027a.f328a;
            boolean booleanValue = ((Boolean) m3.u.e(interfaceC0934j, c0216p, (i6 >> 12) & 14).getValue()).booleanValue();
            c cVar2 = booleanValue ? c.f2177d : str2.length() == 0 ? c.f2178e : c.f2179i;
            long j5 = !z5 ? k12.f1461z : z6 ? k12.f1420A : booleanValue ? k12.f1459x : k12.f1460y;
            T1 t12 = (T1) c0216p.k(U1.f1662a);
            L l6 = t12.f1650j;
            long b5 = l6.b();
            long j6 = C0323u.f4547g;
            boolean c5 = C0323u.c(b5, j6);
            L l7 = t12.f1652l;
            boolean z9 = (c5 && !C0323u.c(l7.b(), j6)) || (!C0323u.c(l6.b(), j6) && C0323u.c(l7.b(), j6));
            long b6 = l7.b();
            long j7 = (z9 && b6 == 16) ? j5 : b6;
            long b7 = l6.b();
            long j8 = (z9 && b7 == 16) ? j5 : b7;
            boolean z10 = function22 != null;
            m0 c6 = s0.c(cVar2, "TextFieldInputState", c0216p, 48, 0);
            v0 v0Var = w0.f7856a;
            t0 t0Var = c6.f7800a;
            c cVar3 = (c) t0Var.l();
            c0216p.S(-2036730335);
            int ordinal6 = cVar3.ordinal();
            float f14 = 0.0f;
            if (ordinal6 != 0) {
                if (ordinal6 == 1) {
                    f5 = 0.0f;
                    c0216p.q(false);
                    Float valueOf = Float.valueOf(f5);
                    C0205j0 c0205j0 = c6.f7803d;
                    c cVar4 = (c) c0205j0.getValue();
                    c0216p.S(-2036730335);
                    ordinal = cVar4.ordinal();
                    if (ordinal == 0) {
                        l4 = l6;
                        if (ordinal == 1) {
                            f6 = 0.0f;
                            c0216p.q(false);
                            Float valueOf2 = Float.valueOf(f6);
                            c6.f();
                            c0216p.S(1276209157);
                            u0 j9 = AbstractC0779e.j(150, 0, null, 6);
                            c0216p.q(false);
                            l5 = l4;
                            j0 b8 = s0.b(c6, valueOf, valueOf2, j9, v0Var, c0216p, 196608);
                            t tVar = t.f2249d;
                            c cVar5 = (c) t0Var.l();
                            c0216p.S(1435837472);
                            ordinal2 = cVar5.ordinal();
                            if (ordinal2 != 0) {
                                i7 = 1;
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        throw new C1338m();
                                    }
                                }
                                f7 = 0.0f;
                                c0216p.q(false);
                                Float valueOf3 = Float.valueOf(f7);
                                c cVar6 = (c) c0205j0.getValue();
                                c0216p.S(1435837472);
                                ordinal3 = cVar6.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != i7) {
                                        if (ordinal3 != 2) {
                                            throw new C1338m();
                                        }
                                    }
                                    f8 = 0.0f;
                                    c0216p.q(false);
                                    j0 b9 = s0.b(c6, valueOf3, Float.valueOf(f8), (InterfaceC0799z) tVar.g(c6.f(), c0216p, 0), v0Var, c0216p, 196608);
                                    c cVar7 = (c) t0Var.l();
                                    c0216p.S(1128033978);
                                    ordinal4 = cVar7.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                throw new C1338m();
                                            }
                                        } else if (z10) {
                                            f9 = 0.0f;
                                            c0216p.q(false);
                                            Float valueOf4 = Float.valueOf(f9);
                                            c cVar8 = (c) c0205j0.getValue();
                                            c0216p.S(1128033978);
                                            ordinal5 = cVar8.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        throw new C1338m();
                                                    }
                                                }
                                            }
                                            f14 = 1.0f;
                                            c0216p.q(false);
                                            Float valueOf5 = Float.valueOf(f14);
                                            c6.f();
                                            c0216p.S(-1868044898);
                                            u0 j10 = AbstractC0779e.j(150, 0, null, 6);
                                            c0216p.q(false);
                                            j0 b10 = s0.b(c6, valueOf4, valueOf5, j10, v0Var, c0216p, 196608);
                                            c cVar9 = (c) c0205j0.getValue();
                                            c0216p.S(-107432127);
                                            iArr = u.f2250a;
                                            long j11 = iArr[cVar9.ordinal()] != 1 ? j7 : j8;
                                            c0216p.q(false);
                                            AbstractC0348c f15 = C0323u.f(j11);
                                            f10 = c0216p.f(f15);
                                            I3 = c0216p.I();
                                            if (!f10 || I3 == w6) {
                                                v0 v0Var2 = new v0(k.u.f7326e, new g0(15, f15));
                                                c0216p.c0(v0Var2);
                                                I3 = v0Var2;
                                            }
                                            v0 v0Var3 = (v0) I3;
                                            cVar = (c) t0Var.l();
                                            c0216p.S(-107432127);
                                            if (iArr[cVar.ordinal()] != 1) {
                                                iArr2 = iArr;
                                                j4 = j7;
                                            } else {
                                                iArr2 = iArr;
                                                j4 = j8;
                                            }
                                            c0216p.q(false);
                                            C0323u c0323u = new C0323u(j4);
                                            c cVar10 = (c) c0205j0.getValue();
                                            c0216p.S(-107432127);
                                            long j12 = iArr2[cVar10.ordinal()] != 1 ? j7 : j8;
                                            c0216p.q(false);
                                            C0323u c0323u2 = new C0323u(j12);
                                            c6.f();
                                            c0216p.S(1528582156);
                                            u0 j13 = AbstractC0779e.j(150, 0, null, 6);
                                            c0216p.q(false);
                                            j0 b11 = s0.b(c6, c0323u, c0323u2, j13, v0Var3, c0216p, 196608);
                                            c0216p.S(1023351670);
                                            c0216p.q(false);
                                            AbstractC0348c f16 = C0323u.f(j5);
                                            f11 = c0216p.f(f16);
                                            I4 = c0216p.I();
                                            if (!f11 || I4 == w6) {
                                                v0 v0Var4 = new v0(k.u.f7326e, new g0(15, f16));
                                                c0216p.c0(v0Var4);
                                                I4 = v0Var4;
                                            }
                                            v0 v0Var5 = (v0) I4;
                                            c0216p.S(1023351670);
                                            c0216p.q(false);
                                            C0323u c0323u3 = new C0323u(j5);
                                            c0216p.S(1023351670);
                                            c0216p.q(false);
                                            C0323u c0323u4 = new C0323u(j5);
                                            c6.f();
                                            c0216p.S(-543659263);
                                            u0 j14 = AbstractC0779e.j(150, 0, null, 6);
                                            c0216p.q(false);
                                            j0 b12 = s0.b(c6, c0323u3, c0323u4, j14, v0Var5, c0216p, 196608);
                                            floatValue = ((Number) b8.f7778p.getValue()).floatValue();
                                            c0216p.S(-156998101);
                                            O.a b13 = function22 != null ? null : O.f.b(-1236585568, new l(l5, l7, floatValue, b12, function22, z9, b11), c0216p);
                                            c0216p.q(false);
                                            long j15 = z5 ? k12.f1422D : z6 ? k12.f1423E : booleanValue ? k12.B : k12.f1421C;
                                            I5 = c0216p.I();
                                            w4 = W.f2779l;
                                            if (I5 != w6) {
                                                j0Var = b9;
                                                q qVar = new q(j0Var, 0);
                                                C0097d c0097d = N0.f2725a;
                                                G.F f17 = new G.F(w4, qVar);
                                                c0216p.c0(f17);
                                                I5 = f17;
                                            } else {
                                                j0Var = b9;
                                            }
                                            X0 x02 = (X0) I5;
                                            c0216p.S(-156965270);
                                            if (function23 == null && str2.length() == 0 && ((Boolean) x02.getValue()).booleanValue()) {
                                                w5 = w4;
                                                aVar = O.f.b(-660524084, new o(j0Var, j15, l5, function23), c0216p);
                                            } else {
                                                w5 = w4;
                                                aVar = null;
                                            }
                                            c0216p.q(false);
                                            long j16 = z5 ? k12.f1430L : z6 ? k12.f1431M : booleanValue ? k12.f1428J : k12.f1429K;
                                            I6 = c0216p.I();
                                            if (I6 != w6) {
                                                j0Var2 = b10;
                                                q qVar2 = new q(j0Var2, 1);
                                                C0097d c0097d2 = N0.f2725a;
                                                G.F f18 = new G.F(w5, qVar2);
                                                c0216p.c0(f18);
                                                I6 = f18;
                                            } else {
                                                j0Var2 = b10;
                                            }
                                            X0 x03 = (X0) I6;
                                            c0216p.S(-156940524);
                                            if (function26 == null && ((Boolean) x03.getValue()).booleanValue()) {
                                                f12 = floatValue;
                                                aVar2 = O.f.b(274398694, new p(j0Var2, j16, l5, function26, 0), c0216p);
                                            } else {
                                                f12 = floatValue;
                                                aVar2 = null;
                                            }
                                            c0216p.q(false);
                                            long j17 = z5 ? k12.f1434P : z6 ? k12.f1435Q : booleanValue ? k12.f1432N : k12.f1433O;
                                            c0216p.S(-156921964);
                                            O.a b14 = (function27 == null && ((Boolean) x03.getValue()).booleanValue()) ? O.f.b(-1526229403, new p(j0Var2, j17, l5, function27, 1), c0216p) : null;
                                            c0216p.q(false);
                                            long j18 = z5 ? k12.f1453r : z6 ? k12.f1454s : booleanValue ? k12.f1451p : k12.f1452q;
                                            c0216p.S(-156902962);
                                            if (function24 != null) {
                                                b4 = null;
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                                b4 = O.f.b(-130107406, new m(j18, function24, 0), c0216p);
                                            }
                                            c0216p.q(z7);
                                            long j19 = z5 ? k12.f1457v : z6 ? k12.f1458w : booleanValue ? k12.f1455t : k12.f1456u;
                                            c0216p.S(-156893937);
                                            O.a b15 = function25 != null ? null : O.f.b(2079816678, new m(j19, function25, 1), c0216p);
                                            c0216p.q(false);
                                            long j20 = z5 ? k12.f1426H : z6 ? k12.f1427I : booleanValue ? k12.f1424F : k12.f1425G;
                                            c0216p.S(-156884470);
                                            O.a b16 = function28 != null ? null : O.f.b(1263707005, new C0176v(j20, l7, function28, 1), c0216p);
                                            f13 = AbstractC0017m.f(c0216p, false, -567018607);
                                            if (f13 == w6) {
                                                f13 = C0192d.K(new Y.f(0L), w5);
                                                c0216p.c0(f13);
                                            }
                                            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) f13;
                                            O.a b17 = O.f.b(157291737, new k(interfaceC0191c0, interfaceC1021Z, function29, 0), c0216p);
                                            c4 = c0216p.c(f12);
                                            I7 = c0216p.I();
                                            if (!c4 || I7 == w6) {
                                                I7 = new i(f12, interfaceC0191c0);
                                                c0216p.c0(I7);
                                            }
                                            S0.b(function2, aVar, b13, b4, b15, aVar2, b14, z4, f12, (Function1) I7, b17, b16, interfaceC1021Z, c0216p, ((i8 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                                            c0216p.q(false);
                                            Unit unit = Unit.f7487a;
                                        }
                                    }
                                    f9 = 1.0f;
                                    c0216p.q(false);
                                    Float valueOf42 = Float.valueOf(f9);
                                    c cVar82 = (c) c0205j0.getValue();
                                    c0216p.S(1128033978);
                                    ordinal5 = cVar82.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f14 = 1.0f;
                                    c0216p.q(false);
                                    Float valueOf52 = Float.valueOf(f14);
                                    c6.f();
                                    c0216p.S(-1868044898);
                                    u0 j102 = AbstractC0779e.j(150, 0, null, 6);
                                    c0216p.q(false);
                                    j0 b102 = s0.b(c6, valueOf42, valueOf52, j102, v0Var, c0216p, 196608);
                                    c cVar92 = (c) c0205j0.getValue();
                                    c0216p.S(-107432127);
                                    iArr = u.f2250a;
                                    if (iArr[cVar92.ordinal()] != 1) {
                                    }
                                    c0216p.q(false);
                                    AbstractC0348c f152 = C0323u.f(j11);
                                    f10 = c0216p.f(f152);
                                    I3 = c0216p.I();
                                    if (!f10) {
                                    }
                                    v0 v0Var22 = new v0(k.u.f7326e, new g0(15, f152));
                                    c0216p.c0(v0Var22);
                                    I3 = v0Var22;
                                    v0 v0Var32 = (v0) I3;
                                    cVar = (c) t0Var.l();
                                    c0216p.S(-107432127);
                                    if (iArr[cVar.ordinal()] != 1) {
                                    }
                                    c0216p.q(false);
                                    C0323u c0323u5 = new C0323u(j4);
                                    c cVar102 = (c) c0205j0.getValue();
                                    c0216p.S(-107432127);
                                    if (iArr2[cVar102.ordinal()] != 1) {
                                    }
                                    c0216p.q(false);
                                    C0323u c0323u22 = new C0323u(j12);
                                    c6.f();
                                    c0216p.S(1528582156);
                                    u0 j132 = AbstractC0779e.j(150, 0, null, 6);
                                    c0216p.q(false);
                                    j0 b112 = s0.b(c6, c0323u5, c0323u22, j132, v0Var32, c0216p, 196608);
                                    c0216p.S(1023351670);
                                    c0216p.q(false);
                                    AbstractC0348c f162 = C0323u.f(j5);
                                    f11 = c0216p.f(f162);
                                    I4 = c0216p.I();
                                    if (!f11) {
                                    }
                                    v0 v0Var42 = new v0(k.u.f7326e, new g0(15, f162));
                                    c0216p.c0(v0Var42);
                                    I4 = v0Var42;
                                    v0 v0Var52 = (v0) I4;
                                    c0216p.S(1023351670);
                                    c0216p.q(false);
                                    C0323u c0323u32 = new C0323u(j5);
                                    c0216p.S(1023351670);
                                    c0216p.q(false);
                                    C0323u c0323u42 = new C0323u(j5);
                                    c6.f();
                                    c0216p.S(-543659263);
                                    u0 j142 = AbstractC0779e.j(150, 0, null, 6);
                                    c0216p.q(false);
                                    j0 b122 = s0.b(c6, c0323u32, c0323u42, j142, v0Var52, c0216p, 196608);
                                    floatValue = ((Number) b8.f7778p.getValue()).floatValue();
                                    c0216p.S(-156998101);
                                    if (function22 != null) {
                                    }
                                    c0216p.q(false);
                                    long j152 = z5 ? k12.f1422D : z6 ? k12.f1423E : booleanValue ? k12.B : k12.f1421C;
                                    I5 = c0216p.I();
                                    w4 = W.f2779l;
                                    if (I5 != w6) {
                                    }
                                    X0 x022 = (X0) I5;
                                    c0216p.S(-156965270);
                                    if (function23 == null) {
                                    }
                                    w5 = w4;
                                    aVar = null;
                                    c0216p.q(false);
                                    long j162 = z5 ? k12.f1430L : z6 ? k12.f1431M : booleanValue ? k12.f1428J : k12.f1429K;
                                    I6 = c0216p.I();
                                    if (I6 != w6) {
                                    }
                                    X0 x032 = (X0) I6;
                                    c0216p.S(-156940524);
                                    if (function26 == null) {
                                    }
                                    f12 = floatValue;
                                    aVar2 = null;
                                    c0216p.q(false);
                                    long j172 = z5 ? k12.f1434P : z6 ? k12.f1435Q : booleanValue ? k12.f1432N : k12.f1433O;
                                    c0216p.S(-156921964);
                                    if (function27 == null) {
                                    }
                                    c0216p.q(false);
                                    if (z5) {
                                    }
                                    c0216p.S(-156902962);
                                    if (function24 != null) {
                                    }
                                    c0216p.q(z7);
                                    if (z5) {
                                    }
                                    c0216p.S(-156893937);
                                    if (function25 != null) {
                                    }
                                    c0216p.q(false);
                                    long j202 = z5 ? k12.f1426H : z6 ? k12.f1427I : booleanValue ? k12.f1424F : k12.f1425G;
                                    c0216p.S(-156884470);
                                    if (function28 != null) {
                                    }
                                    f13 = AbstractC0017m.f(c0216p, false, -567018607);
                                    if (f13 == w6) {
                                    }
                                    InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f13;
                                    O.a b172 = O.f.b(157291737, new k(interfaceC0191c02, interfaceC1021Z, function29, 0), c0216p);
                                    c4 = c0216p.c(f12);
                                    I7 = c0216p.I();
                                    if (!c4) {
                                    }
                                    I7 = new i(f12, interfaceC0191c02);
                                    c0216p.c0(I7);
                                    S0.b(function2, aVar, b13, b4, b15, aVar2, b14, z4, f12, (Function1) I7, b172, b16, interfaceC1021Z, c0216p, ((i8 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                                    c0216p.q(false);
                                    Unit unit2 = Unit.f7487a;
                                }
                                f8 = 1.0f;
                                c0216p.q(false);
                                j0 b92 = s0.b(c6, valueOf3, Float.valueOf(f8), (InterfaceC0799z) tVar.g(c6.f(), c0216p, 0), v0Var, c0216p, 196608);
                                c cVar72 = (c) t0Var.l();
                                c0216p.S(1128033978);
                                ordinal4 = cVar72.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f9 = 1.0f;
                                c0216p.q(false);
                                Float valueOf422 = Float.valueOf(f9);
                                c cVar822 = (c) c0205j0.getValue();
                                c0216p.S(1128033978);
                                ordinal5 = cVar822.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f14 = 1.0f;
                                c0216p.q(false);
                                Float valueOf522 = Float.valueOf(f14);
                                c6.f();
                                c0216p.S(-1868044898);
                                u0 j1022 = AbstractC0779e.j(150, 0, null, 6);
                                c0216p.q(false);
                                j0 b1022 = s0.b(c6, valueOf422, valueOf522, j1022, v0Var, c0216p, 196608);
                                c cVar922 = (c) c0205j0.getValue();
                                c0216p.S(-107432127);
                                iArr = u.f2250a;
                                if (iArr[cVar922.ordinal()] != 1) {
                                }
                                c0216p.q(false);
                                AbstractC0348c f1522 = C0323u.f(j11);
                                f10 = c0216p.f(f1522);
                                I3 = c0216p.I();
                                if (!f10) {
                                }
                                v0 v0Var222 = new v0(k.u.f7326e, new g0(15, f1522));
                                c0216p.c0(v0Var222);
                                I3 = v0Var222;
                                v0 v0Var322 = (v0) I3;
                                cVar = (c) t0Var.l();
                                c0216p.S(-107432127);
                                if (iArr[cVar.ordinal()] != 1) {
                                }
                                c0216p.q(false);
                                C0323u c0323u52 = new C0323u(j4);
                                c cVar1022 = (c) c0205j0.getValue();
                                c0216p.S(-107432127);
                                if (iArr2[cVar1022.ordinal()] != 1) {
                                }
                                c0216p.q(false);
                                C0323u c0323u222 = new C0323u(j12);
                                c6.f();
                                c0216p.S(1528582156);
                                u0 j1322 = AbstractC0779e.j(150, 0, null, 6);
                                c0216p.q(false);
                                j0 b1122 = s0.b(c6, c0323u52, c0323u222, j1322, v0Var322, c0216p, 196608);
                                c0216p.S(1023351670);
                                c0216p.q(false);
                                AbstractC0348c f1622 = C0323u.f(j5);
                                f11 = c0216p.f(f1622);
                                I4 = c0216p.I();
                                if (!f11) {
                                }
                                v0 v0Var422 = new v0(k.u.f7326e, new g0(15, f1622));
                                c0216p.c0(v0Var422);
                                I4 = v0Var422;
                                v0 v0Var522 = (v0) I4;
                                c0216p.S(1023351670);
                                c0216p.q(false);
                                C0323u c0323u322 = new C0323u(j5);
                                c0216p.S(1023351670);
                                c0216p.q(false);
                                C0323u c0323u422 = new C0323u(j5);
                                c6.f();
                                c0216p.S(-543659263);
                                u0 j1422 = AbstractC0779e.j(150, 0, null, 6);
                                c0216p.q(false);
                                j0 b1222 = s0.b(c6, c0323u322, c0323u422, j1422, v0Var522, c0216p, 196608);
                                floatValue = ((Number) b8.f7778p.getValue()).floatValue();
                                c0216p.S(-156998101);
                                if (function22 != null) {
                                }
                                c0216p.q(false);
                                long j1522 = z5 ? k12.f1422D : z6 ? k12.f1423E : booleanValue ? k12.B : k12.f1421C;
                                I5 = c0216p.I();
                                w4 = W.f2779l;
                                if (I5 != w6) {
                                }
                                X0 x0222 = (X0) I5;
                                c0216p.S(-156965270);
                                if (function23 == null) {
                                }
                                w5 = w4;
                                aVar = null;
                                c0216p.q(false);
                                long j1622 = z5 ? k12.f1430L : z6 ? k12.f1431M : booleanValue ? k12.f1428J : k12.f1429K;
                                I6 = c0216p.I();
                                if (I6 != w6) {
                                }
                                X0 x0322 = (X0) I6;
                                c0216p.S(-156940524);
                                if (function26 == null) {
                                }
                                f12 = floatValue;
                                aVar2 = null;
                                c0216p.q(false);
                                long j1722 = z5 ? k12.f1434P : z6 ? k12.f1435Q : booleanValue ? k12.f1432N : k12.f1433O;
                                c0216p.S(-156921964);
                                if (function27 == null) {
                                }
                                c0216p.q(false);
                                if (z5) {
                                }
                                c0216p.S(-156902962);
                                if (function24 != null) {
                                }
                                c0216p.q(z7);
                                if (z5) {
                                }
                                c0216p.S(-156893937);
                                if (function25 != null) {
                                }
                                c0216p.q(false);
                                long j2022 = z5 ? k12.f1426H : z6 ? k12.f1427I : booleanValue ? k12.f1424F : k12.f1425G;
                                c0216p.S(-156884470);
                                if (function28 != null) {
                                }
                                f13 = AbstractC0017m.f(c0216p, false, -567018607);
                                if (f13 == w6) {
                                }
                                InterfaceC0191c0 interfaceC0191c022 = (InterfaceC0191c0) f13;
                                O.a b1722 = O.f.b(157291737, new k(interfaceC0191c022, interfaceC1021Z, function29, 0), c0216p);
                                c4 = c0216p.c(f12);
                                I7 = c0216p.I();
                                if (!c4) {
                                }
                                I7 = new i(f12, interfaceC0191c022);
                                c0216p.c0(I7);
                                S0.b(function2, aVar, b13, b4, b15, aVar2, b14, z4, f12, (Function1) I7, b1722, b16, interfaceC1021Z, c0216p, ((i8 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                                c0216p.q(false);
                                Unit unit22 = Unit.f7487a;
                            } else {
                                i7 = 1;
                            }
                            f7 = 1.0f;
                            c0216p.q(false);
                            Float valueOf32 = Float.valueOf(f7);
                            c cVar62 = (c) c0205j0.getValue();
                            c0216p.S(1435837472);
                            ordinal3 = cVar62.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f8 = 1.0f;
                            c0216p.q(false);
                            j0 b922 = s0.b(c6, valueOf32, Float.valueOf(f8), (InterfaceC0799z) tVar.g(c6.f(), c0216p, 0), v0Var, c0216p, 196608);
                            c cVar722 = (c) t0Var.l();
                            c0216p.S(1128033978);
                            ordinal4 = cVar722.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f9 = 1.0f;
                            c0216p.q(false);
                            Float valueOf4222 = Float.valueOf(f9);
                            c cVar8222 = (c) c0205j0.getValue();
                            c0216p.S(1128033978);
                            ordinal5 = cVar8222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f14 = 1.0f;
                            c0216p.q(false);
                            Float valueOf5222 = Float.valueOf(f14);
                            c6.f();
                            c0216p.S(-1868044898);
                            u0 j10222 = AbstractC0779e.j(150, 0, null, 6);
                            c0216p.q(false);
                            j0 b10222 = s0.b(c6, valueOf4222, valueOf5222, j10222, v0Var, c0216p, 196608);
                            c cVar9222 = (c) c0205j0.getValue();
                            c0216p.S(-107432127);
                            iArr = u.f2250a;
                            if (iArr[cVar9222.ordinal()] != 1) {
                            }
                            c0216p.q(false);
                            AbstractC0348c f15222 = C0323u.f(j11);
                            f10 = c0216p.f(f15222);
                            I3 = c0216p.I();
                            if (!f10) {
                            }
                            v0 v0Var2222 = new v0(k.u.f7326e, new g0(15, f15222));
                            c0216p.c0(v0Var2222);
                            I3 = v0Var2222;
                            v0 v0Var3222 = (v0) I3;
                            cVar = (c) t0Var.l();
                            c0216p.S(-107432127);
                            if (iArr[cVar.ordinal()] != 1) {
                            }
                            c0216p.q(false);
                            C0323u c0323u522 = new C0323u(j4);
                            c cVar10222 = (c) c0205j0.getValue();
                            c0216p.S(-107432127);
                            if (iArr2[cVar10222.ordinal()] != 1) {
                            }
                            c0216p.q(false);
                            C0323u c0323u2222 = new C0323u(j12);
                            c6.f();
                            c0216p.S(1528582156);
                            u0 j13222 = AbstractC0779e.j(150, 0, null, 6);
                            c0216p.q(false);
                            j0 b11222 = s0.b(c6, c0323u522, c0323u2222, j13222, v0Var3222, c0216p, 196608);
                            c0216p.S(1023351670);
                            c0216p.q(false);
                            AbstractC0348c f16222 = C0323u.f(j5);
                            f11 = c0216p.f(f16222);
                            I4 = c0216p.I();
                            if (!f11) {
                            }
                            v0 v0Var4222 = new v0(k.u.f7326e, new g0(15, f16222));
                            c0216p.c0(v0Var4222);
                            I4 = v0Var4222;
                            v0 v0Var5222 = (v0) I4;
                            c0216p.S(1023351670);
                            c0216p.q(false);
                            C0323u c0323u3222 = new C0323u(j5);
                            c0216p.S(1023351670);
                            c0216p.q(false);
                            C0323u c0323u4222 = new C0323u(j5);
                            c6.f();
                            c0216p.S(-543659263);
                            u0 j14222 = AbstractC0779e.j(150, 0, null, 6);
                            c0216p.q(false);
                            j0 b12222 = s0.b(c6, c0323u3222, c0323u4222, j14222, v0Var5222, c0216p, 196608);
                            floatValue = ((Number) b8.f7778p.getValue()).floatValue();
                            c0216p.S(-156998101);
                            if (function22 != null) {
                            }
                            c0216p.q(false);
                            long j15222 = z5 ? k12.f1422D : z6 ? k12.f1423E : booleanValue ? k12.B : k12.f1421C;
                            I5 = c0216p.I();
                            w4 = W.f2779l;
                            if (I5 != w6) {
                            }
                            X0 x02222 = (X0) I5;
                            c0216p.S(-156965270);
                            if (function23 == null) {
                            }
                            w5 = w4;
                            aVar = null;
                            c0216p.q(false);
                            long j16222 = z5 ? k12.f1430L : z6 ? k12.f1431M : booleanValue ? k12.f1428J : k12.f1429K;
                            I6 = c0216p.I();
                            if (I6 != w6) {
                            }
                            X0 x03222 = (X0) I6;
                            c0216p.S(-156940524);
                            if (function26 == null) {
                            }
                            f12 = floatValue;
                            aVar2 = null;
                            c0216p.q(false);
                            long j17222 = z5 ? k12.f1434P : z6 ? k12.f1435Q : booleanValue ? k12.f1432N : k12.f1433O;
                            c0216p.S(-156921964);
                            if (function27 == null) {
                            }
                            c0216p.q(false);
                            if (z5) {
                            }
                            c0216p.S(-156902962);
                            if (function24 != null) {
                            }
                            c0216p.q(z7);
                            if (z5) {
                            }
                            c0216p.S(-156893937);
                            if (function25 != null) {
                            }
                            c0216p.q(false);
                            long j20222 = z5 ? k12.f1426H : z6 ? k12.f1427I : booleanValue ? k12.f1424F : k12.f1425G;
                            c0216p.S(-156884470);
                            if (function28 != null) {
                            }
                            f13 = AbstractC0017m.f(c0216p, false, -567018607);
                            if (f13 == w6) {
                            }
                            InterfaceC0191c0 interfaceC0191c0222 = (InterfaceC0191c0) f13;
                            O.a b17222 = O.f.b(157291737, new k(interfaceC0191c0222, interfaceC1021Z, function29, 0), c0216p);
                            c4 = c0216p.c(f12);
                            I7 = c0216p.I();
                            if (!c4) {
                            }
                            I7 = new i(f12, interfaceC0191c0222);
                            c0216p.c0(I7);
                            S0.b(function2, aVar, b13, b4, b15, aVar2, b14, z4, f12, (Function1) I7, b17222, b16, interfaceC1021Z, c0216p, ((i8 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                            c0216p.q(false);
                            Unit unit222 = Unit.f7487a;
                        } else if (ordinal != 2) {
                            throw new C1338m();
                        }
                    } else {
                        l4 = l6;
                    }
                    f6 = 1.0f;
                    c0216p.q(false);
                    Float valueOf22 = Float.valueOf(f6);
                    c6.f();
                    c0216p.S(1276209157);
                    u0 j92 = AbstractC0779e.j(150, 0, null, 6);
                    c0216p.q(false);
                    l5 = l4;
                    j0 b82 = s0.b(c6, valueOf, valueOf22, j92, v0Var, c0216p, 196608);
                    t tVar2 = t.f2249d;
                    c cVar52 = (c) t0Var.l();
                    c0216p.S(1435837472);
                    ordinal2 = cVar52.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f7 = 1.0f;
                    c0216p.q(false);
                    Float valueOf322 = Float.valueOf(f7);
                    c cVar622 = (c) c0205j0.getValue();
                    c0216p.S(1435837472);
                    ordinal3 = cVar622.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f8 = 1.0f;
                    c0216p.q(false);
                    j0 b9222 = s0.b(c6, valueOf322, Float.valueOf(f8), (InterfaceC0799z) tVar2.g(c6.f(), c0216p, 0), v0Var, c0216p, 196608);
                    c cVar7222 = (c) t0Var.l();
                    c0216p.S(1128033978);
                    ordinal4 = cVar7222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f9 = 1.0f;
                    c0216p.q(false);
                    Float valueOf42222 = Float.valueOf(f9);
                    c cVar82222 = (c) c0205j0.getValue();
                    c0216p.S(1128033978);
                    ordinal5 = cVar82222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f14 = 1.0f;
                    c0216p.q(false);
                    Float valueOf52222 = Float.valueOf(f14);
                    c6.f();
                    c0216p.S(-1868044898);
                    u0 j102222 = AbstractC0779e.j(150, 0, null, 6);
                    c0216p.q(false);
                    j0 b102222 = s0.b(c6, valueOf42222, valueOf52222, j102222, v0Var, c0216p, 196608);
                    c cVar92222 = (c) c0205j0.getValue();
                    c0216p.S(-107432127);
                    iArr = u.f2250a;
                    if (iArr[cVar92222.ordinal()] != 1) {
                    }
                    c0216p.q(false);
                    AbstractC0348c f152222 = C0323u.f(j11);
                    f10 = c0216p.f(f152222);
                    I3 = c0216p.I();
                    if (!f10) {
                    }
                    v0 v0Var22222 = new v0(k.u.f7326e, new g0(15, f152222));
                    c0216p.c0(v0Var22222);
                    I3 = v0Var22222;
                    v0 v0Var32222 = (v0) I3;
                    cVar = (c) t0Var.l();
                    c0216p.S(-107432127);
                    if (iArr[cVar.ordinal()] != 1) {
                    }
                    c0216p.q(false);
                    C0323u c0323u5222 = new C0323u(j4);
                    c cVar102222 = (c) c0205j0.getValue();
                    c0216p.S(-107432127);
                    if (iArr2[cVar102222.ordinal()] != 1) {
                    }
                    c0216p.q(false);
                    C0323u c0323u22222 = new C0323u(j12);
                    c6.f();
                    c0216p.S(1528582156);
                    u0 j132222 = AbstractC0779e.j(150, 0, null, 6);
                    c0216p.q(false);
                    j0 b112222 = s0.b(c6, c0323u5222, c0323u22222, j132222, v0Var32222, c0216p, 196608);
                    c0216p.S(1023351670);
                    c0216p.q(false);
                    AbstractC0348c f162222 = C0323u.f(j5);
                    f11 = c0216p.f(f162222);
                    I4 = c0216p.I();
                    if (!f11) {
                    }
                    v0 v0Var42222 = new v0(k.u.f7326e, new g0(15, f162222));
                    c0216p.c0(v0Var42222);
                    I4 = v0Var42222;
                    v0 v0Var52222 = (v0) I4;
                    c0216p.S(1023351670);
                    c0216p.q(false);
                    C0323u c0323u32222 = new C0323u(j5);
                    c0216p.S(1023351670);
                    c0216p.q(false);
                    C0323u c0323u42222 = new C0323u(j5);
                    c6.f();
                    c0216p.S(-543659263);
                    u0 j142222 = AbstractC0779e.j(150, 0, null, 6);
                    c0216p.q(false);
                    j0 b122222 = s0.b(c6, c0323u32222, c0323u42222, j142222, v0Var52222, c0216p, 196608);
                    floatValue = ((Number) b82.f7778p.getValue()).floatValue();
                    c0216p.S(-156998101);
                    if (function22 != null) {
                    }
                    c0216p.q(false);
                    long j152222 = z5 ? k12.f1422D : z6 ? k12.f1423E : booleanValue ? k12.B : k12.f1421C;
                    I5 = c0216p.I();
                    w4 = W.f2779l;
                    if (I5 != w6) {
                    }
                    X0 x022222 = (X0) I5;
                    c0216p.S(-156965270);
                    if (function23 == null) {
                    }
                    w5 = w4;
                    aVar = null;
                    c0216p.q(false);
                    long j162222 = z5 ? k12.f1430L : z6 ? k12.f1431M : booleanValue ? k12.f1428J : k12.f1429K;
                    I6 = c0216p.I();
                    if (I6 != w6) {
                    }
                    X0 x032222 = (X0) I6;
                    c0216p.S(-156940524);
                    if (function26 == null) {
                    }
                    f12 = floatValue;
                    aVar2 = null;
                    c0216p.q(false);
                    long j172222 = z5 ? k12.f1434P : z6 ? k12.f1435Q : booleanValue ? k12.f1432N : k12.f1433O;
                    c0216p.S(-156921964);
                    if (function27 == null) {
                    }
                    c0216p.q(false);
                    if (z5) {
                    }
                    c0216p.S(-156902962);
                    if (function24 != null) {
                    }
                    c0216p.q(z7);
                    if (z5) {
                    }
                    c0216p.S(-156893937);
                    if (function25 != null) {
                    }
                    c0216p.q(false);
                    long j202222 = z5 ? k12.f1426H : z6 ? k12.f1427I : booleanValue ? k12.f1424F : k12.f1425G;
                    c0216p.S(-156884470);
                    if (function28 != null) {
                    }
                    f13 = AbstractC0017m.f(c0216p, false, -567018607);
                    if (f13 == w6) {
                    }
                    InterfaceC0191c0 interfaceC0191c02222 = (InterfaceC0191c0) f13;
                    O.a b172222 = O.f.b(157291737, new k(interfaceC0191c02222, interfaceC1021Z, function29, 0), c0216p);
                    c4 = c0216p.c(f12);
                    I7 = c0216p.I();
                    if (!c4) {
                    }
                    I7 = new i(f12, interfaceC0191c02222);
                    c0216p.c0(I7);
                    S0.b(function2, aVar, b13, b4, b15, aVar2, b14, z4, f12, (Function1) I7, b172222, b16, interfaceC1021Z, c0216p, ((i8 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
                    c0216p.q(false);
                    Unit unit2222 = Unit.f7487a;
                } else if (ordinal6 != 2) {
                    throw new C1338m();
                }
            }
            f5 = 1.0f;
            c0216p.q(false);
            Float valueOf6 = Float.valueOf(f5);
            C0205j0 c0205j02 = c6.f7803d;
            c cVar42 = (c) c0205j02.getValue();
            c0216p.S(-2036730335);
            ordinal = cVar42.ordinal();
            if (ordinal == 0) {
            }
            f6 = 1.0f;
            c0216p.q(false);
            Float valueOf222 = Float.valueOf(f6);
            c6.f();
            c0216p.S(1276209157);
            u0 j922 = AbstractC0779e.j(150, 0, null, 6);
            c0216p.q(false);
            l5 = l4;
            j0 b822 = s0.b(c6, valueOf6, valueOf222, j922, v0Var, c0216p, 196608);
            t tVar22 = t.f2249d;
            c cVar522 = (c) t0Var.l();
            c0216p.S(1435837472);
            ordinal2 = cVar522.ordinal();
            if (ordinal2 != 0) {
            }
            f7 = 1.0f;
            c0216p.q(false);
            Float valueOf3222 = Float.valueOf(f7);
            c cVar6222 = (c) c0205j02.getValue();
            c0216p.S(1435837472);
            ordinal3 = cVar6222.ordinal();
            if (ordinal3 != 0) {
            }
            f8 = 1.0f;
            c0216p.q(false);
            j0 b92222 = s0.b(c6, valueOf3222, Float.valueOf(f8), (InterfaceC0799z) tVar22.g(c6.f(), c0216p, 0), v0Var, c0216p, 196608);
            c cVar72222 = (c) t0Var.l();
            c0216p.S(1128033978);
            ordinal4 = cVar72222.ordinal();
            if (ordinal4 != 0) {
            }
            f9 = 1.0f;
            c0216p.q(false);
            Float valueOf422222 = Float.valueOf(f9);
            c cVar822222 = (c) c0205j02.getValue();
            c0216p.S(1128033978);
            ordinal5 = cVar822222.ordinal();
            if (ordinal5 != 0) {
            }
            f14 = 1.0f;
            c0216p.q(false);
            Float valueOf522222 = Float.valueOf(f14);
            c6.f();
            c0216p.S(-1868044898);
            u0 j1022222 = AbstractC0779e.j(150, 0, null, 6);
            c0216p.q(false);
            j0 b1022222 = s0.b(c6, valueOf422222, valueOf522222, j1022222, v0Var, c0216p, 196608);
            c cVar922222 = (c) c0205j02.getValue();
            c0216p.S(-107432127);
            iArr = u.f2250a;
            if (iArr[cVar922222.ordinal()] != 1) {
            }
            c0216p.q(false);
            AbstractC0348c f1522222 = C0323u.f(j11);
            f10 = c0216p.f(f1522222);
            I3 = c0216p.I();
            if (!f10) {
            }
            v0 v0Var222222 = new v0(k.u.f7326e, new g0(15, f1522222));
            c0216p.c0(v0Var222222);
            I3 = v0Var222222;
            v0 v0Var322222 = (v0) I3;
            cVar = (c) t0Var.l();
            c0216p.S(-107432127);
            if (iArr[cVar.ordinal()] != 1) {
            }
            c0216p.q(false);
            C0323u c0323u52222 = new C0323u(j4);
            c cVar1022222 = (c) c0205j02.getValue();
            c0216p.S(-107432127);
            if (iArr2[cVar1022222.ordinal()] != 1) {
            }
            c0216p.q(false);
            C0323u c0323u222222 = new C0323u(j12);
            c6.f();
            c0216p.S(1528582156);
            u0 j1322222 = AbstractC0779e.j(150, 0, null, 6);
            c0216p.q(false);
            j0 b1122222 = s0.b(c6, c0323u52222, c0323u222222, j1322222, v0Var322222, c0216p, 196608);
            c0216p.S(1023351670);
            c0216p.q(false);
            AbstractC0348c f1622222 = C0323u.f(j5);
            f11 = c0216p.f(f1622222);
            I4 = c0216p.I();
            if (!f11) {
            }
            v0 v0Var422222 = new v0(k.u.f7326e, new g0(15, f1622222));
            c0216p.c0(v0Var422222);
            I4 = v0Var422222;
            v0 v0Var522222 = (v0) I4;
            c0216p.S(1023351670);
            c0216p.q(false);
            C0323u c0323u322222 = new C0323u(j5);
            c0216p.S(1023351670);
            c0216p.q(false);
            C0323u c0323u422222 = new C0323u(j5);
            c6.f();
            c0216p.S(-543659263);
            u0 j1422222 = AbstractC0779e.j(150, 0, null, 6);
            c0216p.q(false);
            j0 b1222222 = s0.b(c6, c0323u322222, c0323u422222, j1422222, v0Var522222, c0216p, 196608);
            floatValue = ((Number) b822.f7778p.getValue()).floatValue();
            c0216p.S(-156998101);
            if (function22 != null) {
            }
            c0216p.q(false);
            long j1522222 = z5 ? k12.f1422D : z6 ? k12.f1423E : booleanValue ? k12.B : k12.f1421C;
            I5 = c0216p.I();
            w4 = W.f2779l;
            if (I5 != w6) {
            }
            X0 x0222222 = (X0) I5;
            c0216p.S(-156965270);
            if (function23 == null) {
            }
            w5 = w4;
            aVar = null;
            c0216p.q(false);
            long j1622222 = z5 ? k12.f1430L : z6 ? k12.f1431M : booleanValue ? k12.f1428J : k12.f1429K;
            I6 = c0216p.I();
            if (I6 != w6) {
            }
            X0 x0322222 = (X0) I6;
            c0216p.S(-156940524);
            if (function26 == null) {
            }
            f12 = floatValue;
            aVar2 = null;
            c0216p.q(false);
            long j1722222 = z5 ? k12.f1434P : z6 ? k12.f1435Q : booleanValue ? k12.f1432N : k12.f1433O;
            c0216p.S(-156921964);
            if (function27 == null) {
            }
            c0216p.q(false);
            if (z5) {
            }
            c0216p.S(-156902962);
            if (function24 != null) {
            }
            c0216p.q(z7);
            if (z5) {
            }
            c0216p.S(-156893937);
            if (function25 != null) {
            }
            c0216p.q(false);
            long j2022222 = z5 ? k12.f1426H : z6 ? k12.f1427I : booleanValue ? k12.f1424F : k12.f1425G;
            c0216p.S(-156884470);
            if (function28 != null) {
            }
            f13 = AbstractC0017m.f(c0216p, false, -567018607);
            if (f13 == w6) {
            }
            InterfaceC0191c0 interfaceC0191c022222 = (InterfaceC0191c0) f13;
            O.a b1722222 = O.f.b(157291737, new k(interfaceC0191c022222, interfaceC1021Z, function29, 0), c0216p);
            c4 = c0216p.c(f12);
            I7 = c0216p.I();
            if (!c4) {
            }
            I7 = new i(f12, interfaceC0191c022222);
            c0216p.c0(I7);
            S0.b(function2, aVar, b13, b4, b15, aVar2, b14, z4, f12, (Function1) I7, b1722222, b16, interfaceC1021Z, c0216p, ((i8 >> 3) & 112) | 6 | ((i6 << 21) & 234881024), ((i6 >> 6) & 7168) | 48);
            c0216p.q(false);
            Unit unit22222 = Unit.f7487a;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new r(str, function2, c0022s, function22, function23, function24, function25, function26, function27, function28, z4, z5, z6, interfaceC0934j, interfaceC1021Z, k12, function29, i2, i4);
        }
    }

    public static final void b(long j4, L l4, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(1208685580);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.e(j4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(l4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(function2) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            a.a(j4, l4, function2, c0216p, i4 & 1022);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new h(j4, l4, function2, i2, 1);
        }
    }

    public static final void c(long j4, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(660142980);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.e(j4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            C0192d.a(S.f1616a.a(new C0323u(j4)), function2, c0216p, (i4 & 112) | 8);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new s(j4, function2, i2);
        }
    }

    public static final Object d(InterfaceC0944E interfaceC0944E) {
        Object r2 = interfaceC0944E.r();
        C0981q c0981q = r2 instanceof C0981q ? (C0981q) r2 : null;
        if (c0981q != null) {
            return c0981q.f9055t;
        }
        return null;
    }

    public static final int e(AbstractC0954O abstractC0954O) {
        if (abstractC0954O != null) {
            return abstractC0954O.f9006e;
        }
        return 0;
    }

    public static final int f(AbstractC0954O abstractC0954O) {
        if (abstractC0954O != null) {
            return abstractC0954O.f9005d;
        }
        return 0;
    }
}
