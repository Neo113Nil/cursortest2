package v0;

import java.util.Set;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f6074i = l0.q.f("StopWorkRunnable");

    /* renamed from: f, reason: collision with root package name */
    public final m0.o f6075f;

    /* renamed from: g, reason: collision with root package name */
    public final m0.j f6076g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6077h;

    public l(m0.o oVar, m0.j jVar, boolean z5) {
        this.f6075f = oVar;
        this.f6076g = jVar;
        this.f6077h = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b7;
        m0.q qVar;
        if (this.f6077h) {
            m0.f fVar = this.f6075f.f5378f;
            m0.j jVar = this.f6076g;
            fVar.getClass();
            String str = jVar.f5358a.f5985a;
            synchronized (fVar.f5354q) {
                try {
                    l0.q.d().a(m0.f.f5342r, "Processor stopping foreground work " + str);
                    qVar = (m0.q) fVar.f5348k.remove(str);
                    if (qVar != null) {
                        fVar.f5350m.remove(str);
                    }
                } finally {
                }
            }
            b7 = m0.f.b(str, qVar);
        } else {
            m0.f fVar2 = this.f6075f.f5378f;
            m0.j jVar2 = this.f6076g;
            fVar2.getClass();
            String str2 = jVar2.f5358a.f5985a;
            synchronized (fVar2.f5354q) {
                try {
                    m0.q qVar2 = (m0.q) fVar2.f5349l.remove(str2);
                    if (qVar2 == null) {
                        l0.q.d().a(m0.f.f5342r, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) fVar2.f5350m.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            l0.q.d().a(m0.f.f5342r, "Processor stopping background work " + str2);
                            fVar2.f5350m.remove(str2);
                            b7 = m0.f.b(str2, qVar2);
                        }
                    }
                    b7 = false;
                } finally {
                }
            }
        }
        l0.q.d().a(f6074i, "StopWorkRunnable for " + this.f6076g.f5358a.f5985a + "; Processor.stopWork = " + b7);
    }
}
