package U1;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class g implements c, b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4110a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f4111b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4112c;

    /* renamed from: d, reason: collision with root package name */
    public int f4113d;

    /* renamed from: e, reason: collision with root package name */
    public int f4114e;

    /* renamed from: f, reason: collision with root package name */
    public int f4115f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f4116g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4117h;

    public g(int i2, k kVar) {
        this.f4111b = i2;
        this.f4112c = kVar;
    }

    @Override // U1.b
    public final void a(Exception exc) {
        synchronized (this.f4110a) {
            this.f4114e++;
            this.f4116g = exc;
            c();
        }
    }

    @Override // U1.c
    public final void b(Object obj) {
        synchronized (this.f4110a) {
            this.f4113d++;
            c();
        }
    }

    public final void c() {
        if (this.f4113d + this.f4114e + this.f4115f == this.f4111b) {
            if (this.f4116g != null) {
                this.f4112c.g(new ExecutionException(this.f4114e + " out of " + this.f4111b + " underlying tasks failed", this.f4116g));
                return;
            }
            if (!this.f4117h) {
                this.f4112c.h(null);
                return;
            }
            k kVar = this.f4112c;
            synchronized (kVar.f4123a) {
                try {
                    if (kVar.f4125c) {
                        return;
                    }
                    kVar.f4125c = true;
                    kVar.f4126d = true;
                    kVar.f4124b.i(kVar);
                } finally {
                }
            }
        }
    }
}
