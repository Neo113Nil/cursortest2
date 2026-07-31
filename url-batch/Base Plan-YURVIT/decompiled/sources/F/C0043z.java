package F;

import x.InterfaceC0249a;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043z implements Z0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f453f;

    public /* synthetic */ C0043z(int i2, Object obj) {
        this.f452e = i2;
        this.f453f = obj;
    }

    @Override // Z0.e
    public final Object a(Object obj, I0.b bVar) {
        Object d2;
        switch (this.f452e) {
            case 0:
                P p2 = (P) this.f453f;
                return ((p2.f295l.z() instanceof b0) || (d2 = P.d(p2, true, bVar)) != H0.a.f511e) ? D0.h.f206a : d2;
            case 1:
                ((InterfaceC0249a) this.f453f).accept(obj);
                return D0.h.f206a;
            default:
                ((P0.o) this.f453f).f807e = obj;
                throw new a1.a(this);
        }
    }
}
