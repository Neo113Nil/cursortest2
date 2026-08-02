package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hvc extends hsw {
    public static hvc v(hvi hviVar) {
        return hviVar instanceof hvc ? (hvc) hviVar : new hup(hviVar);
    }

    public final hvc w(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (hvc) hnu.aQ(this, j, timeUnit, scheduledExecutorService);
    }
}
