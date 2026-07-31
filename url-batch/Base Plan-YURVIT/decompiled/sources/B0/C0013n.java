package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;
import java.util.List;

/* renamed from: B0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f97i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f98j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f99k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013n(O o2, List list, G0.d dVar) {
        super(2, dVar);
        this.f98j = o2;
        this.f99k = list;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new C0013n(this.f98j, this.f99k, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0013n) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f97i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return obj;
        }
        AbstractC0086a.I(obj);
        this.f97i = 1;
        Object s2 = O.s(this.f98j, this.f99k, this);
        H0.a aVar = H0.a.f511e;
        return s2 == aVar ? aVar : s2;
    }
}
