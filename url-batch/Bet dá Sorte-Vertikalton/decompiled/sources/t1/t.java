package t1;

/* loaded from: classes.dex */
public final class t implements z1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.f f3912b = new z1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3913c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3911a = z2;
    }

    @Override // z1.t
    public final z1.x a() {
        return this.d.f3928l;
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        byte[] bArr = n1.b.f3319a;
        z1.f fVar2 = this.f3912b;
        fVar2.c(fVar, j2);
        while (fVar2.f4269b >= 16384) {
            g(false);
        }
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = n1.b.f3319a;
        synchronized (wVar) {
            if (this.f3913c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3929m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3926j.f3911a) {
                if (this.f3912b.f4269b > 0) {
                    while (this.f3912b.f4269b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f3921b.l(wVar2.f3920a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3913c = true;
            }
            this.d.f3921b.flush();
            this.d.a();
        }
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = n1.b.f3319a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3912b.f4269b > 0) {
            g(false);
            this.d.f3921b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3928l.h();
            while (wVar.f3923e >= wVar.f3924f && !this.f3911a && !this.f3913c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3929m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3928l.k();
                }
            }
            wVar.f3928l.k();
            wVar.b();
            min = Math.min(wVar.f3924f - wVar.f3923e, this.f3912b.f4269b);
            wVar.f3923e += min;
            z3 = z2 && min == this.f3912b.f4269b;
        }
        this.d.f3928l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3921b.l(wVar2.f3920a, z3, this.f3912b, min);
        } finally {
            wVar = this.d;
        }
    }
}
