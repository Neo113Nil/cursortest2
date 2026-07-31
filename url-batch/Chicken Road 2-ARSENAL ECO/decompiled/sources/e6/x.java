package e6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class x implements n6.w {

    /* renamed from: f, reason: collision with root package name */
    public final long f4146f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4147g;

    /* renamed from: h, reason: collision with root package name */
    public final n6.f f4148h = new n6.f();

    /* renamed from: i, reason: collision with root package name */
    public final n6.f f4149i = new n6.f();

    /* renamed from: j, reason: collision with root package name */
    public boolean f4150j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f4151k;

    public x(z zVar, long j4, boolean z5) {
        this.f4151k = zVar;
        this.f4146f = j4;
        this.f4147g = z5;
    }

    @Override // n6.w
    public final n6.y b() {
        return this.f4151k.f4162o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        z zVar = this.f4151k;
        synchronized (zVar) {
            this.f4150j = true;
            n6.f fVar = this.f4149i;
            j4 = fVar.f5524g;
            fVar.skip(j4);
            zVar.notifyAll();
        }
        if (j4 > 0) {
            z zVar2 = this.f4151k;
            TimeZone timeZone = Y5.e.f3102a;
            zVar2.f4154g.h(j4);
        }
        this.f4151k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:12:0x001c, B:32:0x00b9, B:63:0x00df, B:64:0x00e4, B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:4:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:13:0x0025, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[Catch: all -> 0x0022, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:12:0x001c, B:32:0x00b9, B:63:0x00df, B:64:0x00e4, B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:4:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    @Override // n6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(long j4, n6.f fVar) {
        boolean z5;
        boolean z6;
        Throwable th;
        long j7;
        long j8;
        do {
            z zVar = this.f4151k;
            synchronized (zVar) {
                zVar.f4154g.getClass();
                w wVar = zVar.f4161n;
                z5 = true;
                try {
                    if (!wVar.f4144h && !wVar.f4142f) {
                        z6 = false;
                        if (z6) {
                            zVar.f4162o.h();
                        }
                        if (zVar.h() != null || this.f4147g) {
                            th = null;
                        } else {
                            th = zVar.f4165r;
                            if (th == null) {
                                EnumC0356b h7 = zVar.h();
                                kotlin.jvm.internal.i.b(h7);
                                th = new E(h7);
                            }
                        }
                        if (!this.f4150j) {
                            throw new IOException("stream closed");
                        }
                        n6.f fVar2 = this.f4149i;
                        long j9 = fVar2.f5524g;
                        if (j9 > 0) {
                            j8 = fVar2.i(Math.min(8192L, j9), fVar);
                            f6.a.b(zVar.f4155h, j8, 0L, 2);
                            long a7 = zVar.f4155h.a();
                            if (th == null) {
                                j7 = -1;
                                if (a7 >= zVar.f4154g.f4120v.a() / 2) {
                                    zVar.f4154g.v(a7, zVar.f4153f);
                                    f6.a.b(zVar.f4155h, 0L, a7, 1);
                                }
                            } else {
                                j7 = -1;
                            }
                        } else {
                            j7 = -1;
                            if (this.f4147g || th != null) {
                                j8 = -1;
                            } else {
                                try {
                                    zVar.wait();
                                    j8 = -1;
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                        }
                        z5 = false;
                    }
                    if (zVar.h() != null) {
                    }
                    th = null;
                    if (!this.f4150j) {
                    }
                } finally {
                    if (z6) {
                        zVar.f4162o.l();
                    }
                }
                z6 = true;
                if (z6) {
                }
            }
            this.f4151k.f4154g.f4119u.getClass();
        } while (z5);
        if (j8 != j7) {
            return j8;
        }
        if (th == null) {
            return j7;
        }
        throw th;
    }
}
