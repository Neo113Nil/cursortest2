package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;
import android.content.Context;

/* loaded from: classes.dex */
public final class J extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f35i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f36j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O f37k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f38l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String str, O o2, double d2, G0.d dVar) {
        super(2, dVar);
        this.f36j = str;
        this.f37k = o2;
        this.f38l = d2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new J(this.f36j, this.f37k, this.f38l, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((J) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f35i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            I.d dVar = new I.d(this.f36j);
            Context context = this.f37k.f54e;
            if (context == null) {
                P0.h.g("context");
                throw null;
            }
            E a2 = P.a(context);
            I i3 = new I(dVar, this.f38l, null);
            this.f35i = 1;
            Object f2 = a2.f(new I.h(i3, null), this);
            H0.a aVar = H0.a.f511e;
            if (f2 == aVar) {
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
