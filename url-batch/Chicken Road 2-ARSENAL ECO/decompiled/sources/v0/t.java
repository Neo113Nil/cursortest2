package v0;

import u0.C0680j;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final u f6099f;

    /* renamed from: g, reason: collision with root package name */
    public final C0680j f6100g;

    public t(u uVar, C0680j c0680j) {
        this.f6099f = uVar;
        this.f6100g = c0680j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6099f.f6105d) {
            try {
                if (((t) this.f6099f.f6103b.remove(this.f6100g)) != null) {
                    s sVar = (s) this.f6099f.f6104c.remove(this.f6100g);
                    if (sVar != null) {
                        C0680j c0680j = this.f6100g;
                        o0.g gVar = (o0.g) sVar;
                        l0.q.d().a(o0.g.f5579r, "Exceeded time limits on execution for " + c0680j);
                        gVar.f5587m.execute(new o0.f(gVar, 0));
                    }
                } else {
                    l0.q.d().a("WrkTimerRunnable", "Timer with " + this.f6100g + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
