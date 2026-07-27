package A1;

import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1366J;

/* loaded from: classes.dex */
public final class K0 implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.v f491e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f492i;

    public K0(int i2, InterfaceC0191c0 interfaceC0191c0, Q.v vVar) {
        this.f490d = i2;
        this.f491e = vVar;
        this.f492i = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            S.o d4 = androidx.compose.foundation.layout.c.d(S.l.f3977a, 0.0f, 380, 1);
            c0216p.S(-545963098);
            final int i2 = this.f490d;
            boolean d5 = c0216p.d(i2);
            Object I3 = c0216p.I();
            if (d5 || I3 == C0208l.f2826a) {
                final InterfaceC0191c0 interfaceC0191c0 = this.f492i;
                final Q.v vVar = this.f491e;
                I3 = new Function1() { // from class: A1.H0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        r.g LazyColumn = (r.g) obj3;
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        Q.v vVar2 = AbstractC1366J.f11818d;
                        LazyColumn.b(vVar2.size(), new C0055f0(vVar2, 3), new O.a(-632812321, true, new J0(vVar2, i2, vVar, interfaceC0191c0)));
                        return Unit.f7487a;
                    }
                };
                c0216p.c0(I3);
            }
            c0216p.q(false);
            m3.s.a(d4, null, null, false, null, null, null, false, (Function1) I3, c0216p, 6, 254);
        }
        return Unit.f7487a;
    }
}
