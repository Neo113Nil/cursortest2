package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ao implements Closeable {
    public static final Logger i;
    public final w8 f;
    public final zn g;
    public final fn h;

    static {
        Logger logger = Logger.getLogger(nn.class.getName());
        logger.getClass();
        i = logger;
    }

    public ao(cy cyVar) {
        cyVar.getClass();
        this.f = cyVar;
        zn znVar = new zn(cyVar);
        this.g = znVar;
        this.h = new fn(znVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        defpackage.t8.y(defpackage.d30.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x023d, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z, sn snVar) {
        int i2;
        int i3;
        int i4;
        Object[] array;
        try {
            this.f.h(9L);
            int q = r70.q(this.f);
            if (q > 16384) {
                t8.y(d30.e("FRAME_SIZE_ERROR: ", q));
                return false;
            }
            int readByte = this.f.readByte() & 255;
            byte readByte2 = this.f.readByte();
            int i5 = readByte2 & 255;
            int readInt = this.f.readInt();
            int i6 = readInt & Integer.MAX_VALUE;
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(nn.a(true, i6, q, readByte, i5));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = nn.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : r70.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (readByte) {
                case 0:
                    n(snVar, q, i5, i6);
                    return true;
                case 1:
                    p(snVar, q, i5, i6);
                    return true;
                case 2:
                    if (q != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q + " != 5");
                    }
                    if (i6 == 0) {
                        t8.y("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    w8 w8Var = this.f;
                    w8Var.readInt();
                    w8Var.readByte();
                    return true;
                case 3:
                    if (q != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q + " != 4");
                    }
                    if (i6 == 0) {
                        t8.y("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt2 = this.f.readInt();
                    int[] k = d30.k(14);
                    int length = k.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i9 = k[i8];
                            if (d30.h(i9) == readInt2) {
                                i2 = i9;
                            } else {
                                i8++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        t8.y(d30.e("TYPE_RST_STREAM unexpected error code: ", readInt2));
                        return false;
                    }
                    xn xnVar = snVar.g;
                    if (i6 != 0 && (readInt & 1) == 0) {
                        xnVar.n.c(new rn(xnVar.h + '[' + i6 + "] onReset", xnVar, i6, i2, 1), 0L);
                        return true;
                    }
                    fo o = xnVar.o(i6);
                    if (o == null) {
                        return true;
                    }
                    synchronized (o) {
                        if (i2 == 0) {
                            throw null;
                        }
                        if (o.m == 0) {
                            o.m = i2;
                            o.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    w8 w8Var2 = this.f;
                    if (i6 != 0) {
                        t8.y("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q % 6 != 0) {
                            t8.y(d30.e("TYPE_SETTINGS length % 6 != 0: ", q));
                            return false;
                        }
                        or orVar = new or(5);
                        vo x0 = o8.x0(o8.y0(0, q), 6);
                        int i10 = x0.f;
                        int i11 = x0.g;
                        int i12 = x0.h;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            while (true) {
                                short readShort = w8Var2.readShort();
                                byte[] bArr = r70.a;
                                int i13 = readShort & 65535;
                                int readInt3 = w8Var2.readInt();
                                if (i13 == 2) {
                                    boolean z2 = r2;
                                    i3 = z2;
                                    i3 = z2;
                                    if (readInt3 != 0 && readInt3 != 1) {
                                        t8.y("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i13 == 3) {
                                    i3 = r2;
                                    i13 = 4;
                                } else if (i13 == 4) {
                                    boolean z3 = r2;
                                    if (readInt3 < 0) {
                                        t8.y("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z3;
                                    }
                                    i13 = 7;
                                    i3 = z3;
                                } else if (i13 == 5) {
                                    boolean z4 = r2;
                                    if (readInt3 < 16384) {
                                        break;
                                    } else {
                                        i3 = z4;
                                        if (readInt3 > 16777215) {
                                            break;
                                        }
                                    }
                                } else {
                                    i3 = r2;
                                }
                                orVar.k(i13, readInt3);
                                if (i10 != i11) {
                                    i10 += i12;
                                    r2 = i3;
                                }
                            }
                        }
                        xn xnVar2 = snVar.g;
                        xnVar2.m.c(new qn(xnVar2.h + " applyAndAckSettings", snVar, orVar, i7), 0L);
                        return true;
                    }
                    if (q != 0) {
                        t8.y("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    q(snVar, q, i5, i6);
                    return true;
                case 6:
                    if (q != 8) {
                        t8.y(d30.e("TYPE_PING length != 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        t8.y("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.f.readInt();
                    int readInt5 = this.f.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    xn xnVar3 = snVar.g;
                    if (r2 == 0) {
                        xnVar3.m.c(new rn(snVar.g.h + " ping", snVar.g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    synchronized (xnVar3) {
                        try {
                            if (readInt4 == 1) {
                                xnVar3.q++;
                            } else if (readInt4 == 2) {
                                xnVar3.s++;
                            } else if (readInt4 == 3) {
                                xnVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q < 8) {
                        t8.y(d30.e("TYPE_GOAWAY length < 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        t8.y("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.f.readInt();
                    int readInt7 = this.f.readInt();
                    int i14 = q - 8;
                    int[] k2 = d30.k(14);
                    int length2 = k2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            i4 = k2[i15];
                            if (d30.h(i4) != readInt7) {
                                i15++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        t8.y(d30.e("TYPE_GOAWAY unexpected error code: ", readInt7));
                        return false;
                    }
                    y8 y8Var = y8.i;
                    if (i14 > 0) {
                        y8Var = this.f.c(i14);
                    }
                    y8Var.getClass();
                    y8Var.a();
                    xn xnVar4 = snVar.g;
                    synchronized (xnVar4) {
                        array = xnVar4.g.values().toArray(new fo[0]);
                        xnVar4.k = true;
                    }
                    fo[] foVarArr = (fo[]) array;
                    int length3 = foVarArr.length;
                    while (r2 < length3) {
                        fo foVar = foVarArr[r2];
                        if (foVar.a > readInt6 && foVar.f()) {
                            synchronized (foVar) {
                                if (foVar.m == 0) {
                                    foVar.m = 8;
                                    foVar.notifyAll();
                                }
                            }
                            snVar.g.o(foVar.a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (q != 4) {
                        t8.y(d30.e("TYPE_WINDOW_UPDATE length !=4: ", q));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.f.readInt();
                    if (readInt8 == 0) {
                        t8.y("windowSizeIncrement was 0");
                        return false;
                    }
                    xn xnVar5 = snVar.g;
                    if (i6 == 0) {
                        synchronized (xnVar5) {
                            xnVar5.z += readInt8;
                            xnVar5.notifyAll();
                        }
                        return true;
                    }
                    fo n = xnVar5.n(i6);
                    if (n != null) {
                        synchronized (n) {
                            n.f += readInt8;
                            if (readInt8 > 0) {
                                n.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.f.skip(q);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void n(sn snVar, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        if (i4 == 0) {
            t8.y("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            t8.y("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = r70.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int S = o8.S(i2, i3, i5);
        w8 w8Var = this.f;
        w8Var.getClass();
        xn xnVar = snVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            u8 u8Var = new u8();
            long j = S;
            w8Var.h(j);
            w8Var.b(j, u8Var);
            xnVar.n.c(new tn(xnVar.h + '[' + i4 + "] onData", xnVar, i4, u8Var, S, z3), 0L);
        } else {
            fo n = xnVar.n(i4);
            if (n == null) {
                snVar.g.s(i4, 2);
                long j2 = S;
                snVar.g.q(j2);
                w8Var.skip(j2);
            } else {
                byte[] bArr2 = r70.a;
                co coVar = n.i;
                long j3 = S;
                coVar.getClass();
                long j4 = j3;
                while (true) {
                    if (j4 <= 0) {
                        coVar.m(j3);
                        break;
                    }
                    synchronized (coVar.k) {
                        z = coVar.g;
                        z2 = coVar.i.g + j4 > coVar.f;
                    }
                    if (z2) {
                        w8Var.skip(j4);
                        coVar.k.e(4);
                        break;
                    }
                    if (z) {
                        w8Var.skip(j4);
                        break;
                    }
                    long b = w8Var.b(j4, coVar.h);
                    if (b == -1) {
                        throw new EOFException();
                    }
                    j4 -= b;
                    fo foVar = coVar.k;
                    synchronized (foVar) {
                        try {
                            if (coVar.j) {
                                u8 u8Var2 = coVar.h;
                                u8Var2.skip(u8Var2.g);
                            } else {
                                u8 u8Var3 = coVar.i;
                                boolean z4 = u8Var3.g == 0;
                                u8Var3.v(coVar.h);
                                if (z4) {
                                    foVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    n.h(r70.b, true);
                }
            }
        }
        this.f.skip(i5);
    }

    public final List o(int i2, int i3, int i4, int i5) {
        zn znVar = this.g;
        znVar.j = i2;
        znVar.g = i2;
        znVar.k = i3;
        znVar.h = i4;
        znVar.i = i5;
        fn fnVar = this.h;
        cy cyVar = fnVar.c;
        ArrayList arrayList = fnVar.b;
        while (!cyVar.m()) {
            byte readByte = cyVar.readByte();
            byte[] bArr = r70.a;
            int i6 = readByte & 255;
            if (i6 == 128) {
                t8.y("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = fnVar.e(i6, 127);
                int i7 = e - 1;
                if (i7 >= 0) {
                    um[] umVarArr = hn.a;
                    if (i7 <= umVarArr.length - 1) {
                        arrayList.add(umVarArr[i7]);
                    }
                }
                int length = fnVar.e + 1 + (i7 - hn.a.length);
                if (length >= 0) {
                    um[] umVarArr2 = fnVar.d;
                    if (length < umVarArr2.length) {
                        um umVar = umVarArr2[length];
                        umVar.getClass();
                        arrayList.add(umVar);
                    }
                }
                t8.y(d30.e("Header index too large ", e));
                return null;
            }
            if (i6 == 64) {
                um[] umVarArr3 = hn.a;
                y8 d = fnVar.d();
                hn.a(d);
                fnVar.c(new um(d, fnVar.d()));
            } else if ((readByte & 64) == 64) {
                fnVar.c(new um(fnVar.b(fnVar.e(i6, 63) - 1), fnVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = fnVar.e(i6, 31);
                fnVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + fnVar.a);
                }
                int i8 = fnVar.g;
                if (e2 < i8) {
                    if (e2 == 0) {
                        um[] umVarArr4 = fnVar.d;
                        q6.f0(umVarArr4, 0, umVarArr4.length);
                        fnVar.e = fnVar.d.length - 1;
                        fnVar.f = 0;
                        fnVar.g = 0;
                    } else {
                        fnVar.a(i8 - e2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                um[] umVarArr5 = hn.a;
                y8 d2 = fnVar.d();
                hn.a(d2);
                arrayList.add(new um(d2, fnVar.d()));
            } else {
                arrayList.add(new um(fnVar.b(fnVar.e(i6, 15) - 1), fnVar.d()));
            }
        }
        List K0 = bb.K0(arrayList);
        arrayList.clear();
        return K0;
    }

    public final void p(sn snVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            t8.y("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i6 = 1;
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = r70.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            w8 w8Var = this.f;
            w8Var.readInt();
            w8Var.readByte();
            byte[] bArr2 = r70.a;
            i2 -= 5;
        }
        List o = o(o8.S(i2, i3, i5), i5, i3, i4);
        xn xnVar = snVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            z = true;
        }
        if (z) {
            xnVar.n.c(new un(xnVar.h + '[' + i4 + "] onHeaders", xnVar, i4, o, z2), 0L);
            return;
        }
        synchronized (xnVar) {
            fo n = xnVar.n(i4);
            if (n != null) {
                n.h(r70.s(o), z2);
                return;
            }
            if (xnVar.k) {
                return;
            }
            if (i4 <= xnVar.i) {
                return;
            }
            if (i4 % 2 == xnVar.j % 2) {
                return;
            }
            fo foVar = new fo(i4, xnVar, false, z2, r70.s(o));
            xnVar.i = i4;
            xnVar.g.put(Integer.valueOf(i4), foVar);
            xnVar.l.e().c(new qn(xnVar.h + '[' + i4 + "] onStream", xnVar, foVar, i6), 0L);
        }
    }

    public final void q(sn snVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            t8.y("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = r70.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int readInt = this.f.readInt() & Integer.MAX_VALUE;
        List o = o(o8.S(i2 - 4, i3, i5), i5, i3, i4);
        xn xnVar = snVar.g;
        synchronized (xnVar) {
            if (xnVar.D.contains(Integer.valueOf(readInt))) {
                xnVar.s(readInt, 2);
                return;
            }
            xnVar.D.add(Integer.valueOf(readInt));
            xnVar.n.c(new un(xnVar.h + '[' + readInt + "] onRequest", xnVar, readInt, o), 0L);
        }
    }
}
