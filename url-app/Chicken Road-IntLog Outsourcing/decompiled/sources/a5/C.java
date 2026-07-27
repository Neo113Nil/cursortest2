package a5;

import b2.AbstractC0279e;
import g4.AbstractC0464i;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class C implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f3903f = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final j5.p f3904a;

    /* renamed from: b, reason: collision with root package name */
    public final j5.f f3905b;

    /* renamed from: c, reason: collision with root package name */
    public int f3906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3907d;

    /* renamed from: e, reason: collision with root package name */
    public final C0204f f3908e;

    public C(j5.p sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f3904a = sink;
        j5.f fVar = new j5.f();
        this.f3905b = fVar;
        this.f3906c = 16384;
        this.f3908e = new C0204f(fVar);
    }

    public final void a(F peerSettings) {
        kotlin.jvm.internal.i.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f3907d) {
                    throw new IOException("closed");
                }
                int i2 = this.f3906c;
                int i3 = peerSettings.f3913a;
                if ((i3 & 32) != 0) {
                    i2 = peerSettings.f3914b[5];
                }
                this.f3906c = i2;
                if (((i3 & 2) != 0 ? peerSettings.f3914b[1] : -1) != -1) {
                    C0204f c0204f = this.f3908e;
                    int i6 = (i3 & 2) != 0 ? peerSettings.f3914b[1] : -1;
                    c0204f.getClass();
                    int min = Math.min(i6, 16384);
                    int i7 = c0204f.f3946e;
                    if (i7 != min) {
                        if (min < i7) {
                            c0204f.f3944c = Math.min(c0204f.f3944c, min);
                        }
                        c0204f.f3945d = true;
                        c0204f.f3946e = min;
                        int i8 = c0204f.f3950i;
                        if (min < i8) {
                            if (min == 0) {
                                C0202d[] c0202dArr = c0204f.f3947f;
                                AbstractC0464i.S(0, c0202dArr.length, c0202dArr);
                                c0204f.f3948g = c0204f.f3947f.length - 1;
                                c0204f.f3949h = 0;
                                c0204f.f3950i = 0;
                            } else {
                                c0204f.a(i8 - min);
                            }
                        }
                    }
                }
                c(0, 0, 4, 1);
                this.f3904a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z, int i2, j5.f fVar, int i3) {
        synchronized (this) {
            if (this.f3907d) {
                throw new IOException("closed");
            }
            c(i2, i3, 0, z ? 1 : 0);
            if (i3 > 0) {
                kotlin.jvm.internal.i.b(fVar);
                this.f3904a.B(fVar, i3);
            }
        }
    }

    public final void c(int i2, int i3, int i6, int i7) {
        if (i6 != 8) {
            Level level = Level.FINE;
            Logger logger = f3903f;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i2, i3, i6, i7));
            }
        }
        if (i3 > this.f3906c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f3906c + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "reserved bit set: ").toString());
        }
        byte[] bArr = U4.c.f3176a;
        j5.p pVar = this.f3904a;
        kotlin.jvm.internal.i.e(pVar, "<this>");
        pVar.n((i3 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.n((i3 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.n(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.n(i6 & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.n(i7 & KotlinVersion.MAX_COMPONENT_VALUE);
        pVar.b(i2 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f3907d = true;
            this.f3904a.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f3907d) {
                throw new IOException("closed");
            }
            this.f3904a.flush();
        }
    }

    public final void g(int i2, EnumC0200b enumC0200b, byte[] bArr) {
        synchronized (this) {
            if (this.f3907d) {
                throw new IOException("closed");
            }
            if (enumC0200b.f3924a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            c(0, bArr.length + 8, 7, 0);
            this.f3904a.b(i2);
            this.f3904a.b(enumC0200b.f3924a);
            if (bArr.length != 0) {
                j5.p pVar = this.f3904a;
                if (pVar.f10517c) {
                    throw new IllegalStateException("closed");
                }
                pVar.f10516b.H(bArr, 0, bArr.length);
                pVar.a();
            }
            this.f3904a.flush();
        }
    }

    public final void o(boolean z, int i2, ArrayList arrayList) {
        synchronized (this) {
            if (this.f3907d) {
                throw new IOException("closed");
            }
            this.f3908e.d(arrayList);
            long j2 = this.f3905b.f10495b;
            long min = Math.min(this.f3906c, j2);
            int i3 = j2 == min ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            c(i2, (int) min, 1, i3);
            this.f3904a.B(this.f3905b, min);
            if (j2 > min) {
                long j6 = j2 - min;
                while (j6 > 0) {
                    long min2 = Math.min(this.f3906c, j6);
                    j6 -= min2;
                    c(i2, (int) min2, 9, j6 == 0 ? 4 : 0);
                    this.f3904a.B(this.f3905b, min2);
                }
            }
        }
    }

    public final void p(int i2, int i3, boolean z) {
        synchronized (this) {
            if (this.f3907d) {
                throw new IOException("closed");
            }
            c(0, 8, 6, z ? 1 : 0);
            this.f3904a.b(i2);
            this.f3904a.b(i3);
            this.f3904a.flush();
        }
    }

    public final void q(int i2, EnumC0200b enumC0200b) {
        synchronized (this) {
            if (this.f3907d) {
                throw new IOException("closed");
            }
            if (enumC0200b.f3924a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c(i2, 4, 3, 0);
            this.f3904a.b(enumC0200b.f3924a);
            this.f3904a.flush();
        }
    }

    public final void y(int i2, long j2) {
        synchronized (this) {
            try {
                if (this.f3907d) {
                    throw new IOException("closed");
                }
                if (j2 == 0 || j2 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
                }
                Logger logger = f3903f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(j2, i2, 4, false));
                }
                c(i2, 4, 8, 0);
                this.f3904a.b((int) j2);
                this.f3904a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
