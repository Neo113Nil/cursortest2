package p2;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final transient P1.i f6772d;

    public e(P1.i iVar) {
        this.f6772d = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f6772d.toString();
    }
}
