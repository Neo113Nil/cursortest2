package d1;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final transient H0.i f2074e;

    public g(H0.i iVar) {
        this.f2074e = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f2074e.toString();
    }
}
