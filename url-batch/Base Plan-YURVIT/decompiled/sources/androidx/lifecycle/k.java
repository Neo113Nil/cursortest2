package androidx.lifecycle;

import i.C0172t;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.CallableC0218c;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1619f;

    public /* synthetic */ k(int i2, Object obj) {
        this.f1618e = i2;
        this.f1619f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f1618e) {
            case 0:
                n nVar = (n) this.f1619f;
                j jVar = nVar.f1626j;
                if (nVar.f1622f == 0) {
                    nVar.f1623g = true;
                    jVar.a(d.ON_PAUSE);
                }
                if (nVar.f1621e == 0 && nVar.f1623g) {
                    jVar.a(d.ON_STOP);
                    nVar.f1624h = true;
                    return;
                }
                return;
            case 1:
                ((io.flutter.plugin.platform.l) this.f1619f).d(false);
                return;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                m0.h hVar = (m0.h) this.f1619f;
                ExecutorService executorService = hVar.f2877a;
                ConcurrentLinkedQueue concurrentLinkedQueue = hVar.f2878b;
                AtomicBoolean atomicBoolean = hVar.f2879c;
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
                            executorService.execute(new k(2, hVar));
                        }
                    }
                }
                return;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((CallableC0218c) this.f1619f).f2935b.f2942e.prefetchDefaultFontManager();
                return;
            default:
                ((C0172t) this.f1619f).getClass();
                return;
        }
    }
}
