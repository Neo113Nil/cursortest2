package B0;

import W0.InterfaceC0080u;
import a.AbstractC0086a;
import android.content.Context;

/* loaded from: classes.dex */
public final class M extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f46i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f47j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O f48k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f49l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(String str, O o2, long j2, G0.d dVar) {
        super(2, dVar);
        this.f47j = str;
        this.f48k = o2;
        this.f49l = j2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new M(this.f47j, this.f48k, this.f49l, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((M) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f46i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            I.d dVar = new I.d(this.f47j);
            Context context = this.f48k.f54e;
            if (context == null) {
                P0.h.g("context");
                throw null;
            }
            E a2 = P.a(context);
            L l2 = new L(dVar, this.f49l, null);
            this.f46i = 1;
            Object f2 = a2.f(new I.h(l2, null), this);
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
