package e6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class A implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f4024k = Logger.getLogger(h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final n6.g f4025f;

    /* renamed from: g, reason: collision with root package name */
    public final n6.f f4026g;

    /* renamed from: h, reason: collision with root package name */
    public int f4027h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4028i;

    /* renamed from: j, reason: collision with root package name */
    public final f f4029j;

    public A(n6.p sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f4025f = sink;
        n6.f fVar = new n6.f();
        this.f4026g = fVar;
        this.f4027h = 16384;
        this.f4029j = new f(fVar);
    }

    public final void a(D peerSettings) {
        kotlin.jvm.internal.i.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f4028i) {
                    throw new IOException("closed");
                }
                int i7 = this.f4027h;
                int i8 = peerSettings.f4034a;
                if ((i8 & 32) != 0) {
                    i7 = peerSettings.f4035b[5];
                }
                this.f4027h = i7;
                if (((i8 & 2) != 0 ? peerSettings.f4035b[1] : -1) != -1) {
                    f fVar = this.f4029j;
                    int i9 = (i8 & 2) != 0 ? peerSettings.f4035b[1] : -1;
                    fVar.getClass();
                    int min = Math.min(i9, 16384);
                    int i10 = fVar.f4066d;
                    if (i10 != min) {
                        if (min < i10) {
                            fVar.f4064b = Math.min(fVar.f4064b, min);
                        }
                        fVar.f4065c = true;
                        fVar.f4066d = min;
                        int i11 = fVar.f4070h;
                        if (min < i11) {
                            if (min == 0) {
                                C0358d[] c0358dArr = fVar.f4067e;
                                AbstractC0505i.J(0, c0358dArr.length, c0358dArr);
                                fVar.f4068f = fVar.f4067e.length - 1;
                                fVar.f4069g = 0;
                                fVar.f4070h = 0;
                            } else {
                                fVar.a(i11 - min);
                            }
                        }
                    }
                }
                e(0, 0, 4, 1);
                this.f4025f.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f4028i = true;
            this.f4025f.close();
        }
    }

    public final void d(boolean z5, int i7, n6.f fVar, int i8) {
        synchronized (this) {
            if (this.f4028i) {
                throw new IOException("closed");
            }
            e(i7, i8, 0, z5 ? 1 : 0);
            if (i8 > 0) {
                n6.g gVar = this.f4025f;
                kotlin.jvm.internal.i.b(fVar);
                gVar.l(i8, fVar);
            }
        }
    }

    public final void e(int i7, int i8, int i9, int i10) {
        if (i9 != 8) {
            Level level = Level.FINE;
            Logger logger = f4024k;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i7, i8, i9, i10));
            }
        }
        if (i8 > this.f4027h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4027h + ": " + i8).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(W4.o.c("reserved bit set: ", i7).toString());
        }
        byte[] bArr = Y5.c.f3099a;
        n6.g gVar = this.f4025f;
        kotlin.jvm.internal.i.e(gVar, "<this>");
        gVar.writeByte((i8 >>> 16) & 255);
        gVar.writeByte((i8 >>> 8) & 255);
        gVar.writeByte(i8 & 255);
        gVar.writeByte(i9 & 255);
        gVar.writeByte(i10 & 255);
        gVar.writeInt(i7 & Integer.MAX_VALUE);
    }

    public final void flush() {
        synchronized (this) {
            if (this.f4028i) {
                throw new IOException("closed");
            }
            this.f4025f.flush();
        }
    }

    public final void g(int i7, EnumC0356b enumC0356b, byte[] bArr) {
        synchronized (this) {
            if (this.f4028i) {
                throw new IOException("closed");
            }
            if (enumC0356b.f4045f == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            e(0, bArr.length + 8, 7, 0);
            this.f4025f.writeInt(i7);
            this.f4025f.writeInt(enumC0356b.f4045f);
            if (bArr.length != 0) {
                this.f4025f.write(bArr);
            }
            this.f4025f.flush();
        }
    }

    public final void h(boolean z5, int i7, ArrayList arrayList) {
        synchronized (this) {
            if (this.f4028i) {
                throw new IOException("closed");
            }
            this.f4029j.d(arrayList);
            long j4 = this.f4026g.f5524g;
            long min = Math.min(this.f4027h, j4);
            int i8 = j4 == min ? 4 : 0;
            if (z5) {
                i8 |= 1;
            }
            e(i7, (int) min, 1, i8);
            this.f4025f.l(min, this.f4026g);
            if (j4 > min) {
                long j7 = j4 - min;
                while (j7 > 0) {
                    long min2 = Math.min(this.f4027h, j7);
                    j7 -= min2;
                    e(i7, (int) min2, 9, j7 == 0 ? 4 : 0);
                    this.f4025f.l(min2, this.f4026g);
                }
            }
        }
    }

    public final void m(int i7, int i8, boolean z5) {
        synchronized (this) {
            if (this.f4028i) {
                throw new IOException("closed");
            }
            e(0, 8, 6, z5 ? 1 : 0);
            this.f4025f.writeInt(i7);
            this.f4025f.writeInt(i8);
            this.f4025f.flush();
        }
    }

    public final void n(int i7, EnumC0356b enumC0356b) {
        synchronized (this) {
            if (this.f4028i) {
                throw new IOException("closed");
            }
            if (enumC0356b.f4045f == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            e(i7, 4, 3, 0);
            this.f4025f.writeInt(enumC0356b.f4045f);
            this.f4025f.flush();
        }
    }

    public final void v(long j4, int i7) {
        synchronized (this) {
            try {
                if (this.f4028i) {
                    throw new IOException("closed");
                }
                if (j4 == 0 || j4 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
                }
                Logger logger = f4024k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(false, i7, 4, j4));
                }
                e(i7, 4, 8, 0);
                this.f4025f.writeInt((int) j4);
                this.f4025f.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
