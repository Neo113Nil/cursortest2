package k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f40859c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f40860d = new Executor() { // from class: k.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.f().c(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f40861e = new Executor() { // from class: k.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.f().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f40862a;

    /* renamed from: b, reason: collision with root package name */
    private final e f40863b;

    private c() {
        d dVar = new d();
        this.f40863b = dVar;
        this.f40862a = dVar;
    }

    public static c f() {
        if (f40859c != null) {
            return f40859c;
        }
        synchronized (c.class) {
            try {
                if (f40859c == null) {
                    f40859c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f40859c;
    }

    @Override // k.e
    public void a(Runnable runnable) {
        this.f40862a.a(runnable);
    }

    @Override // k.e
    public boolean b() {
        return this.f40862a.b();
    }

    @Override // k.e
    public void c(Runnable runnable) {
        this.f40862a.c(runnable);
    }
}
