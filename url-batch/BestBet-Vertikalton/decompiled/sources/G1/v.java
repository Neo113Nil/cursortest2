package G1;

/* loaded from: classes.dex */
public final class v implements M1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f449a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.f f450b = new M1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f451c;
    public final /* synthetic */ y d;

    public v(y yVar, boolean z2) {
        this.d = yVar;
        this.f449a = z2;
    }

    public final void a(boolean z2) {
        long min;
        boolean z3;
        y yVar = this.d;
        synchronized (yVar) {
            yVar.f466l.h();
            while (yVar.f461e >= yVar.f462f && !this.f449a && !this.f451c) {
                try {
                    synchronized (yVar) {
                        int i = yVar.f467m;
                        if (i != 0) {
                            break;
                        } else {
                            yVar.k();
                        }
                    }
                } finally {
                    yVar.f466l.k();
                }
            }
            yVar.f466l.k();
            yVar.b();
            min = Math.min(yVar.f462f - yVar.f461e, this.f450b.f799b);
            yVar.f461e += min;
            z3 = z2 && min == this.f450b.f799b;
        }
        this.d.f466l.h();
        try {
            y yVar2 = this.d;
            yVar2.f459b.r(yVar2.f458a, z3, this.f450b, min);
        } finally {
            yVar = this.d;
        }
    }

    @Override // M1.t
    public final M1.x b() {
        return this.d.f466l;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        y yVar = this.d;
        byte[] bArr = A1.c.f13a;
        synchronized (yVar) {
            if (this.f451c) {
                return;
            }
            synchronized (yVar) {
                z2 = yVar.f467m == 0;
            }
            y yVar2 = this.d;
            if (!yVar2.f464j.f449a) {
                if (this.f450b.f799b > 0) {
                    while (this.f450b.f799b > 0) {
                        a(true);
                    }
                } else if (z2) {
                    yVar2.f459b.r(yVar2.f458a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f451c = true;
            }
            this.d.f459b.flush();
            this.d.a();
        }
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        y yVar = this.d;
        byte[] bArr = A1.c.f13a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f450b.f799b > 0) {
            a(false);
            this.d.f459b.flush();
        }
    }

    @Override // M1.t
    public final void i(M1.f fVar, long j2) {
        byte[] bArr = A1.c.f13a;
        M1.f fVar2 = this.f450b;
        fVar2.i(fVar, j2);
        while (fVar2.f799b >= 16384) {
            a(false);
        }
    }
}
