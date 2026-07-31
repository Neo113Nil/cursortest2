package v2;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final transient V1.i f9793d;

    public e(V1.i iVar) {
        this.f9793d = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f9793d.toString();
    }
}
