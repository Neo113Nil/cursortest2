package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gof implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public gof(Runnable runnable, hvm hvmVar, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.c = runnable;
        this.d = hvmVar;
        this.a = j;
        this.b = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [hvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            this.c.run();
            eos.J(this.d.schedule(this, this.a, (TimeUnit) this.b));
            return;
        }
        if (((AtomicBoolean) this.b).get()) {
            ((Application) this.c).unregisterActivityLifecycleCallbacks(this.d);
            long j = this.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < j) {
                ((hkf) ((hkf) gog.a.f()).i("com/google/apps/tiktok/monitoring/primes/PrimesStartupMetricsModule$2", "run", 99, "PrimesStartupMetricsModule.java")).w("Startup time is in the future. startupTime: %s, currentTime: %s", new eki(j), new eki(elapsedRealtime));
                return;
            }
            eim a = eim.a();
            a.a.f(new eik("ColdLaunchBackground"), j, elapsedRealtime);
            eim a2 = eim.a();
            a2.a.g(new eik("ColdLaunchBackgroundMemory"));
        }
    }

    public gof(AtomicBoolean atomicBoolean, Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, long j, int i) {
        this.e = i;
        this.b = atomicBoolean;
        this.c = application;
        this.d = activityLifecycleCallbacks;
        this.a = j;
    }
}
