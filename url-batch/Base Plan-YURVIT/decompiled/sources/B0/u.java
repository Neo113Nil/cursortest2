package B0;

import F.InterfaceC0027i;
import W0.InterfaceC0080u;
import a.AbstractC0086a;
import android.content.Context;

/* loaded from: classes.dex */
public final class u extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public P0.o f121i;

    /* renamed from: j, reason: collision with root package name */
    public int f122j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f123k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f124l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0.o f125m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, O o2, P0.o oVar, G0.d dVar) {
        super(2, dVar);
        this.f123k = str;
        this.f124l = o2;
        this.f125m = oVar;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new u(this.f123k, this.f124l, this.f125m, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((u) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        P0.o oVar;
        int i2 = this.f122j;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            I.d dVar = new I.d(this.f123k);
            O o2 = this.f124l;
            Context context = o2.f54e;
            if (context == null) {
                P0.h.g("context");
                throw null;
            }
            C0008i c0008i = new C0008i(((InterfaceC0027i) P.a(context).f20f).u(), dVar, o2, 1);
            oVar = this.f125m;
            this.f121i = oVar;
            this.f122j = 1;
            obj = Z0.q.c(c0008i, this);
            H0.a aVar = H0.a.f511e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f121i;
            AbstractC0086a.I(obj);
        }
        oVar.f807e = obj;
        return D0.h.f206a;
    }
}
