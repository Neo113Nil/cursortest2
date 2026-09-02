package k1;

import T0.M;
import U0.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5169a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final M f5170b = new M();

    /* renamed from: c, reason: collision with root package name */
    public boolean f5171c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5172d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5173e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f5174f;

    public final void a(Executor executor, c cVar) {
        this.f5170b.c(new k(executor, cVar));
        n();
    }

    public final void b(Executor executor, e eVar) {
        this.f5170b.c(new k(executor, eVar));
        n();
    }

    public final n c(Executor executor, a aVar) {
        n nVar = new n();
        this.f5170b.c(new j(executor, aVar, nVar, 0));
        n();
        return nVar;
    }

    public final n d(Executor executor, a aVar) {
        n nVar = new n();
        this.f5170b.c(new j(executor, aVar, nVar, 1));
        n();
        return nVar;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.f5169a) {
            exc = this.f5174f;
        }
        return exc;
    }

    public final Object f() {
        Object obj;
        synchronized (this.f5169a) {
            try {
                t.h("Task is not yet complete", this.f5171c);
                if (this.f5172d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f5174f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f5173e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean g() {
        boolean z5;
        synchronized (this.f5169a) {
            z5 = this.f5171c;
        }
        return z5;
    }

    public final boolean h() {
        boolean z5;
        synchronized (this.f5169a) {
            try {
                z5 = false;
                if (this.f5171c && !this.f5172d && this.f5174f == null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    public final n i(Executor executor, g gVar) {
        n nVar = new n();
        this.f5170b.c(new k(executor, gVar, nVar));
        n();
        return nVar;
    }

    public final void j(Exception exc) {
        t.g(exc, "Exception must not be null");
        synchronized (this.f5169a) {
            m();
            this.f5171c = true;
            this.f5174f = exc;
        }
        this.f5170b.d(this);
    }

    public final void k(Object obj) {
        synchronized (this.f5169a) {
            m();
            this.f5171c = true;
            this.f5173e = obj;
        }
        this.f5170b.d(this);
    }

    public final void l() {
        synchronized (this.f5169a) {
            try {
                if (this.f5171c) {
                    return;
                }
                this.f5171c = true;
                this.f5172d = true;
                this.f5170b.d(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        if (this.f5171c) {
            int i7 = J5.l.f1331f;
            if (!g()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception e4 = e();
        }
    }

    public final void n() {
        synchronized (this.f5169a) {
            try {
                if (this.f5171c) {
                    this.f5170b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
