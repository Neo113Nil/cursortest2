package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbc {
    public static final Long a = 10L;
    public static final Long b = 60000L;
    private final ConcurrentMap c = new ConcurrentHashMap();

    @Deprecated
    public fbc() {
    }

    public static gzp a(FileChannel fileChannel, boolean z) {
        try {
            return gzp.h(new fba(fileChannel.lock(0L, Long.MAX_VALUE, z), 1));
        } catch (IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return gyf.a;
            }
            throw e;
        }
    }

    public final Semaphore b(String str) {
        return (Semaphore) ConcurrentMap$EL.computeIfAbsent(this.c, str, new ejs(8));
    }
}
