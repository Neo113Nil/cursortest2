package g;

import e0.ExecutorC0105d;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2678a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2679b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f2680c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f2681e;

    public m(ExecutorC0105d executorC0105d) {
        this.f2678a = 1;
        k1.e.e(executorC0105d, "executor");
        this.f2681e = executorC0105d;
        this.f2679b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        switch (this.f2678a) {
            case 0:
                synchronized (this.d) {
                    try {
                        Runnable runnable = (Runnable) this.f2679b.poll();
                        this.f2680c = runnable;
                        if (runnable != null) {
                            ((n) this.f2681e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.d) {
                    Object poll = this.f2679b.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.f2680c = runnable2;
                    if (poll != null) {
                        ((ExecutorC0105d) this.f2681e).execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2678a) {
            case 0:
                synchronized (this.d) {
                    try {
                        this.f2679b.add(new B.n(this, 3, runnable));
                        if (this.f2680c == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                k1.e.e(runnable, "command");
                synchronized (this.d) {
                    this.f2679b.offer(new B.n(runnable, 4, this));
                    if (this.f2680c == null) {
                        a();
                    }
                }
                return;
        }
    }

    public m(n nVar) {
        this.f2678a = 0;
        this.d = new Object();
        this.f2679b = new ArrayDeque();
        this.f2681e = nVar;
    }
}
