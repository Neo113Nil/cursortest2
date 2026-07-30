package l1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends CancellationException {
    public l(long j8) {
        super("Timed out waiting for " + j8 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(t.f5828b);
        return this;
    }
}
