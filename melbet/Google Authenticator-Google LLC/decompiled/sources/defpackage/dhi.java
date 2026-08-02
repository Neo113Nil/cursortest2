package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhi implements Runnable {
    public final Runnable a;
    public final /* synthetic */ dhj b;

    public dhi(dhj dhjVar, Runnable runnable) {
        this.b = dhjVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgc dgcVar = new dgc(this, Thread.currentThread(), 4);
        dhj dhjVar = this.b;
        dhr dhrVar = dhjVar.c;
        dhrVar.f();
        hvk schedule = dhjVar.e.schedule(dgcVar, 1L, dhrVar.g());
        try {
            this.a.run();
        } finally {
            schedule.cancel(false);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
