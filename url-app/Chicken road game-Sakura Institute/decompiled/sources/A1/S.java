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
import q.AbstractC1003G;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1028g;
import q.C1041t;
import r0.C1067h;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.AbstractC1365I;
import z1.EnumC1375a;
import z1.EnumC1387m;
import z1.EnumC1388n;

/* loaded from: classes.dex */
public final class S implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f536e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f537i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f538j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f539k;

    public /* synthetic */ S(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, int i2) {
        this.f535d = i2;
        this.f536e = interfaceC0191c0;
        this.f537i = interfaceC0191c02;
        this.f538j = interfaceC0191c03;
        this.f539k = interfaceC0191c04;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        boolean z4;
        switch (this.f535d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.l lVar = S.l.f3977a;
                    S.o T3 = j0.c.T(lVar, j0.c.J(c0216p));
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
                    int i2 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, T3);
                    InterfaceC1070k.f9822h.getClass();
                    Function0 function0 = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(function0);
                    } else {
                        c0216p.f0();
                    }
                    C1067h c1067h = C1069j.f9820f;
                    C0192d.R(c0216p, a4, c1067h);
                    C1067h c1067h2 = C1069j.f9819e;
                    C0192d.R(c0216p, m4, c1067h2);
                    C1067h c1067h3 = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                        AbstractC0017m.r(i2, c0216p, i2, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p, d4, c1067h4);
                    F0.k kVar = F0.k.f2616k;
                    long j4 = AbstractC1365I.f11806g;
                    N1.b("Discipline", null, j4, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 131034);
                    float f4 = 4;
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, f4));
                    InterfaceC0191c0 interfaceC0191c0 = this.f536e;
                    AbstractC1003G.a(null, null, null, 0, 0, null, O.f.b(-199710239, new Q(0, interfaceC0191c0), c0216p), c0216p, 1572864);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 10));
                    c0216p.S(651850400);
                    boolean i4 = AbstractC0071n0.i((EnumC1387m) interfaceC0191c0.getValue());
                    Object obj3 = C0208l.f2826a;
                    if (i4) {
                        z4 = false;
                    } else {
                        InterfaceC0191c0 interfaceC0191c02 = this.f537i;
                        String str = (String) interfaceC0191c02.getValue();
                        c0216p.S(651852423);
                        Object I3 = c0216p.I();
                        if (I3 == obj3) {
                            I3 = new C0058h(6, interfaceC0191c02);
                            c0216p.c0(I3);
                        }
                        z4 = false;
                        c0216p.q(false);
                        AbstractC0864b.i(str, (Function1) I3, "Distance (m)", null, c0216p, 432, 8);
                        AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 8));
                    }
                    c0216p.q(z4);
                    Object obj4 = obj3;
                    N1.b("Age group", null, j4, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 131034);
                    S.l lVar2 = lVar;
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar2, f4));
                    q.f0 b4 = q.e0.b(new C1028g(6), S.b.f3961p, c0216p, 6);
                    int i5 = c0216p.f2861P;
                    InterfaceC0213n0 m5 = c0216p.m();
                    S.o d5 = S.a.d(c0216p, lVar2);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(function0);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, b4, c1067h);
                    C0192d.R(c0216p, m5, c1067h2);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                        AbstractC0017m.r(i5, c0216p, i5, c1067h3);
                    }
                    C0192d.R(c0216p, d5, c1067h4);
                    c0216p.S(156575042);
                    EnumC1375a[] values = EnumC1375a.values();
                    int length = values.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            EnumC1375a enumC1375a = values[i6];
                            InterfaceC0191c0 interfaceC0191c03 = this.f538j;
                            boolean z5 = ((EnumC1375a) interfaceC0191c03.getValue()) == enumC1375a;
                            c0216p.S(174859240);
                            boolean f5 = c0216p.f(enumC1375a);
                            Object I4 = c0216p.I();
                            Object obj5 = obj4;
                            if (f5 || I4 == obj5) {
                                I4 = new H(enumC1375a, 2, interfaceC0191c03);
                                c0216p.c0(I4);
                            }
                            c0216p.q(false);
                            D.J.a(z5, (Function0) I4, O.f.b(-2016315050, new P(enumC1375a, 1), c0216p), null, false, null, null, null, null, null, null, null, c0216p, 384, 0, 4088);
                            i6++;
                            length = length;
                            values = values;
                            obj4 = obj5;
                            lVar2 = lVar2;
                        } else {
                            S.l lVar3 = lVar2;
                            Object obj6 = obj4;
                            c0216p.q(false);
                            c0216p.q(true);
                            float f6 = 8;
                            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar3, f6));
                            q.f0 b5 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
                            int i7 = c0216p.f2861P;
                            InterfaceC0213n0 m6 = c0216p.m();
                            S.o d6 = S.a.d(c0216p, lVar3);
                            InterfaceC1070k.f9822h.getClass();
                            Function0 function02 = C1069j.f9816b;
                            c0216p.W();
                            if (c0216p.f2860O) {
                                c0216p.l(function02);
                            } else {
                                c0216p.f0();
                            }
                            C0192d.R(c0216p, b5, C1069j.f9820f);
                            C0192d.R(c0216p, m6, C1069j.f9819e);
                            C1067h c1067h5 = C1069j.f9821g;
                            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                                AbstractC0017m.r(i7, c0216p, i7, c1067h5);
                            }
                            C0192d.R(c0216p, d6, C1069j.f9818d);
                            InterfaceC0191c0 interfaceC0191c04 = this.f539k;
                            boolean booleanValue = ((Boolean) interfaceC0191c04.getValue()).booleanValue();
                            c0216p.S(156586632);
                            Object I5 = c0216p.I();
                            if (I5 == obj6) {
                                I5 = new C0058h(7, interfaceC0191c04);
                                c0216p.c0(I5);
                            }
                            c0216p.q(false);
                            androidx.compose.material3.a.a(booleanValue, (Function1) I5, null, null, false, W0.i(AbstractC1365I.f11805f, AbstractC1365I.f11803d, c0216p), null, c0216p, 48);
                            AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.j(lVar3, f6));
                            N1.b(((Boolean) interfaceC0191c04.getValue()).booleanValue() ? "Girls" : "Boys", null, AbstractC1365I.f11807h, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 0, 0, 131066);
                            c0216p.q(true);
                            c0216p.q(true);
                        }
                    }
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.l lVar4 = S.l.f3977a;
                    C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p2, 0);
                    int i8 = c0216p2.f2861P;
                    InterfaceC0213n0 m7 = c0216p2.m();
                    S.o d7 = S.a.d(c0216p2, lVar4);
                    InterfaceC1070k.f9822h.getClass();
                    Function0 function03 = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(function03);
                    } else {
                        c0216p2.f0();
                    }
                    C1067h c1067h6 = C1069j.f9820f;
                    C0192d.R(c0216p2, a5, c1067h6);
                    C1067h c1067h7 = C1069j.f9819e;
                    C0192d.R(c0216p2, m7, c1067h7);
                    C1067h c1067h8 = C1069j.f9821g;
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i8))) {
                        AbstractC0017m.r(i8, c0216p2, i8, c1067h8);
                    }
                    C1067h c1067h9 = C1069j.f9818d;
                    C0192d.R(c0216p2, d7, c1067h9);
                    InterfaceC0191c0 interfaceC0191c05 = this.f536e;
                    String str2 = (String) interfaceC0191c05.getValue();
                    c0216p2.S(1012820755);
                    Object I6 = c0216p2.I();
                    Object obj7 = C0208l.f2826a;
                    if (I6 == obj7) {
                        I6 = new C0058h(8, interfaceC0191c05);
                        c0216p2.c0(I6);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str2, (Function1) I6, "Name (e.g. Greenfield District Meet)", null, c0216p2, 432, 8);
                    float f7 = 8;
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar4, f7));
                    InterfaceC0191c0 interfaceC0191c06 = this.f537i;
                    String str3 = (String) interfaceC0191c06.getValue();
                    c0216p2.S(1012825142);
                    Object I7 = c0216p2.I();
                    if (I7 == obj7) {
                        I7 = new C0058h(9, interfaceC0191c06);
                        c0216p2.c0(I7);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str3, (Function1) I7, "Village / school", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar4, f7));
                    InterfaceC0191c0 interfaceC0191c07 = this.f538j;
                    String str4 = (String) interfaceC0191c07.getValue();
                    Intrinsics.checkNotNullExpressionValue(str4, "access$CreateTournamentDialog$lambda$23(...)");
                    c0216p2.S(1012828883);
                    Object I8 = c0216p2.I();
                    if (I8 == obj7) {
                        I8 = new C0058h(10, interfaceC0191c07);
                        c0216p2.c0(I8);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str4, (Function1) I8, "Date (YYYY-MM-DD)", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar4, 10));
                    Object obj8 = obj7;
                    N1.b("Level", null, AbstractC1365I.f11806g, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 196614, 0, 131034);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar4, 4));
                    q.f0 b6 = q.e0.b(new C1028g(6), S.b.f3961p, c0216p2, 6);
                    int i9 = c0216p2.f2861P;
                    InterfaceC0213n0 m8 = c0216p2.m();
                    S.o d8 = S.a.d(c0216p2, lVar4);
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(function03);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, b6, c1067h6);
                    C0192d.R(c0216p2, m8, c1067h7);
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i9))) {
                        AbstractC0017m.r(i9, c0216p2, i9, c1067h8);
                    }
                    C0192d.R(c0216p2, d8, c1067h9);
                    c0216p2.S(-442384934);
                    EnumC1388n[] values2 = EnumC1388n.values();
                    int length2 = values2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length2) {
                            EnumC1388n enumC1388n = values2[i10];
                            InterfaceC0191c0 interfaceC0191c08 = this.f539k;
                            boolean z6 = ((EnumC1388n) interfaceC0191c08.getValue()) == enumC1388n;
                            c0216p2.S(1864126738);
                            boolean f8 = c0216p2.f(enumC1388n);
                            Object I9 = c0216p2.I();
                            Object obj9 = obj8;
                            if (f8 || I9 == obj9) {
                                I9 = new H(enumC1388n, 4, interfaceC0191c08);
                                c0216p2.c0(I9);
                            }
                            c0216p2.q(false);
                            D.J.a(z6, (Function0) I9, O.f.b(1767866907, new P(enumC1388n, 2), c0216p2), null, false, null, null, null, null, null, null, null, c0216p2, 384, 0, 4088);
                            i10++;
                            obj8 = obj9;
                            length2 = length2;
                            values2 = values2;
                        } else {
                            c0216p2.q(false);
                            c0216p2.q(true);
                            c0216p2.q(true);
                        }
                    }
                }
                break;
        }
        return Unit.f7487a;
    }
}
