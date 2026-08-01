package w1;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient b1.j f4495a;

    public e(b1.j jVar) {
        this.f4495a = jVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f4495a.toString();
    }
}
