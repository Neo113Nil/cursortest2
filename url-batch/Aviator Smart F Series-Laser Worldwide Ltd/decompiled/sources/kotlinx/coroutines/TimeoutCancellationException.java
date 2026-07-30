package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException implements f0 {
    public final transient l1 coroutine;

    public TimeoutCancellationException(String str, l1 l1Var) {
        super(str);
        this.coroutine = l1Var;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }

    @Override // kotlinx.coroutines.f0
    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
