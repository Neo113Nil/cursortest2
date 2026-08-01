package w1;

/* loaded from: classes.dex */
public final class t implements C1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4159a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.f f4160b = new C1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4161c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f4159a = z2;
    }

    @Override // C1.t
    public final C1.x a() {
        return this.d.f4176l;
    }

    @Override // C1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = q1.b.f3491a;
        synchronized (wVar) {
            if (this.f4161c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f4177m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f4174j.f4159a) {
                if (this.f4160b.f182b > 0) {
                    while (this.f4160b.f182b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f4169b.l(wVar2.f4168a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f4161c = true;
            }
            this.d.f4169b.flush();
            this.d.a();
        }
    }

    @Override // C1.t
    public final void f(C1.f fVar, long j2) {
        byte[] bArr = q1.b.f3491a;
        C1.f fVar2 = this.f4160b;
        fVar2.f(fVar, j2);
        while (fVar2.f182b >= 16384) {
            g(false);
        }
    }

    @Override // C1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = q1.b.f3491a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f4160b.f182b > 0) {
            g(false);
            this.d.f4169b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f4176l.h();
            while (wVar.f4171e >= wVar.f4172f && !this.f4159a && !this.f4161c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f4177m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f4176l.k();
                }
            }
            wVar.f4176l.k();
            wVar.b();
            min = Math.min(wVar.f4172f - wVar.f4171e, this.f4160b.f182b);
            wVar.f4171e += min;
            z3 = z2 && min == this.f4160b.f182b;
        }
        this.d.f4176l.h();
        try {
            w wVar2 = this.d;
            wVar2.f4169b.l(wVar2.f4168a, z3, this.f4160b, min);
        } finally {
            wVar = this.d;
        }
    }
}
