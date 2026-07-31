package androidx.room;

import h.C0413b;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public Runnable f4117e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f4116d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final Object f4118f = new Object();

    public final void a() {
        synchronized (this.f4118f) {
            Object poll = this.f4116d.poll();
            Runnable runnable = (Runnable) poll;
            this.f4117e = runnable;
            if (poll != null) {
                C0413b.A().f4861a.f4864b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Z1.i.f(runnable, "command");
        synchronized (this.f4118f) {
            this.f4116d.offer(new D1.j(runnable, 2, this));
            if (this.f4117e == null) {
                a();
            }
        }
    }
}
