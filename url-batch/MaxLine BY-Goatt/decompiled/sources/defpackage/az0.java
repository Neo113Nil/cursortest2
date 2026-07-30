package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class az0 implements pn2 {
    public final long m;
    public boolean n;
    public final fq o = new fq();
    public final fq p = new fq();
    public boolean q;
    public final /* synthetic */ cz0 r;

    public az0(cz0 cz0Var, long j, boolean z) {
        this.r = cz0Var;
        this.m = j;
        this.n = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        cz0 cz0Var = this.r;
        synchronized (cz0Var) {
            this.q = true;
            fq fqVar = this.p;
            j = fqVar.n;
            fqVar.skip(j);
            cz0Var.notifyAll();
            Unit unit = Unit.a;
        }
        if (j > 0) {
            cz0 cz0Var2 = this.r;
            byte[] bArr = n33.a;
            cz0Var2.b.o(j);
        }
        this.r.a();
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.r.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009f A[LOOP:0: B:3:0x000d->B:45:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[SYNTHETIC] */
    @Override // defpackage.pn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j, fq fqVar) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        long j3;
        fqVar.getClass();
        long j4 = 0;
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            cz0 cz0Var = this.r;
            synchronized (cz0Var) {
                cz0Var.k.h();
                try {
                    synchronized (cz0Var) {
                        i = cz0Var.m;
                    }
                    if (z) {
                        if (j3 != -1) {
                            return j3;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j4 = j2;
                } catch (Throwable th2) {
                    cz0Var.k.k();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.n) {
                Throwable th3 = cz0Var.n;
                if (th3 == null) {
                    synchronized (cz0Var) {
                        int i2 = cz0Var.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        th3 = new ip2(i2);
                    }
                }
                th = th3;
            }
            if (this.q) {
                throw new IOException("stream closed");
            }
            fq fqVar2 = this.p;
            long j5 = fqVar2.n;
            z = false;
            if (j5 > j4) {
                j3 = fqVar2.h(Math.min(j, j5), fqVar);
                long j6 = cz0Var.c + j3;
                cz0Var.c = j6;
                j2 = j4;
                long j7 = j6 - cz0Var.d;
                if (th == null && j7 >= cz0Var.b.B.a() / 2) {
                    cz0Var.b.s(j7, cz0Var.a);
                    cz0Var.d = cz0Var.c;
                }
            } else {
                j2 = j4;
                if (!this.n && th == null) {
                    try {
                        cz0Var.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j3 = -1;
            }
            cz0Var.k.k();
            Unit unit = Unit.a;
            if (z) {
            }
        }
    }
}
