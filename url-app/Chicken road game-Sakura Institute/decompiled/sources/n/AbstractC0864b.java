package n;

import A.AbstractC0017m;
import A.C0028y;
import A.f0;
import A0.G;
import A0.I;
import A1.B0;
import A1.C0050d;
import A1.y0;
import D.AbstractC0159p;
import D.C0157o0;
import D.C0182y;
import D.C0184z;
import D.L0;
import D.M;
import D.N1;
import D.S0;
import D.W0;
import D.x1;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import P0.u;
import Q.v;
import Z.C0323u;
import Z.K;
import Z.S;
import a.AbstractC0345a;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0475o;
import com.chicken.road.kedro.laqer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import l0.w;
import m.C0847u;
import n.AbstractC0864b;
import p0.InterfaceC0945F;
import p0.InterfaceC0980p;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1041t;
import q.a0;
import q0.C1055h;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.E;
import r0.InterfaceC1070k;
import r0.InterfaceC1072m;
import r0.n0;
import s0.AbstractC1169t0;
import s0.P0;
import s1.C1186b;
import s1.C1193i;
import v.AbstractC1234e;
import v.C1233d;
import v1.C1250g;
import v1.InterfaceC1249f;
import w.P;
import w.o0;
import z1.AbstractC1365I;
import z1.C1383i;
import z3.C1448f;
import z3.C1451i;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0864b {
    public static final boolean A(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.a(method, "GET") || Intrinsics.a(method, "HEAD")) ? false : true;
    }

    public static final void B(View view, InterfaceC1249f interfaceC1249f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC1249f);
    }

    public static final void C(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void D(String str) {
        throw new IllegalStateException(str);
    }

    public static final void E(String str) {
        throw new IllegalStateException(str);
    }

    public static final void a(final String text, final long j4, C0216p c0216p, final int i2) {
        int i4;
        Intrinsics.checkNotNullParameter(text, "text");
        c0216p.U(126750472);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.e(j4) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            float f4 = 8;
            S.o i5 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.b(u3.l.U(S.l.f3977a, AbstractC1234e.a(f4)), j4, K.f4461a), f4, 3);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, i5);
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
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            N1.b(text, null, AbstractC1365I.f11812m, u3.l.k0(11), null, F0.k.f2616k, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, (i4 & 14) | 200064, 0, 130962);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new Function2() { // from class: z1.j
                @Override // kotlin.jvm.functions.Function2
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int U3 = C0192d.U(i2 | 1);
                    AbstractC0864b.a(text, j4, (C0216p) obj, U3);
                    return Unit.f7487a;
                }
            };
        }
    }

    public static final void b(o oVar, Function0 function0, S.o oVar2, C0028y c0028y, C0216p c0216p, int i2) {
        int i4;
        S.o oVar3;
        c0216p.U(645832757);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i5 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= c0216p.h(c0028y) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar2;
        } else {
            S.l lVar = S.l.f3977a;
            n nVar = (n) oVar.f8540a.getValue();
            if (!(nVar instanceof m)) {
                C0222s0 s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C0863a(oVar, function0, lVar, c0028y, i2, 0);
                    return;
                }
                return;
            }
            boolean f4 = c0216p.f(nVar);
            Object I3 = c0216p.I();
            if (f4 || I3 == C0208l.f2826a) {
                I3 = new h(j0.c.L(((m) nVar).f8539a));
                c0216p.c0(I3);
            }
            r.c((h) I3, function0, lVar, c0028y, c0216p, i5 & 8176);
            oVar3 = lVar;
        }
        C0222s0 s5 = c0216p.s();
        if (s5 != null) {
            s5.f2903d = new C0863a(oVar, function0, oVar3, c0028y, i2, 1);
        }
    }

    public static final void c(o oVar, Function0 function0, C0028y c0028y, S.o oVar2, boolean z4, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        S.o oVar3;
        c0216p.U(-84584070);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(c0028y) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= c0216p.g(z4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= c0216p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar2;
        } else {
            S.l lVar = S.l.f3977a;
            S.o a4 = z4 ? w.a(lVar, g.f8515a, new e(oVar, null)) : lVar;
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, true);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, a4);
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
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            aVar.h(c0216p, Integer.valueOf((i5 >> 15) & 14));
            b(oVar, function0, null, c0028y, c0216p, (i5 & 126) | ((i5 << 3) & 7168));
            c0216p.q(true);
            oVar3 = lVar;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0157o0(oVar, function0, c0028y, oVar3, z4, aVar, i2);
        }
    }

    public static final void d(t1.p pVar, C0216p c0216p, int i2) {
        v vVar;
        c0216p.U(294589392);
        int i4 = 4;
        int i5 = (i2 & 6) == 0 ? (c0216p.f(pVar) ? 4 : 2) | i2 : i2;
        if ((i5 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            P.i Q3 = M1.a.Q(c0216p);
            InterfaceC0191c0 u4 = C0192d.u(pVar.b().f10531e, c0216p);
            List list = (List) u4.getValue();
            boolean booleanValue = ((Boolean) c0216p.k(AbstractC1169t0.f10391a)).booleanValue();
            boolean f4 = c0216p.f(list);
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            Object obj2 = I3;
            if (f4 || I3 == obj) {
                v vVar2 = new v();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (booleanValue ? true : ((C1193i) obj3).f10516n.f5496d.a(EnumC0475o.f5483j)) {
                        arrayList.add(obj3);
                    }
                }
                vVar2.addAll(arrayList);
                c0216p.c0(vVar2);
                obj2 = vVar2;
            }
            v vVar3 = (v) obj2;
            g(vVar3, (List) u4.getValue(), c0216p, 0);
            InterfaceC0191c0 u5 = C0192d.u(pVar.b().f10532f, c0216p);
            Object I4 = c0216p.I();
            if (I4 == obj) {
                I4 = new v();
                c0216p.c0(I4);
            }
            v vVar4 = (v) I4;
            c0216p.S(1361037007);
            ListIterator listIterator = vVar3.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                C1193i c1193i = (C1193i) bVar.next();
                s1.v vVar5 = c1193i.f10510e;
                Intrinsics.d(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                t1.o oVar = (t1.o) vVar5;
                boolean h4 = ((i5 & 14) == i4) | c0216p.h(c1193i);
                Object I5 = c0216p.I();
                if (h4 || I5 == obj) {
                    I5 = new f0(pVar, 14, c1193i);
                    c0216p.c0(I5);
                }
                AbstractC0345a.a((Function0) I5, oVar.f10677o, O.f.b(1129586364, new t1.k(c1193i, pVar, Q3, vVar4, oVar), c0216p), c0216p, 384);
                vVar4 = vVar4;
                i4 = 4;
            }
            v vVar6 = vVar4;
            c0216p.q(false);
            Set set = (Set) u5.getValue();
            boolean f5 = c0216p.f(u5) | ((i5 & 14) == 4);
            Object I6 = c0216p.I();
            if (f5 || I6 == obj) {
                vVar = vVar6;
                I6 = new t1.l(u5, pVar, vVar, null);
                c0216p.c0(I6);
            } else {
                vVar = vVar6;
            }
            C0192d.f(set, vVar, (Function2) I6, c0216p);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new u(i2, 5, pVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String title, String hint, String str, Function0 function0, C0216p c0216p, int i2, int i4) {
        int i5;
        String str2;
        int i6;
        Function0 function02;
        Function0 function03;
        S.l lVar;
        int i7;
        String str3;
        int i8;
        String str4;
        Function0 function04;
        C0222s0 s4;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        c0216p.U(-1024784349);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.f(title) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.f(hint) ? 32 : 16;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            str2 = str;
            i5 |= c0216p.f(str2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                function02 = function0;
                i5 |= c0216p.h(function02) ? 2048 : 1024;
                if ((i5 & 1171) == 1170 || !c0216p.z()) {
                    if (i9 != 0) {
                        str2 = null;
                    }
                    function03 = i6 != 0 ? null : function02;
                    lVar = S.l.f3977a;
                    S.o h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5082b, 32);
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9268d, S.b.f3964s, c0216p, 54);
                    i7 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, h4);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, a4, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (!c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                        AbstractC0017m.r(i7, c0216p, i7, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    N1.b("🌾", null, 0L, u3.l.k0(48), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3078, 0, 131062);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 12));
                    str3 = str2;
                    i8 = i5;
                    N1.b(title, null, AbstractC1365I.f11807h, u3.l.k0(22), null, F0.k.f2617l, F0.r.f2625c, 0L, null, new L0.i(3), 0L, 0, false, 0, 0, null, null, c0216p, (i5 & 14) | 200064, 0, 130450);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 8));
                    N1.b(hint, null, AbstractC1365I.f11806g, u3.l.k0(14), null, null, F0.r.f2624b, 0L, null, new L0.i(3), 0L, 0, false, 0, 0, null, null, c0216p, ((i8 >> 3) & 14) | 3456, 0, 130482);
                    c0216p.S(-705089361);
                    if (str3 != null && function03 != null) {
                        AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 20));
                        a0 a0Var = AbstractC0159p.f1957a;
                        W0.b(function03, null, false, null, AbstractC0159p.a(AbstractC1365I.f11805f, AbstractC1365I.f11801b, c0216p, 12), null, null, null, null, O.f.b(-1725121692, new B0(3, str3), c0216p), c0216p, ((i8 >> 9) & 14) | 805306368, 494);
                    }
                    c0216p.q(false);
                    c0216p.q(true);
                    str4 = str3;
                    function04 = function03;
                } else {
                    c0216p.N();
                    str4 = str2;
                    function04 = function02;
                }
                s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C1383i(title, hint, str4, function04, i2, i4);
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i5 & 1171) == 1170) {
            }
            if (i9 != 0) {
            }
            if (i6 != 0) {
            }
            lVar = S.l.f3977a;
            S.o h42 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5082b, 32);
            C1041t a42 = AbstractC1039r.a(AbstractC1031j.f9268d, S.b.f3964s, c0216p, 54);
            i7 = c0216p.f2861P;
            InterfaceC0213n0 m42 = c0216p.m();
            S.o d42 = S.a.d(c0216p, h42);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i2 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
            }
            C0192d.R(c0216p, a42, C1069j.f9820f);
            C0192d.R(c0216p, m42, C1069j.f9819e);
            C1067h c1067h2 = C1069j.f9821g;
            if (!c0216p.f2860O) {
            }
            AbstractC0017m.r(i7, c0216p, i7, c1067h2);
            C0192d.R(c0216p, d42, C1069j.f9818d);
            N1.b("🌾", null, 0L, u3.l.k0(48), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3078, 0, 131062);
            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 12));
            str3 = str2;
            i8 = i5;
            N1.b(title, null, AbstractC1365I.f11807h, u3.l.k0(22), null, F0.k.f2617l, F0.r.f2625c, 0L, null, new L0.i(3), 0L, 0, false, 0, 0, null, null, c0216p, (i5 & 14) | 200064, 0, 130450);
            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 8));
            N1.b(hint, null, AbstractC1365I.f11806g, u3.l.k0(14), null, null, F0.r.f2624b, 0L, null, new L0.i(3), 0L, 0, false, 0, 0, null, null, c0216p, ((i8 >> 3) & 14) | 3456, 0, 130482);
            c0216p.S(-705089361);
            if (str3 != null) {
                AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 20));
                a0 a0Var2 = AbstractC0159p.f1957a;
                W0.b(function03, null, false, null, AbstractC0159p.a(AbstractC1365I.f11805f, AbstractC1365I.f11801b, c0216p, 12), null, null, null, null, O.f.b(-1725121692, new B0(3, str3), c0216p), c0216p, ((i8 >> 9) & 14) | 805306368, 494);
            }
            c0216p.q(false);
            c0216p.q(true);
            str4 = str3;
            function04 = function03;
            s4 = c0216p.s();
            if (s4 != null) {
            }
        }
        str2 = str;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        function02 = function0;
        if ((i5 & 1171) == 1170) {
        }
        if (i9 != 0) {
        }
        if (i6 != 0) {
        }
        lVar = S.l.f3977a;
        S.o h422 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5082b, 32);
        C1041t a422 = AbstractC1039r.a(AbstractC1031j.f9268d, S.b.f3964s, c0216p, 54);
        i7 = c0216p.f2861P;
        InterfaceC0213n0 m422 = c0216p.m();
        S.o d422 = S.a.d(c0216p, h422);
        InterfaceC1070k.f9822h.getClass();
        C1068i c1068i22 = C1069j.f9816b;
        c0216p.W();
        if (c0216p.f2860O) {
        }
        C0192d.R(c0216p, a422, C1069j.f9820f);
        C0192d.R(c0216p, m422, C1069j.f9819e);
        C1067h c1067h22 = C1069j.f9821g;
        if (!c0216p.f2860O) {
        }
        AbstractC0017m.r(i7, c0216p, i7, c1067h22);
        C0192d.R(c0216p, d422, C1069j.f9818d);
        N1.b("🌾", null, 0L, u3.l.k0(48), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3078, 0, 131062);
        AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 12));
        str3 = str2;
        i8 = i5;
        N1.b(title, null, AbstractC1365I.f11807h, u3.l.k0(22), null, F0.k.f2617l, F0.r.f2625c, 0L, null, new L0.i(3), 0L, 0, false, 0, 0, null, null, c0216p, (i5 & 14) | 200064, 0, 130450);
        AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 8));
        N1.b(hint, null, AbstractC1365I.f11806g, u3.l.k0(14), null, null, F0.r.f2624b, 0L, null, new L0.i(3), 0L, 0, false, 0, 0, null, null, c0216p, ((i8 >> 3) & 14) | 3456, 0, 130482);
        c0216p.S(-705089361);
        if (str3 != null) {
        }
        c0216p.q(false);
        c0216p.q(true);
        str4 = str3;
        function04 = function03;
        s4 = c0216p.s();
        if (s4 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(S.o oVar, long j4, final O.a content, C0216p c0216p, final int i2, final int i4) {
        S.o oVar2;
        int i5;
        long j5;
        long b4;
        C0182y c0182y;
        final S.o oVar3;
        final long j6;
        C0222s0 s4;
        Intrinsics.checkNotNullParameter(content, "content");
        c0216p.U(508705882);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i2 | 6;
            oVar2 = oVar;
        } else if ((i2 & 6) == 0) {
            oVar2 = oVar;
            i5 = (c0216p.f(oVar2) ? 4 : 2) | i2;
        } else {
            oVar2 = oVar;
            i5 = i2;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            j5 = j4;
            i5 |= c0216p.e(j5) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i5 |= c0216p.h(content) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !c0216p.z()) {
                S.o oVar4 = i6 == 0 ? S.l.f3977a : oVar2;
                long j7 = i7 == 0 ? AbstractC1365I.f11801b : j5;
                C1233d a4 = AbstractC1234e.a(14);
                b4 = M.b(j7, c0216p);
                long j8 = C0323u.f4547g;
                long b5 = C0323u.b(0.38f, b4);
                D.K k4 = (D.K) c0216p.k(M.f1481a);
                c0182y = k4.f1369O;
                if (c0182y != null) {
                    float f4 = F.j.f2405a;
                    oVar3 = oVar4;
                    c0182y = new C0182y(M.c(k4, 39), M.a(k4, M.c(k4, 39)), K.l(C0323u.b(F.j.f2408d, M.c(k4, F.j.f2406b)), M.c(k4, 39)), C0323u.b(0.38f, M.a(k4, M.c(k4, 39))));
                    k4.f1369O = c0182y;
                } else {
                    oVar3 = oVar4;
                }
                long j9 = j7 == 16 ? j7 : c0182y.f2103a;
                if (b4 == 16) {
                    b4 = c0182y.f2104b;
                }
                C0182y c0182y2 = new C0182y(j9, b4, j8 == 16 ? j8 : c0182y.f2105c, b5 == 16 ? b5 : c0182y.f2106d);
                C0847u c0847u = new C0847u(1, new S(C0323u.b(0.35f, AbstractC1365I.f11806g)));
                float f5 = 2;
                if ((62 & 1) != 0) {
                    f5 = F.j.f2405a;
                }
                j6 = j7;
                W0.c(oVar3, a4, c0182y2, new C0184z(f5, F.j.f2412h, F.j.f2410f, F.j.f2411g, F.j.f2409e, F.j.f2407c), c0847u, O.f.b(568683468, new B0(4, content), c0216p), c0216p, 221184 | (14 & i5));
            } else {
                c0216p.N();
                oVar3 = oVar2;
                j6 = j5;
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new Function2() { // from class: z1.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object h(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int U3 = C0192d.U(i2 | 1);
                        O.a aVar = content;
                        AbstractC0864b.f(S.o.this, j6, aVar, (C0216p) obj, U3, i4);
                        return Unit.f7487a;
                    }
                };
                return;
            }
            return;
        }
        j5 = j4;
        if ((i2 & 384) == 0) {
        }
        if ((i5 & 147) == 146) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        C1233d a42 = AbstractC1234e.a(14);
        b4 = M.b(j7, c0216p);
        long j82 = C0323u.f4547g;
        long b52 = C0323u.b(0.38f, b4);
        D.K k42 = (D.K) c0216p.k(M.f1481a);
        c0182y = k42.f1369O;
        if (c0182y != null) {
        }
        if (j7 == 16) {
        }
        if (b4 == 16) {
        }
        C0182y c0182y22 = new C0182y(j9, b4, j82 == 16 ? j82 : c0182y.f2105c, b52 == 16 ? b52 : c0182y.f2106d);
        C0847u c0847u2 = new C0847u(1, new S(C0323u.b(0.35f, AbstractC1365I.f11806g)));
        float f52 = 2;
        if ((62 & 1) != 0) {
        }
        j6 = j7;
        W0.c(oVar3, a42, c0182y22, new C0184z(f52, F.j.f2412h, F.j.f2410f, F.j.f2411g, F.j.f2409e, F.j.f2407c), c0847u2, O.f.b(568683468, new B0(4, content), c0216p), c0216p, 221184 | (14 & i5));
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final void g(v vVar, List list, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(1537894851);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(vVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(list) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean booleanValue = ((Boolean) c0216p.k(AbstractC1169t0.f10391a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1193i c1193i = (C1193i) it.next();
                C0483x c0483x = c1193i.f10516n;
                boolean g4 = c0216p.g(booleanValue) | c0216p.h(vVar) | c0216p.h(c1193i);
                Object I3 = c0216p.I();
                if (g4 || I3 == C0208l.f2826a) {
                    I3 = new t1.n(vVar, c1193i, booleanValue);
                    c0216p.c0(I3);
                }
                C0192d.d(c0483x, (Function1) I3, c0216p);
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 10, vVar, list);
        }
    }

    public static final y0.n h(E e4, boolean z4) {
        S.n nVar = (S.n) e4.B.f2912f;
        InterfaceC1072m interfaceC1072m = null;
        if ((nVar.f3981j & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f3980i & 8) != 0) {
                    S.n nVar2 = nVar;
                    I.d dVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof n0) {
                            interfaceC1072m = nVar2;
                            break loop0;
                        }
                        if ((nVar2.f3980i & 8) != 0 && (nVar2 instanceof AbstractC1073n)) {
                            int i2 = 0;
                            for (S.n nVar3 = ((AbstractC1073n) nVar2).f9826u; nVar3 != null; nVar3 = nVar3.f3983l) {
                                if ((nVar3.f3980i & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new I.d(new S.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar.b(nVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nVar2 = AbstractC1065f.f(dVar);
                    }
                }
                if ((nVar.f3981j & 8) == 0) {
                    break;
                }
                nVar = nVar.f3983l;
            }
        }
        Intrinsics.c(interfaceC1072m);
        S.n nVar4 = ((S.n) ((n0) interfaceC1072m)).f3978d;
        y0.i o4 = e4.o();
        Intrinsics.c(o4);
        return new y0.n(nVar4, z4, e4, o4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String value, Function1 onValue, String label, S.o oVar, C0216p c0216p, int i2, int i4) {
        int i5;
        S.o oVar2;
        int i6;
        S.o oVar3;
        C0222s0 s4;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValue, "onValue");
        Intrinsics.checkNotNullParameter(label, "label");
        c0216p.U(1983448279);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.f(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.h(onValue) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.f(label) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            oVar2 = oVar;
            i5 |= c0216p.f(oVar2) ? 2048 : 1024;
            i6 = i5;
            if ((i6 & 1171) == 1170 || !c0216p.z()) {
                S.o oVar4 = i7 == 0 ? S.l.f3977a : oVar2;
                L0 l02 = L0.f1475a;
                long j4 = AbstractC1365I.f11805f;
                S0.a(value, onValue, oVar4, false, false, null, O.f.b(943854461, new y0(label, 1), c0216p), null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, L0.c(j4, C0323u.b(0.5f, AbstractC1365I.f11806g), j4, c0216p, 2139088895), c0216p, (i6 & 14) | 1572864 | (i6 & 112) | ((i6 >> 3) & 896), 12582912, 0, 4063160);
                oVar3 = oVar4;
            } else {
                c0216p.N();
                oVar3 = oVar2;
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new C1383i(value, onValue, label, oVar3, i2, i4);
                return;
            }
            return;
        }
        oVar2 = oVar;
        i6 = i5;
        if ((i6 & 1171) == 1170) {
        }
        if (i7 == 0) {
        }
        L0 l022 = L0.f1475a;
        long j42 = AbstractC1365I.f11805f;
        S0.a(value, onValue, oVar4, false, false, null, O.f.b(943854461, new y0(label, 1), c0216p), null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, L0.c(j42, C0323u.b(0.5f, AbstractC1365I.f11806g), j42, c0216p, 2139088895), c0216p, (i6 & 14) | 1572864 | (i6 & 112) | ((i6 >> 3) & 896), 12582912, 0, 4063160);
        oVar3 = oVar4;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final void j(String title, String str, C0216p c0216p, int i2) {
        int i4;
        Intrinsics.checkNotNullParameter(title, "title");
        c0216p.U(1174891981);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(title) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(str) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            S.l lVar = S.l.f3977a;
            S.o i6 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f5081a, H1.f.q(new Pair[]{new Pair(Float.valueOf(0.0f), new C0323u(AbstractC1365I.f11804e)), new Pair(Float.valueOf(1.0f), new C0323u(AbstractC1365I.f11805f))})), 18, 16);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, i6);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, e4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, lVar);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a4, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                AbstractC0017m.r(i8, c0216p, i8, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            N1.b(title, null, AbstractC1365I.f11801b, u3.l.k0(24), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, (i5 & 14) | 200064, 0, 130962);
            c0216p.S(-590369704);
            if (str != null) {
                N1.b(str, null, C0323u.b(0.9f, AbstractC1365I.f11800a), u3.l.k0(13), null, null, F0.r.f2624b, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, ((i5 >> 3) & 14) | 3456, 0, 130994);
            }
            c0216p.q(false);
            c0216p.q(true);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0050d(i2, 4, title, str);
        }
    }

    public static final long k(P p4, Y.d dVar, Y.d dVar2, int i2) {
        long w4 = w(p4, dVar, i2);
        if (A0.K.b(w4)) {
            return A0.K.f299b;
        }
        long w5 = w(p4, dVar2, i2);
        if (A0.K.b(w5)) {
            return A0.K.f299b;
        }
        int i4 = (int) (w4 >> 32);
        int i5 = (int) (w5 & 4294967295L);
        return M1.a.j(Math.min(i4, i4), Math.max(i5, i5));
    }

    public static final boolean l(I i2, int i4) {
        int e4 = i2.e(i4);
        if (i4 == i2.h(e4) || i4 == i2.d(e4, false)) {
            if (i2.i(i4) == i2.a(i4)) {
                return false;
            }
        } else if (i2.a(i4) == i2.a(i4 - 1)) {
            return false;
        }
        return true;
    }

    public static void m(long j4, C1448f c1448f, int i2, ArrayList arrayList, int i4, int i5, ArrayList arrayList2) {
        int i6;
        int i7;
        int i8;
        int i9;
        C1448f c1448f2;
        int i10 = i2;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i4; i11 < i5; i11++) {
            if (((C1451i) arrayList.get(i11)).c() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C1451i c1451i = (C1451i) arrayList.get(i4);
        C1451i c1451i2 = (C1451i) arrayList.get(i5 - 1);
        int i12 = -1;
        if (i10 == c1451i.c()) {
            int intValue = ((Number) arrayList2.get(i4)).intValue();
            int i13 = i4 + 1;
            C1451i c1451i3 = (C1451i) arrayList.get(i13);
            i6 = i13;
            i7 = intValue;
            c1451i = c1451i3;
        } else {
            i6 = i4;
            i7 = -1;
        }
        if (c1451i.n(i10) == c1451i2.n(i10)) {
            int min = Math.min(c1451i.c(), c1451i2.c());
            int i14 = 0;
            for (int i15 = i10; i15 < min && c1451i.n(i15) == c1451i2.n(i15); i15++) {
                i14++;
            }
            long j5 = 4;
            long j6 = (c1448f.f11999e / j5) + j4 + 2 + i14 + 1;
            c1448f.A(-i14);
            c1448f.A(i7);
            int i16 = i14 + i10;
            while (i10 < i16) {
                c1448f.A(c1451i.n(i10) & 255);
                i10++;
            }
            if (i6 + 1 == i5) {
                if (i16 != ((C1451i) arrayList.get(i6)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c1448f.A(((Number) arrayList2.get(i6)).intValue());
                return;
            } else {
                C1448f c1448f3 = new C1448f();
                c1448f.A(((int) ((c1448f3.f11999e / j5) + j6)) * (-1));
                m(j6, c1448f3, i16, arrayList, i6, i5, arrayList2);
                c1448f.x(c1448f3);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i6 + 1; i18 < i5; i18++) {
            if (((C1451i) arrayList.get(i18 - 1)).n(i10) != ((C1451i) arrayList.get(i18)).n(i10)) {
                i17++;
            }
        }
        long j7 = 4;
        long j8 = (c1448f.f11999e / j7) + j4 + 2 + (i17 * 2);
        c1448f.A(i17);
        c1448f.A(i7);
        for (int i19 = i6; i19 < i5; i19++) {
            int n2 = ((C1451i) arrayList.get(i19)).n(i10);
            if (i19 == i6 || n2 != ((C1451i) arrayList.get(i19 - 1)).n(i10)) {
                c1448f.A(n2 & 255);
            }
        }
        C1448f c1448f4 = new C1448f();
        int i20 = i6;
        while (i20 < i5) {
            byte n4 = ((C1451i) arrayList.get(i20)).n(i10);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i5) {
                    i8 = i5;
                    break;
                } else {
                    if (n4 != ((C1451i) arrayList.get(i22)).n(i10)) {
                        i8 = i22;
                        break;
                    }
                    i22++;
                }
            }
            if (i21 == i8 && i10 + 1 == ((C1451i) arrayList.get(i20)).c()) {
                c1448f.A(((Number) arrayList2.get(i20)).intValue());
                i9 = i8;
                c1448f2 = c1448f4;
            } else {
                c1448f.A(((int) ((c1448f4.f11999e / j7) + j8)) * i12);
                i9 = i8;
                c1448f2 = c1448f4;
                m(j8, c1448f4, i10 + 1, arrayList, i20, i8, arrayList2);
            }
            c1448f4 = c1448f2;
            i20 = i9;
            i12 = -1;
        }
        c1448f.x(c1448f4);
    }

    public static String o(String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    public static final int p(int i2, Object obj, r.h hVar) {
        int b4;
        return (obj == null || hVar.c() == 0 || (i2 < hVar.c() && obj.equals(hVar.d(i2))) || (b4 = hVar.f9457d.b(obj)) == -1) ? i2 : b4;
    }

    public static final InterfaceC1249f q(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC1249f) T2.r.h(T2.r.j(T2.n.f(view, C1250g.f10985e), C1250g.f10986i));
    }

    public static String s(Context context, int i2) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            valueOf = context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i2);
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static Sequence t(s1.v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return T2.n.f(vVar, C1186b.f10497p);
    }

    public static final int u(A0.o oVar, long j4, P0 p02) {
        float c4 = p02 != null ? p02.c() : 0.0f;
        int c5 = oVar.c(Y.c.e(j4));
        if (Y.c.e(j4) < oVar.d(c5) - c4 || Y.c.e(j4) > oVar.b(c5) + c4 || Y.c.d(j4) < (-c4) || Y.c.d(j4) > oVar.f353d + c4) {
            return -1;
        }
        return c5;
    }

    public static final n0 v(E e4) {
        S.n nVar = (S.n) e4.B.f2912f;
        Object obj = null;
        if ((nVar.f3981j & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f3980i & 8) != 0) {
                    S.n nVar2 = nVar;
                    I.d dVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof n0) {
                            if (((n0) nVar2).X()) {
                                obj = nVar2;
                                break loop0;
                            }
                        } else if ((nVar2.f3980i & 8) != 0 && (nVar2 instanceof AbstractC1073n)) {
                            int i2 = 0;
                            for (S.n nVar3 = ((AbstractC1073n) nVar2).f9826u; nVar3 != null; nVar3 = nVar3.f3983l) {
                                if ((nVar3.f3980i & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new I.d(new S.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar.b(nVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nVar2 = AbstractC1065f.f(dVar);
                    }
                }
                if ((nVar.f3981j & 8) == 0) {
                    break;
                }
                nVar = nVar.f3983l;
            }
        }
        return (n0) obj;
    }

    public static final long w(P p4, Y.d dVar, int i2) {
        o0 d4 = p4.d();
        A0.o oVar = d4 != null ? d4.f11290a.f290b : null;
        InterfaceC0980p c4 = p4.c();
        return (oVar == null || c4 == null) ? A0.K.f299b : oVar.f(dVar.h(c4.m(0L)), i2, G.f278b);
    }

    public static final boolean x(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean y(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean z(int i2) {
        int type;
        return (!y(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public abstract boolean n(C1055h c1055h);

    public abstract Object r(C1055h c1055h);
}
