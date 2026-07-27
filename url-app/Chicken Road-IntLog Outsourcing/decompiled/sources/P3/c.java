package P3;

import M3.h;
import M3.p;
import X2.s;
import a3.C0182a;
import b2.AbstractC0279e;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2306c = c.class.getSimpleName().concat("_WorkerThread");

    /* renamed from: d, reason: collision with root package name */
    public static final V2.e f2307d = V2.e.a(Q2.b.f2476a, "processorType");

    /* renamed from: e, reason: collision with root package name */
    public static final V2.e f2308e = V2.e.a(Q2.b.f2477b, "dropped");

    /* renamed from: f, reason: collision with root package name */
    public static final String f2309f = c.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final b f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2311b;

    public c(e eVar, long j2, int i2, int i3, long j6) {
        s sVar = X2.h.f3518a;
        this.f2311b = new AtomicBoolean(false);
        b bVar = new b(eVar, j2, i3, j6, new ArrayBlockingQueue(i2));
        this.f2310a = bVar;
        new L3.e(f2306c).newThread(bVar).start();
    }

    @Override // M3.h
    public final J3.c e() {
        Logger logger = b.f2291o;
        return this.f2310a.b();
    }

    @Override // M3.h
    public final void r(C0182a c0182a, p pVar) {
        b bVar = this.f2310a;
        ArrayBlockingQueue arrayBlockingQueue = bVar.f2300i;
        if (!arrayBlockingQueue.offer(pVar)) {
            bVar.f2292a.d(1L, bVar.f2293b);
        } else if (arrayBlockingQueue.size() >= bVar.f2301j.get()) {
            bVar.f2302k.offer(Boolean.TRUE);
        }
    }

    @Override // M3.h
    public final J3.c shutdown() {
        int i2 = 1;
        if (this.f2311b.getAndSet(true)) {
            return J3.c.f1361e;
        }
        Logger logger = b.f2291o;
        b bVar = this.f2310a;
        bVar.getClass();
        J3.c cVar = new J3.c();
        J3.c b6 = bVar.b();
        b6.f(new J0.a(bVar, b6, cVar, i2));
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        b bVar = this.f2310a;
        sb.append(bVar.f2295d);
        sb.append(", scheduleDelayNanos=");
        sb.append(bVar.f2296e);
        sb.append(", maxExportBatchSize=");
        sb.append(bVar.f2297f);
        sb.append(", exporterTimeoutNanos=");
        return AbstractC0279e.g(sb, bVar.f2298g, '}');
    }
}
