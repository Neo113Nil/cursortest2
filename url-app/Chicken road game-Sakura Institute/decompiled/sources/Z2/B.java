package Z2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class B implements P, InterfaceC0330f, a3.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4611d;

    public B(z zVar) {
        this.f4611d = zVar;
    }

    @Override // a3.q
    public final InterfaceC0330f c(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || aVar != Y2.a.f4399e) ? H.l(this, coroutineContext, i2, aVar) : this;
    }

    @Override // Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        ((S) this.f4611d).e(interfaceC0331g, aVar);
        return D2.a.f2163d;
    }

    @Override // Z2.P
    public final Object getValue() {
        return ((S) this.f4611d).getValue();
    }
}
