package p1;

/* loaded from: classes.dex */
public final class t implements v1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3464a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3465b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3466c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3464a = z2;
    }

    @Override // v1.t
    public final v1.x a() {
        return this.d.f3481l;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2587a;
        v1.f fVar2 = this.f3465b;
        fVar2.c(fVar, j2);
        while (fVar2.f4057b >= 16384) {
            e(false);
        }
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2587a;
        synchronized (wVar) {
            if (this.f3466c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3482m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3479j.f3464a) {
                if (this.f3465b.f4057b > 0) {
                    while (this.f3465b.f4057b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3474b.j(wVar2.f3473a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3466c = true;
            }
            this.d.f3474b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3481l.h();
            while (wVar.f3476e >= wVar.f3477f && !this.f3464a && !this.f3466c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3482m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3481l.k();
                }
            }
            wVar.f3481l.k();
            wVar.b();
            min = Math.min(wVar.f3477f - wVar.f3476e, this.f3465b.f4057b);
            wVar.f3476e += min;
            z3 = z2 && min == this.f3465b.f4057b;
        }
        this.d.f3481l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3474b.j(wVar2.f3473a, z3, this.f3465b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2587a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3465b.f4057b > 0) {
            e(false);
            this.d.f3474b.flush();
        }
    }
}
