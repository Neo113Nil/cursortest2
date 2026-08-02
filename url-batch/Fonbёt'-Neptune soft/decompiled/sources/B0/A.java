package B0;

import I.InterfaceC0074i;
import Y0.InterfaceC0126u;
import android.content.Context;

/* loaded from: classes.dex */
public final class A extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public Q0.o f79i;

    /* renamed from: j, reason: collision with root package name */
    public int f80j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f81k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f82l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q0.o f83m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String str, N n2, Q0.o oVar, H0.d dVar) {
        super(2, dVar);
        this.f81k = str;
        this.f82l = n2;
        this.f83m = oVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new A(this.f81k, this.f82l, this.f83m, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((A) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        Q0.o oVar;
        I0.a aVar = I0.a.f733e;
        int i2 = this.f80j;
        if (i2 == 0) {
            i1.a.G(obj);
            L.d dVar = new L.d(this.f81k);
            Context context = this.f82l.f125e;
            if (context == null) {
                Q0.h.g("context");
                throw null;
            }
            C0039q c0039q = new C0039q(((InterfaceC0074i) O.a(context).f78f).getData(), dVar, 2);
            Q0.o oVar2 = this.f83m;
            this.f79i = oVar2;
            this.f80j = 1;
            Object c2 = b1.q.c(c0039q, this);
            if (c2 == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f79i;
            i1.a.G(obj);
        }
        oVar.f983e = obj;
        return F0.h.f469a;
    }
}
