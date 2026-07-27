package A1;

import A.AbstractC0017m;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import z1.AbstractC1366J;
import z1.C1361E;
import z1.C1374S;
import z1.C1377c;

/* loaded from: classes.dex */
public final class x0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f780e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f781i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f782j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f783k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f784l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f785m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f786n;

    public x0(InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, InterfaceC0191c0 interfaceC0191c05, InterfaceC0191c0 interfaceC0191c06, C1377c c1377c) {
        this.f779d = 2;
        this.f781i = interfaceC0191c0;
        this.f782j = interfaceC0191c02;
        this.f783k = interfaceC0191c03;
        this.f784l = interfaceC0191c04;
        this.f785m = interfaceC0191c05;
        this.f786n = interfaceC0191c06;
        this.f780e = c1377c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f779d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    c0216p.S(2004696119);
                    boolean f4 = c0216p.f((Function0) this.f780e);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        final InterfaceC0191c0 interfaceC0191c0 = this.f783k;
                        final InterfaceC0191c0 interfaceC0191c02 = this.f784l;
                        final Function0 function0 = (Function0) this.f780e;
                        final InterfaceC0191c0 interfaceC0191c03 = this.f781i;
                        final InterfaceC0191c0 interfaceC0191c04 = this.f782j;
                        final InterfaceC0191c0 interfaceC0191c05 = this.f785m;
                        final InterfaceC0191c0 interfaceC0191c06 = this.f786n;
                        final int i2 = 0;
                        I3 = new Function0() { // from class: A1.w0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function02 = function0;
                                InterfaceC0191c0 interfaceC0191c07 = interfaceC0191c06;
                                InterfaceC0191c0 interfaceC0191c08 = interfaceC0191c05;
                                InterfaceC0191c0 interfaceC0191c09 = interfaceC0191c02;
                                InterfaceC0191c0 interfaceC0191c010 = interfaceC0191c0;
                                InterfaceC0191c0 interfaceC0191c011 = interfaceC0191c04;
                                InterfaceC0191c0 interfaceC0191c012 = interfaceC0191c03;
                                switch (i2) {
                                    case 0:
                                        if (!kotlin.text.y.x((String) interfaceC0191c012.getValue()) && !kotlin.text.y.x((String) interfaceC0191c011.getValue()) && !kotlin.text.y.x((String) interfaceC0191c010.getValue())) {
                                            Q.v vVar = AbstractC1366J.f11823i;
                                            String a4 = AbstractC1366J.a();
                                            String obj3 = kotlin.text.y.M((String) interfaceC0191c012.getValue()).toString();
                                            String obj4 = kotlin.text.y.M((String) interfaceC0191c011.getValue()).toString();
                                            String obj5 = kotlin.text.y.M((String) interfaceC0191c09.getValue()).toString();
                                            String obj6 = kotlin.text.y.M((String) interfaceC0191c010.getValue()).toString();
                                            String str = (String) interfaceC0191c08.getValue();
                                            Intrinsics.checkNotNullExpressionValue(str, "access$AddRecordDialog$lambda$36(...)");
                                            vVar.add(new C1361E(a4, obj3, obj4, obj5, obj6, str, (String) interfaceC0191c07.getValue()));
                                            AbstractC1366J.b();
                                            function02.invoke();
                                        }
                                        break;
                                    default:
                                        SimpleDateFormat simpleDateFormat = R0.f534a;
                                        Double d4 = kotlin.text.s.d((String) interfaceC0191c012.getValue());
                                        if (d4 == null) {
                                            break;
                                        } else {
                                            double doubleValue = d4.doubleValue();
                                            Integer f5 = kotlin.text.t.f((String) interfaceC0191c011.getValue());
                                            int intValue = (f5 != null ? f5.intValue() : 0) * 60;
                                            Integer f6 = kotlin.text.t.f((String) interfaceC0191c010.getValue());
                                            int intValue2 = intValue + (f6 != null ? f6.intValue() : 0);
                                            if (doubleValue > 0.0d && intValue2 > 0) {
                                                Q.v vVar2 = AbstractC1366J.f11824j;
                                                String a5 = AbstractC1366J.a();
                                                String str2 = (String) interfaceC0191c09.getValue();
                                                String str3 = (String) interfaceC0191c08.getValue();
                                                if (kotlin.text.y.x(str3)) {
                                                    str3 = R0.f534a.format(new Date());
                                                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                                                }
                                                vVar2.add(new C1374S(a5, str2, str3, doubleValue, intValue2, kotlin.text.y.M((String) interfaceC0191c07.getValue()).toString()));
                                                AbstractC1366J.b();
                                                function02.invoke();
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                }
                                return Unit.f7487a;
                            }
                        };
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    W0.h((Function0) I3, null, false, null, null, null, null, null, null, AbstractC0085y.f790d, c0216p, 805306368);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    c0216p2.S(-1578556918);
                    boolean f5 = c0216p2.f((Function0) this.f780e);
                    Object I4 = c0216p2.I();
                    if (f5 || I4 == C0208l.f2826a) {
                        final InterfaceC0191c0 interfaceC0191c07 = this.f783k;
                        final InterfaceC0191c0 interfaceC0191c08 = this.f784l;
                        final Function0 function02 = (Function0) this.f780e;
                        final InterfaceC0191c0 interfaceC0191c09 = this.f781i;
                        final InterfaceC0191c0 interfaceC0191c010 = this.f782j;
                        final InterfaceC0191c0 interfaceC0191c011 = this.f785m;
                        final InterfaceC0191c0 interfaceC0191c012 = this.f786n;
                        final int i4 = 1;
                        I4 = new Function0() { // from class: A1.w0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function022 = function02;
                                InterfaceC0191c0 interfaceC0191c072 = interfaceC0191c012;
                                InterfaceC0191c0 interfaceC0191c082 = interfaceC0191c011;
                                InterfaceC0191c0 interfaceC0191c092 = interfaceC0191c08;
                                InterfaceC0191c0 interfaceC0191c0102 = interfaceC0191c07;
                                InterfaceC0191c0 interfaceC0191c0112 = interfaceC0191c010;
                                InterfaceC0191c0 interfaceC0191c0122 = interfaceC0191c09;
                                switch (i4) {
                                    case 0:
                                        if (!kotlin.text.y.x((String) interfaceC0191c0122.getValue()) && !kotlin.text.y.x((String) interfaceC0191c0112.getValue()) && !kotlin.text.y.x((String) interfaceC0191c0102.getValue())) {
                                            Q.v vVar = AbstractC1366J.f11823i;
                                            String a4 = AbstractC1366J.a();
                                            String obj3 = kotlin.text.y.M((String) interfaceC0191c0122.getValue()).toString();
                                            String obj4 = kotlin.text.y.M((String) interfaceC0191c0112.getValue()).toString();
                                            String obj5 = kotlin.text.y.M((String) interfaceC0191c092.getValue()).toString();
                                            String obj6 = kotlin.text.y.M((String) interfaceC0191c0102.getValue()).toString();
                                            String str = (String) interfaceC0191c082.getValue();
                                            Intrinsics.checkNotNullExpressionValue(str, "access$AddRecordDialog$lambda$36(...)");
                                            vVar.add(new C1361E(a4, obj3, obj4, obj5, obj6, str, (String) interfaceC0191c072.getValue()));
                                            AbstractC1366J.b();
                                            function022.invoke();
                                        }
                                        break;
                                    default:
                                        SimpleDateFormat simpleDateFormat = R0.f534a;
                                        Double d4 = kotlin.text.s.d((String) interfaceC0191c0122.getValue());
                                        if (d4 == null) {
                                            break;
                                        } else {
                                            double doubleValue = d4.doubleValue();
                                            Integer f52 = kotlin.text.t.f((String) interfaceC0191c0112.getValue());
                                            int intValue = (f52 != null ? f52.intValue() : 0) * 60;
                                            Integer f6 = kotlin.text.t.f((String) interfaceC0191c0102.getValue());
                                            int intValue2 = intValue + (f6 != null ? f6.intValue() : 0);
                                            if (doubleValue > 0.0d && intValue2 > 0) {
                                                Q.v vVar2 = AbstractC1366J.f11824j;
                                                String a5 = AbstractC1366J.a();
                                                String str2 = (String) interfaceC0191c092.getValue();
                                                String str3 = (String) interfaceC0191c082.getValue();
                                                if (kotlin.text.y.x(str3)) {
                                                    str3 = R0.f534a.format(new Date());
                                                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                                                }
                                                vVar2.add(new C1374S(a5, str2, str3, doubleValue, intValue2, kotlin.text.y.M((String) interfaceC0191c072.getValue()).toString()));
                                                AbstractC1366J.b();
                                                function022.invoke();
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                }
                                return Unit.f7487a;
                            }
                        };
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    W0.h((Function0) I4, null, false, null, null, null, null, null, null, D.f441c, c0216p2, 805306368);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    S.l lVar = S.l.f3977a;
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p3, 0);
                    int i5 = c0216p3.f2861P;
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
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i5))) {
                        AbstractC0017m.r(i5, c0216p3, i5, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p3, d4, c1067h4);
                    InterfaceC0191c0 interfaceC0191c013 = this.f781i;
                    String str = (String) interfaceC0191c013.getValue();
                    c0216p3.S(-1777703213);
                    Object I5 = c0216p3.I();
                    G.W w4 = C0208l.f2826a;
                    if (I5 == w4) {
                        I5 = new C0058h(24, interfaceC0191c013);
                        c0216p3.c0(I5);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str, (Function1) I5, "Date (yyyy-MM-dd)", null, c0216p3, 432, 8);
                    float f6 = 8;
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    InterfaceC0191c0 interfaceC0191c014 = this.f782j;
                    String str2 = (String) interfaceC0191c014.getValue();
                    c0216p3.S(-1777699493);
                    Object I6 = c0216p3.I();
                    if (I6 == w4) {
                        I6 = new C0058h(25, interfaceC0191c014);
                        c0216p3.c0(I6);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str2, (Function1) I6, "Distance (km)", null, c0216p3, 432, 8);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    q.f0 b4 = q.e0.b(new C1028g(f6), S.b.f3961p, c0216p3, 6);
                    int i6 = c0216p3.f2861P;
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
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i6))) {
                        AbstractC0017m.r(i6, c0216p3, i6, c1067h3);
                    }
                    C0192d.R(c0216p3, d5, c1067h4);
                    q.h0 h0Var = q.h0.f9258a;
                    InterfaceC0191c0 interfaceC0191c015 = this.f783k;
                    String str3 = (String) interfaceC0191c015.getValue();
                    c0216p3.S(-1511122087);
                    Object I7 = c0216p3.I();
                    if (I7 == w4) {
                        I7 = new C0058h(26, interfaceC0191c015);
                        c0216p3.c0(I7);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str3, (Function1) I7, "Minutes", h0Var.a(lVar, true), c0216p3, 432, 0);
                    InterfaceC0191c0 interfaceC0191c016 = this.f784l;
                    String str4 = (String) interfaceC0191c016.getValue();
                    c0216p3.S(-1511118055);
                    Object I8 = c0216p3.I();
                    if (I8 == w4) {
                        I8 = new C0058h(27, interfaceC0191c016);
                        c0216p3.c0(I8);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str4, (Function1) I8, "Seconds", h0Var.a(lVar, true), c0216p3, 432, 0);
                    c0216p3.q(true);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    InterfaceC0191c0 interfaceC0191c017 = this.f785m;
                    String str5 = (String) interfaceC0191c017.getValue();
                    c0216p3.S(-1777682188);
                    Object I9 = c0216p3.I();
                    if (I9 == w4) {
                        I9 = new C0058h(28, interfaceC0191c017);
                        c0216p3.c0(I9);
                    }
                    c0216p3.q(false);
                    AbstractC0864b.i(str5, (Function1) I9, "Notes (optional)", null, c0216p3, 432, 8);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.b(lVar, f6));
                    c0216p3.S(-1777677572);
                    Object I10 = c0216p3.I();
                    if (I10 == w4) {
                        I10 = new O0(2, this.f786n);
                        c0216p3.c0(I10);
                    }
                    c0216p3.q(false);
                    W0.g((Function0) I10, androidx.compose.foundation.layout.c.f5081a, false, null, null, null, null, null, null, O.f.b(1859530532, new C0064k(3, (C1377c) this.f780e), c0216p3), c0216p3, 805306422, 508);
                    c0216p3.q(true);
                }
                break;
        }
        return Unit.f7487a;
    }

    public /* synthetic */ x0(Function0 function0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, InterfaceC0191c0 interfaceC0191c03, InterfaceC0191c0 interfaceC0191c04, InterfaceC0191c0 interfaceC0191c05, InterfaceC0191c0 interfaceC0191c06, int i2) {
        this.f779d = i2;
        this.f780e = function0;
        this.f781i = interfaceC0191c0;
        this.f782j = interfaceC0191c02;
        this.f783k = interfaceC0191c03;
        this.f784l = interfaceC0191c04;
        this.f785m = interfaceC0191c05;
        this.f786n = interfaceC0191c06;
    }
}
