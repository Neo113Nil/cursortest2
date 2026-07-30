package e0;

import a0.i0;
import a0.s;
import a2.k0;
import d0.a4;
import d0.b4;
import d0.r2;
import d0.t3;
import g0.e0;
import g0.g1;
import g0.g2;
import g0.t0;
import g0.z0;
import g2.d0;
import l.a0;
import l.n1;
import l.p1;
import l.t1;
import l.u1;
import l.v1;
import l.w1;
import l.x1;
import p1.q;
import q.h0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static final float f2714b;

    /* renamed from: g, reason: collision with root package name */
    public static final float f2719g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f2720h;

    /* renamed from: i, reason: collision with root package name */
    public static final s0.o f2721i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f2713a = r4.a.b(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final float f2715c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2716d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2717e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2718f = 24;

    static {
        float f9 = 16;
        f2714b = f9;
        f2719g = f9;
        f2720h = f9;
        float f10 = 48;
        f2721i = androidx.compose.foundation.layout.c.a(s0.l.f8103a, f10, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x03cb, code lost:
    
        if (r7 != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0354, code lost:
    
        if (r7 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0329, code lost:
    
        if (r7 != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, q6.e eVar, s sVar, q6.e eVar2, boolean z8, boolean z9, p.i iVar, h0 h0Var, t3 t3Var, o0.a aVar, g0.p pVar, int i7, int i8) {
        int i9;
        Object obj;
        int i10;
        p1 p1Var;
        float f9;
        int ordinal;
        float f10;
        int ordinal2;
        float f11;
        int ordinal3;
        float f12;
        int ordinal4;
        float f13;
        int ordinal5;
        n1 b9;
        int[] iArr;
        boolean f14;
        Object G;
        n1 n1Var;
        c cVar;
        int[] iArr2;
        long j8;
        c cVar2;
        boolean f15;
        Object G2;
        int i11;
        float f16;
        boolean z10;
        t0 t0Var;
        n1 n1Var2;
        o0.a b10;
        Object G3;
        Object G4;
        Object G5;
        boolean c4;
        Object G6;
        g0.p pVar2;
        t0 t0Var2 = t0.f3903k;
        pVar.S(1514469103);
        if ((i7 & 6) == 0) {
            i9 = (pVar.f(p.f2722f) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= pVar.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= pVar.h(eVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            obj = sVar;
            i9 |= pVar.f(obj) ? 2048 : 1024;
        } else {
            obj = sVar;
        }
        if ((i7 & 24576) == 0) {
            i9 |= pVar.h(eVar2) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            i9 |= pVar.h(null) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= pVar.h(null) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= pVar.h(null) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= pVar.h(null) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= pVar.h(null) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (pVar.h(null) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= pVar.g(z8) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= pVar.g(z9) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= pVar.g(false) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= pVar.f(iVar) ? 16384 : 8192;
        }
        if ((i8 & 196608) == 0) {
            i10 |= pVar.f(h0Var) ? 131072 : 65536;
        }
        if ((i8 & 1572864) == 0) {
            i10 |= pVar.f(t3Var) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i10 |= pVar.h(aVar) ? 8388608 : 4194304;
        }
        if ((306783379 & i9) == 306783378 && (i10 & 4793491) == 4793490 && pVar.x()) {
            pVar.L();
            pVar2 = pVar;
        } else {
            boolean z11 = ((i9 & 112) == 32) | ((i9 & 7168) == 2048);
            Object G7 = pVar.G();
            t0 t0Var3 = g0.l.f3784a;
            if (z11 || G7 == t0Var3) {
                a2.g gVar = new a2.g(str, null, 6);
                obj.getClass();
                d0 d0Var = new d0(gVar, g2.p.f4050a);
                pVar.a0(d0Var);
                G7 = d0Var;
            }
            String str2 = ((d0) G7).f4010a.f373f;
            boolean booleanValue = ((Boolean) t6.a.v(iVar, pVar, (i10 >> 12) & 14).getValue()).booleanValue();
            c cVar3 = booleanValue ? c.f2669f : str2.length() == 0 ? c.f2670g : c.f2671h;
            long j9 = !z9 ? t3Var.f2431z : booleanValue ? t3Var.f2429x : t3Var.f2430y;
            a4 a4Var = (a4) pVar.k(b4.f1865a);
            k0 k0Var = a4Var.f1840j;
            k0 k0Var2 = a4Var.f1842l;
            long b11 = k0Var.b();
            int i12 = i9;
            long j10 = u.f10057g;
            boolean z12 = (u.c(b11, j10) && !u.c(k0Var2.b(), j10)) || (!u.c(k0Var.b(), j10) && u.c(k0Var2.b(), j10));
            long b12 = k0Var2.b();
            if (z12 && b12 == 16) {
                b12 = j9;
            }
            long b13 = k0Var.b();
            if (z12 && b13 == 16) {
                b13 = j9;
            }
            boolean z13 = eVar2 != null;
            boolean z14 = z12;
            p1 c6 = t1.c(cVar3, pVar, 48, 0);
            u1 u1Var = c6.f5610a;
            g1 g1Var = c6.f5613d;
            w1 w1Var = x1.f5722a;
            c cVar4 = (c) u1Var.a();
            pVar.Q(-2036730335);
            int ordinal6 = cVar4.ordinal();
            float f17 = 0.0f;
            if (ordinal6 != 0) {
                p1Var = c6;
                if (ordinal6 == 1) {
                    f9 = 0.0f;
                    pVar.p(false);
                    Float valueOf = Float.valueOf(f9);
                    c cVar5 = (c) g1Var.getValue();
                    pVar.Q(-2036730335);
                    ordinal = cVar5.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f10 = 0.0f;
                            pVar.p(false);
                            Float valueOf2 = Float.valueOf(f10);
                            p1Var.f();
                            pVar.Q(1276209157);
                            v1 l8 = l.e.l(150, 6, null);
                            pVar.p(false);
                            p1 p1Var2 = p1Var;
                            n1 b14 = t1.b(p1Var2, valueOf, valueOf2, l8, w1Var, pVar, 196608);
                            c cVar6 = (c) u1Var.a();
                            pVar.Q(1435837472);
                            ordinal2 = cVar6.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        throw new b4.c();
                                    }
                                }
                                f11 = 0.0f;
                                pVar.p(false);
                                Float valueOf3 = Float.valueOf(f11);
                                c cVar7 = (c) g1Var.getValue();
                                pVar.Q(1435837472);
                                ordinal3 = cVar7.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            throw new b4.c();
                                        }
                                    }
                                    f12 = 0.0f;
                                    pVar.p(false);
                                    n1 b15 = t1.b(p1Var2, valueOf3, Float.valueOf(f12), (a0) m.f2711g.c(p1Var2.f(), pVar, 0), w1Var, pVar, 196608);
                                    c cVar8 = (c) u1Var.a();
                                    pVar.Q(1128033978);
                                    ordinal4 = cVar8.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                throw new b4.c();
                                            }
                                        } else if (z13) {
                                            f13 = 0.0f;
                                            pVar.p(false);
                                            Float valueOf4 = Float.valueOf(f13);
                                            c cVar9 = (c) g1Var.getValue();
                                            pVar.Q(1128033978);
                                            ordinal5 = cVar9.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        throw new b4.c();
                                                    }
                                                }
                                            }
                                            f17 = 1.0f;
                                            pVar.p(false);
                                            Float valueOf5 = Float.valueOf(f17);
                                            p1Var2.f();
                                            pVar.Q(-1868044898);
                                            v1 l9 = l.e.l(150, 6, null);
                                            pVar.p(false);
                                            b9 = t1.b(p1Var2, valueOf4, valueOf5, l9, w1Var, pVar, 196608);
                                            c cVar10 = (c) g1Var.getValue();
                                            pVar.Q(-107432127);
                                            iArr = n.f2712a;
                                            long j11 = iArr[cVar10.ordinal()] != 1 ? b12 : b13;
                                            pVar.p(false);
                                            a1.c f18 = u.f(j11);
                                            f14 = pVar.f(f18);
                                            G = pVar.G();
                                            if (!f14 || G == t0Var3) {
                                                n1Var = b9;
                                                w1 w1Var2 = new w1(k.u.f5266h, new c1.a(14, f18));
                                                pVar.a0(w1Var2);
                                                G = w1Var2;
                                            } else {
                                                n1Var = b9;
                                            }
                                            w1 w1Var3 = (w1) G;
                                            cVar = (c) u1Var.a();
                                            pVar.Q(-107432127);
                                            if (iArr[cVar.ordinal()] != 1) {
                                                iArr2 = iArr;
                                                j8 = b12;
                                            } else {
                                                iArr2 = iArr;
                                                j8 = b13;
                                            }
                                            pVar.p(false);
                                            u uVar = new u(j8);
                                            cVar2 = (c) g1Var.getValue();
                                            pVar.Q(-107432127);
                                            if (iArr2[cVar2.ordinal()] != 1) {
                                                b12 = b13;
                                            }
                                            pVar.p(false);
                                            u uVar2 = new u(b12);
                                            p1Var2.f();
                                            pVar.Q(1528582156);
                                            v1 l10 = l.e.l(150, 6, null);
                                            pVar.p(false);
                                            n1 b16 = t1.b(p1Var2, uVar, uVar2, l10, w1Var3, pVar, 196608);
                                            pVar.Q(1023351670);
                                            pVar.p(false);
                                            a1.c f19 = u.f(j9);
                                            f15 = pVar.f(f19);
                                            G2 = pVar.G();
                                            if (!f15 || G2 == t0Var3) {
                                                w1 w1Var4 = new w1(k.u.f5266h, new c1.a(14, f19));
                                                pVar.a0(w1Var4);
                                                G2 = w1Var4;
                                            }
                                            pVar.Q(1023351670);
                                            pVar.p(false);
                                            u uVar3 = new u(j9);
                                            pVar.Q(1023351670);
                                            pVar.p(false);
                                            u uVar4 = new u(j9);
                                            p1Var2.f();
                                            pVar.Q(-543659263);
                                            v1 l11 = l.e.l(150, 6, null);
                                            pVar.p(false);
                                            n1 b17 = t1.b(p1Var2, uVar3, uVar4, l11, (w1) G2, pVar, 196608);
                                            float floatValue = ((Number) b14.f5586o.getValue()).floatValue();
                                            pVar.Q(-156998101);
                                            if (eVar2 != null) {
                                                z10 = false;
                                                i11 = 1;
                                                f16 = floatValue;
                                                t0Var = t0Var2;
                                                n1Var2 = n1Var;
                                                b10 = null;
                                            } else {
                                                i11 = 1;
                                                f16 = floatValue;
                                                z10 = false;
                                                t0Var = t0Var2;
                                                n1Var2 = n1Var;
                                                b10 = o0.f.b(-1236585568, new k(k0Var, k0Var2, f16, b17, eVar2, z14, b16), pVar);
                                            }
                                            pVar.p(z10);
                                            G3 = pVar.G();
                                            if (G3 == t0Var3) {
                                                i0 i0Var = new i0(b15, 3);
                                                b1.b bVar = g2.f3733a;
                                                e0 e0Var = new e0(i0Var, t0Var);
                                                pVar.a0(e0Var);
                                                G3 = e0Var;
                                            }
                                            pVar.Q(-156965270);
                                            pVar.p(z10);
                                            G4 = pVar.G();
                                            if (G4 == t0Var3) {
                                                i0 i0Var2 = new i0(n1Var2, 4);
                                                b1.b bVar2 = g2.f3733a;
                                                e0 e0Var2 = new e0(i0Var2, t0Var);
                                                pVar.a0(e0Var2);
                                                G4 = e0Var2;
                                            }
                                            pVar.Q(-156940524);
                                            pVar.p(z10);
                                            pVar.Q(-156921964);
                                            pVar.p(z10);
                                            pVar.Q(-156902962);
                                            pVar.p(z10);
                                            pVar.Q(-156893937);
                                            pVar.p(z10);
                                            pVar.Q(-156884470);
                                            pVar.p(z10);
                                            pVar.Q(-567018607);
                                            G5 = pVar.G();
                                            if (G5 == t0Var3) {
                                                G5 = g0.d.J(new y0.f(0L), t0Var);
                                                pVar.a0(G5);
                                            }
                                            z0 z0Var = (z0) G5;
                                            o0.a b18 = o0.f.b(157291737, new d0.x1(z0Var, h0Var, aVar, i11), pVar);
                                            c4 = pVar.c(f16);
                                            G6 = pVar.G();
                                            if (!c4 || G6 == t0Var3) {
                                                G6 = new i(f16, z0Var);
                                                pVar.a0(G6);
                                            }
                                            r2.b(eVar, null, b10, null, null, null, null, z8, f16, (q6.c) G6, b18, null, h0Var, pVar, ((i12 >> 3) & 112) | 6 | ((i10 << 21) & 234881024), ((i10 >> 6) & 7168) | 48);
                                            pVar2 = pVar;
                                            pVar2.p(z10);
                                        }
                                    }
                                    f13 = 1.0f;
                                    pVar.p(false);
                                    Float valueOf42 = Float.valueOf(f13);
                                    c cVar92 = (c) g1Var.getValue();
                                    pVar.Q(1128033978);
                                    ordinal5 = cVar92.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f17 = 1.0f;
                                    pVar.p(false);
                                    Float valueOf52 = Float.valueOf(f17);
                                    p1Var2.f();
                                    pVar.Q(-1868044898);
                                    v1 l92 = l.e.l(150, 6, null);
                                    pVar.p(false);
                                    b9 = t1.b(p1Var2, valueOf42, valueOf52, l92, w1Var, pVar, 196608);
                                    c cVar102 = (c) g1Var.getValue();
                                    pVar.Q(-107432127);
                                    iArr = n.f2712a;
                                    if (iArr[cVar102.ordinal()] != 1) {
                                    }
                                    pVar.p(false);
                                    a1.c f182 = u.f(j11);
                                    f14 = pVar.f(f182);
                                    G = pVar.G();
                                    if (f14) {
                                    }
                                    n1Var = b9;
                                    w1 w1Var22 = new w1(k.u.f5266h, new c1.a(14, f182));
                                    pVar.a0(w1Var22);
                                    G = w1Var22;
                                    w1 w1Var32 = (w1) G;
                                    cVar = (c) u1Var.a();
                                    pVar.Q(-107432127);
                                    if (iArr[cVar.ordinal()] != 1) {
                                    }
                                    pVar.p(false);
                                    u uVar5 = new u(j8);
                                    cVar2 = (c) g1Var.getValue();
                                    pVar.Q(-107432127);
                                    if (iArr2[cVar2.ordinal()] != 1) {
                                    }
                                    pVar.p(false);
                                    u uVar22 = new u(b12);
                                    p1Var2.f();
                                    pVar.Q(1528582156);
                                    v1 l102 = l.e.l(150, 6, null);
                                    pVar.p(false);
                                    n1 b162 = t1.b(p1Var2, uVar5, uVar22, l102, w1Var32, pVar, 196608);
                                    pVar.Q(1023351670);
                                    pVar.p(false);
                                    a1.c f192 = u.f(j9);
                                    f15 = pVar.f(f192);
                                    G2 = pVar.G();
                                    if (!f15) {
                                    }
                                    w1 w1Var42 = new w1(k.u.f5266h, new c1.a(14, f192));
                                    pVar.a0(w1Var42);
                                    G2 = w1Var42;
                                    pVar.Q(1023351670);
                                    pVar.p(false);
                                    u uVar32 = new u(j9);
                                    pVar.Q(1023351670);
                                    pVar.p(false);
                                    u uVar42 = new u(j9);
                                    p1Var2.f();
                                    pVar.Q(-543659263);
                                    v1 l112 = l.e.l(150, 6, null);
                                    pVar.p(false);
                                    n1 b172 = t1.b(p1Var2, uVar32, uVar42, l112, (w1) G2, pVar, 196608);
                                    float floatValue2 = ((Number) b14.f5586o.getValue()).floatValue();
                                    pVar.Q(-156998101);
                                    if (eVar2 != null) {
                                    }
                                    pVar.p(z10);
                                    G3 = pVar.G();
                                    if (G3 == t0Var3) {
                                    }
                                    pVar.Q(-156965270);
                                    pVar.p(z10);
                                    G4 = pVar.G();
                                    if (G4 == t0Var3) {
                                    }
                                    pVar.Q(-156940524);
                                    pVar.p(z10);
                                    pVar.Q(-156921964);
                                    pVar.p(z10);
                                    pVar.Q(-156902962);
                                    pVar.p(z10);
                                    pVar.Q(-156893937);
                                    pVar.p(z10);
                                    pVar.Q(-156884470);
                                    pVar.p(z10);
                                    pVar.Q(-567018607);
                                    G5 = pVar.G();
                                    if (G5 == t0Var3) {
                                    }
                                    z0 z0Var2 = (z0) G5;
                                    o0.a b182 = o0.f.b(157291737, new d0.x1(z0Var2, h0Var, aVar, i11), pVar);
                                    c4 = pVar.c(f16);
                                    G6 = pVar.G();
                                    if (!c4) {
                                    }
                                    G6 = new i(f16, z0Var2);
                                    pVar.a0(G6);
                                    r2.b(eVar, null, b10, null, null, null, null, z8, f16, (q6.c) G6, b182, null, h0Var, pVar, ((i12 >> 3) & 112) | 6 | ((i10 << 21) & 234881024), ((i10 >> 6) & 7168) | 48);
                                    pVar2 = pVar;
                                    pVar2.p(z10);
                                }
                                f12 = 1.0f;
                                pVar.p(false);
                                n1 b152 = t1.b(p1Var2, valueOf3, Float.valueOf(f12), (a0) m.f2711g.c(p1Var2.f(), pVar, 0), w1Var, pVar, 196608);
                                c cVar82 = (c) u1Var.a();
                                pVar.Q(1128033978);
                                ordinal4 = cVar82.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f13 = 1.0f;
                                pVar.p(false);
                                Float valueOf422 = Float.valueOf(f13);
                                c cVar922 = (c) g1Var.getValue();
                                pVar.Q(1128033978);
                                ordinal5 = cVar922.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f17 = 1.0f;
                                pVar.p(false);
                                Float valueOf522 = Float.valueOf(f17);
                                p1Var2.f();
                                pVar.Q(-1868044898);
                                v1 l922 = l.e.l(150, 6, null);
                                pVar.p(false);
                                b9 = t1.b(p1Var2, valueOf422, valueOf522, l922, w1Var, pVar, 196608);
                                c cVar1022 = (c) g1Var.getValue();
                                pVar.Q(-107432127);
                                iArr = n.f2712a;
                                if (iArr[cVar1022.ordinal()] != 1) {
                                }
                                pVar.p(false);
                                a1.c f1822 = u.f(j11);
                                f14 = pVar.f(f1822);
                                G = pVar.G();
                                if (f14) {
                                }
                                n1Var = b9;
                                w1 w1Var222 = new w1(k.u.f5266h, new c1.a(14, f1822));
                                pVar.a0(w1Var222);
                                G = w1Var222;
                                w1 w1Var322 = (w1) G;
                                cVar = (c) u1Var.a();
                                pVar.Q(-107432127);
                                if (iArr[cVar.ordinal()] != 1) {
                                }
                                pVar.p(false);
                                u uVar52 = new u(j8);
                                cVar2 = (c) g1Var.getValue();
                                pVar.Q(-107432127);
                                if (iArr2[cVar2.ordinal()] != 1) {
                                }
                                pVar.p(false);
                                u uVar222 = new u(b12);
                                p1Var2.f();
                                pVar.Q(1528582156);
                                v1 l1022 = l.e.l(150, 6, null);
                                pVar.p(false);
                                n1 b1622 = t1.b(p1Var2, uVar52, uVar222, l1022, w1Var322, pVar, 196608);
                                pVar.Q(1023351670);
                                pVar.p(false);
                                a1.c f1922 = u.f(j9);
                                f15 = pVar.f(f1922);
                                G2 = pVar.G();
                                if (!f15) {
                                }
                                w1 w1Var422 = new w1(k.u.f5266h, new c1.a(14, f1922));
                                pVar.a0(w1Var422);
                                G2 = w1Var422;
                                pVar.Q(1023351670);
                                pVar.p(false);
                                u uVar322 = new u(j9);
                                pVar.Q(1023351670);
                                pVar.p(false);
                                u uVar422 = new u(j9);
                                p1Var2.f();
                                pVar.Q(-543659263);
                                v1 l1122 = l.e.l(150, 6, null);
                                pVar.p(false);
                                n1 b1722 = t1.b(p1Var2, uVar322, uVar422, l1122, (w1) G2, pVar, 196608);
                                float floatValue22 = ((Number) b14.f5586o.getValue()).floatValue();
                                pVar.Q(-156998101);
                                if (eVar2 != null) {
                                }
                                pVar.p(z10);
                                G3 = pVar.G();
                                if (G3 == t0Var3) {
                                }
                                pVar.Q(-156965270);
                                pVar.p(z10);
                                G4 = pVar.G();
                                if (G4 == t0Var3) {
                                }
                                pVar.Q(-156940524);
                                pVar.p(z10);
                                pVar.Q(-156921964);
                                pVar.p(z10);
                                pVar.Q(-156902962);
                                pVar.p(z10);
                                pVar.Q(-156893937);
                                pVar.p(z10);
                                pVar.Q(-156884470);
                                pVar.p(z10);
                                pVar.Q(-567018607);
                                G5 = pVar.G();
                                if (G5 == t0Var3) {
                                }
                                z0 z0Var22 = (z0) G5;
                                o0.a b1822 = o0.f.b(157291737, new d0.x1(z0Var22, h0Var, aVar, i11), pVar);
                                c4 = pVar.c(f16);
                                G6 = pVar.G();
                                if (!c4) {
                                }
                                G6 = new i(f16, z0Var22);
                                pVar.a0(G6);
                                r2.b(eVar, null, b10, null, null, null, null, z8, f16, (q6.c) G6, b1822, null, h0Var, pVar, ((i12 >> 3) & 112) | 6 | ((i10 << 21) & 234881024), ((i10 >> 6) & 7168) | 48);
                                pVar2 = pVar;
                                pVar2.p(z10);
                            }
                            f11 = 1.0f;
                            pVar.p(false);
                            Float valueOf32 = Float.valueOf(f11);
                            c cVar72 = (c) g1Var.getValue();
                            pVar.Q(1435837472);
                            ordinal3 = cVar72.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f12 = 1.0f;
                            pVar.p(false);
                            n1 b1522 = t1.b(p1Var2, valueOf32, Float.valueOf(f12), (a0) m.f2711g.c(p1Var2.f(), pVar, 0), w1Var, pVar, 196608);
                            c cVar822 = (c) u1Var.a();
                            pVar.Q(1128033978);
                            ordinal4 = cVar822.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f13 = 1.0f;
                            pVar.p(false);
                            Float valueOf4222 = Float.valueOf(f13);
                            c cVar9222 = (c) g1Var.getValue();
                            pVar.Q(1128033978);
                            ordinal5 = cVar9222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f17 = 1.0f;
                            pVar.p(false);
                            Float valueOf5222 = Float.valueOf(f17);
                            p1Var2.f();
                            pVar.Q(-1868044898);
                            v1 l9222 = l.e.l(150, 6, null);
                            pVar.p(false);
                            b9 = t1.b(p1Var2, valueOf4222, valueOf5222, l9222, w1Var, pVar, 196608);
                            c cVar10222 = (c) g1Var.getValue();
                            pVar.Q(-107432127);
                            iArr = n.f2712a;
                            if (iArr[cVar10222.ordinal()] != 1) {
                            }
                            pVar.p(false);
                            a1.c f18222 = u.f(j11);
                            f14 = pVar.f(f18222);
                            G = pVar.G();
                            if (f14) {
                            }
                            n1Var = b9;
                            w1 w1Var2222 = new w1(k.u.f5266h, new c1.a(14, f18222));
                            pVar.a0(w1Var2222);
                            G = w1Var2222;
                            w1 w1Var3222 = (w1) G;
                            cVar = (c) u1Var.a();
                            pVar.Q(-107432127);
                            if (iArr[cVar.ordinal()] != 1) {
                            }
                            pVar.p(false);
                            u uVar522 = new u(j8);
                            cVar2 = (c) g1Var.getValue();
                            pVar.Q(-107432127);
                            if (iArr2[cVar2.ordinal()] != 1) {
                            }
                            pVar.p(false);
                            u uVar2222 = new u(b12);
                            p1Var2.f();
                            pVar.Q(1528582156);
                            v1 l10222 = l.e.l(150, 6, null);
                            pVar.p(false);
                            n1 b16222 = t1.b(p1Var2, uVar522, uVar2222, l10222, w1Var3222, pVar, 196608);
                            pVar.Q(1023351670);
                            pVar.p(false);
                            a1.c f19222 = u.f(j9);
                            f15 = pVar.f(f19222);
                            G2 = pVar.G();
                            if (!f15) {
                            }
                            w1 w1Var4222 = new w1(k.u.f5266h, new c1.a(14, f19222));
                            pVar.a0(w1Var4222);
                            G2 = w1Var4222;
                            pVar.Q(1023351670);
                            pVar.p(false);
                            u uVar3222 = new u(j9);
                            pVar.Q(1023351670);
                            pVar.p(false);
                            u uVar4222 = new u(j9);
                            p1Var2.f();
                            pVar.Q(-543659263);
                            v1 l11222 = l.e.l(150, 6, null);
                            pVar.p(false);
                            n1 b17222 = t1.b(p1Var2, uVar3222, uVar4222, l11222, (w1) G2, pVar, 196608);
                            float floatValue222 = ((Number) b14.f5586o.getValue()).floatValue();
                            pVar.Q(-156998101);
                            if (eVar2 != null) {
                            }
                            pVar.p(z10);
                            G3 = pVar.G();
                            if (G3 == t0Var3) {
                            }
                            pVar.Q(-156965270);
                            pVar.p(z10);
                            G4 = pVar.G();
                            if (G4 == t0Var3) {
                            }
                            pVar.Q(-156940524);
                            pVar.p(z10);
                            pVar.Q(-156921964);
                            pVar.p(z10);
                            pVar.Q(-156902962);
                            pVar.p(z10);
                            pVar.Q(-156893937);
                            pVar.p(z10);
                            pVar.Q(-156884470);
                            pVar.p(z10);
                            pVar.Q(-567018607);
                            G5 = pVar.G();
                            if (G5 == t0Var3) {
                            }
                            z0 z0Var222 = (z0) G5;
                            o0.a b18222 = o0.f.b(157291737, new d0.x1(z0Var222, h0Var, aVar, i11), pVar);
                            c4 = pVar.c(f16);
                            G6 = pVar.G();
                            if (!c4) {
                            }
                            G6 = new i(f16, z0Var222);
                            pVar.a0(G6);
                            r2.b(eVar, null, b10, null, null, null, null, z8, f16, (q6.c) G6, b18222, null, h0Var, pVar, ((i12 >> 3) & 112) | 6 | ((i10 << 21) & 234881024), ((i10 >> 6) & 7168) | 48);
                            pVar2 = pVar;
                            pVar2.p(z10);
                        } else if (ordinal != 2) {
                            throw new b4.c();
                        }
                    }
                    f10 = 1.0f;
                    pVar.p(false);
                    Float valueOf22 = Float.valueOf(f10);
                    p1Var.f();
                    pVar.Q(1276209157);
                    v1 l82 = l.e.l(150, 6, null);
                    pVar.p(false);
                    p1 p1Var22 = p1Var;
                    n1 b142 = t1.b(p1Var22, valueOf, valueOf22, l82, w1Var, pVar, 196608);
                    c cVar62 = (c) u1Var.a();
                    pVar.Q(1435837472);
                    ordinal2 = cVar62.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f11 = 1.0f;
                    pVar.p(false);
                    Float valueOf322 = Float.valueOf(f11);
                    c cVar722 = (c) g1Var.getValue();
                    pVar.Q(1435837472);
                    ordinal3 = cVar722.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f12 = 1.0f;
                    pVar.p(false);
                    n1 b15222 = t1.b(p1Var22, valueOf322, Float.valueOf(f12), (a0) m.f2711g.c(p1Var22.f(), pVar, 0), w1Var, pVar, 196608);
                    c cVar8222 = (c) u1Var.a();
                    pVar.Q(1128033978);
                    ordinal4 = cVar8222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f13 = 1.0f;
                    pVar.p(false);
                    Float valueOf42222 = Float.valueOf(f13);
                    c cVar92222 = (c) g1Var.getValue();
                    pVar.Q(1128033978);
                    ordinal5 = cVar92222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f17 = 1.0f;
                    pVar.p(false);
                    Float valueOf52222 = Float.valueOf(f17);
                    p1Var22.f();
                    pVar.Q(-1868044898);
                    v1 l92222 = l.e.l(150, 6, null);
                    pVar.p(false);
                    b9 = t1.b(p1Var22, valueOf42222, valueOf52222, l92222, w1Var, pVar, 196608);
                    c cVar102222 = (c) g1Var.getValue();
                    pVar.Q(-107432127);
                    iArr = n.f2712a;
                    if (iArr[cVar102222.ordinal()] != 1) {
                    }
                    pVar.p(false);
                    a1.c f182222 = u.f(j11);
                    f14 = pVar.f(f182222);
                    G = pVar.G();
                    if (f14) {
                    }
                    n1Var = b9;
                    w1 w1Var22222 = new w1(k.u.f5266h, new c1.a(14, f182222));
                    pVar.a0(w1Var22222);
                    G = w1Var22222;
                    w1 w1Var32222 = (w1) G;
                    cVar = (c) u1Var.a();
                    pVar.Q(-107432127);
                    if (iArr[cVar.ordinal()] != 1) {
                    }
                    pVar.p(false);
                    u uVar5222 = new u(j8);
                    cVar2 = (c) g1Var.getValue();
                    pVar.Q(-107432127);
                    if (iArr2[cVar2.ordinal()] != 1) {
                    }
                    pVar.p(false);
                    u uVar22222 = new u(b12);
                    p1Var22.f();
                    pVar.Q(1528582156);
                    v1 l102222 = l.e.l(150, 6, null);
                    pVar.p(false);
                    n1 b162222 = t1.b(p1Var22, uVar5222, uVar22222, l102222, w1Var32222, pVar, 196608);
                    pVar.Q(1023351670);
                    pVar.p(false);
                    a1.c f192222 = u.f(j9);
                    f15 = pVar.f(f192222);
                    G2 = pVar.G();
                    if (!f15) {
                    }
                    w1 w1Var42222 = new w1(k.u.f5266h, new c1.a(14, f192222));
                    pVar.a0(w1Var42222);
                    G2 = w1Var42222;
                    pVar.Q(1023351670);
                    pVar.p(false);
                    u uVar32222 = new u(j9);
                    pVar.Q(1023351670);
                    pVar.p(false);
                    u uVar42222 = new u(j9);
                    p1Var22.f();
                    pVar.Q(-543659263);
                    v1 l112222 = l.e.l(150, 6, null);
                    pVar.p(false);
                    n1 b172222 = t1.b(p1Var22, uVar32222, uVar42222, l112222, (w1) G2, pVar, 196608);
                    float floatValue2222 = ((Number) b142.f5586o.getValue()).floatValue();
                    pVar.Q(-156998101);
                    if (eVar2 != null) {
                    }
                    pVar.p(z10);
                    G3 = pVar.G();
                    if (G3 == t0Var3) {
                    }
                    pVar.Q(-156965270);
                    pVar.p(z10);
                    G4 = pVar.G();
                    if (G4 == t0Var3) {
                    }
                    pVar.Q(-156940524);
                    pVar.p(z10);
                    pVar.Q(-156921964);
                    pVar.p(z10);
                    pVar.Q(-156902962);
                    pVar.p(z10);
                    pVar.Q(-156893937);
                    pVar.p(z10);
                    pVar.Q(-156884470);
                    pVar.p(z10);
                    pVar.Q(-567018607);
                    G5 = pVar.G();
                    if (G5 == t0Var3) {
                    }
                    z0 z0Var2222 = (z0) G5;
                    o0.a b182222 = o0.f.b(157291737, new d0.x1(z0Var2222, h0Var, aVar, i11), pVar);
                    c4 = pVar.c(f16);
                    G6 = pVar.G();
                    if (!c4) {
                    }
                    G6 = new i(f16, z0Var2222);
                    pVar.a0(G6);
                    r2.b(eVar, null, b10, null, null, null, null, z8, f16, (q6.c) G6, b182222, null, h0Var, pVar, ((i12 >> 3) & 112) | 6 | ((i10 << 21) & 234881024), ((i10 >> 6) & 7168) | 48);
                    pVar2 = pVar;
                    pVar2.p(z10);
                } else if (ordinal6 != 2) {
                    throw new b4.c();
                }
            } else {
                p1Var = c6;
            }
            f9 = 1.0f;
            pVar.p(false);
            Float valueOf6 = Float.valueOf(f9);
            c cVar52 = (c) g1Var.getValue();
            pVar.Q(-2036730335);
            ordinal = cVar52.ordinal();
            if (ordinal != 0) {
            }
            f10 = 1.0f;
            pVar.p(false);
            Float valueOf222 = Float.valueOf(f10);
            p1Var.f();
            pVar.Q(1276209157);
            v1 l822 = l.e.l(150, 6, null);
            pVar.p(false);
            p1 p1Var222 = p1Var;
            n1 b1422 = t1.b(p1Var222, valueOf6, valueOf222, l822, w1Var, pVar, 196608);
            c cVar622 = (c) u1Var.a();
            pVar.Q(1435837472);
            ordinal2 = cVar622.ordinal();
            if (ordinal2 != 0) {
            }
            f11 = 1.0f;
            pVar.p(false);
            Float valueOf3222 = Float.valueOf(f11);
            c cVar7222 = (c) g1Var.getValue();
            pVar.Q(1435837472);
            ordinal3 = cVar7222.ordinal();
            if (ordinal3 != 0) {
            }
            f12 = 1.0f;
            pVar.p(false);
            n1 b152222 = t1.b(p1Var222, valueOf3222, Float.valueOf(f12), (a0) m.f2711g.c(p1Var222.f(), pVar, 0), w1Var, pVar, 196608);
            c cVar82222 = (c) u1Var.a();
            pVar.Q(1128033978);
            ordinal4 = cVar82222.ordinal();
            if (ordinal4 != 0) {
            }
            f13 = 1.0f;
            pVar.p(false);
            Float valueOf422222 = Float.valueOf(f13);
            c cVar922222 = (c) g1Var.getValue();
            pVar.Q(1128033978);
            ordinal5 = cVar922222.ordinal();
            if (ordinal5 != 0) {
            }
            f17 = 1.0f;
            pVar.p(false);
            Float valueOf522222 = Float.valueOf(f17);
            p1Var222.f();
            pVar.Q(-1868044898);
            v1 l922222 = l.e.l(150, 6, null);
            pVar.p(false);
            b9 = t1.b(p1Var222, valueOf422222, valueOf522222, l922222, w1Var, pVar, 196608);
            c cVar1022222 = (c) g1Var.getValue();
            pVar.Q(-107432127);
            iArr = n.f2712a;
            if (iArr[cVar1022222.ordinal()] != 1) {
            }
            pVar.p(false);
            a1.c f1822222 = u.f(j11);
            f14 = pVar.f(f1822222);
            G = pVar.G();
            if (f14) {
            }
            n1Var = b9;
            w1 w1Var222222 = new w1(k.u.f5266h, new c1.a(14, f1822222));
            pVar.a0(w1Var222222);
            G = w1Var222222;
            w1 w1Var322222 = (w1) G;
            cVar = (c) u1Var.a();
            pVar.Q(-107432127);
            if (iArr[cVar.ordinal()] != 1) {
            }
            pVar.p(false);
            u uVar52222 = new u(j8);
            cVar2 = (c) g1Var.getValue();
            pVar.Q(-107432127);
            if (iArr2[cVar2.ordinal()] != 1) {
            }
            pVar.p(false);
            u uVar222222 = new u(b12);
            p1Var222.f();
            pVar.Q(1528582156);
            v1 l1022222 = l.e.l(150, 6, null);
            pVar.p(false);
            n1 b1622222 = t1.b(p1Var222, uVar52222, uVar222222, l1022222, w1Var322222, pVar, 196608);
            pVar.Q(1023351670);
            pVar.p(false);
            a1.c f1922222 = u.f(j9);
            f15 = pVar.f(f1922222);
            G2 = pVar.G();
            if (!f15) {
            }
            w1 w1Var422222 = new w1(k.u.f5266h, new c1.a(14, f1922222));
            pVar.a0(w1Var422222);
            G2 = w1Var422222;
            pVar.Q(1023351670);
            pVar.p(false);
            u uVar322222 = new u(j9);
            pVar.Q(1023351670);
            pVar.p(false);
            u uVar422222 = new u(j9);
            p1Var222.f();
            pVar.Q(-543659263);
            v1 l1122222 = l.e.l(150, 6, null);
            pVar.p(false);
            n1 b1722222 = t1.b(p1Var222, uVar322222, uVar422222, l1122222, (w1) G2, pVar, 196608);
            float floatValue22222 = ((Number) b1422.f5586o.getValue()).floatValue();
            pVar.Q(-156998101);
            if (eVar2 != null) {
            }
            pVar.p(z10);
            G3 = pVar.G();
            if (G3 == t0Var3) {
            }
            pVar.Q(-156965270);
            pVar.p(z10);
            G4 = pVar.G();
            if (G4 == t0Var3) {
            }
            pVar.Q(-156940524);
            pVar.p(z10);
            pVar.Q(-156921964);
            pVar.p(z10);
            pVar.Q(-156902962);
            pVar.p(z10);
            pVar.Q(-156893937);
            pVar.p(z10);
            pVar.Q(-156884470);
            pVar.p(z10);
            pVar.Q(-567018607);
            G5 = pVar.G();
            if (G5 == t0Var3) {
            }
            z0 z0Var22222 = (z0) G5;
            o0.a b1822222 = o0.f.b(157291737, new d0.x1(z0Var22222, h0Var, aVar, i11), pVar);
            c4 = pVar.c(f16);
            G6 = pVar.G();
            if (!c4) {
            }
            G6 = new i(f16, z0Var22222);
            pVar.a0(G6);
            r2.b(eVar, null, b10, null, null, null, null, z8, f16, (q6.c) G6, b1822222, null, h0Var, pVar, ((i12 >> 3) & 112) | 6 | ((i10 << 21) & 234881024), ((i10 >> 6) & 7168) | 48);
            pVar2 = pVar;
            pVar2.p(z10);
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new l(str, eVar, sVar, eVar2, z8, z9, iVar, h0Var, t3Var, aVar, i7, i8);
        }
    }

    public static final void b(long j8, k0 k0Var, q6.e eVar, g0.p pVar, int i7) {
        int i8;
        g0.p pVar2;
        long j9;
        k0 k0Var2;
        q6.e eVar2;
        pVar.S(1208685580);
        if ((i7 & 6) == 0) {
            i8 = (pVar.e(j8) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(k0Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(eVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
            j9 = j8;
            k0Var2 = k0Var;
            eVar2 = eVar;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            a.a(j8, k0Var, eVar, pVar2, i8 & 1022);
            j9 = j8;
            k0Var2 = k0Var;
            eVar2 = eVar;
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new h(j9, k0Var2, eVar2, i7, 1);
        }
    }

    public static final Object c(p1.e0 e0Var) {
        Object g9 = e0Var.g();
        q qVar = g9 instanceof q ? (q) g9 : null;
        if (qVar != null) {
            return qVar.f7075s;
        }
        return null;
    }
}
