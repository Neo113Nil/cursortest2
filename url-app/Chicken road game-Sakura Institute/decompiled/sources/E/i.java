package E;

import G.C0201h0;
import G.C0205j0;
import G.InterfaceC0191c0;
import G.K0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.m0;

/* loaded from: classes.dex */
public final class i extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2196d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f2197e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f4, InterfaceC0191c0 interfaceC0191c0) {
        super(1);
        this.f2197e = f4;
        this.f2198i = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2196d) {
            case 0:
                long j4 = ((Y.f) obj).f4386a;
                float d4 = Y.f.d(j4);
                float f4 = this.f2197e;
                float f5 = d4 * f4;
                float b4 = Y.f.b(j4) * f4;
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) this.f2198i;
                if (Y.f.d(((Y.f) interfaceC0191c0.getValue()).f4386a) != f5 || Y.f.b(((Y.f) interfaceC0191c0.getValue()).f4386a) != b4) {
                    interfaceC0191c0.setValue(new Y.f(u3.l.N(f5, b4)));
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                m0 m0Var = (m0) this.f2198i;
                if (!m0Var.g()) {
                    C0201h0 c0201h0 = m0Var.f7806g;
                    if (((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c == Long.MIN_VALUE) {
                        c0201h0.d(longValue);
                        ((C0205j0) m0Var.f7800a.f7841a).setValue(Boolean.TRUE);
                    }
                    long j5 = longValue - ((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c;
                    float f6 = this.f2197e;
                    if (f6 != 0.0f) {
                        j5 = O2.c.b(j5 / f6);
                    }
                    m0Var.o(j5);
                    m0Var.h(j5, f6 == 0.0f);
                }
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m0 m0Var, float f4) {
        super(1);
        this.f2198i = m0Var;
        this.f2197e = f4;
    }
}
