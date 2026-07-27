package D4;

/* loaded from: classes.dex */
public final class K extends L {

    /* renamed from: c, reason: collision with root package name */
    public final s0 f468c;

    public K(long j2, s0 s0Var) {
        super(j2);
        this.f468c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f468c.run();
    }

    @Override // D4.L
    public final String toString() {
        return super.toString() + this.f468c;
    }
}
