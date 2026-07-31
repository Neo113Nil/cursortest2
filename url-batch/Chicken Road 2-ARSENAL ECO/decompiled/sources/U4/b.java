package U4;

import R4.o;
import c4.l;
import c4.q;
import c4.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f2602t = Logger.getLogger(b.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final l f2603f;

    /* renamed from: g, reason: collision with root package name */
    public final V3.a f2604g;

    /* renamed from: h, reason: collision with root package name */
    public final V3.a f2605h;

    /* renamed from: i, reason: collision with root package name */
    public final e f2606i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2607j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2608k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2609l;

    /* renamed from: m, reason: collision with root package name */
    public long f2610m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayBlockingQueue f2611n;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f2616s;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f2612o = new AtomicInteger(Integer.MAX_VALUE);

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f2614q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f2615r = true;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayBlockingQueue f2613p = new ArrayBlockingQueue(1);

    public b(e eVar, s sVar, long j4, int i7, long j7, ArrayBlockingQueue arrayBlockingQueue) {
        this.f2606i = eVar;
        this.f2607j = j4;
        this.f2608k = i7;
        this.f2609l = j7;
        this.f2611n = arrayBlockingQueue;
        q build = sVar.a("io.opentelemetry.sdk.logs").build();
        build.b("queueSize").b().mo3b().mo4e().f(new a(arrayBlockingQueue));
        this.f2603f = build.d("processedLogs").c("1").a("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
        a4.e eVar2 = c.f2618i;
        String str = c.f2620k;
        a4.e eVar3 = c.f2619j;
        this.f2604g = V3.c.a(eVar2, str, eVar3, Boolean.TRUE);
        this.f2605h = V3.c.a(eVar2, str, eVar3, Boolean.FALSE);
        this.f2616s = new ArrayList(i7);
    }

    public final void a() {
        Logger logger = f2602t;
        ArrayList arrayList = this.f2616s;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                O4.c r6 = this.f2606i.r(Collections.unmodifiableList(arrayList));
                r6.c(this.f2609l, TimeUnit.NANOSECONDS);
                if (r6.b()) {
                    this.f2603f.d(arrayList.size(), this.f2605h);
                } else {
                    logger.log(Level.FINE, "Exporter failed");
                }
                arrayList.clear();
            } catch (RuntimeException e4) {
                logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e4);
                arrayList.clear();
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final O4.c b() {
        AtomicReference atomicReference;
        O4.c cVar = new O4.c();
        while (true) {
            atomicReference = this.f2614q;
            if (atomicReference.compareAndSet(null, cVar)) {
                this.f2613p.offer(Boolean.TRUE);
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        O4.c cVar2 = (O4.c) atomicReference.get();
        return cVar2 == null ? O4.c.f1787e : cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2610m = System.nanoTime() + this.f2607j;
        while (this.f2615r) {
            if (this.f2614q.get() != null) {
                AtomicReference atomicReference = this.f2614q;
                ArrayList arrayList = this.f2616s;
                ArrayBlockingQueue arrayBlockingQueue = this.f2611n;
                int size = arrayBlockingQueue.size();
                while (size > 0) {
                    arrayList.add(((o) arrayBlockingQueue.poll()).b());
                    size--;
                    if (arrayList.size() >= this.f2608k) {
                        a();
                    }
                }
                a();
                O4.c cVar = (O4.c) atomicReference.get();
                if (cVar != null) {
                    cVar.e();
                    atomicReference.set(null);
                }
            }
            while (!this.f2611n.isEmpty() && this.f2616s.size() < this.f2608k) {
                this.f2616s.add(((o) this.f2611n.poll()).b());
            }
            if (this.f2616s.size() >= this.f2608k || System.nanoTime() >= this.f2610m) {
                a();
                this.f2610m = System.nanoTime() + this.f2607j;
            }
            if (this.f2611n.isEmpty()) {
                try {
                    long nanoTime = this.f2610m - System.nanoTime();
                    if (nanoTime > 0) {
                        this.f2612o.set(this.f2608k - this.f2616s.size());
                        this.f2613p.poll(nanoTime, TimeUnit.NANOSECONDS);
                        this.f2612o.set(Integer.MAX_VALUE);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
