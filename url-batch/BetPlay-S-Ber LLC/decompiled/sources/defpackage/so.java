package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class so implements q30 {
    public final long f;
    public boolean g;
    public final p8 h = new p8();
    public final p8 i = new p8();
    public boolean j;
    public final /* synthetic */ uo k;

    public so(uo uoVar, long j, boolean z) {
        this.k = uoVar;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.k.k;
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        do {
            uo uoVar = this.k;
            synchronized (uoVar) {
                uoVar.k.h();
                try {
                    synchronized (uoVar) {
                        i = uoVar.m;
                    }
                } catch (Throwable th2) {
                    uoVar.k.k();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.g) {
                Throwable th3 = uoVar.n;
                if (th3 == null) {
                    synchronized (uoVar) {
                        int i2 = uoVar.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        th3 = new k40(i2);
                    }
                }
                th = th3;
            }
            if (this.j) {
                throw new IOException("stream closed");
            }
            p8 p8Var2 = this.i;
            long j3 = p8Var2.g;
            z = false;
            if (j3 > 0) {
                j2 = p8Var2.b(Math.min(8192L, j3), p8Var);
                long j4 = uoVar.c + j2;
                uoVar.c = j4;
                long j5 = j4 - uoVar.d;
                if (th == null && j5 >= uoVar.b.u.b() / 2) {
                    uoVar.b.t(uoVar.a, j5);
                    uoVar.d = uoVar.c;
                }
            } else {
                if (!this.g && th == null) {
                    try {
                        uoVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
            uoVar.k.k();
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        uo uoVar = this.k;
        synchronized (uoVar) {
            this.j = true;
            p8 p8Var = this.i;
            j = p8Var.g;
            p8Var.skip(j);
            uoVar.notifyAll();
        }
        if (j > 0) {
            m(j);
        }
        this.k.a();
    }

    public final void m(long j) {
        byte[] bArr = y70.a;
        this.k.b.q(j);
    }
}
