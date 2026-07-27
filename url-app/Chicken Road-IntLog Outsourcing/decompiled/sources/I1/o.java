package I1;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o1.u;

/* loaded from: classes.dex */
public final class o extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1263a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n f1264b = new n();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1265c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f1266d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1267e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f1268f;

    @Override // com.google.android.gms.tasks.Task
    public final o a(Executor executor, e eVar) {
        this.f1264b.b(new l(executor, eVar));
        n();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception b() {
        Exception exc;
        synchronized (this.f1263a) {
            exc = this.f1268f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object c() {
        Object obj;
        synchronized (this.f1263a) {
            try {
                u.i("Task is not yet complete", this.f1265c);
                if (this.f1266d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f1268f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f1267e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean d() {
        boolean z;
        synchronized (this.f1263a) {
            z = this.f1265c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean e() {
        boolean z;
        synchronized (this.f1263a) {
            try {
                z = false;
                if (this.f1265c && !this.f1266d && this.f1268f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final o f(Executor executor, c cVar) {
        this.f1264b.b(new l(executor, cVar));
        n();
        return this;
    }

    public final o g(Executor executor, a aVar) {
        o oVar = new o();
        this.f1264b.b(new k(executor, aVar, oVar, 0));
        n();
        return oVar;
    }

    public final o h(Executor executor, a aVar) {
        o oVar = new o();
        this.f1264b.b(new k(executor, aVar, oVar, 1));
        n();
        return oVar;
    }

    public final o i(Executor executor, g gVar) {
        o oVar = new o();
        this.f1264b.b(new l(executor, gVar, oVar));
        n();
        return oVar;
    }

    public final void j(Exception exc) {
        u.h(exc, "Exception must not be null");
        synchronized (this.f1263a) {
            m();
            this.f1265c = true;
            this.f1268f = exc;
        }
        this.f1264b.c(this);
    }

    public final void k(Object obj) {
        synchronized (this.f1263a) {
            m();
            this.f1265c = true;
            this.f1267e = obj;
        }
        this.f1264b.c(this);
    }

    public final void l() {
        synchronized (this.f1263a) {
            try {
                if (this.f1265c) {
                    return;
                }
                this.f1265c = true;
                this.f1266d = true;
                this.f1264b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        if (this.f1265c) {
            int i2 = F4.l.f732a;
            if (!d()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception b6 = b();
        }
    }

    public final void n() {
        synchronized (this.f1263a) {
            try {
                if (this.f1265c) {
                    this.f1264b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
