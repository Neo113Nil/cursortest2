package v0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final Executor f6071g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f6072h;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f6070f = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public final Object f6073i = new Object();

    public k(Executor executor) {
        this.f6071g = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f6070f.poll();
        this.f6072h = runnable;
        if (runnable != null) {
            this.f6071g.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f6073i) {
            try {
                this.f6070f.add(new A.a(this, 27, runnable));
                if (this.f6072h == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
