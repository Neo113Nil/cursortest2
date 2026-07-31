package A4;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f52f;

    public a(Throwable th) {
        super(th);
        this.f52f = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f52f;
    }
}
