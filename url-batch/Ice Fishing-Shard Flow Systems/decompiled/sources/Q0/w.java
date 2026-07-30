package Q0;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final x f2345d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.j f2346e;

    public w(x xVar, P0.j jVar) {
        this.f2345d = xVar;
        this.f2346e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2345d.f2351d) {
            try {
                if (((w) this.f2345d.f2349b.remove(this.f2346e)) != null) {
                    v vVar = (v) this.f2345d.f2350c.remove(this.f2346e);
                    if (vVar != null) {
                        P0.j jVar = this.f2346e;
                        J0.g gVar = (J0.g) vVar;
                        G0.s.d().a(J0.g.f1331u, "Exceeded time limits on execution for " + jVar);
                        gVar.f1339p.execute(new J0.f(gVar, 0));
                    }
                } else {
                    G0.s.d().a("WrkTimerRunnable", "Timer with " + this.f2346e + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
