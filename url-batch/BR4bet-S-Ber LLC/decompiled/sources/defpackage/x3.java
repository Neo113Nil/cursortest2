package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class x3 implements Executor {
    public final Object f = new Object();
    public final ArrayDeque g = new ArrayDeque();
    public final y3 h;
    public Runnable i;

    public x3(y3 y3Var) {
        this.h = y3Var;
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
                this.g.add(new w3(this, runnable, 0));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
