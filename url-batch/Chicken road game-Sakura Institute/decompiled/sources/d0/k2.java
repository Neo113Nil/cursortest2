package d0;

import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final k2 f2128a = new k2();

    /* renamed from: b, reason: collision with root package name */
    public static final float f2129b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2130c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2131d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2132e = 2;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z8, p.i iVar, s0.o oVar, t3 t3Var, z0.p0 p0Var, float f9, float f10, g0.p pVar, int i7, int i8) {
        s0.o oVar2;
        int i9;
        float f11;
        float f12;
        float f13;
        int i10;
        s0.o oVar3;
        float f14;
        g0.m2 M;
        int i11;
        int i12;
        float f15;
        l.y yVar;
        g0.m2 M2;
        float f16;
        float f17;
        g0.p1 r8;
        int i13;
        int i14;
        pVar.S(1035477640);
        int i15 = (pVar.g(z8) ? 4 : 2) | i7 | (pVar.g(false) ? 32 : 16) | (pVar.f(iVar) ? 256 : 128);
        int i16 = i8 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i7 & 3072) == 0) {
            oVar2 = oVar;
            i15 |= pVar.f(oVar2) ? 2048 : 1024;
            i9 = i15 | (!pVar.f(t3Var) ? 16384 : 8192) | (!pVar.f(p0Var) ? 131072 : 65536);
            if ((1572864 & i7) != 0) {
                if ((i8 & 64) == 0) {
                    f11 = f9;
                    if (pVar.c(f11)) {
                        i14 = 1048576;
                        i9 |= i14;
                    }
                } else {
                    f11 = f9;
                }
                i14 = 524288;
                i9 |= i14;
            } else {
                f11 = f9;
            }
            if ((12582912 & i7) != 0) {
                if ((i8 & 128) == 0) {
                    f12 = f10;
                    if (pVar.c(f12)) {
                        i13 = 8388608;
                        i9 |= i13;
                    }
                } else {
                    f12 = f10;
                }
                i13 = 4194304;
                i9 |= i13;
            } else {
                f12 = f10;
            }
            if ((38347923 & i9) == 38347922 || !pVar.x()) {
                pVar.N();
                if ((i7 & 1) != 0 || pVar.w()) {
                    s0.o oVar4 = i16 == 0 ? s0.l.f8103a : oVar2;
                    if ((i8 & 64) == 0) {
                        i9 &= -3670017;
                        f13 = f2132e;
                    } else {
                        f13 = f11;
                    }
                    if ((i8 & 128) == 0) {
                        s0.o oVar5 = oVar4;
                        i10 = i9 & (-29360129);
                        oVar3 = oVar5;
                        f14 = f13;
                        f12 = f2131d;
                    } else {
                        s0.o oVar6 = oVar4;
                        i10 = i9;
                        oVar3 = oVar6;
                        f14 = f13;
                    }
                } else {
                    pVar.L();
                    if ((i8 & 64) != 0) {
                        i9 &= -3670017;
                    }
                    if ((i8 & 128) != 0) {
                        i9 &= -29360129;
                    }
                    i10 = i9;
                    oVar3 = oVar2;
                    f14 = f11;
                }
                pVar.q();
                boolean booleanValue = ((Boolean) t6.a.v(iVar, pVar, (i10 >> 6) & 14).getValue()).booleanValue();
                float f18 = e0.o.f2714b;
                long j8 = z8 ? t3Var.f2419n : booleanValue ? t3Var.f2417l : t3Var.f2418m;
                if (z8) {
                    pVar.Q(1023165505);
                    M = g0.d.M(new z0.u(j8), pVar);
                    pVar.p(false);
                } else {
                    pVar.Q(1023053998);
                    M = k.n0.a(j8, l.e.l(150, 6, null), pVar, 48);
                    pVar.p(false);
                }
                g0.m2 m2Var = M;
                if (z8) {
                    i11 = 6;
                    i12 = 150;
                    f15 = f12;
                    yVar = null;
                    pVar.Q(1023478388);
                    M2 = g0.d.M(new m2.e(f15), pVar);
                    pVar.p(false);
                } else {
                    pVar.Q(1023269417);
                    float f19 = booleanValue ? f14 : f12;
                    l.v1 l8 = l.e.l(150, 6, null);
                    l.a1 a1Var = l.f.f5472a;
                    i12 = 150;
                    i11 = 6;
                    f15 = f12;
                    yVar = null;
                    M2 = l.f.a(new m2.e(f19), l.x1.f5724c, l8, null, "DpAnimation", pVar, 384, 8);
                    pVar.p(false);
                }
                g0.z0 M3 = g0.d.M(new m.n(((m2.e) M2.getValue()).f6312f, new z0.r0(((z0.u) m2Var.getValue()).f10059a)), pVar);
                g0.m2 a3 = k.n0.a(z8 ? t3Var.f2412g : booleanValue ? t3Var.f2410e : t3Var.f2411f, l.e.l(i12, i11, yVar), pVar, 48);
                m.n nVar = (m.n) M3.getValue();
                q.n.a(androidx.compose.ui.draw.a.b(oVar3.j(new BorderModifierNodeElement(nVar.f6209a, nVar.f6210b, p0Var)), new a0.y(p0Var, i11, new u3(new h2(a3, g0.m2.class, "value", "getValue()Ljava/lang/Object;", 0, 0)))), pVar, 0);
                f16 = f15;
                f17 = f14;
            } else {
                pVar.L();
                oVar3 = oVar2;
                f17 = f11;
                f16 = f12;
            }
            r8 = pVar.r();
            if (r8 == null) {
                r8.f3853d = new i2(this, z8, iVar, oVar3, t3Var, p0Var, f17, f16, i7, i8);
                return;
            }
            return;
        }
        oVar2 = oVar;
        i9 = i15 | (!pVar.f(t3Var) ? 16384 : 8192) | (!pVar.f(p0Var) ? 131072 : 65536);
        if ((1572864 & i7) != 0) {
        }
        if ((12582912 & i7) != 0) {
        }
        if ((38347923 & i9) == 38347922) {
        }
        pVar.N();
        if ((i7 & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if ((i8 & 64) == 0) {
        }
        if ((i8 & 128) == 0) {
        }
        pVar.q();
        boolean booleanValue2 = ((Boolean) t6.a.v(iVar, pVar, (i10 >> 6) & 14).getValue()).booleanValue();
        float f182 = e0.o.f2714b;
        if (z8) {
        }
        if (z8) {
        }
        g0.m2 m2Var2 = M;
        if (z8) {
        }
        g0.z0 M32 = g0.d.M(new m.n(((m2.e) M2.getValue()).f6312f, new z0.r0(((z0.u) m2Var2.getValue()).f10059a)), pVar);
        g0.m2 a32 = k.n0.a(z8 ? t3Var.f2412g : booleanValue2 ? t3Var.f2410e : t3Var.f2411f, l.e.l(i12, i11, yVar), pVar, 48);
        m.n nVar2 = (m.n) M32.getValue();
        q.n.a(androidx.compose.ui.draw.a.b(oVar3.j(new BorderModifierNodeElement(nVar2.f6209a, nVar2.f6210b, p0Var)), new a0.y(p0Var, i11, new u3(new h2(a32, g0.m2.class, "value", "getValue()Ljava/lang/Object;", 0, 0)))), pVar, 0);
        f16 = f15;
        f17 = f14;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    public final void b(String str, q6.e eVar, boolean z8, boolean z9, a0.s sVar, p.i iVar, q6.e eVar2, t3 t3Var, q.h0 h0Var, o0.a aVar, g0.p pVar, int i7) {
        String str2;
        int i8;
        q6.e eVar3;
        boolean z10;
        boolean z11;
        a0.s sVar2;
        int i9;
        q6.e eVar4;
        q.h0 h0Var2;
        int i10;
        q.h0 h0Var3;
        pVar.S(-350442135);
        if ((i7 & 6) == 0) {
            str2 = str;
            i8 = (pVar.f(str2) ? 4 : 2) | i7;
        } else {
            str2 = str;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            eVar3 = eVar;
            i8 |= pVar.h(eVar3) ? 32 : 16;
        } else {
            eVar3 = eVar;
        }
        if ((i7 & 384) == 0) {
            z10 = z8;
            i8 |= pVar.g(z10) ? 256 : 128;
        } else {
            z10 = z8;
        }
        if ((i7 & 3072) == 0) {
            z11 = z9;
            i8 |= pVar.g(z11) ? 2048 : 1024;
        } else {
            z11 = z9;
        }
        if ((i7 & 24576) == 0) {
            sVar2 = sVar;
            i8 |= pVar.f(sVar2) ? 16384 : 8192;
        } else {
            sVar2 = sVar;
        }
        if ((i7 & 196608) == 0) {
            i8 |= pVar.f(iVar) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i8 |= pVar.g(false) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 = 12582912;
            eVar4 = eVar2;
            i8 |= pVar.h(eVar4) ? 8388608 : 4194304;
        } else {
            i9 = 12582912;
            eVar4 = eVar2;
        }
        if ((i7 & 100663296) == 0) {
            i8 |= pVar.h(null) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i8 |= pVar.h(null) ? 536870912 : 268435456;
        }
        int i11 = 14155776 | (pVar.h(null) ? 4 : 2) | (pVar.h(null) ? 32 : 16) | (pVar.h(null) ? 256 : 128) | (pVar.h(null) ? 2048 : 1024) | (pVar.f(t3Var) ? 16384 : 8192) | 65536;
        if ((306783379 & i8) == 306783378 && (4793491 & i11) == 4793490 && pVar.x()) {
            pVar.L();
            h0Var3 = h0Var;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                float f9 = e0.o.f2714b;
                h0Var2 = new q.h0(f9, f9, f9, f9);
                i10 = i11 & (-458753);
            } else {
                pVar.L();
                i10 = i11 & (-458753);
                h0Var2 = h0Var;
            }
            pVar.q();
            int i12 = i8 << 3;
            int i13 = i8 >> 3;
            int i14 = i8 >> 9;
            int i15 = i10 << 21;
            int i16 = ((i10 >> 9) & 14) | ((i8 >> 6) & 112) | (i8 & 896) | (i14 & 7168) | (i13 & 57344) | ((i10 << 6) & 3670016) | i9;
            boolean z12 = z10;
            q.h0 h0Var4 = h0Var2;
            e0.o.a(str2, eVar3, sVar2, eVar4, z11, z12, iVar, h0Var4, t3Var, aVar, pVar, (i12 & 896) | (i12 & 112) | 6 | (i13 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192), i16);
            h0Var3 = h0Var4;
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new j2(this, str, eVar, z8, z9, sVar, iVar, eVar2, t3Var, h0Var3, aVar, i7);
        }
    }
}
