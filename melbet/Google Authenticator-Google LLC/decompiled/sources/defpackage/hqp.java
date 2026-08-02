package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqp {
    public static final ScheduledExecutorService a;
    private static final ThreadFactory b;

    static {
        ids idsVar = new ids((char[]) null, (byte[]) null);
        idsVar.n("RetryingFuture-Timer-%d");
        idsVar.m(true);
        ThreadFactory p = ids.p(idsVar);
        b = p;
        a = Executors.newSingleThreadScheduledExecutor(p);
    }
}
