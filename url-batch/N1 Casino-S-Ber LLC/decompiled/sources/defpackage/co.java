package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class co implements f30 {
    public final long f;
    public boolean g;
    public final u8 h = new u8();
    public final u8 i = new u8();
    public boolean j;
    public final /* synthetic */ fo k;

    public co(fo foVar, long j, boolean z) {
        this.k = foVar;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.k.k;
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        do {
            fo foVar = this.k;
            synchronized (foVar) {
                foVar.k.h();
                try {
                    synchronized (foVar) {
                        i = foVar.m;
                    }
                } catch (Throwable th2) {
                    foVar.k.k();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.g) {
                Throwable th3 = foVar.n;
                if (th3 == null) {
                    synchronized (foVar) {
                        int i2 = foVar.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        th3 = new b40(i2);
                    }
                }
                th = th3;
            }
            if (this.j) {
                throw new IOException("stream closed");
            }
            u8 u8Var2 = this.i;
            long j3 = u8Var2.g;
            z = false;
            if (j3 > 0) {
                j2 = u8Var2.b(Math.min(8192L, j3), u8Var);
                long j4 = foVar.c + j2;
                foVar.c = j4;
                long j5 = j4 - foVar.d;
                if (th == null && j5 >= foVar.b.u.f() / 2) {
                    foVar.b.t(foVar.a, j5);
                    foVar.d = foVar.c;
                }
            } else {
                if (!this.g && th == null) {
                    try {
                        foVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
            foVar.k.k();
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
        fo foVar = this.k;
        synchronized (foVar) {
            this.j = true;
            u8 u8Var = this.i;
            j = u8Var.g;
            u8Var.skip(j);
            foVar.notifyAll();
        }
        if (j > 0) {
            m(j);
        }
        this.k.a();
    }

    public final void m(long j) {
        byte[] bArr = r70.a;
        this.k.b.q(j);
    }
}
