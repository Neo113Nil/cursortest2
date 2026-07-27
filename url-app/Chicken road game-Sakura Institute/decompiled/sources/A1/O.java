package A1;

import A.AbstractC0017m;
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
import r0.C1069j;
import r0.InterfaceC1070k;
import z2.C1441y;

/* loaded from: classes.dex */
public final class O implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f514d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f515e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f516i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f517j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f518k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f520m;

    public O(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, InterfaceC0191c0 interfaceC0191c05, InterfaceC0191c0 interfaceC0191c06) {
        this.f515e = interfaceC0191c0;
        this.f516i = interfaceC0191c02;
        this.f517j = interfaceC0191c03;
        this.f518k = interfaceC0191c04;
        this.f519l = interfaceC0191c05;
        this.f520m = interfaceC0191c06;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f514d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    c0216p.S(-624474860);
                    boolean f4 = c0216p.f((String) this.f519l) | c0216p.f((Function0) this.f520m);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        I3 = new N((String) this.f519l, (Function0) this.f520m, this.f515e, this.f516i, this.f517j, this.f518k);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    W0.h((Function0) I3, null, false, null, null, null, null, null, null, AbstractC0083w.f756k, c0216p, 805306368);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.l lVar = S.l.f3977a;
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p2, 0);
                    int i2 = c0216p2.f2861P;
                    InterfaceC0213n0 m4 = c0216p2.m();
                    S.o d4 = S.a.d(c0216p2, lVar);
                    InterfaceC1070k.f9822h.getClass();
                    Function0 function0 = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(function0);
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
                    InterfaceC0191c0 interfaceC0191c0 = this.f515e;
                    String str = (String) interfaceC0191c0.getValue();
                    c0216p2.S(1346247275);
                    Object I4 = c0216p2.I();
                    Object obj3 = C0208l.f2826a;
                    if (I4 == obj3) {
                        I4 = new C0058h(11, interfaceC0191c0);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    Object obj4 = obj3;
                    AbstractC0864b.i(str, (Function1) I4, "Label (e.g. 100m Boys U14)", null, c0216p2, 432, 8);
                    float f5 = 8;
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar, f5));
                    InterfaceC0191c0 interfaceC0191c02 = this.f516i;
                    String str2 = (String) interfaceC0191c02.getValue();
                    c0216p2.S(1346251340);
                    Object I5 = c0216p2.I();
                    if (I5 == obj4) {
                        I5 = new C0058h(12, interfaceC0191c02);
                        c0216p2.c0(I5);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str2, (Function1) I5, "Holder", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar, f5));
                    InterfaceC0191c0 interfaceC0191c03 = this.f517j;
                    String str3 = (String) interfaceC0191c03.getValue();
                    c0216p2.S(1346254730);
                    Object I6 = c0216p2.I();
                    if (I6 == obj4) {
                        I6 = new C0058h(13, interfaceC0191c03);
                        c0216p2.c0(I6);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str3, (Function1) I6, "Team / village", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar, f5));
                    InterfaceC0191c0 interfaceC0191c04 = this.f518k;
                    String str4 = (String) interfaceC0191c04.getValue();
                    c0216p2.S(1346258347);
                    Object I7 = c0216p2.I();
                    if (I7 == obj4) {
                        I7 = new C0058h(14, interfaceC0191c04);
                        c0216p2.c0(I7);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str4, (Function1) I7, "Mark (e.g. 12.84 s)", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar, f5));
                    InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) this.f519l;
                    String str5 = (String) interfaceC0191c05.getValue();
                    Intrinsics.checkNotNullExpressionValue(str5, "access$AddRecordDialog$lambda$36(...)");
                    c0216p2.S(1346262122);
                    Object I8 = c0216p2.I();
                    if (I8 == obj4) {
                        I8 = new C0058h(15, interfaceC0191c05);
                        c0216p2.c0(I8);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.i(str5, (Function1) I8, "Date", null, c0216p2, 432, 8);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(lVar, 10));
                    q.f0 b4 = q.e0.b(new C1028g(6), S.b.f3961p, c0216p2, 6);
                    int i4 = c0216p2.f2861P;
                    InterfaceC0213n0 m5 = c0216p2.m();
                    S.o d5 = S.a.d(c0216p2, lVar);
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(function0);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, b4, c1067h);
                    C0192d.R(c0216p2, m5, c1067h2);
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p2, i4, c1067h3);
                    }
                    C0192d.R(c0216p2, d5, c1067h4);
                    c0216p2.S(-1574617478);
                    for (String str6 : C1441y.e("School", "Village", "District", "All-time")) {
                        InterfaceC0191c0 interfaceC0191c06 = (InterfaceC0191c0) this.f520m;
                        boolean a5 = Intrinsics.a((String) interfaceC0191c06.getValue(), str6);
                        c0216p2.S(222777416);
                        boolean f6 = c0216p2.f(str6);
                        Object I9 = c0216p2.I();
                        if (f6 || I9 == obj4) {
                            I9 = new H(str6, 5, interfaceC0191c06);
                            c0216p2.c0(I9);
                        }
                        c0216p2.q(false);
                        D.J.a(a5, (Function0) I9, O.f.b(2017529108, new y0(str6, 0), c0216p2), null, false, null, null, null, null, null, null, null, c0216p2, 384, 0, 4088);
                        obj4 = obj4;
                    }
                    c0216p2.q(false);
                    c0216p2.q(true);
                    c0216p2.q(true);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    c0216p3.S(2060034028);
                    boolean f7 = c0216p3.f((Function0) this.f520m);
                    Object I10 = c0216p3.I();
                    if (f7 || I10 == C0208l.f2826a) {
                        I10 = new N((Function0) this.f520m, this.f515e, this.f516i, this.f517j, this.f518k, (InterfaceC0191c0) this.f519l);
                        c0216p3.c0(I10);
                    }
                    c0216p3.q(false);
                    W0.h((Function0) I10, null, false, null, null, null, null, null, null, A.f419f, c0216p3, 805306368);
                }
                break;
        }
        return Unit.f7487a;
    }

    public O(String str, Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04) {
        this.f519l = str;
        this.f520m = function0;
        this.f515e = interfaceC0191c0;
        this.f516i = interfaceC0191c02;
        this.f517j = interfaceC0191c03;
        this.f518k = interfaceC0191c04;
    }

    public O(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, InterfaceC0191c0 interfaceC0191c05) {
        this.f520m = function0;
        this.f515e = interfaceC0191c0;
        this.f516i = interfaceC0191c02;
        this.f517j = interfaceC0191c03;
        this.f518k = interfaceC0191c04;
        this.f519l = interfaceC0191c05;
    }
}
