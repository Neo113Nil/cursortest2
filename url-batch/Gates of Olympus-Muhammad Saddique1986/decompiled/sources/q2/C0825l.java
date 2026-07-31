package q2;

/* renamed from: q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825l extends b0 implements InterfaceC0824k {

    /* renamed from: h, reason: collision with root package name */
    public final f0 f7910h;

    public C0825l(f0 f0Var) {
        this.f7910h = f0Var;
    }

    @Override // q2.InterfaceC0824k
    public final boolean c(Throwable th) {
        return j().I(th);
    }

    @Override // q2.b0
    public final boolean k() {
        return true;
    }

    @Override // q2.b0
    public final void l(Throwable th) {
        this.f7910h.E(j());
    }
}
