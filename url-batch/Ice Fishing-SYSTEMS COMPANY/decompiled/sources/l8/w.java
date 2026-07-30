package l8;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class w implements u8.v {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39200n;

    /* renamed from: u, reason: collision with root package name */
    public final u8.e f39201u = new u8.e();

    /* renamed from: v, reason: collision with root package name */
    public boolean f39202v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f39203w;

    public w(z zVar, boolean z8) {
        this.f39203w = zVar;
        this.f39200n = z8;
    }

    @Override // u8.v
    public final u8.z L() {
        return this.f39203w.f39214D;
    }

    @Override // u8.v
    public final void N(long j9, u8.e eVar) {
        TimeZone timeZone = f8.d.f37815a;
        u8.e eVar2 = this.f39201u;
        eVar2.N(j9, eVar);
        while (eVar2.f41277u >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z8) {
        long min;
        boolean z9;
        z zVar = this.f39203w;
        synchronized (zVar) {
            zVar.f39214D.h();
            while (zVar.f39220w >= zVar.f39221x && !this.f39200n && !this.f39202v && zVar.g() == null) {
                try {
                    zVar.l();
                } catch (Throwable th) {
                    zVar.f39214D.l();
                    throw th;
                }
            }
            zVar.f39214D.l();
            zVar.b();
            min = Math.min(zVar.f39221x - zVar.f39220w, this.f39201u.f41277u);
            zVar.f39220w += min;
            z9 = z8 && min == this.f39201u.f41277u;
        }
        this.f39203w.f39214D.h();
        try {
            z zVar2 = this.f39203w;
            zVar2.f39218u.k(zVar2.f39217n, z9, this.f39201u, min);
        } finally {
            this.f39203w.f39214D.l();
        }
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f39203w;
        TimeZone timeZone = f8.d.f37815a;
        synchronized (zVar) {
            if (this.f39202v) {
                return;
            }
            boolean z8 = zVar.g() == null;
            z zVar2 = this.f39203w;
            if (!zVar2.f39212B.f39200n) {
                if (this.f39201u.f41277u > 0) {
                    while (this.f39201u.f41277u > 0) {
                        a(true);
                    }
                } else if (z8) {
                    zVar2.f39218u.k(zVar2.f39217n, true, null, 0L);
                }
            }
            z zVar3 = this.f39203w;
            synchronized (zVar3) {
                this.f39202v = true;
                zVar3.notifyAll();
            }
            this.f39203w.f39218u.flush();
            this.f39203w.a();
        }
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
        z zVar = this.f39203w;
        TimeZone timeZone = f8.d.f37815a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f39201u.f41277u > 0) {
            a(false);
            this.f39203w.f39218u.flush();
        }
    }
}
