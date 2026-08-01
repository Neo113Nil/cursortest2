package defpackage;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class bo implements v20 {
    public final boolean f;
    public final u8 g = new u8();
    public boolean h;
    public final /* synthetic */ fo i;

    public bo(fo foVar, boolean z) {
        this.i = foVar;
        this.f = z;
    }

    @Override // defpackage.v20
    public final v50 a() {
        return this.i.l;
    }

    @Override // defpackage.v20, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        boolean z;
        fo foVar = this.i;
        byte[] bArr = r70.a;
        synchronized (foVar) {
            if (this.h) {
                return;
            }
            synchronized (foVar) {
                z = foVar.m == 0;
            }
            fo foVar2 = this.i;
            if (!foVar2.j.f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        m(true);
                    }
                } else if (z) {
                    foVar2.b.r(foVar2.a, true, null, 0L);
                }
            }
            synchronized (this.i) {
                this.h = true;
            }
            this.i.b.flush();
            this.i.a();
        }
    }

    @Override // defpackage.v20
    public final void e(long j, u8 u8Var) {
        byte[] bArr = r70.a;
        u8 u8Var2 = this.g;
        u8Var2.e(j, u8Var);
        while (u8Var2.g >= 16384) {
            m(false);
        }
    }

    @Override // defpackage.v20, java.io.Flushable
    public final void flush() {
        fo foVar = this.i;
        byte[] bArr = r70.a;
        synchronized (foVar) {
            foVar.b();
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
        fo foVar = this.i;
        synchronized (foVar) {
            foVar.l.h();
            while (foVar.e >= foVar.f && !this.f && !this.h) {
                try {
                    synchronized (foVar) {
                        int i = foVar.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            foVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    foVar.l.k();
                    throw th;
                }
            }
            foVar.l.k();
            foVar.b();
            min = Math.min(foVar.f - foVar.e, this.g.g);
            foVar.e += min;
            z2 = z && min == this.g.g;
        }
        this.i.l.h();
        try {
            fo foVar2 = this.i;
            foVar2.b.r(foVar2.a, z2, this.g, min);
        } finally {
            this.i.l.k();
        }
    }
}
