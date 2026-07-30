package D;

import u0.C0247g;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends y0.f implements E0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f190i;

    @Override // E0.l
    public final Object i(Object obj) {
        C0006g c0006g = new C0006g(1, (w0.d) obj);
        C0247g c0247g = C0247g.f3005a;
        c0006g.l(c0247g);
        return c0247g;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        int i2 = this.f190i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f190i = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.g.z(obj);
        return C0247g.f3005a;
    }
}
