package H5;

/* loaded from: classes.dex */
public final class L extends M {

    /* renamed from: h, reason: collision with root package name */
    public final s0 f1036h;

    public L(long j4, s0 s0Var) {
        super(j4);
        this.f1036h = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1036h.run();
    }

    @Override // H5.M
    public final String toString() {
        return super.toString() + this.f1036h;
    }
}
