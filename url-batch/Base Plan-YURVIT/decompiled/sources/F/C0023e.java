package F;

import a.AbstractC0086a;
import java.util.List;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023e extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f345i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f346j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f347k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023e(List list, G0.d dVar) {
        super(2, dVar);
        this.f347k = list;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        C0023e c0023e = new C0023e(this.f347k, dVar);
        c0023e.f346j = obj;
        return c0023e;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0023e) b((G0.d) obj2, (C0030l) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f345i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            C0030l c0030l = (C0030l) this.f346j;
            this.f345i = 1;
            Object a2 = AbstractC0086a.a(this.f347k, c0030l, this);
            H0.a aVar = H0.a.f511e;
            if (a2 == aVar) {
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
