package j4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b0<TResult> extends h<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18157a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final y<TResult> f18158b = new y<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f18159c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f18160d;

    /* renamed from: e, reason: collision with root package name */
    private TResult f18161e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f18162f;

    b0() {
    }

    private final void s() {
        r3.o.l(this.f18159c, "Task is not yet complete");
    }

    private final void t() {
        if (this.f18159c) {
            throw b.a(this);
        }
    }

    private final void u() {
        if (this.f18160d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        synchronized (this.f18157a) {
            if (this.f18159c) {
                this.f18158b.b(this);
            }
        }
    }

    @Override // j4.h
    public final h<TResult> a(Executor executor, c cVar) {
        this.f18158b.a(new q(executor, cVar));
        v();
        return this;
    }

    @Override // j4.h
    public final h<TResult> b(d<TResult> dVar) {
        this.f18158b.a(new s(j.f18166a, dVar));
        v();
        return this;
    }

    @Override // j4.h
    public final h<TResult> c(Executor executor, d<TResult> dVar) {
        this.f18158b.a(new s(executor, dVar));
        v();
        return this;
    }

    @Override // j4.h
    public final h<TResult> d(Executor executor, e eVar) {
        this.f18158b.a(new u(executor, eVar));
        v();
        return this;
    }

    @Override // j4.h
    public final h<TResult> e(Executor executor, f<? super TResult> fVar) {
        this.f18158b.a(new w(executor, fVar));
        v();
        return this;
    }

    @Override // j4.h
    public final <TContinuationResult> h<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        b0 b0Var = new b0();
        this.f18158b.a(new m(executor, aVar, b0Var));
        v();
        return b0Var;
    }

    @Override // j4.h
    public final <TContinuationResult> h<TContinuationResult> g(a<TResult, h<TContinuationResult>> aVar) {
        return h(j.f18166a, aVar);
    }

    @Override // j4.h
    public final <TContinuationResult> h<TContinuationResult> h(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        b0 b0Var = new b0();
        this.f18158b.a(new o(executor, aVar, b0Var));
        v();
        return b0Var;
    }

    @Override // j4.h
    public final Exception i() {
        Exception exc;
        synchronized (this.f18157a) {
            exc = this.f18162f;
        }
        return exc;
    }

    @Override // j4.h
    public final TResult j() {
        TResult tresult;
        synchronized (this.f18157a) {
            s();
            u();
            Exception exc = this.f18162f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = this.f18161e;
        }
        return tresult;
    }

    @Override // j4.h
    public final boolean k() {
        return this.f18160d;
    }

    @Override // j4.h
    public final boolean l() {
        boolean z6;
        synchronized (this.f18157a) {
            z6 = this.f18159c;
        }
        return z6;
    }

    @Override // j4.h
    public final boolean m() {
        boolean z6;
        synchronized (this.f18157a) {
            z6 = false;
            if (this.f18159c && !this.f18160d && this.f18162f == null) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void n(TResult tresult) {
        synchronized (this.f18157a) {
            t();
            this.f18159c = true;
            this.f18161e = tresult;
        }
        this.f18158b.b(this);
    }

    public final boolean o(TResult tresult) {
        synchronized (this.f18157a) {
            if (this.f18159c) {
                return false;
            }
            this.f18159c = true;
            this.f18161e = tresult;
            this.f18158b.b(this);
            return true;
        }
    }

    public final void p(Exception exc) {
        r3.o.j(exc, "Exception must not be null");
        synchronized (this.f18157a) {
            t();
            this.f18159c = true;
            this.f18162f = exc;
        }
        this.f18158b.b(this);
    }

    public final boolean q(Exception exc) {
        r3.o.j(exc, "Exception must not be null");
        synchronized (this.f18157a) {
            if (this.f18159c) {
                return false;
            }
            this.f18159c = true;
            this.f18162f = exc;
            this.f18158b.b(this);
            return true;
        }
    }

    public final boolean r() {
        synchronized (this.f18157a) {
            if (this.f18159c) {
                return false;
            }
            this.f18159c = true;
            this.f18160d = true;
            this.f18158b.b(this);
            return true;
        }
    }
}
