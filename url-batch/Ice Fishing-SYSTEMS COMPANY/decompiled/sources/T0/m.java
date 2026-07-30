package T0;

import java.util.Set;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final String f3058w = J0.s.f("StopWorkRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final K0.p f3059n;

    /* renamed from: u, reason: collision with root package name */
    public final K0.j f3060u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3061v;

    public m(K0.p pVar, K0.j jVar, boolean z8) {
        this.f3059n = pVar;
        this.f3060u = jVar;
        this.f3061v = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c4;
        K0.q qVar;
        if (this.f3061v) {
            K0.f fVar = this.f3059n.f1535f;
            K0.j jVar = this.f3060u;
            fVar.getClass();
            String str = jVar.f1514a.f2905a;
            synchronized (fVar.f1503E) {
                try {
                    J0.s.d().a(K0.f.f1498F, "Processor stopping foreground work " + str);
                    qVar = (K0.q) fVar.f1509y.remove(str);
                    if (qVar != null) {
                        fVar.f1499A.remove(str);
                    }
                } finally {
                }
            }
            c4 = K0.f.c(str, qVar);
        } else {
            K0.f fVar2 = this.f3059n.f1535f;
            K0.j jVar2 = this.f3060u;
            fVar2.getClass();
            String str2 = jVar2.f1514a.f2905a;
            synchronized (fVar2.f1503E) {
                try {
                    K0.q qVar2 = (K0.q) fVar2.f1510z.remove(str2);
                    if (qVar2 == null) {
                        J0.s.d().a(K0.f.f1498F, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) fVar2.f1499A.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            J0.s.d().a(K0.f.f1498F, "Processor stopping background work " + str2);
                            fVar2.f1499A.remove(str2);
                            c4 = K0.f.c(str2, qVar2);
                        }
                    }
                    c4 = false;
                } finally {
                }
            }
        }
        J0.s.d().a(f3058w, "StopWorkRunnable for " + this.f3060u.f1514a.f2905a + "; Processor.stopWork = " + c4);
    }
}
