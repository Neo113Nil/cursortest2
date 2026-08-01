package f;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final Object f1636f = new Object();
    public final ArrayDeque g = new ArrayDeque();
    public final o h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f1637i;

    public n(o oVar) {
        this.h = oVar;
    }

    public final void a() {
        synchronized (this.f1636f) {
            try {
                Runnable runnable = (Runnable) this.g.poll();
                this.f1637i = runnable;
                if (runnable != null) {
                    this.h.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f1636f) {
            try {
                this.g.add(new androidx.activity.n(this, runnable, 2));
                if (this.f1637i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
