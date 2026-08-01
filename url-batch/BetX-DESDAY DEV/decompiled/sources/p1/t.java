package p1;

/* loaded from: classes.dex */
public final class t implements v1.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3858a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3859b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f3861d;

    public t(w wVar, boolean z2) {
        this.f3861d = wVar;
        this.f3858a = z2;
    }

    @Override // v1.u
    public final v1.y a() {
        return this.f3861d.f3878l;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.f3861d;
        byte[] bArr = j1.b.f2971a;
        synchronized (wVar) {
            if (this.f3860c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3879m == 0;
            }
            w wVar2 = this.f3861d;
            if (!wVar2.f3876j.f3858a) {
                if (this.f3859b.f4488b > 0) {
                    while (this.f3859b.f4488b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f3870b.l(wVar2.f3869a, true, null, 0L);
                }
            }
            synchronized (this.f3861d) {
                this.f3860c = true;
            }
            this.f3861d.f3870b.flush();
            this.f3861d.a();
        }
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2971a;
        v1.f fVar2 = this.f3859b;
        fVar2.d(fVar, j2);
        while (fVar2.f4488b >= 16384) {
            g(false);
        }
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        w wVar = this.f3861d;
        byte[] bArr = j1.b.f2971a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3859b.f4488b > 0) {
            g(false);
            this.f3861d.f3870b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.f3861d;
        synchronized (wVar) {
            wVar.f3878l.h();
            while (wVar.f3873e >= wVar.f3874f && !this.f3858a && !this.f3860c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3879m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3878l.k();
                }
            }
            wVar.f3878l.k();
            wVar.b();
            min = Math.min(wVar.f3874f - wVar.f3873e, this.f3859b.f4488b);
            wVar.f3873e += min;
            z3 = z2 && min == this.f3859b.f4488b;
        }
        this.f3861d.f3878l.h();
        try {
            w wVar2 = this.f3861d;
            wVar2.f3870b.l(wVar2.f3869a, z3, this.f3859b, min);
        } finally {
            wVar = this.f3861d;
        }
    }
}
