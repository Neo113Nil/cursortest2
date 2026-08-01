package p1;

/* loaded from: classes.dex */
public final class t implements v1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3480a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3481b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3482c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3480a = z2;
    }

    @Override // v1.t
    public final v1.x a() {
        return this.d.f3497l;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2603a;
        v1.f fVar2 = this.f3481b;
        fVar2.c(fVar, j2);
        while (fVar2.f4073b >= 16384) {
            e(false);
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2603a;
        synchronized (wVar) {
            if (this.f3482c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3498m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3495j.f3480a) {
                if (this.f3481b.f4073b > 0) {
                    while (this.f3481b.f4073b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3490b.j(wVar2.f3489a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3482c = true;
            }
            this.d.f3490b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3497l.h();
            while (wVar.f3492e >= wVar.f3493f && !this.f3480a && !this.f3482c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3498m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3497l.k();
                }
            }
            wVar.f3497l.k();
            wVar.b();
            min = Math.min(wVar.f3493f - wVar.f3492e, this.f3481b.f4073b);
            wVar.f3492e += min;
            z3 = z2 && min == this.f3481b.f4073b;
        }
        this.d.f3497l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3490b.j(wVar2.f3489a, z3, this.f3481b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2603a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3481b.f4073b > 0) {
            e(false);
            this.d.f3490b.flush();
        }
    }
}
