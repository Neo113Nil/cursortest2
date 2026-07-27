package a3;

import W2.B;
import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class o extends AbstractC0431i {

    /* renamed from: k, reason: collision with root package name */
    public final E2.j f4980k;

    /* JADX WARN: Multi-variable type inference failed */
    public o(L2.c cVar, InterfaceC0330f interfaceC0330f, CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        super(i2, aVar, interfaceC0330f, coroutineContext);
        this.f4980k = (E2.j) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, L2.c] */
    @Override // a3.AbstractC0429g
    public final AbstractC0429g g(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return new o(this.f4980k, this.f4961j, coroutineContext, i2, aVar);
    }

    @Override // a3.AbstractC0431i
    public final Object j(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        Object d4 = B.d(new n(this, interfaceC0331g, null), aVar);
        return d4 == D2.a.f2163d ? d4 : Unit.f7487a;
    }
}
