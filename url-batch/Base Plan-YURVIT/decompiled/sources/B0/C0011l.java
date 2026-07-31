package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;
import android.content.Context;
import java.util.List;

/* renamed from: B0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f91i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f92j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f93k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0011l(O o2, List list, G0.d dVar) {
        super(2, dVar);
        this.f92j = o2;
        this.f93k = list;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new C0011l(this.f92j, this.f93k, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0011l) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f91i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return obj;
        }
        AbstractC0086a.I(obj);
        Context context = this.f92j.f54e;
        if (context == null) {
            P0.h.g("context");
            throw null;
        }
        E a2 = P.a(context);
        C0010k c0010k = new C0010k(this.f93k, null);
        this.f91i = 1;
        Object f2 = a2.f(new I.h(c0010k, null), this);
        H0.a aVar = H0.a.f511e;
        return f2 == aVar ? aVar : f2;
    }
}
