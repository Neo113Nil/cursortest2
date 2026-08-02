package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aof extends aoa {
    public static final aof a = new aof();
    private static final AtomicInteger b = new AtomicInteger(0);

    @Override // defpackage.aoa, java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
