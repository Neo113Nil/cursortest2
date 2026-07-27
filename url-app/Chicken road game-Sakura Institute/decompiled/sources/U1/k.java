package U1;

import A.V;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4123a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final V f4124b = new V(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4125c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f4126d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4127e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f4128f;

    @Override // U1.d
    public final k a(Executor executor, b bVar) {
        this.f4124b.h(new h(executor, bVar));
        j();
        return this;
    }

    @Override // U1.d
    public final k b(Executor executor, c cVar) {
        this.f4124b.h(new h(executor, cVar));
        j();
        return this;
    }

    @Override // U1.d
    public final Exception c() {
        Exception exc;
        synchronized (this.f4123a) {
            exc = this.f4128f;
        }
        return exc;
    }

    @Override // U1.d
    public final Object d() {
        Object obj;
        synchronized (this.f4123a) {
            try {
                if (!this.f4125c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f4126d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f4128f;
                if (exc != null) {
                    throw new I1.b(exc);
                }
                obj = this.f4127e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // U1.d
    public final boolean e() {
        return this.f4126d;
    }

    @Override // U1.d
    public final boolean f() {
        boolean z4;
        synchronized (this.f4123a) {
            try {
                z4 = false;
                if (this.f4125c && !this.f4126d && this.f4128f == null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public final void g(Exception exc) {
        synchronized (this.f4123a) {
            i();
            this.f4125c = true;
            this.f4128f = exc;
        }
        this.f4124b.i(this);
    }

    public final void h(Object obj) {
        synchronized (this.f4123a) {
            i();
            this.f4125c = true;
            this.f4127e = obj;
        }
        this.f4124b.i(this);
    }

    public final void i() {
        boolean z4;
        if (this.f4125c) {
            int i2 = a.f4106d;
            synchronized (this.f4123a) {
                z4 = this.f4125c;
            }
            if (!z4) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception c4 = c();
        }
    }

    public final void j() {
        synchronized (this.f4123a) {
            try {
                if (this.f4125c) {
                    this.f4124b.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
