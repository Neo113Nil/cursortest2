package p1;

/* loaded from: classes.dex */
public final class t implements v1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3481a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3482b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3483c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3481a = z2;
    }

    @Override // v1.t
    public final v1.x a() {
        return this.d.f3498l;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2604a;
        v1.f fVar2 = this.f3482b;
        fVar2.c(fVar, j2);
        while (fVar2.f4074b >= 16384) {
            e(false);
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2604a;
        synchronized (wVar) {
            if (this.f3483c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3499m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3496j.f3481a) {
                if (this.f3482b.f4074b > 0) {
                    while (this.f3482b.f4074b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3491b.j(wVar2.f3490a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3483c = true;
            }
            this.d.f3491b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3498l.h();
            while (wVar.f3493e >= wVar.f3494f && !this.f3481a && !this.f3483c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3499m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3498l.k();
                }
            }
            wVar.f3498l.k();
            wVar.b();
            min = Math.min(wVar.f3494f - wVar.f3493e, this.f3482b.f4074b);
            wVar.f3493e += min;
            z3 = z2 && min == this.f3482b.f4074b;
        }
        this.d.f3498l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3491b.j(wVar2.f3490a, z3, this.f3482b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2604a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3482b.f4074b > 0) {
            e(false);
            this.d.f3491b.flush();
        }
    }
}
