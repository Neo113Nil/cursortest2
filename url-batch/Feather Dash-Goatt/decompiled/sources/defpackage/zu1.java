package defpackage;

import com.appsflyer.internal.e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zu1 extends Task {
    public final Object a = new Object();
    public final e30 b = new e30();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, lr0 lr0Var) {
        this.b.c(new iu1(executor, lr0Var));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.b.c(new iu1(og1.a, onCompleteListener));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.b.c(new iu1(executor, onCompleteListener));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final zu1 c(Executor executor, mr0 mr0Var) {
        this.b.c(new iu1(executor, mr0Var));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zu1 d(e eVar) {
        e(og1.a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zu1 e(Executor executor, qr0 qr0Var) {
        this.b.c(new iu1(executor, qr0Var));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, en enVar) {
        zu1 zu1Var = new zu1();
        this.b.c(new zt1(executor, enVar, zu1Var, 0));
        p();
        return zu1Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, en enVar) {
        zu1 zu1Var = new zu1();
        this.b.c(new zt1(executor, enVar, zu1Var, 1));
        p();
        return zu1Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new w41(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean isInstance = IOException.class.isInstance(this.f);
                Exception exc = this.f;
                if (isInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new w41(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
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

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(Executor executor, if1 if1Var) {
        zu1 zu1Var = new zu1();
        this.b.c(new iu1(executor, if1Var, zu1Var));
        p();
        return zu1Var;
    }

    public final void l(Exception exc) {
        y90.j(exc, "Exception must not be null");
        synchronized (this.a) {
            o();
            this.c = true;
            this.f = exc;
        }
        this.b.d(this);
    }

    public final void m(Object obj) {
        synchronized (this.a) {
            o();
            this.c = true;
            this.e = obj;
        }
        this.b.d(this);
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.d(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.c) {
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
        }
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
