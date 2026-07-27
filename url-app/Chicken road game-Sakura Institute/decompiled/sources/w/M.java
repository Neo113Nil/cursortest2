package w;

import A.AbstractC0017m;
import A.C0005a;
import A.C0022s;
import A.C0028y;
import A.InterfaceC0019o;
import A0.C0033d;
import A0.C0036g;
import B1.C0097d;
import D.x1;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.C0233y;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import P0.C0261c;
import Q.AbstractC0274j;
import Z.AbstractC0319p;
import Z.InterfaceC0324v;
import a.AbstractC0345a;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import c.C0528h;
import h0.InterfaceC0646a;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.C0737c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0772a;
import l0.C0803a;
import n.AbstractC0864b;
import p.C0935k;
import p0.InterfaceC0945F;
import p0.InterfaceC0980p;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s.C1093I;
import s0.AbstractC1144g0;
import s0.C1157n;
import s0.InterfaceC1138d0;
import s0.L0;
import s0.M0;
import s0.V0;
import s0.W0;
import t.C1199c;
import w2.C1294c;
import y.C1316f;
import z2.C1405I;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final J f11037a = new J(1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0803a f11038b = new C0803a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final D.Z f11039c = new D.Z(0, 0);

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
    public static final void a(String str, S.o oVar, A0.L l4, Function1 function1, int i2, boolean z4, int i4, int i5, InterfaceC0324v interfaceC0324v, C0216p c0216p, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        int i12;
        int i13;
        InterfaceC0324v interfaceC0324v2;
        int i14;
        boolean z6;
        C0216p c0216p2;
        S.o h4;
        int i15;
        Function1 function12;
        int i16;
        boolean z7;
        c0216p.U(-1186827822);
        if ((i6 & 6) == 0) {
            i8 = (c0216p.f(str) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0216p.f(l4) ? 256 : 128;
        }
        int i17 = i7 & 8;
        if (i17 != 0) {
            i8 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i8 |= c0216p.h(function1) ? 2048 : 1024;
            i9 = i7 & 16;
            if (i9 == 0) {
                i8 |= 24576;
            } else if ((i6 & 24576) == 0) {
                i10 = i2;
                i8 |= c0216p.d(i10) ? 16384 : 8192;
                i11 = i7 & 32;
                if (i11 != 0) {
                    i8 |= 196608;
                } else if ((196608 & i6) == 0) {
                    z5 = z4;
                    i8 |= c0216p.g(z5) ? 131072 : 65536;
                    if ((1572864 & i6) == 0) {
                        i8 |= c0216p.d(i4) ? 1048576 : 524288;
                    }
                    i12 = i7 & 128;
                    if (i12 == 0) {
                        i8 |= 12582912;
                    } else if ((12582912 & i6) == 0) {
                        i13 = i5;
                        i8 |= c0216p.d(i13) ? 8388608 : 4194304;
                        if (((i8 | 100663296) & 38347923) == 38347922 || !c0216p.z()) {
                            interfaceC0324v2 = null;
                            Function1 function13 = i17 != 0 ? null : function1;
                            int i18 = i9 != 0 ? 1 : i10;
                            boolean z8 = i11 != 0 ? true : z5;
                            int i19 = i12 != 0 ? 1 : i13;
                            s(i19, i4);
                            if (c0216p.k(A.Q.f52a) != null) {
                                throw new ClassCastException();
                            }
                            c0216p.S(-1588686502);
                            c0216p.q(false);
                            if (function13 != null) {
                                c0216p.S(-1588564052);
                                h4 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, null, false, 131071).h(S.l.f3977a).h(new TextAnnotatedStringElement(new C0036g(str, null, 6), l4, (F0.d) c0216p.k(AbstractC1144g0.f10221i), function13, i18, z8, i4, i19, null));
                                c0216p.q(false);
                                i14 = i19;
                                c0216p2 = c0216p;
                                z6 = true;
                            } else {
                                c0216p.S(-1587866335);
                                i14 = i19;
                                z6 = true;
                                c0216p2 = c0216p;
                                h4 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, null, false, 131071).h(new TextStringSimpleElement(str, l4, (F0.d) c0216p.k(AbstractC1144g0.f10221i), i18, z8, i4, i14, null));
                                c0216p2.q(false);
                            }
                            C1255D c1255d = C1255D.f11018a;
                            int i20 = c0216p2.f2861P;
                            S.o d4 = S.a.d(c0216p2, h4);
                            InterfaceC0213n0 m4 = c0216p.m();
                            InterfaceC1070k.f9822h.getClass();
                            C1068i c1068i = C1069j.f9816b;
                            c0216p.W();
                            if (c0216p2.f2860O) {
                                c0216p2.l(c1068i);
                            } else {
                                c0216p.f0();
                            }
                            C0192d.R(c0216p2, c1255d, C1069j.f9820f);
                            C0192d.R(c0216p2, m4, C1069j.f9819e);
                            C0192d.R(c0216p2, d4, C1069j.f9818d);
                            C1067h c1067h = C1069j.f9821g;
                            if (c0216p2.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i20))) {
                                AbstractC0017m.r(i20, c0216p2, i20, c1067h);
                            }
                            c0216p2.q(z6);
                            i15 = i14;
                            function12 = function13;
                            i16 = i18;
                            z7 = z8;
                        } else {
                            c0216p.N();
                            function12 = function1;
                            interfaceC0324v2 = interfaceC0324v;
                            i16 = i10;
                            z7 = z5;
                            i15 = i13;
                        }
                        C0222s0 s4 = c0216p.s();
                        if (s4 != null) {
                            s4.f2903d = new C1268h(str, oVar, l4, function12, i16, z7, i4, i15, interfaceC0324v2, i6, i7);
                            return;
                        }
                        return;
                    }
                    i13 = i5;
                    if (((i8 | 100663296) & 38347923) == 38347922) {
                    }
                    interfaceC0324v2 = null;
                    if (i17 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    s(i19, i4);
                    if (c0216p.k(A.Q.f52a) != null) {
                    }
                }
                z5 = z4;
                if ((1572864 & i6) == 0) {
                }
                i12 = i7 & 128;
                if (i12 == 0) {
                }
                i13 = i5;
                if (((i8 | 100663296) & 38347923) == 38347922) {
                }
                interfaceC0324v2 = null;
                if (i17 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                s(i19, i4);
                if (c0216p.k(A.Q.f52a) != null) {
                }
            }
            i10 = i2;
            i11 = i7 & 32;
            if (i11 != 0) {
            }
            z5 = z4;
            if ((1572864 & i6) == 0) {
            }
            i12 = i7 & 128;
            if (i12 == 0) {
            }
            i13 = i5;
            if (((i8 | 100663296) & 38347923) == 38347922) {
            }
            interfaceC0324v2 = null;
            if (i17 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            s(i19, i4);
            if (c0216p.k(A.Q.f52a) != null) {
            }
        }
        i9 = i7 & 16;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i7 & 32;
        if (i11 != 0) {
        }
        z5 = z4;
        if ((1572864 & i6) == 0) {
        }
        i12 = i7 & 128;
        if (i12 == 0) {
        }
        i13 = i5;
        if (((i8 | 100663296) & 38347923) == 38347922) {
        }
        interfaceC0324v2 = null;
        if (i17 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        s(i19, i4);
        if (c0216p.k(A.Q.f52a) != null) {
        }
    }

    public static final void b(A.a0 a0Var, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1985516685);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(a0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            if (I3 == w4) {
                I3 = new n.o();
                c0216p.c0(I3);
            }
            n.o oVar = (n.o) I3;
            Object I4 = c0216p.I();
            if (I4 == w4) {
                I4 = new C1093I(6, oVar);
                c0216p.c0(I4);
            }
            AbstractC0864b.c(oVar, (Function0) I4, new C0028y(a0Var, 1, oVar), null, a0Var.h(), aVar, c0216p, ((i4 << 12) & 458752) | 54);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(a0Var, aVar, i2, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x04d6, code lost:
    
        if (r0 > ((r2 != null ? r2.longValue() : 0) + 5000)) goto L233;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0490 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0646 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0688 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0719 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0794 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0862 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x089e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0937 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0444  */
    /* JADX WARN: Type inference failed for: r0v140, types: [S.o] */
    /* JADX WARN: Type inference failed for: r0v151, types: [S.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(G0.y yVar, Function1 function1, S.o oVar, A0.L l4, C0022s c0022s, Function1 function12, C0935k c0935k, AbstractC0319p abstractC0319p, boolean z4, int i2, int i4, G0.m mVar, N n2, boolean z5, boolean z6, L2.c cVar, C0216p c0216p, int i5, int i6) {
        int i7;
        int i8;
        C0036g c0036g;
        m0 m0Var;
        A0.K k4;
        X.p pVar;
        C1316f c1316f;
        X.h hVar;
        V0 v02;
        G0.z zVar;
        int i9;
        C0036g c0036g2;
        long j4;
        m0 m0Var2;
        C0036g c0036g3;
        int i10;
        A0.K k5;
        G0.F f4;
        boolean z7;
        C0216p c0216p2;
        M0.b bVar;
        F0.d dVar;
        M0.b bVar2;
        C0036g c0036g4;
        X.h hVar2;
        C0216p c0216p3;
        P p4;
        G0.E e4;
        A0.K k6;
        boolean a4;
        boolean z8;
        boolean z9;
        P p5;
        G0.y a5;
        Object I3;
        p0 p0Var;
        Object I4;
        Object I5;
        Object I6;
        S.l lVar;
        int i11;
        int i12;
        S.l lVar2;
        boolean z10;
        boolean h4;
        Object I7;
        S.l lVar3;
        C1199c c1199c;
        X.p pVar2;
        G0.s sVar;
        p0 p0Var2;
        G0.F f5;
        A.a0 a0Var;
        int i13;
        G.W w4;
        P p6;
        int i14;
        C0935k c0935k2;
        S.o a6;
        A.a0 a0Var2;
        int i15;
        boolean f6;
        Object I8;
        G.W w5;
        G.W w6;
        S.o oVar2;
        int i16;
        G0.z zVar2;
        boolean h5;
        G.W w7;
        int i17;
        Object obj;
        S.l lVar4;
        S.o a7;
        G0.s sVar2;
        int i18;
        Object I9;
        int i19;
        int i20;
        int i21;
        int i22;
        S.o oVar3;
        S.l lVar5;
        G.W w8;
        C2.a aVar;
        C1157n c1157n;
        S.o h6;
        boolean h7;
        G.W w9;
        int i23;
        Object obj2;
        S.l lVar6;
        int i24;
        V0 v03;
        boolean h8;
        Object I10;
        S.o oVar4;
        int i25;
        S.l lVar7;
        C1157n c1157n2;
        V0 v04;
        G.W w10;
        int i26;
        boolean h9;
        Object I11;
        int i27;
        S.o oVar5;
        A.a0 a0Var3;
        G0.s sVar3;
        AppendedSemanticsElement appendedSemanticsElement;
        boolean z11;
        C1157n c1157n3;
        S.l lVar8;
        A.a0 a0Var4;
        boolean h10;
        boolean z12;
        Object I12;
        AppendedSemanticsElement appendedSemanticsElement2;
        C1157n c1157n4;
        boolean z13;
        boolean h11;
        Object I13;
        S.l lVar9;
        c0216p.U(-958708118);
        if ((i5 & 6) == 0) {
            i7 = (c0216p.f(yVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0216p.h(function1) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c0216p.f(l4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= c0216p.f(c0022s) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= c0216p.h(function12) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= c0216p.f(c0935k) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= c0216p.f(abstractC0319p) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= c0216p.g(z4) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= c0216p.d(i2) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0216p.d(i4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0216p.f(mVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0216p.f(n2) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c0216p.g(z5) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= c0216p.g(z6) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i8 |= c0216p.h(cVar) ? 131072 : 65536;
        }
        int i28 = i8;
        if ((i7 & 306783379) == 306783378 && (74899 & i28) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i5 & 1) != 0 && !c0216p.y()) {
                c0216p.N();
            }
            c0216p.r();
            Object I14 = c0216p.I();
            G.W w11 = C0208l.f2826a;
            Object obj3 = I14;
            if (I14 == w11) {
                X.p pVar3 = new X.p();
                c0216p.c0(pVar3);
                obj3 = pVar3;
            }
            X.p pVar4 = (X.p) obj3;
            Object I15 = c0216p.I();
            Object obj4 = I15;
            if (I15 == w11) {
                y.x xVar = y.y.f11521a;
                C1316f c1316f2 = new C1316f();
                c0216p.c0(c1316f2);
                obj4 = c1316f2;
            }
            C1316f c1316f3 = (C1316f) obj4;
            Object I16 = c0216p.I();
            Object obj5 = I16;
            if (I16 == w11) {
                G0.z zVar3 = new G0.z(c1316f3);
                c0216p.c0(zVar3);
                obj5 = zVar3;
            }
            G0.z zVar4 = (G0.z) obj5;
            M0.b bVar3 = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
            F0.d dVar2 = (F0.d) c0216p.k(AbstractC1144g0.f10221i);
            long j5 = ((A.k0) c0216p.k(A.l0.f166a)).f161b;
            X.h hVar3 = (X.h) c0216p.k(AbstractC1144g0.f10219g);
            V0 v05 = (V0) c0216p.k(AbstractC1144g0.f10230r);
            L0 l02 = (L0) c0216p.k(AbstractC1144g0.f10226n);
            o.N n4 = (i2 == 1 && !z4 && mVar.f3068a) ? o.N.f8666e : o.N.f8665d;
            Object[] objArr = {n4};
            y.t tVar = m0.f11251f;
            boolean f7 = c0216p.f(n4);
            Object I17 = c0216p.I();
            Object obj6 = I17;
            if (f7 || I17 == w11) {
                C1093I c1093i = new C1093I(8, n4);
                c0216p.c0(c1093i);
                obj6 = c1093i;
            }
            m0 m0Var3 = (m0) u3.l.s0(objArr, tVar, (Function0) obj6, c0216p, 0, 4);
            int i29 = i7 & 14;
            boolean z14 = ((i7 & 57344) == 16384) | (i29 == 4);
            Object I18 = c0216p.I();
            A0.K k7 = yVar.f3095c;
            C0036g c0036g5 = yVar.f3093a;
            if (z14 || I18 == w11) {
                G0.F l5 = l(c0022s, c0036g5);
                if (k7 != null) {
                    G0.s sVar4 = l5.f3028b;
                    int i30 = A0.K.f300c;
                    c0036g = c0036g5;
                    m0Var = m0Var3;
                    long j6 = k7.f301a;
                    k4 = k7;
                    int b4 = sVar4.b((int) (j6 >> 32));
                    int b5 = sVar4.b((int) (j6 & 4294967295L));
                    int min = Math.min(b4, b5);
                    int max = Math.max(b4, b5);
                    C0033d c0033d = new C0033d(l5.f3027a);
                    c0033d.a(new A0.D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, L0.j.f3511c, null, 61439), min, max);
                    I18 = new G0.F(c0033d.c(), sVar4);
                } else {
                    c0036g = c0036g5;
                    m0Var = m0Var3;
                    k4 = k7;
                    I18 = l5;
                }
                c0216p.c0(I18);
            } else {
                c0036g = c0036g5;
                m0Var = m0Var3;
                k4 = k7;
            }
            G0.F f8 = (G0.F) I18;
            C0036g c0036g6 = f8.f3027a;
            C0222s0 x2 = c0216p.x();
            if (x2 == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            x2.f2900a |= 1;
            boolean f9 = c0216p.f(l02);
            Object I19 = c0216p.I();
            if (f9 || I19 == w11) {
                pVar = pVar4;
                c1316f = c1316f3;
                hVar = hVar3;
                v02 = v05;
                zVar = zVar4;
                i9 = i29;
                c0036g2 = c0036g;
                j4 = j5;
                m0Var2 = m0Var;
                c0036g3 = c0036g6;
                i10 = i28;
                k5 = k4;
                f4 = f8;
                z7 = z4;
                P p7 = new P(new X(c0036g6, l4, Integer.MAX_VALUE, 1, z4, 1, bVar3, dVar2, C1405I.f11931d), x2, l02);
                c0216p2 = c0216p;
                c0216p2.c0(p7);
                I19 = p7;
            } else {
                c0036g3 = c0036g6;
                f4 = f8;
                z7 = z4;
                i9 = i29;
                i10 = i28;
                m0Var2 = m0Var;
                c0036g2 = c0036g;
                k5 = k4;
                pVar = pVar4;
                c1316f = c1316f3;
                hVar = hVar3;
                v02 = v05;
                zVar = zVar4;
                j4 = j5;
                c0216p2 = c0216p;
            }
            P p8 = (P) I19;
            p8.f11072s = function1;
            p8.f11076w = j4;
            C0097d c0097d = p8.f11071r;
            c0097d.f988i = n2;
            X.h hVar4 = hVar;
            c0097d.f989j = hVar4;
            C0036g c0036g7 = c0036g2;
            p8.f11063j = c0036g7;
            X x3 = p8.f11054a;
            C1405I c1405i = C1405I.f11931d;
            C0036g c0036g8 = c0036g3;
            if (Intrinsics.a(x3.f11118a, c0036g8) && Intrinsics.a(x3.f11119b, l4) && x3.f11122e == z7 && u3.l.b0(x3.f11123f, 1) && x3.f11120c == Integer.MAX_VALUE && x3.f11121d == 1) {
                bVar = bVar3;
                if (Intrinsics.a(x3.f11124g, bVar) && Intrinsics.a(x3.f11126i, c1405i)) {
                    dVar = dVar2;
                    if (x3.f11125h == dVar) {
                        bVar2 = bVar;
                        hVar2 = hVar4;
                        c0216p3 = c0216p2;
                        c0036g4 = c0036g7;
                        p4 = p8;
                        if (p4.f11054a != x3) {
                            p4.f11069p = true;
                        }
                        p4.f11054a = x3;
                        e4 = p4.f11058e;
                        y.t tVar2 = p4.f11057d;
                        k6 = k5;
                        boolean a8 = Intrinsics.a(k6, ((G0.j) tVar2.f11495i).c());
                        C0036g c0036g9 = c0036g4;
                        a4 = Intrinsics.a(((G0.y) tVar2.f11494e).f3093a, c0036g9);
                        long j7 = yVar.f3094b;
                        if (!a4) {
                            tVar2.f11495i = new G0.j(c0036g9, j7);
                            z8 = true;
                        } else if (A0.K.a(((G0.y) tVar2.f11494e).f3094b, j7)) {
                            z8 = false;
                        } else {
                            ((G0.j) tVar2.f11495i).f(A0.K.e(j7), A0.K.d(j7));
                            z9 = true;
                            z8 = false;
                            if (k6 != null) {
                                G0.j jVar = (G0.j) tVar2.f11495i;
                                jVar.f3064d = -1;
                                jVar.f3065e = -1;
                                p5 = p4;
                            } else {
                                p5 = p4;
                                long j8 = k6.f301a;
                                if (!A0.K.b(j8)) {
                                    ((G0.j) tVar2.f11495i).e(A0.K.e(j8), A0.K.d(j8));
                                }
                            }
                            if (z8 && (z9 || a8)) {
                                a5 = yVar;
                            } else {
                                G0.j jVar2 = (G0.j) tVar2.f11495i;
                                jVar2.f3064d = -1;
                                jVar2.f3065e = -1;
                                a5 = G0.y.a(yVar, null, 0L, 3);
                            }
                            G0.y yVar2 = (G0.y) tVar2.f11494e;
                            tVar2.f11494e = a5;
                            if (e4 != null) {
                                e4.a(yVar2, a5);
                            }
                            I3 = c0216p.I();
                            Object obj7 = I3;
                            if (I3 == w11) {
                                p0 p0Var3 = new p0();
                                c0216p3.c0(p0Var3);
                                obj7 = p0Var3;
                            }
                            p0Var = (p0) obj7;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!p0Var.f11317f) {
                                Long l6 = p0Var.f11316e;
                            }
                            p0Var.f11316e = Long.valueOf(currentTimeMillis);
                            p0Var.a(yVar);
                            I4 = c0216p.I();
                            Object obj8 = I4;
                            if (I4 == w11) {
                                A.a0 a0Var5 = new A.a0(p0Var);
                                c0216p3.c0(a0Var5);
                                obj8 = a0Var5;
                            }
                            A.a0 a0Var6 = (A.a0) obj8;
                            G0.F f10 = f4;
                            G0.s sVar5 = f10.f3028b;
                            a0Var6.f85b = sVar5;
                            P p9 = p5;
                            a0Var6.f86c = p9.f11073t;
                            a0Var6.f87d = p9;
                            a0Var6.f88e.setValue(yVar);
                            a0Var6.f89f = (InterfaceC1138d0) c0216p3.k(AbstractC1144g0.f10216d);
                            a0Var6.f90g = (M0) c0216p3.k(AbstractC1144g0.f10227o);
                            a0Var6.f91h = (InterfaceC0646a) c0216p3.k(AbstractC1144g0.f10222j);
                            X.p pVar5 = pVar;
                            a0Var6.f92i = pVar5;
                            boolean z15 = !z6;
                            a0Var6.f93j.setValue(Boolean.valueOf(z15));
                            a0Var6.f94k.setValue(Boolean.valueOf(z5));
                            I5 = c0216p.I();
                            if (I5 == w11) {
                                C0233y c0233y = new C0233y(C0192d.z(kotlin.coroutines.i.f7498d, c0216p3));
                                c0216p3.c0(c0233y);
                                I5 = c0233y;
                            }
                            b3.c cVar2 = ((C0233y) I5).f2966d;
                            I6 = c0216p.I();
                            Object obj9 = I6;
                            if (I6 == w11) {
                                C1199c c1199c2 = new C1199c();
                                c0216p3.c0(c1199c2);
                                obj9 = c1199c2;
                            }
                            C1199c c1199c3 = (C1199c) obj9;
                            lVar = S.l.f3977a;
                            i11 = i10;
                            int i31 = i11 & 7168;
                            boolean h12 = c0216p3.h(p9) | (i31 != 2048);
                            int i32 = i11 & 57344;
                            G0.z zVar5 = zVar;
                            boolean h13 = h12 | (i32 != 16384) | c0216p3.h(zVar5);
                            int i33 = i9;
                            boolean z16 = h13 | (i33 != 4);
                            i12 = (i11 & 112) ^ 48;
                            if (i12 > 32 && c0216p3.f(mVar)) {
                                lVar2 = lVar;
                                z10 = true;
                                h4 = z10 | z16 | c0216p3.h(sVar5) | c0216p3.h(cVar2) | c0216p3.h(c1199c3) | c0216p3.h(a0Var6);
                                I7 = c0216p.I();
                                if (!h4 || I7 == w11) {
                                    lVar3 = lVar2;
                                    c1199c = c1199c3;
                                    pVar2 = pVar5;
                                    sVar = sVar5;
                                    p0Var2 = p0Var;
                                    f5 = f10;
                                    a0Var = a0Var6;
                                    i13 = i11;
                                    w4 = w11;
                                    p6 = p9;
                                    i14 = i12;
                                    c0935k2 = c0935k;
                                    C1278s c1278s = new C1278s(p9, z5, z6, zVar5, yVar, mVar, sVar, a0Var6, cVar2, c1199c);
                                    c0216p3.c0(c1278s);
                                    I7 = c1278s;
                                } else {
                                    pVar2 = pVar5;
                                    sVar = sVar5;
                                    p0Var2 = p0Var;
                                    f5 = f10;
                                    a0Var = a0Var6;
                                    i13 = i11;
                                    w4 = w11;
                                    i14 = i12;
                                    lVar3 = lVar2;
                                    c0935k2 = c0935k;
                                    c1199c = c1199c3;
                                    p6 = p9;
                                }
                                a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
                                InterfaceC0191c0 N3 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
                                Unit unit = Unit.f7487a;
                                a0Var2 = a0Var;
                                i15 = i14;
                                f6 = c0216p3.f(N3) | c0216p3.h(p6) | c0216p3.h(zVar5) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                                I8 = c0216p.I();
                                w5 = w4;
                                if (!f6 || I8 == w5) {
                                    w6 = w5;
                                    oVar2 = a6;
                                    i16 = i15;
                                    zVar2 = zVar5;
                                    C1270j c1270j = new C1270j(p6, N3, zVar5, a0Var2, mVar, null);
                                    c0216p3.c0(c1270j);
                                    I8 = c1270j;
                                } else {
                                    w6 = w5;
                                    oVar2 = a6;
                                    zVar2 = zVar5;
                                    i16 = i15;
                                }
                                C0192d.e(c0216p3, unit, (Function2) I8);
                                h5 = c0216p3.h(p6);
                                Object I20 = c0216p.I();
                                w7 = w6;
                                if (!h5 || I20 == w7) {
                                    i17 = 1;
                                    C1277q c1277q = new C1277q(p6, i17);
                                    c0216p3.c0(c1277q);
                                    obj = c1277q;
                                } else {
                                    i17 = 1;
                                    obj = I20;
                                }
                                lVar4 = lVar3;
                                a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
                                sVar2 = sVar;
                                i18 = (c0216p3.h(p6) ? 1 : 0) | (i32 == 16384 ? i17 : 0) | (i31 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
                                I9 = c0216p.I();
                                if (i18 == 0 || I9 == w7) {
                                    i19 = i16;
                                    i20 = 2048;
                                    i21 = i32;
                                    i22 = i31;
                                    oVar3 = a7;
                                    lVar5 = lVar4;
                                    w8 = w7;
                                    aVar = null;
                                    C1280u c1280u = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
                                    c0216p3.c0(c1280u);
                                    I9 = c1280u;
                                } else {
                                    i21 = i32;
                                    lVar5 = lVar4;
                                    w8 = w7;
                                    i19 = i16;
                                    i22 = i31;
                                    i20 = 2048;
                                    oVar3 = a7;
                                    aVar = null;
                                }
                                Function1 function13 = (Function1) I9;
                                c1157n = C1157n.f10272m;
                                S.o b6 = z5 ? S.a.b(oVar3, c1157n, new A.J(function13, c0935k2)) : oVar3;
                                C1294c c1294c = a0Var2.f104u;
                                A.X x4 = a0Var2.f103t;
                                h6 = b6.h(new SuspendPointerInputElement(c1294c, x4, new A.A(c1294c, x4, aVar), 4)).h(new PointerHoverIconModifierElement(false));
                                h7 = c0216p3.h(p6) | (i33 == 4) | c0216p3.h(sVar2);
                                Object I21 = c0216p.I();
                                w9 = w8;
                                if (!h7 || I21 == w9) {
                                    i23 = i20;
                                    P.h hVar5 = new P.h(p6, yVar, sVar2, 14);
                                    c0216p3.c0(hVar5);
                                    obj2 = hVar5;
                                } else {
                                    i23 = i20;
                                    obj2 = I21;
                                }
                                lVar6 = lVar5;
                                S.o a9 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
                                i24 = i22;
                                v03 = v02;
                                h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i33 == 4) | c0216p3.h(sVar2);
                                I10 = c0216p.I();
                                if (!h8 || I10 == w9) {
                                    oVar4 = h6;
                                    i25 = i24;
                                    lVar7 = lVar6;
                                    c1157n2 = c1157n;
                                    v04 = v03;
                                    w10 = w9;
                                    i26 = i33;
                                    C1279t c1279t = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
                                    c0216p3.c0(c1279t);
                                    I10 = c1279t;
                                } else {
                                    lVar7 = lVar6;
                                    i26 = i33;
                                    oVar4 = h6;
                                    c1157n2 = c1157n;
                                    v04 = v03;
                                    i25 = i24;
                                    w10 = w9;
                                }
                                S.o d4 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
                                G0.F f11 = f5;
                                int i34 = i19;
                                h9 = c0216p3.h(f11) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i34 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                                I11 = c0216p.I();
                                if (!h9 || I11 == w10) {
                                    i27 = i26;
                                    oVar5 = oVar4;
                                    a0Var3 = a0Var2;
                                    sVar3 = sVar2;
                                    C1282w c1282w = new C1282w(f11, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
                                    c0216p3.c0(c1282w);
                                    I11 = c1282w;
                                } else {
                                    a0Var3 = a0Var2;
                                    sVar3 = sVar2;
                                    i27 = i26;
                                    oVar5 = oVar4;
                                }
                                AtomicInteger atomicInteger = y0.k.f11579a;
                                appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
                                int i35 = i27;
                                z11 = !z5 && !z6 && ((W0) v04).a() && A0.K.b(((A0.K) p6.f11077x.getValue()).f301a) && A0.K.b(((A0.K) p6.f11078y.getValue()).f301a);
                                float f12 = a0.f11134a;
                                if (z11) {
                                    c1157n3 = c1157n2;
                                    lVar8 = S.a.b(lVar7, c1157n3, new C0737c(abstractC0319p, p6, yVar, sVar3, 1));
                                } else {
                                    c1157n3 = c1157n2;
                                    lVar8 = lVar7;
                                }
                                a0Var4 = a0Var3;
                                h10 = c0216p3.h(a0Var4);
                                Object I22 = c0216p.I();
                                Object obj10 = I22;
                                if (!h10 || I22 == w10) {
                                    C1271k c1271k = new C1271k(a0Var4, 0);
                                    c0216p3.c0(c1271k);
                                    obj10 = c1271k;
                                }
                                C0192d.d(a0Var4, (Function1) obj10, c0216p3);
                                G0.z zVar6 = zVar2;
                                boolean h14 = c0216p3.h(p6) | c0216p3.h(zVar6) | (i35 == 4);
                                G.W w12 = w10;
                                z12 = h14 | ((i34 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                                I12 = c0216p.I();
                                if (!z12 || I12 == w12) {
                                    appendedSemanticsElement2 = appendedSemanticsElement;
                                    c1157n4 = c1157n3;
                                    C0772a c0772a = new C0772a(p6, zVar6, yVar, mVar, 4);
                                    c0216p3.c0(c0772a);
                                    I12 = c0772a;
                                } else {
                                    appendedSemanticsElement2 = appendedSemanticsElement;
                                    c1157n4 = c1157n3;
                                }
                                C0192d.d(mVar, (Function1) I12, c0216p3);
                                z13 = true;
                                S.o b7 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z15, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
                                boolean booleanValue = ((Boolean) N3.getValue()).booleanValue();
                                C1316f c1316f4 = c1316f;
                                h11 = c0216p3.h(p6) | ((i34 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f4);
                                I13 = c0216p.I();
                                if (!h11 || I13 == w12) {
                                    C0261c c0261c = new C0261c(p6, pVar2, mVar, c1316f4, 1);
                                    c0216p3.c0(c0261c);
                                    I13 = c0261c;
                                }
                                S.o h15 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f4, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b7);
                                S.l lVar10 = lVar7;
                                m0 m0Var4 = m0Var2;
                                S.o d5 = androidx.compose.ui.layout.a.d(S.a.b(h15, c1157n4, new k0(m0Var4, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
                                if (z5 || !p6.b() || !((Boolean) p6.f11070q.getValue()).booleanValue() || !((W0) v04).a()) {
                                    z13 = false;
                                }
                                if (z13) {
                                    lVar9 = !m.a0.a() ? lVar10 : S.a.b(lVar10, c1157n4, new A.i0(0, a0Var4));
                                } else {
                                    lVar9 = lVar10;
                                }
                                d(d5, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var4, yVar, c0022s, lVar8, a9, d4, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
                            }
                            lVar2 = lVar;
                            if ((i11 & 48) != 32) {
                                z10 = false;
                                h4 = z10 | z16 | c0216p3.h(sVar5) | c0216p3.h(cVar2) | c0216p3.h(c1199c3) | c0216p3.h(a0Var6);
                                I7 = c0216p.I();
                                if (h4) {
                                }
                                lVar3 = lVar2;
                                c1199c = c1199c3;
                                pVar2 = pVar5;
                                sVar = sVar5;
                                p0Var2 = p0Var;
                                f5 = f10;
                                a0Var = a0Var6;
                                i13 = i11;
                                w4 = w11;
                                p6 = p9;
                                i14 = i12;
                                c0935k2 = c0935k;
                                C1278s c1278s2 = new C1278s(p9, z5, z6, zVar5, yVar, mVar, sVar, a0Var6, cVar2, c1199c);
                                c0216p3.c0(c1278s2);
                                I7 = c1278s2;
                                a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
                                InterfaceC0191c0 N32 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
                                Unit unit2 = Unit.f7487a;
                                a0Var2 = a0Var;
                                i15 = i14;
                                f6 = c0216p3.f(N32) | c0216p3.h(p6) | c0216p3.h(zVar5) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                                I8 = c0216p.I();
                                w5 = w4;
                                if (f6) {
                                }
                                w6 = w5;
                                oVar2 = a6;
                                i16 = i15;
                                zVar2 = zVar5;
                                C1270j c1270j2 = new C1270j(p6, N32, zVar5, a0Var2, mVar, null);
                                c0216p3.c0(c1270j2);
                                I8 = c1270j2;
                                C0192d.e(c0216p3, unit2, (Function2) I8);
                                h5 = c0216p3.h(p6);
                                Object I202 = c0216p.I();
                                w7 = w6;
                                if (h5) {
                                }
                                i17 = 1;
                                C1277q c1277q2 = new C1277q(p6, i17);
                                c0216p3.c0(c1277q2);
                                obj = c1277q2;
                                lVar4 = lVar3;
                                a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
                                sVar2 = sVar;
                                i18 = (c0216p3.h(p6) ? 1 : 0) | (i32 == 16384 ? i17 : 0) | (i31 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
                                I9 = c0216p.I();
                                if (i18 == 0) {
                                }
                                i19 = i16;
                                i20 = 2048;
                                i21 = i32;
                                i22 = i31;
                                oVar3 = a7;
                                lVar5 = lVar4;
                                w8 = w7;
                                aVar = null;
                                C1280u c1280u2 = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
                                c0216p3.c0(c1280u2);
                                I9 = c1280u2;
                                Function1 function132 = (Function1) I9;
                                c1157n = C1157n.f10272m;
                                if (z5) {
                                }
                                C1294c c1294c2 = a0Var2.f104u;
                                A.X x42 = a0Var2.f103t;
                                h6 = b6.h(new SuspendPointerInputElement(c1294c2, x42, new A.A(c1294c2, x42, aVar), 4)).h(new PointerHoverIconModifierElement(false));
                                h7 = c0216p3.h(p6) | (i33 == 4) | c0216p3.h(sVar2);
                                Object I212 = c0216p.I();
                                w9 = w8;
                                if (h7) {
                                }
                                i23 = i20;
                                P.h hVar52 = new P.h(p6, yVar, sVar2, 14);
                                c0216p3.c0(hVar52);
                                obj2 = hVar52;
                                lVar6 = lVar5;
                                S.o a92 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
                                i24 = i22;
                                v03 = v02;
                                h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i33 == 4) | c0216p3.h(sVar2);
                                I10 = c0216p.I();
                                if (h8) {
                                }
                                oVar4 = h6;
                                i25 = i24;
                                lVar7 = lVar6;
                                c1157n2 = c1157n;
                                v04 = v03;
                                w10 = w9;
                                i26 = i33;
                                C1279t c1279t2 = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
                                c0216p3.c0(c1279t2);
                                I10 = c1279t2;
                                S.o d42 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
                                G0.F f112 = f5;
                                int i342 = i19;
                                h9 = c0216p3.h(f112) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i342 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                                I11 = c0216p.I();
                                if (h9) {
                                }
                                i27 = i26;
                                oVar5 = oVar4;
                                a0Var3 = a0Var2;
                                sVar3 = sVar2;
                                C1282w c1282w2 = new C1282w(f112, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
                                c0216p3.c0(c1282w2);
                                I11 = c1282w2;
                                AtomicInteger atomicInteger2 = y0.k.f11579a;
                                appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
                                int i352 = i27;
                                if (z5) {
                                }
                                float f122 = a0.f11134a;
                                if (z11) {
                                }
                                a0Var4 = a0Var3;
                                h10 = c0216p3.h(a0Var4);
                                Object I222 = c0216p.I();
                                Object obj102 = I222;
                                if (!h10) {
                                }
                                C1271k c1271k2 = new C1271k(a0Var4, 0);
                                c0216p3.c0(c1271k2);
                                obj102 = c1271k2;
                                C0192d.d(a0Var4, (Function1) obj102, c0216p3);
                                G0.z zVar62 = zVar2;
                                boolean h142 = c0216p3.h(p6) | c0216p3.h(zVar62) | (i352 == 4);
                                G.W w122 = w10;
                                z12 = h142 | ((i342 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                                I12 = c0216p.I();
                                if (z12) {
                                }
                                appendedSemanticsElement2 = appendedSemanticsElement;
                                c1157n4 = c1157n3;
                                C0772a c0772a2 = new C0772a(p6, zVar62, yVar, mVar, 4);
                                c0216p3.c0(c0772a2);
                                I12 = c0772a2;
                                C0192d.d(mVar, (Function1) I12, c0216p3);
                                z13 = true;
                                S.o b72 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z15, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
                                boolean booleanValue2 = ((Boolean) N32.getValue()).booleanValue();
                                C1316f c1316f42 = c1316f;
                                h11 = c0216p3.h(p6) | ((i342 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f42);
                                I13 = c0216p.I();
                                if (!h11) {
                                }
                                C0261c c0261c2 = new C0261c(p6, pVar2, mVar, c1316f42, 1);
                                c0216p3.c0(c0261c2);
                                I13 = c0261c2;
                                S.o h152 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f42, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue2)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b72);
                                S.l lVar102 = lVar7;
                                m0 m0Var42 = m0Var2;
                                S.o d52 = androidx.compose.ui.layout.a.d(S.a.b(h152, c1157n4, new k0(m0Var42, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
                                if (z5) {
                                }
                                z13 = false;
                                if (z13) {
                                }
                                d(d52, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var42, yVar, c0022s, lVar8, a92, d42, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
                            }
                            z10 = true;
                            h4 = z10 | z16 | c0216p3.h(sVar5) | c0216p3.h(cVar2) | c0216p3.h(c1199c3) | c0216p3.h(a0Var6);
                            I7 = c0216p.I();
                            if (h4) {
                            }
                            lVar3 = lVar2;
                            c1199c = c1199c3;
                            pVar2 = pVar5;
                            sVar = sVar5;
                            p0Var2 = p0Var;
                            f5 = f10;
                            a0Var = a0Var6;
                            i13 = i11;
                            w4 = w11;
                            p6 = p9;
                            i14 = i12;
                            c0935k2 = c0935k;
                            C1278s c1278s22 = new C1278s(p9, z5, z6, zVar5, yVar, mVar, sVar, a0Var6, cVar2, c1199c);
                            c0216p3.c0(c1278s22);
                            I7 = c1278s22;
                            a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
                            InterfaceC0191c0 N322 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
                            Unit unit22 = Unit.f7487a;
                            a0Var2 = a0Var;
                            i15 = i14;
                            f6 = c0216p3.f(N322) | c0216p3.h(p6) | c0216p3.h(zVar5) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                            I8 = c0216p.I();
                            w5 = w4;
                            if (f6) {
                            }
                            w6 = w5;
                            oVar2 = a6;
                            i16 = i15;
                            zVar2 = zVar5;
                            C1270j c1270j22 = new C1270j(p6, N322, zVar5, a0Var2, mVar, null);
                            c0216p3.c0(c1270j22);
                            I8 = c1270j22;
                            C0192d.e(c0216p3, unit22, (Function2) I8);
                            h5 = c0216p3.h(p6);
                            Object I2022 = c0216p.I();
                            w7 = w6;
                            if (h5) {
                            }
                            i17 = 1;
                            C1277q c1277q22 = new C1277q(p6, i17);
                            c0216p3.c0(c1277q22);
                            obj = c1277q22;
                            lVar4 = lVar3;
                            a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
                            sVar2 = sVar;
                            i18 = (c0216p3.h(p6) ? 1 : 0) | (i32 == 16384 ? i17 : 0) | (i31 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
                            I9 = c0216p.I();
                            if (i18 == 0) {
                            }
                            i19 = i16;
                            i20 = 2048;
                            i21 = i32;
                            i22 = i31;
                            oVar3 = a7;
                            lVar5 = lVar4;
                            w8 = w7;
                            aVar = null;
                            C1280u c1280u22 = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
                            c0216p3.c0(c1280u22);
                            I9 = c1280u22;
                            Function1 function1322 = (Function1) I9;
                            c1157n = C1157n.f10272m;
                            if (z5) {
                            }
                            C1294c c1294c22 = a0Var2.f104u;
                            A.X x422 = a0Var2.f103t;
                            h6 = b6.h(new SuspendPointerInputElement(c1294c22, x422, new A.A(c1294c22, x422, aVar), 4)).h(new PointerHoverIconModifierElement(false));
                            h7 = c0216p3.h(p6) | (i33 == 4) | c0216p3.h(sVar2);
                            Object I2122 = c0216p.I();
                            w9 = w8;
                            if (h7) {
                            }
                            i23 = i20;
                            P.h hVar522 = new P.h(p6, yVar, sVar2, 14);
                            c0216p3.c0(hVar522);
                            obj2 = hVar522;
                            lVar6 = lVar5;
                            S.o a922 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
                            i24 = i22;
                            v03 = v02;
                            h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i33 == 4) | c0216p3.h(sVar2);
                            I10 = c0216p.I();
                            if (h8) {
                            }
                            oVar4 = h6;
                            i25 = i24;
                            lVar7 = lVar6;
                            c1157n2 = c1157n;
                            v04 = v03;
                            w10 = w9;
                            i26 = i33;
                            C1279t c1279t22 = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
                            c0216p3.c0(c1279t22);
                            I10 = c1279t22;
                            S.o d422 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
                            G0.F f1122 = f5;
                            int i3422 = i19;
                            h9 = c0216p3.h(f1122) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i3422 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                            I11 = c0216p.I();
                            if (h9) {
                            }
                            i27 = i26;
                            oVar5 = oVar4;
                            a0Var3 = a0Var2;
                            sVar3 = sVar2;
                            C1282w c1282w22 = new C1282w(f1122, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
                            c0216p3.c0(c1282w22);
                            I11 = c1282w22;
                            AtomicInteger atomicInteger22 = y0.k.f11579a;
                            appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
                            int i3522 = i27;
                            if (z5) {
                            }
                            float f1222 = a0.f11134a;
                            if (z11) {
                            }
                            a0Var4 = a0Var3;
                            h10 = c0216p3.h(a0Var4);
                            Object I2222 = c0216p.I();
                            Object obj1022 = I2222;
                            if (!h10) {
                            }
                            C1271k c1271k22 = new C1271k(a0Var4, 0);
                            c0216p3.c0(c1271k22);
                            obj1022 = c1271k22;
                            C0192d.d(a0Var4, (Function1) obj1022, c0216p3);
                            G0.z zVar622 = zVar2;
                            boolean h1422 = c0216p3.h(p6) | c0216p3.h(zVar622) | (i3522 == 4);
                            G.W w1222 = w10;
                            z12 = h1422 | ((i3422 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                            I12 = c0216p.I();
                            if (z12) {
                            }
                            appendedSemanticsElement2 = appendedSemanticsElement;
                            c1157n4 = c1157n3;
                            C0772a c0772a22 = new C0772a(p6, zVar622, yVar, mVar, 4);
                            c0216p3.c0(c0772a22);
                            I12 = c0772a22;
                            C0192d.d(mVar, (Function1) I12, c0216p3);
                            z13 = true;
                            S.o b722 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z15, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
                            boolean booleanValue22 = ((Boolean) N322.getValue()).booleanValue();
                            C1316f c1316f422 = c1316f;
                            h11 = c0216p3.h(p6) | ((i3422 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f422);
                            I13 = c0216p.I();
                            if (!h11) {
                            }
                            C0261c c0261c22 = new C0261c(p6, pVar2, mVar, c1316f422, 1);
                            c0216p3.c0(c0261c22);
                            I13 = c0261c22;
                            S.o h1522 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f422, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue22)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b722);
                            S.l lVar1022 = lVar7;
                            m0 m0Var422 = m0Var2;
                            S.o d522 = androidx.compose.ui.layout.a.d(S.a.b(h1522, c1157n4, new k0(m0Var422, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
                            if (z5) {
                            }
                            z13 = false;
                            if (z13) {
                            }
                            d(d522, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var422, yVar, c0022s, lVar8, a922, d422, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
                        }
                        z9 = false;
                        if (k6 != null) {
                        }
                        if (z8) {
                        }
                        G0.j jVar22 = (G0.j) tVar2.f11495i;
                        jVar22.f3064d = -1;
                        jVar22.f3065e = -1;
                        a5 = G0.y.a(yVar, null, 0L, 3);
                        G0.y yVar22 = (G0.y) tVar2.f11494e;
                        tVar2.f11494e = a5;
                        if (e4 != null) {
                        }
                        I3 = c0216p.I();
                        Object obj72 = I3;
                        if (I3 == w11) {
                        }
                        p0Var = (p0) obj72;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (!p0Var.f11317f) {
                        }
                        p0Var.f11316e = Long.valueOf(currentTimeMillis2);
                        p0Var.a(yVar);
                        I4 = c0216p.I();
                        Object obj82 = I4;
                        if (I4 == w11) {
                        }
                        A.a0 a0Var62 = (A.a0) obj82;
                        G0.F f102 = f4;
                        G0.s sVar52 = f102.f3028b;
                        a0Var62.f85b = sVar52;
                        P p92 = p5;
                        a0Var62.f86c = p92.f11073t;
                        a0Var62.f87d = p92;
                        a0Var62.f88e.setValue(yVar);
                        a0Var62.f89f = (InterfaceC1138d0) c0216p3.k(AbstractC1144g0.f10216d);
                        a0Var62.f90g = (M0) c0216p3.k(AbstractC1144g0.f10227o);
                        a0Var62.f91h = (InterfaceC0646a) c0216p3.k(AbstractC1144g0.f10222j);
                        X.p pVar52 = pVar;
                        a0Var62.f92i = pVar52;
                        boolean z152 = !z6;
                        a0Var62.f93j.setValue(Boolean.valueOf(z152));
                        a0Var62.f94k.setValue(Boolean.valueOf(z5));
                        I5 = c0216p.I();
                        if (I5 == w11) {
                        }
                        b3.c cVar22 = ((C0233y) I5).f2966d;
                        I6 = c0216p.I();
                        Object obj92 = I6;
                        if (I6 == w11) {
                        }
                        C1199c c1199c32 = (C1199c) obj92;
                        lVar = S.l.f3977a;
                        i11 = i10;
                        int i312 = i11 & 7168;
                        boolean h122 = c0216p3.h(p92) | (i312 != 2048);
                        int i322 = i11 & 57344;
                        G0.z zVar52 = zVar;
                        boolean h132 = h122 | (i322 != 16384) | c0216p3.h(zVar52);
                        int i332 = i9;
                        boolean z162 = h132 | (i332 != 4);
                        i12 = (i11 & 112) ^ 48;
                        if (i12 > 32) {
                            lVar2 = lVar;
                            z10 = true;
                            h4 = z10 | z162 | c0216p3.h(sVar52) | c0216p3.h(cVar22) | c0216p3.h(c1199c32) | c0216p3.h(a0Var62);
                            I7 = c0216p.I();
                            if (h4) {
                            }
                            lVar3 = lVar2;
                            c1199c = c1199c32;
                            pVar2 = pVar52;
                            sVar = sVar52;
                            p0Var2 = p0Var;
                            f5 = f102;
                            a0Var = a0Var62;
                            i13 = i11;
                            w4 = w11;
                            p6 = p92;
                            i14 = i12;
                            c0935k2 = c0935k;
                            C1278s c1278s222 = new C1278s(p92, z5, z6, zVar52, yVar, mVar, sVar, a0Var62, cVar22, c1199c);
                            c0216p3.c0(c1278s222);
                            I7 = c1278s222;
                            a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
                            InterfaceC0191c0 N3222 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
                            Unit unit222 = Unit.f7487a;
                            a0Var2 = a0Var;
                            i15 = i14;
                            f6 = c0216p3.f(N3222) | c0216p3.h(p6) | c0216p3.h(zVar52) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                            I8 = c0216p.I();
                            w5 = w4;
                            if (f6) {
                            }
                            w6 = w5;
                            oVar2 = a6;
                            i16 = i15;
                            zVar2 = zVar52;
                            C1270j c1270j222 = new C1270j(p6, N3222, zVar52, a0Var2, mVar, null);
                            c0216p3.c0(c1270j222);
                            I8 = c1270j222;
                            C0192d.e(c0216p3, unit222, (Function2) I8);
                            h5 = c0216p3.h(p6);
                            Object I20222 = c0216p.I();
                            w7 = w6;
                            if (h5) {
                            }
                            i17 = 1;
                            C1277q c1277q222 = new C1277q(p6, i17);
                            c0216p3.c0(c1277q222);
                            obj = c1277q222;
                            lVar4 = lVar3;
                            a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
                            sVar2 = sVar;
                            i18 = (c0216p3.h(p6) ? 1 : 0) | (i322 == 16384 ? i17 : 0) | (i312 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
                            I9 = c0216p.I();
                            if (i18 == 0) {
                            }
                            i19 = i16;
                            i20 = 2048;
                            i21 = i322;
                            i22 = i312;
                            oVar3 = a7;
                            lVar5 = lVar4;
                            w8 = w7;
                            aVar = null;
                            C1280u c1280u222 = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
                            c0216p3.c0(c1280u222);
                            I9 = c1280u222;
                            Function1 function13222 = (Function1) I9;
                            c1157n = C1157n.f10272m;
                            if (z5) {
                            }
                            C1294c c1294c222 = a0Var2.f104u;
                            A.X x4222 = a0Var2.f103t;
                            h6 = b6.h(new SuspendPointerInputElement(c1294c222, x4222, new A.A(c1294c222, x4222, aVar), 4)).h(new PointerHoverIconModifierElement(false));
                            h7 = c0216p3.h(p6) | (i332 == 4) | c0216p3.h(sVar2);
                            Object I21222 = c0216p.I();
                            w9 = w8;
                            if (h7) {
                            }
                            i23 = i20;
                            P.h hVar5222 = new P.h(p6, yVar, sVar2, 14);
                            c0216p3.c0(hVar5222);
                            obj2 = hVar5222;
                            lVar6 = lVar5;
                            S.o a9222 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
                            i24 = i22;
                            v03 = v02;
                            h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i332 == 4) | c0216p3.h(sVar2);
                            I10 = c0216p.I();
                            if (h8) {
                            }
                            oVar4 = h6;
                            i25 = i24;
                            lVar7 = lVar6;
                            c1157n2 = c1157n;
                            v04 = v03;
                            w10 = w9;
                            i26 = i332;
                            C1279t c1279t222 = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
                            c0216p3.c0(c1279t222);
                            I10 = c1279t222;
                            S.o d4222 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
                            G0.F f11222 = f5;
                            int i34222 = i19;
                            h9 = c0216p3.h(f11222) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i34222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                            I11 = c0216p.I();
                            if (h9) {
                            }
                            i27 = i26;
                            oVar5 = oVar4;
                            a0Var3 = a0Var2;
                            sVar3 = sVar2;
                            C1282w c1282w222 = new C1282w(f11222, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
                            c0216p3.c0(c1282w222);
                            I11 = c1282w222;
                            AtomicInteger atomicInteger222 = y0.k.f11579a;
                            appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
                            int i35222 = i27;
                            if (z5) {
                            }
                            float f12222 = a0.f11134a;
                            if (z11) {
                            }
                            a0Var4 = a0Var3;
                            h10 = c0216p3.h(a0Var4);
                            Object I22222 = c0216p.I();
                            Object obj10222 = I22222;
                            if (!h10) {
                            }
                            C1271k c1271k222 = new C1271k(a0Var4, 0);
                            c0216p3.c0(c1271k222);
                            obj10222 = c1271k222;
                            C0192d.d(a0Var4, (Function1) obj10222, c0216p3);
                            G0.z zVar6222 = zVar2;
                            boolean h14222 = c0216p3.h(p6) | c0216p3.h(zVar6222) | (i35222 == 4);
                            G.W w12222 = w10;
                            z12 = h14222 | ((i34222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                            I12 = c0216p.I();
                            if (z12) {
                            }
                            appendedSemanticsElement2 = appendedSemanticsElement;
                            c1157n4 = c1157n3;
                            C0772a c0772a222 = new C0772a(p6, zVar6222, yVar, mVar, 4);
                            c0216p3.c0(c0772a222);
                            I12 = c0772a222;
                            C0192d.d(mVar, (Function1) I12, c0216p3);
                            z13 = true;
                            S.o b7222 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z152, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
                            boolean booleanValue222 = ((Boolean) N3222.getValue()).booleanValue();
                            C1316f c1316f4222 = c1316f;
                            h11 = c0216p3.h(p6) | ((i34222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f4222);
                            I13 = c0216p.I();
                            if (!h11) {
                            }
                            C0261c c0261c222 = new C0261c(p6, pVar2, mVar, c1316f4222, 1);
                            c0216p3.c0(c0261c222);
                            I13 = c0261c222;
                            S.o h15222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f4222, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue222)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b7222);
                            S.l lVar10222 = lVar7;
                            m0 m0Var4222 = m0Var2;
                            S.o d5222 = androidx.compose.ui.layout.a.d(S.a.b(h15222, c1157n4, new k0(m0Var4222, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
                            if (z5) {
                            }
                            z13 = false;
                            if (z13) {
                            }
                            d(d5222, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var4222, yVar, c0022s, lVar8, a9222, d4222, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
                        }
                        lVar2 = lVar;
                        if ((i11 & 48) != 32) {
                        }
                        z10 = true;
                        h4 = z10 | z162 | c0216p3.h(sVar52) | c0216p3.h(cVar22) | c0216p3.h(c1199c32) | c0216p3.h(a0Var62);
                        I7 = c0216p.I();
                        if (h4) {
                        }
                        lVar3 = lVar2;
                        c1199c = c1199c32;
                        pVar2 = pVar52;
                        sVar = sVar52;
                        p0Var2 = p0Var;
                        f5 = f102;
                        a0Var = a0Var62;
                        i13 = i11;
                        w4 = w11;
                        p6 = p92;
                        i14 = i12;
                        c0935k2 = c0935k;
                        C1278s c1278s2222 = new C1278s(p92, z5, z6, zVar52, yVar, mVar, sVar, a0Var62, cVar22, c1199c);
                        c0216p3.c0(c1278s2222);
                        I7 = c1278s2222;
                        a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
                        InterfaceC0191c0 N32222 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
                        Unit unit2222 = Unit.f7487a;
                        a0Var2 = a0Var;
                        i15 = i14;
                        f6 = c0216p3.f(N32222) | c0216p3.h(p6) | c0216p3.h(zVar52) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                        I8 = c0216p.I();
                        w5 = w4;
                        if (f6) {
                        }
                        w6 = w5;
                        oVar2 = a6;
                        i16 = i15;
                        zVar2 = zVar52;
                        C1270j c1270j2222 = new C1270j(p6, N32222, zVar52, a0Var2, mVar, null);
                        c0216p3.c0(c1270j2222);
                        I8 = c1270j2222;
                        C0192d.e(c0216p3, unit2222, (Function2) I8);
                        h5 = c0216p3.h(p6);
                        Object I202222 = c0216p.I();
                        w7 = w6;
                        if (h5) {
                        }
                        i17 = 1;
                        C1277q c1277q2222 = new C1277q(p6, i17);
                        c0216p3.c0(c1277q2222);
                        obj = c1277q2222;
                        lVar4 = lVar3;
                        a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
                        sVar2 = sVar;
                        i18 = (c0216p3.h(p6) ? 1 : 0) | (i322 == 16384 ? i17 : 0) | (i312 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
                        I9 = c0216p.I();
                        if (i18 == 0) {
                        }
                        i19 = i16;
                        i20 = 2048;
                        i21 = i322;
                        i22 = i312;
                        oVar3 = a7;
                        lVar5 = lVar4;
                        w8 = w7;
                        aVar = null;
                        C1280u c1280u2222 = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
                        c0216p3.c0(c1280u2222);
                        I9 = c1280u2222;
                        Function1 function132222 = (Function1) I9;
                        c1157n = C1157n.f10272m;
                        if (z5) {
                        }
                        C1294c c1294c2222 = a0Var2.f104u;
                        A.X x42222 = a0Var2.f103t;
                        h6 = b6.h(new SuspendPointerInputElement(c1294c2222, x42222, new A.A(c1294c2222, x42222, aVar), 4)).h(new PointerHoverIconModifierElement(false));
                        h7 = c0216p3.h(p6) | (i332 == 4) | c0216p3.h(sVar2);
                        Object I212222 = c0216p.I();
                        w9 = w8;
                        if (h7) {
                        }
                        i23 = i20;
                        P.h hVar52222 = new P.h(p6, yVar, sVar2, 14);
                        c0216p3.c0(hVar52222);
                        obj2 = hVar52222;
                        lVar6 = lVar5;
                        S.o a92222 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
                        i24 = i22;
                        v03 = v02;
                        h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i332 == 4) | c0216p3.h(sVar2);
                        I10 = c0216p.I();
                        if (h8) {
                        }
                        oVar4 = h6;
                        i25 = i24;
                        lVar7 = lVar6;
                        c1157n2 = c1157n;
                        v04 = v03;
                        w10 = w9;
                        i26 = i332;
                        C1279t c1279t2222 = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
                        c0216p3.c0(c1279t2222);
                        I10 = c1279t2222;
                        S.o d42222 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
                        G0.F f112222 = f5;
                        int i342222 = i19;
                        h9 = c0216p3.h(f112222) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i342222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                        I11 = c0216p.I();
                        if (h9) {
                        }
                        i27 = i26;
                        oVar5 = oVar4;
                        a0Var3 = a0Var2;
                        sVar3 = sVar2;
                        C1282w c1282w2222 = new C1282w(f112222, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
                        c0216p3.c0(c1282w2222);
                        I11 = c1282w2222;
                        AtomicInteger atomicInteger2222 = y0.k.f11579a;
                        appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
                        int i352222 = i27;
                        if (z5) {
                        }
                        float f122222 = a0.f11134a;
                        if (z11) {
                        }
                        a0Var4 = a0Var3;
                        h10 = c0216p3.h(a0Var4);
                        Object I222222 = c0216p.I();
                        Object obj102222 = I222222;
                        if (!h10) {
                        }
                        C1271k c1271k2222 = new C1271k(a0Var4, 0);
                        c0216p3.c0(c1271k2222);
                        obj102222 = c1271k2222;
                        C0192d.d(a0Var4, (Function1) obj102222, c0216p3);
                        G0.z zVar62222 = zVar2;
                        boolean h142222 = c0216p3.h(p6) | c0216p3.h(zVar62222) | (i352222 == 4);
                        G.W w122222 = w10;
                        z12 = h142222 | ((i342222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                        I12 = c0216p.I();
                        if (z12) {
                        }
                        appendedSemanticsElement2 = appendedSemanticsElement;
                        c1157n4 = c1157n3;
                        C0772a c0772a2222 = new C0772a(p6, zVar62222, yVar, mVar, 4);
                        c0216p3.c0(c0772a2222);
                        I12 = c0772a2222;
                        C0192d.d(mVar, (Function1) I12, c0216p3);
                        z13 = true;
                        S.o b72222 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z152, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
                        boolean booleanValue2222 = ((Boolean) N32222.getValue()).booleanValue();
                        C1316f c1316f42222 = c1316f;
                        h11 = c0216p3.h(p6) | ((i342222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f42222);
                        I13 = c0216p.I();
                        if (!h11) {
                        }
                        C0261c c0261c2222 = new C0261c(p6, pVar2, mVar, c1316f42222, 1);
                        c0216p3.c0(c0261c2222);
                        I13 = c0261c2222;
                        S.o h152222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f42222, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue2222)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b72222);
                        S.l lVar102222 = lVar7;
                        m0 m0Var42222 = m0Var2;
                        S.o d52222 = androidx.compose.ui.layout.a.d(S.a.b(h152222, c1157n4, new k0(m0Var42222, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
                        if (z5) {
                        }
                        z13 = false;
                        if (z13) {
                        }
                        d(d52222, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var42222, yVar, c0022s, lVar8, a92222, d42222, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
                    }
                    bVar2 = bVar;
                    c0036g4 = c0036g7;
                    hVar2 = hVar4;
                    c0216p3 = c0216p2;
                    x3 = new X(c0036g8, l4, Integer.MAX_VALUE, 1, z4, 1, bVar2, dVar, c1405i);
                    p4 = p8;
                    if (p4.f11054a != x3) {
                    }
                    p4.f11054a = x3;
                    e4 = p4.f11058e;
                    y.t tVar22 = p4.f11057d;
                    k6 = k5;
                    boolean a82 = Intrinsics.a(k6, ((G0.j) tVar22.f11495i).c());
                    C0036g c0036g92 = c0036g4;
                    a4 = Intrinsics.a(((G0.y) tVar22.f11494e).f3093a, c0036g92);
                    long j72 = yVar.f3094b;
                    if (!a4) {
                    }
                    z9 = false;
                    if (k6 != null) {
                    }
                    if (z8) {
                    }
                    G0.j jVar222 = (G0.j) tVar22.f11495i;
                    jVar222.f3064d = -1;
                    jVar222.f3065e = -1;
                    a5 = G0.y.a(yVar, null, 0L, 3);
                    G0.y yVar222 = (G0.y) tVar22.f11494e;
                    tVar22.f11494e = a5;
                    if (e4 != null) {
                    }
                    I3 = c0216p.I();
                    Object obj722 = I3;
                    if (I3 == w11) {
                    }
                    p0Var = (p0) obj722;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (!p0Var.f11317f) {
                    }
                    p0Var.f11316e = Long.valueOf(currentTimeMillis22);
                    p0Var.a(yVar);
                    I4 = c0216p.I();
                    Object obj822 = I4;
                    if (I4 == w11) {
                    }
                    A.a0 a0Var622 = (A.a0) obj822;
                    G0.F f1022 = f4;
                    G0.s sVar522 = f1022.f3028b;
                    a0Var622.f85b = sVar522;
                    P p922 = p5;
                    a0Var622.f86c = p922.f11073t;
                    a0Var622.f87d = p922;
                    a0Var622.f88e.setValue(yVar);
                    a0Var622.f89f = (InterfaceC1138d0) c0216p3.k(AbstractC1144g0.f10216d);
                    a0Var622.f90g = (M0) c0216p3.k(AbstractC1144g0.f10227o);
                    a0Var622.f91h = (InterfaceC0646a) c0216p3.k(AbstractC1144g0.f10222j);
                    X.p pVar522 = pVar;
                    a0Var622.f92i = pVar522;
                    boolean z1522 = !z6;
                    a0Var622.f93j.setValue(Boolean.valueOf(z1522));
                    a0Var622.f94k.setValue(Boolean.valueOf(z5));
                    I5 = c0216p.I();
                    if (I5 == w11) {
                    }
                    b3.c cVar222 = ((C0233y) I5).f2966d;
                    I6 = c0216p.I();
                    Object obj922 = I6;
                    if (I6 == w11) {
                    }
                    C1199c c1199c322 = (C1199c) obj922;
                    lVar = S.l.f3977a;
                    i11 = i10;
                    int i3122 = i11 & 7168;
                    boolean h1222 = c0216p3.h(p922) | (i3122 != 2048);
                    int i3222 = i11 & 57344;
                    G0.z zVar522 = zVar;
                    boolean h1322 = h1222 | (i3222 != 16384) | c0216p3.h(zVar522);
                    int i3322 = i9;
                    boolean z1622 = h1322 | (i3322 != 4);
                    i12 = (i11 & 112) ^ 48;
                    if (i12 > 32) {
                    }
                    lVar2 = lVar;
                    if ((i11 & 48) != 32) {
                    }
                    z10 = true;
                    h4 = z10 | z1622 | c0216p3.h(sVar522) | c0216p3.h(cVar222) | c0216p3.h(c1199c322) | c0216p3.h(a0Var622);
                    I7 = c0216p.I();
                    if (h4) {
                    }
                    lVar3 = lVar2;
                    c1199c = c1199c322;
                    pVar2 = pVar522;
                    sVar = sVar522;
                    p0Var2 = p0Var;
                    f5 = f1022;
                    a0Var = a0Var622;
                    i13 = i11;
                    w4 = w11;
                    p6 = p922;
                    i14 = i12;
                    c0935k2 = c0935k;
                    C1278s c1278s22222 = new C1278s(p922, z5, z6, zVar522, yVar, mVar, sVar, a0Var622, cVar222, c1199c);
                    c0216p3.c0(c1278s22222);
                    I7 = c1278s22222;
                    a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
                    InterfaceC0191c0 N322222 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
                    Unit unit22222 = Unit.f7487a;
                    a0Var2 = a0Var;
                    i15 = i14;
                    f6 = c0216p3.f(N322222) | c0216p3.h(p6) | c0216p3.h(zVar522) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                    I8 = c0216p.I();
                    w5 = w4;
                    if (f6) {
                    }
                    w6 = w5;
                    oVar2 = a6;
                    i16 = i15;
                    zVar2 = zVar522;
                    C1270j c1270j22222 = new C1270j(p6, N322222, zVar522, a0Var2, mVar, null);
                    c0216p3.c0(c1270j22222);
                    I8 = c1270j22222;
                    C0192d.e(c0216p3, unit22222, (Function2) I8);
                    h5 = c0216p3.h(p6);
                    Object I2022222 = c0216p.I();
                    w7 = w6;
                    if (h5) {
                    }
                    i17 = 1;
                    C1277q c1277q22222 = new C1277q(p6, i17);
                    c0216p3.c0(c1277q22222);
                    obj = c1277q22222;
                    lVar4 = lVar3;
                    a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
                    sVar2 = sVar;
                    i18 = (c0216p3.h(p6) ? 1 : 0) | (i3222 == 16384 ? i17 : 0) | (i3122 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
                    I9 = c0216p.I();
                    if (i18 == 0) {
                    }
                    i19 = i16;
                    i20 = 2048;
                    i21 = i3222;
                    i22 = i3122;
                    oVar3 = a7;
                    lVar5 = lVar4;
                    w8 = w7;
                    aVar = null;
                    C1280u c1280u22222 = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
                    c0216p3.c0(c1280u22222);
                    I9 = c1280u22222;
                    Function1 function1322222 = (Function1) I9;
                    c1157n = C1157n.f10272m;
                    if (z5) {
                    }
                    C1294c c1294c22222 = a0Var2.f104u;
                    A.X x422222 = a0Var2.f103t;
                    h6 = b6.h(new SuspendPointerInputElement(c1294c22222, x422222, new A.A(c1294c22222, x422222, aVar), 4)).h(new PointerHoverIconModifierElement(false));
                    h7 = c0216p3.h(p6) | (i3322 == 4) | c0216p3.h(sVar2);
                    Object I2122222 = c0216p.I();
                    w9 = w8;
                    if (h7) {
                    }
                    i23 = i20;
                    P.h hVar522222 = new P.h(p6, yVar, sVar2, 14);
                    c0216p3.c0(hVar522222);
                    obj2 = hVar522222;
                    lVar6 = lVar5;
                    S.o a922222 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
                    i24 = i22;
                    v03 = v02;
                    h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i3322 == 4) | c0216p3.h(sVar2);
                    I10 = c0216p.I();
                    if (h8) {
                    }
                    oVar4 = h6;
                    i25 = i24;
                    lVar7 = lVar6;
                    c1157n2 = c1157n;
                    v04 = v03;
                    w10 = w9;
                    i26 = i3322;
                    C1279t c1279t22222 = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
                    c0216p3.c0(c1279t22222);
                    I10 = c1279t22222;
                    S.o d422222 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
                    G0.F f1122222 = f5;
                    int i3422222 = i19;
                    h9 = c0216p3.h(f1122222) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i3422222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                    I11 = c0216p.I();
                    if (h9) {
                    }
                    i27 = i26;
                    oVar5 = oVar4;
                    a0Var3 = a0Var2;
                    sVar3 = sVar2;
                    C1282w c1282w22222 = new C1282w(f1122222, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
                    c0216p3.c0(c1282w22222);
                    I11 = c1282w22222;
                    AtomicInteger atomicInteger22222 = y0.k.f11579a;
                    appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
                    int i3522222 = i27;
                    if (z5) {
                    }
                    float f1222222 = a0.f11134a;
                    if (z11) {
                    }
                    a0Var4 = a0Var3;
                    h10 = c0216p3.h(a0Var4);
                    Object I2222222 = c0216p.I();
                    Object obj1022222 = I2222222;
                    if (!h10) {
                    }
                    C1271k c1271k22222 = new C1271k(a0Var4, 0);
                    c0216p3.c0(c1271k22222);
                    obj1022222 = c1271k22222;
                    C0192d.d(a0Var4, (Function1) obj1022222, c0216p3);
                    G0.z zVar622222 = zVar2;
                    boolean h1422222 = c0216p3.h(p6) | c0216p3.h(zVar622222) | (i3522222 == 4);
                    G.W w1222222 = w10;
                    z12 = h1422222 | ((i3422222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
                    I12 = c0216p.I();
                    if (z12) {
                    }
                    appendedSemanticsElement2 = appendedSemanticsElement;
                    c1157n4 = c1157n3;
                    C0772a c0772a22222 = new C0772a(p6, zVar622222, yVar, mVar, 4);
                    c0216p3.c0(c0772a22222);
                    I12 = c0772a22222;
                    C0192d.d(mVar, (Function1) I12, c0216p3);
                    z13 = true;
                    S.o b722222 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z1522, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
                    boolean booleanValue22222 = ((Boolean) N322222.getValue()).booleanValue();
                    C1316f c1316f422222 = c1316f;
                    h11 = c0216p3.h(p6) | ((i3422222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f422222);
                    I13 = c0216p.I();
                    if (!h11) {
                    }
                    C0261c c0261c22222 = new C0261c(p6, pVar2, mVar, c1316f422222, 1);
                    c0216p3.c0(c0261c22222);
                    I13 = c0261c22222;
                    S.o h1522222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f422222, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue22222)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b722222);
                    S.l lVar1022222 = lVar7;
                    m0 m0Var422222 = m0Var2;
                    S.o d522222 = androidx.compose.ui.layout.a.d(S.a.b(h1522222, c1157n4, new k0(m0Var422222, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
                    if (z5) {
                    }
                    z13 = false;
                    if (z13) {
                    }
                    d(d522222, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var422222, yVar, c0022s, lVar8, a922222, d422222, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
                }
            } else {
                bVar = bVar3;
            }
            dVar = dVar2;
            bVar2 = bVar;
            c0036g4 = c0036g7;
            hVar2 = hVar4;
            c0216p3 = c0216p2;
            x3 = new X(c0036g8, l4, Integer.MAX_VALUE, 1, z4, 1, bVar2, dVar, c1405i);
            p4 = p8;
            if (p4.f11054a != x3) {
            }
            p4.f11054a = x3;
            e4 = p4.f11058e;
            y.t tVar222 = p4.f11057d;
            k6 = k5;
            boolean a822 = Intrinsics.a(k6, ((G0.j) tVar222.f11495i).c());
            C0036g c0036g922 = c0036g4;
            a4 = Intrinsics.a(((G0.y) tVar222.f11494e).f3093a, c0036g922);
            long j722 = yVar.f3094b;
            if (!a4) {
            }
            z9 = false;
            if (k6 != null) {
            }
            if (z8) {
            }
            G0.j jVar2222 = (G0.j) tVar222.f11495i;
            jVar2222.f3064d = -1;
            jVar2222.f3065e = -1;
            a5 = G0.y.a(yVar, null, 0L, 3);
            G0.y yVar2222 = (G0.y) tVar222.f11494e;
            tVar222.f11494e = a5;
            if (e4 != null) {
            }
            I3 = c0216p.I();
            Object obj7222 = I3;
            if (I3 == w11) {
            }
            p0Var = (p0) obj7222;
            long currentTimeMillis222 = System.currentTimeMillis();
            if (!p0Var.f11317f) {
            }
            p0Var.f11316e = Long.valueOf(currentTimeMillis222);
            p0Var.a(yVar);
            I4 = c0216p.I();
            Object obj8222 = I4;
            if (I4 == w11) {
            }
            A.a0 a0Var6222 = (A.a0) obj8222;
            G0.F f10222 = f4;
            G0.s sVar5222 = f10222.f3028b;
            a0Var6222.f85b = sVar5222;
            P p9222 = p5;
            a0Var6222.f86c = p9222.f11073t;
            a0Var6222.f87d = p9222;
            a0Var6222.f88e.setValue(yVar);
            a0Var6222.f89f = (InterfaceC1138d0) c0216p3.k(AbstractC1144g0.f10216d);
            a0Var6222.f90g = (M0) c0216p3.k(AbstractC1144g0.f10227o);
            a0Var6222.f91h = (InterfaceC0646a) c0216p3.k(AbstractC1144g0.f10222j);
            X.p pVar5222 = pVar;
            a0Var6222.f92i = pVar5222;
            boolean z15222 = !z6;
            a0Var6222.f93j.setValue(Boolean.valueOf(z15222));
            a0Var6222.f94k.setValue(Boolean.valueOf(z5));
            I5 = c0216p.I();
            if (I5 == w11) {
            }
            b3.c cVar2222 = ((C0233y) I5).f2966d;
            I6 = c0216p.I();
            Object obj9222 = I6;
            if (I6 == w11) {
            }
            C1199c c1199c3222 = (C1199c) obj9222;
            lVar = S.l.f3977a;
            i11 = i10;
            int i31222 = i11 & 7168;
            boolean h12222 = c0216p3.h(p9222) | (i31222 != 2048);
            int i32222 = i11 & 57344;
            G0.z zVar5222 = zVar;
            boolean h13222 = h12222 | (i32222 != 16384) | c0216p3.h(zVar5222);
            int i33222 = i9;
            boolean z16222 = h13222 | (i33222 != 4);
            i12 = (i11 & 112) ^ 48;
            if (i12 > 32) {
            }
            lVar2 = lVar;
            if ((i11 & 48) != 32) {
            }
            z10 = true;
            h4 = z10 | z16222 | c0216p3.h(sVar5222) | c0216p3.h(cVar2222) | c0216p3.h(c1199c3222) | c0216p3.h(a0Var6222);
            I7 = c0216p.I();
            if (h4) {
            }
            lVar3 = lVar2;
            c1199c = c1199c3222;
            pVar2 = pVar5222;
            sVar = sVar5222;
            p0Var2 = p0Var;
            f5 = f10222;
            a0Var = a0Var6222;
            i13 = i11;
            w4 = w11;
            p6 = p9222;
            i14 = i12;
            c0935k2 = c0935k;
            C1278s c1278s222222 = new C1278s(p9222, z5, z6, zVar5222, yVar, mVar, sVar, a0Var6222, cVar2222, c1199c);
            c0216p3.c0(c1278s222222);
            I7 = c1278s222222;
            a6 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar2), (Function1) I7), z5, c0935k2);
            InterfaceC0191c0 N3222222 = C0192d.N(Boolean.valueOf((z5 || z6) ? false : true), c0216p3);
            Unit unit222222 = Unit.f7487a;
            a0Var2 = a0Var;
            i15 = i14;
            f6 = c0216p3.f(N3222222) | c0216p3.h(p6) | c0216p3.h(zVar5222) | c0216p3.h(a0Var2) | ((i15 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
            I8 = c0216p.I();
            w5 = w4;
            if (f6) {
            }
            w6 = w5;
            oVar2 = a6;
            i16 = i15;
            zVar2 = zVar5222;
            C1270j c1270j222222 = new C1270j(p6, N3222222, zVar5222, a0Var2, mVar, null);
            c0216p3.c0(c1270j222222);
            I8 = c1270j222222;
            C0192d.e(c0216p3, unit222222, (Function2) I8);
            h5 = c0216p3.h(p6);
            Object I20222222 = c0216p.I();
            w7 = w6;
            if (h5) {
            }
            i17 = 1;
            C1277q c1277q222222 = new C1277q(p6, i17);
            c0216p3.c0(c1277q222222);
            obj = c1277q222222;
            lVar4 = lVar3;
            a7 = l0.w.a(lVar4, 8675309, new A.E((Function1) obj, null));
            sVar2 = sVar;
            i18 = (c0216p3.h(p6) ? 1 : 0) | (i32222 == 16384 ? i17 : 0) | (i31222 == 2048 ? i17 : 0) | (c0216p3.h(sVar2) ? 1 : 0) | (c0216p3.h(a0Var2) ? 1 : 0);
            I9 = c0216p.I();
            if (i18 == 0) {
            }
            i19 = i16;
            i20 = 2048;
            i21 = i32222;
            i22 = i31222;
            oVar3 = a7;
            lVar5 = lVar4;
            w8 = w7;
            aVar = null;
            C1280u c1280u222222 = new C1280u(p6, pVar2, z6, z5, a0Var2, sVar2);
            c0216p3.c0(c1280u222222);
            I9 = c1280u222222;
            Function1 function13222222 = (Function1) I9;
            c1157n = C1157n.f10272m;
            if (z5) {
            }
            C1294c c1294c222222 = a0Var2.f104u;
            A.X x4222222 = a0Var2.f103t;
            h6 = b6.h(new SuspendPointerInputElement(c1294c222222, x4222222, new A.A(c1294c222222, x4222222, aVar), 4)).h(new PointerHoverIconModifierElement(false));
            h7 = c0216p3.h(p6) | (i33222 == 4) | c0216p3.h(sVar2);
            Object I21222222 = c0216p.I();
            w9 = w8;
            if (h7) {
            }
            i23 = i20;
            P.h hVar5222222 = new P.h(p6, yVar, sVar2, 14);
            c0216p3.c0(hVar5222222);
            obj2 = hVar5222222;
            lVar6 = lVar5;
            S.o a9222222 = androidx.compose.ui.draw.a.a(lVar6, (Function1) obj2);
            i24 = i22;
            v03 = v02;
            h8 = c0216p3.h(p6) | (i24 == i23) | c0216p3.f(v03) | c0216p3.h(a0Var2) | (i33222 == 4) | c0216p3.h(sVar2);
            I10 = c0216p.I();
            if (h8) {
            }
            oVar4 = h6;
            i25 = i24;
            lVar7 = lVar6;
            c1157n2 = c1157n;
            v04 = v03;
            w10 = w9;
            i26 = i33222;
            C1279t c1279t222222 = new C1279t(p6, z5, v03, a0Var2, yVar, sVar2);
            c0216p3.c0(c1279t222222);
            I10 = c1279t222222;
            S.o d4222222 = androidx.compose.ui.layout.a.d(lVar7, (Function1) I10);
            G0.F f11222222 = f5;
            int i34222222 = i19;
            h9 = c0216p3.h(f11222222) | (i26 == 4) | (i25 == 2048) | c0216p3.g(false) | (i21 == 16384) | c0216p3.h(p6) | c0216p3.h(sVar2) | c0216p3.h(a0Var2) | ((i34222222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
            I11 = c0216p.I();
            if (h9) {
            }
            i27 = i26;
            oVar5 = oVar4;
            a0Var3 = a0Var2;
            sVar3 = sVar2;
            C1282w c1282w222222 = new C1282w(f11222222, yVar, z5, z6, mVar, p6, sVar2, a0Var2, pVar2);
            c0216p3.c0(c1282w222222);
            I11 = c1282w222222;
            AtomicInteger atomicInteger222222 = y0.k.f11579a;
            appendedSemanticsElement = new AppendedSemanticsElement((Function1) I11, true);
            int i35222222 = i27;
            if (z5) {
            }
            float f12222222 = a0.f11134a;
            if (z11) {
            }
            a0Var4 = a0Var3;
            h10 = c0216p3.h(a0Var4);
            Object I22222222 = c0216p.I();
            Object obj10222222 = I22222222;
            if (!h10) {
            }
            C1271k c1271k222222 = new C1271k(a0Var4, 0);
            c0216p3.c0(c1271k222222);
            obj10222222 = c1271k222222;
            C0192d.d(a0Var4, (Function1) obj10222222, c0216p3);
            G0.z zVar6222222 = zVar2;
            boolean h14222222 = c0216p3.h(p6) | c0216p3.h(zVar6222222) | (i35222222 == 4);
            G.W w12222222 = w10;
            z12 = h14222222 | ((i34222222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32);
            I12 = c0216p.I();
            if (z12) {
            }
            appendedSemanticsElement2 = appendedSemanticsElement;
            c1157n4 = c1157n3;
            C0772a c0772a222222 = new C0772a(p6, zVar6222222, yVar, mVar, 4);
            c0216p3.c0(c0772a222222);
            I12 = c0772a222222;
            C0192d.d(mVar, (Function1) I12, c0216p3);
            z13 = true;
            S.o b7222222 = S.a.b(lVar7, c1157n4, new d0(p6, a0Var4, yVar, z15222, i2 == 1, sVar3, p0Var2, p6.f11073t, mVar.f3072e));
            boolean booleanValue222222 = ((Boolean) N3222222.getValue()).booleanValue();
            C1316f c1316f4222222 = c1316f;
            h11 = c0216p3.h(p6) | ((i34222222 <= 32 && c0216p3.f(mVar)) || (i13 & 48) == 32) | c0216p3.h(c1316f4222222);
            I13 = c0216p.I();
            if (!h11) {
            }
            C0261c c0261c222222 = new C0261c(p6, pVar2, mVar, c1316f4222222, 1);
            c0216p3.c0(c0261c222222);
            I13 = c0261c222222;
            S.o h15222222 = androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(oVar, c1316f4222222, p6, a0Var4).h(androidx.compose.foundation.text.handwriting.a.a((Function0) I13, booleanValue222222)).h(oVar2), new q.n0(hVar2, 13, p6)), new q.n0(p6, 12, a0Var4)).h(b7222222);
            S.l lVar10222222 = lVar7;
            m0 m0Var4222222 = m0Var2;
            S.o d5222222 = androidx.compose.ui.layout.a.d(S.a.b(h15222222, c1157n4, new k0(m0Var4222222, z5, c0935k)).h(oVar5).h(appendedSemanticsElement2), new C1277q(p6, 0));
            if (z5) {
            }
            z13 = false;
            if (z13) {
            }
            d(d5222222, a0Var4, O.f.b(-374338080, new C1276p(cVar, p6, l4, i4, i2, m0Var4222222, yVar, c0022s, lVar8, a9222222, d4222222, lVar9, c1199c, a0Var4, z13, z6, function12, sVar3, bVar2), c0216p), c0216p, 384);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1266f(yVar, function1, oVar, l4, c0022s, function12, c0935k, abstractC0319p, z4, i2, i4, mVar, n2, z5, z6, cVar, i5, i6);
        }
    }

    public static final void d(S.o oVar, A.a0 a0Var, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-20551815);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(a0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, true);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, oVar);
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
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            b(a0Var, aVar, c0216p, (i4 >> 3) & 126);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(oVar, a0Var, aVar, i2, 9);
        }
    }

    public static final void e(A.a0 a0Var, C0216p c0216p, int i2) {
        int i4;
        int i5 = 1;
        int i6 = 0;
        c0216p.U(-1436003720);
        int i7 = 6;
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(a0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            P p4 = a0Var.f87d;
            if (p4 != null && ((Boolean) p4.f11068o.getValue()).booleanValue()) {
                P p5 = a0Var.f87d;
                C0036g c0036g = p5 != null ? p5.f11054a.f11118a : null;
                if (c0036g != null && c0036g.f328a.length() > 0) {
                    c0216p.S(-285446808);
                    boolean f4 = c0216p.f(a0Var);
                    Object I3 = c0216p.I();
                    Object obj = C0208l.f2826a;
                    if (f4 || I3 == obj) {
                        I3 = new A.X(a0Var, i6);
                        c0216p.c0(I3);
                    }
                    Y y4 = (Y) I3;
                    M0.b bVar = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
                    G0.s sVar = a0Var.f85b;
                    long j4 = a0Var.j().f3094b;
                    int i8 = A0.K.f300c;
                    int b4 = sVar.b((int) (j4 >> 32));
                    P p6 = a0Var.f87d;
                    o0 d4 = p6 != null ? p6.d() : null;
                    Intrinsics.c(d4);
                    A0.I i9 = d4.f11290a;
                    Y.d c4 = i9.c(kotlin.ranges.b.e(b4, 0, i9.f289a.f279a.f328a.length()));
                    long c5 = AbstractC0345a.c((bVar.L(a0.f11134a) / 2) + c4.f4374a, c4.f4377d);
                    boolean e4 = c0216p.e(c5);
                    Object I4 = c0216p.I();
                    if (e4 || I4 == obj) {
                        I4 = new C1283x(c5);
                        c0216p.c0(I4);
                    }
                    InterfaceC0019o interfaceC0019o = (InterfaceC0019o) I4;
                    S.l lVar = S.l.f3977a;
                    boolean h4 = c0216p.h(y4) | c0216p.h(a0Var);
                    Object I5 = c0216p.I();
                    if (h4 || I5 == obj) {
                        I5 = new C1253B(y4, a0Var, null);
                        c0216p.c0(I5);
                    }
                    S.o a4 = l0.w.a(lVar, y4, (Function2) I5);
                    boolean e5 = c0216p.e(c5);
                    Object I6 = c0216p.I();
                    if (e5 || I6 == obj) {
                        I6 = new C1262b(c5, i5);
                        c0216p.c0(I6);
                    }
                    AbstractC1264d.a(interfaceC0019o, y0.k.a(a4, (Function1) I6), 0L, c0216p, 0);
                    c0216p.q(false);
                }
            }
            c0216p.S(-284257090);
            c0216p.q(false);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new P0.u(i2, i7, a0Var);
        }
    }

    public static final void f(A.a0 a0Var, boolean z4, C0216p c0216p, int i2) {
        int i4;
        o0 d4;
        c0216p.U(626339208);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(a0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.g(z4) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else if (z4) {
            c0216p.S(-1286242594);
            P p4 = a0Var.f87d;
            A0.I i5 = null;
            if (p4 != null && (d4 = p4.d()) != null) {
                A0.I i6 = d4.f11290a;
                P p5 = a0Var.f87d;
                if (!(p5 != null ? p5.f11069p : true)) {
                    i5 = i6;
                }
            }
            if (i5 == null) {
                c0216p.S(-1285984396);
            } else {
                c0216p.S(-1285984395);
                if (A0.K.b(a0Var.j().f3094b)) {
                    c0216p.S(-1679637798);
                    c0216p.q(false);
                } else {
                    c0216p.S(-1680616096);
                    int b4 = a0Var.f85b.b((int) (a0Var.j().f3094b >> 32));
                    int b5 = a0Var.f85b.b((int) (a0Var.j().f3094b & 4294967295L));
                    L0.h a4 = i5.a(b4);
                    L0.h a5 = i5.a(Math.max(b5 - 1, 0));
                    P p6 = a0Var.f87d;
                    if (p6 == null || !((Boolean) p6.f11066m.getValue()).booleanValue()) {
                        c0216p.S(-1679975078);
                        c0216p.q(false);
                    } else {
                        c0216p.S(-1680216289);
                        j0.c.i(true, a4, a0Var, c0216p, ((i4 << 6) & 896) | 6);
                        c0216p.q(false);
                    }
                    P p7 = a0Var.f87d;
                    if (p7 == null || !((Boolean) p7.f11067n.getValue()).booleanValue()) {
                        c0216p.S(-1679655654);
                        c0216p.q(false);
                    } else {
                        c0216p.S(-1679895904);
                        j0.c.i(false, a5, a0Var, c0216p, ((i4 << 6) & 896) | 6);
                        c0216p.q(false);
                    }
                    c0216p.q(false);
                }
                P p8 = a0Var.f87d;
                if (p8 != null) {
                    boolean a6 = Intrinsics.a(a0Var.f101r.f3093a.f328a, a0Var.j().f3093a.f328a);
                    C0205j0 c0205j0 = p8.f11065l;
                    if (!a6) {
                        c0205j0.setValue(Boolean.FALSE);
                    }
                    if (p8.b()) {
                        if (((Boolean) c0205j0.getValue()).booleanValue()) {
                            a0Var.o();
                        } else {
                            a0Var.k();
                        }
                    }
                    Unit unit = Unit.f7487a;
                }
            }
            c0216p.q(false);
            c0216p.q(false);
        } else {
            c0216p.S(651305535);
            c0216p.q(false);
            a0Var.k();
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0528h(a0Var, z4, i2);
        }
    }

    public static final void g(P p4) {
        G0.E e4 = p4.f11058e;
        if (e4 != null) {
            p4.f11073t.invoke(G0.y.a((G0.y) p4.f11057d.f11494e, null, 0L, 3));
            G0.z zVar = e4.f3025a;
            AtomicReference atomicReference = zVar.f3097b;
            while (true) {
                if (atomicReference.compareAndSet(e4, null)) {
                    zVar.f3096a.d();
                    break;
                } else if (atomicReference.get() != e4) {
                    break;
                }
            }
        }
        p4.f11058e = null;
    }

    public static final Y.d h(M0.b bVar, int i2, G0.F f4, A0.I i4, boolean z4, int i5) {
        Y.d c4 = i4 != null ? i4.c(f4.f3028b.b(i2)) : Y.d.f4373e;
        int l4 = bVar.l(a0.f11134a);
        float f5 = c4.f4374a;
        return new Y.d(z4 ? (i5 - f5) - l4 : f5, c4.f4375b, z4 ? i5 - f5 : l4 + f5, c4.f4377d);
    }

    public static final boolean i(KeyEvent keyEvent, int i2) {
        return ((int) (j0.c.A(keyEvent) >> 32)) == i2;
    }

    public static final void j(G0.z zVar, P p4, G0.y yVar, G0.m mVar, G0.s sVar) {
        M2.E e4 = new M2.E();
        P.h hVar = new P.h(p4.f11057d, p4.f11073t, e4, 15);
        G0.t tVar = zVar.f3096a;
        tVar.e(yVar, mVar, hVar, p4.f11074u);
        G0.E e5 = new G0.E(zVar, tVar);
        zVar.f3097b.set(e5);
        e4.f3580d = e5;
        p4.f11058e = e5;
        q(p4, yVar, sVar);
    }

    public static final int k(float f4) {
        return Math.round((float) Math.ceil(f4));
    }

    public static final G0.F l(C0022s c0022s, C0036g c0036g) {
        c0022s.getClass();
        int length = c0036g.f328a.length();
        int length2 = c0036g.f328a.length();
        int min = Math.min(length, 100);
        for (int i2 = 0; i2 < min; i2++) {
            t(i2, length2, i2);
        }
        t(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i4 = 0; i4 < min2; i4++) {
            u(i4, length, i4);
        }
        u(length2, length, length2);
        return new G0.F(c0036g, new D.Z(c0036g.f328a.length(), c0036g.f328a.length()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m(int i2, String str) {
        k1.h hVar;
        int i4;
        Integer num = null;
        if (k1.h.c()) {
            hVar = k1.h.a();
        }
        hVar = null;
        if (hVar != null) {
            C0097d c0097d = hVar.f7385e.f7377b;
            c0097d.getClass();
            if (i2 < 0 || i2 >= str.length()) {
                i4 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    k1.r[] rVarArr = (k1.r[]) spanned.getSpans(i2, i2 + 1, k1.r.class);
                    if (rVarArr.length > 0) {
                        i4 = spanned.getSpanEnd(rVarArr[0]);
                    }
                }
                i4 = ((k1.m) c0097d.A(str, Math.max(0, i2 - 16), Math.min(str.length(), i2 + 16), Integer.MAX_VALUE, true, new k1.m(i2))).f7396i;
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
        return characterInstance.following(i2);
    }

    public static final int n(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static final int o(CharSequence charSequence, int i2) {
        while (i2 > 0) {
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
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
    public static final int p(int i2, String str) {
        k1.h hVar;
        int i4;
        Integer num = null;
        if (k1.h.c()) {
            hVar = k1.h.a();
        }
        hVar = null;
        if (hVar != null) {
            int max = Math.max(0, i2 - 1);
            C0097d c0097d = hVar.f7385e.f7377b;
            c0097d.getClass();
            if (max < 0 || max >= str.length()) {
                i4 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    k1.r[] rVarArr = (k1.r[]) spanned.getSpans(max, max + 1, k1.r.class);
                    if (rVarArr.length > 0) {
                        i4 = spanned.getSpanStart(rVarArr[0]);
                    }
                }
                i4 = ((k1.m) c0097d.A(str, Math.max(0, max - 16), Math.min(str.length(), max + 16), Integer.MAX_VALUE, true, new k1.m(max))).f7395e;
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
        return characterInstance.preceding(i2);
    }

    public static final void q(P p4, G0.y yVar, G0.s sVar) {
        AbstractC0274j c4 = Q.w.c();
        Function1 f4 = c4 != null ? c4.f() : null;
        AbstractC0274j d4 = Q.w.d(c4);
        try {
            o0 d5 = p4.d();
            if (d5 == null) {
                return;
            }
            G0.E e4 = p4.f11058e;
            if (e4 == null) {
                return;
            }
            InterfaceC0980p c5 = p4.c();
            if (c5 == null) {
                return;
            }
            r(yVar, p4.f11054a, d5.f11290a, c5, e4, p4.b(), sVar);
            Unit unit = Unit.f7487a;
        } finally {
            Q.w.f(c4, d4, f4);
        }
    }

    public static void r(G0.y yVar, X x2, A0.I i2, InterfaceC0980p interfaceC0980p, G0.E e4, boolean z4, G0.s sVar) {
        long a4;
        Y.d dVar;
        if (z4) {
            int b4 = sVar.b(A0.K.d(yVar.f3094b));
            if (b4 < i2.f289a.f279a.f328a.length()) {
                dVar = i2.b(b4);
            } else if (b4 != 0) {
                dVar = i2.b(b4 - 1);
            } else {
                a4 = b0.a(x2.f11119b, x2.f11124g, x2.f11125h, b0.f11137a, 1);
                dVar = new Y.d(0.0f, 0.0f, 1.0f, (int) (a4 & 4294967295L));
            }
            long Q3 = interfaceC0980p.Q(AbstractC0345a.c(dVar.f4374a, dVar.f4375b));
            Y.d h4 = j0.c.h(AbstractC0345a.c(Y.c.d(Q3), Y.c.e(Q3)), u3.l.N(dVar.c(), dVar.b()));
            if (Intrinsics.a((G0.E) e4.f3025a.f3097b.get(), e4)) {
                e4.f3026b.a(h4);
            }
        }
    }

    public static final void s(int i2, int i4) {
        if (i2 > 0 && i4 > 0) {
            if (i2 > i4) {
                throw new IllegalArgumentException(r0.B.b(i2, i4, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i2 + " and maxLines " + i4 + " must be greater than zero").toString());
    }

    public static final void t(int i2, int i4, int i5) {
        if (i2 < 0 || i2 > i4) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i5);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of transformed text [0, ");
            throw new IllegalStateException(AbstractC0017m.l(sb, i4, ']').toString());
        }
    }

    public static final void u(int i2, int i4, int i5) {
        if (i2 < 0 || i2 > i4) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i5);
            sb.append(" -> ");
            sb.append(i2);
            sb.append(" is not in range of original text [0, ");
            throw new IllegalStateException(AbstractC0017m.l(sb, i4, ']').toString());
        }
    }
}
