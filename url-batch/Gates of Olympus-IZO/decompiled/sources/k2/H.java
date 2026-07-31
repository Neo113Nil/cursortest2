package k2;

/* loaded from: classes.dex */
public final class H extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5314h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5315i;

    public /* synthetic */ H(int i3, Object obj) {
        this.f5314h = i3;
        this.f5315i = obj;
    }

    @Override // k2.b0
    public final boolean k() {
        switch (this.f5314h) {
        }
        return false;
    }

    @Override // k2.b0
    public final void l(Throwable th) {
        switch (this.f5314h) {
            case 0:
                ((G) this.f5315i).a();
                break;
            case 1:
                ((Y1.c) this.f5315i).j(th);
                break;
            default:
                Object obj = f0.f5356d.get(j());
                boolean z3 = obj instanceof C0544p;
                c0 c0Var = (c0) this.f5315i;
                if (!z3) {
                    c0Var.resumeWith(AbstractC0552y.w(obj));
                    break;
                } else {
                    c0Var.resumeWith(I2.l.t(((C0544p) obj).f5378a));
                    break;
                }
        }
    }
}
