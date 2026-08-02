package N3;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1944f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final T3.h f1945a;

    /* renamed from: b, reason: collision with root package name */
    public final T3.g f1946b;

    /* renamed from: c, reason: collision with root package name */
    public int f1947c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1948d;

    /* renamed from: e, reason: collision with root package name */
    public final C0081e f1949e;

    public z(T3.o sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1945a = sink;
        T3.g gVar = new T3.g();
        this.f1946b = gVar;
        this.f1947c = 16384;
        this.f1949e = new C0081e(gVar);
    }

    public final synchronized void a(D peerSettings) {
        try {
            kotlin.jvm.internal.i.e(peerSettings, "peerSettings");
            if (this.f1948d) {
                throw new IOException("closed");
            }
            int i4 = this.f1947c;
            int i5 = peerSettings.f1817a;
            if ((i5 & 32) != 0) {
                i4 = peerSettings.f1818b[5];
            }
            this.f1947c = i4;
            if (((i5 & 2) != 0 ? peerSettings.f1818b[1] : -1) != -1) {
                C0081e c0081e = this.f1949e;
                int i6 = (i5 & 2) != 0 ? peerSettings.f1818b[1] : -1;
                c0081e.getClass();
                int min = Math.min(i6, 16384);
                int i7 = c0081e.f1847d;
                if (i7 != min) {
                    if (min < i7) {
                        c0081e.f1845b = Math.min(c0081e.f1845b, min);
                    }
                    c0081e.f1846c = true;
                    c0081e.f1847d = min;
                    int i8 = c0081e.f1851h;
                    if (min < i8) {
                        if (min == 0) {
                            C0079c[] c0079cArr = c0081e.f1848e;
                            d3.g.S(c0079cArr, 0, c0079cArr.length);
                            c0081e.f1849f = c0081e.f1848e.length - 1;
                            c0081e.f1850g = 0;
                            c0081e.f1851h = 0;
                        } else {
                            c0081e.a(i8 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f1945a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z, int i4, T3.g gVar, int i5) {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        e(i4, i5, 0, z ? 1 : 0);
        if (i5 > 0) {
            T3.h hVar = this.f1945a;
            kotlin.jvm.internal.i.b(gVar);
            hVar.o(gVar, i5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1948d = true;
        this.f1945a.close();
    }

    public final void e(int i4, int i5, int i6, int i7) {
        Level level = Level.FINE;
        Logger logger = f1944f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i4, i5, i6, i7));
        }
        if (i5 > this.f1947c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1947c + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i4) != 0) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(Integer.valueOf(i4), "reserved bit set: ").toString());
        }
        byte[] bArr = H3.b.f1103a;
        T3.h hVar = this.f1945a;
        kotlin.jvm.internal.i.e(hVar, "<this>");
        hVar.writeByte((i5 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte(i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte(i6 & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte(i7 & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeInt(i4 & Integer.MAX_VALUE);
    }

    public final synchronized void f(int i4, EnumC0078b enumC0078b, byte[] bArr) {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        if (enumC0078b.f1827a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        e(0, bArr.length + 8, 7, 0);
        this.f1945a.writeInt(i4);
        this.f1945a.writeInt(enumC0078b.f1827a);
        if (bArr.length != 0) {
            this.f1945a.write(bArr);
        }
        this.f1945a.flush();
    }

    public final synchronized void flush() {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        this.f1945a.flush();
    }

    public final synchronized void k(boolean z, int i4, ArrayList arrayList) {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        this.f1949e.d(arrayList);
        long j4 = this.f1946b.f2975b;
        long min = Math.min(this.f1947c, j4);
        int i5 = j4 == min ? 4 : 0;
        if (z) {
            i5 |= 1;
        }
        e(i4, (int) min, 1, i5);
        this.f1945a.o(this.f1946b, min);
        if (j4 > min) {
            long j5 = j4 - min;
            while (j5 > 0) {
                long min2 = Math.min(this.f1947c, j5);
                j5 -= min2;
                e(i4, (int) min2, 9, j5 == 0 ? 4 : 0);
                this.f1945a.o(this.f1946b, min2);
            }
        }
    }

    public final synchronized void n(int i4, boolean z, int i5) {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        this.f1945a.writeInt(i4);
        this.f1945a.writeInt(i5);
        this.f1945a.flush();
    }

    public final synchronized void s(int i4, EnumC0078b enumC0078b) {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        if (enumC0078b.f1827a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e(i4, 4, 3, 0);
        this.f1945a.writeInt(enumC0078b.f1827a);
        this.f1945a.flush();
    }

    public final synchronized void t(int i4, long j4) {
        if (this.f1948d) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(Long.valueOf(j4), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        e(i4, 4, 8, 0);
        this.f1945a.writeInt((int) j4);
        this.f1945a.flush();
    }
}
