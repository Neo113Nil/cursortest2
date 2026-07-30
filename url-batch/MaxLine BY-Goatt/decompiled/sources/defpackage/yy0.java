package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.ranges.c;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yy0 implements Closeable {
    public static final Logger p;
    public final pq m;
    public final xy0 n;
    public final ey0 o;

    static {
        Logger logger = Logger.getLogger(my0.class.getName());
        logger.getClass();
        p = logger;
    }

    public yy0(p62 p62Var) {
        p62Var.getClass();
        this.m = p62Var;
        xy0 xy0Var = new xy0(p62Var);
        this.n = xy0Var;
        this.o = new ey0(xy0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(boolean z, sk skVar) {
        int i;
        int readInt;
        int i2;
        boolean z2;
        int i3;
        Object[] array;
        try {
            this.m.F(9L);
            int p2 = n33.p(this.m);
            if (p2 > 16384) {
                dm0.j(in1.k(p2, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int readByte = this.m.readByte() & 255;
            byte readByte2 = this.m.readByte();
            int i4 = readByte2 & 255;
            int readInt2 = this.m.readInt();
            int i5 = readInt2 & Integer.MAX_VALUE;
            Logger logger = p;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(my0.a(true, i5, p2, readByte, i4));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = my0.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : n33.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i6 = 2;
            switch (readByte) {
                case 0:
                    f(skVar, p2, i4, i5);
                    return true;
                case 1:
                    n(skVar, p2, i4, i5);
                    return true;
                case 2:
                    if (p2 != 5) {
                        dm0.j(in1.l(p2, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i5 == 0) {
                        dm0.j("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    pq pqVar = this.m;
                    pqVar.readInt();
                    pqVar.readByte();
                    return true;
                case 3:
                    if (p2 != 4) {
                        dm0.j(in1.l(p2, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i5 == 0) {
                        dm0.j("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt3 = this.m.readInt();
                    int[] x = q40.x(14);
                    int length = x.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            int i8 = x[i7];
                            if (q40.u(i8) == readInt3) {
                                i = i8;
                            } else {
                                i7++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        dm0.j(in1.k(readInt3, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    vy0 vy0Var = (vy0) skVar.o;
                    if (i5 != 0 && (readInt2 & 1) == 0) {
                        vy0Var.u.c(new qy0(vy0Var.o + '[' + i5 + "] onReset", vy0Var, i5, i, 1), 0L);
                        return true;
                    }
                    cz0 m = vy0Var.m(i5);
                    if (m == null) {
                        return true;
                    }
                    synchronized (m) {
                        if (i == 0) {
                            throw null;
                        }
                        if (m.m == 0) {
                            m.m = i;
                            m.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    pq pqVar2 = this.m;
                    if (i5 != 0) {
                        dm0.j("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (p2 % 6 != 0) {
                            dm0.j(in1.k(p2, "TYPE_SETTINGS length % 6 != 0: "));
                            return false;
                        }
                        tj2 tj2Var = new tj2();
                        c e = d.e(d.f(0, p2), 6);
                        int i9 = e.m;
                        int i10 = e.n;
                        int i11 = e.o;
                        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                            while (true) {
                                short readShort = pqVar2.readShort();
                                byte[] bArr = n33.a;
                                int i12 = readShort & 65535;
                                readInt = pqVar2.readInt();
                                if (i12 == 2) {
                                    boolean z3 = r2;
                                    i2 = z3;
                                    i2 = z3;
                                    if (readInt != 0 && readInt != 1) {
                                        dm0.j("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z3;
                                    }
                                } else if (i12 == 3) {
                                    i2 = r2;
                                    i12 = 4;
                                } else if (i12 == 4) {
                                    boolean z4 = r2;
                                    if (readInt < 0) {
                                        dm0.j("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z4;
                                    }
                                    i12 = 7;
                                    i2 = z4;
                                } else if (i12 != 5) {
                                    i2 = r2;
                                } else {
                                    z2 = r2;
                                    if (readInt >= 16384) {
                                        i2 = z2;
                                        if (readInt > 16777215) {
                                        }
                                    }
                                }
                                tj2Var.b(i12, readInt);
                                if (i9 != i10) {
                                    i9 += i11;
                                    r2 = i2;
                                }
                            }
                            dm0.j(in1.k(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                            return z2;
                        }
                        vy0 vy0Var2 = (vy0) skVar.o;
                        vy0Var2.t.c(new py0(q40.p(new StringBuilder(), vy0Var2.o, " applyAndAckSettings"), skVar, tj2Var, i6), 0L);
                        return true;
                    }
                    if (p2 != 0) {
                        dm0.j("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    o(skVar, p2, i4, i5);
                    return true;
                case 6:
                    if (p2 != 8) {
                        dm0.j(in1.k(p2, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i5 != 0) {
                        dm0.j("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.m.readInt();
                    int readInt5 = this.m.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    vy0 vy0Var3 = (vy0) skVar.o;
                    if (r2 == 0) {
                        vy0Var3.t.c(new qy0(q40.p(new StringBuilder(), ((vy0) skVar.o).o, " ping"), (vy0) skVar.o, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    synchronized (vy0Var3) {
                        try {
                            if (readInt4 == 1) {
                                vy0Var3.x++;
                            } else if (readInt4 != 2) {
                                if (readInt4 == 3) {
                                    vy0Var3.notifyAll();
                                }
                                Unit unit = Unit.a;
                            } else {
                                vy0Var3.z++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (p2 < 8) {
                        dm0.j(in1.k(p2, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i5 != 0) {
                        dm0.j("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.m.readInt();
                    int readInt7 = this.m.readInt();
                    int i13 = p2 - 8;
                    int[] x2 = q40.x(14);
                    int length2 = x2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            i3 = x2[i14];
                            if (q40.u(i3) != readInt7) {
                                i14++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i3 == 0) {
                        dm0.j(in1.k(readInt7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    dr drVar = dr.p;
                    if (i13 > 0) {
                        drVar = this.m.k(i13);
                    }
                    drVar.getClass();
                    drVar.c();
                    vy0 vy0Var4 = (vy0) skVar.o;
                    synchronized (vy0Var4) {
                        array = vy0Var4.n.values().toArray(new cz0[0]);
                        vy0Var4.r = true;
                        Unit unit2 = Unit.a;
                    }
                    cz0[] cz0VarArr = (cz0[]) array;
                    int length3 = cz0VarArr.length;
                    while (r2 < length3) {
                        cz0 cz0Var = cz0VarArr[r2];
                        if (cz0Var.a > readInt6 && cz0Var.f()) {
                            synchronized (cz0Var) {
                                if (cz0Var.m == 0) {
                                    cz0Var.m = 8;
                                    cz0Var.notifyAll();
                                }
                            }
                            ((vy0) skVar.o).m(cz0Var.a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (p2 != 4) {
                        dm0.j(in1.k(p2, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.m.readInt();
                    if (readInt8 == 0) {
                        dm0.j("windowSizeIncrement was 0");
                        return false;
                    }
                    vy0 vy0Var5 = (vy0) skVar.o;
                    if (i5 == 0) {
                        synchronized (vy0Var5) {
                            vy0Var5.G += readInt8;
                            vy0Var5.notifyAll();
                            Unit unit3 = Unit.a;
                        }
                        return true;
                    }
                    cz0 f = vy0Var5.f(i5);
                    if (f != null) {
                        synchronized (f) {
                            f.f += readInt8;
                            if (readInt8 > 0) {
                                f.notifyAll();
                            }
                            Unit unit4 = Unit.a;
                        }
                        return true;
                    }
                    break;
                default:
                    this.m.skip(p2);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final void f(sk skVar, int i, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            dm0.j("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            dm0.j("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.m.readByte();
            byte[] bArr = n33.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int J = yk3.J(i, i2, i4);
        pq pqVar = this.m;
        pqVar.getClass();
        vy0 vy0Var = (vy0) skVar.o;
        if (i3 != 0 && (i3 & 1) == 0) {
            fq fqVar = new fq();
            long j = J;
            pqVar.F(j);
            pqVar.h(j, fqVar);
            vy0Var.u.c(new ry0(vy0Var.o + '[' + i3 + "] onData", vy0Var, i3, fqVar, J, z3), 0L);
        } else {
            cz0 f = vy0Var.f(i3);
            if (f == null) {
                ((vy0) skVar.o).q(i3, 2);
                long j2 = J;
                ((vy0) skVar.o).o(j2);
                pqVar.skip(j2);
            } else {
                byte[] bArr2 = n33.a;
                az0 az0Var = f.i;
                long j3 = J;
                az0Var.getClass();
                long j4 = j3;
                while (true) {
                    cz0 cz0Var = az0Var.r;
                    if (j4 <= 0) {
                        byte[] bArr3 = n33.a;
                        cz0Var.b.o(j3);
                        break;
                    }
                    synchronized (cz0Var) {
                        z = az0Var.n;
                        z2 = az0Var.p.n + j4 > az0Var.m;
                        Unit unit = Unit.a;
                    }
                    if (z2) {
                        pqVar.skip(j4);
                        az0Var.r.e(4);
                        break;
                    }
                    if (z) {
                        pqVar.skip(j4);
                        break;
                    }
                    long h = pqVar.h(j4, az0Var.o);
                    if (h == -1) {
                        throw new EOFException();
                    }
                    j4 -= h;
                    cz0 cz0Var2 = az0Var.r;
                    synchronized (cz0Var2) {
                        try {
                            if (az0Var.q) {
                                fq fqVar2 = az0Var.o;
                                fqVar2.skip(fqVar2.n);
                            } else {
                                fq fqVar3 = az0Var.p;
                                boolean z4 = fqVar3.n == 0;
                                fqVar3.J(az0Var.o);
                                if (z4) {
                                    cz0Var2.notifyAll();
                                }
                            }
                        } finally {
                        }
                    }
                }
                if (z3) {
                    f.h(n33.b, true);
                }
            }
        }
        this.m.skip(i4);
    }

    public final List m(int i, int i2, int i3, int i4) {
        xy0 xy0Var = this.n;
        xy0Var.q = i;
        xy0Var.n = i;
        xy0Var.r = i2;
        xy0Var.o = i3;
        xy0Var.p = i4;
        ey0 ey0Var = this.o;
        p62 p62Var = ey0Var.c;
        ArrayList arrayList = ey0Var.b;
        while (!p62Var.b()) {
            byte readByte = p62Var.readByte();
            byte[] bArr = n33.a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                dm0.j("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = ey0Var.e(i5, 127);
                int i6 = e - 1;
                if (i6 >= 0) {
                    kx0[] kx0VarArr = gy0.a;
                    if (i6 <= kx0VarArr.length - 1) {
                        arrayList.add(kx0VarArr[i6]);
                    }
                }
                int length = ey0Var.e + 1 + (i6 - gy0.a.length);
                if (length >= 0) {
                    kx0[] kx0VarArr2 = ey0Var.d;
                    if (length < kx0VarArr2.length) {
                        kx0 kx0Var = kx0VarArr2[length];
                        kx0Var.getClass();
                        arrayList.add(kx0Var);
                    }
                }
                dm0.j(in1.k(e, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                kx0[] kx0VarArr3 = gy0.a;
                dr d = ey0Var.d();
                gy0.a(d);
                ey0Var.c(new kx0(d, ey0Var.d()));
            } else if ((readByte & 64) == 64) {
                ey0Var.c(new kx0(ey0Var.b(ey0Var.e(i5, 63) - 1), ey0Var.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = ey0Var.e(i5, 31);
                ey0Var.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + ey0Var.a);
                }
                int i7 = ey0Var.g;
                if (e2 < i7) {
                    if (e2 == 0) {
                        ni.k(0, r6.length, null, ey0Var.d);
                        ey0Var.e = ey0Var.d.length - 1;
                        ey0Var.f = 0;
                        ey0Var.g = 0;
                    } else {
                        ey0Var.a(i7 - e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                kx0[] kx0VarArr4 = gy0.a;
                dr d2 = ey0Var.d();
                gy0.a(d2);
                arrayList.add(new kx0(d2, ey0Var.d()));
            } else {
                arrayList.add(new kx0(ey0Var.b(ey0Var.e(i5, 15) - 1), ey0Var.d()));
            }
        }
        List M = zv.M(arrayList);
        arrayList.clear();
        return M;
    }

    public final void n(sk skVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            dm0.j("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i5 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.m.readByte();
            byte[] bArr = n33.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            pq pqVar = this.m;
            pqVar.readInt();
            pqVar.readByte();
            byte[] bArr2 = n33.a;
            i -= 5;
        }
        List m = m(yk3.J(i, i2, i4), i4, i2, i3);
        m.getClass();
        vy0 vy0Var = (vy0) skVar.o;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            vy0Var.u.c(new sy0(vy0Var.o + '[' + i3 + "] onHeaders", vy0Var, i3, m, z2), 0L);
            return;
        }
        synchronized (vy0Var) {
            cz0 f = vy0Var.f(i3);
            if (f != null) {
                Unit unit = Unit.a;
                f.h(n33.r(m), z2);
                return;
            }
            if (vy0Var.r) {
                return;
            }
            if (i3 <= vy0Var.p) {
                return;
            }
            if (i3 % 2 == vy0Var.q % 2) {
                return;
            }
            cz0 cz0Var = new cz0(i3, vy0Var, false, z2, n33.r(m));
            vy0Var.p = i3;
            vy0Var.n.put(Integer.valueOf(i3), cz0Var);
            vy0Var.s.e().c(new py0(vy0Var.o + '[' + i3 + "] onStream", vy0Var, cz0Var, i5), 0L);
        }
    }

    public final void o(sk skVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            dm0.j("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.m.readByte();
            byte[] bArr = n33.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.m.readInt() & Integer.MAX_VALUE;
        List m = m(yk3.J(i - 4, i2, i4), i4, i2, i3);
        m.getClass();
        vy0 vy0Var = (vy0) skVar.o;
        synchronized (vy0Var) {
            if (vy0Var.K.contains(Integer.valueOf(readInt))) {
                vy0Var.q(readInt, 2);
                return;
            }
            vy0Var.K.add(Integer.valueOf(readInt));
            vy0Var.u.c(new sy0(vy0Var.o + '[' + readInt + "] onRequest", vy0Var, readInt, m), 0L);
        }
    }
}
