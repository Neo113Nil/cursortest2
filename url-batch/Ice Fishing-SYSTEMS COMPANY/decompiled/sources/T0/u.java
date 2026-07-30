package T0;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final v f3084n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.j f3085u;

    public u(v vVar, S0.j jVar) {
        this.f3084n = vVar;
        this.f3085u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3084n.f3090d) {
            try {
                if (((u) this.f3084n.f3088b.remove(this.f3085u)) != null) {
                    t tVar = (t) this.f3084n.f3089c.remove(this.f3085u);
                    if (tVar != null) {
                        S0.j jVar = this.f3085u;
                        M0.g gVar = (M0.g) tVar;
                        J0.s.d().a(M0.g.f1846F, "Exceeded time limits on execution for " + jVar);
                        gVar.f1847A.execute(new M0.f(gVar, 0));
                    }
                } else {
                    J0.s.d().a("WrkTimerRunnable", "Timer with " + this.f3085u + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
