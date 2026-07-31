package F;

import B.C0022x;
import I.C0143d;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import androidx.compose.foundation.BorderModifierNodeElement;
import b0.C0352v;
import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.AbstractC0623h;
import n.C0694u;
import r.AbstractC0868o;
import r.C0850L;
import r.InterfaceC0849K;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public static final S0 f1353a = new S0();

    /* renamed from: b, reason: collision with root package name */
    public static final float f1354b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1355c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1356d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1357e = 2;

    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3, boolean z4, q.j jVar, U.q qVar, s1 s1Var, b0.Q q3, float f3, float f4, C0167p c0167p, int i3, int i4) {
        int i5;
        U.q qVar2;
        float f5;
        float f6;
        float f7;
        U.q qVar3;
        float f8;
        I.W0 N3;
        int i6;
        U.q qVar4;
        float f9;
        I.W0 N4;
        U.q qVar5;
        float f10;
        C0173s0 r3;
        int i7;
        int i8;
        c0167p.S(1035477640);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.g(z3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.g(z4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.f(jVar) ? 256 : 128;
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            qVar2 = qVar;
            i5 |= c0167p.f(qVar2) ? 2048 : 1024;
            if ((i3 & 24576) == 0) {
                i5 |= c0167p.f(s1Var) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i5 |= c0167p.f(q3) ? 131072 : 65536;
            }
            if ((1572864 & i3) != 0) {
                if ((i4 & 64) == 0) {
                    f5 = f3;
                    if (c0167p.c(f5)) {
                        i8 = 1048576;
                        i5 |= i8;
                    }
                } else {
                    f5 = f3;
                }
                i8 = 524288;
                i5 |= i8;
            } else {
                f5 = f3;
            }
            if ((12582912 & i3) != 0) {
                if ((i4 & 128) == 0) {
                    f6 = f4;
                    if (c0167p.c(f6)) {
                        i7 = 8388608;
                        i5 |= i7;
                    }
                } else {
                    f6 = f4;
                }
                i7 = 4194304;
                i5 |= i7;
            } else {
                f6 = f4;
            }
            if ((100663296 & i3) == 0) {
                i5 |= c0167p.f(this) ? 67108864 : 33554432;
            }
            if ((i5 & 38347923) == 38347922 || !c0167p.x()) {
                c0167p.N();
                if ((i3 & 1) != 0 || c0167p.w()) {
                    U.q qVar6 = i9 == 0 ? U.n.f4488a : qVar2;
                    if ((i4 & 64) == 0) {
                        i5 &= -3670017;
                        f7 = f1357e;
                    } else {
                        f7 = f5;
                    }
                    if ((128 & i4) == 0) {
                        i5 &= -29360129;
                        qVar3 = qVar6;
                        f8 = f7;
                        f6 = f1356d;
                    } else {
                        qVar3 = qVar6;
                        f8 = f7;
                    }
                } else {
                    c0167p.L();
                    if ((i4 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((128 & i4) != 0) {
                        i5 &= -29360129;
                    }
                    qVar3 = qVar2;
                    f8 = f5;
                }
                c0167p.q();
                boolean booleanValue = ((Boolean) n.t0.f(jVar, c0167p, (i5 >> 6) & 14).getValue()).booleanValue();
                float f11 = G.z.f2064b;
                long j3 = z3 ? s1Var.f1803n : z4 ? s1Var.f1804o : booleanValue ? s1Var.f1801l : s1Var.f1802m;
                if (z3) {
                    c0167p.Q(1023165505);
                    N3 = C0143d.N(new C0352v(j3), c0167p);
                    c0167p.p(false);
                } else {
                    c0167p.Q(1023053998);
                    N3 = l.M.a(j3, AbstractC0620e.j(150, 0, null, 6), c0167p);
                    c0167p.p(false);
                }
                if (z3) {
                    i6 = 0;
                    qVar4 = qVar3;
                    c0167p.Q(1023478388);
                    f9 = f6;
                    N4 = C0143d.N(new O0.e(f9), c0167p);
                    c0167p.p(false);
                } else {
                    c0167p.Q(1023269417);
                    float f12 = booleanValue ? f8 : f6;
                    m.t0 j4 = AbstractC0620e.j(150, 0, null, 6);
                    m.W w2 = AbstractC0623h.f6803a;
                    i6 = 0;
                    qVar4 = qVar3;
                    N4 = AbstractC0623h.a(new O0.e(f12), m.v0.f6901c, j4, null, "DpAnimation", null, c0167p, 384, 8);
                    c0167p.p(false);
                    f9 = f6;
                }
                InterfaceC0142c0 N5 = C0143d.N(new C0694u(((O0.e) N4.getValue()).f3731d, new b0.T(((C0352v) N3.getValue()).f5441a)), c0167p);
                I.W0 a3 = l.M.a(z3 ? s1Var.f1796g : z4 ? s1Var.f1797h : booleanValue ? s1Var.f1794e : s1Var.f1795f, AbstractC0620e.j(150, i6, null, 6), c0167p);
                C0694u c0694u = (C0694u) N5.getValue();
                qVar5 = qVar4;
                AbstractC0868o.a(androidx.compose.ui.draw.a.b(qVar5.i(new BorderModifierNodeElement(c0694u.f7207a, c0694u.f7208b, q3)), new C0022x(q3, 5, new t1(new P0(0, 0, I.W0.class, a3, "value", "getValue()Ljava/lang/Object;")))), c0167p, i6);
                f10 = f9;
                f5 = f8;
            } else {
                c0167p.L();
                qVar5 = qVar2;
                f10 = f6;
            }
            r3 = c0167p.r();
            if (r3 == null) {
                r3.f2906d = new Q0(this, z3, z4, jVar, qVar5, s1Var, q3, f5, f10, i3, i4);
                return;
            }
            return;
        }
        qVar2 = qVar;
        if ((i3 & 24576) == 0) {
        }
        if ((196608 & i3) == 0) {
        }
        if ((1572864 & i3) != 0) {
        }
        if ((12582912 & i3) != 0) {
        }
        if ((100663296 & i3) == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        c0167p.N();
        if ((i3 & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if ((128 & i4) == 0) {
        }
        c0167p.q();
        boolean booleanValue2 = ((Boolean) n.t0.f(jVar, c0167p, (i5 >> 6) & 14).getValue()).booleanValue();
        float f112 = G.z.f2064b;
        if (z3) {
        }
        if (z3) {
        }
        if (z3) {
        }
        InterfaceC0142c0 N52 = C0143d.N(new C0694u(((O0.e) N4.getValue()).f3731d, new b0.T(((C0352v) N3.getValue()).f5441a)), c0167p);
        I.W0 a32 = l.M.a(z3 ? s1Var.f1796g : z4 ? s1Var.f1797h : booleanValue2 ? s1Var.f1794e : s1Var.f1795f, AbstractC0620e.j(150, i6, null, 6), c0167p);
        C0694u c0694u2 = (C0694u) N52.getValue();
        qVar5 = qVar4;
        AbstractC0868o.a(androidx.compose.ui.draw.a.b(qVar5.i(new BorderModifierNodeElement(c0694u2.f7207a, c0694u2.f7208b, q3)), new C0022x(q3, 5, new t1(new P0(0, 0, I.W0.class, a32, "value", "getValue()Ljava/lang/Object;")))), c0167p, i6);
        f10 = f9;
        f5 = f8;
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }

    public final void b(int i3, int i4, B.r rVar, s1 s1Var, C0167p c0167p, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, InterfaceC0426e interfaceC0426e5, InterfaceC0426e interfaceC0426e6, InterfaceC0426e interfaceC0426e7, InterfaceC0426e interfaceC0426e8, InterfaceC0426e interfaceC0426e9, String str, q.j jVar, InterfaceC0849K interfaceC0849K, boolean z3, boolean z4, boolean z5) {
        int i5;
        int i6;
        InterfaceC0849K c0850l;
        int i7;
        InterfaceC0849K interfaceC0849K2;
        c0167p.S(-350442135);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.f(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.h(interfaceC0426e) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.g(z3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.g(z4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.f(rVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c0167p.f(jVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0167p.g(z5) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0167p.h(interfaceC0426e2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0167p.h(interfaceC0426e3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0167p.h(interfaceC0426e4) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = (c0167p.h(interfaceC0426e5) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0167p.h(interfaceC0426e6) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p.h(interfaceC0426e7) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0167p.h(interfaceC0426e8) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0167p.f(s1Var) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c0167p.h(interfaceC0426e9) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= c0167p.f(this) ? 8388608 : 4194304;
        }
        if ((i5 & 306783379) == 306783378 && (4793491 & i6) == 4793490 && c0167p.x()) {
            c0167p.L();
            interfaceC0849K2 = interfaceC0849K;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                float f3 = G.z.f2064b;
                c0850l = new C0850L(f3, f3, f3, f3);
                i7 = (-458753) & i6;
            } else {
                c0167p.L();
                i7 = i6 & (-458753);
                c0850l = interfaceC0849K;
            }
            c0167p.q();
            int i8 = i5 << 3;
            int i9 = i5 >> 3;
            int i10 = i5 >> 9;
            int i11 = i7 << 21;
            G.z.a((i8 & 112) | 6 | (i8 & 896) | (i9 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i5 & 896) | ((i7 >> 9) & 14) | ((i5 >> 6) & 112) | (i10 & 7168) | (i9 & 57344) | ((i7 << 6) & 3670016) | ((i7 << 3) & 29360128), rVar, s1Var, c0167p, interfaceC0426e, interfaceC0426e2, interfaceC0426e3, interfaceC0426e4, interfaceC0426e5, interfaceC0426e6, interfaceC0426e7, interfaceC0426e8, interfaceC0426e9, str, jVar, c0850l, z4, z3, z5);
            interfaceC0849K2 = c0850l;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new R0(this, str, interfaceC0426e, z3, z4, rVar, jVar, z5, interfaceC0426e2, interfaceC0426e3, interfaceC0426e4, interfaceC0426e5, interfaceC0426e6, interfaceC0426e7, interfaceC0426e8, s1Var, interfaceC0849K2, interfaceC0426e9, i3, i4);
        }
    }
}
