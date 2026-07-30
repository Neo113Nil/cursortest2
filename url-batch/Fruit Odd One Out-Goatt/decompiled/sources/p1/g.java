package p1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final transient v0.h f1045b;

    public g(v0.h hVar) {
        this.f1045b = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1045b.toString();
    }
}
