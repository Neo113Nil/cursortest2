package a7;

import X6.o;
import b6.C0530a;
import i6.l;
import i6.q;
import i6.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: H, reason: collision with root package name */
    public static final Logger f4397H = Logger.getLogger(c.class.getName());

    /* renamed from: A, reason: collision with root package name */
    public long f4398A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayBlockingQueue f4399B;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f4404G;

    /* renamed from: n, reason: collision with root package name */
    public final l f4405n;

    /* renamed from: u, reason: collision with root package name */
    public final C0530a f4406u;

    /* renamed from: v, reason: collision with root package name */
    public final C0530a f4407v;

    /* renamed from: w, reason: collision with root package name */
    public final f f4408w;

    /* renamed from: x, reason: collision with root package name */
    public final long f4409x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4410y;

    /* renamed from: z, reason: collision with root package name */
    public final long f4411z;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f4400C = new AtomicInteger(Integer.MAX_VALUE);

    /* renamed from: E, reason: collision with root package name */
    public final AtomicReference f4402E = new AtomicReference();

    /* renamed from: F, reason: collision with root package name */
    public volatile boolean f4403F = true;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f4401D = new ArrayBlockingQueue(1);

    public c(f fVar, s sVar, long j9, int i, long j10, ArrayBlockingQueue arrayBlockingQueue) {
        this.f4408w = fVar;
        this.f4409x = j9;
        this.f4410y = i;
        this.f4411z = j10;
        this.f4399B = arrayBlockingQueue;
        q mo50build = sVar.a("io.opentelemetry.sdk.logs").mo50build();
        mo50build.b("queueSize").a().a().b().n(new C0433a(arrayBlockingQueue));
        this.f4405n = mo50build.d("processedLogs").d("1").c("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
        g6.e eVar = d.f4413w;
        String str = d.f4415y;
        g6.e eVar2 = d.f4414x;
        this.f4406u = b6.c.a(eVar, str, eVar2, Boolean.TRUE);
        this.f4407v = b6.c.a(eVar, str, eVar2, Boolean.FALSE);
        this.f4404G = new ArrayList(i);
    }

    public final void a() {
        Logger logger = f4397H;
        ArrayList arrayList = this.f4404G;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                U6.c e6 = this.f4408w.e(Collections.unmodifiableList(arrayList));
                e6.c(this.f4411z, TimeUnit.NANOSECONDS);
                if (e6.b()) {
                    this.f4405n.e(arrayList.size(), this.f4407v);
                } else {
                    logger.log(Level.FINE, "Exporter failed");
                }
                arrayList.clear();
            } catch (RuntimeException e9) {
                logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e9);
                arrayList.clear();
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final U6.c b() {
        U6.c cVar = new U6.c();
        AtomicReference atomicReference = this.f4402E;
        while (true) {
            if (atomicReference.compareAndSet(null, cVar)) {
                this.f4401D.offer(Boolean.TRUE);
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        U6.c cVar2 = (U6.c) atomicReference.get();
        return cVar2 == null ? U6.c.f3310e : cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4398A = System.nanoTime() + this.f4409x;
        while (this.f4403F) {
            if (this.f4402E.get() != null) {
                ArrayBlockingQueue arrayBlockingQueue = this.f4399B;
                int size = arrayBlockingQueue.size();
                while (size > 0) {
                    o oVar = (o) arrayBlockingQueue.poll();
                    ArrayList arrayList = this.f4404G;
                    arrayList.add(oVar.b());
                    size--;
                    if (arrayList.size() >= this.f4410y) {
                        a();
                    }
                }
                a();
                AtomicReference atomicReference = this.f4402E;
                U6.c cVar = (U6.c) atomicReference.get();
                if (cVar != null) {
                    cVar.e();
                    atomicReference.set(null);
                }
            }
            while (!this.f4399B.isEmpty() && this.f4404G.size() < this.f4410y) {
                this.f4404G.add(((o) this.f4399B.poll()).b());
            }
            if (this.f4404G.size() >= this.f4410y || System.nanoTime() >= this.f4398A) {
                a();
                this.f4398A = System.nanoTime() + this.f4409x;
            }
            if (this.f4399B.isEmpty()) {
                try {
                    long nanoTime = this.f4398A - System.nanoTime();
                    if (nanoTime > 0) {
                        this.f4400C.set(this.f4410y - this.f4404G.size());
                        this.f4401D.poll(nanoTime, TimeUnit.NANOSECONDS);
                        this.f4400C.set(Integer.MAX_VALUE);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
