package T;

import O0.l;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class g extends AbstractC0086a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f844e;

    /* renamed from: f, reason: collision with root package name */
    public final int f845f;

    /* renamed from: g, reason: collision with root package name */
    public final a f846g;

    public g(Object obj, int i2, a aVar) {
        P0.h.e(obj, "value");
        L.d.i("verificationMode", i2);
        this.f844e = obj;
        this.f845f = i2;
        this.f846g = aVar;
    }

    @Override // a.AbstractC0086a
    public final AbstractC0086a C(String str, l lVar) {
        Object obj = this.f844e;
        return ((Boolean) lVar.j(obj)).booleanValue() ? this : new f(obj, str, this.f846g, this.f845f);
    }

    @Override // a.AbstractC0086a
    public final Object h() {
        return this.f844e;
    }
}
