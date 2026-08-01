package z1;

/* loaded from: classes.dex */
public final class t implements F1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4504a;

    /* renamed from: b, reason: collision with root package name */
    public final F1.f f4505b = new F1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4506c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f4504a = z2;
    }

    @Override // F1.t
    public final F1.x a() {
        return this.d.f4522l;
    }

    @Override // F1.t
    public final void b(F1.f fVar, long j2) {
        byte[] bArr = t1.b.f3898a;
        F1.f fVar2 = this.f4505b;
        fVar2.b(fVar, j2);
        while (fVar2.f247b >= 16384) {
            g(false);
        }
    }

    @Override // F1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = t1.b.f3898a;
        synchronized (wVar) {
            if (this.f4506c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f4523m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f4520j.f4504a) {
                if (this.f4505b.f247b > 0) {
                    while (this.f4505b.f247b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f4514b.l(wVar2.f4513a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f4506c = true;
            }
            this.d.f4514b.flush();
            this.d.a();
        }
    }

    @Override // F1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = t1.b.f3898a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f4505b.f247b > 0) {
            g(false);
            this.d.f4514b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f4522l.h();
            while (wVar.f4516e >= wVar.f4517f && !this.f4504a && !this.f4506c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f4523m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f4522l.k();
                }
            }
            wVar.f4522l.k();
            wVar.b();
            min = Math.min(wVar.f4517f - wVar.f4516e, this.f4505b.f247b);
            wVar.f4516e += min;
            z3 = z2 && min == this.f4505b.f247b;
        }
        this.d.f4522l.h();
        try {
            w wVar2 = this.d;
            wVar2.f4514b.l(wVar2.f4513a, z3, this.f4505b, min);
        } finally {
            wVar = this.d;
        }
    }
}
