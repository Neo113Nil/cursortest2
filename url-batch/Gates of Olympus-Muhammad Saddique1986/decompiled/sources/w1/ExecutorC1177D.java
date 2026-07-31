package w1;

import h.C0445b;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: w1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1177D implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public Runnable f9852e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f9851d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final Object f9853f = new Object();

    public final void a() {
        synchronized (this.f9853f) {
            Object poll = this.f9851d.poll();
            Runnable runnable = (Runnable) poll;
            this.f9852e = runnable;
            if (poll != null) {
                C0445b.b0().f5849d.f5852e.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f2.j.f(runnable, "command");
        synchronized (this.f9853f) {
            this.f9851d.offer(new L1.h(runnable, 5, this));
            if (this.f9852e == null) {
                a();
            }
        }
    }
}
