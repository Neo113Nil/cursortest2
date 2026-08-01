package y1;

/* loaded from: classes.dex */
public final class t implements E1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4303a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.f f4304b = new E1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4305c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f4303a = z2;
    }

    @Override // E1.t
    public final E1.x a() {
        return this.d.f4320l;
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        byte[] bArr = s1.b.f3721a;
        E1.f fVar2 = this.f4304b;
        fVar2.b(fVar, j2);
        while (fVar2.f203b >= 16384) {
            g(false);
        }
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = s1.b.f3721a;
        synchronized (wVar) {
            if (this.f4305c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f4321m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f4318j.f4303a) {
                if (this.f4304b.f203b > 0) {
                    while (this.f4304b.f203b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f4313b.l(wVar2.f4312a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f4305c = true;
            }
            this.d.f4313b.flush();
            this.d.a();
        }
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = s1.b.f3721a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f4304b.f203b > 0) {
            g(false);
            this.d.f4313b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f4320l.h();
            while (wVar.f4315e >= wVar.f4316f && !this.f4303a && !this.f4305c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f4321m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f4320l.k();
                }
            }
            wVar.f4320l.k();
            wVar.b();
            min = Math.min(wVar.f4316f - wVar.f4315e, this.f4304b.f203b);
            wVar.f4315e += min;
            z3 = z2 && min == this.f4304b.f203b;
        }
        this.d.f4320l.h();
        try {
            w wVar2 = this.d;
            wVar2.f4313b.l(wVar2.f4312a, z3, this.f4304b, min);
        } finally {
            wVar = this.d;
        }
    }
}
