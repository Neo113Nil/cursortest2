package v1;

/* loaded from: classes.dex */
public final class t implements B1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4131a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.f f4132b = new B1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4133c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f4131a = z2;
    }

    @Override // B1.t
    public final B1.x a() {
        return this.d.f4148l;
    }

    @Override // B1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = p1.b.f3455a;
        synchronized (wVar) {
            if (this.f4133c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f4149m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f4146j.f4131a) {
                if (this.f4132b.f69b > 0) {
                    while (this.f4132b.f69b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f4141b.l(wVar2.f4140a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f4133c = true;
            }
            this.d.f4141b.flush();
            this.d.a();
        }
    }

    @Override // B1.t
    public final void e(B1.f fVar, long j2) {
        byte[] bArr = p1.b.f3455a;
        B1.f fVar2 = this.f4132b;
        fVar2.e(fVar, j2);
        while (fVar2.f69b >= 16384) {
            g(false);
        }
    }

    @Override // B1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = p1.b.f3455a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f4132b.f69b > 0) {
            g(false);
            this.d.f4141b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f4148l.h();
            while (wVar.f4143e >= wVar.f4144f && !this.f4131a && !this.f4133c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f4149m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f4148l.k();
                }
            }
            wVar.f4148l.k();
            wVar.b();
            min = Math.min(wVar.f4144f - wVar.f4143e, this.f4132b.f69b);
            wVar.f4143e += min;
            z3 = z2 && min == this.f4132b.f69b;
        }
        this.d.f4148l.h();
        try {
            w wVar2 = this.d;
            wVar2.f4141b.l(wVar2.f4140a, z3, this.f4132b, min);
        } finally {
            wVar = this.d;
        }
    }
}
