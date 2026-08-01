package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: g.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0163o implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2583a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2584b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final p f2585c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f2586d;

    public ExecutorC0163o(p pVar) {
        this.f2585c = pVar;
    }

    public final void a() {
        synchronized (this.f2583a) {
            try {
                Runnable runnable = (Runnable) this.f2584b.poll();
                this.f2586d = runnable;
                if (runnable != null) {
                    this.f2585c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2583a) {
            try {
                this.f2584b.add(new B.o(this, 3, runnable));
                if (this.f2586d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
