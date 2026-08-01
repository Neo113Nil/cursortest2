package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d4 implements Executor {
    public final Object f = new Object();
    public final ArrayDeque g = new ArrayDeque();
    public final e4 h;
    public Runnable i;

    public d4(e4 e4Var) {
        this.h = e4Var;
    }

    public final void a() {
        synchronized (this.f) {
            try {
                Runnable runnable = (Runnable) this.g.poll();
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
        synchronized (this.f) {
            try {
                this.g.add(new c4(this, runnable, 0));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
