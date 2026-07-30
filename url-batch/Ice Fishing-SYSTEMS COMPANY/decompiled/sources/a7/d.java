package a7;

import X6.g;
import X6.o;
import i6.s;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import l6.C4694a;

/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: v, reason: collision with root package name */
    public static final String f4412v = d.class.getSimpleName().concat("_WorkerThread");

    /* renamed from: w, reason: collision with root package name */
    public static final g6.e f4413w = g6.e.a(b6.b.f5560n, "processorType");

    /* renamed from: x, reason: collision with root package name */
    public static final g6.e f4414x = g6.e.a(b6.b.f5561u, "dropped");

    /* renamed from: y, reason: collision with root package name */
    public static final String f4415y = d.class.getSimpleName();

    /* renamed from: n, reason: collision with root package name */
    public final c f4416n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f4417u = new AtomicBoolean(false);

    public d(f fVar, s sVar, long j9, int i, int i4, long j10) {
        c cVar = new c(fVar, sVar, j9, i4, j10, new ArrayBlockingQueue(i));
        this.f4416n = cVar;
        new T2.b(f4412v).newThread(cVar).start();
    }

    @Override // X6.g
    public final U6.c M() {
        Logger logger = c.f4397H;
        return this.f4416n.b();
    }

    @Override // X6.g
    public final void T(C4694a c4694a, o oVar) {
        c cVar = this.f4416n;
        ArrayBlockingQueue arrayBlockingQueue = cVar.f4399B;
        if (!arrayBlockingQueue.offer(oVar)) {
            cVar.f4405n.e(1L, cVar.f4406u);
        } else if (arrayBlockingQueue.size() >= cVar.f4400C.get()) {
            cVar.f4401D.offer(Boolean.TRUE);
        }
    }

    @Override // X6.g
    public final U6.c shutdown() {
        if (this.f4417u.getAndSet(true)) {
            return U6.c.f3310e;
        }
        Logger logger = c.f4397H;
        c cVar = this.f4416n;
        cVar.getClass();
        U6.c cVar2 = new U6.c();
        U6.c b9 = cVar.b();
        b9.f(new b(cVar, b9, cVar2, 0));
        return cVar2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        c cVar = this.f4416n;
        sb.append(cVar.f4408w);
        sb.append(", scheduleDelayNanos=");
        sb.append(cVar.f4409x);
        sb.append(", maxExportBatchSize=");
        sb.append(cVar.f4410y);
        sb.append(", exporterTimeoutNanos=");
        sb.append(cVar.f4411z);
        sb.append('}');
        return sb.toString();
    }
}
