package a4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v implements Closeable {
    public static final Logger i;

    /* renamed from: f, reason: collision with root package name */
    public final g4.h f229f;

    /* renamed from: g, reason: collision with root package name */
    public final u f230g;
    public final d h;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        i3.d.d(logger, "getLogger(Http2::class.java.name)");
        i = logger;
    }

    public v(g4.p pVar) {
        i3.d.e(pVar, "source");
        this.f229f = pVar;
        u uVar = new u(pVar);
        this.f230g = uVar;
        this.h = new d(uVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f229f.close();
    }

    public final boolean m(boolean z4, m mVar) {
        int i4;
        int readInt;
        int i5;
        Object[] array;
        try {
            this.f229f.i(9L);
            int q4 = u3.b.q(this.f229f);
            if (q4 > 16384) {
                throw new IOException(b.f("FRAME_SIZE_ERROR: ", q4));
            }
            int readByte = this.f229f.readByte() & 255;
            byte readByte2 = this.f229f.readByte();
            int i6 = readByte2 & 255;
            int readInt2 = this.f229f.readInt();
            int i7 = readInt2 & Integer.MAX_VALUE;
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i7, q4, readByte, i6));
            }
            if (z4 && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f173b;
                sb.append(readByte < strArr.length ? strArr[readByte] : u3.b.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i8 = 3;
            int i9 = 2;
            switch (readByte) {
                case 0:
                    n(mVar, q4, i6, i7);
                    return true;
                case 1:
                    p(mVar, q4, i6, i7);
                    return true;
                case 2:
                    if (q4 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q4 + " != 5");
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    g4.h hVar = this.f229f;
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
                    int readInt3 = this.f229f.readInt();
                    int[] b2 = t.e.b(14);
                    int length = b2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            int i11 = b2[i10];
                            if (t.e.a(i11) == readInt3) {
                                i4 = i11;
                            } else {
                                i10++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        throw new IOException(b.f("TYPE_RST_STREAM unexpected error code: ", readInt3));
                    }
                    r rVar = mVar.f188g;
                    if (i7 != 0 && (readInt2 & 1) == 0) {
                        r2 = 1;
                    }
                    if (r2 == 0) {
                        z o4 = rVar.o(i7);
                        if (o4 == null) {
                            return true;
                        }
                        o4.i(i4);
                        return true;
                    }
                    rVar.f206n.c(new l(rVar.h + '[' + i7 + "] onReset", rVar, i7, i4, 1), 0L);
                    return true;
                case 4:
                    g4.h hVar2 = this.f229f;
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q4 % 6 != 0) {
                            throw new IOException(b.f("TYPE_SETTINGS length % 6 != 0: ", q4));
                        }
                        e0 e0Var = new e0(0);
                        m3.a X = b4.d.X(b4.d.Y(0, q4), 6);
                        int i12 = X.f2735f;
                        int i13 = X.f2736g;
                        int i14 = X.h;
                        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                            while (true) {
                                short readShort = hVar2.readShort();
                                byte[] bArr = u3.b.f3581a;
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
                                e0Var.f(i15, readInt);
                                if (i12 != i13) {
                                    i12 += i14;
                                    i8 = 3;
                                }
                            }
                            throw new IOException(b.f("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                        }
                        r rVar2 = mVar.f188g;
                        rVar2.f205m.c(new k(rVar2.h + " applyAndAckSettings", mVar, e0Var, i9), 0L);
                        return true;
                    }
                    if (q4 != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    q(mVar, q4, i6, i7);
                    return true;
                case 6:
                    if (q4 != 8) {
                        throw new IOException(b.f("TYPE_PING length != 8: ", q4));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int readInt4 = this.f229f.readInt();
                    int readInt5 = this.f229f.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        mVar.f188g.f205m.c(new l(mVar.f188g.h + " ping", mVar.f188g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    r rVar3 = mVar.f188g;
                    synchronized (rVar3) {
                        try {
                            if (readInt4 == 1) {
                                rVar3.f209q++;
                            } else if (readInt4 == 2) {
                                rVar3.f211s++;
                            } else if (readInt4 == 3) {
                                rVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q4 < 8) {
                        throw new IOException(b.f("TYPE_GOAWAY length < 8: ", q4));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.f229f.readInt();
                    int readInt7 = this.f229f.readInt();
                    int i16 = q4 - 8;
                    int[] b5 = t.e.b(14);
                    int length2 = b5.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 < length2) {
                            i5 = b5[i17];
                            if (t.e.a(i5) != readInt7) {
                                i17++;
                            }
                        } else {
                            i5 = 0;
                        }
                    }
                    if (i5 == 0) {
                        throw new IOException(b.f("TYPE_GOAWAY unexpected error code: ", readInt7));
                    }
                    g4.i iVar = g4.i.i;
                    if (i16 > 0) {
                        iVar = this.f229f.b(i16);
                    }
                    i3.d.e(iVar, "debugData");
                    iVar.a();
                    r rVar4 = mVar.f188g;
                    synchronized (rVar4) {
                        array = rVar4.f201g.values().toArray(new z[0]);
                        rVar4.f203k = true;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (r2 < length3) {
                        z zVar = zVarArr[r2];
                        if (zVar.f238a > readInt6 && zVar.f()) {
                            zVar.i(8);
                            mVar.f188g.o(zVar.f238a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (q4 != 4) {
                        throw new IOException(b.f("TYPE_WINDOW_UPDATE length !=4: ", q4));
                    }
                    long readInt8 = this.f229f.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i7 == 0) {
                        r rVar5 = mVar.f188g;
                        synchronized (rVar5) {
                            rVar5.f218z += readInt8;
                            rVar5.notifyAll();
                        }
                        return true;
                    }
                    z n4 = mVar.f188g.n(i7);
                    if (n4 != null) {
                        synchronized (n4) {
                            n4.f242f += readInt8;
                            if (readInt8 > 0) {
                                n4.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.f229f.skip(q4);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void n(m mVar, int i4, int i5, int i6) {
        int i7;
        boolean z4;
        long j2;
        boolean z5;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f229f.readByte();
            byte[] bArr = u3.b.f3581a;
            i7 = readByte & 255;
        } else {
            i7 = 0;
        }
        int a5 = t.a(i4, i5, i7);
        g4.h hVar = this.f229f;
        i3.d.e(hVar, "source");
        r rVar = mVar.f188g;
        long j4 = 0;
        if (i6 == 0 || (i6 & 1) != 0) {
            z n4 = rVar.n(i6);
            if (n4 == null) {
                mVar.f188g.s(i6, 2);
                long j5 = a5;
                mVar.f188g.q(j5);
                hVar.skip(j5);
            } else {
                byte[] bArr2 = u3.b.f3581a;
                x xVar = n4.i;
                long j6 = a5;
                xVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= j4) {
                        xVar.m(j6);
                        break;
                    }
                    synchronized (xVar.f236k) {
                        z4 = xVar.f234g;
                        j2 = j4;
                        z5 = xVar.i.f1935g + j7 > xVar.f233f;
                    }
                    if (z5) {
                        hVar.skip(j7);
                        xVar.f236k.e(4);
                        break;
                    }
                    if (z4) {
                        hVar.skip(j7);
                        break;
                    }
                    long c5 = hVar.c(j7, xVar.h);
                    if (c5 == -1) {
                        throw new EOFException();
                    }
                    j7 -= c5;
                    z zVar = xVar.f236k;
                    synchronized (zVar) {
                        try {
                            if (xVar.f235j) {
                                g4.f fVar = xVar.h;
                                fVar.skip(fVar.f1935g);
                            } else {
                                g4.f fVar2 = xVar.i;
                                boolean z7 = fVar2.f1935g == j2;
                                fVar2.w(xVar.h);
                                if (z7) {
                                    zVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j4 = j2;
                }
                if (z6) {
                    n4.h(u3.b.f3582b, true);
                }
            }
        } else {
            g4.f fVar3 = new g4.f();
            long j8 = a5;
            hVar.i(j8);
            hVar.c(j8, fVar3);
            rVar.f206n.c(new n(rVar.h + '[' + i6 + "] onData", rVar, i6, fVar3, a5, z6), 0L);
        }
        this.f229f.skip(i7);
    }

    public final List o(int i4, int i5, int i6, int i7) {
        u uVar = this.f230g;
        uVar.f227j = i4;
        uVar.f226g = i4;
        uVar.f228k = i5;
        uVar.h = i6;
        uVar.i = i7;
        d dVar = this.h;
        g4.p pVar = dVar.f156c;
        ArrayList arrayList = dVar.f155b;
        while (!pVar.m()) {
            byte readByte = pVar.readByte();
            byte[] bArr = u3.b.f3581a;
            int i8 = readByte & 255;
            if (i8 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e4 = dVar.e(i8, 127);
                int i9 = e4 - 1;
                if (i9 >= 0) {
                    c[] cVarArr = f.f169a;
                    if (i9 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i9]);
                    }
                }
                int length = dVar.f157e + 1 + (i9 - f.f169a.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.d;
                    if (length < cVarArr2.length) {
                        c cVar = cVarArr2[length];
                        i3.d.b(cVar);
                        arrayList.add(cVar);
                    }
                }
                throw new IOException(b.f("Header index too large ", e4));
            }
            if (i8 == 64) {
                c[] cVarArr3 = f.f169a;
                g4.i d = dVar.d();
                f.a(d);
                dVar.c(new c(d, dVar.d()));
            } else if ((readByte & 64) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i8, 63) - 1), dVar.d()));
            } else if ((readByte & 32) == 32) {
                int e5 = dVar.e(i8, 31);
                dVar.f154a = e5;
                if (e5 < 0 || e5 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + dVar.f154a);
                }
                int i10 = dVar.f159g;
                if (e5 < i10) {
                    if (e5 == 0) {
                        c[] cVarArr4 = dVar.d;
                        x2.g.K(cVarArr4, 0, cVarArr4.length);
                        dVar.f157e = dVar.d.length - 1;
                        dVar.f158f = 0;
                        dVar.f159g = 0;
                    } else {
                        dVar.a(i10 - e5);
                    }
                }
            } else if (i8 == 16 || i8 == 0) {
                c[] cVarArr5 = f.f169a;
                g4.i d5 = dVar.d();
                f.a(d5);
                arrayList.add(new c(d5, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i8, 15) - 1), dVar.d()));
            }
        }
        List G = x2.h.G(arrayList);
        arrayList.clear();
        return G;
    }

    public final void p(m mVar, int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i7 = 0;
        int i8 = 1;
        boolean z4 = (i5 & 1) != 0;
        if ((i5 & 8) != 0) {
            byte readByte = this.f229f.readByte();
            byte[] bArr = u3.b.f3581a;
            i7 = readByte & 255;
        }
        if ((i5 & 32) != 0) {
            g4.h hVar = this.f229f;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = u3.b.f3581a;
            i4 -= 5;
        }
        List o4 = o(t.a(i4, i5, i7), i7, i5, i6);
        r rVar = mVar.f188g;
        if (i6 != 0 && (i6 & 1) == 0) {
            rVar.f206n.c(new o(rVar.h + '[' + i6 + "] onHeaders", rVar, i6, o4, z4), 0L);
            return;
        }
        synchronized (rVar) {
            z n4 = rVar.n(i6);
            if (n4 != null) {
                n4.h(u3.b.s(o4), z4);
                return;
            }
            if (rVar.f203k) {
                return;
            }
            if (i6 <= rVar.i) {
                return;
            }
            if (i6 % 2 == rVar.f202j % 2) {
                return;
            }
            z zVar = new z(i6, rVar, false, z4, u3.b.s(o4));
            rVar.i = i6;
            rVar.f201g.put(Integer.valueOf(i6), zVar);
            rVar.f204l.e().c(new k(rVar.h + '[' + i6 + "] onStream", rVar, zVar, i8), 0L);
        }
    }

    public final void q(m mVar, int i4, int i5, int i6) {
        int i7;
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f229f.readByte();
            byte[] bArr = u3.b.f3581a;
            i7 = readByte & 255;
        } else {
            i7 = 0;
        }
        int readInt = this.f229f.readInt() & Integer.MAX_VALUE;
        List o4 = o(t.a(i4 - 4, i5, i7), i7, i5, i6);
        r rVar = mVar.f188g;
        synchronized (rVar) {
            if (rVar.D.contains(Integer.valueOf(readInt))) {
                rVar.s(readInt, 2);
                return;
            }
            rVar.D.add(Integer.valueOf(readInt));
            rVar.f206n.c(new o(rVar.h + '[' + readInt + "] onRequest", rVar, readInt, o4), 0L);
        }
    }
}
