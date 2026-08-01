package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class mq implements Closeable {
    public static final Logger i;
    public final j9 f;
    public final lq g;
    public final rp h;

    static {
        Logger logger = Logger.getLogger(zp.class.getName());
        logger.getClass();
        i = logger;
    }

    public mq(e10 e10Var) {
        e10Var.getClass();
        this.f = e10Var;
        lq lqVar = new lq(e10Var);
        this.g = lqVar;
        this.h = new rp(lqVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        defpackage.g9.w(defpackage.f60.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x023d, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(boolean z, eq eqVar) {
        int i2;
        int i3;
        int i4;
        Object[] array;
        try {
            this.f.l(9L);
            int q = cb0.q(this.f);
            if (q > 16384) {
                g9.w(f60.e("FRAME_SIZE_ERROR: ", q));
                return false;
            }
            int readByte = this.f.readByte() & 255;
            byte readByte2 = this.f.readByte();
            int i5 = readByte2 & 255;
            int readInt = this.f.readInt();
            int i6 = readInt & Integer.MAX_VALUE;
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(zp.a(true, i6, q, readByte, i5));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = zp.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : cb0.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (readByte) {
                case 0:
                    g(eqVar, q, i5, i6);
                    return true;
                case 1:
                    k(eqVar, q, i5, i6);
                    return true;
                case 2:
                    if (q != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q + " != 5");
                    }
                    if (i6 == 0) {
                        g9.w("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    j9 j9Var = this.f;
                    j9Var.readInt();
                    j9Var.readByte();
                    return true;
                case 3:
                    if (q != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q + " != 4");
                    }
                    if (i6 == 0) {
                        g9.w("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt2 = this.f.readInt();
                    int[] m = f60.m(14);
                    int length = m.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i9 = m[i8];
                            if (f60.j(i9) == readInt2) {
                                i2 = i9;
                            } else {
                                i8++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        g9.w(f60.e("TYPE_RST_STREAM unexpected error code: ", readInt2));
                        return false;
                    }
                    jq jqVar = eqVar.g;
                    if (i6 != 0 && (readInt & 1) == 0) {
                        jqVar.n.c(new dq(jqVar.h + '[' + i6 + "] onReset", jqVar, i6, i2, 1), 0L);
                        return true;
                    }
                    qq h = jqVar.h(i6);
                    if (h == null) {
                        return true;
                    }
                    synchronized (h) {
                        if (i2 == 0) {
                            throw null;
                        }
                        if (h.m == 0) {
                            h.m = i2;
                            h.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    j9 j9Var2 = this.f;
                    if (i6 != 0) {
                        g9.w("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q % 6 != 0) {
                            g9.w(f60.e("TYPE_SETTINGS length % 6 != 0: ", q));
                            return false;
                        }
                        b50 b50Var = new b50();
                        gr O = mz.O(mz.Q(0, q), 6);
                        int i10 = O.f;
                        int i11 = O.g;
                        int i12 = O.h;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            while (true) {
                                short readShort = j9Var2.readShort();
                                byte[] bArr = cb0.a;
                                int i13 = readShort & 65535;
                                int readInt3 = j9Var2.readInt();
                                if (i13 == 2) {
                                    boolean z2 = r2;
                                    i3 = z2;
                                    i3 = z2;
                                    if (readInt3 != 0 && readInt3 != 1) {
                                        g9.w("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i13 == 3) {
                                    i3 = r2;
                                    i13 = 4;
                                } else if (i13 == 4) {
                                    boolean z3 = r2;
                                    if (readInt3 < 0) {
                                        g9.w("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
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
                                b50Var.b(i13, readInt3);
                                if (i10 != i11) {
                                    i10 += i12;
                                    r2 = i3;
                                }
                            }
                        }
                        jq jqVar2 = eqVar.g;
                        jqVar2.m.c(new cq(jqVar2.h + " applyAndAckSettings", eqVar, b50Var, i7), 0L);
                        return true;
                    }
                    if (q != 0) {
                        g9.w("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    q(eqVar, q, i5, i6);
                    return true;
                case 6:
                    if (q != 8) {
                        g9.w(f60.e("TYPE_PING length != 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        g9.w("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.f.readInt();
                    int readInt5 = this.f.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    jq jqVar3 = eqVar.g;
                    if (r2 == 0) {
                        jqVar3.m.c(new dq(eqVar.g.h + " ping", eqVar.g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    synchronized (jqVar3) {
                        try {
                            if (readInt4 == 1) {
                                jqVar3.q++;
                            } else if (readInt4 == 2) {
                                jqVar3.s++;
                            } else if (readInt4 == 3) {
                                jqVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q < 8) {
                        g9.w(f60.e("TYPE_GOAWAY length < 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        g9.w("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.f.readInt();
                    int readInt7 = this.f.readInt();
                    int i14 = q - 8;
                    int[] m2 = f60.m(14);
                    int length2 = m2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            i4 = m2[i15];
                            if (f60.j(i4) != readInt7) {
                                i15++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        g9.w(f60.e("TYPE_GOAWAY unexpected error code: ", readInt7));
                        return false;
                    }
                    l9 l9Var = l9.i;
                    if (i14 > 0) {
                        l9Var = this.f.c(i14);
                    }
                    l9Var.getClass();
                    l9Var.a();
                    jq jqVar4 = eqVar.g;
                    synchronized (jqVar4) {
                        array = jqVar4.g.values().toArray(new qq[0]);
                        jqVar4.k = true;
                    }
                    qq[] qqVarArr = (qq[]) array;
                    int length3 = qqVarArr.length;
                    while (r2 < length3) {
                        qq qqVar = qqVarArr[r2];
                        if (qqVar.a > readInt6 && qqVar.f()) {
                            synchronized (qqVar) {
                                if (qqVar.m == 0) {
                                    qqVar.m = 8;
                                    qqVar.notifyAll();
                                }
                            }
                            eqVar.g.h(qqVar.a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (q != 4) {
                        g9.w(f60.e("TYPE_WINDOW_UPDATE length !=4: ", q));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.f.readInt();
                    if (readInt8 == 0) {
                        g9.w("windowSizeIncrement was 0");
                        return false;
                    }
                    jq jqVar5 = eqVar.g;
                    if (i6 == 0) {
                        synchronized (jqVar5) {
                            jqVar5.z += readInt8;
                            jqVar5.notifyAll();
                        }
                        return true;
                    }
                    qq g = jqVar5.g(i6);
                    if (g != null) {
                        synchronized (g) {
                            g.f += readInt8;
                            if (readInt8 > 0) {
                                g.notifyAll();
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

    public final void g(eq eqVar, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        if (i4 == 0) {
            g9.w("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            g9.w("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = cb0.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int w = b9.w(i2, i3, i5);
        j9 j9Var = this.f;
        j9Var.getClass();
        jq jqVar = eqVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            h9 h9Var = new h9();
            long j = w;
            j9Var.l(j);
            j9Var.b(j, h9Var);
            jqVar.n.c(new fq(jqVar.h + '[' + i4 + "] onData", jqVar, i4, h9Var, w, z3), 0L);
        } else {
            qq g = jqVar.g(i4);
            if (g == null) {
                eqVar.g.s(i4, 2);
                long j2 = w;
                eqVar.g.q(j2);
                j9Var.skip(j2);
            } else {
                byte[] bArr2 = cb0.a;
                oq oqVar = g.i;
                long j3 = w;
                oqVar.getClass();
                long j4 = j3;
                while (true) {
                    if (j4 <= 0) {
                        oqVar.f(j3);
                        break;
                    }
                    synchronized (oqVar.k) {
                        z = oqVar.g;
                        z2 = oqVar.i.g + j4 > oqVar.f;
                    }
                    if (z2) {
                        j9Var.skip(j4);
                        oqVar.k.e(4);
                        break;
                    }
                    if (z) {
                        j9Var.skip(j4);
                        break;
                    }
                    long b = j9Var.b(j4, oqVar.h);
                    if (b == -1) {
                        throw new EOFException();
                    }
                    j4 -= b;
                    qq qqVar = oqVar.k;
                    synchronized (qqVar) {
                        try {
                            if (oqVar.j) {
                                h9 h9Var2 = oqVar.h;
                                h9Var2.skip(h9Var2.g);
                            } else {
                                h9 h9Var3 = oqVar.i;
                                boolean z4 = h9Var3.g == 0;
                                h9Var3.v(oqVar.h);
                                if (z4) {
                                    qqVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    g.h(cb0.b, true);
                }
            }
        }
        this.f.skip(i5);
    }

    public final List h(int i2, int i3, int i4, int i5) {
        lq lqVar = this.g;
        lqVar.j = i2;
        lqVar.g = i2;
        lqVar.k = i3;
        lqVar.h = i4;
        lqVar.i = i5;
        rp rpVar = this.h;
        e10 e10Var = rpVar.c;
        ArrayList arrayList = rpVar.b;
        while (!e10Var.f()) {
            byte readByte = e10Var.readByte();
            byte[] bArr = cb0.a;
            int i6 = readByte & 255;
            if (i6 == 128) {
                g9.w("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = rpVar.e(i6, 127);
                int i7 = e - 1;
                if (i7 >= 0) {
                    gp[] gpVarArr = tp.a;
                    if (i7 <= gpVarArr.length - 1) {
                        arrayList.add(gpVarArr[i7]);
                    }
                }
                int length = rpVar.e + 1 + (i7 - tp.a.length);
                if (length >= 0) {
                    gp[] gpVarArr2 = rpVar.d;
                    if (length < gpVarArr2.length) {
                        gp gpVar = gpVarArr2[length];
                        gpVar.getClass();
                        arrayList.add(gpVar);
                    }
                }
                g9.w(f60.e("Header index too large ", e));
                return null;
            }
            if (i6 == 64) {
                gp[] gpVarArr3 = tp.a;
                l9 d = rpVar.d();
                tp.a(d);
                rpVar.c(new gp(d, rpVar.d()));
            } else if ((readByte & 64) == 64) {
                rpVar.c(new gp(rpVar.b(rpVar.e(i6, 63) - 1), rpVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = rpVar.e(i6, 31);
                rpVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + rpVar.a);
                }
                int i8 = rpVar.g;
                if (e2 < i8) {
                    if (e2 == 0) {
                        gp[] gpVarArr4 = rpVar.d;
                        a7.b0(gpVarArr4, 0, gpVarArr4.length);
                        rpVar.e = rpVar.d.length - 1;
                        rpVar.f = 0;
                        rpVar.g = 0;
                    } else {
                        rpVar.a(i8 - e2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                gp[] gpVarArr5 = tp.a;
                l9 d2 = rpVar.d();
                tp.a(d2);
                arrayList.add(new gp(d2, rpVar.d()));
            } else {
                arrayList.add(new gp(rpVar.b(rpVar.e(i6, 15) - 1), rpVar.d()));
            }
        }
        List n0 = wb.n0(arrayList);
        arrayList.clear();
        return n0;
    }

    public final void k(eq eqVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            g9.w("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i6 = 1;
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = cb0.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            j9 j9Var = this.f;
            j9Var.readInt();
            j9Var.readByte();
            byte[] bArr2 = cb0.a;
            i2 -= 5;
        }
        List h = h(b9.w(i2, i3, i5), i5, i3, i4);
        jq jqVar = eqVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            z = true;
        }
        if (z) {
            jqVar.n.c(new gq(jqVar.h + '[' + i4 + "] onHeaders", jqVar, i4, h, z2), 0L);
            return;
        }
        synchronized (jqVar) {
            qq g = jqVar.g(i4);
            if (g != null) {
                g.h(cb0.s(h), z2);
                return;
            }
            if (jqVar.k) {
                return;
            }
            if (i4 <= jqVar.i) {
                return;
            }
            if (i4 % 2 == jqVar.j % 2) {
                return;
            }
            qq qqVar = new qq(i4, jqVar, false, z2, cb0.s(h));
            jqVar.i = i4;
            jqVar.g.put(Integer.valueOf(i4), qqVar);
            jqVar.l.e().c(new cq(jqVar.h + '[' + i4 + "] onStream", jqVar, qqVar, i6), 0L);
        }
    }

    public final void q(eq eqVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            g9.w("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = cb0.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int readInt = this.f.readInt() & Integer.MAX_VALUE;
        List h = h(b9.w(i2 - 4, i3, i5), i5, i3, i4);
        jq jqVar = eqVar.g;
        synchronized (jqVar) {
            if (jqVar.D.contains(Integer.valueOf(readInt))) {
                jqVar.s(readInt, 2);
                return;
            }
            jqVar.D.add(Integer.valueOf(readInt));
            jqVar.n.c(new gq(jqVar.h + '[' + readInt + "] onRequest", jqVar, readInt, h), 0L);
        }
    }
}
