package S7;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class a extends CancellationException {

    /* renamed from: n, reason: collision with root package name */
    public final transient R7.i f2979n;

    public a(R7.i iVar) {
        super("Flow was aborted, no more elements needed");
        this.f2979n = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
