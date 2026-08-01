package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2328a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2329b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final n f2330c;
    public Runnable d;

    public m(n nVar) {
        this.f2330c = nVar;
    }

    public final void a() {
        synchronized (this.f2328a) {
            try {
                Runnable runnable = (Runnable) this.f2329b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.f2330c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2328a) {
            try {
                this.f2329b.add(new B.o(this, 3, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
