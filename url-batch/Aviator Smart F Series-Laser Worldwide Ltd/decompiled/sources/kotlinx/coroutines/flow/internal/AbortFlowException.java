package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class AbortFlowException extends CancellationException {
    public final transient kotlinx.coroutines.flow.f owner;

    public AbortFlowException(kotlinx.coroutines.flow.f fVar) {
        super("Flow was aborted, no more elements needed");
        this.owner = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
