package e6;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class w implements n6.u {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4142f;

    /* renamed from: g, reason: collision with root package name */
    public final n6.f f4143g = new n6.f();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f4145i;

    public w(z zVar, boolean z5) {
        this.f4145i = zVar;
        this.f4142f = z5;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z5) {
        long min;
        boolean z6;
        z zVar = this.f4145i;
        synchronized (zVar) {
            zVar.f4163p.h();
            while (zVar.f4156i >= zVar.f4157j && !this.f4142f && !this.f4144h && zVar.h() == null) {
                try {
                    try {
                        zVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    zVar.f4163p.l();
                    throw th;
                }
            }
            zVar.f4163p.l();
            zVar.d();
            min = Math.min(zVar.f4157j - zVar.f4156i, this.f4143g.f5524g);
            zVar.f4156i += min;
            z6 = z5 && min == this.f4143g.f5524g;
        }
        this.f4145i.f4163p.h();
        try {
            z zVar2 = this.f4145i;
            zVar2.f4154g.m(zVar2.f4153f, z6, this.f4143g, min);
        } finally {
            this.f4145i.f4163p.l();
        }
    }

    @Override // n6.u
    public final n6.y b() {
        return this.f4145i.f4163p;
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f4145i;
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (zVar) {
            if (this.f4144h) {
                return;
            }
            boolean z5 = zVar.h() == null;
            z zVar2 = this.f4145i;
            if (!zVar2.f4161n.f4142f) {
                if (this.f4143g.f5524g > 0) {
                    while (this.f4143g.f5524g > 0) {
                        a(true);
                    }
                } else if (z5) {
                    zVar2.f4154g.m(zVar2.f4153f, true, null, 0L);
                }
            }
            z zVar3 = this.f4145i;
            synchronized (zVar3) {
                this.f4144h = true;
                zVar3.notifyAll();
            }
            this.f4145i.f4154g.flush();
            this.f4145i.a();
        }
    }

    @Override // n6.u, java.io.Flushable
    public final void flush() {
        z zVar = this.f4145i;
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (zVar) {
            zVar.d();
        }
        while (this.f4143g.f5524g > 0) {
            a(false);
            this.f4145i.f4154g.flush();
        }
    }

    @Override // n6.u
    public final void l(long j4, n6.f fVar) {
        TimeZone timeZone = Y5.e.f3102a;
        n6.f fVar2 = this.f4143g;
        fVar2.l(j4, fVar);
        while (fVar2.f5524g >= 16384) {
            a(false);
        }
    }
}
