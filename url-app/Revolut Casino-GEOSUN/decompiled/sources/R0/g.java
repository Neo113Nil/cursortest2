package R0;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final transient w0.i f905e;

    public g(w0.i iVar) {
        this.f905e = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f905e.toString();
    }
}
