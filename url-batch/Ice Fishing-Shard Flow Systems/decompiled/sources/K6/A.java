package K6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f1474n = Logger.getLogger(h.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final T6.g f1475d;

    /* renamed from: e, reason: collision with root package name */
    public final T6.f f1476e;

    /* renamed from: i, reason: collision with root package name */
    public int f1477i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1478l;

    /* renamed from: m, reason: collision with root package name */
    public final C0135f f1479m;

    public A(T6.p sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f1475d = sink;
        T6.f fVar = new T6.f();
        this.f1476e = fVar;
        this.f1477i = 16384;
        this.f1479m = new C0135f(fVar);
    }

    public final void B(long j, int i2) {
        synchronized (this) {
            try {
                if (this.f1478l) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f1474n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(false, i2, 4, j));
                }
                g(i2, 4, 8, 0);
                this.f1475d.writeInt((int) j);
                this.f1475d.flush();
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(E peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f1478l) {
                    throw new IOException("closed");
                }
                int i2 = this.f1477i;
                int i5 = peerSettings.f1487a;
                if ((i5 & 32) != 0) {
                    i2 = peerSettings.f1488b[5];
                }
                this.f1477i = i2;
                if (((i5 & 2) != 0 ? peerSettings.f1488b[1] : -1) != -1) {
                    C0135f c0135f = this.f1479m;
                    int i7 = (i5 & 2) != 0 ? peerSettings.f1488b[1] : -1;
                    c0135f.getClass();
                    int min = Math.min(i7, 16384);
                    int i8 = c0135f.f1519d;
                    if (i8 != min) {
                        if (min < i8) {
                            c0135f.f1517b = Math.min(c0135f.f1517b, min);
                        }
                        c0135f.f1518c = true;
                        c0135f.f1519d = min;
                        int i9 = c0135f.f1523h;
                        if (min < i9) {
                            if (min == 0) {
                                C0133d[] c0133dArr = c0135f.f1520e;
                                kotlin.collections.o.i(c0133dArr, 0, c0133dArr.length);
                                c0135f.f1521f = c0135f.f1520e.length - 1;
                                c0135f.f1522g = 0;
                                c0135f.f1523h = 0;
                            } else {
                                c0135f.a(i9 - min);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.f1475d.flush();
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f1478l = true;
            this.f1475d.close();
            Unit unit = Unit.f6114a;
        }
    }

    public final void d(boolean z7, int i2, T6.f fVar, int i5) {
        synchronized (this) {
            if (this.f1478l) {
                throw new IOException("closed");
            }
            g(i2, i5, 0, z7 ? 1 : 0);
            if (i5 > 0) {
                T6.g gVar = this.f1475d;
                Intrinsics.b(fVar);
                gVar.x(i5, fVar);
            }
            Unit unit = Unit.f6114a;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f1478l) {
                throw new IOException("closed");
            }
            this.f1475d.flush();
            Unit unit = Unit.f6114a;
        }
    }

    public final void g(int i2, int i5, int i7, int i8) {
        if (i7 != 8) {
            Level level = Level.FINE;
            Logger logger = f1474n;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i2, i5, i7, i8));
            }
        }
        if (i5 > this.f1477i) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1477i + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException(C4.p.g(i2, "reserved bit set: ").toString());
        }
        byte[] bArr = E6.c.f709a;
        T6.g gVar = this.f1475d;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        gVar.writeByte((i5 >>> 16) & 255);
        gVar.writeByte((i5 >>> 8) & 255);
        gVar.writeByte(i5 & 255);
        gVar.writeByte(i7 & 255);
        gVar.writeByte(i8 & 255);
        gVar.writeInt(i2 & Integer.MAX_VALUE);
    }

    public final void h(int i2, EnumC0131b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        synchronized (this) {
            if (this.f1478l) {
                throw new IOException("closed");
            }
            if (errorCode.f1498d == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            g(0, debugData.length + 8, 7, 0);
            this.f1475d.writeInt(i2);
            this.f1475d.writeInt(errorCode.f1498d);
            if (debugData.length != 0) {
                this.f1475d.write(debugData);
            }
            this.f1475d.flush();
            Unit unit = Unit.f6114a;
        }
    }

    public final void j(boolean z7, int i2, ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            if (this.f1478l) {
                throw new IOException("closed");
            }
            this.f1479m.d(headerBlock);
            long j = this.f1476e.f2617e;
            long min = Math.min(this.f1477i, j);
            int i5 = j == min ? 4 : 0;
            if (z7) {
                i5 |= 1;
            }
            g(i2, (int) min, 1, i5);
            this.f1475d.x(min, this.f1476e);
            if (j > min) {
                long j7 = j - min;
                while (j7 > 0) {
                    long min2 = Math.min(this.f1477i, j7);
                    j7 -= min2;
                    g(i2, (int) min2, 9, j7 == 0 ? 4 : 0);
                    this.f1475d.x(min2, this.f1476e);
                }
            }
            Unit unit = Unit.f6114a;
        }
    }

    public final void s(int i2, int i5, boolean z7) {
        synchronized (this) {
            if (this.f1478l) {
                throw new IOException("closed");
            }
            g(0, 8, 6, z7 ? 1 : 0);
            this.f1475d.writeInt(i2);
            this.f1475d.writeInt(i5);
            this.f1475d.flush();
            Unit unit = Unit.f6114a;
        }
    }

    public final void t(int i2, EnumC0131b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.f1478l) {
                throw new IOException("closed");
            }
            if (errorCode.f1498d == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(i2, 4, 3, 0);
            this.f1475d.writeInt(errorCode.f1498d);
            this.f1475d.flush();
            Unit unit = Unit.f6114a;
        }
    }
}
