package C0;

import java.util.Set;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f347d = s0.s.f("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final t0.o f348a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.j f349b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f350c;

    public o(t0.o oVar, t0.j jVar, boolean z) {
        this.f348a = oVar;
        this.f349b = jVar;
        this.f350c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b6;
        t0.q qVar;
        if (this.f350c) {
            t0.f fVar = this.f348a.f11887f;
            t0.j jVar = this.f349b;
            fVar.getClass();
            String str = jVar.f11867a.f157a;
            synchronized (fVar.f11863l) {
                try {
                    s0.s.d().a(t0.f.f11851m, "Processor stopping foreground work " + str);
                    qVar = (t0.q) fVar.f11857f.remove(str);
                    if (qVar != null) {
                        fVar.f11859h.remove(str);
                    }
                } finally {
                }
            }
            b6 = t0.f.b(str, qVar);
        } else {
            t0.f fVar2 = this.f348a.f11887f;
            t0.j jVar2 = this.f349b;
            fVar2.getClass();
            String str2 = jVar2.f11867a.f157a;
            synchronized (fVar2.f11863l) {
                try {
                    t0.q qVar2 = (t0.q) fVar2.f11858g.remove(str2);
                    if (qVar2 == null) {
                        s0.s.d().a(t0.f.f11851m, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) fVar2.f11859h.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            s0.s.d().a(t0.f.f11851m, "Processor stopping background work " + str2);
                            fVar2.f11859h.remove(str2);
                            b6 = t0.f.b(str2, qVar2);
                        }
                    }
                    b6 = false;
                } finally {
                }
            }
        }
        s0.s.d().a(f347d, "StopWorkRunnable for " + this.f349b.f11867a.f157a + "; Processor.stopWork = " + b6);
    }
}
