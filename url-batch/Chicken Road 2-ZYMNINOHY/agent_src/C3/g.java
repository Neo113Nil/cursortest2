package C3;

import f3.InterfaceC0430h;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0430h f291a;

    public g(InterfaceC0430h interfaceC0430h) {
        this.f291a = interfaceC0430h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f291a.toString();
    }
}
