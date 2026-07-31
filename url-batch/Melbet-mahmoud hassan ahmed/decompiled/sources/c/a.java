package c;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f1691c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f1692d = new ExecutorC0039a();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f1693e = new b();

    /* renamed from: a, reason: collision with root package name */
    private c f1694a;

    /* renamed from: b, reason: collision with root package name */
    private c f1695b;

    /* renamed from: c.a$a, reason: collision with other inner class name */
    static class ExecutorC0039a implements Executor {
        ExecutorC0039a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    private a() {
        c.b bVar = new c.b();
        this.f1695b = bVar;
        this.f1694a = bVar;
    }

    public static Executor d() {
        return f1693e;
    }

    public static a e() {
        if (f1691c != null) {
            return f1691c;
        }
        synchronized (a.class) {
            if (f1691c == null) {
                f1691c = new a();
            }
        }
        return f1691c;
    }

    @Override // c.c
    public void a(Runnable runnable) {
        this.f1694a.a(runnable);
    }

    @Override // c.c
    public boolean b() {
        return this.f1694a.b();
    }

    @Override // c.c
    public void c(Runnable runnable) {
        this.f1694a.c(runnable);
    }
}
