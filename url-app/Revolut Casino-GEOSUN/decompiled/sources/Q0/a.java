package Q0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final transient P0.e f831e;

    public a(P0.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f831e = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
