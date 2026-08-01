package d6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final w f3678d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.j f3679e;

    public v(w wVar, c6.j jVar) {
        this.f3678d = wVar;
        this.f3679e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3678d.f3684d) {
            try {
                if (((v) this.f3678d.f3682b.remove(this.f3679e)) != null) {
                    w5.g gVar = (w5.g) this.f3678d.f3683c.remove(this.f3679e);
                    if (gVar != null) {
                        c6.j jVar = this.f3679e;
                        t5.o.d().a(w5.g.A, "Exceeded time limits on execution for " + jVar);
                        gVar.f10100v.execute(new w5.f(gVar, 0));
                    }
                } else {
                    t5.o.d().a("WrkTimerRunnable", "Timer with " + this.f3679e + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
