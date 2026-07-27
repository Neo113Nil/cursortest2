package l0;

import java.util.concurrent.CancellationException;

/* renamed from: l0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813k extends CancellationException {
    public C0813k(long j4) {
        super("Timed out waiting for " + j4 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC0819q.f7921b);
        return this;
    }
}
