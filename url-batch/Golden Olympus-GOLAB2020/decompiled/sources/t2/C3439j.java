package t2;

import kotlin.coroutines.CoroutineContext;

/* renamed from: t2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3439j extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final transient CoroutineContext f46230b;

    public C3439j(CoroutineContext coroutineContext) {
        this.f46230b = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f46230b.toString();
    }
}
