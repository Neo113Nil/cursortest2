package B0;

import I.InterfaceC0074i;
import Y0.InterfaceC0126u;
import android.content.Context;

/* loaded from: classes.dex */
public final class u extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public Q0.o f191i;

    /* renamed from: j, reason: collision with root package name */
    public int f192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f194l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q0.o f195m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, N n2, Q0.o oVar, H0.d dVar) {
        super(2, dVar);
        this.f193k = str;
        this.f194l = n2;
        this.f195m = oVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new u(this.f193k, this.f194l, this.f195m, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((u) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        Q0.o oVar;
        I0.a aVar = I0.a.f733e;
        int i2 = this.f192j;
        if (i2 == 0) {
            i1.a.G(obj);
            L.d dVar = new L.d(this.f193k);
            N n2 = this.f194l;
            Context context = n2.f125e;
            if (context == null) {
                Q0.h.g("context");
                throw null;
            }
            C0031i c0031i = new C0031i(((InterfaceC0074i) O.a(context).f78f).getData(), dVar, n2);
            Q0.o oVar2 = this.f195m;
            this.f191i = oVar2;
            this.f192j = 1;
            Object c2 = b1.q.c(c0031i, this);
            if (c2 == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f191i;
            i1.a.G(obj);
        }
        oVar.f983e = obj;
        return F0.h.f469a;
    }
}
