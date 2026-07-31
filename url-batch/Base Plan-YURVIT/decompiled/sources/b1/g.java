package b1;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final transient G0.i f1747e;

    public g(G0.i iVar) {
        this.f1747e = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1747e.toString();
    }
}
