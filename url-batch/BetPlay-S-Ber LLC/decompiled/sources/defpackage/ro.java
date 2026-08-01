package defpackage;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ro implements i30 {
    public final boolean f;
    public final p8 g = new p8();
    public boolean h;
    public final /* synthetic */ uo i;

    public ro(uo uoVar, boolean z) {
        this.i = uoVar;
        this.f = z;
    }

    @Override // defpackage.i30
    public final d60 a() {
        return this.i.l;
    }

    @Override // defpackage.i30, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        uo uoVar = this.i;
        byte[] bArr = y70.a;
        synchronized (uoVar) {
            if (this.h) {
                return;
            }
            synchronized (uoVar) {
                z = uoVar.m == 0;
            }
            uo uoVar2 = this.i;
            if (!uoVar2.j.f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        m(true);
                    }
                } else if (z) {
                    uoVar2.b.r(uoVar2.a, true, null, 0L);
                }
            }
            synchronized (this.i) {
                this.h = true;
            }
            this.i.b.flush();
            this.i.a();
        }
    }

    @Override // defpackage.i30
    public final void e(long j, p8 p8Var) {
        byte[] bArr = y70.a;
        p8 p8Var2 = this.g;
        p8Var2.e(j, p8Var);
        while (p8Var2.g >= 16384) {
            m(false);
        }
    }

    @Override // defpackage.i30, java.io.Flushable
    public final void flush() {
        uo uoVar = this.i;
        byte[] bArr = y70.a;
        synchronized (uoVar) {
            uoVar.b();
        }
        while (this.g.g > 0) {
            m(false);
            this.i.b.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void m(boolean z) {
        long min;
        boolean z2;
        uo uoVar = this.i;
        synchronized (uoVar) {
            uoVar.l.h();
            while (uoVar.e >= uoVar.f && !this.f && !this.h) {
                try {
                    synchronized (uoVar) {
                        int i = uoVar.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            uoVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    uoVar.l.k();
                    throw th;
                }
            }
            uoVar.l.k();
            uoVar.b();
            min = Math.min(uoVar.f - uoVar.e, this.g.g);
            uoVar.e += min;
            z2 = z && min == this.g.g;
        }
        this.i.l.h();
        try {
            uo uoVar2 = this.i;
            uoVar2.b.r(uoVar2.a, z2, this.g, min);
        } finally {
            this.i.l.k();
        }
    }
}
