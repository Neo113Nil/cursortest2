package F;

import W0.InterfaceC0080u;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class J extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f265i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.g f266j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0022d f267k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(O0.p pVar, C0022d c0022d, G0.d dVar) {
        super(2, dVar);
        this.f266j = (I0.g) pVar;
        this.f267k = c0022d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I0.g, O0.p] */
    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new J(this.f266j, this.f267k, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((J) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [I0.g, O0.p] */
    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f265i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return obj;
        }
        AbstractC0086a.I(obj);
        Object obj2 = this.f267k.f342b;
        this.f265i = 1;
        Object i3 = this.f266j.i(obj2, this);
        H0.a aVar = H0.a.f511e;
        return i3 == aVar ? aVar : i3;
    }
}
