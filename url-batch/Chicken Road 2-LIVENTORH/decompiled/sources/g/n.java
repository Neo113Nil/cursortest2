package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final Object f1673f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1674g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final o f1675h;
    public Runnable i;

    public n(o oVar) {
        this.f1675h = oVar;
    }

    public final void a() {
        synchronized (this.f1673f) {
            try {
                Runnable runnable = (Runnable) this.f1674g.poll();
                this.i = runnable;
                if (runnable != null) {
                    this.f1675h.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f1673f) {
            try {
                this.f1674g.add(new a.b(this, runnable, 2));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
