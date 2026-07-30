package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ys3 extends jt2 {
    public final Object a = new Object();
    public final kl3 b = new kl3(4);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // defpackage.jt2
    public final void a(Executor executor, tu1 tu1Var) {
        this.b.e(new ei3(executor, tu1Var));
        t();
    }

    @Override // defpackage.jt2
    public final jt2 b(uu1 uu1Var) {
        this.b.e(new ei3(lt2.a, uu1Var));
        t();
        return this;
    }

    @Override // defpackage.jt2
    public final void c(Executor executor, uu1 uu1Var) {
        this.b.e(new ei3(executor, uu1Var));
        t();
    }

    @Override // defpackage.jt2
    public final ys3 d(Executor executor, xu1 xu1Var) {
        this.b.e(new ei3(executor, xu1Var));
        t();
        return this;
    }

    @Override // defpackage.jt2
    public final ys3 e(Executor executor, ev1 ev1Var) {
        this.b.e(new ei3(executor, ev1Var));
        t();
        return this;
    }

    @Override // defpackage.jt2
    public final jt2 f(Executor executor, p30 p30Var) {
        ys3 ys3Var = new ys3();
        this.b.e(new te3(executor, p30Var, ys3Var, 0));
        t();
        return ys3Var;
    }

    @Override // defpackage.jt2
    public final jt2 g(Executor executor, p30 p30Var) {
        ys3 ys3Var = new ys3();
        this.b.e(new te3(executor, p30Var, ys3Var, 1));
        t();
        return ys3Var;
    }

    @Override // defpackage.jt2
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.jt2
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                ll3.x(this.c, "Task is not yet complete");
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new mc2(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.jt2
    public final Object j() {
        Object obj;
        synchronized (this.a) {
            try {
                ll3.x(this.c, "Task is not yet complete");
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean isInstance = IOException.class.isInstance(this.f);
                Exception exc = this.f;
                if (isInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new mc2(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.jt2
    public final boolean k() {
        return this.d;
    }

    @Override // defpackage.jt2
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.jt2
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.jt2
    public final jt2 n(lq2 lq2Var) {
        e92 e92Var = lt2.a;
        ys3 ys3Var = new ys3();
        this.b.e(new ei3(e92Var, lq2Var, ys3Var));
        t();
        return ys3Var;
    }

    @Override // defpackage.jt2
    public final jt2 o(Executor executor, lq2 lq2Var) {
        ys3 ys3Var = new ys3();
        this.b.e(new ei3(executor, lq2Var, ys3Var));
        t();
        return ys3Var;
    }

    public final void p(Exception exc) {
        ll3.w(exc, "Exception must not be null");
        synchronized (this.a) {
            s();
            this.c = true;
            this.f = exc;
        }
        this.b.g(this);
    }

    public final void q(Object obj) {
        synchronized (this.a) {
            s();
            this.c = true;
            this.e = obj;
        }
        this.b.g(this);
    }

    public final void r() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        if (this.c) {
            if (!l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception h = h();
        }
    }

    public final void t() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
