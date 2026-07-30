package B5;

import J4.s;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import v5.C0977c;
import x5.C1015e;
import y5.g;
import y5.n;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final String f200i = d.class.getSimpleName().concat("_WorkerThread");

    /* renamed from: l, reason: collision with root package name */
    public static final H4.e f201l = H4.e.a(C4.e.f301d, "processorType");

    /* renamed from: m, reason: collision with root package name */
    public static final H4.e f202m = H4.e.a(C4.e.f302e, "dropped");

    /* renamed from: n, reason: collision with root package name */
    public static final String f203n = d.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    public final c f204d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f205e = new AtomicBoolean(false);

    public d(f fVar, s sVar, long j, int i2, int i5, long j7) {
        c cVar = new c(fVar, sVar, j, i5, j7, new ArrayBlockingQueue(i2));
        this.f204d = cVar;
        String str = f200i;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        AtomicInteger atomicInteger = new AtomicInteger();
        Thread newThread = defaultThreadFactory.newThread(cVar);
        newThread.setUncaughtExceptionHandler(new C1015e(newThread.getUncaughtExceptionHandler()));
        try {
            newThread.setDaemon(true);
            newThread.setName(str + "-" + atomicInteger.incrementAndGet());
            newThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        newThread.start();
    }

    @Override // y5.g
    public final C0977c c() {
        Logger logger = c.f185w;
        return this.f204d.b();
    }

    @Override // y5.g
    public final C0977c shutdown() {
        if (this.f205e.getAndSet(true)) {
            return C0977c.f8229e;
        }
        Logger logger = c.f185w;
        c cVar = this.f204d;
        cVar.getClass();
        C0977c c0977c = new C0977c();
        C0977c b7 = cVar.b();
        b7.f(new b(cVar, b7, c0977c, 0));
        return c0977c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        c cVar = this.f204d;
        sb.append(cVar.f189l);
        sb.append(", scheduleDelayNanos=");
        sb.append(cVar.f190m);
        sb.append(", maxExportBatchSize=");
        sb.append(cVar.f191n);
        sb.append(", exporterTimeoutNanos=");
        sb.append(cVar.f192o);
        sb.append('}');
        return sb.toString();
    }

    @Override // y5.g
    public final void v(M4.a aVar, n nVar) {
        c cVar = this.f204d;
        ArrayBlockingQueue arrayBlockingQueue = cVar.f194q;
        if (!arrayBlockingQueue.offer(nVar)) {
            cVar.f186d.a(1L, cVar.f187e);
        } else if (arrayBlockingQueue.size() >= cVar.f195r.get()) {
            cVar.f196s.offer(Boolean.TRUE);
        }
    }
}
