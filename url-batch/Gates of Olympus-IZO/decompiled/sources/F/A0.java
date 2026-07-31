package F;

import E.C0027i;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0110n0;
import androidx.compose.material3.MinimumInteractiveModifier;
import b0.AbstractC0259J;
import b0.C0265P;
import b0.C0288u;
import b0.InterfaceC0263N;
import m.C0593d;
import m.C0603m;
import n.C0665u;
import q.C0769d;
import q.C0771f;
import r.AbstractC0818o;
import r.C0797I;
import r.InterfaceC0796H;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0027i f863a = new C0027i(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Y1.a aVar, U.l lVar, boolean z3, InterfaceC0263N interfaceC0263N, C0046j c0046j, C0056o c0056o, C0665u c0665u, InterfaceC0796H interfaceC0796H, q.j jVar, Q.a aVar2, C0113p c0113p, int i3, int i4) {
        int i5;
        boolean z4;
        InterfaceC0263N interfaceC0263N2;
        C0056o c0056o2;
        int i6;
        C0665u c0665u2;
        int i7;
        int i8;
        InterfaceC0263N interfaceC0263N3;
        InterfaceC0263N interfaceC0263N4;
        C0046j c0046j2;
        C0056o c0056o3;
        C0665u c0665u3;
        q.j jVar2;
        InterfaceC0796H interfaceC0796H2;
        boolean z5;
        C0046j c0046j3;
        InterfaceC0263N interfaceC0263N5;
        q.j jVar3;
        C0665u c0665u4;
        InterfaceC0263N interfaceC0263N6;
        InterfaceC0796H interfaceC0796H3;
        int i9;
        C0603m c0603m;
        ?? r3;
        boolean z6;
        InterfaceC0796H interfaceC0796H4;
        C0056o c0056o4;
        q.j jVar4;
        C0046j c0046j4;
        C0665u c0665u5;
        InterfaceC0263N interfaceC0263N7;
        C0119s0 r4;
        int i10;
        int i11;
        c0113p.S(650121315);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f(lVar) ? 32 : 16;
        }
        int i12 = i4 & 4;
        if (i12 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            z4 = z3;
            i5 |= c0113p.g(z4) ? 256 : 128;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    interfaceC0263N2 = interfaceC0263N;
                    if (c0113p.f(interfaceC0263N2)) {
                        i11 = 2048;
                        i5 |= i11;
                    }
                } else {
                    interfaceC0263N2 = interfaceC0263N;
                }
                i11 = 1024;
                i5 |= i11;
            } else {
                interfaceC0263N2 = interfaceC0263N;
            }
            if ((i3 & 24576) == 0) {
                if ((i4 & 16) == 0 && c0113p.f(c0046j)) {
                    i10 = 16384;
                    i5 |= i10;
                }
                i10 = 8192;
                i5 |= i10;
            }
            if ((i3 & 196608) != 0) {
                c0056o2 = c0056o;
                i5 |= ((i4 & 32) == 0 && c0113p.f(c0056o2)) ? 131072 : 65536;
            } else {
                c0056o2 = c0056o;
            }
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
                c0665u2 = c0665u;
            } else {
                c0665u2 = c0665u;
                if ((i3 & 1572864) == 0) {
                    i5 |= c0113p.f(c0665u2) ? 1048576 : 524288;
                }
            }
            i7 = 128 & i4;
            if (i7 == 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i5 |= c0113p.f(interfaceC0796H) ? 8388608 : 4194304;
            }
            i8 = i4 & 256;
            if (i8 == 0) {
                i5 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i5 |= c0113p.f(jVar) ? 67108864 : 33554432;
            }
            if ((i3 & 805306368) == 0) {
                i5 |= c0113p.h(aVar2) ? 536870912 : 268435456;
            }
            if ((i5 & 306783379) == 306783378 || !c0113p.x()) {
                c0113p.N();
                if ((i3 & 1) != 0 || c0113p.w()) {
                    if (i12 != 0) {
                        z4 = true;
                    }
                    if ((i4 & 8) == 0) {
                        C0797I c0797i = AbstractC0048k.f1275a;
                        interfaceC0263N3 = P0.a(H.d.f1655b, c0113p);
                        i5 &= -7169;
                    } else {
                        interfaceC0263N3 = interfaceC0263N2;
                    }
                    if ((16 & i4) == 0) {
                        C0797I c0797i2 = AbstractC0048k.f1275a;
                        J j3 = (J) c0113p.k(L.f1045a);
                        c0046j2 = j3.f985K;
                        if (c0046j2 == null) {
                            float f3 = H.d.f1654a;
                            interfaceC0263N4 = interfaceC0263N3;
                            c0046j2 = new C0046j(L.c(j3, 26), L.c(j3, H.d.f1661h), C0288u.b(L.c(j3, H.d.f1656c), 0.12f), C0288u.b(L.c(j3, H.d.f1658e), 0.38f));
                            j3.f985K = c0046j2;
                        } else {
                            interfaceC0263N4 = interfaceC0263N3;
                        }
                        i5 &= -57345;
                    } else {
                        interfaceC0263N4 = interfaceC0263N3;
                        c0046j2 = c0046j;
                    }
                    if ((32 & i4) == 0) {
                        C0797I c0797i3 = AbstractC0048k.f1275a;
                        c0056o3 = new C0056o(H.d.f1654a, H.d.f1662i, H.d.f1659f, H.d.f1660g, H.d.f1657d);
                        i5 &= -458753;
                    } else {
                        c0056o3 = c0056o2;
                    }
                    c0665u3 = i6 == 0 ? null : c0665u;
                    InterfaceC0796H interfaceC0796H5 = i7 == 0 ? AbstractC0048k.f1275a : interfaceC0796H;
                    if (i8 == 0) {
                        interfaceC0796H2 = interfaceC0796H5;
                        c0056o2 = c0056o3;
                        z5 = z4;
                        c0046j3 = c0046j2;
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                        interfaceC0796H2 = interfaceC0796H5;
                        c0056o2 = c0056o3;
                        z5 = z4;
                        c0046j3 = c0046j2;
                    }
                    interfaceC0263N5 = interfaceC0263N4;
                } else {
                    c0113p.L();
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((16 & i4) != 0) {
                        i5 &= -57345;
                    }
                    if ((32 & i4) != 0) {
                        i5 &= -458753;
                    }
                    c0046j3 = c0046j;
                    jVar2 = jVar;
                    c0665u3 = c0665u2;
                    z5 = z4;
                    interfaceC0263N5 = interfaceC0263N2;
                    interfaceC0796H2 = interfaceC0796H;
                }
                c0113p.q();
                c0113p.Q(-239156623);
                Object obj = C0105l.f2272a;
                if (jVar2 != null) {
                    Object G3 = c0113p.G();
                    if (G3 == obj) {
                        G3 = new q.j();
                        c0113p.a0(G3);
                    }
                    jVar3 = (q.j) G3;
                } else {
                    jVar3 = jVar2;
                }
                c0113p.p(false);
                q.j jVar5 = jVar3;
                long j4 = !z5 ? c0046j3.f1269a : c0046j3.f1271c;
                long j5 = !z5 ? c0046j3.f1270b : c0046j3.f1272d;
                C0046j c0046j5 = c0046j3;
                c0113p.Q(-239150048);
                if (c0056o2 != null) {
                    interfaceC0263N6 = interfaceC0263N5;
                    c0665u4 = c0665u3;
                    interfaceC0796H3 = interfaceC0796H2;
                    i9 = i5;
                    r3 = 0;
                    c0603m = null;
                } else {
                    int i13 = ((i5 >> 6) & 14) | ((i5 >> 9) & 896);
                    Object G4 = c0113p.G();
                    if (G4 == obj) {
                        G4 = new S.t();
                        c0113p.a0(G4);
                    }
                    S.t tVar = (S.t) G4;
                    boolean f4 = c0113p.f(jVar5);
                    Object G5 = c0113p.G();
                    if (f4 || G5 == obj) {
                        c0665u4 = c0665u3;
                        G5 = new C0052m(jVar5, tVar, null);
                        c0113p.a0(G5);
                    } else {
                        c0665u4 = c0665u3;
                    }
                    C0089d.e(c0113p, (Y1.e) G5, jVar5);
                    q.h hVar = (q.h) M1.l.t0(tVar);
                    float f5 = !z5 ? c0056o2.f1317e : hVar instanceof q.l ? c0056o2.f1314b : hVar instanceof C0771f ? c0056o2.f1316d : hVar instanceof C0769d ? c0056o2.f1315c : c0056o2.f1313a;
                    Object G6 = c0113p.G();
                    if (G6 == obj) {
                        jVar5 = jVar5;
                        interfaceC0263N6 = interfaceC0263N5;
                        i9 = i5;
                        interfaceC0796H3 = interfaceC0796H2;
                        G6 = new C0593d(new M0.e(f5), m.z0.f5887c, null, 12);
                        c0113p.a0(G6);
                    } else {
                        interfaceC0263N6 = interfaceC0263N5;
                        interfaceC0796H3 = interfaceC0796H2;
                        jVar5 = jVar5;
                        i9 = i5;
                    }
                    C0593d c0593d = (C0593d) G6;
                    M0.e eVar = new M0.e(f5);
                    boolean h3 = c0113p.h(c0593d) | c0113p.c(f5) | ((((i13 & 14) ^ 6) > 4 && c0113p.g(z5)) || (i13 & 6) == 4) | ((((i13 & 896) ^ 384) > 256 && c0113p.f(c0056o2)) || (i13 & 384) == 256) | c0113p.h(hVar);
                    Object G7 = c0113p.G();
                    if (h3 || G7 == obj) {
                        G7 = new C0054n(c0593d, f5, z5, c0056o2, hVar, null);
                        c0113p.a0(G7);
                    }
                    C0089d.e(c0113p, (Y1.e) G7, eVar);
                    c0603m = c0593d.f5704c;
                    r3 = 0;
                }
                c0113p.p(r3);
                float f6 = c0603m == null ? ((M0.e) c0603m.f5803e.getValue()).f2766d : (float) r3;
                InterfaceC0796H interfaceC0796H6 = interfaceC0796H3;
                int i14 = i9;
                U0.b(aVar, z0.k.a(lVar, C0058p.f1321f), z5, interfaceC0263N6, j4, j5, f6, c0665u4, jVar5, Q.f.b(956488494, new r(j5, interfaceC0796H6, aVar2), c0113p), c0113p, (i14 & 8078) | (234881024 & (i14 << 6)));
                z6 = z5;
                interfaceC0796H4 = interfaceC0796H6;
                c0056o4 = c0056o2;
                jVar4 = jVar2;
                c0046j4 = c0046j5;
                c0665u5 = c0665u4;
                interfaceC0263N7 = interfaceC0263N6;
            } else {
                c0113p.L();
                c0046j4 = c0046j;
                interfaceC0796H4 = interfaceC0796H;
                jVar4 = jVar;
                z6 = z4;
                interfaceC0263N7 = interfaceC0263N2;
                C0056o c0056o5 = c0056o2;
                c0665u5 = c0665u2;
                c0056o4 = c0056o5;
            }
            r4 = c0113p.r();
            if (r4 == null) {
                r4.f2347d = new C0063s(aVar, lVar, z6, interfaceC0263N7, c0046j4, c0056o4, c0665u5, interfaceC0796H4, jVar4, aVar2, i3, i4);
                return;
            }
            return;
        }
        z4 = z3;
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) != 0) {
        }
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        i7 = 128 & i4;
        if (i7 == 0) {
        }
        i8 = i4 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        c0113p.N();
        if ((i3 & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i4 & 8) == 0) {
        }
        if ((16 & i4) == 0) {
        }
        if ((32 & i4) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        interfaceC0263N5 = interfaceC0263N4;
        c0113p.q();
        c0113p.Q(-239156623);
        Object obj2 = C0105l.f2272a;
        if (jVar2 != null) {
        }
        c0113p.p(false);
        q.j jVar52 = jVar3;
        long j42 = !z5 ? c0046j3.f1269a : c0046j3.f1271c;
        if (!z5) {
        }
        C0046j c0046j52 = c0046j3;
        c0113p.Q(-239150048);
        if (c0056o2 != null) {
        }
        c0113p.p(r3);
        float f62 = c0603m == null ? ((M0.e) c0603m.f5803e.getValue()).f2766d : (float) r3;
        InterfaceC0796H interfaceC0796H62 = interfaceC0796H3;
        int i142 = i9;
        U0.b(aVar, z0.k.a(lVar, C0058p.f1321f), z5, interfaceC0263N6, j42, j5, f62, c0665u4, jVar52, Q.f.b(956488494, new r(j5, interfaceC0796H62, aVar2), c0113p), c0113p, (i142 & 8078) | (234881024 & (i142 << 6)));
        z6 = z5;
        interfaceC0796H4 = interfaceC0796H62;
        c0056o4 = c0056o2;
        jVar4 = jVar2;
        c0046j4 = c0046j52;
        c0665u5 = c0665u4;
        interfaceC0263N7 = interfaceC0263N6;
        r4 = c0113p.r();
        if (r4 == null) {
        }
    }

    public static final void b(U.l lVar, InterfaceC0263N interfaceC0263N, C0067u c0067u, C0073x c0073x, C0665u c0665u, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        InterfaceC0263N a3;
        C0665u c0665u2;
        int i5;
        C0073x g3;
        C0073x c0073x2;
        InterfaceC0263N interfaceC0263N2;
        c0113p.S(1179621553);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(c0067u) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= 1024;
        }
        int i6 = i4 | 24576;
        if ((196608 & i3) == 0) {
            i6 |= c0113p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && c0113p.x()) {
            c0113p.L();
            interfaceC0263N2 = interfaceC0263N;
            c0073x2 = c0073x;
            c0665u2 = c0665u;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                a3 = P0.a(H.e.f1664b, c0113p);
                c0665u2 = null;
                i5 = i6 & (-7281);
                g3 = g(0.0f, 63);
            } else {
                c0113p.L();
                a3 = interfaceC0263N;
                c0665u2 = c0665u;
                i5 = i6 & (-7281);
                g3 = c0073x;
            }
            c0113p.q();
            U0.a(lVar, a3, c0067u.f1390a, c0067u.f1391b, 0.0f, ((M0.e) g3.a(true, null, c0113p, 54).getValue()).f2766d, c0665u2, Q.f.b(664103990, new C0075y(aVar, 0), c0113p), c0113p, (i5 & 14) | 12582912 | ((i5 << 6) & 3670016), 16);
            InterfaceC0263N interfaceC0263N3 = a3;
            c0073x2 = g3;
            interfaceC0263N2 = interfaceC0263N3;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0077z(lVar, interfaceC0263N2, c0067u, c0073x2, c0665u2, aVar, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Y1.a aVar, U.l lVar, boolean z3, InterfaceC0263N interfaceC0263N, C0067u c0067u, C0073x c0073x, C0665u c0665u, q.j jVar, Q.a aVar2, C0113p c0113p, int i3, int i4) {
        int i5;
        boolean z4;
        C0073x c0073x2;
        int i6;
        int i7;
        q.j jVar2;
        InterfaceC0263N interfaceC0263N2;
        C0665u c0665u2;
        q.j jVar3;
        C0665u c0665u3;
        InterfaceC0263N interfaceC0263N3;
        C0119s0 r3;
        int i8;
        c0113p.S(-2024281376);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f(lVar) ? 32 : 16;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            z4 = z3;
            i5 |= c0113p.g(z4) ? 256 : 128;
            if ((i3 & 3072) == 0) {
                i5 |= 1024;
            }
            if ((i3 & 24576) == 0) {
                i5 |= c0113p.f(c0067u) ? 16384 : 8192;
            }
            if ((196608 & i3) != 0) {
                if ((i4 & 32) == 0) {
                    c0073x2 = c0073x;
                    if (c0113p.f(c0073x2)) {
                        i8 = 131072;
                        i5 |= i8;
                    }
                } else {
                    c0073x2 = c0073x;
                }
                i8 = 65536;
                i5 |= i8;
            } else {
                c0073x2 = c0073x;
            }
            i6 = i5 | 14155776;
            if ((100663296 & i3) == 0) {
                i6 |= c0113p.h(aVar2) ? 67108864 : 33554432;
            }
            if ((38347923 & i6) == 38347922 || !c0113p.x()) {
                c0113p.N();
                if ((i3 & 1) != 0 || c0113p.w()) {
                    boolean z5 = i9 == 0 ? true : z4;
                    InterfaceC0263N a3 = P0.a(H.e.f1664b, c0113p);
                    i7 = i6 & (-7169);
                    if ((i4 & 32) != 0) {
                        c0073x2 = g(0.0f, 63);
                        i7 = i6 & (-465921);
                    }
                    jVar2 = null;
                    interfaceC0263N2 = a3;
                    z4 = z5;
                    c0665u2 = null;
                } else {
                    c0113p.L();
                    int i10 = i6 & (-7169);
                    if ((i4 & 32) != 0) {
                        i10 = i6 & (-465921);
                    }
                    interfaceC0263N2 = interfaceC0263N;
                    jVar2 = jVar;
                    i7 = i10;
                    c0665u2 = c0665u;
                }
                c0113p.q();
                c0113p.Q(1976524431);
                if (jVar2 != null) {
                    Object G3 = c0113p.G();
                    if (G3 == C0105l.f2272a) {
                        G3 = new q.j();
                        c0113p.a0(G3);
                    }
                    jVar3 = (q.j) G3;
                } else {
                    jVar3 = jVar2;
                }
                c0113p.p(false);
                U0.b(aVar, lVar, z4, interfaceC0263N2, !z4 ? c0067u.f1390a : c0067u.f1392c, !z4 ? c0067u.f1391b : c0067u.f1393d, ((M0.e) c0073x2.a(z4, jVar3, c0113p, ((i7 >> 6) & 14) | ((i7 >> 9) & 896)).getValue()).f2766d, c0665u2, jVar3, Q.f.b(776921067, new C0075y(aVar2, 1), c0113p), c0113p, (i7 & 8190) | ((i7 << 6) & 234881024));
                c0665u3 = c0665u2;
                interfaceC0263N3 = interfaceC0263N2;
            } else {
                c0113p.L();
                interfaceC0263N3 = interfaceC0263N;
                c0665u3 = c0665u;
                jVar2 = jVar;
            }
            r3 = c0113p.r();
            if (r3 == null) {
                r3.f2347d = new A(aVar, lVar, z4, interfaceC0263N3, c0067u, c0073x2, c0665u3, jVar2, aVar2, i3, i4);
                return;
            }
            return;
        }
        z4 = z3;
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((196608 & i3) != 0) {
        }
        i6 = i5 | 14155776;
        if ((100663296 & i3) == 0) {
        }
        if ((38347923 & i6) == 38347922) {
        }
        c0113p.N();
        if ((i3 & 1) != 0) {
        }
        if (i9 == 0) {
        }
        InterfaceC0263N a32 = P0.a(H.e.f1664b, c0113p);
        i7 = i6 & (-7169);
        if ((i4 & 32) != 0) {
        }
        jVar2 = null;
        interfaceC0263N2 = a32;
        z4 = z5;
        c0665u2 = null;
        c0113p.q();
        c0113p.Q(1976524431);
        if (jVar2 != null) {
        }
        c0113p.p(false);
        U0.b(aVar, lVar, z4, interfaceC0263N2, !z4 ? c0067u.f1390a : c0067u.f1392c, !z4 ? c0067u.f1391b : c0067u.f1393d, ((M0.e) c0073x2.a(z4, jVar3, c0113p, ((i7 >> 6) & 14) | ((i7 >> 9) & 896)).getValue()).f2766d, c0665u2, jVar3, Q.f.b(776921067, new C0075y(aVar2, 1), c0113p), c0113p, (i7 & 8190) | ((i7 << 6) & 234881024));
        c0665u3 = c0665u2;
        interfaceC0263N3 = interfaceC0263N2;
        r3 = c0113p.r();
        if (r3 == null) {
        }
    }

    public static final void d(Y1.a aVar, U.l lVar, boolean z3, V v3, q.j jVar, Q.a aVar2, C0113p c0113p, int i3) {
        int i4;
        q.j jVar2;
        int i5;
        U.l lVar2;
        V v4;
        boolean z4;
        boolean z5;
        V v5;
        q.j jVar3;
        U.l lVar3;
        c0113p.S(-1142896114);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i6 = i4 | 432;
        if ((i3 & 3072) == 0) {
            i6 = i4 | 1456;
        }
        int i7 = i6 | 24576;
        if ((196608 & i3) == 0) {
            i7 |= c0113p.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            z5 = z3;
            v5 = v3;
            jVar3 = jVar;
        } else {
            c0113p.N();
            int i8 = 0;
            if ((i3 & 1) == 0 || c0113p.w()) {
                U.i iVar = U.i.f3302a;
                c0113p.Q(-1519621781);
                long j3 = ((C0288u) c0113p.k(P.f1079a)).f4298a;
                J j4 = (J) c0113p.k(L.f1045a);
                V v6 = j4.f990P;
                if (v6 == null) {
                    long j5 = C0288u.f4295e;
                    v6 = new V(j5, j3, j5, C0288u.b(j3, 0.38f));
                    j4.f990P = v6;
                }
                long j6 = v6.f1121b;
                if (C0288u.c(j6, j3)) {
                    c0113p.p(false);
                } else {
                    long b2 = C0288u.b(j3, 0.38f);
                    long j7 = j3 != 16 ? j3 : j6;
                    if (b2 == 16) {
                        b2 = v6.f1123d;
                    }
                    V v7 = new V(v6.f1120a, j7, v6.f1122c, b2);
                    c0113p.p(false);
                    v6 = v7;
                }
                jVar2 = null;
                i5 = i7 & (-7169);
                lVar2 = iVar;
                v4 = v6;
                z4 = true;
            } else {
                c0113p.L();
                lVar2 = lVar;
                z4 = z3;
                jVar2 = jVar;
                i5 = i7 & (-7169);
                v4 = v3;
            }
            c0113p.q();
            I.Y0 y02 = AbstractC0031b0.f1199a;
            U.l e3 = lVar2.e(MinimumInteractiveModifier.f3695a);
            float f3 = H.g.f1693b;
            U.l b3 = androidx.compose.foundation.a.b(androidx.compose.foundation.a.a(I2.l.m(androidx.compose.foundation.layout.a.q(e3, f3), P0.a(5, c0113p)), z4 ? v4.f1120a : v4.f1122c, AbstractC0259J.f4215a), jVar2, B0.a(f3 / 2, c0113p, 54, 4), z4, new z0.f(i8), aVar, 8);
            InterfaceC0827A e4 = AbstractC0818o.e(U.a.f3284h, false);
            int i9 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, b3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, e4);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i9))) {
                AbstractC0080b.p(i9, c0113p, i9, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            C0089d.a(P.f1079a.a(new C0288u(z4 ? v4.f1121b : v4.f1123d)), aVar2, c0113p, ((i5 >> 12) & 112) | 8);
            c0113p.p(true);
            z5 = z4;
            v5 = v4;
            jVar3 = jVar2;
            lVar3 = lVar2;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new W(aVar, lVar3, z5, v5, jVar3, aVar2, i3);
        }
    }

    public static final void e(Y1.a aVar, U.l lVar, boolean z3, InterfaceC0263N interfaceC0263N, C0046j c0046j, C0056o c0056o, C0665u c0665u, InterfaceC0796H interfaceC0796H, q.j jVar, Q.a aVar2, C0113p c0113p, int i3) {
        int i4;
        boolean z4;
        int i5;
        U.l lVar2;
        InterfaceC0796H interfaceC0796H2;
        InterfaceC0263N interfaceC0263N2;
        C0056o c0056o2;
        q.j jVar2;
        C0046j c0046j2;
        C0665u c0665u2;
        U.l lVar3;
        boolean z5;
        InterfaceC0263N interfaceC0263N3;
        C0046j c0046j3;
        C0056o c0056o3;
        C0665u c0665u3;
        InterfaceC0796H interfaceC0796H3;
        q.j jVar3;
        c0113p.S(-1694808287);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i6 = i4 | 432;
        if ((i3 & 3072) == 0) {
            i6 = i4 | 1456;
        }
        if ((i3 & 24576) == 0) {
            i6 |= 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i3) == 0) {
            i7 = 720896 | i6;
        }
        int i8 = i7 | 113246208;
        if ((805306368 & i3) == 0) {
            i8 |= c0113p.h(aVar2) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            z5 = z3;
            interfaceC0263N3 = interfaceC0263N;
            c0046j3 = c0046j;
            c0056o3 = c0056o;
            c0665u3 = c0665u;
            interfaceC0796H3 = interfaceC0796H;
            jVar3 = jVar;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                U.i iVar = U.i.f3302a;
                C0797I c0797i = AbstractC0048k.f1275a;
                float f3 = H.i.f1701a;
                InterfaceC0263N a3 = P0.a(5, c0113p);
                J j3 = (J) c0113p.k(L.f1045a);
                C0046j c0046j4 = j3.f986L;
                if (c0046j4 == null) {
                    long j4 = C0288u.f4295e;
                    c0046j4 = new C0046j(j4, L.c(j3, 26), j4, C0288u.b(L.c(j3, 18), 0.38f));
                    j3.f986L = c0046j4;
                }
                float f4 = H.i.f1701a;
                c0113p.Q(-855870548);
                long d3 = L.d(24, c0113p);
                c0113p.p(false);
                C0665u c0665u4 = new C0665u(f4, new C0265P(d3));
                z4 = true;
                i5 = i8 & (-3734529);
                lVar2 = iVar;
                interfaceC0796H2 = AbstractC0048k.f1275a;
                interfaceC0263N2 = a3;
                c0056o2 = null;
                jVar2 = null;
                c0046j2 = c0046j4;
                c0665u2 = c0665u4;
            } else {
                c0113p.L();
                i5 = i8 & (-3734529);
                lVar2 = lVar;
                z4 = z3;
                interfaceC0263N2 = interfaceC0263N;
                c0046j2 = c0046j;
                c0056o2 = c0056o;
                c0665u2 = c0665u;
                interfaceC0796H2 = interfaceC0796H;
                jVar2 = jVar;
            }
            c0113p.q();
            a(aVar, lVar2, z4, interfaceC0263N2, c0046j2, c0056o2, c0665u2, interfaceC0796H2, jVar2, aVar2, c0113p, i5 & 2147483646, 0);
            lVar3 = lVar2;
            z5 = z4;
            interfaceC0263N3 = interfaceC0263N2;
            c0046j3 = c0046j2;
            c0056o3 = c0056o2;
            c0665u3 = c0665u2;
            interfaceC0796H3 = interfaceC0796H2;
            jVar3 = jVar2;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0065t(aVar, lVar3, z5, interfaceC0263N3, c0046j3, c0056o3, c0665u3, interfaceC0796H3, jVar3, aVar2, i3);
        }
    }

    public static C0067u f(long j3, C0113p c0113p) {
        long j4;
        long b2 = L.b(j3, c0113p);
        long j5 = C0288u.f4296f;
        long b3 = C0288u.b(b2, 0.38f);
        J j6 = (J) c0113p.k(L.f1045a);
        C0067u c0067u = j6.f987M;
        if (c0067u == null) {
            float f3 = H.e.f1663a;
            j4 = b3;
            c0067u = new C0067u(L.c(j6, 39), L.a(j6, L.c(j6, 39)), AbstractC0259J.k(C0288u.b(L.c(j6, H.e.f1665c), H.e.f1667e), L.c(j6, 39)), C0288u.b(L.a(j6, L.c(j6, 39)), 0.38f));
            j6.f987M = c0067u;
        } else {
            j4 = b3;
        }
        long j7 = j3 != 16 ? j3 : c0067u.f1390a;
        if (b2 == 16) {
            b2 = c0067u.f1391b;
        }
        long j8 = b2;
        if (j5 == 16) {
            j5 = c0067u.f1392c;
        }
        return new C0067u(j7, j8, j5, j4 != 16 ? j4 : c0067u.f1393d);
    }

    public static C0073x g(float f3, int i3) {
        if ((i3 & 1) != 0) {
            f3 = H.e.f1663a;
        }
        return new C0073x(f3, H.e.f1671i, H.e.f1669g, H.e.f1670h, H.e.f1668f, H.e.f1666d);
    }

    public static J h(C0113p c0113p) {
        return (J) c0113p.k(L.f1045a);
    }

    public static a1 i(C0113p c0113p) {
        return (a1) c0113p.k(b1.f1200a);
    }
}
