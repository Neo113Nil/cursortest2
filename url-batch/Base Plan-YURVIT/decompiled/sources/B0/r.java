package B0;

import F.InterfaceC0027i;
import W0.InterfaceC0080u;
import a.AbstractC0086a;
import android.content.Context;

/* loaded from: classes.dex */
public final class r extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public P0.o f109i;

    /* renamed from: j, reason: collision with root package name */
    public int f110j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f111k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0.o f113m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, O o2, P0.o oVar, G0.d dVar) {
        super(2, dVar);
        this.f111k = str;
        this.f112l = o2;
        this.f113m = oVar;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new r(this.f111k, this.f112l, this.f113m, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((r) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        P0.o oVar;
        int i2 = this.f110j;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            I.d dVar = new I.d(this.f111k);
            Context context = this.f112l.f54e;
            if (context == null) {
                P0.h.g("context");
                throw null;
            }
            C0016q c0016q = new C0016q(((InterfaceC0027i) P.a(context).f20f).u(), dVar, 0);
            oVar = this.f113m;
            this.f109i = oVar;
            this.f110j = 1;
            obj = Z0.q.c(c0016q, this);
            H0.a aVar = H0.a.f511e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f109i;
            AbstractC0086a.I(obj);
        }
        oVar.f807e = obj;
        return D0.h.f206a;
    }
}
