package androidx.room;

import f0.ExecutorC0120d;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class D implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2075b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f2076c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f2077d;
    public final Executor e;

    public D(ExecutorC0120d executorC0120d) {
        this.f2074a = 0;
        j1.h.e(executorC0120d, "executor");
        this.e = executorC0120d;
        this.f2076c = new ArrayDeque();
        this.f2075b = new Object();
    }

    public final void a() {
        switch (this.f2074a) {
            case 0:
                synchronized (this.f2075b) {
                    Object poll = this.f2076c.poll();
                    Runnable runnable = (Runnable) poll;
                    this.f2077d = runnable;
                    if (poll != null) {
                        ((ExecutorC0120d) this.e).execute(runnable);
                    }
                }
                return;
            default:
                synchronized (this.f2075b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f2076c.poll();
                        this.f2077d = runnable2;
                        if (runnable2 != null) {
                            ((h.m) this.e).execute(runnable2);
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
        switch (this.f2074a) {
            case 0:
                j1.h.e(runnable, "command");
                synchronized (this.f2075b) {
                    this.f2076c.offer(new D.n(runnable, 1, this));
                    if (this.f2077d == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.f2075b) {
                    try {
                        this.f2076c.add(new D.n(this, 4, runnable));
                        if (this.f2077d == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public D(h.m mVar) {
        this.f2074a = 1;
        this.f2075b = new Object();
        this.f2076c = new ArrayDeque();
        this.e = mVar;
    }
}
