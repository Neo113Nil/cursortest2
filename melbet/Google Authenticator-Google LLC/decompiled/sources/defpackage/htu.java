package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htu extends IdentityHashMap implements AutoCloseable {
    public final bry a = new bry(this, (char[]) null);
    private volatile boolean b;
    private volatile CountDownLatch c;

    public final void a(AutoCloseable autoCloseable, Executor executor) {
        executor.getClass();
        synchronized (this) {
            if (this.b) {
                htz.d(autoCloseable, executor);
            } else {
                put(autoCloseable, executor);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                htz.d((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
