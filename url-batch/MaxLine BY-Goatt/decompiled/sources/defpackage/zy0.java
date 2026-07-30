package defpackage;

import java.io.InterruptedIOException;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zy0 implements ol2 {
    public final boolean m;
    public final fq n = new fq();
    public boolean o;
    public final /* synthetic */ cz0 p;

    public zy0(cz0 cz0Var, boolean z) {
        this.p = cz0Var;
        this.m = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z) {
        long min;
        boolean z2;
        cz0 cz0Var = this.p;
        synchronized (cz0Var) {
            try {
                cz0Var.l.h();
                while (cz0Var.e >= cz0Var.f && !this.m && !this.o) {
                    try {
                        synchronized (cz0Var) {
                            int i = cz0Var.m;
                            if (i != 0) {
                                break;
                            }
                            try {
                                cz0Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    } catch (Throwable th) {
                        cz0Var.l.k();
                        throw th;
                    }
                }
                cz0Var.l.k();
                cz0Var.b();
                min = Math.min(cz0Var.f - cz0Var.e, this.n.n);
                cz0Var.e += min;
                z2 = z && min == this.n.n;
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.p.l.h();
        try {
            cz0 cz0Var2 = this.p;
            cz0Var2.b.p(cz0Var2.a, z2, this.n, min);
        } finally {
            this.p.l.k();
        }
    }

    @Override // defpackage.ol2, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        boolean z;
        cz0 cz0Var = this.p;
        byte[] bArr = n33.a;
        synchronized (cz0Var) {
            if (this.o) {
                return;
            }
            synchronized (cz0Var) {
                z = cz0Var.m == 0;
                Unit unit = Unit.a;
            }
            cz0 cz0Var2 = this.p;
            if (!cz0Var2.j.m) {
                if (this.n.n > 0) {
                    while (this.n.n > 0) {
                        b(true);
                    }
                } else if (z) {
                    cz0Var2.b.p(cz0Var2.a, true, null, 0L);
                }
            }
            synchronized (this.p) {
                this.o = true;
                Unit unit2 = Unit.a;
            }
            this.p.b.flush();
            this.p.a();
        }
    }

    @Override // defpackage.ol2
    public final rx2 e() {
        return this.p.l;
    }

    @Override // defpackage.ol2, java.io.Flushable
    public final void flush() {
        cz0 cz0Var = this.p;
        byte[] bArr = n33.a;
        synchronized (cz0Var) {
            cz0Var.b();
            Unit unit = Unit.a;
        }
        while (this.n.n > 0) {
            b(false);
            this.p.b.flush();
        }
    }

    @Override // defpackage.ol2
    public final void u(long j, fq fqVar) {
        byte[] bArr = n33.a;
        fq fqVar2 = this.n;
        fqVar2.u(j, fqVar);
        while (fqVar2.n >= 16384) {
            b(false);
        }
    }
}
