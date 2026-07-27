package Z2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class A implements D, InterfaceC0330f, a3.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f4610d;

    public A(G g4) {
        this.f4610d = g4;
    }

    @Override // a3.q
    public final InterfaceC0330f c(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return H.l(this, coroutineContext, i2, aVar);
    }

    @Override // Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        this.f4610d.e(interfaceC0331g, aVar);
        return D2.a.f2163d;
    }
}
