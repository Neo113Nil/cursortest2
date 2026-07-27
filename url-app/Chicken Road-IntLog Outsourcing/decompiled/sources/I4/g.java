package I4;

import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC1223i f1292a;

    public g(InterfaceC1223i interfaceC1223i) {
        this.f1292a = interfaceC1223i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1292a.toString();
    }
}
