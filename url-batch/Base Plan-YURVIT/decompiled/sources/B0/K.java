package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class K extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f39i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f40j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f41k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f42l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o2, String str, String str2, G0.d dVar) {
        super(2, dVar);
        this.f40j = o2;
        this.f41k = str;
        this.f42l = str2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new K(this.f40j, this.f41k, this.f42l, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((K) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f39i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            this.f39i = 1;
            Object m2 = O.m(this.f40j, this.f41k, this.f42l, this);
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
        return D0.h.f206a;
    }
}
