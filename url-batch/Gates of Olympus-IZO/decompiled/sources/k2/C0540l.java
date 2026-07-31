package k2;

/* renamed from: k2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540l extends b0 implements InterfaceC0539k {

    /* renamed from: h, reason: collision with root package name */
    public final f0 f5371h;

    public C0540l(f0 f0Var) {
        this.f5371h = f0Var;
    }

    @Override // k2.InterfaceC0539k
    public final boolean c(Throwable th) {
        return j().B(th);
    }

    @Override // k2.b0
    public final boolean k() {
        return true;
    }

    @Override // k2.b0
    public final void l(Throwable th) {
        this.f5371h.s(j());
    }
}
