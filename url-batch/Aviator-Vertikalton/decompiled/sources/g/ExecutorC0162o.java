package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: g.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0162o implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2579a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2580b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final p f2581c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f2582d;

    public ExecutorC0162o(p pVar) {
        this.f2581c = pVar;
    }

    public final void a() {
        synchronized (this.f2579a) {
            try {
                Runnable runnable = (Runnable) this.f2580b.poll();
                this.f2582d = runnable;
                if (runnable != null) {
                    this.f2581c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2579a) {
            try {
                this.f2580b.add(new B.o(this, 3, runnable));
                if (this.f2582d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
