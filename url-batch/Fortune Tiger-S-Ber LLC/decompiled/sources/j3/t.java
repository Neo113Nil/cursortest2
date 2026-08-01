package j3;

import androidx.fragment.app.w0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f2470i;

    /* renamed from: f, reason: collision with root package name */
    public final p3.h f2471f;
    public final s g;
    public final c h;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        u2.c.d(logger, "getLogger(Http2::class.java.name)");
        f2470i = logger;
    }

    public t(p3.p pVar) {
        u2.c.e(pVar, "source");
        this.f2471f = pVar;
        s sVar = new s(pVar);
        this.g = sVar;
        this.h = new c(sVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2471f.close();
    }

    public final boolean m(boolean z3, l lVar) {
        int i4;
        int readInt;
        int i5;
        Object[] array;
        try {
            this.f2471f.i(9L);
            int q4 = d3.c.q(this.f2471f);
            if (q4 > 16384) {
                throw new IOException(w0.e("FRAME_SIZE_ERROR: ", q4));
            }
            int readByte = this.f2471f.readByte() & 255;
            byte readByte2 = this.f2471f.readByte();
            int i6 = readByte2 & 255;
            int readInt2 = this.f2471f.readInt();
            int i7 = readInt2 & Integer.MAX_VALUE;
            Logger logger = f2470i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i7, q4, readByte, i6));
            }
            if (z3 && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f2423b;
                sb.append(readByte < strArr.length ? strArr[readByte] : d3.c.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i8 = 3;
            int i9 = 2;
            switch (readByte) {
                case 0:
                    n(lVar, q4, i6, i7);
                    return true;
                case 1:
                    p(lVar, q4, i6, i7);
                    return true;
                case 2:
                    if (q4 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q4 + " != 5");
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    p3.h hVar = this.f2471f;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (q4 != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q4 + " != 4");
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt3 = this.f2471f.readInt();
                    int[] b2 = q.e.b(14);
                    int length = b2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            int i11 = b2[i10];
                            if (q.e.a(i11) == readInt3) {
                                i4 = i11;
                            } else {
                                i10++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        throw new IOException(w0.e("TYPE_RST_STREAM unexpected error code: ", readInt3));
                    }
                    p pVar = lVar.g;
                    if (i7 != 0 && (readInt2 & 1) == 0) {
                        r2 = 1;
                    }
                    if (r2 == 0) {
                        x o4 = pVar.o(i7);
                        if (o4 == null) {
                            return true;
                        }
                        o4.i(i4);
                        return true;
                    }
                    pVar.f2448n.c(new k(pVar.h + '[' + i7 + "] onReset", pVar, i7, i4, 1), 0L);
                    return true;
                case 4:
                    p3.h hVar2 = this.f2471f;
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q4 % 6 != 0) {
                            throw new IOException(w0.e("TYPE_SETTINGS length % 6 != 0: ", q4));
                        }
                        f.f fVar = new f.f(3);
                        y2.a x3 = l0.g.x(l0.g.z(0, q4), 6);
                        int i12 = x3.f3617f;
                        int i13 = x3.g;
                        int i14 = x3.h;
                        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                            while (true) {
                                short readShort = hVar2.readShort();
                                byte[] bArr = d3.c.f1490a;
                                int i15 = readShort & 65535;
                                readInt = hVar2.readInt();
                                if (i15 != 2) {
                                    if (i15 == i8) {
                                        i15 = 4;
                                    } else if (i15 != 4) {
                                        if (i15 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        }
                                    } else {
                                        if (readInt < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i15 = 7;
                                    }
                                } else if (readInt != 0 && readInt != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                fVar.f(i15, readInt);
                                if (i12 != i13) {
                                    i12 += i14;
                                    i8 = 3;
                                }
                            }
                            throw new IOException(w0.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                        }
                        p pVar2 = lVar.g;
                        pVar2.f2447m.c(new j(pVar2.h + " applyAndAckSettings", lVar, fVar, i9), 0L);
                        return true;
                    }
                    if (q4 != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    q(lVar, q4, i6, i7);
                    return true;
                case 6:
                    if (q4 != 8) {
                        throw new IOException(w0.e("TYPE_PING length != 8: ", q4));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int readInt4 = this.f2471f.readInt();
                    int readInt5 = this.f2471f.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        lVar.g.f2447m.c(new k(lVar.g.h + " ping", lVar.g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    p pVar3 = lVar.g;
                    synchronized (pVar3) {
                        try {
                            if (readInt4 == 1) {
                                pVar3.f2451q++;
                            } else if (readInt4 == 2) {
                                pVar3.f2453s++;
                            } else if (readInt4 == 3) {
                                pVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q4 < 8) {
                        throw new IOException(w0.e("TYPE_GOAWAY length < 8: ", q4));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.f2471f.readInt();
                    int readInt7 = this.f2471f.readInt();
                    int i16 = q4 - 8;
                    int[] b4 = q.e.b(14);
                    int length2 = b4.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 < length2) {
                            i5 = b4[i17];
                            if (q.e.a(i5) != readInt7) {
                                i17++;
                            }
                        } else {
                            i5 = 0;
                        }
                    }
                    if (i5 == 0) {
                        throw new IOException(w0.e("TYPE_GOAWAY unexpected error code: ", readInt7));
                    }
                    p3.i iVar = p3.i.f3029i;
                    if (i16 > 0) {
                        iVar = this.f2471f.b(i16);
                    }
                    u2.c.e(iVar, "debugData");
                    iVar.a();
                    p pVar4 = lVar.g;
                    synchronized (pVar4) {
                        array = pVar4.g.values().toArray(new x[0]);
                        pVar4.f2445k = true;
                    }
                    x[] xVarArr = (x[]) array;
                    int length3 = xVarArr.length;
                    while (r2 < length3) {
                        x xVar = xVarArr[r2];
                        if (xVar.f2479a > readInt6 && xVar.f()) {
                            xVar.i(8);
                            lVar.g.o(xVar.f2479a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (q4 != 4) {
                        throw new IOException(w0.e("TYPE_WINDOW_UPDATE length !=4: ", q4));
                    }
                    long readInt8 = this.f2471f.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i7 == 0) {
                        p pVar5 = lVar.g;
                        synchronized (pVar5) {
                            pVar5.f2460z += readInt8;
                            pVar5.notifyAll();
                        }
                        return true;
                    }
                    x n3 = lVar.g.n(i7);
                    if (n3 != null) {
                        synchronized (n3) {
                            n3.f2483f += readInt8;
                            if (readInt8 > 0) {
                                n3.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.f2471f.skip(q4);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void n(l lVar, int i4, int i5, int i6) {
        int i7;
        boolean z3;
        long j4;
        boolean z4;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f2471f.readByte();
            byte[] bArr = d3.c.f1490a;
            i7 = readByte & 255;
        } else {
            i7 = 0;
        }
        int a4 = r.a(i4, i5, i7);
        p3.h hVar = this.f2471f;
        u2.c.e(hVar, "source");
        p pVar = lVar.g;
        long j5 = 0;
        if (i6 == 0 || (i6 & 1) != 0) {
            x n3 = pVar.n(i6);
            if (n3 == null) {
                lVar.g.s(i6, 2);
                long j6 = a4;
                lVar.g.q(j6);
                hVar.skip(j6);
            } else {
                byte[] bArr2 = d3.c.f1490a;
                v vVar = n3.f2484i;
                long j7 = a4;
                vVar.getClass();
                long j8 = j7;
                while (true) {
                    if (j8 <= j5) {
                        vVar.m(j7);
                        break;
                    }
                    synchronized (vVar.f2477k) {
                        z3 = vVar.g;
                        j4 = j5;
                        z4 = vVar.f2475i.g + j8 > vVar.f2474f;
                    }
                    if (z4) {
                        hVar.skip(j8);
                        vVar.f2477k.e(4);
                        break;
                    }
                    if (z3) {
                        hVar.skip(j8);
                        break;
                    }
                    long c = hVar.c(j8, vVar.h);
                    if (c == -1) {
                        throw new EOFException();
                    }
                    j8 -= c;
                    x xVar = vVar.f2477k;
                    synchronized (xVar) {
                        try {
                            if (vVar.f2476j) {
                                p3.f fVar = vVar.h;
                                fVar.skip(fVar.g);
                            } else {
                                p3.f fVar2 = vVar.f2475i;
                                boolean z6 = fVar2.g == j4;
                                fVar2.w(vVar.h);
                                if (z6) {
                                    xVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j5 = j4;
                }
                if (z5) {
                    n3.h(d3.c.f1491b, true);
                }
            }
        } else {
            p3.f fVar3 = new p3.f();
            long j9 = a4;
            hVar.i(j9);
            hVar.c(j9, fVar3);
            pVar.f2448n.c(new m(pVar.h + '[' + i6 + "] onData", pVar, i6, fVar3, a4, z5), 0L);
        }
        this.f2471f.skip(i7);
    }

    public final List o(int i4, int i5, int i6, int i7) {
        s sVar = this.g;
        sVar.f2468j = i4;
        sVar.g = i4;
        sVar.f2469k = i5;
        sVar.h = i6;
        sVar.f2467i = i7;
        c cVar = this.h;
        p3.p pVar = cVar.c;
        ArrayList arrayList = cVar.f2410b;
        while (!pVar.m()) {
            byte readByte = pVar.readByte();
            byte[] bArr = d3.c.f1490a;
            int i8 = readByte & 255;
            if (i8 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e4 = cVar.e(i8, 127);
                int i9 = e4 - 1;
                if (i9 >= 0) {
                    b[] bVarArr = e.f2420a;
                    if (i9 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i9]);
                    }
                }
                int length = cVar.f2412e + 1 + (i9 - e.f2420a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f2411d;
                    if (length < bVarArr2.length) {
                        b bVar = bVarArr2[length];
                        u2.c.b(bVar);
                        arrayList.add(bVar);
                    }
                }
                throw new IOException(w0.e("Header index too large ", e4));
            }
            if (i8 == 64) {
                b[] bVarArr3 = e.f2420a;
                p3.i d4 = cVar.d();
                e.a(d4);
                cVar.c(new b(d4, cVar.d()));
            } else if ((readByte & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i8, 63) - 1), cVar.d()));
            } else if ((readByte & 32) == 32) {
                int e5 = cVar.e(i8, 31);
                cVar.f2409a = e5;
                if (e5 < 0 || e5 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f2409a);
                }
                int i10 = cVar.g;
                if (e5 < i10) {
                    if (e5 == 0) {
                        b[] bVarArr4 = cVar.f2411d;
                        n2.f.F(bVarArr4, 0, bVarArr4.length);
                        cVar.f2412e = cVar.f2411d.length - 1;
                        cVar.f2413f = 0;
                        cVar.g = 0;
                    } else {
                        cVar.a(i10 - e5);
                    }
                }
            } else if (i8 == 16 || i8 == 0) {
                b[] bVarArr5 = e.f2420a;
                p3.i d5 = cVar.d();
                e.a(d5);
                arrayList.add(new b(d5, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i8, 15) - 1), cVar.d()));
            }
        }
        List H = n2.g.H(arrayList);
        arrayList.clear();
        return H;
    }

    public final void p(l lVar, int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i7 = 0;
        int i8 = 1;
        boolean z3 = (i5 & 1) != 0;
        if ((i5 & 8) != 0) {
            byte readByte = this.f2471f.readByte();
            byte[] bArr = d3.c.f1490a;
            i7 = readByte & 255;
        }
        if ((i5 & 32) != 0) {
            p3.h hVar = this.f2471f;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = d3.c.f1490a;
            i4 -= 5;
        }
        List o4 = o(r.a(i4, i5, i7), i7, i5, i6);
        p pVar = lVar.g;
        if (i6 != 0 && (i6 & 1) == 0) {
            pVar.f2448n.c(new n(pVar.h + '[' + i6 + "] onHeaders", pVar, i6, o4, z3), 0L);
            return;
        }
        synchronized (pVar) {
            x n3 = pVar.n(i6);
            if (n3 != null) {
                n3.h(d3.c.s(o4), z3);
                return;
            }
            if (pVar.f2445k) {
                return;
            }
            if (i6 <= pVar.f2443i) {
                return;
            }
            if (i6 % 2 == pVar.f2444j % 2) {
                return;
            }
            x xVar = new x(i6, pVar, false, z3, d3.c.s(o4));
            pVar.f2443i = i6;
            pVar.g.put(Integer.valueOf(i6), xVar);
            pVar.f2446l.e().c(new j(pVar.h + '[' + i6 + "] onStream", pVar, xVar, i8), 0L);
        }
    }

    public final void q(l lVar, int i4, int i5, int i6) {
        int i7;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f2471f.readByte();
            byte[] bArr = d3.c.f1490a;
            i7 = readByte & 255;
        } else {
            i7 = 0;
        }
        int readInt = this.f2471f.readInt() & Integer.MAX_VALUE;
        List o4 = o(r.a(i4 - 4, i5, i7), i7, i5, i6);
        p pVar = lVar.g;
        synchronized (pVar) {
            if (pVar.D.contains(Integer.valueOf(readInt))) {
                pVar.s(readInt, 2);
                return;
            }
            pVar.D.add(Integer.valueOf(readInt));
            pVar.f2448n.c(new n(pVar.h + '[' + readInt + "] onRequest", pVar, readInt, o4), 0L);
        }
    }
}
