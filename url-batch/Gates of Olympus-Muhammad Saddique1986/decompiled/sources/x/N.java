package x;

import B.C0000a;
import B.C0022x;
import B.C0024z;
import B.InterfaceC0013n;
import C0.C0028d;
import C0.C0031g;
import F.v1;
import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.C0184y;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import R0.C0214c;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import b0.AbstractC0347p;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import j0.InterfaceC0553a;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.C0577c;
import m.C0616a;
import n.z0;
import n0.C0703a;
import p.C0758d0;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import r0.InterfaceC0919p;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u.C1076c;
import u0.AbstractC1101g0;
import u0.InterfaceC1095d0;
import u0.K0;
import u0.L0;
import u0.U0;
import u0.V0;
import z.C1242f;
import z.C1256t;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final K f9958a = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0703a f9959b = new C0703a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final F.Z f9960c = new F.Z(0, 0);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, U.q qVar, C0.K k3, InterfaceC0424c interfaceC0424c, int i3, boolean z3, int i4, int i5, b0.w wVar, C0167p c0167p, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        b0.w wVar2;
        int i14;
        boolean z5;
        C0167p c0167p2;
        U.q i15;
        int i16;
        InterfaceC0424c interfaceC0424c2;
        int i17;
        boolean z6;
        c0167p.S(-1186827822);
        if ((i6 & 6) == 0) {
            i8 = (c0167p.f(str) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0167p.f(k3) ? 256 : 128;
        }
        int i18 = i7 & 8;
        if (i18 != 0) {
            i8 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i8 |= c0167p.h(interfaceC0424c) ? 2048 : 1024;
            i9 = i7 & 16;
            if (i9 == 0) {
                i8 |= 24576;
            } else if ((i6 & 24576) == 0) {
                i10 = i3;
                i8 |= c0167p.d(i10) ? 16384 : 8192;
                i11 = i7 & 32;
                if (i11 != 0) {
                    i8 |= 196608;
                } else if ((196608 & i6) == 0) {
                    z4 = z3;
                    i8 |= c0167p.g(z4) ? 131072 : 65536;
                    if ((1572864 & i6) == 0) {
                        i8 |= c0167p.d(i4) ? 1048576 : 524288;
                    }
                    i12 = i7 & 128;
                    if (i12 == 0) {
                        i8 |= 12582912;
                    } else if ((12582912 & i6) == 0) {
                        i13 = i5;
                        i8 |= c0167p.d(i13) ? 8388608 : 4194304;
                        if (((i8 | 100663296) & 38347923) == 38347922 || !c0167p.x()) {
                            wVar2 = null;
                            InterfaceC0424c interfaceC0424c3 = i18 != 0 ? null : interfaceC0424c;
                            int i19 = i9 != 0 ? 1 : i10;
                            boolean z7 = i11 != 0 ? true : z4;
                            int i20 = i12 != 0 ? 1 : i13;
                            s(i20, i4);
                            if (c0167p.k(B.P.f309a) != null) {
                                throw new ClassCastException();
                            }
                            c0167p.Q(-1588686502);
                            c0167p.p(false);
                            if (interfaceC0424c3 != null) {
                                c0167p.Q(-1588564052);
                                i15 = androidx.compose.ui.graphics.a.b(qVar, 0.0f, 0.0f, null, false, 131071).i(U.n.f4488a).i(new TextAnnotatedStringElement(new C0031g(str, null, 6), k3, (H0.d) c0167p.k(AbstractC1101g0.f9357i), interfaceC0424c3, i19, z7, i4, i20, null));
                                c0167p.p(false);
                                i14 = i20;
                                c0167p2 = c0167p;
                                z5 = true;
                            } else {
                                c0167p.Q(-1587866335);
                                i14 = i20;
                                z5 = true;
                                c0167p2 = c0167p;
                                i15 = androidx.compose.ui.graphics.a.b(qVar, 0.0f, 0.0f, null, false, 131071).i(new TextStringSimpleElement(str, k3, (H0.d) c0167p.k(AbstractC1101g0.f9357i), i19, z7, i4, i14, null));
                                c0167p2.p(false);
                            }
                            C1186D c1186d = C1186D.f9939a;
                            int i21 = c0167p2.f2864P;
                            U.q d3 = U.a.d(c0167p2, i15);
                            InterfaceC0164n0 m3 = c0167p.m();
                            InterfaceC0997j.f8759c.getClass();
                            C1001n c1001n = C0996i.f8754b;
                            c0167p.U();
                            if (c0167p2.f2863O) {
                                c0167p2.l(c1001n);
                            } else {
                                c0167p.d0();
                            }
                            C0143d.R(c0167p2, C0996i.f8757e, c1186d);
                            C0143d.R(c0167p2, C0996i.f8756d, m3);
                            C0143d.R(c0167p2, C0996i.f8755c, d3);
                            C0995h c0995h = C0996i.f8758f;
                            if (c0167p2.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i21))) {
                                A.k.o(i21, c0167p2, i21, c0995h);
                            }
                            c0167p2.p(z5);
                            i16 = i14;
                            interfaceC0424c2 = interfaceC0424c3;
                            i17 = i19;
                            z6 = z7;
                        } else {
                            c0167p.L();
                            interfaceC0424c2 = interfaceC0424c;
                            wVar2 = wVar;
                            i17 = i10;
                            z6 = z4;
                            i16 = i13;
                        }
                        C0173s0 r3 = c0167p.r();
                        if (r3 != null) {
                            r3.f2906d = new C1195h(str, qVar, k3, interfaceC0424c2, i17, z6, i4, i16, wVar2, i6, i7);
                            return;
                        }
                        return;
                    }
                    i13 = i5;
                    if (((i8 | 100663296) & 38347923) == 38347922) {
                    }
                    wVar2 = null;
                    if (i18 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    s(i20, i4);
                    if (c0167p.k(B.P.f309a) != null) {
                    }
                }
                z4 = z3;
                if ((1572864 & i6) == 0) {
                }
                i12 = i7 & 128;
                if (i12 == 0) {
                }
                i13 = i5;
                if (((i8 | 100663296) & 38347923) == 38347922) {
                }
                wVar2 = null;
                if (i18 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                s(i20, i4);
                if (c0167p.k(B.P.f309a) != null) {
                }
            }
            i10 = i3;
            i11 = i7 & 32;
            if (i11 != 0) {
            }
            z4 = z3;
            if ((1572864 & i6) == 0) {
            }
            i12 = i7 & 128;
            if (i12 == 0) {
            }
            i13 = i5;
            if (((i8 | 100663296) & 38347923) == 38347922) {
            }
            wVar2 = null;
            if (i18 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            s(i20, i4);
            if (c0167p.k(B.P.f309a) != null) {
            }
        }
        i9 = i7 & 16;
        if (i9 == 0) {
        }
        i10 = i3;
        i11 = i7 & 32;
        if (i11 != 0) {
        }
        z4 = z3;
        if ((1572864 & i6) == 0) {
        }
        i12 = i7 & 128;
        if (i12 == 0) {
        }
        i13 = i5;
        if (((i8 | 100663296) & 38347923) == 38347922) {
        }
        wVar2 = null;
        if (i18 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        s(i20, i4);
        if (c0167p.k(B.P.f309a) != null) {
        }
    }

    public static final void b(B.a0 a0Var, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1985516685);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(a0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            Object G3 = c0167p.G();
            I.W w2 = C0159l.f2829a;
            if (G3 == w2) {
                G3 = new o.n();
                c0167p.a0(G3);
            }
            o.n nVar = (o.n) G3;
            Object G4 = c0167p.G();
            if (G4 == w2) {
                G4 = new t0.D(11, nVar);
                c0167p.a0(G4);
            }
            z0.b(nVar, (InterfaceC0422a) G4, new C0022x(a0Var, 1, nVar), null, a0Var.h(), aVar, c0167p, ((i4 << 12) & 458752) | 54);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 11, a0Var, aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x04cb, code lost:
    
        if (r0 > ((r2 != null ? r2.longValue() : 0) + 5000)) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0639 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x067c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x070f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0788 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x088c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0924 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0439  */
    /* JADX WARN: Type inference failed for: r0v151, types: [U.q] */
    /* JADX WARN: Type inference failed for: r1v154, types: [U.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(I0.z zVar, InterfaceC0424c interfaceC0424c, U.q qVar, C0.K k3, B.r rVar, InterfaceC0424c interfaceC0424c2, q.k kVar, AbstractC0347p abstractC0347p, boolean z3, int i3, int i4, I0.m mVar, O o3, boolean z4, boolean z5, InterfaceC0427f interfaceC0427f, C0167p c0167p, int i5, int i6) {
        int i7;
        int i8;
        Object obj;
        Z.p pVar;
        C1242f c1242f;
        Z.h hVar;
        U0 u02;
        int i9;
        I0.A a3;
        C0031g c0031g;
        n0 n0Var;
        long j3;
        S1.u uVar;
        int i10;
        C0.J j4;
        boolean z6;
        C0031g c0031g2;
        C0167p c0167p2;
        H0.d dVar;
        int i11;
        C0031g c0031g3;
        Z.h hVar2;
        O0.b bVar;
        C0167p c0167p3;
        Q q3;
        I0.F f3;
        C0.J j5;
        boolean a4;
        boolean z7;
        boolean z8;
        Q q4;
        I0.z a5;
        Object G3;
        q0 q0Var;
        Object G4;
        Z.p pVar2;
        Object G5;
        Object G6;
        U.n nVar;
        int i12;
        int i13;
        int i14;
        Z.p pVar3;
        U.n nVar2;
        boolean z9;
        boolean h3;
        Object G7;
        U.n nVar3;
        C1076c c1076c;
        I.W w2;
        Z.p pVar4;
        q0 q0Var2;
        I0.t tVar;
        B.a0 a0Var;
        int i15;
        Q q5;
        I0.G g3;
        int i16;
        q.k kVar2;
        U.q a6;
        B.a0 a0Var2;
        int i17;
        boolean f4;
        Object G8;
        I.W w3;
        I.W w4;
        U.q qVar2;
        int i18;
        I0.A a7;
        boolean h4;
        I.W w5;
        int i19;
        Object obj2;
        U.n nVar4;
        U.q a8;
        I0.t tVar2;
        int i20;
        Object G9;
        int i21;
        int i22;
        int i23;
        int i24;
        U.q qVar3;
        U.n nVar5;
        I.W w6;
        V1.d dVar2;
        U.q i25;
        boolean h5;
        I.W w7;
        int i26;
        Object obj3;
        int i27;
        U0 u03;
        boolean h6;
        Object G10;
        U0 u04;
        U.q qVar4;
        int i28;
        int i29;
        I.W w8;
        int i30;
        boolean z10;
        Object G11;
        I.W w9;
        int i31;
        B.a0 a0Var3;
        int i32;
        U.q qVar5;
        I.W w10;
        B.a0 a0Var4;
        boolean h7;
        boolean h8;
        Object G12;
        boolean z11;
        boolean h9;
        Object G13;
        U.n nVar6;
        c0167p.S(-958708118);
        if ((i5 & 6) == 0) {
            i7 = (c0167p.f(zVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0167p.h(interfaceC0424c) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c0167p.f(k3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= c0167p.f(rVar) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= c0167p.h(interfaceC0424c2) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= c0167p.f(kVar) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= c0167p.f(abstractC0347p) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= c0167p.g(z3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= c0167p.d(i3) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0167p.d(i4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0167p.f(mVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0167p.f(o3) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c0167p.g(z4) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= c0167p.g(z5) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i8 |= c0167p.h(interfaceC0427f) ? 131072 : 65536;
        }
        int i33 = i8;
        if ((i7 & 306783379) == 306783378 && (74899 & i33) == 74898 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.N();
            if ((i5 & 1) != 0 && !c0167p.w()) {
                c0167p.L();
            }
            c0167p.q();
            Object G14 = c0167p.G();
            I.W w11 = C0159l.f2829a;
            Object obj4 = G14;
            if (G14 == w11) {
                Z.p pVar5 = new Z.p();
                c0167p.a0(pVar5);
                obj4 = pVar5;
            }
            Z.p pVar6 = (Z.p) obj4;
            Object G15 = c0167p.G();
            Object obj5 = G15;
            if (G15 == w11) {
                z.x xVar = z.y.f10493a;
                C1242f c1242f2 = new C1242f();
                c0167p.a0(c1242f2);
                obj5 = c1242f2;
            }
            C1242f c1242f3 = (C1242f) obj5;
            Object G16 = c0167p.G();
            Object obj6 = G16;
            if (G16 == w11) {
                I0.A a9 = new I0.A(c1242f3);
                c0167p.a0(a9);
                obj6 = a9;
            }
            I0.A a10 = (I0.A) obj6;
            O0.b bVar2 = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
            H0.d dVar3 = (H0.d) c0167p.k(AbstractC1101g0.f9357i);
            long j6 = ((B.j0) c0167p.k(B.k0.f418a)).f417b;
            Z.h hVar3 = (Z.h) c0167p.k(AbstractC1101g0.f9355g);
            U0 u05 = (U0) c0167p.k(AbstractC1101g0.f9366r);
            K0 k02 = (K0) c0167p.k(AbstractC1101g0.f9362n);
            p.P p3 = (i3 == 1 && !z3 && mVar.f3072a) ? p.P.f7568e : p.P.f7567d;
            Object[] objArr = {p3};
            C1256t c1256t = n0.f10181f;
            boolean f5 = c0167p.f(p3);
            Object G17 = c0167p.G();
            if (f5 || G17 == w11) {
                t0.D d3 = new t0.D(13, p3);
                c0167p.a0(d3);
                obj = d3;
            } else {
                obj = G17;
            }
            n0 n0Var2 = (n0) O2.d.c0(objArr, c1256t, (InterfaceC0422a) obj, c0167p, 0, 4);
            int i34 = i7 & 14;
            boolean z12 = ((i7 & 57344) == 16384) | (i34 == 4);
            Object G18 = c0167p.G();
            C0.J j7 = zVar.f3099c;
            C0031g c0031g4 = zVar.f3097a;
            if (z12 || G18 == w11) {
                I0.G l3 = l(rVar, c0031g4);
                if (j7 != null) {
                    I0.t tVar3 = l3.f3032b;
                    int i35 = C0.J.f568c;
                    long j8 = j7.f569a;
                    int b3 = tVar3.b((int) (j8 >> 32));
                    int b4 = tVar3.b((int) (j8 & 4294967295L));
                    int min = Math.min(b3, b4);
                    int max = Math.max(b3, b4);
                    C0028d c0028d = new C0028d(l3.f3031a);
                    c0028d.a(new C0.D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, N0.j.f3549c, null, 61439), min, max);
                    G18 = new I0.G(c0028d.c(), tVar3);
                } else {
                    G18 = l3;
                }
                c0167p.a0(G18);
            }
            I0.G g4 = (I0.G) G18;
            C0031g c0031g5 = g4.f3031a;
            C0173s0 v3 = c0167p.v();
            if (v3 == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            v3.f2903a |= 1;
            boolean f6 = c0167p.f(k02);
            Object G19 = c0167p.G();
            S1.u uVar2 = S1.u.f4320d;
            if (f6 || G19 == w11) {
                pVar = pVar6;
                c1242f = c1242f3;
                hVar = hVar3;
                u02 = u05;
                i9 = i34;
                a3 = a10;
                c0031g = c0031g4;
                n0Var = n0Var2;
                j3 = j6;
                uVar = uVar2;
                i10 = i33;
                j4 = j7;
                z6 = z3;
                c0031g2 = c0031g5;
                Q q6 = new Q(new Y(c0031g5, k3, Integer.MAX_VALUE, 1, z3, 1, bVar2, dVar3, uVar), v3, k02);
                c0167p2 = c0167p;
                c0167p2.a0(q6);
                G19 = q6;
            } else {
                z6 = z3;
                i9 = i34;
                c0031g = c0031g4;
                c0031g2 = c0031g5;
                n0Var = n0Var2;
                i10 = i33;
                j4 = j7;
                pVar = pVar6;
                c1242f = c1242f3;
                hVar = hVar3;
                u02 = u05;
                a3 = a10;
                j3 = j6;
                c0167p2 = c0167p;
                uVar = uVar2;
            }
            Q q7 = (Q) G19;
            q7.f9993s = interfaceC0424c;
            q7.f9997w = j3;
            G1.m mVar2 = q7.f9992r;
            mVar2.f2117c = o3;
            Z.h hVar4 = hVar;
            mVar2.f2118d = hVar4;
            C0031g c0031g6 = c0031g;
            q7.f9984j = c0031g6;
            Y y3 = q7.f9975a;
            if (f2.j.a(y3.f10039a, c0031g2) && f2.j.a(y3.f10040b, k3) && y3.f10043e == z6 && AbstractC0235a.v(y3.f10044f, 1)) {
                i11 = Integer.MAX_VALUE;
                if (y3.f10041c == Integer.MAX_VALUE && y3.f10042d == 1) {
                    if (f2.j.a(y3.f10045g, bVar2)) {
                        bVar2 = bVar2;
                        S1.u uVar3 = uVar;
                        if (f2.j.a(y3.f10047i, uVar3)) {
                            uVar = uVar3;
                            dVar = dVar3;
                            if (y3.f10046h == dVar) {
                                c0031g3 = c0031g6;
                                hVar2 = hVar4;
                                c0167p3 = c0167p2;
                                bVar = bVar2;
                                q3 = q7;
                                if (q3.f9975a != y3) {
                                    q3.f9990p = true;
                                }
                                q3.f9975a = y3;
                                f3 = q3.f9979e;
                                C1256t c1256t2 = q3.f9978d;
                                j5 = j4;
                                boolean a11 = f2.j.a(j5, ((I0.j) c1256t2.f10467f).c());
                                C0031g c0031g7 = c0031g3;
                                a4 = f2.j.a(((I0.z) c1256t2.f10466e).f3097a, c0031g7);
                                long j9 = zVar.f3098b;
                                if (a4) {
                                    c1256t2.f10467f = new I0.j(c0031g7, j9);
                                    z7 = true;
                                } else if (C0.J.a(((I0.z) c1256t2.f10466e).f3098b, j9)) {
                                    z7 = false;
                                } else {
                                    ((I0.j) c1256t2.f10467f).f(C0.J.e(j9), C0.J.d(j9));
                                    z8 = true;
                                    z7 = false;
                                    if (j5 == null) {
                                        I0.j jVar = (I0.j) c1256t2.f10467f;
                                        jVar.f3068d = -1;
                                        jVar.f3069e = -1;
                                        q4 = q3;
                                    } else {
                                        q4 = q3;
                                        long j10 = j5.f569a;
                                        if (!C0.J.b(j10)) {
                                            ((I0.j) c1256t2.f10467f).e(C0.J.e(j10), C0.J.d(j10));
                                        }
                                    }
                                    if (z7 && (z8 || a11)) {
                                        a5 = zVar;
                                    } else {
                                        I0.j jVar2 = (I0.j) c1256t2.f10467f;
                                        jVar2.f3068d = -1;
                                        jVar2.f3069e = -1;
                                        a5 = I0.z.a(zVar, null, 0L, 3);
                                    }
                                    I0.z zVar2 = (I0.z) c1256t2.f10466e;
                                    c1256t2.f10466e = a5;
                                    if (f3 != null) {
                                        f3.a(zVar2, a5);
                                    }
                                    G3 = c0167p.G();
                                    Object obj7 = G3;
                                    if (G3 == w11) {
                                        q0 q0Var3 = new q0();
                                        c0167p3.a0(q0Var3);
                                        obj7 = q0Var3;
                                    }
                                    q0Var = (q0) obj7;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (!q0Var.f10240f) {
                                        Long l4 = q0Var.f10239e;
                                    }
                                    q0Var.f10239e = Long.valueOf(currentTimeMillis);
                                    q0Var.a(zVar);
                                    G4 = c0167p.G();
                                    Object obj8 = G4;
                                    if (G4 == w11) {
                                        B.a0 a0Var5 = new B.a0(q0Var);
                                        c0167p3.a0(a0Var5);
                                        obj8 = a0Var5;
                                    }
                                    B.a0 a0Var6 = (B.a0) obj8;
                                    I0.t tVar4 = g4.f3032b;
                                    a0Var6.f343b = tVar4;
                                    Q q8 = q4;
                                    a0Var6.f344c = q8.f9994t;
                                    a0Var6.f345d = q8;
                                    a0Var6.f346e.setValue(zVar);
                                    a0Var6.f347f = (InterfaceC1095d0) c0167p3.k(AbstractC1101g0.f9352d);
                                    a0Var6.f348g = (L0) c0167p3.k(AbstractC1101g0.f9363o);
                                    a0Var6.f349h = (InterfaceC0553a) c0167p3.k(AbstractC1101g0.f9358j);
                                    pVar2 = pVar;
                                    a0Var6.f350i = pVar2;
                                    boolean z13 = !z5;
                                    a0Var6.f351j.setValue(Boolean.valueOf(z13));
                                    a0Var6.f352k.setValue(Boolean.valueOf(z4));
                                    G5 = c0167p.G();
                                    if (G5 == w11) {
                                        C0184y c0184y = new C0184y(C0143d.z(c0167p));
                                        c0167p3.a0(c0184y);
                                        G5 = c0184y;
                                    }
                                    v2.c cVar = ((C0184y) G5).f2968d;
                                    G6 = c0167p.G();
                                    Object obj9 = G6;
                                    if (G6 == w11) {
                                        C1076c c1076c2 = new C1076c();
                                        c0167p3.a0(c1076c2);
                                        obj9 = c1076c2;
                                    }
                                    C1076c c1076c3 = (C1076c) obj9;
                                    nVar = U.n.f4488a;
                                    Z.h hVar5 = hVar2;
                                    i12 = i10;
                                    i13 = i12 & 7168;
                                    boolean h10 = c0167p3.h(q8) | (i13 == 2048);
                                    int i36 = i12 & 57344;
                                    I0.A a12 = a3;
                                    boolean h11 = h10 | (i36 == 16384) | c0167p3.h(a12);
                                    int i37 = i9;
                                    boolean z14 = h11 | (i37 == 4);
                                    i14 = (i12 & 112) ^ 48;
                                    if (i14 <= 32 && c0167p3.f(mVar)) {
                                        nVar2 = nVar;
                                        pVar3 = pVar2;
                                        z9 = true;
                                        h3 = z14 | z9 | c0167p3.h(tVar4) | c0167p3.h(cVar) | c0167p3.h(c1076c3) | c0167p3.h(a0Var6);
                                        G7 = c0167p.G();
                                        if (!h3 || G7 == w11) {
                                            nVar3 = nVar2;
                                            c1076c = c1076c3;
                                            w2 = w11;
                                            pVar4 = pVar3;
                                            q0Var2 = q0Var;
                                            tVar = tVar4;
                                            a0Var = a0Var6;
                                            i15 = i12;
                                            q5 = q8;
                                            g3 = g4;
                                            i16 = i14;
                                            kVar2 = kVar;
                                            C1205s c1205s = new C1205s(q8, z4, z5, a12, zVar, mVar, tVar4, a0Var6, cVar, c1076c);
                                            c0167p3.a0(c1205s);
                                            G7 = c1205s;
                                        } else {
                                            kVar2 = kVar;
                                            q0Var2 = q0Var;
                                            tVar = tVar4;
                                            a0Var = a0Var6;
                                            i16 = i14;
                                            g3 = g4;
                                            i15 = i12;
                                            w2 = w11;
                                            nVar3 = nVar2;
                                            pVar4 = pVar3;
                                            c1076c = c1076c3;
                                            q5 = q8;
                                        }
                                        a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar4), (InterfaceC0424c) G7), z4, kVar2);
                                        InterfaceC0142c0 N3 = C0143d.N(Boolean.valueOf((z4 || z5) ? false : true), c0167p3);
                                        R1.y yVar = R1.y.f4171a;
                                        a0Var2 = a0Var;
                                        i17 = i16;
                                        f4 = c0167p3.f(N3) | c0167p3.h(q5) | c0167p3.h(a12) | c0167p3.h(a0Var2) | ((i17 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                        G8 = c0167p.G();
                                        w3 = w2;
                                        if (!f4 || G8 == w3) {
                                            w4 = w3;
                                            qVar2 = a6;
                                            i18 = i17;
                                            a7 = a12;
                                            C1197j c1197j = new C1197j(q5, N3, a12, a0Var2, mVar, null);
                                            c0167p3.a0(c1197j);
                                            G8 = c1197j;
                                        } else {
                                            w4 = w3;
                                            qVar2 = a6;
                                            a7 = a12;
                                            i18 = i17;
                                        }
                                        C0143d.e(c0167p3, (InterfaceC0426e) G8, yVar);
                                        h4 = c0167p3.h(q5);
                                        Object G20 = c0167p.G();
                                        w5 = w4;
                                        if (!h4 || G20 == w5) {
                                            i19 = 1;
                                            C1204q c1204q = new C1204q(q5, i19);
                                            c0167p3.a0(c1204q);
                                            obj2 = c1204q;
                                        } else {
                                            i19 = 1;
                                            obj2 = G20;
                                        }
                                        nVar4 = nVar3;
                                        a8 = n0.w.a(nVar4, 8675309, new B.D((InterfaceC0424c) obj2, null));
                                        int i38 = (c0167p3.h(q5) ? 1 : 0) | (i36 != 16384 ? i19 : 0);
                                        int i39 = i13 != 2048 ? i19 : 0;
                                        tVar2 = tVar;
                                        i20 = i38 | i39 | (c0167p3.h(tVar2) ? 1 : 0) | (c0167p3.h(a0Var2) ? 1 : 0);
                                        G9 = c0167p.G();
                                        if (i20 == 0 || G9 == w5) {
                                            i21 = i18;
                                            i22 = 2048;
                                            i23 = i36;
                                            i24 = i13;
                                            qVar3 = a8;
                                            nVar5 = nVar4;
                                            w6 = w5;
                                            dVar2 = null;
                                            C1207u c1207u = new C1207u(q5, pVar4, z5, z4, a0Var2, tVar2);
                                            c0167p3.a0(c1207u);
                                            G9 = c1207u;
                                        } else {
                                            i23 = i36;
                                            nVar5 = nVar4;
                                            w6 = w5;
                                            i24 = i13;
                                            i21 = i18;
                                            i22 = 2048;
                                            qVar3 = a8;
                                            dVar2 = null;
                                        }
                                        U.q b5 = !z4 ? U.a.b(qVar3, new B.I((InterfaceC0424c) G9, kVar2)) : qVar3;
                                        B.Y y4 = a0Var2.f362u;
                                        B.W w12 = a0Var2.f361t;
                                        i25 = b5.i(new SuspendPointerInputElement(y4, w12, new C0024z(y4, w12, dVar2), 4)).i(new PointerHoverIconModifierElement(false));
                                        h5 = c0167p3.h(q5) | (i37 != 4) | c0167p3.h(tVar2);
                                        Object G21 = c0167p.G();
                                        w7 = w6;
                                        if (!h5 || G21 == w7) {
                                            i26 = i22;
                                            R.h hVar6 = new R.h(q5, zVar, tVar2, 13);
                                            c0167p3.a0(hVar6);
                                            obj3 = hVar6;
                                        } else {
                                            i26 = i22;
                                            obj3 = G21;
                                        }
                                        U.q a13 = androidx.compose.ui.draw.a.a((InterfaceC0424c) obj3);
                                        i27 = i24;
                                        u03 = u02;
                                        h6 = c0167p3.h(q5) | (i27 != i26) | c0167p3.f(u03) | c0167p3.h(a0Var2) | (i37 != 4) | c0167p3.h(tVar2);
                                        G10 = c0167p.G();
                                        if (!h6 || G10 == w7) {
                                            u04 = u03;
                                            qVar4 = i25;
                                            i28 = i27;
                                            i29 = i26;
                                            w8 = w7;
                                            C1206t c1206t = new C1206t(q5, z4, u04, a0Var2, zVar, tVar2);
                                            c0167p3.a0(c1206t);
                                            G10 = c1206t;
                                        } else {
                                            u04 = u03;
                                            i29 = i26;
                                            w8 = w7;
                                            qVar4 = i25;
                                            i28 = i27;
                                        }
                                        U.n nVar7 = nVar5;
                                        U.q d4 = androidx.compose.ui.layout.a.d(nVar7, (InterfaceC0424c) G10);
                                        I0.G g5 = g3;
                                        boolean h12 = c0167p3.h(g5) | (i37 != 4) | (i28 != i29) | c0167p3.g(false) | (i23 != 16384) | c0167p3.h(q5) | c0167p3.h(tVar2) | c0167p3.h(a0Var2);
                                        i30 = i21;
                                        z10 = h12 | ((i30 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                        G11 = c0167p.G();
                                        w9 = w8;
                                        if (!z10 || G11 == w9) {
                                            i31 = i30;
                                            a0Var3 = a0Var2;
                                            i32 = i37;
                                            qVar5 = qVar4;
                                            w10 = w9;
                                            C1209w c1209w = new C1209w(g5, zVar, z4, z5, mVar, q5, tVar2, a0Var2, pVar4);
                                            c0167p3.a0(c1209w);
                                            G11 = c1209w;
                                        } else {
                                            i32 = i37;
                                            a0Var3 = a0Var2;
                                            i31 = i30;
                                            qVar5 = qVar4;
                                            w10 = w9;
                                        }
                                        AtomicInteger atomicInteger = A0.k.f132a;
                                        AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((InterfaceC0424c) G11, true);
                                        boolean z15 = !z4 && !z5 && ((V0) u04).a() && C0.J.b(((C0.J) q5.f9998x.getValue()).f569a) && C0.J.b(((C0.J) q5.f9999y.getValue()).f569a);
                                        float f7 = b0.f10057a;
                                        U.n b6 = !z15 ? U.a.b(nVar7, new C0577c(abstractC0347p, q5, zVar, tVar2, 1)) : nVar7;
                                        a0Var4 = a0Var3;
                                        h7 = c0167p3.h(a0Var4);
                                        Object G22 = c0167p.G();
                                        Object obj10 = G22;
                                        if (!h7 || G22 == w10) {
                                            C1198k c1198k = new C1198k(a0Var4, 0);
                                            c0167p3.a0(c1198k);
                                            obj10 = c1198k;
                                        }
                                        C0143d.c(a0Var4, (InterfaceC0424c) obj10, c0167p3);
                                        I0.A a14 = a7;
                                        int i40 = i31;
                                        h8 = c0167p3.h(q5) | c0167p3.h(a14) | (i32 != 4) | ((i40 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                        G12 = c0167p.G();
                                        if (!h8 || G12 == w10) {
                                            C0616a c0616a = new C0616a(q5, a14, zVar, mVar, 4);
                                            c0167p3.a0(c0616a);
                                            G12 = c0616a;
                                        }
                                        C0143d.c(mVar, (InterfaceC0424c) G12, c0167p3);
                                        z11 = true;
                                        I.W w13 = w10;
                                        U.q b7 = U.a.b(nVar7, new e0(q5, a0Var4, zVar, z13, i3 != 1, tVar2, q0Var2, q5.f9994t, mVar.f3076e));
                                        boolean booleanValue = ((Boolean) N3.getValue()).booleanValue();
                                        C1242f c1242f4 = c1242f;
                                        h9 = c0167p3.h(q5) | ((i40 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32) | c0167p3.h(c1242f4);
                                        G13 = c0167p.G();
                                        if (!h9 || G13 == w13) {
                                            C0214c c0214c = new C0214c(q5, pVar4, mVar, c1242f4, 1);
                                            c0167p3.a0(c0214c);
                                            G13 = c0214c;
                                        }
                                        U.q i41 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(qVar, c1242f4, q5, a0Var4).i(androidx.compose.foundation.text.handwriting.a.a((InterfaceC0422a) G13, booleanValue)).i(qVar2), new C0758d0(hVar5, 16, q5)), new C0758d0(q5, 15, a0Var4)).i(b7);
                                        n0 n0Var3 = n0Var;
                                        U.q d5 = androidx.compose.ui.layout.a.d(U.a.b(i41, new l0(n0Var3, z4, kVar)).i(qVar5).i(appendedSemanticsElement), new C1204q(q5, 0));
                                        if (z4 || !q5.b() || !((Boolean) q5.f9991q.getValue()).booleanValue() || !((V0) u04).a()) {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            nVar6 = nVar7;
                                        } else {
                                            nVar6 = !n.d0.a() ? nVar7 : U.a.b(nVar7, new B.h0(0, a0Var4));
                                        }
                                        d(d5, a0Var4, Q.f.b(-374338080, new C1203p(interfaceC0427f, q5, k3, i4, i3, n0Var3, zVar, rVar, b6, a13, d4, nVar6, c1076c, a0Var4, z11, z5, interfaceC0424c2, tVar2, bVar), c0167p), c0167p, 384);
                                    }
                                    nVar2 = nVar;
                                    pVar3 = pVar2;
                                    if ((i12 & 48) != 32) {
                                        z9 = false;
                                        h3 = z14 | z9 | c0167p3.h(tVar4) | c0167p3.h(cVar) | c0167p3.h(c1076c3) | c0167p3.h(a0Var6);
                                        G7 = c0167p.G();
                                        if (h3) {
                                        }
                                        nVar3 = nVar2;
                                        c1076c = c1076c3;
                                        w2 = w11;
                                        pVar4 = pVar3;
                                        q0Var2 = q0Var;
                                        tVar = tVar4;
                                        a0Var = a0Var6;
                                        i15 = i12;
                                        q5 = q8;
                                        g3 = g4;
                                        i16 = i14;
                                        kVar2 = kVar;
                                        C1205s c1205s2 = new C1205s(q8, z4, z5, a12, zVar, mVar, tVar4, a0Var6, cVar, c1076c);
                                        c0167p3.a0(c1205s2);
                                        G7 = c1205s2;
                                        a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar4), (InterfaceC0424c) G7), z4, kVar2);
                                        InterfaceC0142c0 N32 = C0143d.N(Boolean.valueOf((z4 || z5) ? false : true), c0167p3);
                                        R1.y yVar2 = R1.y.f4171a;
                                        a0Var2 = a0Var;
                                        i17 = i16;
                                        f4 = c0167p3.f(N32) | c0167p3.h(q5) | c0167p3.h(a12) | c0167p3.h(a0Var2) | ((i17 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                        G8 = c0167p.G();
                                        w3 = w2;
                                        if (f4) {
                                        }
                                        w4 = w3;
                                        qVar2 = a6;
                                        i18 = i17;
                                        a7 = a12;
                                        C1197j c1197j2 = new C1197j(q5, N32, a12, a0Var2, mVar, null);
                                        c0167p3.a0(c1197j2);
                                        G8 = c1197j2;
                                        C0143d.e(c0167p3, (InterfaceC0426e) G8, yVar2);
                                        h4 = c0167p3.h(q5);
                                        Object G202 = c0167p.G();
                                        w5 = w4;
                                        if (h4) {
                                        }
                                        i19 = 1;
                                        C1204q c1204q2 = new C1204q(q5, i19);
                                        c0167p3.a0(c1204q2);
                                        obj2 = c1204q2;
                                        nVar4 = nVar3;
                                        a8 = n0.w.a(nVar4, 8675309, new B.D((InterfaceC0424c) obj2, null));
                                        int i382 = (c0167p3.h(q5) ? 1 : 0) | (i36 != 16384 ? i19 : 0);
                                        if (i13 != 2048) {
                                        }
                                        tVar2 = tVar;
                                        i20 = i382 | i39 | (c0167p3.h(tVar2) ? 1 : 0) | (c0167p3.h(a0Var2) ? 1 : 0);
                                        G9 = c0167p.G();
                                        if (i20 == 0) {
                                        }
                                        i21 = i18;
                                        i22 = 2048;
                                        i23 = i36;
                                        i24 = i13;
                                        qVar3 = a8;
                                        nVar5 = nVar4;
                                        w6 = w5;
                                        dVar2 = null;
                                        C1207u c1207u2 = new C1207u(q5, pVar4, z5, z4, a0Var2, tVar2);
                                        c0167p3.a0(c1207u2);
                                        G9 = c1207u2;
                                        if (!z4) {
                                        }
                                        B.Y y42 = a0Var2.f362u;
                                        B.W w122 = a0Var2.f361t;
                                        i25 = b5.i(new SuspendPointerInputElement(y42, w122, new C0024z(y42, w122, dVar2), 4)).i(new PointerHoverIconModifierElement(false));
                                        h5 = c0167p3.h(q5) | (i37 != 4) | c0167p3.h(tVar2);
                                        Object G212 = c0167p.G();
                                        w7 = w6;
                                        if (h5) {
                                        }
                                        i26 = i22;
                                        R.h hVar62 = new R.h(q5, zVar, tVar2, 13);
                                        c0167p3.a0(hVar62);
                                        obj3 = hVar62;
                                        U.q a132 = androidx.compose.ui.draw.a.a((InterfaceC0424c) obj3);
                                        i27 = i24;
                                        u03 = u02;
                                        h6 = c0167p3.h(q5) | (i27 != i26) | c0167p3.f(u03) | c0167p3.h(a0Var2) | (i37 != 4) | c0167p3.h(tVar2);
                                        G10 = c0167p.G();
                                        if (h6) {
                                        }
                                        u04 = u03;
                                        qVar4 = i25;
                                        i28 = i27;
                                        i29 = i26;
                                        w8 = w7;
                                        C1206t c1206t2 = new C1206t(q5, z4, u04, a0Var2, zVar, tVar2);
                                        c0167p3.a0(c1206t2);
                                        G10 = c1206t2;
                                        U.n nVar72 = nVar5;
                                        U.q d42 = androidx.compose.ui.layout.a.d(nVar72, (InterfaceC0424c) G10);
                                        I0.G g52 = g3;
                                        boolean h122 = c0167p3.h(g52) | (i37 != 4) | (i28 != i29) | c0167p3.g(false) | (i23 != 16384) | c0167p3.h(q5) | c0167p3.h(tVar2) | c0167p3.h(a0Var2);
                                        i30 = i21;
                                        z10 = h122 | ((i30 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                        G11 = c0167p.G();
                                        w9 = w8;
                                        if (z10) {
                                        }
                                        i31 = i30;
                                        a0Var3 = a0Var2;
                                        i32 = i37;
                                        qVar5 = qVar4;
                                        w10 = w9;
                                        C1209w c1209w2 = new C1209w(g52, zVar, z4, z5, mVar, q5, tVar2, a0Var2, pVar4);
                                        c0167p3.a0(c1209w2);
                                        G11 = c1209w2;
                                        AtomicInteger atomicInteger2 = A0.k.f132a;
                                        AppendedSemanticsElement appendedSemanticsElement2 = new AppendedSemanticsElement((InterfaceC0424c) G11, true);
                                        if (z4) {
                                        }
                                        float f72 = b0.f10057a;
                                        if (!z15) {
                                        }
                                        a0Var4 = a0Var3;
                                        h7 = c0167p3.h(a0Var4);
                                        Object G222 = c0167p.G();
                                        Object obj102 = G222;
                                        if (!h7) {
                                        }
                                        C1198k c1198k2 = new C1198k(a0Var4, 0);
                                        c0167p3.a0(c1198k2);
                                        obj102 = c1198k2;
                                        C0143d.c(a0Var4, (InterfaceC0424c) obj102, c0167p3);
                                        I0.A a142 = a7;
                                        int i402 = i31;
                                        h8 = c0167p3.h(q5) | c0167p3.h(a142) | (i32 != 4) | ((i402 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                        G12 = c0167p.G();
                                        if (!h8) {
                                        }
                                        C0616a c0616a2 = new C0616a(q5, a142, zVar, mVar, 4);
                                        c0167p3.a0(c0616a2);
                                        G12 = c0616a2;
                                        C0143d.c(mVar, (InterfaceC0424c) G12, c0167p3);
                                        z11 = true;
                                        I.W w132 = w10;
                                        U.q b72 = U.a.b(nVar72, new e0(q5, a0Var4, zVar, z13, i3 != 1, tVar2, q0Var2, q5.f9994t, mVar.f3076e));
                                        boolean booleanValue2 = ((Boolean) N32.getValue()).booleanValue();
                                        C1242f c1242f42 = c1242f;
                                        h9 = c0167p3.h(q5) | ((i402 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32) | c0167p3.h(c1242f42);
                                        G13 = c0167p.G();
                                        if (!h9) {
                                        }
                                        C0214c c0214c2 = new C0214c(q5, pVar4, mVar, c1242f42, 1);
                                        c0167p3.a0(c0214c2);
                                        G13 = c0214c2;
                                        U.q i412 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(qVar, c1242f42, q5, a0Var4).i(androidx.compose.foundation.text.handwriting.a.a((InterfaceC0422a) G13, booleanValue2)).i(qVar2), new C0758d0(hVar5, 16, q5)), new C0758d0(q5, 15, a0Var4)).i(b72);
                                        n0 n0Var32 = n0Var;
                                        U.q d52 = androidx.compose.ui.layout.a.d(U.a.b(i412, new l0(n0Var32, z4, kVar)).i(qVar5).i(appendedSemanticsElement2), new C1204q(q5, 0));
                                        if (z4) {
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                        d(d52, a0Var4, Q.f.b(-374338080, new C1203p(interfaceC0427f, q5, k3, i4, i3, n0Var32, zVar, rVar, b6, a132, d42, nVar6, c1076c, a0Var4, z11, z5, interfaceC0424c2, tVar2, bVar), c0167p), c0167p, 384);
                                    }
                                    z9 = true;
                                    h3 = z14 | z9 | c0167p3.h(tVar4) | c0167p3.h(cVar) | c0167p3.h(c1076c3) | c0167p3.h(a0Var6);
                                    G7 = c0167p.G();
                                    if (h3) {
                                    }
                                    nVar3 = nVar2;
                                    c1076c = c1076c3;
                                    w2 = w11;
                                    pVar4 = pVar3;
                                    q0Var2 = q0Var;
                                    tVar = tVar4;
                                    a0Var = a0Var6;
                                    i15 = i12;
                                    q5 = q8;
                                    g3 = g4;
                                    i16 = i14;
                                    kVar2 = kVar;
                                    C1205s c1205s22 = new C1205s(q8, z4, z5, a12, zVar, mVar, tVar4, a0Var6, cVar, c1076c);
                                    c0167p3.a0(c1205s22);
                                    G7 = c1205s22;
                                    a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar4), (InterfaceC0424c) G7), z4, kVar2);
                                    InterfaceC0142c0 N322 = C0143d.N(Boolean.valueOf((z4 || z5) ? false : true), c0167p3);
                                    R1.y yVar22 = R1.y.f4171a;
                                    a0Var2 = a0Var;
                                    i17 = i16;
                                    f4 = c0167p3.f(N322) | c0167p3.h(q5) | c0167p3.h(a12) | c0167p3.h(a0Var2) | ((i17 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                    G8 = c0167p.G();
                                    w3 = w2;
                                    if (f4) {
                                    }
                                    w4 = w3;
                                    qVar2 = a6;
                                    i18 = i17;
                                    a7 = a12;
                                    C1197j c1197j22 = new C1197j(q5, N322, a12, a0Var2, mVar, null);
                                    c0167p3.a0(c1197j22);
                                    G8 = c1197j22;
                                    C0143d.e(c0167p3, (InterfaceC0426e) G8, yVar22);
                                    h4 = c0167p3.h(q5);
                                    Object G2022 = c0167p.G();
                                    w5 = w4;
                                    if (h4) {
                                    }
                                    i19 = 1;
                                    C1204q c1204q22 = new C1204q(q5, i19);
                                    c0167p3.a0(c1204q22);
                                    obj2 = c1204q22;
                                    nVar4 = nVar3;
                                    a8 = n0.w.a(nVar4, 8675309, new B.D((InterfaceC0424c) obj2, null));
                                    int i3822 = (c0167p3.h(q5) ? 1 : 0) | (i36 != 16384 ? i19 : 0);
                                    if (i13 != 2048) {
                                    }
                                    tVar2 = tVar;
                                    i20 = i3822 | i39 | (c0167p3.h(tVar2) ? 1 : 0) | (c0167p3.h(a0Var2) ? 1 : 0);
                                    G9 = c0167p.G();
                                    if (i20 == 0) {
                                    }
                                    i21 = i18;
                                    i22 = 2048;
                                    i23 = i36;
                                    i24 = i13;
                                    qVar3 = a8;
                                    nVar5 = nVar4;
                                    w6 = w5;
                                    dVar2 = null;
                                    C1207u c1207u22 = new C1207u(q5, pVar4, z5, z4, a0Var2, tVar2);
                                    c0167p3.a0(c1207u22);
                                    G9 = c1207u22;
                                    if (!z4) {
                                    }
                                    B.Y y422 = a0Var2.f362u;
                                    B.W w1222 = a0Var2.f361t;
                                    i25 = b5.i(new SuspendPointerInputElement(y422, w1222, new C0024z(y422, w1222, dVar2), 4)).i(new PointerHoverIconModifierElement(false));
                                    h5 = c0167p3.h(q5) | (i37 != 4) | c0167p3.h(tVar2);
                                    Object G2122 = c0167p.G();
                                    w7 = w6;
                                    if (h5) {
                                    }
                                    i26 = i22;
                                    R.h hVar622 = new R.h(q5, zVar, tVar2, 13);
                                    c0167p3.a0(hVar622);
                                    obj3 = hVar622;
                                    U.q a1322 = androidx.compose.ui.draw.a.a((InterfaceC0424c) obj3);
                                    i27 = i24;
                                    u03 = u02;
                                    h6 = c0167p3.h(q5) | (i27 != i26) | c0167p3.f(u03) | c0167p3.h(a0Var2) | (i37 != 4) | c0167p3.h(tVar2);
                                    G10 = c0167p.G();
                                    if (h6) {
                                    }
                                    u04 = u03;
                                    qVar4 = i25;
                                    i28 = i27;
                                    i29 = i26;
                                    w8 = w7;
                                    C1206t c1206t22 = new C1206t(q5, z4, u04, a0Var2, zVar, tVar2);
                                    c0167p3.a0(c1206t22);
                                    G10 = c1206t22;
                                    U.n nVar722 = nVar5;
                                    U.q d422 = androidx.compose.ui.layout.a.d(nVar722, (InterfaceC0424c) G10);
                                    I0.G g522 = g3;
                                    boolean h1222 = c0167p3.h(g522) | (i37 != 4) | (i28 != i29) | c0167p3.g(false) | (i23 != 16384) | c0167p3.h(q5) | c0167p3.h(tVar2) | c0167p3.h(a0Var2);
                                    i30 = i21;
                                    z10 = h1222 | ((i30 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                    G11 = c0167p.G();
                                    w9 = w8;
                                    if (z10) {
                                    }
                                    i31 = i30;
                                    a0Var3 = a0Var2;
                                    i32 = i37;
                                    qVar5 = qVar4;
                                    w10 = w9;
                                    C1209w c1209w22 = new C1209w(g522, zVar, z4, z5, mVar, q5, tVar2, a0Var2, pVar4);
                                    c0167p3.a0(c1209w22);
                                    G11 = c1209w22;
                                    AtomicInteger atomicInteger22 = A0.k.f132a;
                                    AppendedSemanticsElement appendedSemanticsElement22 = new AppendedSemanticsElement((InterfaceC0424c) G11, true);
                                    if (z4) {
                                    }
                                    float f722 = b0.f10057a;
                                    if (!z15) {
                                    }
                                    a0Var4 = a0Var3;
                                    h7 = c0167p3.h(a0Var4);
                                    Object G2222 = c0167p.G();
                                    Object obj1022 = G2222;
                                    if (!h7) {
                                    }
                                    C1198k c1198k22 = new C1198k(a0Var4, 0);
                                    c0167p3.a0(c1198k22);
                                    obj1022 = c1198k22;
                                    C0143d.c(a0Var4, (InterfaceC0424c) obj1022, c0167p3);
                                    I0.A a1422 = a7;
                                    int i4022 = i31;
                                    h8 = c0167p3.h(q5) | c0167p3.h(a1422) | (i32 != 4) | ((i4022 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                    G12 = c0167p.G();
                                    if (!h8) {
                                    }
                                    C0616a c0616a22 = new C0616a(q5, a1422, zVar, mVar, 4);
                                    c0167p3.a0(c0616a22);
                                    G12 = c0616a22;
                                    C0143d.c(mVar, (InterfaceC0424c) G12, c0167p3);
                                    z11 = true;
                                    I.W w1322 = w10;
                                    U.q b722 = U.a.b(nVar722, new e0(q5, a0Var4, zVar, z13, i3 != 1, tVar2, q0Var2, q5.f9994t, mVar.f3076e));
                                    boolean booleanValue22 = ((Boolean) N322.getValue()).booleanValue();
                                    C1242f c1242f422 = c1242f;
                                    h9 = c0167p3.h(q5) | ((i4022 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32) | c0167p3.h(c1242f422);
                                    G13 = c0167p.G();
                                    if (!h9) {
                                    }
                                    C0214c c0214c22 = new C0214c(q5, pVar4, mVar, c1242f422, 1);
                                    c0167p3.a0(c0214c22);
                                    G13 = c0214c22;
                                    U.q i4122 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(qVar, c1242f422, q5, a0Var4).i(androidx.compose.foundation.text.handwriting.a.a((InterfaceC0422a) G13, booleanValue22)).i(qVar2), new C0758d0(hVar5, 16, q5)), new C0758d0(q5, 15, a0Var4)).i(b722);
                                    n0 n0Var322 = n0Var;
                                    U.q d522 = androidx.compose.ui.layout.a.d(U.a.b(i4122, new l0(n0Var322, z4, kVar)).i(qVar5).i(appendedSemanticsElement22), new C1204q(q5, 0));
                                    if (z4) {
                                    }
                                    z11 = false;
                                    if (z11) {
                                    }
                                    d(d522, a0Var4, Q.f.b(-374338080, new C1203p(interfaceC0427f, q5, k3, i4, i3, n0Var322, zVar, rVar, b6, a1322, d422, nVar6, c1076c, a0Var4, z11, z5, interfaceC0424c2, tVar2, bVar), c0167p), c0167p, 384);
                                }
                                z8 = false;
                                if (j5 == null) {
                                }
                                if (z7) {
                                }
                                I0.j jVar22 = (I0.j) c1256t2.f10467f;
                                jVar22.f3068d = -1;
                                jVar22.f3069e = -1;
                                a5 = I0.z.a(zVar, null, 0L, 3);
                                I0.z zVar22 = (I0.z) c1256t2.f10466e;
                                c1256t2.f10466e = a5;
                                if (f3 != null) {
                                }
                                G3 = c0167p.G();
                                Object obj72 = G3;
                                if (G3 == w11) {
                                }
                                q0Var = (q0) obj72;
                                long currentTimeMillis2 = System.currentTimeMillis();
                                if (!q0Var.f10240f) {
                                }
                                q0Var.f10239e = Long.valueOf(currentTimeMillis2);
                                q0Var.a(zVar);
                                G4 = c0167p.G();
                                Object obj82 = G4;
                                if (G4 == w11) {
                                }
                                B.a0 a0Var62 = (B.a0) obj82;
                                I0.t tVar42 = g4.f3032b;
                                a0Var62.f343b = tVar42;
                                Q q82 = q4;
                                a0Var62.f344c = q82.f9994t;
                                a0Var62.f345d = q82;
                                a0Var62.f346e.setValue(zVar);
                                a0Var62.f347f = (InterfaceC1095d0) c0167p3.k(AbstractC1101g0.f9352d);
                                a0Var62.f348g = (L0) c0167p3.k(AbstractC1101g0.f9363o);
                                a0Var62.f349h = (InterfaceC0553a) c0167p3.k(AbstractC1101g0.f9358j);
                                pVar2 = pVar;
                                a0Var62.f350i = pVar2;
                                boolean z132 = !z5;
                                a0Var62.f351j.setValue(Boolean.valueOf(z132));
                                a0Var62.f352k.setValue(Boolean.valueOf(z4));
                                G5 = c0167p.G();
                                if (G5 == w11) {
                                }
                                v2.c cVar2 = ((C0184y) G5).f2968d;
                                G6 = c0167p.G();
                                Object obj92 = G6;
                                if (G6 == w11) {
                                }
                                C1076c c1076c32 = (C1076c) obj92;
                                nVar = U.n.f4488a;
                                Z.h hVar52 = hVar2;
                                i12 = i10;
                                i13 = i12 & 7168;
                                boolean h102 = c0167p3.h(q82) | (i13 == 2048);
                                int i362 = i12 & 57344;
                                I0.A a122 = a3;
                                boolean h112 = h102 | (i362 == 16384) | c0167p3.h(a122);
                                int i372 = i9;
                                boolean z142 = h112 | (i372 == 4);
                                i14 = (i12 & 112) ^ 48;
                                if (i14 <= 32) {
                                    nVar2 = nVar;
                                    pVar3 = pVar2;
                                    z9 = true;
                                    h3 = z142 | z9 | c0167p3.h(tVar42) | c0167p3.h(cVar2) | c0167p3.h(c1076c32) | c0167p3.h(a0Var62);
                                    G7 = c0167p.G();
                                    if (h3) {
                                    }
                                    nVar3 = nVar2;
                                    c1076c = c1076c32;
                                    w2 = w11;
                                    pVar4 = pVar3;
                                    q0Var2 = q0Var;
                                    tVar = tVar42;
                                    a0Var = a0Var62;
                                    i15 = i12;
                                    q5 = q82;
                                    g3 = g4;
                                    i16 = i14;
                                    kVar2 = kVar;
                                    C1205s c1205s222 = new C1205s(q82, z4, z5, a122, zVar, mVar, tVar42, a0Var62, cVar2, c1076c);
                                    c0167p3.a0(c1205s222);
                                    G7 = c1205s222;
                                    a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar4), (InterfaceC0424c) G7), z4, kVar2);
                                    InterfaceC0142c0 N3222 = C0143d.N(Boolean.valueOf((z4 || z5) ? false : true), c0167p3);
                                    R1.y yVar222 = R1.y.f4171a;
                                    a0Var2 = a0Var;
                                    i17 = i16;
                                    f4 = c0167p3.f(N3222) | c0167p3.h(q5) | c0167p3.h(a122) | c0167p3.h(a0Var2) | ((i17 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                    G8 = c0167p.G();
                                    w3 = w2;
                                    if (f4) {
                                    }
                                    w4 = w3;
                                    qVar2 = a6;
                                    i18 = i17;
                                    a7 = a122;
                                    C1197j c1197j222 = new C1197j(q5, N3222, a122, a0Var2, mVar, null);
                                    c0167p3.a0(c1197j222);
                                    G8 = c1197j222;
                                    C0143d.e(c0167p3, (InterfaceC0426e) G8, yVar222);
                                    h4 = c0167p3.h(q5);
                                    Object G20222 = c0167p.G();
                                    w5 = w4;
                                    if (h4) {
                                    }
                                    i19 = 1;
                                    C1204q c1204q222 = new C1204q(q5, i19);
                                    c0167p3.a0(c1204q222);
                                    obj2 = c1204q222;
                                    nVar4 = nVar3;
                                    a8 = n0.w.a(nVar4, 8675309, new B.D((InterfaceC0424c) obj2, null));
                                    int i38222 = (c0167p3.h(q5) ? 1 : 0) | (i362 != 16384 ? i19 : 0);
                                    if (i13 != 2048) {
                                    }
                                    tVar2 = tVar;
                                    i20 = i38222 | i39 | (c0167p3.h(tVar2) ? 1 : 0) | (c0167p3.h(a0Var2) ? 1 : 0);
                                    G9 = c0167p.G();
                                    if (i20 == 0) {
                                    }
                                    i21 = i18;
                                    i22 = 2048;
                                    i23 = i362;
                                    i24 = i13;
                                    qVar3 = a8;
                                    nVar5 = nVar4;
                                    w6 = w5;
                                    dVar2 = null;
                                    C1207u c1207u222 = new C1207u(q5, pVar4, z5, z4, a0Var2, tVar2);
                                    c0167p3.a0(c1207u222);
                                    G9 = c1207u222;
                                    if (!z4) {
                                    }
                                    B.Y y4222 = a0Var2.f362u;
                                    B.W w12222 = a0Var2.f361t;
                                    i25 = b5.i(new SuspendPointerInputElement(y4222, w12222, new C0024z(y4222, w12222, dVar2), 4)).i(new PointerHoverIconModifierElement(false));
                                    h5 = c0167p3.h(q5) | (i372 != 4) | c0167p3.h(tVar2);
                                    Object G21222 = c0167p.G();
                                    w7 = w6;
                                    if (h5) {
                                    }
                                    i26 = i22;
                                    R.h hVar6222 = new R.h(q5, zVar, tVar2, 13);
                                    c0167p3.a0(hVar6222);
                                    obj3 = hVar6222;
                                    U.q a13222 = androidx.compose.ui.draw.a.a((InterfaceC0424c) obj3);
                                    i27 = i24;
                                    u03 = u02;
                                    h6 = c0167p3.h(q5) | (i27 != i26) | c0167p3.f(u03) | c0167p3.h(a0Var2) | (i372 != 4) | c0167p3.h(tVar2);
                                    G10 = c0167p.G();
                                    if (h6) {
                                    }
                                    u04 = u03;
                                    qVar4 = i25;
                                    i28 = i27;
                                    i29 = i26;
                                    w8 = w7;
                                    C1206t c1206t222 = new C1206t(q5, z4, u04, a0Var2, zVar, tVar2);
                                    c0167p3.a0(c1206t222);
                                    G10 = c1206t222;
                                    U.n nVar7222 = nVar5;
                                    U.q d4222 = androidx.compose.ui.layout.a.d(nVar7222, (InterfaceC0424c) G10);
                                    I0.G g5222 = g3;
                                    boolean h12222 = c0167p3.h(g5222) | (i372 != 4) | (i28 != i29) | c0167p3.g(false) | (i23 != 16384) | c0167p3.h(q5) | c0167p3.h(tVar2) | c0167p3.h(a0Var2);
                                    i30 = i21;
                                    z10 = h12222 | ((i30 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                    G11 = c0167p.G();
                                    w9 = w8;
                                    if (z10) {
                                    }
                                    i31 = i30;
                                    a0Var3 = a0Var2;
                                    i32 = i372;
                                    qVar5 = qVar4;
                                    w10 = w9;
                                    C1209w c1209w222 = new C1209w(g5222, zVar, z4, z5, mVar, q5, tVar2, a0Var2, pVar4);
                                    c0167p3.a0(c1209w222);
                                    G11 = c1209w222;
                                    AtomicInteger atomicInteger222 = A0.k.f132a;
                                    AppendedSemanticsElement appendedSemanticsElement222 = new AppendedSemanticsElement((InterfaceC0424c) G11, true);
                                    if (z4) {
                                    }
                                    float f7222 = b0.f10057a;
                                    if (!z15) {
                                    }
                                    a0Var4 = a0Var3;
                                    h7 = c0167p3.h(a0Var4);
                                    Object G22222 = c0167p.G();
                                    Object obj10222 = G22222;
                                    if (!h7) {
                                    }
                                    C1198k c1198k222 = new C1198k(a0Var4, 0);
                                    c0167p3.a0(c1198k222);
                                    obj10222 = c1198k222;
                                    C0143d.c(a0Var4, (InterfaceC0424c) obj10222, c0167p3);
                                    I0.A a14222 = a7;
                                    int i40222 = i31;
                                    h8 = c0167p3.h(q5) | c0167p3.h(a14222) | (i32 != 4) | ((i40222 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                    G12 = c0167p.G();
                                    if (!h8) {
                                    }
                                    C0616a c0616a222 = new C0616a(q5, a14222, zVar, mVar, 4);
                                    c0167p3.a0(c0616a222);
                                    G12 = c0616a222;
                                    C0143d.c(mVar, (InterfaceC0424c) G12, c0167p3);
                                    z11 = true;
                                    I.W w13222 = w10;
                                    U.q b7222 = U.a.b(nVar7222, new e0(q5, a0Var4, zVar, z132, i3 != 1, tVar2, q0Var2, q5.f9994t, mVar.f3076e));
                                    boolean booleanValue222 = ((Boolean) N3222.getValue()).booleanValue();
                                    C1242f c1242f4222 = c1242f;
                                    h9 = c0167p3.h(q5) | ((i40222 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32) | c0167p3.h(c1242f4222);
                                    G13 = c0167p.G();
                                    if (!h9) {
                                    }
                                    C0214c c0214c222 = new C0214c(q5, pVar4, mVar, c1242f4222, 1);
                                    c0167p3.a0(c0214c222);
                                    G13 = c0214c222;
                                    U.q i41222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(qVar, c1242f4222, q5, a0Var4).i(androidx.compose.foundation.text.handwriting.a.a((InterfaceC0422a) G13, booleanValue222)).i(qVar2), new C0758d0(hVar52, 16, q5)), new C0758d0(q5, 15, a0Var4)).i(b7222);
                                    n0 n0Var3222 = n0Var;
                                    U.q d5222 = androidx.compose.ui.layout.a.d(U.a.b(i41222, new l0(n0Var3222, z4, kVar)).i(qVar5).i(appendedSemanticsElement222), new C1204q(q5, 0));
                                    if (z4) {
                                    }
                                    z11 = false;
                                    if (z11) {
                                    }
                                    d(d5222, a0Var4, Q.f.b(-374338080, new C1203p(interfaceC0427f, q5, k3, i4, i3, n0Var3222, zVar, rVar, b6, a13222, d4222, nVar6, c1076c, a0Var4, z11, z5, interfaceC0424c2, tVar2, bVar), c0167p), c0167p, 384);
                                }
                                nVar2 = nVar;
                                pVar3 = pVar2;
                                if ((i12 & 48) != 32) {
                                }
                                z9 = true;
                                h3 = z142 | z9 | c0167p3.h(tVar42) | c0167p3.h(cVar2) | c0167p3.h(c1076c32) | c0167p3.h(a0Var62);
                                G7 = c0167p.G();
                                if (h3) {
                                }
                                nVar3 = nVar2;
                                c1076c = c1076c32;
                                w2 = w11;
                                pVar4 = pVar3;
                                q0Var2 = q0Var;
                                tVar = tVar42;
                                a0Var = a0Var62;
                                i15 = i12;
                                q5 = q82;
                                g3 = g4;
                                i16 = i14;
                                kVar2 = kVar;
                                C1205s c1205s2222 = new C1205s(q82, z4, z5, a122, zVar, mVar, tVar42, a0Var62, cVar2, c1076c);
                                c0167p3.a0(c1205s2222);
                                G7 = c1205s2222;
                                a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar4), (InterfaceC0424c) G7), z4, kVar2);
                                InterfaceC0142c0 N32222 = C0143d.N(Boolean.valueOf((z4 || z5) ? false : true), c0167p3);
                                R1.y yVar2222 = R1.y.f4171a;
                                a0Var2 = a0Var;
                                i17 = i16;
                                f4 = c0167p3.f(N32222) | c0167p3.h(q5) | c0167p3.h(a122) | c0167p3.h(a0Var2) | ((i17 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                G8 = c0167p.G();
                                w3 = w2;
                                if (f4) {
                                }
                                w4 = w3;
                                qVar2 = a6;
                                i18 = i17;
                                a7 = a122;
                                C1197j c1197j2222 = new C1197j(q5, N32222, a122, a0Var2, mVar, null);
                                c0167p3.a0(c1197j2222);
                                G8 = c1197j2222;
                                C0143d.e(c0167p3, (InterfaceC0426e) G8, yVar2222);
                                h4 = c0167p3.h(q5);
                                Object G202222 = c0167p.G();
                                w5 = w4;
                                if (h4) {
                                }
                                i19 = 1;
                                C1204q c1204q2222 = new C1204q(q5, i19);
                                c0167p3.a0(c1204q2222);
                                obj2 = c1204q2222;
                                nVar4 = nVar3;
                                a8 = n0.w.a(nVar4, 8675309, new B.D((InterfaceC0424c) obj2, null));
                                int i382222 = (c0167p3.h(q5) ? 1 : 0) | (i362 != 16384 ? i19 : 0);
                                if (i13 != 2048) {
                                }
                                tVar2 = tVar;
                                i20 = i382222 | i39 | (c0167p3.h(tVar2) ? 1 : 0) | (c0167p3.h(a0Var2) ? 1 : 0);
                                G9 = c0167p.G();
                                if (i20 == 0) {
                                }
                                i21 = i18;
                                i22 = 2048;
                                i23 = i362;
                                i24 = i13;
                                qVar3 = a8;
                                nVar5 = nVar4;
                                w6 = w5;
                                dVar2 = null;
                                C1207u c1207u2222 = new C1207u(q5, pVar4, z5, z4, a0Var2, tVar2);
                                c0167p3.a0(c1207u2222);
                                G9 = c1207u2222;
                                if (!z4) {
                                }
                                B.Y y42222 = a0Var2.f362u;
                                B.W w122222 = a0Var2.f361t;
                                i25 = b5.i(new SuspendPointerInputElement(y42222, w122222, new C0024z(y42222, w122222, dVar2), 4)).i(new PointerHoverIconModifierElement(false));
                                h5 = c0167p3.h(q5) | (i372 != 4) | c0167p3.h(tVar2);
                                Object G212222 = c0167p.G();
                                w7 = w6;
                                if (h5) {
                                }
                                i26 = i22;
                                R.h hVar62222 = new R.h(q5, zVar, tVar2, 13);
                                c0167p3.a0(hVar62222);
                                obj3 = hVar62222;
                                U.q a132222 = androidx.compose.ui.draw.a.a((InterfaceC0424c) obj3);
                                i27 = i24;
                                u03 = u02;
                                h6 = c0167p3.h(q5) | (i27 != i26) | c0167p3.f(u03) | c0167p3.h(a0Var2) | (i372 != 4) | c0167p3.h(tVar2);
                                G10 = c0167p.G();
                                if (h6) {
                                }
                                u04 = u03;
                                qVar4 = i25;
                                i28 = i27;
                                i29 = i26;
                                w8 = w7;
                                C1206t c1206t2222 = new C1206t(q5, z4, u04, a0Var2, zVar, tVar2);
                                c0167p3.a0(c1206t2222);
                                G10 = c1206t2222;
                                U.n nVar72222 = nVar5;
                                U.q d42222 = androidx.compose.ui.layout.a.d(nVar72222, (InterfaceC0424c) G10);
                                I0.G g52222 = g3;
                                boolean h122222 = c0167p3.h(g52222) | (i372 != 4) | (i28 != i29) | c0167p3.g(false) | (i23 != 16384) | c0167p3.h(q5) | c0167p3.h(tVar2) | c0167p3.h(a0Var2);
                                i30 = i21;
                                z10 = h122222 | ((i30 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                G11 = c0167p.G();
                                w9 = w8;
                                if (z10) {
                                }
                                i31 = i30;
                                a0Var3 = a0Var2;
                                i32 = i372;
                                qVar5 = qVar4;
                                w10 = w9;
                                C1209w c1209w2222 = new C1209w(g52222, zVar, z4, z5, mVar, q5, tVar2, a0Var2, pVar4);
                                c0167p3.a0(c1209w2222);
                                G11 = c1209w2222;
                                AtomicInteger atomicInteger2222 = A0.k.f132a;
                                AppendedSemanticsElement appendedSemanticsElement2222 = new AppendedSemanticsElement((InterfaceC0424c) G11, true);
                                if (z4) {
                                }
                                float f72222 = b0.f10057a;
                                if (!z15) {
                                }
                                a0Var4 = a0Var3;
                                h7 = c0167p3.h(a0Var4);
                                Object G222222 = c0167p.G();
                                Object obj102222 = G222222;
                                if (!h7) {
                                }
                                C1198k c1198k2222 = new C1198k(a0Var4, 0);
                                c0167p3.a0(c1198k2222);
                                obj102222 = c1198k2222;
                                C0143d.c(a0Var4, (InterfaceC0424c) obj102222, c0167p3);
                                I0.A a142222 = a7;
                                int i402222 = i31;
                                h8 = c0167p3.h(q5) | c0167p3.h(a142222) | (i32 != 4) | ((i402222 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
                                G12 = c0167p.G();
                                if (!h8) {
                                }
                                C0616a c0616a2222 = new C0616a(q5, a142222, zVar, mVar, 4);
                                c0167p3.a0(c0616a2222);
                                G12 = c0616a2222;
                                C0143d.c(mVar, (InterfaceC0424c) G12, c0167p3);
                                z11 = true;
                                I.W w132222 = w10;
                                U.q b72222 = U.a.b(nVar72222, new e0(q5, a0Var4, zVar, z132, i3 != 1, tVar2, q0Var2, q5.f9994t, mVar.f3076e));
                                boolean booleanValue2222 = ((Boolean) N32222.getValue()).booleanValue();
                                C1242f c1242f42222 = c1242f;
                                h9 = c0167p3.h(q5) | ((i402222 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32) | c0167p3.h(c1242f42222);
                                G13 = c0167p.G();
                                if (!h9) {
                                }
                                C0214c c0214c2222 = new C0214c(q5, pVar4, mVar, c1242f42222, 1);
                                c0167p3.a0(c0214c2222);
                                G13 = c0214c2222;
                                U.q i412222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(qVar, c1242f42222, q5, a0Var4).i(androidx.compose.foundation.text.handwriting.a.a((InterfaceC0422a) G13, booleanValue2222)).i(qVar2), new C0758d0(hVar52, 16, q5)), new C0758d0(q5, 15, a0Var4)).i(b72222);
                                n0 n0Var32222 = n0Var;
                                U.q d52222 = androidx.compose.ui.layout.a.d(U.a.b(i412222, new l0(n0Var32222, z4, kVar)).i(qVar5).i(appendedSemanticsElement2222), new C1204q(q5, 0));
                                if (z4) {
                                }
                                z11 = false;
                                if (z11) {
                                }
                                d(d52222, a0Var4, Q.f.b(-374338080, new C1203p(interfaceC0427f, q5, k3, i4, i3, n0Var32222, zVar, rVar, b6, a132222, d42222, nVar6, c1076c, a0Var4, z11, z5, interfaceC0424c2, tVar2, bVar), c0167p), c0167p, 384);
                            }
                        } else {
                            uVar = uVar3;
                        }
                    } else {
                        bVar2 = bVar2;
                    }
                }
                dVar = dVar3;
            } else {
                dVar = dVar3;
                i11 = Integer.MAX_VALUE;
            }
            C0031g c0031g8 = c0031g2;
            c0031g3 = c0031g6;
            hVar2 = hVar4;
            bVar = bVar2;
            c0167p3 = c0167p2;
            y3 = new Y(c0031g8, k3, i11, 1, z3, 1, bVar, dVar, uVar);
            q3 = q7;
            if (q3.f9975a != y3) {
            }
            q3.f9975a = y3;
            f3 = q3.f9979e;
            C1256t c1256t22 = q3.f9978d;
            j5 = j4;
            boolean a112 = f2.j.a(j5, ((I0.j) c1256t22.f10467f).c());
            C0031g c0031g72 = c0031g3;
            a4 = f2.j.a(((I0.z) c1256t22.f10466e).f3097a, c0031g72);
            long j92 = zVar.f3098b;
            if (a4) {
            }
            z8 = false;
            if (j5 == null) {
            }
            if (z7) {
            }
            I0.j jVar222 = (I0.j) c1256t22.f10467f;
            jVar222.f3068d = -1;
            jVar222.f3069e = -1;
            a5 = I0.z.a(zVar, null, 0L, 3);
            I0.z zVar222 = (I0.z) c1256t22.f10466e;
            c1256t22.f10466e = a5;
            if (f3 != null) {
            }
            G3 = c0167p.G();
            Object obj722 = G3;
            if (G3 == w11) {
            }
            q0Var = (q0) obj722;
            long currentTimeMillis22 = System.currentTimeMillis();
            if (!q0Var.f10240f) {
            }
            q0Var.f10239e = Long.valueOf(currentTimeMillis22);
            q0Var.a(zVar);
            G4 = c0167p.G();
            Object obj822 = G4;
            if (G4 == w11) {
            }
            B.a0 a0Var622 = (B.a0) obj822;
            I0.t tVar422 = g4.f3032b;
            a0Var622.f343b = tVar422;
            Q q822 = q4;
            a0Var622.f344c = q822.f9994t;
            a0Var622.f345d = q822;
            a0Var622.f346e.setValue(zVar);
            a0Var622.f347f = (InterfaceC1095d0) c0167p3.k(AbstractC1101g0.f9352d);
            a0Var622.f348g = (L0) c0167p3.k(AbstractC1101g0.f9363o);
            a0Var622.f349h = (InterfaceC0553a) c0167p3.k(AbstractC1101g0.f9358j);
            pVar2 = pVar;
            a0Var622.f350i = pVar2;
            boolean z1322 = !z5;
            a0Var622.f351j.setValue(Boolean.valueOf(z1322));
            a0Var622.f352k.setValue(Boolean.valueOf(z4));
            G5 = c0167p.G();
            if (G5 == w11) {
            }
            v2.c cVar22 = ((C0184y) G5).f2968d;
            G6 = c0167p.G();
            Object obj922 = G6;
            if (G6 == w11) {
            }
            C1076c c1076c322 = (C1076c) obj922;
            nVar = U.n.f4488a;
            Z.h hVar522 = hVar2;
            i12 = i10;
            i13 = i12 & 7168;
            boolean h1022 = c0167p3.h(q822) | (i13 == 2048);
            int i3622 = i12 & 57344;
            I0.A a1222 = a3;
            boolean h1122 = h1022 | (i3622 == 16384) | c0167p3.h(a1222);
            int i3722 = i9;
            boolean z1422 = h1122 | (i3722 == 4);
            i14 = (i12 & 112) ^ 48;
            if (i14 <= 32) {
            }
            nVar2 = nVar;
            pVar3 = pVar2;
            if ((i12 & 48) != 32) {
            }
            z9 = true;
            h3 = z1422 | z9 | c0167p3.h(tVar422) | c0167p3.h(cVar22) | c0167p3.h(c1076c322) | c0167p3.h(a0Var622);
            G7 = c0167p.G();
            if (h3) {
            }
            nVar3 = nVar2;
            c1076c = c1076c322;
            w2 = w11;
            pVar4 = pVar3;
            q0Var2 = q0Var;
            tVar = tVar422;
            a0Var = a0Var622;
            i15 = i12;
            q5 = q822;
            g3 = g4;
            i16 = i14;
            kVar2 = kVar;
            C1205s c1205s22222 = new C1205s(q822, z4, z5, a1222, zVar, mVar, tVar422, a0Var622, cVar22, c1076c);
            c0167p3.a0(c1205s22222);
            G7 = c1205s22222;
            a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar4), (InterfaceC0424c) G7), z4, kVar2);
            InterfaceC0142c0 N322222 = C0143d.N(Boolean.valueOf((z4 || z5) ? false : true), c0167p3);
            R1.y yVar22222 = R1.y.f4171a;
            a0Var2 = a0Var;
            i17 = i16;
            f4 = c0167p3.f(N322222) | c0167p3.h(q5) | c0167p3.h(a1222) | c0167p3.h(a0Var2) | ((i17 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
            G8 = c0167p.G();
            w3 = w2;
            if (f4) {
            }
            w4 = w3;
            qVar2 = a6;
            i18 = i17;
            a7 = a1222;
            C1197j c1197j22222 = new C1197j(q5, N322222, a1222, a0Var2, mVar, null);
            c0167p3.a0(c1197j22222);
            G8 = c1197j22222;
            C0143d.e(c0167p3, (InterfaceC0426e) G8, yVar22222);
            h4 = c0167p3.h(q5);
            Object G2022222 = c0167p.G();
            w5 = w4;
            if (h4) {
            }
            i19 = 1;
            C1204q c1204q22222 = new C1204q(q5, i19);
            c0167p3.a0(c1204q22222);
            obj2 = c1204q22222;
            nVar4 = nVar3;
            a8 = n0.w.a(nVar4, 8675309, new B.D((InterfaceC0424c) obj2, null));
            int i3822222 = (c0167p3.h(q5) ? 1 : 0) | (i3622 != 16384 ? i19 : 0);
            if (i13 != 2048) {
            }
            tVar2 = tVar;
            i20 = i3822222 | i39 | (c0167p3.h(tVar2) ? 1 : 0) | (c0167p3.h(a0Var2) ? 1 : 0);
            G9 = c0167p.G();
            if (i20 == 0) {
            }
            i21 = i18;
            i22 = 2048;
            i23 = i3622;
            i24 = i13;
            qVar3 = a8;
            nVar5 = nVar4;
            w6 = w5;
            dVar2 = null;
            C1207u c1207u22222 = new C1207u(q5, pVar4, z5, z4, a0Var2, tVar2);
            c0167p3.a0(c1207u22222);
            G9 = c1207u22222;
            if (!z4) {
            }
            B.Y y422222 = a0Var2.f362u;
            B.W w1222222 = a0Var2.f361t;
            i25 = b5.i(new SuspendPointerInputElement(y422222, w1222222, new C0024z(y422222, w1222222, dVar2), 4)).i(new PointerHoverIconModifierElement(false));
            h5 = c0167p3.h(q5) | (i3722 != 4) | c0167p3.h(tVar2);
            Object G2122222 = c0167p.G();
            w7 = w6;
            if (h5) {
            }
            i26 = i22;
            R.h hVar622222 = new R.h(q5, zVar, tVar2, 13);
            c0167p3.a0(hVar622222);
            obj3 = hVar622222;
            U.q a1322222 = androidx.compose.ui.draw.a.a((InterfaceC0424c) obj3);
            i27 = i24;
            u03 = u02;
            h6 = c0167p3.h(q5) | (i27 != i26) | c0167p3.f(u03) | c0167p3.h(a0Var2) | (i3722 != 4) | c0167p3.h(tVar2);
            G10 = c0167p.G();
            if (h6) {
            }
            u04 = u03;
            qVar4 = i25;
            i28 = i27;
            i29 = i26;
            w8 = w7;
            C1206t c1206t22222 = new C1206t(q5, z4, u04, a0Var2, zVar, tVar2);
            c0167p3.a0(c1206t22222);
            G10 = c1206t22222;
            U.n nVar722222 = nVar5;
            U.q d422222 = androidx.compose.ui.layout.a.d(nVar722222, (InterfaceC0424c) G10);
            I0.G g522222 = g3;
            boolean h1222222 = c0167p3.h(g522222) | (i3722 != 4) | (i28 != i29) | c0167p3.g(false) | (i23 != 16384) | c0167p3.h(q5) | c0167p3.h(tVar2) | c0167p3.h(a0Var2);
            i30 = i21;
            z10 = h1222222 | ((i30 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
            G11 = c0167p.G();
            w9 = w8;
            if (z10) {
            }
            i31 = i30;
            a0Var3 = a0Var2;
            i32 = i3722;
            qVar5 = qVar4;
            w10 = w9;
            C1209w c1209w22222 = new C1209w(g522222, zVar, z4, z5, mVar, q5, tVar2, a0Var2, pVar4);
            c0167p3.a0(c1209w22222);
            G11 = c1209w22222;
            AtomicInteger atomicInteger22222 = A0.k.f132a;
            AppendedSemanticsElement appendedSemanticsElement22222 = new AppendedSemanticsElement((InterfaceC0424c) G11, true);
            if (z4) {
            }
            float f722222 = b0.f10057a;
            if (!z15) {
            }
            a0Var4 = a0Var3;
            h7 = c0167p3.h(a0Var4);
            Object G2222222 = c0167p.G();
            Object obj1022222 = G2222222;
            if (!h7) {
            }
            C1198k c1198k22222 = new C1198k(a0Var4, 0);
            c0167p3.a0(c1198k22222);
            obj1022222 = c1198k22222;
            C0143d.c(a0Var4, (InterfaceC0424c) obj1022222, c0167p3);
            I0.A a1422222 = a7;
            int i4022222 = i31;
            h8 = c0167p3.h(q5) | c0167p3.h(a1422222) | (i32 != 4) | ((i4022222 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32);
            G12 = c0167p.G();
            if (!h8) {
            }
            C0616a c0616a22222 = new C0616a(q5, a1422222, zVar, mVar, 4);
            c0167p3.a0(c0616a22222);
            G12 = c0616a22222;
            C0143d.c(mVar, (InterfaceC0424c) G12, c0167p3);
            z11 = true;
            I.W w1322222 = w10;
            U.q b722222 = U.a.b(nVar722222, new e0(q5, a0Var4, zVar, z1322, i3 != 1, tVar2, q0Var2, q5.f9994t, mVar.f3076e));
            boolean booleanValue22222 = ((Boolean) N322222.getValue()).booleanValue();
            C1242f c1242f422222 = c1242f;
            h9 = c0167p3.h(q5) | ((i4022222 <= 32 && c0167p3.f(mVar)) || (i15 & 48) == 32) | c0167p3.h(c1242f422222);
            G13 = c0167p.G();
            if (!h9) {
            }
            C0214c c0214c22222 = new C0214c(q5, pVar4, mVar, c1242f422222, 1);
            c0167p3.a0(c0214c22222);
            G13 = c0214c22222;
            U.q i4122222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(qVar, c1242f422222, q5, a0Var4).i(androidx.compose.foundation.text.handwriting.a.a((InterfaceC0422a) G13, booleanValue22222)).i(qVar2), new C0758d0(hVar522, 16, q5)), new C0758d0(q5, 15, a0Var4)).i(b722222);
            n0 n0Var322222 = n0Var;
            U.q d522222 = androidx.compose.ui.layout.a.d(U.a.b(i4122222, new l0(n0Var322222, z4, kVar)).i(qVar5).i(appendedSemanticsElement22222), new C1204q(q5, 0));
            if (z4) {
            }
            z11 = false;
            if (z11) {
            }
            d(d522222, a0Var4, Q.f.b(-374338080, new C1203p(interfaceC0427f, q5, k3, i4, i3, n0Var322222, zVar, rVar, b6, a1322222, d422222, nVar6, c1076c, a0Var4, z11, z5, interfaceC0424c2, tVar2, bVar), c0167p), c0167p, 384);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C1193f(zVar, interfaceC0424c, qVar, k3, rVar, interfaceC0424c2, kVar, abstractC0347p, z3, i3, i4, mVar, o3, z4, z5, interfaceC0427f, i5, i6);
        }
    }

    public static final void d(U.q qVar, B.a0 a0Var, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-20551815);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(a0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, true);
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, qVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            b(a0Var, aVar, c0167p, (i4 >> 3) & 126);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(qVar, a0Var, aVar, i3, 9);
        }
    }

    public static final void e(B.a0 a0Var, C0167p c0167p, int i3) {
        int i4;
        int i5 = 1;
        int i6 = 0;
        c0167p.S(-1436003720);
        int i7 = 6;
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(a0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            Q q3 = a0Var.f345d;
            if (q3 != null && ((Boolean) q3.f9989o.getValue()).booleanValue()) {
                Q q4 = a0Var.f345d;
                C0031g c0031g = q4 != null ? q4.f9975a.f10039a : null;
                if (c0031g != null && c0031g.f596a.length() > 0) {
                    c0167p.Q(-285446808);
                    boolean f3 = c0167p.f(a0Var);
                    Object G3 = c0167p.G();
                    Object obj = C0159l.f2829a;
                    if (f3 || G3 == obj) {
                        G3 = new B.W(a0Var, i6);
                        c0167p.a0(G3);
                    }
                    Z z3 = (Z) G3;
                    O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
                    I0.t tVar = a0Var.f343b;
                    long j3 = a0Var.j().f3098b;
                    int i8 = C0.J.f568c;
                    int b3 = tVar.b((int) (j3 >> 32));
                    Q q5 = a0Var.f345d;
                    p0 d3 = q5 != null ? q5.d() : null;
                    f2.j.c(d3);
                    C0.H h3 = d3.f10230a;
                    C0239d c2 = h3.c(O2.d.y(b3, 0, h3.f557a.f547a.f596a.length()));
                    long e3 = l0.c.e((bVar.J(b0.f10057a) / 2) + c2.f4724a, c2.f4727d);
                    boolean e4 = c0167p.e(e3);
                    Object G4 = c0167p.G();
                    if (e4 || G4 == obj) {
                        G4 = new C1210x(e3);
                        c0167p.a0(G4);
                    }
                    InterfaceC0013n interfaceC0013n = (InterfaceC0013n) G4;
                    U.n nVar = U.n.f4488a;
                    boolean h4 = c0167p.h(z3) | c0167p.h(a0Var);
                    Object G5 = c0167p.G();
                    if (h4 || G5 == obj) {
                        G5 = new C1184B(z3, a0Var, null);
                        c0167p.a0(G5);
                    }
                    U.q a3 = n0.w.a(nVar, z3, (InterfaceC0426e) G5);
                    boolean e5 = c0167p.e(e3);
                    Object G6 = c0167p.G();
                    if (e5 || G6 == obj) {
                        G6 = new C1189b(e3, i5);
                        c0167p.a0(G6);
                    }
                    AbstractC1191d.a(interfaceC0013n, A0.k.a(a3, (InterfaceC0424c) G6), 0L, c0167p, 0);
                    c0167p.p(false);
                }
            }
            c0167p.Q(-284257090);
            c0167p.p(false);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new R0.t(i3, i7, a0Var);
        }
    }

    public static final void f(B.a0 a0Var, boolean z3, C0167p c0167p, int i3) {
        int i4;
        p0 d3;
        c0167p.S(626339208);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(a0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.g(z3) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else if (z3) {
            c0167p.Q(-1286242594);
            Q q3 = a0Var.f345d;
            C0.H h3 = null;
            if (q3 != null && (d3 = q3.d()) != null) {
                C0.H h4 = d3.f10230a;
                Q q4 = a0Var.f345d;
                if (!(q4 != null ? q4.f9990p : true)) {
                    h3 = h4;
                }
            }
            if (h3 == null) {
                c0167p.Q(-1285984396);
            } else {
                c0167p.Q(-1285984395);
                if (C0.J.b(a0Var.j().f3098b)) {
                    c0167p.Q(-1679637798);
                    c0167p.p(false);
                } else {
                    c0167p.Q(-1680616096);
                    int b3 = a0Var.f343b.b((int) (a0Var.j().f3098b >> 32));
                    int b4 = a0Var.f343b.b((int) (a0Var.j().f3098b & 4294967295L));
                    N0.h a3 = h3.a(b3);
                    N0.h a4 = h3.a(Math.max(b4 - 1, 0));
                    Q q5 = a0Var.f345d;
                    if (q5 == null || !((Boolean) q5.f9987m.getValue()).booleanValue()) {
                        c0167p.Q(-1679975078);
                        c0167p.p(false);
                    } else {
                        c0167p.Q(-1680216289);
                        O2.d.i(true, a3, a0Var, c0167p, ((i4 << 6) & 896) | 6);
                        c0167p.p(false);
                    }
                    Q q6 = a0Var.f345d;
                    if (q6 == null || !((Boolean) q6.f9988n.getValue()).booleanValue()) {
                        c0167p.Q(-1679655654);
                        c0167p.p(false);
                    } else {
                        c0167p.Q(-1679895904);
                        O2.d.i(false, a4, a0Var, c0167p, ((i4 << 6) & 896) | 6);
                        c0167p.p(false);
                    }
                    c0167p.p(false);
                }
                Q q7 = a0Var.f345d;
                if (q7 != null) {
                    boolean a5 = f2.j.a(a0Var.f359r.f3097a.f596a, a0Var.j().f3097a.f596a);
                    C0156j0 c0156j0 = q7.f9986l;
                    if (!a5) {
                        c0156j0.setValue(Boolean.FALSE);
                    }
                    if (q7.b()) {
                        if (((Boolean) c0156j0.getValue()).booleanValue()) {
                            a0Var.o();
                        } else {
                            a0Var.k();
                        }
                    }
                }
            }
            c0167p.p(false);
            c0167p.p(false);
        } else {
            c0167p.Q(651305535);
            c0167p.p(false);
            a0Var.k();
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new c.h(a0Var, z3, i3);
        }
    }

    public static final void g(Q q3) {
        I0.F f3 = q3.f9979e;
        if (f3 != null) {
            q3.f9994t.n(I0.z.a((I0.z) q3.f9978d.f10466e, null, 0L, 3));
            I0.A a3 = f3.f3029a;
            AtomicReference atomicReference = a3.f3006b;
            while (true) {
                if (atomicReference.compareAndSet(f3, null)) {
                    a3.f3005a.e();
                    break;
                } else if (atomicReference.get() != f3) {
                    break;
                }
            }
        }
        q3.f9979e = null;
    }

    public static final C0239d h(O0.b bVar, int i3, I0.G g3, C0.H h3, boolean z3, int i4) {
        C0239d c2 = h3 != null ? h3.c(g3.f3032b.b(i3)) : C0239d.f4723e;
        int l3 = bVar.l(b0.f10057a);
        float f3 = c2.f4724a;
        return new C0239d(z3 ? (i4 - f3) - l3 : f3, c2.f4725b, z3 ? i4 - f3 : l3 + f3, c2.f4727d);
    }

    public static final boolean i(KeyEvent keyEvent, int i3) {
        return ((int) (l0.c.y(keyEvent) >> 32)) == i3;
    }

    public static final void j(I0.A a3, Q q3, I0.z zVar, I0.m mVar, I0.t tVar) {
        f2.u uVar = new f2.u();
        R.h hVar = new R.h(q3.f9978d, q3.f9994t, uVar, 14);
        I0.u uVar2 = a3.f3005a;
        uVar2.d(zVar, mVar, hVar, q3.f9995u);
        I0.F f3 = new I0.F(a3, uVar2);
        a3.f3006b.set(f3);
        uVar.f5832d = f3;
        q3.f9979e = f3;
        q(q3, zVar, tVar);
    }

    public static final int k(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static final I0.G l(B.r rVar, C0031g c0031g) {
        rVar.getClass();
        int length = c0031g.f596a.length();
        int length2 = c0031g.f596a.length();
        int min = Math.min(length, 100);
        for (int i3 = 0; i3 < min; i3++) {
            t(i3, length2, i3);
        }
        t(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i4 = 0; i4 < min2; i4++) {
            u(i4, length, i4);
        }
        u(length2, length, length2);
        return new I0.G(c0031g, new F.Z(c0031g.f596a.length(), c0031g.f596a.length()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m(String str, int i3) {
        m1.i iVar;
        int i4;
        Integer num = null;
        if (m1.i.c()) {
            iVar = m1.i.a();
        }
        iVar = null;
        if (iVar != null) {
            G1.m mVar = iVar.f6950e.f6940b;
            mVar.getClass();
            if (i3 < 0 || i3 >= str.length()) {
                i4 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    m1.v[] vVarArr = (m1.v[]) spanned.getSpans(i3, i3 + 1, m1.v.class);
                    if (vVarArr.length > 0) {
                        i4 = spanned.getSpanEnd(vVarArr[0]);
                    }
                }
                i4 = ((m1.p) mVar.t(str, Math.max(0, i3 - 16), Math.min(str.length(), i3 + 16), Integer.MAX_VALUE, true, new m1.p(i3))).f6964f;
            }
            Integer valueOf = Integer.valueOf(i4);
            if (i4 != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i3);
    }

    public static final int n(CharSequence charSequence, int i3) {
        int length = charSequence.length();
        while (i3 < length) {
            if (charSequence.charAt(i3) == '\n') {
                return i3;
            }
            i3++;
        }
        return charSequence.length();
    }

    public static final int o(CharSequence charSequence, int i3) {
        while (i3 > 0) {
            if (charSequence.charAt(i3 - 1) == '\n') {
                return i3;
            }
            i3--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int p(String str, int i3) {
        m1.i iVar;
        int i4;
        Integer num = null;
        if (m1.i.c()) {
            iVar = m1.i.a();
        }
        iVar = null;
        if (iVar != null) {
            int max = Math.max(0, i3 - 1);
            G1.m mVar = iVar.f6950e.f6940b;
            mVar.getClass();
            if (max < 0 || max >= str.length()) {
                i4 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    m1.v[] vVarArr = (m1.v[]) spanned.getSpans(max, max + 1, m1.v.class);
                    if (vVarArr.length > 0) {
                        i4 = spanned.getSpanStart(vVarArr[0]);
                    }
                }
                i4 = ((m1.p) mVar.t(str, Math.max(0, max - 16), Math.min(str.length(), max + 16), Integer.MAX_VALUE, true, new m1.p(max))).f6963e;
            }
            Integer valueOf = Integer.valueOf(i4);
            if (i4 != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i3);
    }

    public static final void q(Q q3, I0.z zVar, I0.t tVar) {
        S.i c2 = S.u.c();
        InterfaceC0424c f3 = c2 != null ? c2.f() : null;
        S.i d3 = S.u.d(c2);
        try {
            p0 d4 = q3.d();
            if (d4 == null) {
                return;
            }
            I0.F f4 = q3.f9979e;
            if (f4 == null) {
                return;
            }
            InterfaceC0919p c3 = q3.c();
            if (c3 == null) {
                return;
            }
            r(zVar, q3.f9975a, d4.f10230a, c3, f4, q3.b(), tVar);
        } finally {
            S.u.f(c2, d3, f3);
        }
    }

    public static void r(I0.z zVar, Y y3, C0.H h3, InterfaceC0919p interfaceC0919p, I0.F f3, boolean z3, I0.t tVar) {
        long a3;
        C0239d c0239d;
        if (z3) {
            int b3 = tVar.b(C0.J.d(zVar.f3098b));
            if (b3 < h3.f557a.f547a.f596a.length()) {
                c0239d = h3.b(b3);
            } else if (b3 != 0) {
                c0239d = h3.b(b3 - 1);
            } else {
                a3 = c0.a(y3.f10040b, y3.f10045g, y3.f10046h, c0.f10059a, 1);
                c0239d = new C0239d(0.0f, 0.0f, 1.0f, (int) (a3 & 4294967295L));
            }
            long N3 = interfaceC0919p.N(l0.c.e(c0239d.f4724a, c0239d.f4725b));
            C0239d g3 = O2.d.g(l0.c.e(C0238c.d(N3), C0238c.e(N3)), AbstractC0235a.e(c0239d.c(), c0239d.b()));
            if (f2.j.a((I0.F) f3.f3029a.f3006b.get(), f3)) {
                f3.f3030b.b(g3);
            }
        }
    }

    public static final void s(int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            if (i3 > i4) {
                throw new IllegalArgumentException(A.k.f(i3, i4, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i3 + " and maxLines " + i4 + " must be greater than zero").toString());
    }

    public static final void t(int i3, int i4, int i5) {
        if (i3 < 0 || i3 > i4) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i5);
            sb.append(" -> ");
            sb.append(i3);
            sb.append(" is not in range of transformed text [0, ");
            throw new IllegalStateException(A.k.j(sb, i4, ']').toString());
        }
    }

    public static final void u(int i3, int i4, int i5) {
        if (i3 < 0 || i3 > i4) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i5);
            sb.append(" -> ");
            sb.append(i3);
            sb.append(" is not in range of original text [0, ");
            throw new IllegalStateException(A.k.j(sb, i4, ']').toString());
        }
    }
}
