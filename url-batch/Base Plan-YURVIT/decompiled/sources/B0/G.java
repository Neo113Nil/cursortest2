package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;
import android.content.Context;

/* loaded from: classes.dex */
public final class G extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f24i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f25j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O f26k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f27l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(String str, O o2, boolean z2, G0.d dVar) {
        super(2, dVar);
        this.f25j = str;
        this.f26k = o2;
        this.f27l = z2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new G(this.f25j, this.f26k, this.f27l, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((G) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f24i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            I.d dVar = new I.d(this.f25j);
            Context context = this.f26k.f54e;
            if (context == null) {
                P0.h.g("context");
                throw null;
            }
            E a2 = P.a(context);
            F f2 = new F(dVar, this.f27l, null);
            this.f24i = 1;
            Object f3 = a2.f(new I.h(f2, null), this);
            H0.a aVar = H0.a.f511e;
            if (f3 == aVar) {
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
