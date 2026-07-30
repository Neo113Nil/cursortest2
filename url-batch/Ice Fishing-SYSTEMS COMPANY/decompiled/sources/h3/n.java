package h3;

import O2.w;
import com.bumptech.glide.manager.o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38220a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o f38221b = new o(11);

    /* renamed from: c, reason: collision with root package name */
    public boolean f38222c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f38223d;

    /* renamed from: e, reason: collision with root package name */
    public Object f38224e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f38225f;

    public final void a(Executor executor, c cVar) {
        this.f38221b.f(new k(executor, cVar));
        o();
    }

    public final void b(Executor executor, d dVar) {
        this.f38221b.f(new k(executor, dVar));
        o();
    }

    public final void c(Executor executor, e eVar) {
        this.f38221b.f(new k(executor, eVar));
        o();
    }

    public final n d(Executor executor, InterfaceC4567a interfaceC4567a) {
        n nVar = new n();
        this.f38221b.f(new j(executor, interfaceC4567a, nVar, 0));
        o();
        return nVar;
    }

    public final n e(Executor executor, InterfaceC4567a interfaceC4567a) {
        n nVar = new n();
        this.f38221b.f(new j(executor, interfaceC4567a, nVar, 1));
        o();
        return nVar;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f38220a) {
            exc = this.f38225f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.f38220a) {
            try {
                w.j("Task is not yet complete", this.f38222c);
                if (this.f38223d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f38225f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f38224e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z8;
        synchronized (this.f38220a) {
            z8 = this.f38222c;
        }
        return z8;
    }

    public final boolean i() {
        boolean z8;
        synchronized (this.f38220a) {
            try {
                z8 = false;
                if (this.f38222c && !this.f38223d && this.f38225f == null) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    public final n j(Executor executor, g gVar) {
        n nVar = new n();
        this.f38221b.f(new k(executor, gVar, nVar));
        o();
        return nVar;
    }

    public final void k(Exception exc) {
        w.i(exc, "Exception must not be null");
        synchronized (this.f38220a) {
            n();
            this.f38222c = true;
            this.f38225f = exc;
        }
        this.f38221b.j(this);
    }

    public final void l(Object obj) {
        synchronized (this.f38220a) {
            n();
            this.f38222c = true;
            this.f38224e = obj;
        }
        this.f38221b.j(this);
    }

    public final void m() {
        synchronized (this.f38220a) {
            try {
                if (this.f38222c) {
                    return;
                }
                this.f38222c = true;
                this.f38223d = true;
                this.f38221b.j(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (this.f38222c) {
            int i = Q7.m.f2774n;
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception f6 = f();
        }
    }

    public final void o() {
        synchronized (this.f38220a) {
            try {
                if (this.f38222c) {
                    this.f38221b.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
