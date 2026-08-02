package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddm extends ddi {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final kks e = new kks();

    private final void s() {
        if (this.b) {
            if (!e()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception c = c();
        }
    }

    @Override // defpackage.ddi
    public final ddi a(Executor executor, dcy dcyVar) {
        ddm ddmVar = new ddm();
        this.e.e(new ddf(executor, dcyVar, ddmVar, 1));
        n();
        return ddmVar;
    }

    @Override // defpackage.ddi
    public final ddi b(Executor executor, ddh ddhVar) {
        ddm ddmVar = new ddm();
        this.e.e(new ddf(executor, ddhVar, ddmVar, 0));
        n();
        return ddmVar;
    }

    @Override // defpackage.ddi
    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.ddi
    public final Object d() {
        Object obj;
        synchronized (this.a) {
            oy.aq(this.b, "Task is not yet complete");
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.d;
            if (exc != null) {
                throw new ddg(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.ddi
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.ddi
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ddi
    public final void g(Executor executor, ddb ddbVar) {
        this.e.e(new dda(executor, ddbVar, 0));
        n();
    }

    @Override // defpackage.ddi
    public final void h(Executor executor, ddc ddcVar) {
        this.e.e(new dda(executor, ddcVar, 2));
        n();
    }

    @Override // defpackage.ddi
    public final void i(Executor executor, ddd dddVar) {
        this.e.e(new dda(executor, dddVar, 3));
        n();
    }

    @Override // defpackage.ddi
    public final void j(Executor executor, dde ddeVar) {
        this.e.e(new dda(executor, ddeVar, 4));
        n();
    }

    @Override // defpackage.ddi
    public final void k(ddb ddbVar) {
        g(ddl.a, ddbVar);
    }

    @Override // defpackage.ddi
    public final void l(ddc ddcVar) {
        h(ddl.a, ddcVar);
    }

    @Override // defpackage.ddi
    public final void m(ddd dddVar) {
        i(ddl.a, dddVar);
    }

    public final void n() {
        synchronized (this.a) {
            if (this.b) {
                this.e.f(this);
            }
        }
    }

    public final void o(Exception exc) {
        oy.au(exc, "Exception must not be null");
        synchronized (this.a) {
            s();
            this.b = true;
            this.d = exc;
        }
        this.e.f(this);
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            s();
            this.b = true;
            this.f = obj;
        }
        this.e.f(this);
    }

    public final boolean q(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.f(this);
            return true;
        }
    }

    public final void r() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.f(this);
        }
    }
}
