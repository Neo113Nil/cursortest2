package k1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n0 extends m0 {

    /* renamed from: f, reason: collision with root package name */
    public final q0 f697f;

    /* renamed from: g, reason: collision with root package name */
    public final o0 f698g;

    /* renamed from: h, reason: collision with root package name */
    public final h f699h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f700i;

    public n0(q0 q0Var, o0 o0Var, h hVar, Object obj) {
        this.f697f = q0Var;
        this.f698g = o0Var;
        this.f699h = hVar;
        this.f700i = obj;
    }

    @Override // c1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return t0.g.f1178a;
    }

    @Override // k1.m0
    public final void o(Throwable th) {
        h D = q0.D(this.f699h);
        q0 q0Var = this.f697f;
        o0 o0Var = this.f698g;
        Object obj = this.f700i;
        if (D != null) {
            while (t.d(D.f680f, new n0(q0Var, o0Var, D, obj), 1) == s0.f716b) {
                D = q0.D(D);
                if (D == null) {
                }
            }
            return;
        }
        q0Var.l(q0Var.t(o0Var, obj));
    }
}
