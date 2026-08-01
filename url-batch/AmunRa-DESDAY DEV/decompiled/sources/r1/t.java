package r1;

/* loaded from: classes.dex */
public final class t implements x1.t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3608a;

    /* renamed from: b, reason: collision with root package name */
    public final x1.f f3609b = new x1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3610c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3608a = z2;
    }

    @Override // x1.t
    public final x1.x a() {
        return this.d.f3625l;
    }

    @Override // x1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = l1.b.f3252a;
        synchronized (wVar) {
            if (this.f3610c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3626m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3623j.f3608a) {
                if (this.f3609b.f4236b > 0) {
                    while (this.f3609b.f4236b > 0) {
                        f(true);
                    }
                } else if (z2) {
                    wVar2.f3618b.l(wVar2.f3617a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3610c = true;
            }
            this.d.f3618b.flush();
            this.d.a();
        }
    }

    public final void f(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3625l.h();
            while (wVar.f3620e >= wVar.f3621f && !this.f3608a && !this.f3610c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3626m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3625l.k();
                }
            }
            wVar.f3625l.k();
            wVar.b();
            min = Math.min(wVar.f3621f - wVar.f3620e, this.f3609b.f4236b);
            wVar.f3620e += min;
            z3 = z2 && min == this.f3609b.f4236b;
        }
        this.d.f3625l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3618b.l(wVar2.f3617a, z3, this.f3609b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // x1.t, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = l1.b.f3252a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3609b.f4236b > 0) {
            f(false);
            this.d.f3618b.flush();
        }
    }

    @Override // x1.t
    public final void g(x1.f fVar, long j2) {
        byte[] bArr = l1.b.f3252a;
        x1.f fVar2 = this.f3609b;
        fVar2.g(fVar, j2);
        while (fVar2.f4236b >= 16384) {
            f(false);
        }
    }
}
