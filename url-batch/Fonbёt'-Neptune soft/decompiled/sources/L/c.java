package L;

import P0.p;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends J0.g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f759i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f760j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J0.g f761k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, H0.d dVar) {
        super(2, dVar);
        this.f761k = (J0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J0.g, P0.p] */
    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        c cVar = new c(this.f761k, dVar);
        cVar.f760j = obj;
        return cVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((c) b((H0.d) obj2, (b) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J0.g, P0.p] */
    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f759i;
        if (i2 == 0) {
            i1.a.G(obj);
            b bVar = (b) this.f760j;
            this.f759i = 1;
            obj = this.f761k.h(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        b bVar2 = (b) obj;
        Q0.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f758b.f78f).set(true);
        return bVar2;
    }
}
