package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f4 implements Executor {
    public final /* synthetic */ int f;
    public final ArrayDeque g;
    public Runnable h;
    public final Object i;
    public final Executor j;

    public f4(Executor executor) {
        this.f = 1;
        executor.getClass();
        this.j = executor;
        this.g = new ArrayDeque();
        this.i = new Object();
    }

    public final void a() {
        switch (this.f) {
            case 0:
                synchronized (this.i) {
                    try {
                        Runnable runnable = (Runnable) this.g.poll();
                        this.h = runnable;
                        if (runnable != null) {
                            ((g4) this.j).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.i) {
                    Object poll = this.g.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.h = runnable2;
                    if (poll != null) {
                        this.j.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                synchronized (this.i) {
                    try {
                        this.g.add(new e4(this, runnable, 0));
                        if (this.h == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.i) {
                    this.g.offer(new e4(runnable, this));
                    if (this.h == null) {
                        a();
                    }
                }
                return;
        }
    }

    public f4(g4 g4Var) {
        this.f = 0;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.j = g4Var;
    }
}
