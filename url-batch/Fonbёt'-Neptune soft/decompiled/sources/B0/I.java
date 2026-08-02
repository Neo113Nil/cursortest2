package B0;

import Y0.InterfaceC0126u;
import android.content.Context;

/* loaded from: classes.dex */
public final class I extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f106i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f107j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N f108k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, N n2, double d2, H0.d dVar) {
        super(2, dVar);
        this.f107j = str;
        this.f108k = n2;
        this.f109l = d2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new I(this.f107j, this.f108k, this.f109l, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((I) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f106i;
        if (i2 == 0) {
            i1.a.G(obj);
            L.d dVar = new L.d(this.f107j);
            Context context = this.f108k.f125e;
            if (context == null) {
                Q0.h.g("context");
                throw null;
            }
            B.m a2 = O.a(context);
            H h2 = new H(dVar, this.f109l, null);
            this.f106i = 1;
            if (a2.c(new L.h(h2, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return F0.h.f469a;
    }
}
