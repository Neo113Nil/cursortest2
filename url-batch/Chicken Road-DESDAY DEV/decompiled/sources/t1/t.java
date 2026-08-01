package t1;

/* loaded from: classes.dex */
public final class t implements z1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3829a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.f f3830b = new z1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3831c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3829a = z2;
    }

    @Override // z1.t
    public final z1.x a() {
        return this.d.f3846l;
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        byte[] bArr = n1.b.f3286a;
        z1.f fVar2 = this.f3830b;
        fVar2.c(fVar, j2);
        while (fVar2.f4268b >= 16384) {
            g(false);
        }
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = n1.b.f3286a;
        synchronized (wVar) {
            if (this.f3831c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3847m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3844j.f3829a) {
                if (this.f3830b.f4268b > 0) {
                    while (this.f3830b.f4268b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f3839b.l(wVar2.f3838a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3831c = true;
            }
            this.d.f3839b.flush();
            this.d.a();
        }
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = n1.b.f3286a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3830b.f4268b > 0) {
            g(false);
            this.d.f3839b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3846l.h();
            while (wVar.f3841e >= wVar.f3842f && !this.f3829a && !this.f3831c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3847m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3846l.k();
                }
            }
            wVar.f3846l.k();
            wVar.b();
            min = Math.min(wVar.f3842f - wVar.f3841e, this.f3830b.f4268b);
            wVar.f3841e += min;
            z3 = z2 && min == this.f3830b.f4268b;
        }
        this.d.f3846l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3839b.l(wVar2.f3838a, z3, this.f3830b, min);
        } finally {
            wVar = this.d;
        }
    }
}
