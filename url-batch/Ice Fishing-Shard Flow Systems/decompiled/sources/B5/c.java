package B5;

import J4.l;
import J4.q;
import J4.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import v5.C0977c;
import y5.n;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f185w = Logger.getLogger(c.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final l f186d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.b f187e;

    /* renamed from: i, reason: collision with root package name */
    public final C4.b f188i;

    /* renamed from: l, reason: collision with root package name */
    public final f f189l;

    /* renamed from: m, reason: collision with root package name */
    public final long f190m;

    /* renamed from: n, reason: collision with root package name */
    public final int f191n;

    /* renamed from: o, reason: collision with root package name */
    public final long f192o;

    /* renamed from: p, reason: collision with root package name */
    public long f193p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayBlockingQueue f194q;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f199v;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicInteger f195r = new AtomicInteger(Integer.MAX_VALUE);

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f197t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f198u = true;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayBlockingQueue f196s = new ArrayBlockingQueue(1);

    public c(f fVar, s sVar, long j, int i2, long j7, ArrayBlockingQueue arrayBlockingQueue) {
        this.f189l = fVar;
        this.f190m = j;
        this.f191n = i2;
        this.f192o = j7;
        this.f194q = arrayBlockingQueue;
        q mo5build = sVar.a("io.opentelemetry.sdk.logs").mo5build();
        mo5build.b("queueSize").a().mo3c().mo4e().f(new a(arrayBlockingQueue));
        this.f186d = mo5build.d("processedLogs").d("1").b("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
        H4.e eVar = d.f201l;
        String str = d.f203n;
        H4.e eVar2 = d.f202m;
        this.f187e = C4.f.a(eVar, str, eVar2, Boolean.TRUE);
        this.f188i = C4.f.a(eVar, str, eVar2, Boolean.FALSE);
        this.f199v = new ArrayList(i2);
    }

    public final void a() {
        Logger logger = f185w;
        ArrayList arrayList = this.f199v;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                C0977c p7 = this.f189l.p(Collections.unmodifiableList(arrayList));
                p7.c(this.f192o, TimeUnit.NANOSECONDS);
                if (p7.b()) {
                    this.f186d.a(arrayList.size(), this.f188i);
                } else {
                    logger.log(Level.FINE, "Exporter failed");
                }
                arrayList.clear();
            } catch (RuntimeException e7) {
                logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e7);
                arrayList.clear();
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final C0977c b() {
        AtomicReference atomicReference;
        C0977c c0977c = new C0977c();
        while (true) {
            atomicReference = this.f197t;
            if (atomicReference.compareAndSet(null, c0977c)) {
                this.f196s.offer(Boolean.TRUE);
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        C0977c c0977c2 = (C0977c) atomicReference.get();
        return c0977c2 == null ? C0977c.f8229e : c0977c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f193p = System.nanoTime() + this.f190m;
        while (this.f198u) {
            if (this.f197t.get() != null) {
                AtomicReference atomicReference = this.f197t;
                ArrayList arrayList = this.f199v;
                ArrayBlockingQueue arrayBlockingQueue = this.f194q;
                int size = arrayBlockingQueue.size();
                while (size > 0) {
                    arrayList.add(((n) arrayBlockingQueue.poll()).b());
                    size--;
                    if (arrayList.size() >= this.f191n) {
                        a();
                    }
                }
                a();
                C0977c c0977c = (C0977c) atomicReference.get();
                if (c0977c != null) {
                    c0977c.e();
                    atomicReference.set(null);
                }
            }
            while (!this.f194q.isEmpty() && this.f199v.size() < this.f191n) {
                this.f199v.add(((n) this.f194q.poll()).b());
            }
            if (this.f199v.size() >= this.f191n || System.nanoTime() >= this.f193p) {
                a();
                this.f193p = System.nanoTime() + this.f190m;
            }
            if (this.f194q.isEmpty()) {
                try {
                    long nanoTime = this.f193p - System.nanoTime();
                    if (nanoTime > 0) {
                        this.f195r.set(this.f191n - this.f199v.size());
                        this.f196s.poll(nanoTime, TimeUnit.NANOSECONDS);
                        this.f195r.set(Integer.MAX_VALUE);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
