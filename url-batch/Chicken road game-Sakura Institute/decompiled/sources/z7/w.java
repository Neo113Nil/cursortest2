package z7;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f10245k = Logger.getLogger(f.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final f8.g f10246f;

    /* renamed from: g, reason: collision with root package name */
    public final f8.f f10247g;

    /* renamed from: h, reason: collision with root package name */
    public int f10248h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10249i;

    /* renamed from: j, reason: collision with root package name */
    public final d f10250j;

    public w(f8.y yVar) {
        r6.k.f(yVar, "sink");
        this.f10246f = yVar;
        f8.f fVar = new f8.f();
        this.f10247g = fVar;
        this.f10248h = 16384;
        this.f10250j = new d(fVar);
    }

    public final synchronized void b(z zVar) {
        try {
            r6.k.f(zVar, "peerSettings");
            if (this.f10249i) {
                throw new IOException("closed");
            }
            int i7 = this.f10248h;
            int i8 = zVar.f10255a;
            if ((i8 & 32) != 0) {
                i7 = zVar.f10256b[5];
            }
            this.f10248h = i7;
            if (((i8 & 2) != 0 ? zVar.f10256b[1] : -1) != -1) {
                d dVar = this.f10250j;
                int i9 = (i8 & 2) != 0 ? zVar.f10256b[1] : -1;
                dVar.getClass();
                int min = Math.min(i9, 16384);
                int i10 = dVar.f10152d;
                if (i10 != min) {
                    if (min < i10) {
                        dVar.f10150b = Math.min(dVar.f10150b, min);
                    }
                    dVar.f10151c = true;
                    dVar.f10152d = min;
                    int i11 = dVar.f10156h;
                    if (min < i11) {
                        if (min == 0) {
                            b[] bVarArr = dVar.f10153e;
                            e6.k.c0(0, bVarArr.length, null, bVarArr);
                            dVar.f10154f = dVar.f10153e.length - 1;
                            dVar.f10155g = 0;
                            dVar.f10156h = 0;
                        } else {
                            dVar.a(i11 - min);
                        }
                    }
                }
            }
            k(0, 0, 4, 1);
            this.f10246f.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z8, int i7, f8.f fVar, int i8) {
        if (this.f10249i) {
            throw new IOException("closed");
        }
        k(i7, i8, 0, z8 ? 1 : 0);
        if (i8 > 0) {
            f8.g gVar = this.f10246f;
            r6.k.c(fVar);
            gVar.f(i8, fVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f10249i = true;
        this.f10246f.close();
    }

    public final synchronized void flush() {
        if (this.f10249i) {
            throw new IOException("closed");
        }
        this.f10246f.flush();
    }

    public final void k(int i7, int i8, int i9, int i10) {
        Level level = Level.FINE;
        Logger logger = f10245k;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i7, i8, i9, i10));
        }
        if (i8 > this.f10248h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f10248h + ": " + i8).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(a0.m.i("reserved bit set: ", i7).toString());
        }
        byte[] bArr = t7.b.f8932a;
        f8.g gVar = this.f10246f;
        r6.k.f(gVar, "<this>");
        gVar.writeByte((i8 >>> 16) & 255);
        gVar.writeByte((i8 >>> 8) & 255);
        gVar.writeByte(i8 & 255);
        gVar.writeByte(i9 & 255);
        gVar.writeByte(i10 & 255);
        gVar.writeInt(i7 & Integer.MAX_VALUE);
    }

    public final synchronized void n(byte[] bArr, int i7, int i8) {
        r6.i.f("errorCode", i8);
        if (this.f10249i) {
            throw new IOException("closed");
        }
        if (l.h.d(i8) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        k(0, bArr.length + 8, 7, 0);
        this.f10246f.writeInt(i7);
        this.f10246f.writeInt(l.h.d(i8));
        if (bArr.length != 0) {
            this.f10246f.write(bArr);
        }
        this.f10246f.flush();
    }

    public final synchronized void t(boolean z8, int i7, ArrayList arrayList) {
        if (this.f10249i) {
            throw new IOException("closed");
        }
        this.f10250j.d(arrayList);
        long j8 = this.f10247g.f3598g;
        long min = Math.min(this.f10248h, j8);
        int i8 = j8 == min ? 4 : 0;
        if (z8) {
            i8 |= 1;
        }
        k(i7, (int) min, 1, i8);
        this.f10246f.f(min, this.f10247g);
        if (j8 > min) {
            long j9 = j8 - min;
            while (j9 > 0) {
                long min2 = Math.min(this.f10248h, j9);
                j9 -= min2;
                k(i7, (int) min2, 9, j9 == 0 ? 4 : 0);
                this.f10246f.f(min2, this.f10247g);
            }
        }
    }

    public final synchronized void u(int i7, int i8, boolean z8) {
        if (this.f10249i) {
            throw new IOException("closed");
        }
        k(0, 8, 6, z8 ? 1 : 0);
        this.f10246f.writeInt(i7);
        this.f10246f.writeInt(i8);
        this.f10246f.flush();
    }

    public final synchronized void w(int i7, int i8) {
        r6.i.f("errorCode", i8);
        if (this.f10249i) {
            throw new IOException("closed");
        }
        if (l.h.d(i8) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        k(i7, 4, 3, 0);
        this.f10246f.writeInt(l.h.d(i8));
        this.f10246f.flush();
    }

    public final synchronized void z(long j8, int i7) {
        if (this.f10249i) {
            throw new IOException("closed");
        }
        if (j8 == 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j8).toString());
        }
        k(i7, 4, 8, 0);
        this.f10246f.writeInt((int) j8);
        this.f10246f.flush();
    }
}
