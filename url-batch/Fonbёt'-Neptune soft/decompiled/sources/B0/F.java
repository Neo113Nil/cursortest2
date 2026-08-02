package B0;

import Y0.InterfaceC0126u;
import android.content.Context;

/* loaded from: classes.dex */
public final class F extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f95i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f96j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N f97k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f98l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, N n2, boolean z2, H0.d dVar) {
        super(2, dVar);
        this.f96j = str;
        this.f97k = n2;
        this.f98l = z2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new F(this.f96j, this.f97k, this.f98l, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((F) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f95i;
        if (i2 == 0) {
            i1.a.G(obj);
            L.d dVar = new L.d(this.f96j);
            Context context = this.f97k.f125e;
            if (context == null) {
                Q0.h.g("context");
                throw null;
            }
            B.m a2 = O.a(context);
            E e2 = new E(dVar, this.f98l, null);
            this.f95i = 1;
            if (a2.c(new L.h(e2, null), this) == aVar) {
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
