package p1;

/* loaded from: classes.dex */
public final class t implements v1.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3458a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3459b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3460c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3458a = z2;
    }

    @Override // v1.s
    public final v1.w a() {
        return this.d.f3475l;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2581a;
        v1.f fVar2 = this.f3459b;
        fVar2.c(fVar, j2);
        while (fVar2.f4051b >= 16384) {
            e(false);
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2581a;
        synchronized (wVar) {
            if (this.f3460c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3476m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3473j.f3458a) {
                if (this.f3459b.f4051b > 0) {
                    while (this.f3459b.f4051b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3468b.j(wVar2.f3467a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3460c = true;
            }
            this.d.f3468b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3475l.h();
            while (wVar.f3470e >= wVar.f3471f && !this.f3458a && !this.f3460c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3476m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3475l.k();
                }
            }
            wVar.f3475l.k();
            wVar.b();
            min = Math.min(wVar.f3471f - wVar.f3470e, this.f3459b.f4051b);
            wVar.f3470e += min;
            z3 = z2 && min == this.f3459b.f4051b;
        }
        this.d.f3475l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3468b.j(wVar2.f3467a, z3, this.f3459b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2581a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3459b.f4051b > 0) {
            e(false);
            this.d.f3468b.flush();
        }
    }
}
