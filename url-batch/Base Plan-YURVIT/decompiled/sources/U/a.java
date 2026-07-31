package U;

import D0.h;
import F.C0043z;
import I0.g;
import O0.p;
import W0.InterfaceC0080u;
import Z0.d;
import a.AbstractC0086a;
import x.InterfaceC0249a;

/* loaded from: classes.dex */
public final class a extends g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f853i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f854j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0249a f855k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, InterfaceC0249a interfaceC0249a, G0.d dVar2) {
        super(2, dVar2);
        this.f854j = dVar;
        this.f855k = interfaceC0249a;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new a(this.f854j, this.f855k, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((a) b((G0.d) obj2, (InterfaceC0080u) obj)).m(h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f853i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            C0043z c0043z = new C0043z(1, this.f855k);
            this.f853i = 1;
            Object m2 = this.f854j.m(c0043z, this);
            H0.a aVar = H0.a.f511e;
            if (m2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
        }
        return h.f206a;
    }
}
