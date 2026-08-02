package defpackage;

import java.io.Closeable;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fba implements Closeable {
    private final /* synthetic */ int a;
    private Object b;

    public fba(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        if (i != 0) {
            if (obj != null) {
                ((FileLock) obj).release();
                this.b = null;
                return;
            }
            return;
        }
        if (obj != null) {
            ((Semaphore) obj).release();
            this.b = null;
        }
    }
}
