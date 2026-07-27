package b3;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final transient CoroutineContext f5653d;

    public e(CoroutineContext coroutineContext) {
        this.f5653d = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f5653d.toString();
    }
}
