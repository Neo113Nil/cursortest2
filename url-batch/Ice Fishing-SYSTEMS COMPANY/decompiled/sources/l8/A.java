package l8;

import com.google.android.gms.internal.ads.CL;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class A implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f39083y = Logger.getLogger(h.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final u8.p f39084n;

    /* renamed from: u, reason: collision with root package name */
    public final u8.e f39085u;

    /* renamed from: v, reason: collision with root package name */
    public int f39086v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39087w;

    /* renamed from: x, reason: collision with root package name */
    public final f f39088x;

    public A(u8.p sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f39084n = sink;
        u8.e eVar = new u8.e();
        this.f39085u = eVar;
        this.f39086v = 16384;
        this.f39088x = new f(eVar);
    }

    public final void a(D peerSettings) {
        kotlin.jvm.internal.h.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f39087w) {
                    throw new IOException("closed");
                }
                int i = this.f39086v;
                int i4 = peerSettings.f39093a;
                if ((i4 & 32) != 0) {
                    i = peerSettings.f39094b[5];
                }
                this.f39086v = i;
                if (((i4 & 2) != 0 ? peerSettings.f39094b[1] : -1) != -1) {
                    f fVar = this.f39088x;
                    int i9 = (i4 & 2) != 0 ? peerSettings.f39094b[1] : -1;
                    fVar.getClass();
                    int min = Math.min(i9, 16384);
                    int i10 = fVar.f39124d;
                    if (i10 != min) {
                        if (min < i10) {
                            fVar.f39122b = Math.min(fVar.f39122b, min);
                        }
                        fVar.f39123c = true;
                        fVar.f39124d = min;
                        int i11 = fVar.f39128h;
                        if (min < i11) {
                            if (min == 0) {
                                C4712d[] c4712dArr = fVar.f39125e;
                                AbstractC4978i.M(c4712dArr, 0, c4712dArr.length);
                                fVar.f39126f = fVar.f39125e.length - 1;
                                fVar.f39127g = 0;
                                fVar.f39128h = 0;
                            } else {
                                fVar.a(i11 - min);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.f39084n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z8, int i, u8.e eVar, int i4) {
        synchronized (this) {
            if (this.f39087w) {
                throw new IOException("closed");
            }
            g(i, i4, 0, z8 ? 1 : 0);
            if (i4 > 0) {
                kotlin.jvm.internal.h.b(eVar);
                this.f39084n.N(i4, eVar);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f39087w = true;
            this.f39084n.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f39087w) {
                throw new IOException("closed");
            }
            this.f39084n.flush();
        }
    }

    public final void g(int i, int i4, int i9, int i10) {
        if (i9 != 8) {
            Level level = Level.FINE;
            Logger logger = f39083y;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(i, i4, i9, i10, false));
            }
        }
        if (i4 > this.f39086v) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39086v + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(CL.i(i, "reserved bit set: ").toString());
        }
        byte[] bArr = f8.c.f37814a;
        u8.p pVar = this.f39084n;
        kotlin.jvm.internal.h.e(pVar, "<this>");
        pVar.t((i4 >>> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        pVar.t((i4 >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        pVar.t(i4 & com.anythink.basead.exoplayer.k.p.f8630b);
        pVar.t(i9 & com.anythink.basead.exoplayer.k.p.f8630b);
        pVar.t(i10 & com.anythink.basead.exoplayer.k.p.f8630b);
        pVar.g(i & Integer.MAX_VALUE);
    }

    public final void i(int i, EnumC4710b enumC4710b, byte[] bArr) {
        synchronized (this) {
            if (this.f39087w) {
                throw new IOException("closed");
            }
            if (enumC4710b.f39104n == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            g(0, bArr.length + 8, 7, 0);
            this.f39084n.g(i);
            this.f39084n.g(enumC4710b.f39104n);
            if (bArr.length != 0) {
                u8.p pVar = this.f39084n;
                if (pVar.f41306v) {
                    throw new IllegalStateException("closed");
                }
                pVar.f41305u.V(bArr, 0, bArr.length);
                pVar.b();
            }
            this.f39084n.flush();
        }
    }

    public final void j(boolean z8, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f39087w) {
                throw new IOException("closed");
            }
            this.f39088x.d(arrayList);
            long j9 = this.f39085u.f41277u;
            long min = Math.min(this.f39086v, j9);
            int i4 = j9 == min ? 4 : 0;
            if (z8) {
                i4 |= 1;
            }
            g(i, (int) min, 1, i4);
            this.f39084n.N(min, this.f39085u);
            if (j9 > min) {
                long j10 = j9 - min;
                while (j10 > 0) {
                    long min2 = Math.min(this.f39086v, j10);
                    j10 -= min2;
                    g(i, (int) min2, 9, j10 == 0 ? 4 : 0);
                    this.f39084n.N(min2, this.f39085u);
                }
            }
        }
    }

    public final void k(int i, int i4, boolean z8) {
        synchronized (this) {
            if (this.f39087w) {
                throw new IOException("closed");
            }
            g(0, 8, 6, z8 ? 1 : 0);
            this.f39084n.g(i);
            this.f39084n.g(i4);
            this.f39084n.flush();
        }
    }

    public final void m(int i, EnumC4710b enumC4710b) {
        synchronized (this) {
            if (this.f39087w) {
                throw new IOException("closed");
            }
            if (enumC4710b.f39104n == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(i, 4, 3, 0);
            this.f39084n.g(enumC4710b.f39104n);
            this.f39084n.flush();
        }
    }

    public final void n(int i, long j9) {
        synchronized (this) {
            try {
                if (this.f39087w) {
                    throw new IOException("closed");
                }
                if (j9 == 0 || j9 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j9).toString());
                }
                Logger logger = f39083y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i, 4, j9, false));
                }
                g(i, 4, 8, 0);
                this.f39084n.g((int) j9);
                this.f39084n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
