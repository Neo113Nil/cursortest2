package M5;

import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    public final transient InterfaceC0569i f1594f;

    public g(InterfaceC0569i interfaceC0569i) {
        this.f1594f = interfaceC0569i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1594f.toString();
    }
}
