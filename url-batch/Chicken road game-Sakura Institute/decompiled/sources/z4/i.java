package z4;

import a0.s0;
import e7.o;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10108a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final s0 f10109b = new s0(6);

    /* renamed from: c, reason: collision with root package name */
    public boolean f10110c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10111d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10112e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f10113f;

    public final Object a() {
        Object obj;
        synchronized (this.f10108a) {
            try {
                if (!this.f10110c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.f10111d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f10113f;
                if (exc != null) {
                    throw new b4.c(exc);
                }
                obj = this.f10112e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean b() {
        boolean z8;
        synchronized (this.f10108a) {
            try {
                z8 = false;
                if (this.f10110c && !this.f10111d && this.f10113f == null) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    public final void c(Exception exc) {
        synchronized (this.f10108a) {
            e();
            this.f10110c = true;
            this.f10113f = exc;
        }
        this.f10109b.j(this);
    }

    public final void d(Object obj) {
        synchronized (this.f10108a) {
            e();
            this.f10110c = true;
            this.f10112e = obj;
        }
        this.f10109b.j(this);
    }

    public final void e() {
        boolean z8;
        if (this.f10110c) {
            int i7 = o.f2884f;
            synchronized (this.f10108a) {
                z8 = this.f10110c;
            }
            if (!z8) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.f10108a) {
                Exception exc = this.f10113f;
            }
        }
    }

    public final void f() {
        synchronized (this.f10108a) {
            try {
                if (this.f10110c) {
                    this.f10109b.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
