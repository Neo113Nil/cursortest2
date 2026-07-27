package A1;

import A.AbstractC0017m;
import D.N1;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1028g;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import z1.AbstractC1365I;

/* loaded from: classes.dex */
public final class E0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f450d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f451e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f452i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f453j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f454k;

    public E0(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, List list, InterfaceC0191c0 interfaceC0191c03) {
        this.f451e = interfaceC0191c0;
        this.f452i = interfaceC0191c02;
        this.f454k = list;
        this.f453j = interfaceC0191c03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        S.l lVar;
        G.W w4;
        boolean z4;
        switch (this.f450d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    c0216p.S(-1384902680);
                    Function0 function0 = (Function0) this.f454k;
                    boolean f4 = c0216p.f(function0);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        I3 = new C0073o0(function0, this.f451e, this.f452i, this.f453j);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    W0.h((Function0) I3, null, false, null, null, null, null, null, null, A.f422i, c0216p, 805306368);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.l lVar2 = S.l.f3977a;
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p2, 0);
                    int i2 = c0216p2.f2861P;
                    InterfaceC0213n0 m4 = c0216p2.m();
                    S.o d4 = S.a.d(c0216p2, lVar2);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i);
                    } else {
                        c0216p2.f0();
                    }
                    C1067h c1067h = C1069j.f9820f;
                    C0192d.R(c0216p2, a4, c1067h);
                    C1067h c1067h2 = C1069j.f9819e;
                    C0192d.R(c0216p2, m4, c1067h2);
                    C1067h c1067h3 = C1069j.f9821g;
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i2))) {
                        AbstractC0017m.r(i2, c0216p2, i2, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p2, d4, c1067h4);
                    InterfaceC0191c0 interfaceC0191c0 = this.f451e;
                    String str = (String) interfaceC0191c0.getValue();
                    c0216p2.S(-1951206954);
                    Object I4 = c0216p2.I();
                    G.W w5 = C0208l.f2826a;
                    if (I4 == w5) {
                        I4 = new C0058h(22, interfaceC0191c0);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str, (Function1) I4, "Team name", null, c0216p2, 432, 8);
                    float f5 = 8;
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar2, f5));
                    InterfaceC0191c0 interfaceC0191c02 = this.f452i;
                    String str2 = (String) interfaceC0191c02.getValue();
                    c0216p2.S(-1951203431);
                    Object I5 = c0216p2.I();
                    if (I5 == w5) {
                        I5 = new C0058h(23, interfaceC0191c02);
                        c0216p2.c0(I5);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str2, (Function1) I5, "Village / school", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar2, 10));
                    G.W w6 = w5;
                    N1.b("Color", null, AbstractC1365I.f11806g, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 196614, 0, 131034);
                    float f6 = 6;
                    S.l lVar3 = lVar2;
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar3, f6));
                    q.f0 b4 = q.e0.b(new C1028g(f6), S.b.f3961p, c0216p2, 6);
                    int i4 = c0216p2.f2861P;
                    InterfaceC0213n0 m5 = c0216p2.m();
                    S.o d5 = S.a.d(c0216p2, lVar3);
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, b4, c1067h);
                    C0192d.R(c0216p2, m5, c1067h2);
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p2, i4, c1067h3);
                    }
                    C0192d.R(c0216p2, d5, c1067h4);
                    c0216p2.S(-1066203722);
                    Iterator it = ((List) this.f454k).iterator();
                    while (it.hasNext()) {
                        final long longValue = ((Number) it.next()).longValue();
                        S.o b5 = androidx.compose.foundation.a.b(u3.l.U(androidx.compose.foundation.layout.c.g(lVar3, 34), AbstractC1234e.a(f5)), Z.K.d(longValue), Z.K.f4461a);
                        c0216p2.S(-1152831148);
                        boolean e4 = c0216p2.e(longValue);
                        Object I6 = c0216p2.I();
                        final InterfaceC0191c0 interfaceC0191c03 = this.f453j;
                        G.W w7 = w6;
                        if (e4 || I6 == w7) {
                            I6 = new Function0() { // from class: A1.F0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    interfaceC0191c03.setValue(Long.valueOf(longValue));
                                    return Unit.f7487a;
                                }
                            };
                            c0216p2.c0(I6);
                        }
                        c0216p2.q(false);
                        S.o h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.a.e(b5, false, null, (Function0) I6, 7), 2);
                        InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3956k, false);
                        int i5 = c0216p2.f2861P;
                        InterfaceC0213n0 m6 = c0216p2.m();
                        S.o d6 = S.a.d(c0216p2, h4);
                        InterfaceC1070k.f9822h.getClass();
                        C1068i c1068i2 = C1069j.f9816b;
                        c0216p2.W();
                        if (c0216p2.f2860O) {
                            c0216p2.l(c1068i2);
                        } else {
                            c0216p2.f0();
                        }
                        C0192d.R(c0216p2, e5, C1069j.f9820f);
                        C0192d.R(c0216p2, m6, C1069j.f9819e);
                        C1067h c1067h5 = C1069j.f9821g;
                        if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i5))) {
                            AbstractC0017m.r(i5, c0216p2, i5, c1067h5);
                        }
                        C0192d.R(c0216p2, d6, C1069j.f9818d);
                        c0216p2.S(2032883666);
                        if (((Number) interfaceC0191c03.getValue()).longValue() == longValue) {
                            w4 = w7;
                            lVar = lVar3;
                            N1.b("?", null, AbstractC1365I.f11801b, 0L, null, F0.k.f2617l, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 196614, 0, 131034);
                            z4 = false;
                        } else {
                            lVar = lVar3;
                            w4 = w7;
                            z4 = false;
                        }
                        c0216p2.q(z4);
                        c0216p2.q(true);
                        lVar3 = lVar;
                        w6 = w4;
                    }
                    c0216p2.q(false);
                    c0216p2.q(true);
                    c0216p2.q(true);
                }
                break;
        }
        return Unit.f7487a;
    }

    public E0(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03) {
        this.f454k = function0;
        this.f451e = interfaceC0191c0;
        this.f452i = interfaceC0191c02;
        this.f453j = interfaceC0191c03;
    }
}
