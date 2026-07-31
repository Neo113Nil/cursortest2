package F;

import a.AbstractC0086a;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025g extends I0.g implements O0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f359i;

    @Override // O0.l
    public final Object j(Object obj) {
        C0025g c0025g = new C0025g(1, (G0.d) obj);
        D0.h hVar = D0.h.f206a;
        c0025g.m(hVar);
        return hVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f359i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            this.f359i = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0086a.I(obj);
        return D0.h.f206a;
    }
}
