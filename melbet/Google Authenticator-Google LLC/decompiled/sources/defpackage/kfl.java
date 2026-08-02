package defpackage;

import java.io.Closeable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface kfl extends Closeable {
    ScheduledExecutorService a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
