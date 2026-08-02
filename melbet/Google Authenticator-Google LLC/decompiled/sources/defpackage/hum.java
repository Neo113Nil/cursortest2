package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hum {
    private final AtomicReference b = new AtomicReference(hve.a);
    public iyh a = new iyh();

    public final hvi a(htq htqVar, Executor executor) {
        executor.getClass();
        final hul hulVar = new hul(executor, this);
        gvt gvtVar = new gvt(hulVar, htqVar, 2);
        final hvw hvwVar = new hvw();
        final hvi hviVar = (hvi) this.b.getAndSet(hvwVar);
        final hwd hwdVar = new hwd(gvtVar);
        hviVar.c(hwdVar, hulVar);
        final hvi aK = hnu.aK(hwdVar);
        Runnable runnable = new Runnable() { // from class: huj
            @Override // java.lang.Runnable
            public final void run() {
                hwd hwdVar2 = hwd.this;
                if (hwdVar2.isDone()) {
                    hvwVar.q(hviVar);
                } else if (aK.isCancelled() && hulVar.compareAndSet(huk.a, huk.b)) {
                    hwdVar2.cancel(false);
                }
            }
        };
        huf hufVar = huf.a;
        aK.c(runnable, hufVar);
        hwdVar.c(runnable, hufVar);
        return aK;
    }
}
