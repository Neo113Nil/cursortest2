package p1;

/* loaded from: classes.dex */
public final class t implements v1.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3476a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f3477b = new v1.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3478c;
    public final /* synthetic */ w d;

    public t(w wVar, boolean z2) {
        this.d = wVar;
        this.f3476a = z2;
    }

    @Override // v1.s
    public final v1.w a() {
        return this.d.f3493l;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        byte[] bArr = j1.b.f2599a;
        v1.f fVar2 = this.f3477b;
        fVar2.c(fVar, j2);
        while (fVar2.f4069b >= 16384) {
            e(false);
        }
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        w wVar = this.d;
        byte[] bArr = j1.b.f2599a;
        synchronized (wVar) {
            if (this.f3478c) {
                return;
            }
            synchronized (wVar) {
                z2 = wVar.f3494m == 0;
            }
            w wVar2 = this.d;
            if (!wVar2.f3491j.f3476a) {
                if (this.f3477b.f4069b > 0) {
                    while (this.f3477b.f4069b > 0) {
                        e(true);
                    }
                } else if (z2) {
                    wVar2.f3486b.j(wVar2.f3485a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.f3478c = true;
            }
            this.d.f3486b.flush();
            this.d.a();
        }
    }

    public final void e(boolean z2) {
        long min;
        boolean z3;
        w wVar = this.d;
        synchronized (wVar) {
            wVar.f3493l.h();
            while (wVar.f3488e >= wVar.f3489f && !this.f3476a && !this.f3478c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f3494m;
                        if (i != 0) {
                            break;
                        } else {
                            wVar.k();
                        }
                    }
                } finally {
                    wVar.f3493l.k();
                }
            }
            wVar.f3493l.k();
            wVar.b();
            min = Math.min(wVar.f3489f - wVar.f3488e, this.f3477b.f4069b);
            wVar.f3488e += min;
            z3 = z2 && min == this.f3477b.f4069b;
        }
        this.d.f3493l.h();
        try {
            w wVar2 = this.d;
            wVar2.f3486b.j(wVar2.f3485a, z3, this.f3477b, min);
        } finally {
            wVar = this.d;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        w wVar = this.d;
        byte[] bArr = j1.b.f2599a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f3477b.f4069b > 0) {
            e(false);
            this.d.f3486b.flush();
        }
    }
}
