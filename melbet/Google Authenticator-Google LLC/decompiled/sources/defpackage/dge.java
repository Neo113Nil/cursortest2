package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dge implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ hvw c;
    final /* synthetic */ dgf d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ dgh g;

    public dge(dgh dghVar, Runnable runnable, hvw hvwVar, dgf dgfVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = hvwVar;
        this.d = dgfVar;
        this.e = j;
        this.f = timeUnit;
        this.g = dghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final hvw hvwVar = this.c;
        final dgf dgfVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: dgd
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                dge dgeVar = dge.this;
                Runnable runnable2 = runnable;
                hvw hvwVar2 = hvwVar;
                dgf dgfVar2 = dgfVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (hvwVar2.isDone()) {
                        return;
                    }
                    hvk schedule = dgeVar.g.a.schedule(dgeVar.a, j2, timeUnit2);
                    dgfVar2.a = schedule;
                    if (dgfVar2.isDone()) {
                        schedule.cancel(false);
                    }
                } catch (Throwable th) {
                    hvwVar2.p(th);
                }
            }
        });
    }
}
