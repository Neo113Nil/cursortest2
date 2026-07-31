package a1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final transient Z0.e f1140e;

    public a(Z0.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1140e = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
