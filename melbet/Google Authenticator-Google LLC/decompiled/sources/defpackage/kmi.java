package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmi {
    private static final kmi c = new kmi();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(kmh kmhVar) {
        return c.b(kmhVar);
    }

    public static void c(kmh kmhVar, Object obj) {
        c.d(kmhVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    final synchronized Object b(kmh kmhVar) {
        kmg kmgVar;
        IdentityHashMap identityHashMap = this.a;
        kmgVar = (kmg) identityHashMap.get(kmhVar);
        if (kmgVar == null) {
            kmgVar = new kmg(kmhVar.a());
            identityHashMap.put(kmhVar, kmgVar);
        }
        ?? r4 = kmgVar.c;
        if (r4 != 0) {
            r4.cancel(false);
            kmgVar.c = null;
        }
        kmgVar.b++;
        return kmgVar.a;
    }

    final synchronized void d(kmh kmhVar, Object obj) {
        Throwable th;
        kmi kmiVar;
        try {
            try {
                kmg kmgVar = (kmg) this.a.get(kmhVar);
                if (kmgVar == null) {
                    throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(kmhVar))));
                }
                boolean z = true;
                hoq.y(obj == kmgVar.a, "Releasing the wrong instance");
                hoq.I(kmgVar.b > 0, "Refcount has already reached zero");
                int i = kmgVar.b - 1;
                kmgVar.b = i;
                if (i == 0) {
                    if (kmgVar.c != null) {
                        z = false;
                    }
                    hoq.I(z, "Destroy task already scheduled");
                    ScheduledExecutorService scheduledExecutorService = this.b;
                    if (scheduledExecutorService == null) {
                        try {
                            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(khd.g("grpc-shared-destroyer-%d"));
                            this.b = scheduledExecutorService;
                        } catch (Throwable th2) {
                            th = th2;
                            kmiVar = this;
                            throw th;
                        }
                    }
                    kmgVar.c = scheduledExecutorService.schedule(new khw(new fv(this, kmgVar, kmhVar, obj, 14)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th3) {
                th = th3;
                kmiVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
