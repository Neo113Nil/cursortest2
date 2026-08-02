package N3;

import E.AbstractC0005f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import t3.C1441a;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f1916d;

    /* renamed from: a, reason: collision with root package name */
    public final T3.i f1917a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1918b;

    /* renamed from: c, reason: collision with root package name */
    public final C0080d f1919c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(Http2::class.java.name)");
        f1916d = logger;
    }

    public u(T3.p source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1917a = source;
        t tVar = new t(source);
        this.f1918b = tVar;
        this.f1919c = new C0080d(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0246, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(r4), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z, l lVar) {
        EnumC0078b enumC0078b;
        EnumC0078b enumC0078b2;
        Object[] array;
        try {
            this.f1917a.p(9L);
            int q4 = H3.b.q(this.f1917a);
            if (q4 > 16384) {
                throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(q4), "FRAME_SIZE_ERROR: "));
            }
            int readByte = this.f1917a.readByte() & 255;
            byte readByte2 = this.f1917a.readByte();
            int i4 = readByte2 & 255;
            int readInt = this.f1917a.readInt();
            int i5 = readInt & Integer.MAX_VALUE;
            Logger logger = f1916d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i5, q4, readByte, i4));
            }
            if (z && readByte != 4) {
                String[] strArr = g.f1855b;
                throw new IOException(kotlin.jvm.internal.i.h(readByte < strArr.length ? strArr[readByte] : H3.b.g("0x%02x", Integer.valueOf(readByte)), "Expected a SETTINGS frame but was "));
            }
            int i6 = 2;
            switch (readByte) {
                case 0:
                    b(lVar, q4, i4, i5);
                    return true;
                case 1:
                    f(lVar, q4, i4, i5);
                    return true;
                case 2:
                    if (q4 != 5) {
                        throw new IOException(AbstractC0005f.k(q4, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    T3.i iVar = this.f1917a;
                    iVar.readInt();
                    iVar.readByte();
                    return true;
                case 3:
                    if (q4 != 4) {
                        throw new IOException(AbstractC0005f.k(q4, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.f1917a.readInt();
                    EnumC0078b[] values = EnumC0078b.values();
                    int length = values.length;
                    while (true) {
                        if (r2 < length) {
                            EnumC0078b enumC0078b3 = values[r2];
                            if (enumC0078b3.f1827a == readInt2) {
                                enumC0078b = enumC0078b3;
                            } else {
                                r2++;
                            }
                        } else {
                            enumC0078b = null;
                        }
                    }
                    if (enumC0078b == null) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(readInt2), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    q qVar = lVar.f1866b;
                    if (i5 == 0 || (readInt & 1) != 0) {
                        y f4 = qVar.f(i5);
                        if (f4 == null) {
                            return true;
                        }
                        f4.k(enumC0078b);
                        return true;
                    }
                    qVar.f1888i.c(new n(qVar.f1882c + '[' + i5 + "] onReset", qVar, i5, enumC0078b, 2), 0L);
                    return true;
                case 4:
                    T3.i iVar2 = this.f1917a;
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q4 % 6 != 0) {
                            throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(q4), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        D d4 = new D();
                        C1441a E4 = O3.d.E(O3.d.H(0, q4), 6);
                        int i7 = E4.f15424a;
                        int i8 = E4.f15425b;
                        int i9 = E4.f15426c;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                int i10 = i7 + i9;
                                short readShort = iVar2.readShort();
                                byte[] bArr = H3.b.f1103a;
                                int i11 = readShort & 65535;
                                int readInt3 = iVar2.readInt();
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        i11 = 4;
                                    } else if (i11 != 4) {
                                        if (i11 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                        }
                                    } else {
                                        if (readInt3 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i11 = 7;
                                    }
                                } else if (readInt3 != 0 && readInt3 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                d4.c(i11, readInt3);
                                if (i7 != i8) {
                                    i7 = i10;
                                }
                            }
                        }
                        q qVar2 = lVar.f1866b;
                        qVar2.f1887h.c(new j(kotlin.jvm.internal.i.h(" applyAndAckSettings", qVar2.f1882c), lVar, d4, i6), 0L);
                        return true;
                    }
                    if (q4 != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    k(lVar, q4, i4, i5);
                    return true;
                case 6:
                    if (q4 != 8) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(q4), "TYPE_PING length != 8: "));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int readInt4 = this.f1917a.readInt();
                    int readInt5 = this.f1917a.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        q qVar3 = lVar.f1866b;
                        qVar3.f1887h.c(new k(kotlin.jvm.internal.i.h(" ping", qVar3.f1882c), lVar.f1866b, readInt4, readInt5), 0L);
                        return true;
                    }
                    q qVar4 = lVar.f1866b;
                    synchronized (qVar4) {
                        try {
                            if (readInt4 == 1) {
                                qVar4.f1891l++;
                            } else if (readInt4 == 2) {
                                qVar4.n++;
                            } else if (readInt4 == 3) {
                                qVar4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q4 < 8) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(q4), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.f1917a.readInt();
                    int readInt7 = this.f1917a.readInt();
                    int i12 = q4 - 8;
                    EnumC0078b[] values2 = EnumC0078b.values();
                    int length2 = values2.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            EnumC0078b enumC0078b4 = values2[i13];
                            if (enumC0078b4.f1827a == readInt7) {
                                enumC0078b2 = enumC0078b4;
                            } else {
                                i13++;
                            }
                        } else {
                            enumC0078b2 = null;
                        }
                    }
                    if (enumC0078b2 == null) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(readInt7), "TYPE_GOAWAY unexpected error code: "));
                    }
                    T3.j debugData = T3.j.f2976d;
                    if (i12 > 0) {
                        debugData = this.f1917a.c(i12);
                    }
                    kotlin.jvm.internal.i.e(debugData, "debugData");
                    debugData.a();
                    q qVar5 = lVar.f1866b;
                    synchronized (qVar5) {
                        array = qVar5.f1881b.values().toArray(new y[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        qVar5.f1885f = true;
                    }
                    y[] yVarArr = (y[]) array;
                    int length3 = yVarArr.length;
                    while (r2 < length3) {
                        y yVar = yVarArr[r2];
                        r2++;
                        if (yVar.f1931a > readInt6 && yVar.h()) {
                            yVar.k(EnumC0078b.REFUSED_STREAM);
                            lVar.f1866b.f(yVar.f1931a);
                        }
                    }
                    break;
                    break;
                case 8:
                    if (q4 != 4) {
                        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(q4), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long readInt8 = this.f1917a.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        q qVar6 = lVar.f1866b;
                        synchronized (qVar6) {
                            qVar6.f1898u += readInt8;
                            qVar6.notifyAll();
                        }
                        return true;
                    }
                    y e4 = lVar.f1866b.e(i5);
                    if (e4 != null) {
                        synchronized (e4) {
                            e4.f1936f += readInt8;
                            if (readInt8 > 0) {
                                e4.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.f1917a.skip(q4);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(l lVar, int i4, int i5, int i6) {
        int i7;
        boolean z;
        long j4;
        boolean z4;
        long j5;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f1917a.readByte();
            byte[] bArr = H3.b.f1103a;
            i7 = readByte & 255;
        } else {
            i7 = 0;
        }
        int a3 = s.a(i4, i5, i7);
        T3.i source = this.f1917a;
        kotlin.jvm.internal.i.e(source, "source");
        q qVar = lVar.f1866b;
        long j6 = 0;
        if (i6 == 0 || (i6 & 1) != 0) {
            y e4 = qVar.e(i6);
            if (e4 == null) {
                lVar.f1866b.t(i6, EnumC0078b.PROTOCOL_ERROR);
                long j7 = a3;
                lVar.f1866b.n(j7);
                source.skip(j7);
            } else {
                byte[] bArr2 = H3.b.f1103a;
                w wVar = e4.f1939i;
                long j8 = a3;
                wVar.getClass();
                while (true) {
                    if (j8 <= j6) {
                        break;
                    }
                    synchronized (wVar.f1929f) {
                        z = wVar.f1925b;
                        j4 = j6;
                        z4 = wVar.f1927d.f2975b + j8 > wVar.f1924a;
                    }
                    if (z4) {
                        source.skip(j8);
                        wVar.f1929f.e(EnumC0078b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        source.skip(j8);
                        break;
                    }
                    long j9 = source.j(wVar.f1926c, j8);
                    if (j9 == -1) {
                        throw new EOFException();
                    }
                    j8 -= j9;
                    y yVar = wVar.f1929f;
                    synchronized (yVar) {
                        try {
                            if (wVar.f1928e) {
                                T3.g gVar = wVar.f1926c;
                                j5 = gVar.f2975b;
                                gVar.skip(j5);
                            } else {
                                T3.g gVar2 = wVar.f1927d;
                                boolean z6 = gVar2.f2975b == j4;
                                gVar2.w(wVar.f1926c);
                                if (z6) {
                                    yVar.notifyAll();
                                }
                                j5 = j4;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j5 > j4) {
                        wVar.a(j5);
                    }
                    j6 = j4;
                }
                if (z5) {
                    e4.j(H3.b.f1104b, true);
                }
            }
        } else {
            T3.g gVar3 = new T3.g();
            long j10 = a3;
            source.p(j10);
            source.j(gVar3, j10);
            qVar.f1888i.c(new m(qVar.f1882c + '[' + i6 + "] onData", qVar, i6, gVar3, a3, z5), 0L);
        }
        this.f1917a.skip(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1917a.close();
    }

    public final List e(int i4, int i5, int i6, int i7) {
        t tVar = this.f1918b;
        tVar.f1914e = i4;
        tVar.f1911b = i4;
        tVar.f1915f = i5;
        tVar.f1912c = i6;
        tVar.f1913d = i7;
        C0080d c0080d = this.f1919c;
        T3.p pVar = c0080d.f1839c;
        ArrayList arrayList = c0080d.f1838b;
        while (!pVar.a()) {
            byte readByte = pVar.readByte();
            byte[] bArr = H3.b.f1103a;
            int i8 = readByte & 255;
            if (i8 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e4 = c0080d.e(i8, 127);
                int i9 = e4 - 1;
                if (i9 >= 0) {
                    C0079c[] c0079cArr = f.f1852a;
                    if (i9 <= c0079cArr.length - 1) {
                        arrayList.add(c0079cArr[i9]);
                    }
                }
                int length = c0080d.f1841e + 1 + (i9 - f.f1852a.length);
                if (length >= 0) {
                    C0079c[] c0079cArr2 = c0080d.f1840d;
                    if (length < c0079cArr2.length) {
                        C0079c c0079c = c0079cArr2[length];
                        kotlin.jvm.internal.i.b(c0079c);
                        arrayList.add(c0079c);
                    }
                }
                throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(e4), "Header index too large "));
            }
            if (i8 == 64) {
                C0079c[] c0079cArr3 = f.f1852a;
                T3.j d4 = c0080d.d();
                f.a(d4);
                c0080d.c(new C0079c(d4, c0080d.d()));
            } else if ((readByte & 64) == 64) {
                c0080d.c(new C0079c(c0080d.b(c0080d.e(i8, 63) - 1), c0080d.d()));
            } else if ((readByte & 32) == 32) {
                int e5 = c0080d.e(i8, 31);
                c0080d.f1837a = e5;
                if (e5 < 0 || e5 > 4096) {
                    throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(c0080d.f1837a), "Invalid dynamic table size update "));
                }
                int i10 = c0080d.f1843g;
                if (e5 < i10) {
                    if (e5 == 0) {
                        C0079c[] c0079cArr4 = c0080d.f1840d;
                        d3.g.S(c0079cArr4, 0, c0079cArr4.length);
                        c0080d.f1841e = c0080d.f1840d.length - 1;
                        c0080d.f1842f = 0;
                        c0080d.f1843g = 0;
                    } else {
                        c0080d.a(i10 - e5);
                    }
                }
            } else if (i8 == 16 || i8 == 0) {
                C0079c[] c0079cArr5 = f.f1852a;
                T3.j d5 = c0080d.d();
                f.a(d5);
                arrayList.add(new C0079c(d5, c0080d.d()));
            } else {
                arrayList.add(new C0079c(c0080d.b(c0080d.e(i8, 15) - 1), c0080d.d()));
            }
        }
        List n02 = d3.i.n0(arrayList);
        arrayList.clear();
        return n02;
    }

    public final void f(l lVar, int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i7 = 0;
        int i8 = 1;
        boolean z = (i5 & 1) != 0;
        if ((i5 & 8) != 0) {
            byte readByte = this.f1917a.readByte();
            byte[] bArr = H3.b.f1103a;
            i7 = readByte & 255;
        }
        if ((i5 & 32) != 0) {
            T3.i iVar = this.f1917a;
            iVar.readInt();
            iVar.readByte();
            byte[] bArr2 = H3.b.f1103a;
            i4 -= 5;
        }
        List e4 = e(s.a(i4, i5, i7), i7, i5, i6);
        q qVar = lVar.f1866b;
        if (i6 != 0 && (i6 & 1) == 0) {
            qVar.f1888i.c(new n(qVar.f1882c + '[' + i6 + "] onHeaders", qVar, i6, e4, z), 0L);
            return;
        }
        synchronized (qVar) {
            y e5 = qVar.e(i6);
            if (e5 != null) {
                e5.j(H3.b.s(e4), z);
                return;
            }
            if (qVar.f1885f) {
                return;
            }
            if (i6 <= qVar.f1883d) {
                return;
            }
            if (i6 % 2 == qVar.f1884e % 2) {
                return;
            }
            y yVar = new y(i6, qVar, false, z, H3.b.s(e4));
            qVar.f1883d = i6;
            qVar.f1881b.put(Integer.valueOf(i6), yVar);
            qVar.f1886g.e().c(new j(qVar.f1882c + '[' + i6 + "] onStream", qVar, yVar, i8), 0L);
        }
    }

    public final void k(l lVar, int i4, int i5, int i6) {
        int i7;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f1917a.readByte();
            byte[] bArr = H3.b.f1103a;
            i7 = readByte & 255;
        } else {
            i7 = 0;
        }
        int readInt = this.f1917a.readInt() & Integer.MAX_VALUE;
        List e4 = e(s.a(i4 - 4, i5, i7), i7, i5, i6);
        q qVar = lVar.f1866b;
        synchronized (qVar) {
            if (qVar.f1901y.contains(Integer.valueOf(readInt))) {
                qVar.t(readInt, EnumC0078b.PROTOCOL_ERROR);
                return;
            }
            qVar.f1901y.add(Integer.valueOf(readInt));
            qVar.f1888i.c(new n(qVar.f1882c + '[' + readInt + "] onRequest", qVar, readInt, e4, 1), 0L);
        }
    }
}
