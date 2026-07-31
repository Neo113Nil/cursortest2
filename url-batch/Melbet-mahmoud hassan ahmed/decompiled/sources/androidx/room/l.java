package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class l implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Executor f1351f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<Runnable> f1352g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private Runnable f1353h;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f1354f;

        a(Runnable runnable) {
            this.f1354f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1354f.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f1351f = executor;
    }

    synchronized void a() {
        Runnable poll = this.f1352g.poll();
        this.f1353h = poll;
        if (poll != null) {
            this.f1351f.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f1352g.offer(new a(runnable));
        if (this.f1353h == null) {
            a();
        }
    }
}
