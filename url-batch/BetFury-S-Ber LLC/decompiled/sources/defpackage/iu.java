package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class iu implements ke0 {
    public final long f;
    public boolean g;
    public final t9 h = new t9();
    public final t9 i = new t9();
    public boolean j;
    public final /* synthetic */ ku k;

    public iu(ku kuVar, long j, boolean z) {
        this.k = kuVar;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.k.k;
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        kn knVar;
        Throwable th;
        boolean z;
        long j2;
        do {
            ku kuVar = this.k;
            synchronized (kuVar) {
                kuVar.k.h();
                try {
                    synchronized (kuVar) {
                        knVar = kuVar.m;
                    }
                } finally {
                    kuVar.k.k();
                }
            }
            if (knVar == null || this.g) {
                th = null;
            } else {
                th = kuVar.n;
                if (th == null) {
                    synchronized (kuVar) {
                        kn knVar2 = kuVar.m;
                        knVar2.getClass();
                        th = new lf0(knVar2);
                    }
                }
            }
            if (this.j) {
                throw new IOException("stream closed");
            }
            t9 t9Var2 = this.i;
            long j3 = t9Var2.g;
            z = false;
            if (j3 > 0) {
                j2 = t9Var2.c(Math.min(8192L, j3), t9Var);
                long j4 = kuVar.c + j2;
                kuVar.c = j4;
                long j5 = j4 - kuVar.d;
                if (th == null && j5 >= kuVar.b.u.a() / 2) {
                    kuVar.b.R(kuVar.a, j5);
                    kuVar.d = kuVar.c;
                }
            } else {
                if (!this.g && th == null) {
                    try {
                        kuVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
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
        ku kuVar = this.k;
        synchronized (kuVar) {
            this.j = true;
            t9 t9Var = this.i;
            j = t9Var.g;
            t9Var.skip(j);
            kuVar.notifyAll();
        }
        if (j > 0) {
            i(j);
        }
        this.k.a();
    }

    public final void i(long j) {
        byte[] bArr = zk0.a;
        this.k.b.O(j);
    }
}
