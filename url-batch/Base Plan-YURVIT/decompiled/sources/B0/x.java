package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f134i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f135j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f136k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(O o2, List list, G0.d dVar) {
        super(2, dVar);
        this.f135j = o2;
        this.f136k = list;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new x(this.f135j, this.f136k, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((x) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f134i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return obj;
        }
        AbstractC0086a.I(obj);
        this.f134i = 1;
        Object s2 = O.s(this.f135j, this.f136k, this);
        H0.a aVar = H0.a.f511e;
        return s2 == aVar ? aVar : s2;
    }
}
