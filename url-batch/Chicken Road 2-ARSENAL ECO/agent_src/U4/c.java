package U4;

import H1.RunnableC0134h;
import R4.g;
import R4.o;
import c4.s;
import f4.C0374a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2617h = c.class.getSimpleName().concat("_WorkerThread");

    /* renamed from: i, reason: collision with root package name */
    public static final a4.e f2618i = a4.e.a(V3.b.f2707f, "processorType");

    /* renamed from: j, reason: collision with root package name */
    public static final a4.e f2619j = a4.e.a(V3.b.f2708g, "dropped");

    /* renamed from: k, reason: collision with root package name */
    public static final String f2620k = c.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    public final b f2621f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2622g = new AtomicBoolean(false);

    public c(e eVar, s sVar, long j4, int i7, int i8, long j7) {
        b bVar = new b(eVar, sVar, j4, i8, j7, new ArrayBlockingQueue(i7));
        this.f2621f = bVar;
        String str = f2617h;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        AtomicInteger atomicInteger = new AtomicInteger();
        Thread newThread = defaultThreadFactory.newThread(bVar);
        newThread.setUncaughtExceptionHandler(new Q4.d(newThread.getUncaughtExceptionHandler()));
        try {
            newThread.setDaemon(true);
            newThread.setName(str + "-" + atomicInteger.incrementAndGet());
            newThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        newThread.start();
    }

    @Override // R4.g
    public final O4.c c() {
        Logger logger = b.f2602t;
        return this.f2621f.b();
    }

    @Override // R4.g
    public final O4.c shutdown() {
        if (this.f2622g.getAndSet(true)) {
            return O4.c.f1787e;
        }
        Logger logger = b.f2602t;
        b bVar = this.f2621f;
        bVar.getClass();
        O4.c cVar = new O4.c();
        O4.c b7 = bVar.b();
        b7.f(new RunnableC0134h(bVar, b7, cVar, 2));
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        b bVar = this.f2621f;
        sb.append(bVar.f2606i);
        sb.append(", scheduleDelayNanos=");
        sb.append(bVar.f2607j);
        sb.append(", maxExportBatchSize=");
        sb.append(bVar.f2608k);
        sb.append(", exporterTimeoutNanos=");
        sb.append(bVar.f2609l);
        sb.append('}');
        return sb.toString();
    }

    @Override // R4.g
    public final void x(C0374a c0374a, o oVar) {
        b bVar = this.f2621f;
        ArrayBlockingQueue arrayBlockingQueue = bVar.f2611n;
        if (!arrayBlockingQueue.offer(oVar)) {
            bVar.f2603f.d(1L, bVar.f2604g);
        } else if (arrayBlockingQueue.size() >= bVar.f2612o.get()) {
            bVar.f2613p.offer(Boolean.TRUE);
        }
    }
}
