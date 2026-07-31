package q2;

/* loaded from: classes.dex */
public final class K extends L {

    /* renamed from: f, reason: collision with root package name */
    public final r0 f7858f;

    public K(long j3, r0 r0Var) {
        super(j3);
        this.f7858f = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7858f.run();
    }

    @Override // q2.L
    public final String toString() {
        return super.toString() + this.f7858f;
    }
}
