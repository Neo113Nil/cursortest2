package kotlinx.coroutines.guava;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class Cancelled {
    public final CancellationException exception;

    public Cancelled(CancellationException cancellationException) {
        this.exception = cancellationException;
    }
}
