package kotlinx.coroutines.scheduling;

import m6.q0;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f18429h;

    public k(Runnable runnable, long j7, j jVar) {
        super(j7, jVar);
        this.f18429h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f18429h.run();
        } finally {
            this.f18428g.u();
        }
    }

    public String toString() {
        return "Task[" + q0.a(this.f18429h) + '@' + q0.b(this.f18429h) + ", " + this.f18427f + ", " + this.f18428g + ']';
    }
}
