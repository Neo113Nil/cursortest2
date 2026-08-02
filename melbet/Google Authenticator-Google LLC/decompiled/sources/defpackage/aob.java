package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aob {
    private static final AtomicLong a = new AtomicLong(42);

    public static final void a() {
        a.incrementAndGet();
    }
}
