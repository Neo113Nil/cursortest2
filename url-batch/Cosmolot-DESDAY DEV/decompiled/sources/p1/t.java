package p1;

/* loaded from: classes.dex */
public final class t implements v1.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3459a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3460b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3461c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3459a = z2;
    }

    @Override // v1.s
    public final v1.w a() {
        return this.d.f3476l;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2582a;
        v1.f fVar2 = this.f3460b;
        fVar2.c(fVar, j2);
        while (fVar2.f4052b >= 16384) {
            e(false);
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2582a;
        synchronized (wVar) {
            if (this.f3461c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3477m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3474j.f3459a) {
                if (this.f3460b.f4052b > 0) {
                    while (this.f3460b.f4052b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3469b.j(wVar2.f3468a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3461c = true;
            }
            this.d.f3469b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3476l.h();
            while (wVar.f3471e >= wVar.f3472f && !this.f3459a && !this.f3461c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3477m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3476l.k();
                }
            }
            wVar.f3476l.k();
            wVar.b();
            min = Math.min(wVar.f3472f - wVar.f3471e, this.f3460b.f4052b);
            wVar.f3471e += min;
            z3 = z2 && min == this.f3460b.f4052b;
        }
        this.d.f3476l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3469b.j(wVar2.f3468a, z3, this.f3460b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2582a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3460b.f4052b > 0) {
            e(false);
            this.d.f3469b.flush();
        }
    }
}
