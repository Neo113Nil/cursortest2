package n0;

import java.util.concurrent.CancellationException;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713k extends CancellationException {
    public C0713k(long j3) {
        super("Timed out waiting for " + j3 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(q.f7306b);
        return this;
    }
}
