package t3;

import A.AbstractC0017m;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;
import z3.C1448f;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f10877l = Logger.getLogger(g.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final z3.x f10878d;

    /* renamed from: e, reason: collision with root package name */
    public final C1448f f10879e;

    /* renamed from: i, reason: collision with root package name */
    public int f10880i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10881j;

    /* renamed from: k, reason: collision with root package name */
    public final e f10882k;

    public y(z3.x sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f10878d = sink;
        C1448f c1448f = new C1448f();
        this.f10879e = c1448f;
        this.f10880i = 16384;
        this.f10882k = new e(c1448f);
    }

    public final synchronized void a(B peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f10881j) {
                throw new IOException("closed");
            }
            int i2 = this.f10880i;
            int i4 = peerSettings.f10745a;
            if ((i4 & 32) != 0) {
                i2 = peerSettings.f10746b[5];
            }
            this.f10880i = i2;
            if (((i4 & 2) != 0 ? peerSettings.f10746b[1] : -1) != -1) {
                e eVar = this.f10882k;
                int i5 = (i4 & 2) != 0 ? peerSettings.f10746b[1] : -1;
                eVar.getClass();
                int min = Math.min(i5, 16384);
                int i6 = eVar.f10776e;
                if (i6 != min) {
                    if (min < i6) {
                        eVar.f10774c = Math.min(eVar.f10774c, min);
                    }
                    eVar.f10775d = true;
                    eVar.f10776e = min;
                    int i7 = eVar.f10780i;
                    if (min < i7) {
                        if (min == 0) {
                            C1212c[] c1212cArr = eVar.f10777f;
                            C1436t.k(c1212cArr, 0, c1212cArr.length);
                            eVar.f10778g = eVar.f10777f.length - 1;
                            eVar.f10779h = 0;
                            eVar.f10780i = 0;
                        } else {
                            eVar.a(i7 - min);
                        }
                    }
                }
            }
            d(0, 0, 4, 1);
            this.f10878d.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z4, int i2, C1448f c1448f, int i4) {
        if (this.f10881j) {
            throw new IOException("closed");
        }
        d(i2, i4, 0, z4 ? 1 : 0);
        if (i4 > 0) {
            Intrinsics.c(c1448f);
            this.f10878d.e(c1448f, i4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f10881j = true;
        this.f10878d.close();
    }

    public final void d(int i2, int i4, int i5, int i6) {
        Level level = Level.FINE;
        Logger logger = f10877l;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i2, i4, i5, i6));
        }
        if (i4 > this.f10880i) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f10880i + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "reserved bit set: ").toString());
        }
        byte[] bArr = n3.b.f8558a;
        z3.x xVar = this.f10878d;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.b((i4 >>> 16) & 255);
        xVar.b((i4 >>> 8) & 255);
        xVar.b(i4 & 255);
        xVar.b(i5 & 255);
        xVar.b(i6 & 255);
        xVar.d(i2 & Integer.MAX_VALUE);
    }

    public final synchronized void f(int i2, EnumC1211b errorCode, byte[] source) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(source, "debugData");
        if (this.f10881j) {
            throw new IOException("closed");
        }
        if (errorCode.f10755d == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        d(0, source.length + 8, 7, 0);
        this.f10878d.d(i2);
        this.f10878d.d(errorCode.f10755d);
        if (source.length != 0) {
            z3.x xVar = this.f10878d;
            xVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            if (xVar.f12042i) {
                throw new IllegalStateException("closed");
            }
            C1448f c1448f = xVar.f12041e;
            Intrinsics.checkNotNullParameter(source, "source");
            c1448f.w(source, 0, source.length);
            xVar.a();
        }
        this.f10878d.flush();
    }

    public final synchronized void flush() {
        if (this.f10881j) {
            throw new IOException("closed");
        }
        this.f10878d.flush();
    }

    public final synchronized void g(boolean z4, int i2, ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f10881j) {
            throw new IOException("closed");
        }
        this.f10882k.d(headerBlock);
        long j4 = this.f10879e.f11999e;
        long min = Math.min(this.f10880i, j4);
        int i4 = j4 == min ? 4 : 0;
        if (z4) {
            i4 |= 1;
        }
        d(i2, (int) min, 1, i4);
        this.f10878d.e(this.f10879e, min);
        if (j4 > min) {
            long j5 = j4 - min;
            while (j5 > 0) {
                long min2 = Math.min(this.f10880i, j5);
                j5 -= min2;
                d(i2, (int) min2, 9, j5 == 0 ? 4 : 0);
                this.f10878d.e(this.f10879e, min2);
            }
        }
    }

    public final synchronized void h(int i2, int i4, boolean z4) {
        if (this.f10881j) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z4 ? 1 : 0);
        this.f10878d.d(i2);
        this.f10878d.d(i4);
        this.f10878d.flush();
    }

    public final synchronized void i(int i2, EnumC1211b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f10881j) {
            throw new IOException("closed");
        }
        if (errorCode.f10755d == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(i2, 4, 3, 0);
        this.f10878d.d(errorCode.f10755d);
        this.f10878d.flush();
    }

    public final synchronized void j(long j4, int i2) {
        if (this.f10881j) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        d(i2, 4, 8, 0);
        this.f10878d.d((int) j4);
        this.f10878d.flush();
    }
}
