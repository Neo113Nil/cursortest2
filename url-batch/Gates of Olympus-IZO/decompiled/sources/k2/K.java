package k2;

/* loaded from: classes.dex */
public final class K extends L {

    /* renamed from: f, reason: collision with root package name */
    public final r0 f5319f;

    public K(long j3, r0 r0Var) {
        super(j3);
        this.f5319f = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5319f.run();
    }

    @Override // k2.L
    public final String toString() {
        return super.toString() + this.f5319f;
    }
}
