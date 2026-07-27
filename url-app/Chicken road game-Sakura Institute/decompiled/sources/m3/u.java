package m3;

import A.f0;
import B1.C0097d;
import D.C0120c;
import D.C0132g;
import D.I0;
import G.AbstractC0217p0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.C0233y;
import G.F;
import G.InterfaceC0191c0;
import G.N0;
import G.W;
import G.X0;
import android.content.Context;
import java.net.IDN;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import l0.C0810h;
import m.C0842o;
import n.AbstractC0864b;
import o.C0898m;
import o.N;
import p.C0930f;
import p.InterfaceC0934j;
import p0.AbstractC0960V;
import q.InterfaceC1021Z;
import q.InterfaceC1027f;
import q.InterfaceC1029h;
import r0.AbstractC1065f;
import r0.InterfaceC1072m;
import r0.a0;
import s.C1090F;
import s.C1091G;
import s.C1092H;
import s.C1093I;
import s.C1107k;
import s0.AbstractC1144g0;
import s1.C1183B;
import s1.I;
import t.InterfaceC1197a;
import w.M;
import z3.C1447e;
import z3.C1448f;

/* loaded from: classes.dex */
public abstract class u {
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0376, code lost:
    
        if (r3 == r2) goto L208;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [q.f] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(S.o oVar, r.v vVar, InterfaceC1021Z interfaceC1021Z, boolean z4, C0898m c0898m, boolean z5, int i2, S.e eVar, InterfaceC1029h interfaceC1029h, S.f fVar, InterfaceC1027f interfaceC1027f, Function1 function1, C0216p c0216p, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        boolean z6;
        W w4;
        int i9;
        boolean z7;
        S.f fVar2;
        W w5;
        ?? r11;
        int i10;
        C0216p c0216p2 = c0216p;
        c0216p2.U(620764179);
        if ((i4 & 6) == 0) {
            i6 = (c0216p2.f(oVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0216p2.f(vVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0216p2.f(interfaceC1021Z) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0216p2.g(z4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0216p2.g(true) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= c0216p2.f(c0898m) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= c0216p2.g(z5) ? 1048576 : 524288;
        }
        int i11 = i6 | 12582912;
        if ((i4 & 100663296) == 0) {
            i11 |= c0216p2.f(eVar) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i11 |= c0216p2.f(interfaceC1029h) ? 536870912 : 268435456;
        }
        int i12 = i5 | 54;
        if ((i5 & 384) == 0) {
            i12 |= c0216p2.h(function1) ? 256 : 128;
        }
        int i13 = i12;
        if ((i11 & 306783379) == 306783378 && (i13 & 147) == 146 && c0216p.z()) {
            c0216p.N();
            i10 = i2;
            fVar2 = fVar;
            r11 = interfaceC1027f;
        } else {
            int i14 = (i11 >> 3) & 14;
            int i15 = i14 | ((i13 >> 3) & 112);
            InterfaceC0191c0 N3 = C0192d.N(function1, c0216p);
            boolean z8 = (((i15 & 14) ^ 6) > 4 && c0216p2.f(vVar)) || (i15 & 6) == 4;
            Object I3 = c0216p.I();
            W w6 = C0208l.f2826a;
            if (z8 || I3 == w6) {
                r.c cVar = new r.c();
                cVar.f9448a = C0192d.J(Integer.MAX_VALUE);
                cVar.f9449b = C0192d.J(Integer.MAX_VALUE);
                W w7 = W.f2777j;
                C.v vVar2 = new C.v(1, N3);
                C0097d c0097d = N0.f2725a;
                I3 = new I0(0, 2, X0.class, new F(w7, new C0842o(new F(w7, vVar2), vVar, cVar, 4)), "value", "getValue()Ljava/lang/Object;");
                c0216p2.c0(I3);
            }
            S2.c cVar2 = (S2.c) I3;
            int i16 = i14 | ((i11 >> 9) & 112);
            boolean z9 = ((((i16 & 112) ^ 48) > 32 && c0216p2.g(true)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) > 4 && c0216p2.f(vVar)) || (i16 & 6) == 4);
            Object I4 = c0216p.I();
            if (z9 || I4 == w6) {
                I4 = new r.d(vVar);
                c0216p2.c0(I4);
            }
            r.d dVar = (r.d) I4;
            Object I5 = c0216p.I();
            if (I5 == w6) {
                C0233y c0233y = new C0233y(C0192d.z(kotlin.coroutines.i.f7498d, c0216p2));
                c0216p2.c0(c0233y);
                I5 = c0233y;
            }
            b3.c cVar3 = ((C0233y) I5).f2966d;
            Z.A a4 = (Z.A) c0216p2.k(AbstractC1144g0.f10217e);
            boolean z10 = !((Boolean) c0216p2.k(AbstractC1144g0.f10232t)).booleanValue();
            int i17 = i11 & 7168;
            int i18 = i11 >> 6;
            int i19 = i13 << 21;
            int i20 = (i11 & 65520) | (i18 & 458752) | (i18 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i11 & 1879048192);
            int i21 = i11;
            boolean f4 = ((((i20 & 112) ^ 48) > 32 && c0216p2.f(vVar)) || (i20 & 48) == 32) | ((((i20 & 896) ^ 384) > 256 && c0216p2.f(interfaceC1021Z)) || (i20 & 384) == 256) | ((((i20 & 7168) ^ 3072) > 2048 && c0216p2.g(z4)) || (i20 & 3072) == 2048) | ((((57344 & i20) ^ 24576) > 16384 && c0216p2.g(true)) || (i20 & 24576) == 16384) | ((((i20 & 3670016) ^ 1572864) > 1048576 && c0216p2.f(eVar)) || (i20 & 1572864) == 1048576) | (((i20 & 29360128) ^ 12582912) > 8388608 && c0216p2.f(null)) | (((i20 & 234881024) ^ 100663296) > 67108864 && c0216p2.f(null)) | ((((i20 & 1879048192) ^ 805306368) > 536870912 && c0216p2.f(interfaceC1029h)) || (i20 & 805306368) == 536870912) | c0216p2.f(a4) | c0216p2.g(z10);
            Object I6 = c0216p.I();
            if (f4 || I6 == w6) {
                i7 = i21;
                i8 = i17;
                z6 = true;
                w4 = w6;
                i9 = 0;
                z7 = z4;
                fVar2 = null;
                r.l lVar = new r.l(vVar, interfaceC1021Z, z4, cVar2, interfaceC1029h, null, z10, 0, cVar3, a4, eVar, null);
                c0216p2 = c0216p;
                c0216p2.c0(lVar);
                I6 = lVar;
            } else {
                z7 = z4;
                i8 = i17;
                w4 = w6;
                i9 = 0;
                fVar2 = null;
                i7 = i21;
                z6 = true;
            }
            Function2 function2 = (Function2) I6;
            N n2 = N.f8665d;
            S.o a5 = androidx.compose.foundation.lazy.layout.c.a(oVar.h(vVar.f9561k).h(vVar.f9562l), cVar2, dVar, n2, z5, z4);
            int i22 = i14 | ((i7 >> 18) & 112);
            int i23 = i9;
            boolean z11 = ((((i22 & 112) ^ 48) <= 32 || !c0216p2.d(i23)) ? false : z6) | (((((i22 & 14) ^ 6) <= 4 || !c0216p2.f(vVar)) && (i22 & 6) != 4) ? false : z6);
            Object I7 = c0216p.I();
            if (z11) {
                w5 = w4;
            } else {
                w5 = w4;
            }
            I7 = new r.e(vVar, i23);
            c0216p2.c0(I7);
            r.e eVar2 = (r.e) I7;
            M0.k kVar = (M0.k) c0216p2.k(AbstractC1144g0.f10224l);
            int i24 = 512 | i8 | (i7 & 3670016);
            if (z5) {
                c0216p2.S(-1890632411);
                boolean f5 = c0216p2.f(eVar2);
                C0810h c0810h = vVar.f9564n;
                boolean f6 = f5 | c0216p2.f(c0810h);
                if ((((i24 & 7168) ^ 3072) <= 2048 || !c0216p2.g(z7)) && (i24 & 3072) != 2048) {
                    z6 = false;
                }
                boolean f7 = f6 | z6 | c0216p2.f(kVar) | c0216p2.f(n2);
                Object I8 = c0216p.I();
                if (f7 || I8 == w5) {
                    C1107k c1107k = new C1107k(eVar2, c0810h, z4, kVar, n2);
                    c0216p2.c0(c1107k);
                    I8 = c1107k;
                }
                a5 = a5.h((C1107k) I8);
                c0216p2.q(false);
            } else {
                c0216p2.S(-1890658823);
                c0216p2.q(false);
            }
            o.a(cVar2, u3.d.S(a5.h(vVar.f9563m.f5102i), vVar, n2, z5, z4, c0898m, vVar.f9556f, c0216p), vVar.f9565o, function2, c0216p, 0);
            r11 = fVar2;
            i10 = 0;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new r.i(oVar, vVar, interfaceC1021Z, z4, c0898m, z5, i10, eVar, interfaceC1029h, fVar2, r11, function1, i4, i5);
        }
    }

    public static final void b(O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(674185128);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            AbstractC0217p0 abstractC0217p0 = P.m.f3674a;
            P.k kVar = (P.k) c0216p.k(abstractC0217p0);
            Object[] objArr = {kVar};
            C1091G c1091g = C1091G.f9893d;
            C1090F c1090f = new C1090F(kVar, 1);
            y.t tVar = P.o.f3675a;
            y.t tVar2 = new y.t(c1091g, 13, c1090f);
            boolean h4 = c0216p.h(kVar);
            Object I3 = c0216p.I();
            if (h4 || I3 == C0208l.f2826a) {
                I3 = new C1093I(0, kVar);
                c0216p.c0(I3);
            }
            Object obj = (C1092H) u3.l.s0(objArr, tVar2, (Function0) I3, c0216p, 0, 4);
            C0192d.a(abstractC0217p0.a(obj), O.f.b(1863926504, new C0120c(obj, 12, aVar), c0216p), c0216p, 56);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0132g(aVar, i2, 1);
        }
    }

    public static final C1183B c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C1183B c1183b = new C1183B(context);
        I i2 = c1183b.f10457v;
        i2.a(new t1.g(i2));
        c1183b.f10457v.a(new t1.i());
        c1183b.f10457v.a(new t1.p());
        return c1183b;
    }

    public static C1447e d() {
        C1447e c1447e = C1447e.f11994l;
        Intrinsics.c(c1447e);
        C1447e c1447e2 = c1447e.f11996f;
        if (c1447e2 == null) {
            long nanoTime = System.nanoTime();
            C1447e.f11991i.await(C1447e.f11992j, TimeUnit.MILLISECONDS);
            C1447e c1447e3 = C1447e.f11994l;
            Intrinsics.c(c1447e3);
            if (c1447e3.f11996f != null || System.nanoTime() - nanoTime < C1447e.f11993k) {
                return null;
            }
            return C1447e.f11994l;
        }
        long nanoTime2 = c1447e2.f11997g - System.nanoTime();
        if (nanoTime2 > 0) {
            C1447e.f11991i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C1447e c1447e4 = C1447e.f11994l;
        Intrinsics.c(c1447e4);
        c1447e4.f11996f = c1447e2.f11996f;
        c1447e2.f11996f = null;
        return c1447e2;
    }

    public static final InterfaceC0191c0 e(InterfaceC0934j interfaceC0934j, C0216p c0216p, int i2) {
        Object I3 = c0216p.I();
        W w4 = C0208l.f2826a;
        if (I3 == w4) {
            I3 = C0192d.K(Boolean.FALSE, W.f2779l);
            c0216p.c0(I3);
        }
        InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
        boolean z4 = (((i2 & 14) ^ 6) > 4 && c0216p.f(interfaceC0934j)) || (i2 & 6) == 4;
        Object I4 = c0216p.I();
        if (z4 || I4 == w4) {
            I4 = new C0930f(interfaceC0934j, interfaceC0191c0, null);
            c0216p.c0(I4);
        }
        C0192d.e(c0216p, interfaceC0934j, (Function2) I4);
        return interfaceC0191c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress f(String str, int i2, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z4 = false;
        int i9 = i2;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i9 >= i4) {
                i5 = i8;
                break;
            }
            if (i10 != i8) {
                int i13 = i9 + 2;
                if (i13 <= i4 && kotlin.text.u.m(i9, str, "::", z4)) {
                    if (i11 == -1) {
                        i10 += 2;
                        if (i13 != i4) {
                            i11 = i10;
                            i12 = i13;
                            i9 = i12;
                            int i14 = 0;
                            while (i9 < i4) {
                            }
                            i7 = i9 - i12;
                            if (i7 == 0) {
                                break;
                            }
                            break;
                        }
                        i5 = i8;
                        i11 = i10;
                        break;
                    }
                    return null;
                }
                if (i10 != 0) {
                    if (!kotlin.text.u.m(i9, str, ":", z4)) {
                        if (kotlin.text.u.m(i9, str, ".", z4)) {
                            int i15 = i10 - 2;
                            int i16 = i15;
                            loop2: while (true) {
                                if (i12 < i4) {
                                    if (i16 == i8) {
                                        break;
                                    }
                                    if (i16 != i15) {
                                        if (str.charAt(i12) != '.') {
                                            break;
                                        }
                                        i12++;
                                    }
                                    ?? r14 = z4;
                                    int i17 = i12;
                                    while (i17 < i4) {
                                        char charAt = str.charAt(i17);
                                        if (Intrinsics.e(charAt, 48) < 0 || Intrinsics.e(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i12 != i17) || (i6 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i17++;
                                        r14 = i6;
                                    }
                                    if (i17 - i12 == 0) {
                                        break;
                                    }
                                    bArr[i16] = (byte) r14;
                                    i16++;
                                    i12 = i17;
                                    i8 = 16;
                                    z4 = false;
                                } else if (i16 == i10 + 2) {
                                    i10 += 2;
                                    i5 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i9++;
                }
                i12 = i9;
                i9 = i12;
                int i142 = 0;
                while (i9 < i4) {
                    int q2 = n3.b.q(str.charAt(i9));
                    if (q2 == -1) {
                        break;
                    }
                    i142 = (i142 << 4) + q2;
                    i9++;
                }
                i7 = i9 - i12;
                if (i7 == 0 || i7 > 4) {
                    break;
                }
                int i18 = i10 + 1;
                bArr[i10] = (byte) ((i142 >>> 8) & 255);
                i10 += 2;
                bArr[i18] = (byte) (i142 & 255);
                i8 = 16;
                z4 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static final long g(long j4, boolean z4, int i2, float f4) {
        int i4 = ((z4 || u3.l.b0(i2, 2)) && M0.a.e(j4)) ? M0.a.i(j4) : Integer.MAX_VALUE;
        if (M0.a.k(j4) != i4) {
            i4 = kotlin.ranges.b.e(M.k(f4), M0.a.k(j4), i4);
        }
        int h4 = M0.a.h(j4);
        int min = Math.min(0, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int l4 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        return u3.d.a(min, min2, Math.min(l4, 0), h4 != Integer.MAX_VALUE ? Math.min(l4, h4) : Integer.MAX_VALUE);
    }

    public static final Object i(InterfaceC1072m interfaceC1072m, Y.d dVar, E2.c cVar) {
        InterfaceC1197a interfaceC1197a;
        Object j4;
        if (!((S.n) interfaceC1072m).f3978d.f3990s) {
            return Unit.f7487a;
        }
        a0 u4 = AbstractC1065f.u(interfaceC1072m);
        if (((S.n) interfaceC1072m).f3978d.f3990s) {
            InterfaceC1197a interfaceC1197a2 = (InterfaceC1197a) AbstractC1065f.j(interfaceC1072m, t.i.f10633v);
            if (interfaceC1197a2 == null) {
                interfaceC1197a2 = new t.j(interfaceC1072m);
            }
            interfaceC1197a = interfaceC1197a2;
        } else {
            interfaceC1197a = null;
        }
        return (interfaceC1197a != null && (j4 = interfaceC1197a.j(u4, new f0(dVar, 13, u4), cVar)) == D2.a.f2163d) ? j4 : Unit.f7487a;
    }

    public static final String j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i2 = 0;
        int i4 = -1;
        if (!kotlin.text.y.p(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = lowerCase.charAt(i5);
                    if (Intrinsics.e(charAt, 31) <= 0 || Intrinsics.e(charAt, 127) >= 0 || kotlin.text.y.u(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress f4 = (kotlin.text.u.n(str, "[") && kotlin.text.u.h(false, str, "]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (f4 == null) {
            return null;
        }
        byte[] address = f4.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return f4.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C1448f c1448f = new C1448f();
        while (i2 < address.length) {
            if (i2 == i4) {
                c1448f.y(58);
                i2 += i7;
                if (i2 == 16) {
                    c1448f.y(58);
                }
            } else {
                if (i2 > 0) {
                    c1448f.y(58);
                }
                byte b4 = address[i2];
                byte[] bArr = n3.b.f8558a;
                c1448f.z(((b4 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c1448f.r(c1448f.f11999e, Charsets.UTF_8);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [M2.p, kotlin.jvm.functions.Function0] */
    public static final void k(y0.n nVar, int i2, x0.j jVar) {
        I.d dVar = new I.d(new y0.n[16]);
        List g4 = nVar.g(false, false, false);
        while (true) {
            dVar.d(dVar.f3332i, g4);
            while (dVar.l()) {
                y0.n nVar2 = (y0.n) dVar.n(dVar.f3332i - 1);
                a0 c4 = nVar2.c();
                if (!(c4 != null ? c4.V0() : false)) {
                    y0.t tVar = y0.q.f11624m;
                    y0.i iVar = nVar2.f11587d;
                    LinkedHashMap linkedHashMap = iVar.f11576d;
                    if (!linkedHashMap.containsKey(tVar) && !linkedHashMap.containsKey(y0.q.f11620i)) {
                        a0 c5 = nVar2.c();
                        if (c5 == null) {
                            AbstractC0864b.E("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        Y.d e4 = AbstractC0960V.e(c5);
                        int round = Math.round(e4.f4374a);
                        int round2 = Math.round(e4.f4375b);
                        int round3 = Math.round(e4.f4376c);
                        int round4 = Math.round(e4.f4377d);
                        M0.i iVar2 = new M0.i(round, round2, round3, round4);
                        if (round < round3 && round2 < round4) {
                            Object obj = iVar.f11576d.get(y0.h.f11554e);
                            if (obj == null) {
                                obj = null;
                            }
                            Function2 function2 = (Function2) obj;
                            Object obj2 = linkedHashMap.get(y0.q.f11627p);
                            y0.g gVar = (y0.g) (obj2 != null ? obj2 : null);
                            if (function2 == null || gVar == null || ((Number) gVar.f11547b.invoke()).floatValue() <= 0.0f) {
                                g4 = nVar2.g(false, false, false);
                            } else {
                                int i4 = i2 + 1;
                                jVar.invoke(new x0.l(nVar2, i4, iVar2, c5));
                                k(nVar2, i4, jVar);
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    public abstract void h();
}
