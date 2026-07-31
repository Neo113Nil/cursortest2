package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 extends e7.d {

    /* renamed from: a, reason: collision with root package name */
    public long f2358a;

    /* renamed from: b, reason: collision with root package name */
    public a7.h f2359b;

    @Override // e7.d
    public final boolean a(e7.b bVar) {
        d0 d0Var = (d0) bVar;
        if (this.f2358a >= 0) {
            return false;
        }
        long j7 = d0Var.f2350k;
        if (j7 < d0Var.f2351l) {
            d0Var.f2351l = j7;
        }
        this.f2358a = j7;
        return true;
    }

    @Override // e7.d
    public final g6.c[] b(e7.b bVar) {
        long j7 = this.f2358a;
        this.f2358a = -1L;
        this.f2359b = null;
        return ((d0) bVar).u(j7);
    }
}
