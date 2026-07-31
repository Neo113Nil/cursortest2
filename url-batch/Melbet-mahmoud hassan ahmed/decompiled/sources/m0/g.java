package m0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class g implements Executor {

    /* renamed from: g, reason: collision with root package name */
    private final Executor f18844g;

    /* renamed from: i, reason: collision with root package name */
    private volatile Runnable f18846i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<a> f18843f = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private final Object f18845h = new Object();

    static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final g f18847f;

        /* renamed from: g, reason: collision with root package name */
        final Runnable f18848g;

        a(g gVar, Runnable runnable) {
            this.f18847f = gVar;
            this.f18848g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18848g.run();
            } finally {
                this.f18847f.b();
            }
        }
    }

    public g(Executor executor) {
        this.f18844g = executor;
    }

    public boolean a() {
        boolean z6;
        synchronized (this.f18845h) {
            z6 = !this.f18843f.isEmpty();
        }
        return z6;
    }

    void b() {
        synchronized (this.f18845h) {
            a poll = this.f18843f.poll();
            this.f18846i = poll;
            if (poll != null) {
                this.f18844g.execute(this.f18846i);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f18845h) {
            this.f18843f.add(new a(this, runnable));
            if (this.f18846i == null) {
                b();
            }
        }
    }
}
