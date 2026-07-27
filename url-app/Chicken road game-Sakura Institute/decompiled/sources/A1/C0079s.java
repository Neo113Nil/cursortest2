package A1;

import D.K1;
import D.S0;
import D.W0;
import D.z1;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import Z.C0323u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z1.AbstractC1365I;

/* renamed from: A1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079s implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f663e;

    public /* synthetic */ C0079s(int i2, InterfaceC0191c0 interfaceC0191c0) {
        this.f662d = i2;
        this.f663e = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        boolean z4;
        InterfaceC0191c0 interfaceC0191c0 = this.f663e;
        G.W w4 = C0208l.f2826a;
        int i2 = 3;
        switch (this.f662d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    String str = (String) interfaceC0191c0.getValue();
                    S.o d4 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f5081a, 120, 0.0f, 2);
                    D.L0 l02 = D.L0.f1475a;
                    long j4 = AbstractC1365I.f11805f;
                    K1 c4 = D.L0.c(j4, C0323u.b(0.5f, AbstractC1365I.f11806g), j4, c0216p, 2139088895);
                    c0216p.S(-797875657);
                    Object I3 = c0216p.I();
                    if (I3 == w4) {
                        I3 = new C0058h(i2, interfaceC0191c0);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    S0.a(str, (Function1) I3, d4, false, false, null, AbstractC0082v.f741h, null, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, c4, c0216p, 1573296, 0, 0, 4194232);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    boolean z5 = ((Number) interfaceC0191c0.getValue()).intValue() == 0;
                    c0216p2.S(-382202564);
                    Object I4 = c0216p2.I();
                    if (I4 == w4) {
                        I4 = new C0048c(17, interfaceC0191c0);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    z1.b(z5, (Function0) I4, null, false, AbstractC0085y.f787a, null, 0L, 0L, null, c0216p2, 24624);
                    z4 = ((Number) interfaceC0191c0.getValue()).intValue() == 1;
                    c0216p2.S(-382198756);
                    Object I5 = c0216p2.I();
                    if (I5 == w4) {
                        I5 = new C0048c(18, interfaceC0191c0);
                        c0216p2.c0(I5);
                    }
                    c0216p2.q(false);
                    z1.b(z4, (Function0) I5, null, false, AbstractC0085y.f788b, null, 0L, 0L, null, c0216p2, 24624);
                }
                break;
            case 2:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    c0216p3.S(-545926492);
                    Object I6 = c0216p3.I();
                    if (I6 == w4) {
                        I6 = new C0048c(24, interfaceC0191c0);
                        c0216p3.c0(I6);
                    }
                    c0216p3.q(false);
                    W0.h((Function0) I6, null, false, null, null, null, null, null, null, A.f427n, c0216p3, 805306374);
                }
                break;
            case 3:
                C0216p c0216p4 = (C0216p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    boolean z6 = ((Number) interfaceC0191c0.getValue()).intValue() == 0;
                    c0216p4.S(1656620603);
                    Object I7 = c0216p4.I();
                    if (I7 == w4) {
                        I7 = new C0048c(25, interfaceC0191c0);
                        c0216p4.c0(I7);
                    }
                    c0216p4.q(false);
                    z1.b(z6, (Function0) I7, null, false, A.f414a, null, 0L, 0L, null, c0216p4, 24624);
                    boolean z7 = ((Number) interfaceC0191c0.getValue()).intValue() == 1;
                    c0216p4.S(1656624443);
                    Object I8 = c0216p4.I();
                    if (I8 == w4) {
                        I8 = new C0048c(26, interfaceC0191c0);
                        c0216p4.c0(I8);
                    }
                    c0216p4.q(false);
                    z1.b(z7, (Function0) I8, null, false, A.f415b, null, 0L, 0L, null, c0216p4, 24624);
                    z4 = ((Number) interfaceC0191c0.getValue()).intValue() == 2;
                    c0216p4.S(1656628187);
                    Object I9 = c0216p4.I();
                    if (I9 == w4) {
                        I9 = new C0048c(27, interfaceC0191c0);
                        c0216p4.c0(I9);
                    }
                    c0216p4.q(false);
                    z1.b(z4, (Function0) I9, null, false, A.f416c, null, 0L, 0L, null, c0216p4, 24624);
                }
                break;
            default:
                C0216p c0216p5 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p5.z()) {
                    c0216p5.N();
                } else {
                    c0216p5.S(-1578476194);
                    Object I10 = c0216p5.I();
                    if (I10 == w4) {
                        I10 = new O0(3, interfaceC0191c0);
                        c0216p5.c0(I10);
                    }
                    c0216p5.q(false);
                    W0.h((Function0) I10, null, false, null, null, null, null, null, null, D.f444f, c0216p5, 805306374);
                }
                break;
        }
        return Unit.f7487a;
    }
}
