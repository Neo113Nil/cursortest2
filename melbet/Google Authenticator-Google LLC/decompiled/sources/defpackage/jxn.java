package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxn implements Runnable {
    final jxl a;
    public final jxr b;
    private final Executor c;

    public jxn(Executor executor, jxl jxlVar, jxr jxrVar) {
        this.c = executor;
        this.a = jxlVar;
        this.b = jxrVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            jxr.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
