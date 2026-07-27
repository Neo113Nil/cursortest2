package W2;

/* loaded from: classes.dex */
public final class P extends Q {

    /* renamed from: i, reason: collision with root package name */
    public final w0 f4232i;

    public P(long j4, w0 w0Var) {
        super(j4);
        this.f4232i = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4232i.run();
    }

    @Override // W2.Q
    public final String toString() {
        return super.toString() + this.f4232i;
    }
}
