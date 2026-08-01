package p1;

/* loaded from: classes.dex */
public final class t implements v1.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3854a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3855b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f3857d;

    public t(w wVar, boolean z2) {
        this.f3857d = wVar;
        this.f3854a = z2;
    }

    @Override // v1.u
    public final v1.y a() {
        return this.f3857d.f3874l;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.f3857d;
        byte[] bArr = j1.b.f2967a;
        synchronized (wVar) {
            if (this.f3856c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3875m == 0;
            }
            w wVar2 = this.f3857d;
            if (!wVar2.f3872j.f3854a) {
                if (this.f3855b.f4484b > 0) {
                    while (this.f3855b.f4484b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f3866b.l(wVar2.f3865a, true, null, 0L);
                }
            }
            synchronized (this.f3857d) {
                this.f3856c = true;
            }
            this.f3857d.f3866b.flush();
            this.f3857d.a();
        }
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2967a;
        v1.f fVar2 = this.f3855b;
        fVar2.d(fVar, j2);
        while (fVar2.f4484b >= 16384) {
            g(false);
        }
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        w wVar = this.f3857d;
        byte[] bArr = j1.b.f2967a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3855b.f4484b > 0) {
            g(false);
            this.f3857d.f3866b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.f3857d;
        synchronized (wVar) {
            wVar.f3874l.h();
            while (wVar.f3869e >= wVar.f3870f && !this.f3854a && !this.f3856c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3875m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3874l.k();
                }
            }
            wVar.f3874l.k();
            wVar.b();
            min = Math.min(wVar.f3870f - wVar.f3869e, this.f3855b.f4484b);
            wVar.f3869e += min;
            z3 = z2 && min == this.f3855b.f4484b;
        }
        this.f3857d.f3874l.h();
        try {
            w wVar2 = this.f3857d;
            wVar2.f3866b.l(wVar2.f3865a, z3, this.f3855b, min);
        } finally {
            wVar = this.f3857d;
        }
    }
}
