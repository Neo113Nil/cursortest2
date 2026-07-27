package A1;

import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z1.C1393s;

/* loaded from: classes.dex */
public final class Y implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f555e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f556i;

    public /* synthetic */ Y(Object obj, int i2, Object obj2) {
        this.f554d = i2;
        this.f555e = obj;
        this.f556i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f554d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.o d4 = androidx.compose.foundation.layout.c.d(S.l.f3977a, 0.0f, 420, 1);
                    c0216p.S(72680645);
                    Q.v vVar = (Q.v) this.f555e;
                    boolean f4 = c0216p.f(vVar);
                    C1393s c1393s = (C1393s) this.f556i;
                    boolean h4 = f4 | c0216p.h(c1393s);
                    Object I3 = c0216p.I();
                    if (h4 || I3 == C0208l.f2826a) {
                        I3 = new T(vVar, 0, c1393s);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    m3.s.a(d4, null, null, false, null, null, null, false, (Function1) I3, c0216p, 6, 254);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.o d5 = androidx.compose.foundation.layout.c.d(S.l.f3977a, 0.0f, 360, 1);
                    c0216p2.S(-1578524799);
                    Object I4 = c0216p2.I();
                    if (I4 == C0208l.f2826a) {
                        I4 = new T((InterfaceC0191c0) this.f555e, 1, (InterfaceC0191c0) this.f556i);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    m3.s.a(d5, null, null, false, null, null, null, false, (Function1) I4, c0216p2, 100663302, 254);
                }
                break;
        }
        return Unit.f7487a;
    }
}
