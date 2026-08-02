package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqb implements Closeable {
    public final Deque a = new ArrayDeque(4);
    public Throwable b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.b;
        while (true) {
            Deque deque = this.a;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        hqa.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.b != null || th == null) {
            return;
        }
        hag.a(th, IOException.class);
        hag.b(th);
        throw new AssertionError(th);
    }
}
