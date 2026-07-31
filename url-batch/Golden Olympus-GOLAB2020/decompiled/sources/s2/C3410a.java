package s2;

import java.util.concurrent.CancellationException;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3410a extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f45955b;

    public C3410a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f45955b = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
