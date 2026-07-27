package a3;

import D.C0127e0;
import W2.AbstractC0296s;
import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0431i extends AbstractC0429g {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0330f f4961j;

    public AbstractC0431i(int i2, Y2.a aVar, InterfaceC0330f interfaceC0330f, CoroutineContext coroutineContext) {
        super(coroutineContext, i2, aVar);
        this.f4961j = interfaceC0330f;
    }

    @Override // a3.AbstractC0429g, Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        if (this.f4956e == -3) {
            CoroutineContext p4 = aVar.p();
            Boolean bool = Boolean.FALSE;
            W2.r rVar = new W2.r(0);
            CoroutineContext coroutineContext = this.f4955d;
            CoroutineContext s4 = !((Boolean) coroutineContext.i(bool, rVar)).booleanValue() ? p4.s(coroutineContext) : AbstractC0296s.a(p4, coroutineContext, false);
            if (Intrinsics.a(s4, p4)) {
                Object j4 = j(interfaceC0331g, aVar);
                return j4 == D2.a.f2163d ? j4 : Unit.f7487a;
            }
            C2.b bVar = kotlin.coroutines.e.f7496f;
            if (Intrinsics.a(s4.k(bVar), p4.k(bVar))) {
                CoroutineContext p5 = aVar.p();
                if (!(interfaceC0331g instanceof x) && !(interfaceC0331g instanceof s)) {
                    interfaceC0331g = new C0127e0(interfaceC0331g, p5);
                }
                Object a4 = AbstractC0425c.a(s4, interfaceC0331g, b3.v.b(s4), new C0430h(this, null), aVar);
                return a4 == D2.a.f2163d ? a4 : Unit.f7487a;
            }
        }
        Object e4 = super.e(interfaceC0331g, aVar);
        return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
    }

    @Override // a3.AbstractC0429g
    public final Object f(Y2.q qVar, C0428f c0428f) {
        Object j4 = j(new x(qVar), c0428f);
        return j4 == D2.a.f2163d ? j4 : Unit.f7487a;
    }

    public abstract Object j(InterfaceC0331g interfaceC0331g, C2.a aVar);

    @Override // a3.AbstractC0429g
    public final String toString() {
        return this.f4961j + " -> " + super.toString();
    }
}
