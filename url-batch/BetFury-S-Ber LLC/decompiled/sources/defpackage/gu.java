package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gu implements Closeable {
    public static final Logger i;
    public final w9 f;
    public final fu g;
    public final kt h;

    static {
        Logger logger = Logger.getLogger(st.class.getName());
        logger.getClass();
        i = logger;
    }

    public gu(j70 j70Var) {
        j70Var.getClass();
        this.f = j70Var;
        fu fuVar = new fu(j70Var);
        this.g = fuVar;
        this.h = new kt(fuVar);
    }

    public final void D(xt xtVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            s9.w("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = zk0.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int readInt = this.f.readInt() & Integer.MAX_VALUE;
        List r = r(mv.C(i2 - 4, i3, i5), i5, i3, i4);
        du duVar = xtVar.g;
        synchronized (duVar) {
            if (duVar.D.contains(Integer.valueOf(readInt))) {
                duVar.Q(readInt, kn.PROTOCOL_ERROR);
                return;
            }
            duVar.D.add(Integer.valueOf(readInt));
            duVar.n.c(new zt(duVar.h + '[' + readInt + "] onRequest", duVar, readInt, r, 1), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x022e, code lost:
    
        defpackage.s9.w(defpackage.r7.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0237, code lost:
    
        return r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(boolean z, xt xtVar) {
        kn knVar;
        int i2;
        kn knVar2;
        Object[] array;
        try {
            this.f.H(9L);
            int q = zk0.q(this.f);
            if (q > 16384) {
                s9.w(r7.b("FRAME_SIZE_ERROR: ", q));
                return false;
            }
            int readByte = this.f.readByte() & 255;
            byte readByte2 = this.f.readByte();
            int i3 = readByte2 & 255;
            int readInt = this.f.readInt();
            int i4 = readInt & Integer.MAX_VALUE;
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(st.a(true, i4, q, readByte, i3));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = st.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : zk0.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i5 = 2;
            switch (readByte) {
                case 0:
                    n(xtVar, q, i3, i4);
                    return true;
                case 1:
                    w(xtVar, q, i3, i4);
                    return true;
                case 2:
                    if (q != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q + " != 5");
                    }
                    if (i4 == 0) {
                        s9.w("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    w9 w9Var = this.f;
                    w9Var.readInt();
                    w9Var.readByte();
                    return true;
                case 3:
                    if (q != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q + " != 4");
                    }
                    if (i4 == 0) {
                        s9.w("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt2 = this.f.readInt();
                    kn.Companion.getClass();
                    kn[] values = kn.values();
                    int length = values.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            kn knVar3 = values[i6];
                            if (knVar3.getHttpCode() == readInt2) {
                                knVar = knVar3;
                            } else {
                                i6++;
                            }
                        } else {
                            knVar = null;
                        }
                    }
                    if (knVar == null) {
                        s9.w(r7.b("TYPE_RST_STREAM unexpected error code: ", readInt2));
                        return false;
                    }
                    du duVar = xtVar.g;
                    if (i4 == 0 || (readInt & 1) != 0) {
                        ku w = duVar.w(i4);
                        if (w == null) {
                            return true;
                        }
                        synchronized (w) {
                            if (w.m == null) {
                                w.m = knVar;
                                w.notifyAll();
                            }
                        }
                        return true;
                    }
                    duVar.n.c(new zt(duVar.h + '[' + i4 + "] onReset", duVar, i4, knVar, 2), 0L);
                    return true;
                case 4:
                    w9 w9Var2 = this.f;
                    if (i4 != 0) {
                        s9.w("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q % 6 != 0) {
                            s9.w(r7.b("TYPE_SETTINGS length % 6 != 0: ", q));
                            return false;
                        }
                        cd0 cd0Var = new cd0();
                        hv Z = d50.Z(d50.b0(0, q), 6);
                        int i7 = Z.f;
                        int i8 = Z.g;
                        int i9 = Z.h;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                short readShort = w9Var2.readShort();
                                byte[] bArr = zk0.a;
                                int i10 = readShort & 65535;
                                int readInt3 = w9Var2.readInt();
                                if (i10 == 2) {
                                    boolean z2 = r2;
                                    i2 = z2;
                                    i2 = z2;
                                    if (readInt3 != 0 && readInt3 != 1) {
                                        s9.w("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i10 == 3) {
                                    i2 = r2;
                                    i10 = 4;
                                } else if (i10 == 4) {
                                    boolean z3 = r2;
                                    if (readInt3 < 0) {
                                        s9.w("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z3;
                                    }
                                    i10 = 7;
                                    i2 = z3;
                                } else if (i10 == 5) {
                                    boolean z4 = r2;
                                    if (readInt3 < 16384) {
                                        break;
                                    } else {
                                        i2 = z4;
                                        if (readInt3 > 16777215) {
                                            break;
                                        }
                                    }
                                } else {
                                    i2 = r2;
                                }
                                cd0Var.b(i10, readInt3);
                                if (i7 != i8) {
                                    i7 += i9;
                                    r2 = i2;
                                }
                            }
                        }
                        du duVar2 = xtVar.g;
                        duVar2.m.c(new vt(r7.d(new StringBuilder(), duVar2.h, " applyAndAckSettings"), xtVar, cd0Var, i5), 0L);
                        return true;
                    }
                    if (q != 0) {
                        s9.w("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    D(xtVar, q, i3, i4);
                    return true;
                case 6:
                    if (q != 8) {
                        s9.w(r7.b("TYPE_PING length != 8: ", q));
                        return false;
                    }
                    if (i4 != 0) {
                        s9.w("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.f.readInt();
                    int readInt5 = this.f.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    du duVar3 = xtVar.g;
                    if (r2 == 0) {
                        duVar3.m.c(new wt(r7.d(new StringBuilder(), xtVar.g.h, " ping"), xtVar.g, readInt4, readInt5), 0L);
                        return true;
                    }
                    synchronized (duVar3) {
                        try {
                            if (readInt4 == 1) {
                                duVar3.q++;
                            } else if (readInt4 == 2) {
                                duVar3.s++;
                            } else if (readInt4 == 3) {
                                duVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q < 8) {
                        s9.w(r7.b("TYPE_GOAWAY length < 8: ", q));
                        return false;
                    }
                    if (i4 != 0) {
                        s9.w("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.f.readInt();
                    int readInt7 = this.f.readInt();
                    int i11 = q - 8;
                    kn.Companion.getClass();
                    kn[] values2 = kn.values();
                    int length2 = values2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            kn knVar4 = values2[i12];
                            if (knVar4.getHttpCode() == readInt7) {
                                knVar2 = knVar4;
                            } else {
                                i12++;
                            }
                        } else {
                            knVar2 = null;
                        }
                    }
                    if (knVar2 == null) {
                        s9.w(r7.b("TYPE_GOAWAY unexpected error code: ", readInt7));
                        return false;
                    }
                    y9 y9Var = y9.i;
                    if (i11 > 0) {
                        y9Var = this.f.j(i11);
                    }
                    y9Var.getClass();
                    y9Var.a();
                    du duVar4 = xtVar.g;
                    synchronized (duVar4) {
                        array = duVar4.g.values().toArray(new ku[0]);
                        duVar4.k = true;
                    }
                    ku[] kuVarArr = (ku[]) array;
                    int length3 = kuVarArr.length;
                    while (r2 < length3) {
                        ku kuVar = kuVarArr[r2];
                        if (kuVar.a > readInt6 && kuVar.f()) {
                            kn knVar5 = kn.REFUSED_STREAM;
                            synchronized (kuVar) {
                                knVar5.getClass();
                                if (kuVar.m == null) {
                                    kuVar.m = knVar5;
                                    kuVar.notifyAll();
                                }
                            }
                            xtVar.g.w(kuVar.a);
                        }
                        r2++;
                    }
                    break;
                    break;
                case 8:
                    if (q != 4) {
                        s9.w(r7.b("TYPE_WINDOW_UPDATE length !=4: ", q));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.f.readInt();
                    if (readInt8 == 0) {
                        s9.w("windowSizeIncrement was 0");
                        return false;
                    }
                    du duVar5 = xtVar.g;
                    if (i4 == 0) {
                        synchronized (duVar5) {
                            duVar5.z += readInt8;
                            duVar5.notifyAll();
                        }
                        return true;
                    }
                    ku r = duVar5.r(i4);
                    if (r != null) {
                        synchronized (r) {
                            r.f += readInt8;
                            if (readInt8 > 0) {
                                r.notifyAll();
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

    public final void n(xt xtVar, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        if (i4 == 0) {
            s9.w("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            s9.w("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = zk0.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int C = mv.C(i2, i3, i5);
        w9 w9Var = this.f;
        w9Var.getClass();
        du duVar = xtVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            t9 t9Var = new t9();
            long j = C;
            w9Var.H(j);
            w9Var.c(j, t9Var);
            duVar.n.c(new yt(duVar.h + '[' + i4 + "] onData", duVar, i4, t9Var, C, z3), 0L);
        } else {
            ku r = duVar.r(i4);
            if (r == null) {
                xtVar.g.Q(i4, kn.PROTOCOL_ERROR);
                long j2 = C;
                xtVar.g.O(j2);
                w9Var.skip(j2);
            } else {
                byte[] bArr2 = zk0.a;
                iu iuVar = r.i;
                long j3 = C;
                iuVar.getClass();
                long j4 = j3;
                while (true) {
                    if (j4 <= 0) {
                        iuVar.i(j3);
                        break;
                    }
                    synchronized (iuVar.k) {
                        z = iuVar.g;
                        z2 = iuVar.i.g + j4 > iuVar.f;
                    }
                    if (z2) {
                        w9Var.skip(j4);
                        iuVar.k.e(kn.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        w9Var.skip(j4);
                        break;
                    }
                    long c = w9Var.c(j4, iuVar.h);
                    if (c == -1) {
                        throw new EOFException();
                    }
                    j4 -= c;
                    ku kuVar = iuVar.k;
                    synchronized (kuVar) {
                        try {
                            if (iuVar.j) {
                                t9 t9Var2 = iuVar.h;
                                t9Var2.skip(t9Var2.g);
                            } else {
                                t9 t9Var3 = iuVar.i;
                                boolean z4 = t9Var3.g == 0;
                                t9Var3.S(iuVar.h);
                                if (z4) {
                                    kuVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    r.h(zk0.b, true);
                }
            }
        }
        this.f.skip(i5);
    }

    public final List r(int i2, int i3, int i4, int i5) {
        fu fuVar = this.g;
        fuVar.j = i2;
        fuVar.g = i2;
        fuVar.k = i3;
        fuVar.h = i4;
        fuVar.i = i5;
        kt ktVar = this.h;
        j70 j70Var = ktVar.c;
        ArrayList arrayList = ktVar.b;
        while (!j70Var.i()) {
            byte readByte = j70Var.readByte();
            byte[] bArr = zk0.a;
            int i6 = readByte & 255;
            if (i6 == 128) {
                s9.w("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = ktVar.e(i6, 127);
                int i7 = e - 1;
                if (i7 >= 0) {
                    xs[] xsVarArr = mt.a;
                    if (i7 <= xsVarArr.length - 1) {
                        arrayList.add(xsVarArr[i7]);
                    }
                }
                int length = ktVar.e + 1 + (i7 - mt.a.length);
                if (length >= 0) {
                    xs[] xsVarArr2 = ktVar.d;
                    if (length < xsVarArr2.length) {
                        xs xsVar = xsVarArr2[length];
                        xsVar.getClass();
                        arrayList.add(xsVar);
                    }
                }
                s9.w(r7.b("Header index too large ", e));
                return null;
            }
            if (i6 == 64) {
                xs[] xsVarArr3 = mt.a;
                y9 d = ktVar.d();
                mt.a(d);
                ktVar.c(new xs(d, ktVar.d()));
            } else if ((readByte & 64) == 64) {
                ktVar.c(new xs(ktVar.b(ktVar.e(i6, 63) - 1), ktVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = ktVar.e(i6, 31);
                ktVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + ktVar.a);
                }
                int i8 = ktVar.g;
                if (e2 < i8) {
                    if (e2 == 0) {
                        xs[] xsVarArr4 = ktVar.d;
                        j7.a0(xsVarArr4, 0, xsVarArr4.length);
                        ktVar.e = ktVar.d.length - 1;
                        ktVar.f = 0;
                        ktVar.g = 0;
                    } else {
                        ktVar.a(i8 - e2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                xs[] xsVarArr5 = mt.a;
                y9 d2 = ktVar.d();
                mt.a(d2);
                arrayList.add(new xs(d2, ktVar.d()));
            } else {
                arrayList.add(new xs(ktVar.b(ktVar.e(i6, 15) - 1), ktVar.d()));
            }
        }
        List q0 = uc.q0(arrayList);
        arrayList.clear();
        return q0;
    }

    public final void w(xt xtVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            s9.w("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i6 = 1;
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = zk0.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            w9 w9Var = this.f;
            w9Var.readInt();
            w9Var.readByte();
            byte[] bArr2 = zk0.a;
            i2 -= 5;
        }
        List r = r(mv.C(i2, i3, i5), i5, i3, i4);
        du duVar = xtVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            z = true;
        }
        if (z) {
            duVar.n.c(new zt(duVar.h + '[' + i4 + "] onHeaders", duVar, i4, r, z2), 0L);
            return;
        }
        synchronized (duVar) {
            ku r2 = duVar.r(i4);
            if (r2 != null) {
                r2.h(zk0.s(r), z2);
                return;
            }
            if (duVar.k) {
                return;
            }
            if (i4 <= duVar.i) {
                return;
            }
            if (i4 % 2 == duVar.j % 2) {
                return;
            }
            ku kuVar = new ku(i4, duVar, false, z2, zk0.s(r));
            duVar.i = i4;
            duVar.g.put(Integer.valueOf(i4), kuVar);
            duVar.l.e().c(new vt(duVar.h + '[' + i4 + "] onStream", duVar, kuVar, i6), 0L);
        }
    }
}
