package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2323a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2324b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final n f2325c;
    public Runnable d;

    public m(n nVar) {
        this.f2325c = nVar;
    }

    public final void a() {
        synchronized (this.f2323a) {
            try {
                Runnable runnable = (Runnable) this.f2324b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.f2325c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2323a) {
            try {
                this.f2324b.add(new D.o(this, 3, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
