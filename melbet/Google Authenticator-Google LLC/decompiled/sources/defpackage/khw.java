package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khw implements Runnable {
    private static final Logger a = Logger.getLogger(khw.class.getName());
    private final Runnable b;

    public khw(Runnable runnable) {
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.b.toString()), th);
            hag.b(th);
            throw new AssertionError(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.b.toString() + ")";
    }
}
