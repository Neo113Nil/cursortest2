package C0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f344b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f345c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f343a = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Object f346d = new Object();

    public n(ExecutorService executorService) {
        this.f344b = executorService;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f343a.poll();
        this.f345c = runnable;
        if (runnable != null) {
            this.f344b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f346d) {
            try {
                this.f343a.add(new A0.a(this, runnable, 3, false));
                if (this.f345c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
