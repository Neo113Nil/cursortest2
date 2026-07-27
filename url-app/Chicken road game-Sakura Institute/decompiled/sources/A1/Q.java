package A1;

import D.AbstractC0165r0;
import D.N1;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.W0;
import Z.C0323u;
import a.AbstractC0345a;
import f0.AbstractC0576G;
import f0.C0584e;
import f0.C0585f;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import q.C1010N;
import z1.EnumC1387m;
import z2.C1405I;

/* loaded from: classes.dex */
public final class Q implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f529e;

    public /* synthetic */ Q(int i2, InterfaceC0191c0 interfaceC0191c0) {
        this.f528d = i2;
        this.f529e = interfaceC0191c0;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0585f c0585f;
        int i2 = 0;
        S.l lVar = S.l.f3977a;
        InterfaceC0191c0 interfaceC0191c0 = this.f529e;
        switch (this.f528d) {
            case 0:
                C1010N FlowRow = (C1010N) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                if ((intValue & 17) == 16 && c0216p.z()) {
                    c0216p.N();
                } else {
                    EnumC1387m[] values = EnumC1387m.values();
                    int length = values.length;
                    int i4 = 0;
                    while (i4 < length) {
                        EnumC1387m enumC1387m = values[i4];
                        C0205j0 c0205j0 = AbstractC0071n0.f634a;
                        boolean z4 = ((EnumC1387m) interfaceC0191c0.getValue()) == enumC1387m;
                        c0216p.S(174833348);
                        boolean f4 = c0216p.f(enumC1387m);
                        Object I3 = c0216p.I();
                        if (f4 || I3 == C0208l.f2826a) {
                            I3 = new H(enumC1387m, 3, interfaceC0191c0);
                            c0216p.c0(I3);
                        }
                        c0216p.q(false);
                        C0216p c0216p2 = c0216p;
                        D.J.a(z4, (Function0) I3, O.f.b(-1858558921, new P(enumC1387m, i2), c0216p), androidx.compose.foundation.layout.b.h(lVar, 2), false, null, null, null, null, null, null, null, c0216p2, 3456, 0, 4080);
                        i4++;
                        c0216p = c0216p2;
                    }
                }
                break;
            default:
                q.g0 Button = (q.g0) obj;
                C0216p c0216p3 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((intValue2 & 17) == 16 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    if (((Long) interfaceC0191c0.getValue()) == null) {
                        c0585f = u3.d.f10940d;
                        if (c0585f == null) {
                            C0584e c0584e = new C0584e("Outlined.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            C1405I c1405i = AbstractC0576G.f6305a;
                            Z.S s4 = new Z.S(C0323u.f4542b);
                            W0 w02 = new W0(1);
                            w02.j(10.0f, 8.64f);
                            w02.h(15.27f, 12.0f);
                            w02.h(10.0f, 15.36f);
                            w02.n(8.64f);
                            w02.j(8.0f, 5.0f);
                            w02.o(14.0f);
                            w02.i(11.0f, -7.0f);
                            w02.h(8.0f, 5.0f);
                            w02.c();
                            C0584e.a(c0584e, w02.f2781d, s4);
                            c0585f = c0584e.b();
                            u3.d.f10940d = c0585f;
                        }
                    } else {
                        c0585f = AbstractC0345a.f4748f;
                        if (c0585f == null) {
                            C0584e c0584e2 = new C0584e("Outlined.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            C1405I c1405i2 = AbstractC0576G.f6305a;
                            Z.S s5 = new Z.S(C0323u.f4542b);
                            W0 w03 = new W0(1);
                            w03.j(16.0f, 8.0f);
                            w03.o(8.0f);
                            w03.f(8.0f);
                            w03.n(8.0f);
                            w03.g(8.0f);
                            ArrayList arrayList = w03.f2781d;
                            arrayList.add(new f0.v(2.0f, -2.0f));
                            w03.f(6.0f);
                            w03.o(12.0f);
                            w03.g(12.0f);
                            w03.n(6.0f);
                            w03.c();
                            C0584e.a(c0584e2, arrayList, s5);
                            c0585f = c0584e2.b();
                            AbstractC0345a.f4748f = c0585f;
                        }
                    }
                    AbstractC0165r0.a(c0585f, null, 0L, c0216p3, 48, 12);
                    AbstractC1024c.a(c0216p3, androidx.compose.foundation.layout.c.j(lVar, 4));
                    N1.b(((Long) interfaceC0191c0.getValue()) == null ? "Start" : "Stop", null, 0L, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 196608, 0, 130974);
                }
                break;
        }
        return Unit.f7487a;
    }
}
