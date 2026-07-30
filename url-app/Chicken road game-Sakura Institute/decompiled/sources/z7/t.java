package z7;

import f8.g0;
import f8.i0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final long f10224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10225g;

    /* renamed from: h, reason: collision with root package name */
    public final f8.f f10226h = new f8.f();

    /* renamed from: i, reason: collision with root package name */
    public final f8.f f10227i = new f8.f();

    /* renamed from: j, reason: collision with root package name */
    public boolean f10228j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f10229k;

    public t(v vVar, long j8, boolean z8) {
        this.f10229k = vVar;
        this.f10224f = j8;
        this.f10225g = z8;
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f10229k.f10241k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j8;
        v vVar = this.f10229k;
        synchronized (vVar) {
            this.f10228j = true;
            f8.f fVar = this.f10227i;
            j8 = fVar.f3598g;
            fVar.skip(j8);
            vVar.notifyAll();
        }
        if (j8 > 0) {
            v vVar2 = this.f10229k;
            byte[] bArr = t7.b.f8932a;
            vVar2.f10232b.t(j8);
        }
        this.f10229k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[LOOP:0: B:3:0x000e->B:40:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    @Override // f8.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(long j8, f8.f fVar) {
        int i7;
        Throwable th;
        boolean z8;
        long j9;
        r6.k.f(fVar, "sink");
        long j10 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
        }
        while (true) {
            v vVar = this.f10229k;
            synchronized (vVar) {
                vVar.f10241k.h();
                try {
                    synchronized (vVar) {
                        i7 = vVar.f10243m;
                    }
                    if (z8) {
                        if (j9 != -1) {
                            return j9;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j10 = 0;
                } finally {
                    vVar.f10241k.k();
                }
            }
            if (i7 == 0 || this.f10225g) {
                th = null;
            } else {
                th = vVar.f10244n;
                if (th == null) {
                    synchronized (vVar) {
                        int i8 = vVar.f10243m;
                        r6.i.c(i8);
                        th = new a0(i8);
                    }
                }
            }
            if (this.f10228j) {
                throw new IOException("stream closed");
            }
            f8.f fVar2 = this.f10227i;
            long j11 = fVar2.f3598g;
            z8 = false;
            if (j11 > j10) {
                j9 = fVar2.v(Math.min(j8, j11), fVar);
                long j12 = vVar.f10233c + j9;
                vVar.f10233c = j12;
                long j13 = j12 - vVar.f10234d;
                if (th == null && j13 >= vVar.f10232b.f10196u.a() / 2) {
                    vVar.f10232b.z(j13, vVar.f10231a);
                    vVar.f10234d = vVar.f10233c;
                }
            } else {
                if (!this.f10225g && th == null) {
                    try {
                        vVar.wait();
                        z8 = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j9 = -1;
            }
            if (z8) {
            }
        }
    }
}
