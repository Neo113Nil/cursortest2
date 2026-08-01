package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class oq implements h60 {
    public final long f;
    public boolean g;
    public final h9 h = new h9();
    public final h9 i = new h9();
    public boolean j;
    public final /* synthetic */ qq k;

    public oq(qq qqVar, long j, boolean z) {
        this.k = qqVar;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.k.k;
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        do {
            qq qqVar = this.k;
            synchronized (qqVar) {
                qqVar.k.h();
                try {
                    synchronized (qqVar) {
                        i = qqVar.m;
                    }
                } catch (Throwable th2) {
                    qqVar.k.k();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.g) {
                Throwable th3 = qqVar.n;
                if (th3 == null) {
                    synchronized (qqVar) {
                        int i2 = qqVar.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        th3 = new e70(i2);
                    }
                }
                th = th3;
            }
            if (this.j) {
                throw new IOException("stream closed");
            }
            h9 h9Var2 = this.i;
            long j3 = h9Var2.g;
            z = false;
            if (j3 > 0) {
                j2 = h9Var2.b(Math.min(8192L, j3), h9Var);
                long j4 = qqVar.c + j2;
                qqVar.c = j4;
                long j5 = j4 - qqVar.d;
                if (th == null && j5 >= qqVar.b.u.a() / 2) {
                    qqVar.b.t(qqVar.a, j5);
                    qqVar.d = qqVar.c;
                }
            } else {
                if (!this.g && th == null) {
                    try {
                        qqVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
            qqVar.k.k();
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
        qq qqVar = this.k;
        synchronized (qqVar) {
            this.j = true;
            h9 h9Var = this.i;
            j = h9Var.g;
            h9Var.skip(j);
            qqVar.notifyAll();
        }
        if (j > 0) {
            f(j);
        }
        this.k.a();
    }

    public final void f(long j) {
        byte[] bArr = cb0.a;
        this.k.b.q(j);
    }
}
