package androidx.lifecycle;

import e0.C0120h;
import h.C0165s;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1529f;

    public /* synthetic */ k(int i2, Object obj) {
        this.f1528e = i2;
        this.f1529f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f1528e) {
            case 0:
                o oVar = (o) this.f1529f;
                F0.i.e(oVar, "this$0");
                int i2 = oVar.f1532f;
                j jVar = oVar.f1536j;
                if (i2 == 0) {
                    oVar.f1533g = true;
                    jVar.a(d.ON_PAUSE);
                }
                if (oVar.f1531e == 0 && oVar.f1533g) {
                    jVar.a(d.ON_STOP);
                    oVar.f1534h = true;
                    return;
                }
                return;
            case 1:
                C0120h c0120h = (C0120h) this.f1529f;
                ExecutorService executorService = c0120h.f1871a;
                ConcurrentLinkedQueue concurrentLinkedQueue = c0120h.f1872b;
                AtomicBoolean atomicBoolean = c0120h.f1873c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new k(1, c0120h));
                        }
                    }
                }
                return;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((h0.b) this.f1529f).f2333b.f2341f.prefetchDefaultFontManager();
                return;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((io.flutter.plugin.platform.k) this.f1529f).e(false);
                return;
            default:
                ((C0165s) this.f1529f).getClass();
                return;
        }
    }
}
