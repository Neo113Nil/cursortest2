package d1;

import N0.r;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class k extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4942a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final V.e f4943b = new V.e();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4944c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f4945d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4946e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final Exception a() {
        Exception exc;
        synchronized (this.f4942a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object b() {
        Object obj;
        synchronized (this.f4942a) {
            try {
                if (!this.f4944c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f4945d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new d(exc);
                }
                obj = this.f4946e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean c() {
        boolean z;
        synchronized (this.f4942a) {
            try {
                z = false;
                if (this.f4944c && !this.f4945d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void d(Exception exc) {
        r.d(exc, "Exception must not be null");
        synchronized (this.f4942a) {
            f();
            this.f4944c = true;
            this.f = exc;
        }
        this.f4943b.e(this);
    }

    public final void e(Object obj) {
        synchronized (this.f4942a) {
            f();
            this.f4944c = true;
            this.f4946e = obj;
        }
        this.f4943b.e(this);
    }

    public final void f() {
        boolean z;
        if (this.f4944c) {
            int i3 = C0297a.f4930a;
            synchronized (this.f4942a) {
                z = this.f4944c;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception a3 = a();
        }
    }

    public final void g() {
        synchronized (this.f4942a) {
            try {
                if (this.f4944c) {
                    this.f4943b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
