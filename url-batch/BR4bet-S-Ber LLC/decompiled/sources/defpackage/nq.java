package defpackage;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nq implements x50 {
    public final boolean f;
    public final h9 g = new h9();
    public boolean h;
    public final /* synthetic */ qq i;

    public nq(qq qqVar, boolean z) {
        this.i = qqVar;
        this.f = z;
    }

    @Override // defpackage.x50
    public final f90 a() {
        return this.i.l;
    }

    @Override // defpackage.x50, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        boolean z;
        qq qqVar = this.i;
        byte[] bArr = cb0.a;
        synchronized (qqVar) {
            if (this.h) {
                return;
            }
            synchronized (qqVar) {
                z = qqVar.m == 0;
            }
            qq qqVar2 = this.i;
            if (!qqVar2.j.f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        f(true);
                    }
                } else if (z) {
                    qqVar2.b.r(qqVar2.a, true, null, 0L);
                }
            }
            synchronized (this.i) {
                this.h = true;
            }
            this.i.b.flush();
            this.i.a();
        }
    }

    @Override // defpackage.x50
    public final void e(long j, h9 h9Var) {
        byte[] bArr = cb0.a;
        h9 h9Var2 = this.g;
        h9Var2.e(j, h9Var);
        while (h9Var2.g >= 16384) {
            f(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void f(boolean z) {
        long min;
        boolean z2;
        qq qqVar = this.i;
        synchronized (qqVar) {
            qqVar.l.h();
            while (qqVar.e >= qqVar.f && !this.f && !this.h) {
                try {
                    synchronized (qqVar) {
                        int i = qqVar.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            qqVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    qqVar.l.k();
                    throw th;
                }
            }
            qqVar.l.k();
            qqVar.b();
            min = Math.min(qqVar.f - qqVar.e, this.g.g);
            qqVar.e += min;
            z2 = z && min == this.g.g;
        }
        this.i.l.h();
        try {
            qq qqVar2 = this.i;
            qqVar2.b.r(qqVar2.a, z2, this.g, min);
        } finally {
            this.i.l.k();
        }
    }

    @Override // defpackage.x50, java.io.Flushable
    public final void flush() {
        qq qqVar = this.i;
        byte[] bArr = cb0.a;
        synchronized (qqVar) {
            qqVar.b();
        }
        while (this.g.g > 0) {
            f(false);
            this.i.b.flush();
        }
    }
}
