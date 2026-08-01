package G1;

/* loaded from: classes.dex */
public final class v implements M1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f433a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.f f434b = new M1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f436d;

    public v(y yVar, boolean z2) {
        this.f436d = yVar;
        this.f433a = z2;
    }

    public final void a(boolean z2) {
        long min;
        boolean z3;
        y yVar = this.f436d;
        synchronized (yVar) {
            yVar.f451l.h();
            while (yVar.e >= yVar.f447f && !this.f433a && !this.f435c) {
                try {
                    synchronized (yVar) {
                        int i = yVar.f452m;
                        if (i != 0) {
                            break;
                        } else {
                            yVar.k();
                        }
                    }
                } finally {
                    yVar.f451l.k();
                }
            }
            yVar.f451l.k();
            yVar.b();
            min = Math.min(yVar.f447f - yVar.e, this.f434b.f827b);
            yVar.e += min;
            z3 = z2 && min == this.f434b.f827b;
        }
        this.f436d.f451l.h();
        try {
            y yVar2 = this.f436d;
            yVar2.f444b.D(yVar2.f443a, z3, this.f434b, min);
        } finally {
            yVar = this.f436d;
        }
    }

    @Override // M1.t
    public final M1.x b() {
        return this.f436d.f451l;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        y yVar = this.f436d;
        byte[] bArr = A1.c.f19a;
        synchronized (yVar) {
            if (this.f435c) {
                return;
            }
            synchronized (yVar) {
                z2 = yVar.f452m == 0;
            }
            y yVar2 = this.f436d;
            if (!yVar2.j.f433a) {
                if (this.f434b.f827b > 0) {
                    while (this.f434b.f827b > 0) {
                        a(true);
                    }
                } else if (z2) {
                    yVar2.f444b.D(yVar2.f443a, true, null, 0L);
                }
            }
            synchronized (this.f436d) {
                this.f435c = true;
            }
            this.f436d.f444b.flush();
            this.f436d.a();
        }
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        y yVar = this.f436d;
        byte[] bArr = A1.c.f19a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f434b.f827b > 0) {
            a(false);
            this.f436d.f444b.flush();
        }
    }

    @Override // M1.t
    public final void n(M1.f fVar, long j) {
        byte[] bArr = A1.c.f19a;
        M1.f fVar2 = this.f434b;
        fVar2.n(fVar, j);
        while (fVar2.f827b >= 16384) {
            a(false);
        }
    }
}
