package F;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class D extends I0.g implements O0.l {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f235i;

    /* renamed from: j, reason: collision with root package name */
    public int f236j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f237k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p2, G0.d dVar) {
        super(1, dVar);
        this.f237k = p2;
    }

    @Override // O0.l
    public final Object j(Object obj) {
        return new D(this.f237k, (G0.d) obj).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r6 != r4) goto L22;
     */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        Throwable th;
        l0 l0Var;
        int i2 = this.f236j;
        P p2 = this.f237k;
        H0.a aVar = H0.a.f511e;
        try {
        } catch (Throwable th2) {
            th = th2;
            k0 g2 = p2.g();
            this.f235i = th;
            this.f236j = 2;
            obj = g2.a();
        }
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            this.f236j = 1;
            obj = P.e(p2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f235i;
                AbstractC0086a.I(obj);
                l0Var = new d0(th, ((Number) obj).intValue());
                return new D0.c(l0Var, Boolean.TRUE);
            }
            AbstractC0086a.I(obj);
        }
        l0Var = (l0) obj;
        return new D0.c(l0Var, Boolean.TRUE);
    }
}
