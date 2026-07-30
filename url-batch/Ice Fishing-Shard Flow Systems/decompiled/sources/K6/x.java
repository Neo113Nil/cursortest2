package K6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements T6.w {

    /* renamed from: d, reason: collision with root package name */
    public final long f1602d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1603e;

    /* renamed from: i, reason: collision with root package name */
    public final T6.f f1604i = new T6.f();

    /* renamed from: l, reason: collision with root package name */
    public final T6.f f1605l = new T6.f();

    /* renamed from: m, reason: collision with root package name */
    public boolean f1606m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f1607n;

    public x(z zVar, long j, boolean z7) {
        this.f1607n = zVar;
        this.f1602d = j;
        this.f1603e = z7;
    }

    @Override // T6.w
    public final T6.y b() {
        return this.f1607n.f1618r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        z zVar = this.f1607n;
        synchronized (zVar) {
            this.f1606m = true;
            T6.f fVar = this.f1605l;
            j = fVar.f2617e;
            fVar.skip(j);
            zVar.notifyAll();
            Unit unit = Unit.f6114a;
        }
        if (j > 0) {
            z zVar2 = this.f1607n;
            TimeZone timeZone = E6.e.f712a;
            zVar2.f1610e.j(j);
        }
        this.f1607n.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x000c, B:7:0x0019, B:12:0x0023, B:32:0x00b7, B:33:0x00bc, B:63:0x00e6, B:64:0x00eb, B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0076, B:29:0x0085, B:46:0x009b, B:50:0x00a1, B:53:0x00a6, B:54:0x00b2, B:57:0x00dc, B:58:0x00e3), top: B:4:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:14:0x002c, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:21:0x004b, B:23:0x004f, B:25:0x005b, B:27:0x0076, B:29:0x0085, B:46:0x009b, B:50:0x00a1, B:53:0x00a6, B:54:0x00b2, B:57:0x00dc, B:58:0x00e3), top: B:13:0x002c, outer: #2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc A[SYNTHETIC] */
    @Override // T6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(long j, T6.f sink) {
        boolean z7;
        boolean z8;
        Throwable th;
        long j7;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            z zVar = this.f1607n;
            synchronized (zVar) {
                zVar.f1610e.getClass();
                w wVar = zVar.f1617q;
                z7 = true;
                try {
                    if (!wVar.f1600i && !wVar.f1598d) {
                        z8 = false;
                        if (z8) {
                            zVar.f1618r.h();
                        }
                        if (zVar.g() != null || this.f1603e) {
                            th = null;
                        } else {
                            th = zVar.f1621u;
                            if (th == null) {
                                EnumC0131b g7 = zVar.g();
                                Intrinsics.b(g7);
                                th = new F(g7);
                            }
                        }
                        if (!this.f1606m) {
                            throw new IOException("stream closed");
                        }
                        T6.f fVar = this.f1605l;
                        long j8 = fVar.f2617e;
                        if (j8 > 0) {
                            j7 = fVar.o(Math.min(8192L, j8), sink);
                            L6.a.c(zVar.f1611i, j7, 0L, 2);
                            long b7 = zVar.f1611i.b();
                            if (th == null && b7 >= zVar.f1610e.f1578y.a() / 2) {
                                zVar.f1610e.B(b7, zVar.f1609d);
                                L6.a.c(zVar.f1611i, 0L, b7, 1);
                            }
                            z7 = false;
                        } else {
                            if (this.f1603e || th != null) {
                                z7 = false;
                            } else {
                                try {
                                    zVar.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            j7 = -1;
                        }
                        Unit unit = Unit.f6114a;
                    }
                    if (zVar.g() != null) {
                    }
                    th = null;
                    if (!this.f1606m) {
                    }
                } finally {
                    if (z8) {
                        zVar.f1618r.l();
                    }
                }
                z8 = true;
                if (z8) {
                }
            }
            z zVar2 = this.f1607n;
            C0132c c0132c = zVar2.f1610e.f1577x;
            L6.a windowCounter = zVar2.f1611i;
            c0132c.getClass();
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        } while (z7);
        if (j7 != -1) {
            return j7;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
