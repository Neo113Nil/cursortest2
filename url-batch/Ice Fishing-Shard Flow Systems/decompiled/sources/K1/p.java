package K1;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import t1.u;

/* loaded from: classes.dex */
public final class p extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1447a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m f1448b = new m();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1449c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f1450d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1451e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f1452f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, c cVar) {
        this.f1448b.b(new k(executor, cVar));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f1448b.b(new k(i.f1429a, onCompleteListener));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.f1448b.b(new k(executor, onCompleteListener));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final p c(Executor executor, d dVar) {
        this.f1448b.b(new k(executor, dVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final p d(com.appsflyer.internal.e eVar) {
        e(i.f1429a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final p e(Executor executor, e eVar) {
        this.f1448b.b(new k(executor, eVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, a aVar) {
        p pVar = new p();
        this.f1448b.b(new j(executor, aVar, pVar, 0));
        p();
        return pVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, a aVar) {
        p pVar = new p();
        this.f1448b.b(new j(executor, aVar, pVar, 1));
        p();
        return pVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f1447a) {
            exc = this.f1452f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f1447a) {
            try {
                u.h("Task is not yet complete", this.f1449c);
                if (this.f1450d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f1452f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f1451e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.f1447a) {
            try {
                u.h("Task is not yet complete", this.f1449c);
                if (this.f1450d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f1452f)) {
                    throw ((Throwable) IOException.class.cast(this.f1452f));
                }
                Exception exc = this.f1452f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f1451e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        return this.f1450d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z7;
        synchronized (this.f1447a) {
            try {
                z7 = false;
                if (this.f1449c && !this.f1450d && this.f1452f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z7;
        synchronized (this.f1447a) {
            z7 = this.f1449c;
        }
        return z7;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(Executor executor, g gVar) {
        p pVar = new p();
        this.f1448b.b(new k(executor, gVar, pVar));
        p();
        return pVar;
    }

    public final void l(Object obj) {
        synchronized (this.f1447a) {
            o();
            this.f1449c = true;
            this.f1451e = obj;
        }
        this.f1448b.c(this);
    }

    public final void m(Exception exc) {
        u.g(exc, "Exception must not be null");
        synchronized (this.f1447a) {
            o();
            this.f1449c = true;
            this.f1452f = exc;
        }
        this.f1448b.c(this);
    }

    public final void n() {
        synchronized (this.f1447a) {
            try {
                if (this.f1449c) {
                    return;
                }
                this.f1449c = true;
                this.f1450d = true;
                this.f1448b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f1449c) {
            int i2 = b.f1427d;
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
        }
    }

    public final void p() {
        synchronized (this.f1447a) {
            try {
                if (this.f1449c) {
                    this.f1448b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
