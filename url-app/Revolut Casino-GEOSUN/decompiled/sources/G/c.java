package G;

import E0.p;
import F0.i;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.C0247g;

/* loaded from: classes.dex */
public final class c extends y0.f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f329i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f330j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0.f f331k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, w0.d dVar) {
        super(2, dVar);
        this.f331k = (y0.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E0.p, y0.f] */
    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        c cVar = new c(this.f331k, dVar);
        cVar.f330j = obj;
        return cVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((c) b((b) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E0.p, y0.f] */
    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f329i;
        if (i2 == 0) {
            o.g.z(obj);
            b bVar = (b) this.f330j;
            this.f329i = 1;
            obj = this.f331k.f(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f328b.f30f).set(true);
        return bVar2;
    }
}
