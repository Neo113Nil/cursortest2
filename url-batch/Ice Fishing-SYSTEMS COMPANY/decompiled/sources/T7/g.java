package T7;

import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final transient InterfaceC5138i f3138n;

    public g(InterfaceC5138i interfaceC5138i) {
        this.f3138n = interfaceC5138i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3138n.toString();
    }
}
