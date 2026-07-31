package I;

import O0.p;
import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends I0.g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f516i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f517j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.g f518k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, G0.d dVar) {
        super(2, dVar);
        this.f518k = (I0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [I0.g, O0.p] */
    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        c cVar = new c(this.f518k, dVar);
        cVar.f517j = obj;
        return cVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((c) b((G0.d) obj2, (b) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [I0.g, O0.p] */
    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f516i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            b bVar = (b) this.f517j;
            this.f516i = 1;
            obj = this.f518k.i(bVar, this);
            H0.a aVar = H0.a.f511e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
        }
        b bVar2 = (b) obj;
        P0.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f515b.f20f).set(true);
        return bVar2;
    }
}
