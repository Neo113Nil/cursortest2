package Q0;

import java.util.Set;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final String f2315l = G0.s.f("StopWorkRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final H0.p f2316d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.j f2317e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2318i;

    public n(H0.p pVar, H0.j jVar, boolean z7) {
        this.f2316d = pVar;
        this.f2317e = jVar;
        this.f2318i = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b7;
        H0.r rVar;
        if (this.f2318i) {
            H0.f fVar = this.f2316d.f923f;
            H0.j jVar = this.f2317e;
            fVar.getClass();
            String str = jVar.f902a.f2204a;
            synchronized (fVar.f898t) {
                try {
                    G0.s.d().a(H0.f.f886u, "Processor stopping foreground work " + str);
                    rVar = (H0.r) fVar.f892n.remove(str);
                    if (rVar != null) {
                        fVar.f894p.remove(str);
                    }
                } finally {
                }
            }
            b7 = H0.f.b(str, rVar);
        } else {
            H0.f fVar2 = this.f2316d.f923f;
            H0.j jVar2 = this.f2317e;
            fVar2.getClass();
            String str2 = jVar2.f902a.f2204a;
            synchronized (fVar2.f898t) {
                try {
                    H0.r rVar2 = (H0.r) fVar2.f893o.remove(str2);
                    if (rVar2 == null) {
                        G0.s.d().a(H0.f.f886u, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) fVar2.f894p.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            G0.s.d().a(H0.f.f886u, "Processor stopping background work " + str2);
                            fVar2.f894p.remove(str2);
                            b7 = H0.f.b(str2, rVar2);
                        }
                    }
                    b7 = false;
                } finally {
                }
            }
        }
        G0.s.d().a(f2315l, "StopWorkRunnable for " + this.f2317e.f902a.f2204a + "; Processor.stopWork = " + b7);
    }
}
