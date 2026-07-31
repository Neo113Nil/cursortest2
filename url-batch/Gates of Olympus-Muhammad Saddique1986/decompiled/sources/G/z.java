package G;

import C0.C0031g;
import C0.K;
import F.A1;
import F.B1;
import F.C0131y0;
import F.V;
import F.Z0;
import F.s1;
import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.F;
import I.InterfaceC0142c0;
import I.N0;
import I.W;
import I.W0;
import I0.G;
import a0.C0241f;
import b0.C0352v;
import c0.AbstractC0357c;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.InterfaceC0640z;
import m.i0;
import m.l0;
import m.r0;
import m.s0;
import m.u0;
import m.v0;
import n.t0;
import r.InterfaceC0849K;
import r0.AbstractC0893O;
import r0.C0920q;
import r0.InterfaceC0884F;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: b, reason: collision with root package name */
    public static final float f2064b;

    /* renamed from: g, reason: collision with root package name */
    public static final float f2069g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f2070h;

    /* renamed from: i, reason: collision with root package name */
    public static final U.q f2071i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f2063a = O2.d.a(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final float f2065c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2066d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2067e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2068f = 24;

    static {
        float f3 = 16;
        f2064b = f3;
        f2069g = f3;
        f2070h = f3;
        float f4 = 48;
        f2071i = androidx.compose.foundation.layout.c.a(U.n.f4488a, f4, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x03f3, code lost:
    
        if (r11 != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0379, code lost:
    
        if (r11 != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x034a, code lost:
    
        if (r11 != false) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0762 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i3, int i4, B.r rVar, s1 s1Var, C0167p c0167p, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, InterfaceC0426e interfaceC0426e5, InterfaceC0426e interfaceC0426e6, InterfaceC0426e interfaceC0426e7, InterfaceC0426e interfaceC0426e8, InterfaceC0426e interfaceC0426e9, String str, q.j jVar, InterfaceC0849K interfaceC0849K, boolean z3, boolean z4, boolean z5) {
        int i5;
        int i6;
        InterfaceC0849K interfaceC0849K2;
        Object g3;
        float f3;
        int ordinal;
        s0 s0Var;
        float f4;
        int ordinal2;
        float f5;
        int ordinal3;
        float f6;
        i0 b3;
        int ordinal4;
        float f7;
        int ordinal5;
        int[] iArr;
        boolean f8;
        Object G3;
        f fVar;
        String str2;
        long j3;
        boolean f9;
        Object G4;
        float floatValue;
        s1 s1Var2;
        long j4;
        Object G5;
        Object G6;
        float f10;
        Q.a aVar;
        boolean z6;
        Q.a b4;
        Object G7;
        boolean c2;
        Object G8;
        A a3 = A.f1965d;
        c0167p.S(1514469103);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.f(a3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.h(interfaceC0426e) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.f(rVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.h(interfaceC0426e2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c0167p.h(interfaceC0426e3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0167p.h(interfaceC0426e4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0167p.h(interfaceC0426e5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0167p.h(interfaceC0426e6) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0167p.h(interfaceC0426e7) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0167p.h(interfaceC0426e8) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p.g(z3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p.g(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0167p.g(z5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0167p.f(jVar) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            interfaceC0849K2 = interfaceC0849K;
            i6 |= c0167p.f(interfaceC0849K2) ? 131072 : 65536;
        } else {
            interfaceC0849K2 = interfaceC0849K;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c0167p.f(s1Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= c0167p.h(interfaceC0426e9) ? 8388608 : 4194304;
        }
        int i7 = i6;
        if ((i5 & 306783379) == 306783378 && (i7 & 4793491) == 4793490 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z7 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048);
            Object G9 = c0167p.G();
            W w2 = C0159l.f2829a;
            if (z7 || G9 == w2) {
                C0031g c0031g = new C0031g(str, null, 6);
                rVar.getClass();
                g3 = new G(c0031g, I0.s.f3082a);
                c0167p.a0(g3);
            } else {
                g3 = G9;
            }
            String str3 = ((G) g3).f3031a.f596a;
            boolean booleanValue = ((Boolean) t0.f(jVar, c0167p, (i7 >> 12) & 14).getValue()).booleanValue();
            f fVar2 = booleanValue ? f.f1993d : str3.length() == 0 ? f.f1994e : f.f1995f;
            long j5 = !z4 ? s1Var.f1815z : z5 ? s1Var.f1775A : booleanValue ? s1Var.f1813x : s1Var.f1814y;
            A1 a12 = (A1) c0167p.k(B1.f1124a);
            K k3 = a12.f1109j;
            long b5 = k3.b();
            long j6 = C0352v.f5439g;
            boolean c3 = C0352v.c(b5, j6);
            K k4 = a12.f1111l;
            boolean z8 = (c3 && !C0352v.c(k4.b(), j6)) || (!C0352v.c(k3.b(), j6) && C0352v.c(k4.b(), j6));
            long b6 = k4.b();
            long j7 = (z8 && b6 == 16) ? j5 : b6;
            long b7 = k3.b();
            long j8 = (z8 && b7 == 16) ? j5 : b7;
            boolean z9 = interfaceC0426e2 != null;
            l0 d3 = r0.d(fVar2, "TextFieldInputState", c0167p, 48);
            u0 u0Var = v0.f6899a;
            s0 s0Var2 = d3.f6836a;
            f fVar3 = (f) s0Var2.a();
            c0167p.Q(-2036730335);
            int ordinal6 = fVar3.ordinal();
            float f11 = 0.0f;
            if (ordinal6 != 0) {
                if (ordinal6 == 1) {
                    f3 = 0.0f;
                    c0167p.p(false);
                    Float valueOf = Float.valueOf(f3);
                    C0156j0 c0156j0 = d3.f6839d;
                    f fVar4 = (f) c0156j0.getValue();
                    c0167p.Q(-2036730335);
                    ordinal = fVar4.ordinal();
                    if (ordinal == 0) {
                        s0Var = s0Var2;
                        if (ordinal == 1) {
                            f4 = 0.0f;
                            c0167p.p(false);
                            Float valueOf2 = Float.valueOf(f4);
                            d3.f();
                            c0167p.Q(1276209157);
                            m.t0 j9 = AbstractC0620e.j(150, 0, null, 6);
                            c0167p.p(false);
                            int i8 = i5;
                            i0 b8 = r0.b(d3, valueOf, valueOf2, j9, u0Var, c0167p, 196608);
                            x xVar = x.f2061e;
                            f fVar5 = (f) s0Var.a();
                            c0167p.Q(1435837472);
                            ordinal2 = fVar5.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        throw new C1.c();
                                    }
                                }
                                f5 = 0.0f;
                                c0167p.p(false);
                                Float valueOf3 = Float.valueOf(f5);
                                f fVar6 = (f) c0156j0.getValue();
                                c0167p.Q(1435837472);
                                ordinal3 = fVar6.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            throw new C1.c();
                                        }
                                    }
                                    f6 = 0.0f;
                                    c0167p.p(false);
                                    b3 = r0.b(d3, valueOf3, Float.valueOf(f6), (InterfaceC0640z) xVar.g(d3.f(), c0167p, 0), u0Var, c0167p, 196608);
                                    f fVar7 = (f) s0Var.a();
                                    c0167p.Q(1128033978);
                                    ordinal4 = fVar7.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                throw new C1.c();
                                            }
                                        } else if (z9) {
                                            f7 = 0.0f;
                                            c0167p.p(false);
                                            Float valueOf4 = Float.valueOf(f7);
                                            f fVar8 = (f) c0156j0.getValue();
                                            c0167p.Q(1128033978);
                                            ordinal5 = fVar8.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        throw new C1.c();
                                                    }
                                                }
                                            }
                                            f11 = 1.0f;
                                            c0167p.p(false);
                                            Float valueOf5 = Float.valueOf(f11);
                                            d3.f();
                                            c0167p.Q(-1868044898);
                                            m.t0 j10 = AbstractC0620e.j(150, 0, null, 6);
                                            c0167p.p(false);
                                            i0 b9 = r0.b(d3, valueOf4, valueOf5, j10, u0Var, c0167p, 196608);
                                            f fVar9 = (f) c0156j0.getValue();
                                            c0167p.Q(-107432127);
                                            iArr = y.f2062a;
                                            long j11 = iArr[fVar9.ordinal()] != 1 ? j7 : j8;
                                            c0167p.p(false);
                                            AbstractC0357c f12 = C0352v.f(j11);
                                            f8 = c0167p.f(f12);
                                            G3 = c0167p.G();
                                            if (!f8 || G3 == w2) {
                                                u0 u0Var2 = new u0(l.q.f6522g, new A0.l(21, f12));
                                                c0167p.a0(u0Var2);
                                                G3 = u0Var2;
                                            }
                                            u0 u0Var3 = (u0) G3;
                                            fVar = (f) s0Var.a();
                                            c0167p.Q(-107432127);
                                            if (iArr[fVar.ordinal()] != 1) {
                                                str2 = str3;
                                                j3 = j7;
                                            } else {
                                                str2 = str3;
                                                j3 = j8;
                                            }
                                            c0167p.p(false);
                                            C0352v c0352v = new C0352v(j3);
                                            f fVar10 = (f) c0156j0.getValue();
                                            c0167p.Q(-107432127);
                                            long j12 = iArr[fVar10.ordinal()] != 1 ? j7 : j8;
                                            c0167p.p(false);
                                            C0352v c0352v2 = new C0352v(j12);
                                            d3.f();
                                            c0167p.Q(1528582156);
                                            m.t0 j13 = AbstractC0620e.j(150, 0, null, 6);
                                            c0167p.p(false);
                                            i0 b10 = r0.b(d3, c0352v, c0352v2, j13, u0Var3, c0167p, 196608);
                                            c0167p.Q(1023351670);
                                            c0167p.p(false);
                                            AbstractC0357c f13 = C0352v.f(j5);
                                            f9 = c0167p.f(f13);
                                            G4 = c0167p.G();
                                            if (!f9 || G4 == w2) {
                                                u0 u0Var4 = new u0(l.q.f6522g, new A0.l(21, f13));
                                                c0167p.a0(u0Var4);
                                                G4 = u0Var4;
                                            }
                                            u0 u0Var5 = (u0) G4;
                                            c0167p.Q(1023351670);
                                            c0167p.p(false);
                                            C0352v c0352v3 = new C0352v(j5);
                                            c0167p.Q(1023351670);
                                            c0167p.p(false);
                                            C0352v c0352v4 = new C0352v(j5);
                                            d3.f();
                                            c0167p.Q(-543659263);
                                            m.t0 j14 = AbstractC0620e.j(150, 0, null, 6);
                                            c0167p.p(false);
                                            Q.a aVar2 = null;
                                            i0 b11 = r0.b(d3, c0352v3, c0352v4, j14, u0Var5, c0167p, 196608);
                                            floatValue = ((Number) b8.f6815m.getValue()).floatValue();
                                            c0167p.Q(-156998101);
                                            Q.a b12 = interfaceC0426e2 != null ? null : Q.f.b(-1236585568, new p(k3, k4, floatValue, b11, interfaceC0426e2, z8, b10), c0167p);
                                            c0167p.p(false);
                                            if (z4) {
                                                s1Var2 = s1Var;
                                                j4 = s1Var2.D;
                                            } else {
                                                s1Var2 = s1Var;
                                                j4 = z5 ? s1Var2.f1777E : booleanValue ? s1Var2.f1776B : s1Var2.C;
                                            }
                                            long j15 = j4;
                                            G5 = c0167p.G();
                                            W w3 = W.f2783i;
                                            if (G5 == w2) {
                                                u uVar = new u(b3, 0);
                                                G1.m mVar = N0.f2727a;
                                                F f14 = new F(w3, uVar);
                                                c0167p.a0(f14);
                                                G5 = f14;
                                            }
                                            W0 w02 = (W0) G5;
                                            c0167p.Q(-156965270);
                                            Q.a b13 = (interfaceC0426e3 == null && str2.length() == 0 && ((Boolean) w02.getValue()).booleanValue()) ? Q.f.b(-660524084, new s(b3, j15, k3, interfaceC0426e3), c0167p) : null;
                                            c0167p.p(false);
                                            long j16 = z4 ? s1Var2.f1784L : z5 ? s1Var2.f1785M : booleanValue ? s1Var2.f1782J : s1Var2.f1783K;
                                            G6 = c0167p.G();
                                            if (G6 == w2) {
                                                u uVar2 = new u(b9, 1);
                                                G1.m mVar2 = N0.f2727a;
                                                F f15 = new F(w3, uVar2);
                                                c0167p.a0(f15);
                                                G6 = f15;
                                            }
                                            W0 w03 = (W0) G6;
                                            c0167p.Q(-156940524);
                                            if (interfaceC0426e6 == null && ((Boolean) w03.getValue()).booleanValue()) {
                                                f10 = floatValue;
                                                aVar = Q.f.b(274398694, new t(b9, j16, k3, interfaceC0426e6, 0), c0167p);
                                            } else {
                                                f10 = floatValue;
                                                aVar = null;
                                            }
                                            c0167p.p(false);
                                            long j17 = z4 ? s1Var2.f1788P : z5 ? s1Var2.f1789Q : booleanValue ? s1Var2.f1786N : s1Var2.f1787O;
                                            c0167p.Q(-156921964);
                                            Q.a b14 = (interfaceC0426e7 == null && ((Boolean) w03.getValue()).booleanValue()) ? Q.f.b(-1526229403, new t(b9, j17, k3, interfaceC0426e7, 1), c0167p) : null;
                                            c0167p.p(false);
                                            long j18 = z4 ? s1Var2.f1807r : z5 ? s1Var2.f1808s : booleanValue ? s1Var2.f1805p : s1Var2.f1806q;
                                            c0167p.Q(-156902962);
                                            if (interfaceC0426e4 != null) {
                                                b4 = null;
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                                b4 = Q.f.b(-130107406, new q(j18, interfaceC0426e4, 0), c0167p);
                                            }
                                            c0167p.p(z6);
                                            long j19 = z4 ? s1Var2.f1811v : z5 ? s1Var2.f1812w : booleanValue ? s1Var2.f1809t : s1Var2.f1810u;
                                            c0167p.Q(-156893937);
                                            Q.a b15 = interfaceC0426e5 != null ? null : Q.f.b(2079816678, new q(j19, interfaceC0426e5, 1), c0167p);
                                            c0167p.p(false);
                                            long j20 = z4 ? s1Var2.f1780H : z5 ? s1Var2.f1781I : booleanValue ? s1Var2.f1778F : s1Var2.f1779G;
                                            c0167p.Q(-156884470);
                                            if (interfaceC0426e8 != null) {
                                                aVar2 = Q.f.b(1263707005, new F.G(j20, k4, interfaceC0426e8, 1), c0167p);
                                            }
                                            c0167p.p(false);
                                            c0167p.Q(-567018607);
                                            G7 = c0167p.G();
                                            if (G7 == w2) {
                                                G7 = C0143d.K(new C0241f(0L), w3);
                                                c0167p.a0(G7);
                                            }
                                            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G7;
                                            Q.a b16 = Q.f.b(157291737, new C0131y0(interfaceC0142c0, interfaceC0849K, interfaceC0426e9, 2), c0167p);
                                            c2 = c0167p.c(f10);
                                            G8 = c0167p.G();
                                            if (!c2 || G8 == w2) {
                                                G8 = new n(f10, interfaceC0142c0);
                                                c0167p.a0(G8);
                                            }
                                            Z0.b(interfaceC0426e, b13, b12, b4, b15, aVar, b14, z3, f10, (InterfaceC0424c) G8, b16, aVar2, interfaceC0849K, c0167p, ((i8 >> 3) & 112) | 6 | ((i7 << 21) & 234881024), ((i7 >> 6) & 7168) | 48);
                                            c0167p.p(false);
                                        }
                                    }
                                    f7 = 1.0f;
                                    c0167p.p(false);
                                    Float valueOf42 = Float.valueOf(f7);
                                    f fVar82 = (f) c0156j0.getValue();
                                    c0167p.Q(1128033978);
                                    ordinal5 = fVar82.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f11 = 1.0f;
                                    c0167p.p(false);
                                    Float valueOf52 = Float.valueOf(f11);
                                    d3.f();
                                    c0167p.Q(-1868044898);
                                    m.t0 j102 = AbstractC0620e.j(150, 0, null, 6);
                                    c0167p.p(false);
                                    i0 b92 = r0.b(d3, valueOf42, valueOf52, j102, u0Var, c0167p, 196608);
                                    f fVar92 = (f) c0156j0.getValue();
                                    c0167p.Q(-107432127);
                                    iArr = y.f2062a;
                                    if (iArr[fVar92.ordinal()] != 1) {
                                    }
                                    c0167p.p(false);
                                    AbstractC0357c f122 = C0352v.f(j11);
                                    f8 = c0167p.f(f122);
                                    G3 = c0167p.G();
                                    if (!f8) {
                                    }
                                    u0 u0Var22 = new u0(l.q.f6522g, new A0.l(21, f122));
                                    c0167p.a0(u0Var22);
                                    G3 = u0Var22;
                                    u0 u0Var32 = (u0) G3;
                                    fVar = (f) s0Var.a();
                                    c0167p.Q(-107432127);
                                    if (iArr[fVar.ordinal()] != 1) {
                                    }
                                    c0167p.p(false);
                                    C0352v c0352v5 = new C0352v(j3);
                                    f fVar102 = (f) c0156j0.getValue();
                                    c0167p.Q(-107432127);
                                    if (iArr[fVar102.ordinal()] != 1) {
                                    }
                                    c0167p.p(false);
                                    C0352v c0352v22 = new C0352v(j12);
                                    d3.f();
                                    c0167p.Q(1528582156);
                                    m.t0 j132 = AbstractC0620e.j(150, 0, null, 6);
                                    c0167p.p(false);
                                    i0 b102 = r0.b(d3, c0352v5, c0352v22, j132, u0Var32, c0167p, 196608);
                                    c0167p.Q(1023351670);
                                    c0167p.p(false);
                                    AbstractC0357c f132 = C0352v.f(j5);
                                    f9 = c0167p.f(f132);
                                    G4 = c0167p.G();
                                    if (!f9) {
                                    }
                                    u0 u0Var42 = new u0(l.q.f6522g, new A0.l(21, f132));
                                    c0167p.a0(u0Var42);
                                    G4 = u0Var42;
                                    u0 u0Var52 = (u0) G4;
                                    c0167p.Q(1023351670);
                                    c0167p.p(false);
                                    C0352v c0352v32 = new C0352v(j5);
                                    c0167p.Q(1023351670);
                                    c0167p.p(false);
                                    C0352v c0352v42 = new C0352v(j5);
                                    d3.f();
                                    c0167p.Q(-543659263);
                                    m.t0 j142 = AbstractC0620e.j(150, 0, null, 6);
                                    c0167p.p(false);
                                    Q.a aVar22 = null;
                                    i0 b112 = r0.b(d3, c0352v32, c0352v42, j142, u0Var52, c0167p, 196608);
                                    floatValue = ((Number) b8.f6815m.getValue()).floatValue();
                                    c0167p.Q(-156998101);
                                    if (interfaceC0426e2 != null) {
                                    }
                                    c0167p.p(false);
                                    if (z4) {
                                    }
                                    long j152 = j4;
                                    G5 = c0167p.G();
                                    W w32 = W.f2783i;
                                    if (G5 == w2) {
                                    }
                                    W0 w022 = (W0) G5;
                                    c0167p.Q(-156965270);
                                    if (interfaceC0426e3 == null) {
                                    }
                                    c0167p.p(false);
                                    long j162 = z4 ? s1Var2.f1784L : z5 ? s1Var2.f1785M : booleanValue ? s1Var2.f1782J : s1Var2.f1783K;
                                    G6 = c0167p.G();
                                    if (G6 == w2) {
                                    }
                                    W0 w032 = (W0) G6;
                                    c0167p.Q(-156940524);
                                    if (interfaceC0426e6 == null) {
                                    }
                                    f10 = floatValue;
                                    aVar = null;
                                    c0167p.p(false);
                                    long j172 = z4 ? s1Var2.f1788P : z5 ? s1Var2.f1789Q : booleanValue ? s1Var2.f1786N : s1Var2.f1787O;
                                    c0167p.Q(-156921964);
                                    if (interfaceC0426e7 == null) {
                                    }
                                    c0167p.p(false);
                                    if (z4) {
                                    }
                                    c0167p.Q(-156902962);
                                    if (interfaceC0426e4 != null) {
                                    }
                                    c0167p.p(z6);
                                    if (z4) {
                                    }
                                    c0167p.Q(-156893937);
                                    if (interfaceC0426e5 != null) {
                                    }
                                    c0167p.p(false);
                                    long j202 = z4 ? s1Var2.f1780H : z5 ? s1Var2.f1781I : booleanValue ? s1Var2.f1778F : s1Var2.f1779G;
                                    c0167p.Q(-156884470);
                                    if (interfaceC0426e8 != null) {
                                    }
                                    c0167p.p(false);
                                    c0167p.Q(-567018607);
                                    G7 = c0167p.G();
                                    if (G7 == w2) {
                                    }
                                    InterfaceC0142c0 interfaceC0142c02 = (InterfaceC0142c0) G7;
                                    Q.a b162 = Q.f.b(157291737, new C0131y0(interfaceC0142c02, interfaceC0849K, interfaceC0426e9, 2), c0167p);
                                    c2 = c0167p.c(f10);
                                    G8 = c0167p.G();
                                    if (!c2) {
                                    }
                                    G8 = new n(f10, interfaceC0142c02);
                                    c0167p.a0(G8);
                                    Z0.b(interfaceC0426e, b13, b12, b4, b15, aVar, b14, z3, f10, (InterfaceC0424c) G8, b162, aVar22, interfaceC0849K, c0167p, ((i8 >> 3) & 112) | 6 | ((i7 << 21) & 234881024), ((i7 >> 6) & 7168) | 48);
                                    c0167p.p(false);
                                }
                                f6 = 1.0f;
                                c0167p.p(false);
                                b3 = r0.b(d3, valueOf3, Float.valueOf(f6), (InterfaceC0640z) xVar.g(d3.f(), c0167p, 0), u0Var, c0167p, 196608);
                                f fVar72 = (f) s0Var.a();
                                c0167p.Q(1128033978);
                                ordinal4 = fVar72.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f7 = 1.0f;
                                c0167p.p(false);
                                Float valueOf422 = Float.valueOf(f7);
                                f fVar822 = (f) c0156j0.getValue();
                                c0167p.Q(1128033978);
                                ordinal5 = fVar822.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f11 = 1.0f;
                                c0167p.p(false);
                                Float valueOf522 = Float.valueOf(f11);
                                d3.f();
                                c0167p.Q(-1868044898);
                                m.t0 j1022 = AbstractC0620e.j(150, 0, null, 6);
                                c0167p.p(false);
                                i0 b922 = r0.b(d3, valueOf422, valueOf522, j1022, u0Var, c0167p, 196608);
                                f fVar922 = (f) c0156j0.getValue();
                                c0167p.Q(-107432127);
                                iArr = y.f2062a;
                                if (iArr[fVar922.ordinal()] != 1) {
                                }
                                c0167p.p(false);
                                AbstractC0357c f1222 = C0352v.f(j11);
                                f8 = c0167p.f(f1222);
                                G3 = c0167p.G();
                                if (!f8) {
                                }
                                u0 u0Var222 = new u0(l.q.f6522g, new A0.l(21, f1222));
                                c0167p.a0(u0Var222);
                                G3 = u0Var222;
                                u0 u0Var322 = (u0) G3;
                                fVar = (f) s0Var.a();
                                c0167p.Q(-107432127);
                                if (iArr[fVar.ordinal()] != 1) {
                                }
                                c0167p.p(false);
                                C0352v c0352v52 = new C0352v(j3);
                                f fVar1022 = (f) c0156j0.getValue();
                                c0167p.Q(-107432127);
                                if (iArr[fVar1022.ordinal()] != 1) {
                                }
                                c0167p.p(false);
                                C0352v c0352v222 = new C0352v(j12);
                                d3.f();
                                c0167p.Q(1528582156);
                                m.t0 j1322 = AbstractC0620e.j(150, 0, null, 6);
                                c0167p.p(false);
                                i0 b1022 = r0.b(d3, c0352v52, c0352v222, j1322, u0Var322, c0167p, 196608);
                                c0167p.Q(1023351670);
                                c0167p.p(false);
                                AbstractC0357c f1322 = C0352v.f(j5);
                                f9 = c0167p.f(f1322);
                                G4 = c0167p.G();
                                if (!f9) {
                                }
                                u0 u0Var422 = new u0(l.q.f6522g, new A0.l(21, f1322));
                                c0167p.a0(u0Var422);
                                G4 = u0Var422;
                                u0 u0Var522 = (u0) G4;
                                c0167p.Q(1023351670);
                                c0167p.p(false);
                                C0352v c0352v322 = new C0352v(j5);
                                c0167p.Q(1023351670);
                                c0167p.p(false);
                                C0352v c0352v422 = new C0352v(j5);
                                d3.f();
                                c0167p.Q(-543659263);
                                m.t0 j1422 = AbstractC0620e.j(150, 0, null, 6);
                                c0167p.p(false);
                                Q.a aVar222 = null;
                                i0 b1122 = r0.b(d3, c0352v322, c0352v422, j1422, u0Var522, c0167p, 196608);
                                floatValue = ((Number) b8.f6815m.getValue()).floatValue();
                                c0167p.Q(-156998101);
                                if (interfaceC0426e2 != null) {
                                }
                                c0167p.p(false);
                                if (z4) {
                                }
                                long j1522 = j4;
                                G5 = c0167p.G();
                                W w322 = W.f2783i;
                                if (G5 == w2) {
                                }
                                W0 w0222 = (W0) G5;
                                c0167p.Q(-156965270);
                                if (interfaceC0426e3 == null) {
                                }
                                c0167p.p(false);
                                long j1622 = z4 ? s1Var2.f1784L : z5 ? s1Var2.f1785M : booleanValue ? s1Var2.f1782J : s1Var2.f1783K;
                                G6 = c0167p.G();
                                if (G6 == w2) {
                                }
                                W0 w0322 = (W0) G6;
                                c0167p.Q(-156940524);
                                if (interfaceC0426e6 == null) {
                                }
                                f10 = floatValue;
                                aVar = null;
                                c0167p.p(false);
                                long j1722 = z4 ? s1Var2.f1788P : z5 ? s1Var2.f1789Q : booleanValue ? s1Var2.f1786N : s1Var2.f1787O;
                                c0167p.Q(-156921964);
                                if (interfaceC0426e7 == null) {
                                }
                                c0167p.p(false);
                                if (z4) {
                                }
                                c0167p.Q(-156902962);
                                if (interfaceC0426e4 != null) {
                                }
                                c0167p.p(z6);
                                if (z4) {
                                }
                                c0167p.Q(-156893937);
                                if (interfaceC0426e5 != null) {
                                }
                                c0167p.p(false);
                                long j2022 = z4 ? s1Var2.f1780H : z5 ? s1Var2.f1781I : booleanValue ? s1Var2.f1778F : s1Var2.f1779G;
                                c0167p.Q(-156884470);
                                if (interfaceC0426e8 != null) {
                                }
                                c0167p.p(false);
                                c0167p.Q(-567018607);
                                G7 = c0167p.G();
                                if (G7 == w2) {
                                }
                                InterfaceC0142c0 interfaceC0142c022 = (InterfaceC0142c0) G7;
                                Q.a b1622 = Q.f.b(157291737, new C0131y0(interfaceC0142c022, interfaceC0849K, interfaceC0426e9, 2), c0167p);
                                c2 = c0167p.c(f10);
                                G8 = c0167p.G();
                                if (!c2) {
                                }
                                G8 = new n(f10, interfaceC0142c022);
                                c0167p.a0(G8);
                                Z0.b(interfaceC0426e, b13, b12, b4, b15, aVar, b14, z3, f10, (InterfaceC0424c) G8, b1622, aVar222, interfaceC0849K, c0167p, ((i8 >> 3) & 112) | 6 | ((i7 << 21) & 234881024), ((i7 >> 6) & 7168) | 48);
                                c0167p.p(false);
                            }
                            f5 = 1.0f;
                            c0167p.p(false);
                            Float valueOf32 = Float.valueOf(f5);
                            f fVar62 = (f) c0156j0.getValue();
                            c0167p.Q(1435837472);
                            ordinal3 = fVar62.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f6 = 1.0f;
                            c0167p.p(false);
                            b3 = r0.b(d3, valueOf32, Float.valueOf(f6), (InterfaceC0640z) xVar.g(d3.f(), c0167p, 0), u0Var, c0167p, 196608);
                            f fVar722 = (f) s0Var.a();
                            c0167p.Q(1128033978);
                            ordinal4 = fVar722.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f7 = 1.0f;
                            c0167p.p(false);
                            Float valueOf4222 = Float.valueOf(f7);
                            f fVar8222 = (f) c0156j0.getValue();
                            c0167p.Q(1128033978);
                            ordinal5 = fVar8222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f11 = 1.0f;
                            c0167p.p(false);
                            Float valueOf5222 = Float.valueOf(f11);
                            d3.f();
                            c0167p.Q(-1868044898);
                            m.t0 j10222 = AbstractC0620e.j(150, 0, null, 6);
                            c0167p.p(false);
                            i0 b9222 = r0.b(d3, valueOf4222, valueOf5222, j10222, u0Var, c0167p, 196608);
                            f fVar9222 = (f) c0156j0.getValue();
                            c0167p.Q(-107432127);
                            iArr = y.f2062a;
                            if (iArr[fVar9222.ordinal()] != 1) {
                            }
                            c0167p.p(false);
                            AbstractC0357c f12222 = C0352v.f(j11);
                            f8 = c0167p.f(f12222);
                            G3 = c0167p.G();
                            if (!f8) {
                            }
                            u0 u0Var2222 = new u0(l.q.f6522g, new A0.l(21, f12222));
                            c0167p.a0(u0Var2222);
                            G3 = u0Var2222;
                            u0 u0Var3222 = (u0) G3;
                            fVar = (f) s0Var.a();
                            c0167p.Q(-107432127);
                            if (iArr[fVar.ordinal()] != 1) {
                            }
                            c0167p.p(false);
                            C0352v c0352v522 = new C0352v(j3);
                            f fVar10222 = (f) c0156j0.getValue();
                            c0167p.Q(-107432127);
                            if (iArr[fVar10222.ordinal()] != 1) {
                            }
                            c0167p.p(false);
                            C0352v c0352v2222 = new C0352v(j12);
                            d3.f();
                            c0167p.Q(1528582156);
                            m.t0 j13222 = AbstractC0620e.j(150, 0, null, 6);
                            c0167p.p(false);
                            i0 b10222 = r0.b(d3, c0352v522, c0352v2222, j13222, u0Var3222, c0167p, 196608);
                            c0167p.Q(1023351670);
                            c0167p.p(false);
                            AbstractC0357c f13222 = C0352v.f(j5);
                            f9 = c0167p.f(f13222);
                            G4 = c0167p.G();
                            if (!f9) {
                            }
                            u0 u0Var4222 = new u0(l.q.f6522g, new A0.l(21, f13222));
                            c0167p.a0(u0Var4222);
                            G4 = u0Var4222;
                            u0 u0Var5222 = (u0) G4;
                            c0167p.Q(1023351670);
                            c0167p.p(false);
                            C0352v c0352v3222 = new C0352v(j5);
                            c0167p.Q(1023351670);
                            c0167p.p(false);
                            C0352v c0352v4222 = new C0352v(j5);
                            d3.f();
                            c0167p.Q(-543659263);
                            m.t0 j14222 = AbstractC0620e.j(150, 0, null, 6);
                            c0167p.p(false);
                            Q.a aVar2222 = null;
                            i0 b11222 = r0.b(d3, c0352v3222, c0352v4222, j14222, u0Var5222, c0167p, 196608);
                            floatValue = ((Number) b8.f6815m.getValue()).floatValue();
                            c0167p.Q(-156998101);
                            if (interfaceC0426e2 != null) {
                            }
                            c0167p.p(false);
                            if (z4) {
                            }
                            long j15222 = j4;
                            G5 = c0167p.G();
                            W w3222 = W.f2783i;
                            if (G5 == w2) {
                            }
                            W0 w02222 = (W0) G5;
                            c0167p.Q(-156965270);
                            if (interfaceC0426e3 == null) {
                            }
                            c0167p.p(false);
                            long j16222 = z4 ? s1Var2.f1784L : z5 ? s1Var2.f1785M : booleanValue ? s1Var2.f1782J : s1Var2.f1783K;
                            G6 = c0167p.G();
                            if (G6 == w2) {
                            }
                            W0 w03222 = (W0) G6;
                            c0167p.Q(-156940524);
                            if (interfaceC0426e6 == null) {
                            }
                            f10 = floatValue;
                            aVar = null;
                            c0167p.p(false);
                            long j17222 = z4 ? s1Var2.f1788P : z5 ? s1Var2.f1789Q : booleanValue ? s1Var2.f1786N : s1Var2.f1787O;
                            c0167p.Q(-156921964);
                            if (interfaceC0426e7 == null) {
                            }
                            c0167p.p(false);
                            if (z4) {
                            }
                            c0167p.Q(-156902962);
                            if (interfaceC0426e4 != null) {
                            }
                            c0167p.p(z6);
                            if (z4) {
                            }
                            c0167p.Q(-156893937);
                            if (interfaceC0426e5 != null) {
                            }
                            c0167p.p(false);
                            long j20222 = z4 ? s1Var2.f1780H : z5 ? s1Var2.f1781I : booleanValue ? s1Var2.f1778F : s1Var2.f1779G;
                            c0167p.Q(-156884470);
                            if (interfaceC0426e8 != null) {
                            }
                            c0167p.p(false);
                            c0167p.Q(-567018607);
                            G7 = c0167p.G();
                            if (G7 == w2) {
                            }
                            InterfaceC0142c0 interfaceC0142c0222 = (InterfaceC0142c0) G7;
                            Q.a b16222 = Q.f.b(157291737, new C0131y0(interfaceC0142c0222, interfaceC0849K, interfaceC0426e9, 2), c0167p);
                            c2 = c0167p.c(f10);
                            G8 = c0167p.G();
                            if (!c2) {
                            }
                            G8 = new n(f10, interfaceC0142c0222);
                            c0167p.a0(G8);
                            Z0.b(interfaceC0426e, b13, b12, b4, b15, aVar, b14, z3, f10, (InterfaceC0424c) G8, b16222, aVar2222, interfaceC0849K, c0167p, ((i8 >> 3) & 112) | 6 | ((i7 << 21) & 234881024), ((i7 >> 6) & 7168) | 48);
                            c0167p.p(false);
                        } else if (ordinal != 2) {
                            throw new C1.c();
                        }
                    } else {
                        s0Var = s0Var2;
                    }
                    f4 = 1.0f;
                    c0167p.p(false);
                    Float valueOf22 = Float.valueOf(f4);
                    d3.f();
                    c0167p.Q(1276209157);
                    m.t0 j92 = AbstractC0620e.j(150, 0, null, 6);
                    c0167p.p(false);
                    int i82 = i5;
                    i0 b82 = r0.b(d3, valueOf, valueOf22, j92, u0Var, c0167p, 196608);
                    x xVar2 = x.f2061e;
                    f fVar52 = (f) s0Var.a();
                    c0167p.Q(1435837472);
                    ordinal2 = fVar52.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f5 = 1.0f;
                    c0167p.p(false);
                    Float valueOf322 = Float.valueOf(f5);
                    f fVar622 = (f) c0156j0.getValue();
                    c0167p.Q(1435837472);
                    ordinal3 = fVar622.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f6 = 1.0f;
                    c0167p.p(false);
                    b3 = r0.b(d3, valueOf322, Float.valueOf(f6), (InterfaceC0640z) xVar2.g(d3.f(), c0167p, 0), u0Var, c0167p, 196608);
                    f fVar7222 = (f) s0Var.a();
                    c0167p.Q(1128033978);
                    ordinal4 = fVar7222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f7 = 1.0f;
                    c0167p.p(false);
                    Float valueOf42222 = Float.valueOf(f7);
                    f fVar82222 = (f) c0156j0.getValue();
                    c0167p.Q(1128033978);
                    ordinal5 = fVar82222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f11 = 1.0f;
                    c0167p.p(false);
                    Float valueOf52222 = Float.valueOf(f11);
                    d3.f();
                    c0167p.Q(-1868044898);
                    m.t0 j102222 = AbstractC0620e.j(150, 0, null, 6);
                    c0167p.p(false);
                    i0 b92222 = r0.b(d3, valueOf42222, valueOf52222, j102222, u0Var, c0167p, 196608);
                    f fVar92222 = (f) c0156j0.getValue();
                    c0167p.Q(-107432127);
                    iArr = y.f2062a;
                    if (iArr[fVar92222.ordinal()] != 1) {
                    }
                    c0167p.p(false);
                    AbstractC0357c f122222 = C0352v.f(j11);
                    f8 = c0167p.f(f122222);
                    G3 = c0167p.G();
                    if (!f8) {
                    }
                    u0 u0Var22222 = new u0(l.q.f6522g, new A0.l(21, f122222));
                    c0167p.a0(u0Var22222);
                    G3 = u0Var22222;
                    u0 u0Var32222 = (u0) G3;
                    fVar = (f) s0Var.a();
                    c0167p.Q(-107432127);
                    if (iArr[fVar.ordinal()] != 1) {
                    }
                    c0167p.p(false);
                    C0352v c0352v5222 = new C0352v(j3);
                    f fVar102222 = (f) c0156j0.getValue();
                    c0167p.Q(-107432127);
                    if (iArr[fVar102222.ordinal()] != 1) {
                    }
                    c0167p.p(false);
                    C0352v c0352v22222 = new C0352v(j12);
                    d3.f();
                    c0167p.Q(1528582156);
                    m.t0 j132222 = AbstractC0620e.j(150, 0, null, 6);
                    c0167p.p(false);
                    i0 b102222 = r0.b(d3, c0352v5222, c0352v22222, j132222, u0Var32222, c0167p, 196608);
                    c0167p.Q(1023351670);
                    c0167p.p(false);
                    AbstractC0357c f132222 = C0352v.f(j5);
                    f9 = c0167p.f(f132222);
                    G4 = c0167p.G();
                    if (!f9) {
                    }
                    u0 u0Var42222 = new u0(l.q.f6522g, new A0.l(21, f132222));
                    c0167p.a0(u0Var42222);
                    G4 = u0Var42222;
                    u0 u0Var52222 = (u0) G4;
                    c0167p.Q(1023351670);
                    c0167p.p(false);
                    C0352v c0352v32222 = new C0352v(j5);
                    c0167p.Q(1023351670);
                    c0167p.p(false);
                    C0352v c0352v42222 = new C0352v(j5);
                    d3.f();
                    c0167p.Q(-543659263);
                    m.t0 j142222 = AbstractC0620e.j(150, 0, null, 6);
                    c0167p.p(false);
                    Q.a aVar22222 = null;
                    i0 b112222 = r0.b(d3, c0352v32222, c0352v42222, j142222, u0Var52222, c0167p, 196608);
                    floatValue = ((Number) b82.f6815m.getValue()).floatValue();
                    c0167p.Q(-156998101);
                    if (interfaceC0426e2 != null) {
                    }
                    c0167p.p(false);
                    if (z4) {
                    }
                    long j152222 = j4;
                    G5 = c0167p.G();
                    W w32222 = W.f2783i;
                    if (G5 == w2) {
                    }
                    W0 w022222 = (W0) G5;
                    c0167p.Q(-156965270);
                    if (interfaceC0426e3 == null) {
                    }
                    c0167p.p(false);
                    long j162222 = z4 ? s1Var2.f1784L : z5 ? s1Var2.f1785M : booleanValue ? s1Var2.f1782J : s1Var2.f1783K;
                    G6 = c0167p.G();
                    if (G6 == w2) {
                    }
                    W0 w032222 = (W0) G6;
                    c0167p.Q(-156940524);
                    if (interfaceC0426e6 == null) {
                    }
                    f10 = floatValue;
                    aVar = null;
                    c0167p.p(false);
                    long j172222 = z4 ? s1Var2.f1788P : z5 ? s1Var2.f1789Q : booleanValue ? s1Var2.f1786N : s1Var2.f1787O;
                    c0167p.Q(-156921964);
                    if (interfaceC0426e7 == null) {
                    }
                    c0167p.p(false);
                    if (z4) {
                    }
                    c0167p.Q(-156902962);
                    if (interfaceC0426e4 != null) {
                    }
                    c0167p.p(z6);
                    if (z4) {
                    }
                    c0167p.Q(-156893937);
                    if (interfaceC0426e5 != null) {
                    }
                    c0167p.p(false);
                    long j202222 = z4 ? s1Var2.f1780H : z5 ? s1Var2.f1781I : booleanValue ? s1Var2.f1778F : s1Var2.f1779G;
                    c0167p.Q(-156884470);
                    if (interfaceC0426e8 != null) {
                    }
                    c0167p.p(false);
                    c0167p.Q(-567018607);
                    G7 = c0167p.G();
                    if (G7 == w2) {
                    }
                    InterfaceC0142c0 interfaceC0142c02222 = (InterfaceC0142c0) G7;
                    Q.a b162222 = Q.f.b(157291737, new C0131y0(interfaceC0142c02222, interfaceC0849K, interfaceC0426e9, 2), c0167p);
                    c2 = c0167p.c(f10);
                    G8 = c0167p.G();
                    if (!c2) {
                    }
                    G8 = new n(f10, interfaceC0142c02222);
                    c0167p.a0(G8);
                    Z0.b(interfaceC0426e, b13, b12, b4, b15, aVar, b14, z3, f10, (InterfaceC0424c) G8, b162222, aVar22222, interfaceC0849K, c0167p, ((i82 >> 3) & 112) | 6 | ((i7 << 21) & 234881024), ((i7 >> 6) & 7168) | 48);
                    c0167p.p(false);
                } else if (ordinal6 != 2) {
                    throw new C1.c();
                }
            }
            f3 = 1.0f;
            c0167p.p(false);
            Float valueOf6 = Float.valueOf(f3);
            C0156j0 c0156j02 = d3.f6839d;
            f fVar42 = (f) c0156j02.getValue();
            c0167p.Q(-2036730335);
            ordinal = fVar42.ordinal();
            if (ordinal == 0) {
            }
            f4 = 1.0f;
            c0167p.p(false);
            Float valueOf222 = Float.valueOf(f4);
            d3.f();
            c0167p.Q(1276209157);
            m.t0 j922 = AbstractC0620e.j(150, 0, null, 6);
            c0167p.p(false);
            int i822 = i5;
            i0 b822 = r0.b(d3, valueOf6, valueOf222, j922, u0Var, c0167p, 196608);
            x xVar22 = x.f2061e;
            f fVar522 = (f) s0Var.a();
            c0167p.Q(1435837472);
            ordinal2 = fVar522.ordinal();
            if (ordinal2 != 0) {
            }
            f5 = 1.0f;
            c0167p.p(false);
            Float valueOf3222 = Float.valueOf(f5);
            f fVar6222 = (f) c0156j02.getValue();
            c0167p.Q(1435837472);
            ordinal3 = fVar6222.ordinal();
            if (ordinal3 != 0) {
            }
            f6 = 1.0f;
            c0167p.p(false);
            b3 = r0.b(d3, valueOf3222, Float.valueOf(f6), (InterfaceC0640z) xVar22.g(d3.f(), c0167p, 0), u0Var, c0167p, 196608);
            f fVar72222 = (f) s0Var.a();
            c0167p.Q(1128033978);
            ordinal4 = fVar72222.ordinal();
            if (ordinal4 != 0) {
            }
            f7 = 1.0f;
            c0167p.p(false);
            Float valueOf422222 = Float.valueOf(f7);
            f fVar822222 = (f) c0156j02.getValue();
            c0167p.Q(1128033978);
            ordinal5 = fVar822222.ordinal();
            if (ordinal5 != 0) {
            }
            f11 = 1.0f;
            c0167p.p(false);
            Float valueOf522222 = Float.valueOf(f11);
            d3.f();
            c0167p.Q(-1868044898);
            m.t0 j1022222 = AbstractC0620e.j(150, 0, null, 6);
            c0167p.p(false);
            i0 b922222 = r0.b(d3, valueOf422222, valueOf522222, j1022222, u0Var, c0167p, 196608);
            f fVar922222 = (f) c0156j02.getValue();
            c0167p.Q(-107432127);
            iArr = y.f2062a;
            if (iArr[fVar922222.ordinal()] != 1) {
            }
            c0167p.p(false);
            AbstractC0357c f1222222 = C0352v.f(j11);
            f8 = c0167p.f(f1222222);
            G3 = c0167p.G();
            if (!f8) {
            }
            u0 u0Var222222 = new u0(l.q.f6522g, new A0.l(21, f1222222));
            c0167p.a0(u0Var222222);
            G3 = u0Var222222;
            u0 u0Var322222 = (u0) G3;
            fVar = (f) s0Var.a();
            c0167p.Q(-107432127);
            if (iArr[fVar.ordinal()] != 1) {
            }
            c0167p.p(false);
            C0352v c0352v52222 = new C0352v(j3);
            f fVar1022222 = (f) c0156j02.getValue();
            c0167p.Q(-107432127);
            if (iArr[fVar1022222.ordinal()] != 1) {
            }
            c0167p.p(false);
            C0352v c0352v222222 = new C0352v(j12);
            d3.f();
            c0167p.Q(1528582156);
            m.t0 j1322222 = AbstractC0620e.j(150, 0, null, 6);
            c0167p.p(false);
            i0 b1022222 = r0.b(d3, c0352v52222, c0352v222222, j1322222, u0Var322222, c0167p, 196608);
            c0167p.Q(1023351670);
            c0167p.p(false);
            AbstractC0357c f1322222 = C0352v.f(j5);
            f9 = c0167p.f(f1322222);
            G4 = c0167p.G();
            if (!f9) {
            }
            u0 u0Var422222 = new u0(l.q.f6522g, new A0.l(21, f1322222));
            c0167p.a0(u0Var422222);
            G4 = u0Var422222;
            u0 u0Var522222 = (u0) G4;
            c0167p.Q(1023351670);
            c0167p.p(false);
            C0352v c0352v322222 = new C0352v(j5);
            c0167p.Q(1023351670);
            c0167p.p(false);
            C0352v c0352v422222 = new C0352v(j5);
            d3.f();
            c0167p.Q(-543659263);
            m.t0 j1422222 = AbstractC0620e.j(150, 0, null, 6);
            c0167p.p(false);
            Q.a aVar222222 = null;
            i0 b1122222 = r0.b(d3, c0352v322222, c0352v422222, j1422222, u0Var522222, c0167p, 196608);
            floatValue = ((Number) b822.f6815m.getValue()).floatValue();
            c0167p.Q(-156998101);
            if (interfaceC0426e2 != null) {
            }
            c0167p.p(false);
            if (z4) {
            }
            long j1522222 = j4;
            G5 = c0167p.G();
            W w322222 = W.f2783i;
            if (G5 == w2) {
            }
            W0 w0222222 = (W0) G5;
            c0167p.Q(-156965270);
            if (interfaceC0426e3 == null) {
            }
            c0167p.p(false);
            long j1622222 = z4 ? s1Var2.f1784L : z5 ? s1Var2.f1785M : booleanValue ? s1Var2.f1782J : s1Var2.f1783K;
            G6 = c0167p.G();
            if (G6 == w2) {
            }
            W0 w0322222 = (W0) G6;
            c0167p.Q(-156940524);
            if (interfaceC0426e6 == null) {
            }
            f10 = floatValue;
            aVar = null;
            c0167p.p(false);
            long j1722222 = z4 ? s1Var2.f1788P : z5 ? s1Var2.f1789Q : booleanValue ? s1Var2.f1786N : s1Var2.f1787O;
            c0167p.Q(-156921964);
            if (interfaceC0426e7 == null) {
            }
            c0167p.p(false);
            if (z4) {
            }
            c0167p.Q(-156902962);
            if (interfaceC0426e4 != null) {
            }
            c0167p.p(z6);
            if (z4) {
            }
            c0167p.Q(-156893937);
            if (interfaceC0426e5 != null) {
            }
            c0167p.p(false);
            long j2022222 = z4 ? s1Var2.f1780H : z5 ? s1Var2.f1781I : booleanValue ? s1Var2.f1778F : s1Var2.f1779G;
            c0167p.Q(-156884470);
            if (interfaceC0426e8 != null) {
            }
            c0167p.p(false);
            c0167p.Q(-567018607);
            G7 = c0167p.G();
            if (G7 == w2) {
            }
            InterfaceC0142c0 interfaceC0142c022222 = (InterfaceC0142c0) G7;
            Q.a b1622222 = Q.f.b(157291737, new C0131y0(interfaceC0142c022222, interfaceC0849K, interfaceC0426e9, 2), c0167p);
            c2 = c0167p.c(f10);
            G8 = c0167p.G();
            if (!c2) {
            }
            G8 = new n(f10, interfaceC0142c022222);
            c0167p.a0(G8);
            Z0.b(interfaceC0426e, b13, b12, b4, b15, aVar, b14, z3, f10, (InterfaceC0424c) G8, b1622222, aVar222222, interfaceC0849K, c0167p, ((i822 >> 3) & 112) | 6 | ((i7 << 21) & 234881024), ((i7 >> 6) & 7168) | 48);
            c0167p.p(false);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v(str, interfaceC0426e, rVar, interfaceC0426e2, interfaceC0426e3, interfaceC0426e4, interfaceC0426e5, interfaceC0426e6, interfaceC0426e7, interfaceC0426e8, z3, z4, z5, jVar, interfaceC0849K, s1Var, interfaceC0426e9, i3, i4);
        }
    }

    public static final void b(long j3, K k3, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(1208685580);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.e(j3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(k3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            AbstractC0136c.a(j3, k3, interfaceC0426e, c0167p, i4 & 1022);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new m(j3, k3, interfaceC0426e, i3, 1);
        }
    }

    public static final void c(long j3, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(660142980);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.e(j3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            C0143d.a(V.f1382a.a(new C0352v(j3)), interfaceC0426e, c0167p, (i4 & 112) | 8);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new w(j3, interfaceC0426e, i3);
        }
    }

    public static final Object d(InterfaceC0884F interfaceC0884F) {
        Object t3 = interfaceC0884F.t();
        C0920q c0920q = t3 instanceof C0920q ? (C0920q) t3 : null;
        if (c0920q != null) {
            return c0920q.f8171q;
        }
        return null;
    }

    public static final int e(AbstractC0893O abstractC0893O) {
        if (abstractC0893O != null) {
            return abstractC0893O.f8127e;
        }
        return 0;
    }

    public static final int f(AbstractC0893O abstractC0893O) {
        if (abstractC0893O != null) {
            return abstractC0893O.f8126d;
        }
        return 0;
    }
}
