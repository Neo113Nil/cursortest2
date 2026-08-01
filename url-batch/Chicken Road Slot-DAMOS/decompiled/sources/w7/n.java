package w7;

import c7.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10132a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m f10133b = new m();

    /* renamed from: c, reason: collision with root package name */
    public boolean f10134c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10135d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10136e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f10137f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, b bVar) {
        this.f10133b.b(new k(executor, bVar));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f10133b.b(new k(h.f10118a, onCompleteListener));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.f10133b.b(new k(executor, onCompleteListener));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final n c(Executor executor, c cVar) {
        this.f10133b.b(new k(executor, cVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final n d(com.appsflyer.internal.e eVar) {
        e(h.f10118a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final n e(Executor executor, d dVar) {
        this.f10133b.b(new k(executor, dVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, a aVar) {
        n nVar = new n();
        this.f10133b.b(new j(executor, aVar, nVar, 0));
        p();
        return nVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, a aVar) {
        n nVar = new n();
        this.f10133b.b(new j(executor, aVar, nVar, 1));
        p();
        return nVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f10132a) {
            exc = this.f10137f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f10132a) {
            try {
                c0.i("Task is not yet complete", this.f10134c);
                if (this.f10135d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f10137f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f10136e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.f10132a) {
            try {
                c0.i("Task is not yet complete", this.f10134c);
                if (this.f10135d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean isInstance = IOException.class.isInstance(this.f10137f);
                Exception exc = this.f10137f;
                if (isInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f10136e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        return this.f10135d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f10132a) {
            try {
                z10 = false;
                if (this.f10134c && !this.f10135d && this.f10137f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z10;
        synchronized (this.f10132a) {
            z10 = this.f10134c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(Executor executor, f fVar) {
        n nVar = new n();
        this.f10133b.b(new k(executor, fVar, nVar));
        p();
        return nVar;
    }

    public final void l(Object obj) {
        synchronized (this.f10132a) {
            o();
            this.f10134c = true;
            this.f10136e = obj;
        }
        this.f10133b.c(this);
    }

    public final void m(Exception exc) {
        c0.h(exc, "Exception must not be null");
        synchronized (this.f10132a) {
            o();
            this.f10134c = true;
            this.f10137f = exc;
        }
        this.f10133b.c(this);
    }

    public final void n() {
        synchronized (this.f10132a) {
            try {
                if (this.f10134c) {
                    return;
                }
                this.f10134c = true;
                this.f10135d = true;
                this.f10133b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f10134c) {
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
        }
    }

    public final void p() {
        synchronized (this.f10132a) {
            try {
                if (this.f10134c) {
                    this.f10133b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
