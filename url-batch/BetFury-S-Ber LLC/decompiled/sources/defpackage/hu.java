package defpackage;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hu implements ae0 {
    public final boolean f;
    public final t9 g = new t9();
    public boolean h;
    public final /* synthetic */ ku i;

    public hu(ku kuVar, boolean z) {
        this.i = kuVar;
        this.f = z;
    }

    @Override // defpackage.ae0
    public final gi0 a() {
        return this.i.l;
    }

    @Override // defpackage.ae0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        ku kuVar = this.i;
        byte[] bArr = zk0.a;
        synchronized (kuVar) {
            if (this.h) {
                return;
            }
            synchronized (kuVar) {
                z = kuVar.m == null;
            }
            ku kuVar2 = this.i;
            if (!kuVar2.j.f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        i(true);
                    }
                } else if (z) {
                    kuVar2.b.P(kuVar2.a, true, null, 0L);
                }
            }
            synchronized (this.i) {
                this.h = true;
            }
            this.i.b.flush();
            this.i.a();
        }
    }

    @Override // defpackage.ae0, java.io.Flushable
    public final void flush() {
        ku kuVar = this.i;
        byte[] bArr = zk0.a;
        synchronized (kuVar) {
            kuVar.b();
        }
        while (this.g.g > 0) {
            i(false);
            this.i.b.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void i(boolean z) {
        long min;
        boolean z2;
        ku kuVar = this.i;
        synchronized (kuVar) {
            kuVar.l.h();
            while (kuVar.e >= kuVar.f && !this.f && !this.h) {
                try {
                    synchronized (kuVar) {
                        kn knVar = kuVar.m;
                        if (knVar != null) {
                            break;
                        }
                        try {
                            kuVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    kuVar.l.k();
                    throw th;
                }
            }
            kuVar.l.k();
            kuVar.b();
            min = Math.min(kuVar.f - kuVar.e, this.g.g);
            kuVar.e += min;
            z2 = z && min == this.g.g;
        }
        this.i.l.h();
        try {
            ku kuVar2 = this.i;
            kuVar2.b.P(kuVar2.a, z2, this.g, min);
        } finally {
            this.i.l.k();
        }
    }

    @Override // defpackage.ae0
    public final void v(long j, t9 t9Var) {
        byte[] bArr = zk0.a;
        t9 t9Var2 = this.g;
        t9Var2.v(j, t9Var);
        while (t9Var2.g >= 16384) {
            i(false);
        }
    }
}
