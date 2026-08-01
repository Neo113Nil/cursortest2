package j3;

import androidx.fragment.app.w0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f2490k = Logger.getLogger(f.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final p3.g f2491f;
    public final p3.f g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2492i;

    /* renamed from: j, reason: collision with root package name */
    public final d f2493j;

    public y(p3.o oVar) {
        u2.c.e(oVar, "sink");
        this.f2491f = oVar;
        p3.f fVar = new p3.f();
        this.g = fVar;
        this.h = 16384;
        this.f2493j = new d(fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f2492i = true;
        this.f2491f.close();
    }

    public final synchronized void flush() {
        if (this.f2492i) {
            throw new IOException("closed");
        }
        this.f2491f.flush();
    }

    public final synchronized void m(f.f fVar) {
        try {
            u2.c.e(fVar, "peerSettings");
            if (this.f2492i) {
                throw new IOException("closed");
            }
            int i4 = this.h;
            int i5 = fVar.f1596f;
            if ((i5 & 32) != 0) {
                i4 = ((int[]) fVar.g)[5];
            }
            this.h = i4;
            if (((i5 & 2) != 0 ? ((int[]) fVar.g)[1] : -1) != -1) {
                d dVar = this.f2493j;
                int i6 = (i5 & 2) != 0 ? ((int[]) fVar.g)[1] : -1;
                dVar.getClass();
                int min = Math.min(i6, 16384);
                int i7 = dVar.f2417d;
                if (i7 != min) {
                    if (min < i7) {
                        dVar.f2416b = Math.min(dVar.f2416b, min);
                    }
                    dVar.c = true;
                    dVar.f2417d = min;
                    int i8 = dVar.h;
                    if (min < i8) {
                        if (min == 0) {
                            b[] bVarArr = dVar.f2418e;
                            n2.f.F(bVarArr, 0, bVarArr.length);
                            dVar.f2419f = dVar.f2418e.length - 1;
                            dVar.g = 0;
                            dVar.h = 0;
                        } else {
                            dVar.a(i8 - min);
                        }
                    }
                }
            }
            o(0, 0, 4, 1);
            this.f2491f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z3, int i4, p3.f fVar, int i5) {
        if (this.f2492i) {
            throw new IOException("closed");
        }
        o(i4, i5, 0, z3 ? 1 : 0);
        if (i5 > 0) {
            p3.g gVar = this.f2491f;
            u2.c.b(fVar);
            gVar.e(i5, fVar);
        }
    }

    public final void o(int i4, int i5, int i6, int i7) {
        Level level = Level.FINE;
        Logger logger = f2490k;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i4, i5, i6, i7));
        }
        if (i5 > this.h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.h + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i4) != 0) {
            throw new IllegalArgumentException(w0.e("reserved bit set: ", i4).toString());
        }
        byte[] bArr = d3.c.f1490a;
        p3.g gVar = this.f2491f;
        u2.c.e(gVar, "<this>");
        gVar.writeByte((i5 >>> 16) & 255);
        gVar.writeByte((i5 >>> 8) & 255);
        gVar.writeByte(i5 & 255);
        gVar.writeByte(i6 & 255);
        gVar.writeByte(i7 & 255);
        gVar.writeInt(i4 & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i4, int i5, byte[] bArr) {
        w0.h("errorCode", i5);
        if (this.f2492i) {
            throw new IOException("closed");
        }
        if (q.e.a(i5) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        o(0, bArr.length + 8, 7, 0);
        this.f2491f.writeInt(i4);
        this.f2491f.writeInt(q.e.a(i5));
        if (bArr.length != 0) {
            this.f2491f.write(bArr);
        }
        this.f2491f.flush();
    }

    public final synchronized void q(boolean z3, int i4, ArrayList arrayList) {
        if (this.f2492i) {
            throw new IOException("closed");
        }
        this.f2493j.d(arrayList);
        long j4 = this.g.g;
        long min = Math.min(this.h, j4);
        int i5 = j4 == min ? 4 : 0;
        if (z3) {
            i5 |= 1;
        }
        o(i4, (int) min, 1, i5);
        this.f2491f.e(min, this.g);
        if (j4 > min) {
            long j5 = j4 - min;
            while (j5 > 0) {
                long min2 = Math.min(this.h, j5);
                j5 -= min2;
                o(i4, (int) min2, 9, j5 == 0 ? 4 : 0);
                this.f2491f.e(min2, this.g);
            }
        }
    }

    public final synchronized void r(int i4, int i5, boolean z3) {
        if (this.f2492i) {
            throw new IOException("closed");
        }
        o(0, 8, 6, z3 ? 1 : 0);
        this.f2491f.writeInt(i4);
        this.f2491f.writeInt(i5);
        this.f2491f.flush();
    }

    public final synchronized void s(int i4, int i5) {
        w0.h("errorCode", i5);
        if (this.f2492i) {
            throw new IOException("closed");
        }
        if (q.e.a(i5) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o(i4, 4, 3, 0);
        this.f2491f.writeInt(q.e.a(i5));
        this.f2491f.flush();
    }

    public final synchronized void t(int i4, long j4) {
        if (this.f2492i) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        o(i4, 4, 8, 0);
        this.f2491f.writeInt((int) j4);
        this.f2491f.flush();
    }
}
