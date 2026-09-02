package F;

import androidx.lifecycle.n;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f221c;

    public /* synthetic */ h(int i2, Object obj) {
        this.f220b = i2;
        this.f221c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f220b) {
            case 0:
                i iVar = (i) this.f221c;
                ExecutorService executorService = iVar.f222a;
                ConcurrentLinkedQueue concurrentLinkedQueue = iVar.f223b;
                AtomicBoolean atomicBoolean = iVar.f224c;
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
                            executorService.execute(new h(0, iVar));
                        }
                    }
                }
                return;
            case 1:
                ((I.c) this.f221c).f256b.f263e.prefetchDefaultFontManager();
                return;
            case 2:
                n nVar = (n) this.f221c;
                e0.h.e(nVar, "this$0");
                int i2 = nVar.f443b;
                androidx.lifecycle.j jVar = nVar.f447f;
                if (i2 == 0) {
                    nVar.f444c = true;
                    jVar.a(androidx.lifecycle.d.ON_PAUSE);
                }
                if (nVar.f442a == 0 && nVar.f444c) {
                    jVar.a(androidx.lifecycle.d.ON_STOP);
                    nVar.f445d = true;
                    return;
                }
                return;
            default:
                ((io.flutter.plugin.platform.k) this.f221c).e(false);
                return;
        }
    }
}
