package y1;

/* loaded from: classes.dex */
public final class t implements E1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4274a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.f f4275b = new E1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4276c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f4274a = z2;
    }

    @Override // E1.t
    public final E1.x a() {
        return this.d.f4291l;
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        byte[] bArr = s1.b.f3607a;
        E1.f fVar2 = this.f4275b;
        fVar2.b(fVar, j2);
        while (fVar2.f202b >= 16384) {
            g(false);
        }
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = s1.b.f3607a;
        synchronized (wVar) {
            if (this.f4276c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f4292m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f4289j.f4274a) {
                if (this.f4275b.f202b > 0) {
                    while (this.f4275b.f202b > 0) {
                        g(true);
                    }
                } else if (z2) {
                    wVar2.f4284b.l(wVar2.f4283a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f4276c = true;
            }
            this.d.f4284b.flush();
            this.d.a();
        }
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = s1.b.f3607a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f4275b.f202b > 0) {
            g(false);
            this.d.f4284b.flush();
        }
    }

    public final void g(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f4291l.h();
            while (wVar.f4286e >= wVar.f4287f && !this.f4274a && !this.f4276c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f4292m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f4291l.k();
                }
            }
            wVar.f4291l.k();
            wVar.b();
            min = Math.min(wVar.f4287f - wVar.f4286e, this.f4275b.f202b);
            wVar.f4286e += min;
            z3 = z2 && min == this.f4275b.f202b;
        }
        this.d.f4291l.h();
        try {
            w wVar2 = this.d;
            wVar2.f4284b.l(wVar2.f4283a, z3, this.f4275b, min);
        } finally {
            wVar = this.d;
        }
    }
}
