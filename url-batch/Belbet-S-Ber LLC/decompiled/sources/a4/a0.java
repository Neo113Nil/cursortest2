package a4;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f138k = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final g4.g f139f;

    /* renamed from: g, reason: collision with root package name */
    public final g4.f f140g;
    public int h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final e f141j;

    public a0(g4.o oVar) {
        i3.d.e(oVar, "sink");
        this.f139f = oVar;
        g4.f fVar = new g4.f();
        this.f140g = fVar;
        this.h = 16384;
        this.f141j = new e(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.i = true;
        this.f139f.close();
    }

    public final synchronized void flush() {
        if (this.i) {
            throw new IOException("closed");
        }
        this.f139f.flush();
    }

    public final synchronized void m(e0 e0Var) {
        try {
            i3.d.e(e0Var, "peerSettings");
            if (this.i) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i4 = e0Var.f167a;
            if ((i4 & 32) != 0) {
                i = ((int[]) e0Var.f168b)[5];
            }
            this.h = i;
            if (((i4 & 2) != 0 ? ((int[]) e0Var.f168b)[1] : -1) != -1) {
                e eVar = this.f141j;
                int i5 = (i4 & 2) != 0 ? ((int[]) e0Var.f168b)[1] : -1;
                eVar.getClass();
                int min = Math.min(i5, 16384);
                int i6 = eVar.d;
                if (i6 != min) {
                    if (min < i6) {
                        eVar.f162b = Math.min(eVar.f162b, min);
                    }
                    eVar.f163c = true;
                    eVar.d = min;
                    int i7 = eVar.h;
                    if (min < i7) {
                        if (min == 0) {
                            c[] cVarArr = eVar.f164e;
                            x2.g.K(cVarArr, 0, cVarArr.length);
                            eVar.f165f = eVar.f164e.length - 1;
                            eVar.f166g = 0;
                            eVar.h = 0;
                        } else {
                            eVar.a(i7 - min);
                        }
                    }
                }
            }
            o(0, 0, 4, 1);
            this.f139f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z4, int i, g4.f fVar, int i4) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(i, i4, 0, z4 ? 1 : 0);
        if (i4 > 0) {
            g4.g gVar = this.f139f;
            i3.d.b(fVar);
            gVar.f(i4, fVar);
        }
    }

    public final void o(int i, int i4, int i5, int i6) {
        Level level = Level.FINE;
        Logger logger = f138k;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i, i4, i5, i6));
        }
        if (i4 > this.h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.h + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(b.f("reserved bit set: ", i).toString());
        }
        byte[] bArr = u3.b.f3581a;
        g4.g gVar = this.f139f;
        i3.d.e(gVar, "<this>");
        gVar.writeByte((i4 >>> 16) & 255);
        gVar.writeByte((i4 >>> 8) & 255);
        gVar.writeByte(i4 & 255);
        gVar.writeByte(i5 & 255);
        gVar.writeByte(i6 & 255);
        gVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i, int i4, byte[] bArr) {
        b.i("errorCode", i4);
        if (this.i) {
            throw new IOException("closed");
        }
        if (t.e.a(i4) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        o(0, bArr.length + 8, 7, 0);
        this.f139f.writeInt(i);
        this.f139f.writeInt(t.e.a(i4));
        if (bArr.length != 0) {
            this.f139f.write(bArr);
        }
        this.f139f.flush();
    }

    public final synchronized void q(boolean z4, int i, ArrayList arrayList) {
        if (this.i) {
            throw new IOException("closed");
        }
        this.f141j.d(arrayList);
        long j2 = this.f140g.f1935g;
        long min = Math.min(this.h, j2);
        int i4 = j2 == min ? 4 : 0;
        if (z4) {
            i4 |= 1;
        }
        o(i, (int) min, 1, i4);
        this.f139f.f(min, this.f140g);
        if (j2 > min) {
            long j4 = j2 - min;
            while (j4 > 0) {
                long min2 = Math.min(this.h, j4);
                j4 -= min2;
                o(i, (int) min2, 9, j4 == 0 ? 4 : 0);
                this.f139f.f(min2, this.f140g);
            }
        }
    }

    public final synchronized void r(int i, int i4, boolean z4) {
        if (this.i) {
            throw new IOException("closed");
        }
        o(0, 8, 6, z4 ? 1 : 0);
        this.f139f.writeInt(i);
        this.f139f.writeInt(i4);
        this.f139f.flush();
    }

    public final synchronized void s(int i, int i4) {
        b.i("errorCode", i4);
        if (this.i) {
            throw new IOException("closed");
        }
        if (t.e.a(i4) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o(i, 4, 3, 0);
        this.f139f.writeInt(t.e.a(i4));
        this.f139f.flush();
    }

    public final synchronized void t(int i, long j2) {
        if (this.i) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        o(i, 4, 8, 0);
        this.f139f.writeInt((int) j2);
        this.f139f.flush();
    }
}
