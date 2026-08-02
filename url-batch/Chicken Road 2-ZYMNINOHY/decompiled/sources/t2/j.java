package t2;

import T.C0098p;
import com.google.android.gms.tasks.Task;
import d2.s;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class j extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15418a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final g0.f f15419b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15420c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f15421d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15422e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f15423f;

    public j() {
        g0.f fVar = new g0.f();
        fVar.f8836b = new Object();
        this.f15419b = fVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception a() {
        Exception exc;
        synchronized (this.f15418a) {
            exc = this.f15423f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object b() {
        Object obj;
        synchronized (this.f15418a) {
            try {
                if (!this.f15420c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f15421d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f15423f;
                if (exc != null) {
                    throw new c(exc);
                }
                obj = this.f15422e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean c() {
        boolean z;
        synchronized (this.f15418a) {
            try {
                z = false;
                if (this.f15420c && !this.f15421d && this.f15423f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void d(Exception exc) {
        s.d(exc, "Exception must not be null");
        synchronized (this.f15418a) {
            f();
            this.f15420c = true;
            this.f15423f = exc;
        }
        this.f15419b.c(this);
    }

    public final void e(Object obj) {
        synchronized (this.f15418a) {
            f();
            this.f15420c = true;
            this.f15422e = obj;
        }
        this.f15419b.c(this);
    }

    public final void f() {
        boolean z;
        if (this.f15420c) {
            int i4 = C0098p.f2878a;
            synchronized (this.f15418a) {
                z = this.f15420c;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception a3 = a();
        }
    }

    public final void g() {
        synchronized (this.f15418a) {
            try {
                if (this.f15420c) {
                    this.f15419b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
