package W;

import O0.p;
import a.AbstractC0086a;
import android.app.Activity;

/* loaded from: classes.dex */
public final class j extends I0.g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f895i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f896j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f897k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f898l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, G0.d dVar) {
        super(2, dVar);
        this.f897k = bVar;
        this.f898l = activity;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        j jVar = new j(this.f897k, this.f898l, dVar);
        jVar.f896j = obj;
        return jVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((j) b((G0.d) obj2, (Y0.p) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f895i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            Y0.p pVar = (Y0.p) this.f896j;
            i iVar = new i(0, pVar);
            b bVar = this.f897k;
            ((X.a) bVar.f879f).b(this.f898l, new L.e(), iVar);
            H.b bVar2 = new H.b(1, bVar, iVar);
            this.f895i = 1;
            Object b2 = Y0.i.b(pVar, bVar2, this);
            H0.a aVar = H0.a.f511e;
            if (b2 == aVar) {
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
