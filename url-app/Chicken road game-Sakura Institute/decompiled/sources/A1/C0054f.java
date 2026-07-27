package A1;

import A.AbstractC0017m;
import D.N1;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1028g;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.AbstractC1365I;

/* renamed from: A1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054f implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f593d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f594e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f598l;

    public C0054f(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, InterfaceC0191c0 interfaceC0191c05) {
        this.f595i = interfaceC0191c0;
        this.f596j = interfaceC0191c02;
        this.f597k = interfaceC0191c03;
        this.f598l = interfaceC0191c04;
        this.f594e = interfaceC0191c05;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f593d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    c0216p.S(905196517);
                    boolean f4 = c0216p.f((String) this.f598l) | c0216p.f((Function0) this.f594e);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        I3 = new C0052e((String) this.f598l, (Function0) this.f594e, this.f595i, this.f596j, this.f597k, 0);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    W0.h((Function0) I3, null, false, null, null, null, null, null, null, AbstractC0082v.f742i, c0216p, 805306368);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    c0216p2.S(1000182999);
                    boolean f5 = c0216p2.f((Function0) this.f594e);
                    Object I4 = c0216p2.I();
                    if (f5 || I4 == C0208l.f2826a) {
                        I4 = new C0052e((Function0) this.f594e, this.f595i, this.f596j, this.f597k, (InterfaceC0191c0) this.f598l);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    W0.h((Function0) I4, null, false, null, null, null, null, null, null, AbstractC0083w.f747b, c0216p2, 805306368);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    S.l lVar = S.l.f3977a;
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p3, 0);
                    int i2 = c0216p3.f2861P;
                    InterfaceC0213n0 m4 = c0216p3.m();
                    S.o d4 = S.a.d(c0216p3, lVar);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i);
                    } else {
                        c0216p3.f0();
                    }
                    C1067h c1067h = C1069j.f9820f;
                    C0192d.R(c0216p3, a4, c1067h);
                    C1067h c1067h2 = C1069j.f9819e;
                    C0192d.R(c0216p3, m4, c1067h2);
                    C1067h c1067h3 = C1069j.f9821g;
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i2))) {
                        AbstractC0017m.r(i2, c0216p3, i2, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p3, d4, c1067h4);
                    InterfaceC0191c0 interfaceC0191c0 = this.f595i;
                    String str = (String) interfaceC0191c0.getValue();
                    c0216p3.S(600491820);
                    Object I5 = c0216p3.I();
                    G.W w4 = C0208l.f2826a;
                    if (I5 == w4) {
                        I5 = new C0058h(17, interfaceC0191c0);
                        c0216p3.c0(I5);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str, (Function1) I5, "Full name", null, c0216p3, 432, 8);
                    float f6 = 8;
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    q.f0 b4 = q.e0.b(new C1028g(f6), S.b.f3961p, c0216p3, 6);
                    int i4 = c0216p3.f2861P;
                    InterfaceC0213n0 m5 = c0216p3.m();
                    S.o d5 = S.a.d(c0216p3, lVar);
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i);
                    } else {
                        c0216p3.f0();
                    }
                    C0192d.R(c0216p3, b4, c1067h);
                    C0192d.R(c0216p3, m5, c1067h2);
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p3, i4, c1067h3);
                    }
                    C0192d.R(c0216p3, d5, c1067h4);
                    q.h0 h0Var = q.h0.f9258a;
                    InterfaceC0191c0 interfaceC0191c02 = this.f596j;
                    String str2 = (String) interfaceC0191c02.getValue();
                    c0216p3.S(2135853510);
                    Object I6 = c0216p3.I();
                    if (I6 == w4) {
                        I6 = new C0058h(18, interfaceC0191c02);
                        c0216p3.c0(I6);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str2, (Function1) I6, "Bib #", h0Var.a(lVar, true), c0216p3, 432, 0);
                    InterfaceC0191c0 interfaceC0191c03 = this.f597k;
                    String str3 = (String) interfaceC0191c03.getValue();
                    c0216p3.S(2135857524);
                    Object I7 = c0216p3.I();
                    if (I7 == w4) {
                        I7 = new C0058h(19, interfaceC0191c03);
                        c0216p3.c0(I7);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str3, (Function1) I7, "Birth year", h0Var.a(lVar, true), c0216p3, 432, 0);
                    c0216p3.q(true);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) this.f598l;
                    String str4 = (String) interfaceC0191c04.getValue();
                    c0216p3.S(600508076);
                    Object I8 = c0216p3.I();
                    if (I8 == w4) {
                        I8 = new C0058h(20, interfaceC0191c04);
                        c0216p3.c0(I8);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str4, (Function1) I8, "Team / school / village", null, c0216p3, 432, 8);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    q.f0 b5 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p3, 48);
                    int i5 = c0216p3.f2861P;
                    InterfaceC0213n0 m6 = c0216p3.m();
                    S.o d6 = S.a.d(c0216p3, lVar);
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i);
                    } else {
                        c0216p3.f0();
                    }
                    C0192d.R(c0216p3, b5, c1067h);
                    C0192d.R(c0216p3, m6, c1067h2);
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i5))) {
                        AbstractC0017m.r(i5, c0216p3, i5, c1067h3);
                    }
                    C0192d.R(c0216p3, d6, c1067h4);
                    InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) this.f594e;
                    boolean booleanValue = ((Boolean) interfaceC0191c05.getValue()).booleanValue();
                    c0216p3.S(2135870925);
                    Object I9 = c0216p3.I();
                    if (I9 == w4) {
                        I9 = new C0058h(21, interfaceC0191c05);
                        c0216p3.c0(I9);
                    }
                    c0216p3.q(false);
                    androidx.compose.material3.a.a(booleanValue, (Function1) I9, null, null, false, W0.i(AbstractC1365I.f11805f, AbstractC1365I.f11803d, c0216p3), null, c0216p3, 48);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.j(lVar, f6));
                    N1.b(((Boolean) interfaceC0191c05.getValue()).booleanValue() ? "Female" : "Male", null, AbstractC1365I.f11807h, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 0, 0, 131066);
                    c0216p3.q(true);
                    c0216p3.q(true);
                }
                break;
        }
        return Unit.f7487a;
    }

    public C0054f(String str, Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03) {
        this.f598l = str;
        this.f594e = function0;
        this.f595i = interfaceC0191c0;
        this.f596j = interfaceC0191c02;
        this.f597k = interfaceC0191c03;
    }

    public C0054f(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04) {
        this.f594e = function0;
        this.f595i = interfaceC0191c0;
        this.f596j = interfaceC0191c02;
        this.f597k = interfaceC0191c03;
        this.f598l = interfaceC0191c04;
    }
}
