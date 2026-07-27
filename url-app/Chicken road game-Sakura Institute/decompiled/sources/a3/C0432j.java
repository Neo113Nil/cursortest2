package a3;

import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: a3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432j extends AbstractC0431i {
    @Override // a3.AbstractC0429g
    public final AbstractC0429g g(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return new C0432j(i2, aVar, this.f4961j, coroutineContext);
    }

    @Override // a3.AbstractC0429g
    public final InterfaceC0330f h() {
        return this.f4961j;
    }

    @Override // a3.AbstractC0431i
    public final Object j(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        Object e4 = this.f4961j.e(interfaceC0331g, aVar);
        return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
    }
}
