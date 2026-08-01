package androidx.room;

import d0.ExecutorC0090d;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class A implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1641a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1642b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f1643c;
    public Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1644e;

    public A(ExecutorC0090d executorC0090d) {
        this.f1641a = 0;
        g1.f.e(executorC0090d, "executor");
        this.f1644e = executorC0090d;
        this.f1643c = new ArrayDeque();
        this.f1642b = new Object();
    }

    public final void a() {
        switch (this.f1641a) {
            case 0:
                synchronized (this.f1642b) {
                    Object poll = this.f1643c.poll();
                    Runnable runnable = (Runnable) poll;
                    this.d = runnable;
                    if (poll != null) {
                        ((ExecutorC0090d) this.f1644e).execute(runnable);
                    }
                }
                return;
            default:
                synchronized (this.f1642b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f1643c.poll();
                        this.d = runnable2;
                        if (runnable2 != null) {
                            ((g.m) this.f1644e).execute(runnable2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1641a) {
            case 0:
                g1.f.e(runnable, "command");
                synchronized (this.f1642b) {
                    this.f1643c.offer(new B.o(runnable, 2, this));
                    if (this.d == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.f1642b) {
                    try {
                        this.f1643c.add(new B.o(this, 4, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public A(g.m mVar) {
        this.f1641a = 1;
        this.f1642b = new Object();
        this.f1643c = new ArrayDeque();
        this.f1644e = mVar;
    }
}
