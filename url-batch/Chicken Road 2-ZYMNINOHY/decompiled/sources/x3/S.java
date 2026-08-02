package x3;

/* loaded from: classes.dex */
public final class S extends Y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16006e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16007f;

    public /* synthetic */ S(int i4, Object obj) {
        this.f16006e = i4;
        this.f16007f = obj;
    }

    @Override // x3.P
    public final void d(Throwable th) {
        switch (this.f16006e) {
            case 0:
                ((P) this.f16007f).d(th);
                break;
            default:
                Z z = (Z) this.f16007f;
                Object A4 = j().A();
                if (!(A4 instanceof C1554n)) {
                    z.resumeWith(AbstractC1562w.l(A4));
                    break;
                } else {
                    z.resumeWith(O3.l.h(((C1554n) A4).f16048a));
                    break;
                }
        }
    }
}
