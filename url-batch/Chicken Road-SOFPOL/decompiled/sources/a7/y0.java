package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y0 extends w0 {

    /* renamed from: h, reason: collision with root package name */
    public final a1 f322h;
    public final z0 i;

    /* renamed from: j, reason: collision with root package name */
    public final l f323j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f324k;

    public y0(a1 a1Var, z0 z0Var, l lVar, Object obj) {
        this.f322h = a1Var;
        this.i = z0Var;
        this.f323j = lVar;
        this.f324k = obj;
    }

    @Override // a7.w0
    public final boolean k() {
        return false;
    }

    @Override // a7.w0
    public final void l(Throwable th) {
        l lVar = this.f323j;
        l V = a1.V(lVar);
        a1 a1Var = this.f322h;
        z0 z0Var = this.i;
        Object obj = this.f324k;
        if (V == null || !a1Var.e0(z0Var, V, obj)) {
            z0Var.f329d.e(new f7.h(2), 2);
            l V2 = a1.V(lVar);
            if (V2 == null || !a1Var.e0(z0Var, V2, obj)) {
                a1Var.y(a1Var.I(z0Var, obj));
            }
        }
    }
}
