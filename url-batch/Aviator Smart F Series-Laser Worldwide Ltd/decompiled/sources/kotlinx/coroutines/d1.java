package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class d1 {
    public static final CancellationException CancellationException(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void addSuppressedThrowable(Throwable th, Throwable th2) {
        y5.b.addSuppressed(th, th2);
    }
}
