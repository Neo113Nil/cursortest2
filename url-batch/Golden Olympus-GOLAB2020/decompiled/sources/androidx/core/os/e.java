package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11823a;

    /* renamed from: b, reason: collision with root package name */
    private a f11824b;

    /* renamed from: c, reason: collision with root package name */
    private Object f11825c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11826d;

    public interface a {
        void a();
    }

    private void c() {
        while (this.f11826d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f11823a) {
                    return;
                }
                this.f11823a = true;
                this.f11826d = true;
                a aVar = this.f11824b;
                Object obj = this.f11825c;
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f11826d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f11826d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f11824b == aVar) {
                    return;
                }
                this.f11824b = aVar;
                if (this.f11823a && aVar != null) {
                    aVar.a();
                }
            } finally {
            }
        }
    }
}
