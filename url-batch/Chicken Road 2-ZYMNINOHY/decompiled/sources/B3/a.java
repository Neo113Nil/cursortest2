package B3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f218a;

    public a(A3.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f218a = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
