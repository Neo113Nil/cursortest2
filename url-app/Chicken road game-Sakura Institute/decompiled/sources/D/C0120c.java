package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import P0.C0262d;
import P0.C0263e;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.attribution.RequestError;
import com.chicken.road.kedro.laqer.R;
import java.util.ArrayList;
import k.C0742h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C0855c;
import o.C0891i0;
import o.C0909s;
import p0.C0984t;
import p0.InterfaceC0945F;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.C1023b;
import q.C1028g;
import q.InterfaceC1021Z;
import q0.C1055h;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s.C1092H;
import s.C1112p;
import s.C1113q;
import s0.C1157n;
import s1.C1193i;
import u.C1213a;

/* renamed from: D.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120c extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1726e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0120c(Object obj, int i2, Object obj2) {
        super(2);
        this.f1725d = i2;
        this.f1726e = obj;
        this.f1727i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        q.h0 h0Var = q.h0.f9258a;
        int i2 = 5;
        G.W w4 = C0208l.f2826a;
        S.l lVar = S.l.f3977a;
        int i4 = 0;
        int i5 = 2;
        Object obj3 = this.f1727i;
        Object obj4 = this.f1726e;
        switch (this.f1725d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.o h4 = androidx.compose.foundation.layout.b.g(lVar, AbstractC0150m.f1894g).h(new HorizontalAlignElement(((Function2) obj4) == null ? S.b.f3963r : S.b.f3964s));
                    InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
                    int i6 = c0216p.f2861P;
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
                    C0192d.R(c0216p, e4, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                        AbstractC0017m.r(i6, c0216p, i6, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    ((Function2) obj3).h(c0216p, 0);
                    c0216p.q(true);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    c0216p2.k(AndroidCompositionLocals_androidKt.f5212a);
                    String string = ((Context) c0216p2.k(AndroidCompositionLocals_androidKt.f5213b)).getResources().getString(R.string.m3c_dialog);
                    S.o i7 = androidx.compose.foundation.layout.c.i((S.o) obj4, AbstractC0150m.f1888a, Float.NaN, AbstractC0150m.f1889b, Float.NaN);
                    boolean f4 = c0216p2.f(string);
                    Object I3 = c0216p2.I();
                    if (f4 || I3 == w4) {
                        I3 = new C0144k(string, i4);
                        c0216p2.c0(I3);
                    }
                    S.o h5 = i7.h(y0.k.a(lVar, (Function1) I3));
                    InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3952d, true);
                    int i8 = c0216p2.f2861P;
                    InterfaceC0213n0 m5 = c0216p2.m();
                    S.o d5 = S.a.d(c0216p2, h5);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i2 = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i2);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, e5, C1069j.f9820f);
                    C0192d.R(c0216p2, m5, C1069j.f9819e);
                    C1067h c1067h2 = C1069j.f9821g;
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i8))) {
                        AbstractC0017m.r(i8, c0216p2, i8, c1067h2);
                    }
                    C0192d.R(c0216p2, d5, C1069j.f9818d);
                    ((O.a) obj3).h(c0216p2, 0);
                    c0216p2.q(true);
                }
                break;
            case 2:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    S.o g4 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.a(lVar, AbstractC0159p.f1959c, AbstractC0159p.f1960d), (InterfaceC1021Z) obj4);
                    q.f0 b4 = q.e0.b(AbstractC1031j.f9268d, S.b.f3962q, c0216p3, 54);
                    int i9 = c0216p3.f2861P;
                    InterfaceC0213n0 m6 = c0216p3.m();
                    S.o d6 = S.a.d(c0216p3, g4);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i3 = C1069j.f9816b;
                    c0216p3.W();
                    if (c0216p3.f2860O) {
                        c0216p3.l(c1068i3);
                    } else {
                        c0216p3.f0();
                    }
                    C0192d.R(c0216p3, b4, C1069j.f9820f);
                    C0192d.R(c0216p3, m6, C1069j.f9819e);
                    C1067h c1067h3 = C1069j.f9821g;
                    if (c0216p3.f2860O || !Intrinsics.a(c0216p3.I(), Integer.valueOf(i9))) {
                        AbstractC0017m.r(i9, c0216p3, i9, c1067h3);
                    }
                    C0192d.R(c0216p3, d6, C1069j.f9818d);
                    ((L2.c) obj3).g(h0Var, c0216p3, 6);
                    c0216p3.q(true);
                }
                break;
            case 3:
                C0216p c0216p4 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    N1.a(((T1) obj4).f1650j, (O.a) obj3, c0216p4, 0);
                }
                break;
            case 4:
                C0216p c0216p5 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p5.z()) {
                    c0216p5.N();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
                    C1055h c1055h = q.q0.f9327a;
                    S.o a4 = y0.k.a(androidx.compose.foundation.layout.c.a(S.a.b(fillElement, C1157n.f10272m, new A.i0(i2, (q.m0) obj4)), Float.NaN, H0.f1307a), C1213a.f10886d);
                    C1023b c1023b = AbstractC1031j.f9265a;
                    q.f0 b5 = q.e0.b(new C1028g(H0.f1308b), S.b.f3962q, c0216p5, 54);
                    int i10 = c0216p5.f2861P;
                    InterfaceC0213n0 m7 = c0216p5.m();
                    S.o d7 = S.a.d(c0216p5, a4);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i4 = C1069j.f9816b;
                    c0216p5.W();
                    if (c0216p5.f2860O) {
                        c0216p5.l(c1068i4);
                    } else {
                        c0216p5.f0();
                    }
                    C0192d.R(c0216p5, b5, C1069j.f9820f);
                    C0192d.R(c0216p5, m7, C1069j.f9819e);
                    C1067h c1067h4 = C1069j.f9821g;
                    if (c0216p5.f2860O || !Intrinsics.a(c0216p5.I(), Integer.valueOf(i10))) {
                        AbstractC0017m.r(i10, c0216p5, i10, c1067h4);
                    }
                    C0192d.R(c0216p5, d7, C1069j.f9818d);
                    ((O.a) obj3).g(h0Var, c0216p5, 6);
                    c0216p5.q(true);
                }
                break;
            case 5:
                C0216p c0216p6 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p6.z()) {
                    c0216p6.N();
                } else {
                    S.o c4 = androidx.compose.ui.layout.a.c(lVar, "indicator");
                    G.X0 x02 = (G.X0) obj4;
                    boolean f5 = c0216p6.f(x02);
                    Object I4 = c0216p6.I();
                    if (f5 || I4 == w4) {
                        I4 = new C0185z0(x02, i4);
                        c0216p6.c0(I4);
                    }
                    S.o a5 = androidx.compose.ui.graphics.a.a(c4, (Function1) I4);
                    long j4 = ((C0181x0) obj3).f2094c;
                    float f6 = F.o.f2446a;
                    AbstractC1035n.a(androidx.compose.foundation.a.b(a5, j4, AbstractC0146k1.a(5, c0216p6)), c0216p6, 0);
                }
                break;
            case 6:
                C0216p c0216p7 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p7.z()) {
                    c0216p7.N();
                } else {
                    ((L2.c) obj4).g((ArrayList) obj3, c0216p7, 0);
                }
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0216p c0216p8 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p8.z()) {
                    c0216p8.N();
                } else {
                    S.o a6 = y0.k.a(lVar, C0262d.f3716k);
                    P0.B b6 = (P0.B) obj4;
                    boolean h6 = c0216p8.h(b6);
                    Object I5 = c0216p8.I();
                    if (h6 || I5 == w4) {
                        I5 = new P0.l(b6, 1);
                        c0216p8.c0(I5);
                    }
                    S.o e6 = androidx.compose.ui.layout.a.e(a6, (Function1) I5);
                    float f7 = b6.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f7 != 1.0f) {
                        e6 = androidx.compose.ui.graphics.a.b(e6, f7, 0.0f, null, true, 126971);
                    }
                    O.a b7 = O.f.b(606497925, new C0263e(i5, (InterfaceC0191c0) obj3), c0216p8);
                    P0.g gVar = P0.g.f3727c;
                    int i11 = c0216p8.f2861P;
                    InterfaceC0213n0 m8 = c0216p8.m();
                    S.o d8 = S.a.d(c0216p8, e6);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i5 = C1069j.f9816b;
                    c0216p8.W();
                    if (c0216p8.f2860O) {
                        c0216p8.l(c1068i5);
                    } else {
                        c0216p8.f0();
                    }
                    C0192d.R(c0216p8, gVar, C1069j.f9820f);
                    C0192d.R(c0216p8, m8, C1069j.f9819e);
                    C1067h c1067h5 = C1069j.f9821g;
                    if (c0216p8.f2860O || !Intrinsics.a(c0216p8.I(), Integer.valueOf(i11))) {
                        AbstractC0017m.r(i11, c0216p8, i11, c1067h5);
                    }
                    C0192d.R(c0216p8, d8, C1069j.f9818d);
                    b7.h(c0216p8, 6);
                    c0216p8.q(true);
                }
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                long j5 = ((Y.c) obj2).f4372a;
                u3.l.Q((C0855c) obj4, (l0.s) obj);
                Y2.e eVar = ((C0891i0) obj3).f8801z;
                if (eVar != null) {
                    eVar.o(new C0909s(j5));
                }
                break;
            case AbstractC1024c.f9242c /* 9 */:
                C0216p c0216p9 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p9.z()) {
                    c0216p9.N();
                } else {
                    Boolean bool = (Boolean) ((C0984t) obj3).f9062f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    c0216p9.V(bool);
                    boolean g5 = c0216p9.g(booleanValue);
                    c0216p9.S(-869707859);
                    if (booleanValue) {
                        ((Function2) obj4).h(c0216p9, 0);
                    } else {
                        c0216p9.n(g5);
                    }
                    c0216p9.q(false);
                    c0216p9.t();
                }
                break;
            case 10:
                C0216p c0216p10 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p10.z()) {
                    c0216p10.N();
                } else {
                    C1113q c1113q = (C1113q) obj4;
                    r.h hVar = (r.h) c1113q.f9955b.invoke();
                    C1112p c1112p = (C1112p) obj3;
                    int i12 = c1112p.f9951c;
                    int c5 = hVar.c();
                    Object obj5 = c1112p.f9949a;
                    if ((i12 >= c5 || !hVar.d(i12).equals(obj5)) && (i12 = hVar.f9457d.b(obj5)) != -1) {
                        c1112p.f9951c = i12;
                    }
                    boolean z4 = i12 != -1;
                    c0216p10.V(Boolean.valueOf(z4));
                    boolean g6 = c0216p10.g(z4);
                    c0216p10.S(-869707859);
                    if (z4) {
                        c0216p10.S(-2120139493);
                        m3.z.d(hVar, c1113q.f9954a, i12, obj5, c0216p10, 0);
                        c0216p10.q(false);
                    } else {
                        c0216p10.n(g6);
                    }
                    c0216p10.q(false);
                    c0216p10.t();
                    boolean h7 = c0216p10.h(c1112p);
                    Object I6 = c0216p10.I();
                    if (h7 || I6 == w4) {
                        I6 = new A.g0(27, c1112p);
                        c0216p10.c0(I6);
                    }
                    C0192d.d(obj5, (Function1) I6, c0216p10);
                }
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                break;
            case 12:
                C0216p c0216p11 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p11.z()) {
                    c0216p11.N();
                } else {
                    C1092H c1092h = (C1092H) obj4;
                    c1092h.f9895b.setValue(M1.a.Q(c0216p11));
                    ((O.a) obj3).g(c1092h, c0216p11, 0);
                }
                break;
            case 13:
                C0216p c0216p12 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p12.z()) {
                    c0216p12.N();
                } else {
                    ((t1.o) obj4).f10678p.g((C1193i) obj3, c0216p12, 0);
                }
                break;
            case 14:
                C0216p c0216p13 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p13.z()) {
                    c0216p13.N();
                } else {
                    m3.o.d((P.i) obj4, (O.a) obj3, c0216p13, 0);
                }
                break;
            default:
                C0216p c0216p14 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p14.z()) {
                    c0216p14.N();
                } else {
                    C1193i c1193i = (C1193i) obj4;
                    s1.v vVar = c1193i.f10510e;
                    Intrinsics.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((t1.h) vVar).f10649o.f((C0742h) obj3, c1193i, c0216p14, 0);
                }
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0120c(Object obj, Function2 function2, int i2) {
        super(2);
        this.f1725d = i2;
        this.f1727i = obj;
        this.f1726e = function2;
    }
}
