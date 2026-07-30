package n6;

/* loaded from: classes.dex */
public final class L extends M {

    /* renamed from: i, reason: collision with root package name */
    public final r0 f7019i;

    public L(long j, r0 r0Var) {
        super(j);
        this.f7019i = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7019i.run();
    }

    @Override // n6.M
    public final String toString() {
        return super.toString() + this.f7019i;
    }
}
