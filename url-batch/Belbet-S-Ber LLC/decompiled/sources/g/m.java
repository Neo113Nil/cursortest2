package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final Object f1555f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1556g = new ArrayDeque();
    public final n h;
    public Runnable i;

    public m(n nVar) {
        this.h = nVar;
    }

    public final void a() {
        synchronized (this.f1555f) {
            try {
                Runnable runnable = (Runnable) this.f1556g.poll();
                this.i = runnable;
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
        synchronized (this.f1555f) {
            try {
                this.f1556g.add(new a.b(this, runnable, 3));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
