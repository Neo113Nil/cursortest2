package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qo implements Closeable {
    public static final Logger i;
    public final r8 f;
    public final po g;
    public final un h;

    static {
        Logger logger = Logger.getLogger(co.class.getName());
        logger.getClass();
        i = logger;
    }

    public qo(ry ryVar) {
        ryVar.getClass();
        this.f = ryVar;
        po poVar = new po(ryVar);
        this.g = poVar;
        this.h = new un(poVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0234, code lost:
    
        defpackage.o8.x(defpackage.o30.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x023d, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z, io ioVar) {
        int i2;
        int i3;
        int i4;
        Object[] array;
        try {
            this.f.h(9L);
            int q = y70.q(this.f);
            if (q > 16384) {
                o8.x(o30.e("FRAME_SIZE_ERROR: ", q));
                return false;
            }
            int readByte = this.f.readByte() & 255;
            byte readByte2 = this.f.readByte();
            int i5 = readByte2 & 255;
            int readInt = this.f.readInt();
            int i6 = readInt & Integer.MAX_VALUE;
            Logger logger = i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(co.a(true, i6, q, readByte, i5));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = co.b;
                sb.append(readByte < strArr.length ? strArr[readByte] : y70.f("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (readByte) {
                case 0:
                    n(ioVar, q, i5, i6);
                    return true;
                case 1:
                    p(ioVar, q, i5, i6);
                    return true;
                case 2:
                    if (q != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q + " != 5");
                    }
                    if (i6 == 0) {
                        o8.x("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    r8 r8Var = this.f;
                    r8Var.readInt();
                    r8Var.readByte();
                    return true;
                case 3:
                    if (q != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q + " != 4");
                    }
                    if (i6 == 0) {
                        o8.x("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int readInt2 = this.f.readInt();
                    int[] l = o30.l(14);
                    int length = l.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i9 = l[i8];
                            if (o30.i(i9) == readInt2) {
                                i2 = i9;
                            } else {
                                i8++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        o8.x(o30.e("TYPE_RST_STREAM unexpected error code: ", readInt2));
                        return false;
                    }
                    no noVar = ioVar.g;
                    if (i6 != 0 && (readInt & 1) == 0) {
                        noVar.n.c(new ho(noVar.h + '[' + i6 + "] onReset", noVar, i6, i2, 1), 0L);
                        return true;
                    }
                    uo o = noVar.o(i6);
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
                    r8 r8Var2 = this.f;
                    if (i6 != 0) {
                        o8.x("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((readByte2 & 1) == 0) {
                        if (q % 6 != 0) {
                            o8.x(o30.e("TYPE_SETTINGS length % 6 != 0: ", q));
                            return false;
                        }
                        v2 v2Var = new v2(3);
                        jp R = op.R(op.W(0, q), 6);
                        int i10 = R.f;
                        int i11 = R.g;
                        int i12 = R.h;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            while (true) {
                                short readShort = r8Var2.readShort();
                                byte[] bArr = y70.a;
                                int i13 = readShort & 65535;
                                int readInt3 = r8Var2.readInt();
                                if (i13 == 2) {
                                    boolean z2 = r2;
                                    i3 = z2;
                                    i3 = z2;
                                    if (readInt3 != 0 && readInt3 != 1) {
                                        o8.x("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i13 == 3) {
                                    i3 = r2;
                                    i13 = 4;
                                } else if (i13 == 4) {
                                    boolean z3 = r2;
                                    if (readInt3 < 0) {
                                        o8.x("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
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
                                v2Var.d(i13, readInt3);
                                if (i10 != i11) {
                                    i10 += i12;
                                    r2 = i3;
                                }
                            }
                        }
                        no noVar2 = ioVar.g;
                        noVar2.m.c(new go(noVar2.h + " applyAndAckSettings", ioVar, v2Var, i7), 0L);
                        return true;
                    }
                    if (q != 0) {
                        o8.x("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                    q(ioVar, q, i5, i6);
                    return true;
                case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                    if (q != 8) {
                        o8.x(o30.e("TYPE_PING length != 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        o8.x("TYPE_PING streamId != 0");
                        return false;
                    }
                    int readInt4 = this.f.readInt();
                    int readInt5 = this.f.readInt();
                    r2 = (readByte2 & 1) != 0 ? 1 : 0;
                    no noVar3 = ioVar.g;
                    if (r2 == 0) {
                        noVar3.m.c(new ho(ioVar.g.h + " ping", ioVar.g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    synchronized (noVar3) {
                        try {
                            if (readInt4 == 1) {
                                noVar3.q++;
                            } else if (readInt4 == 2) {
                                noVar3.s++;
                            } else if (readInt4 == 3) {
                                noVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (q < 8) {
                        o8.x(o30.e("TYPE_GOAWAY length < 8: ", q));
                        return false;
                    }
                    if (i6 != 0) {
                        o8.x("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int readInt6 = this.f.readInt();
                    int readInt7 = this.f.readInt();
                    int i14 = q - 8;
                    int[] l2 = o30.l(14);
                    int length2 = l2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            i4 = l2[i15];
                            if (o30.i(i4) != readInt7) {
                                i15++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        o8.x(o30.e("TYPE_GOAWAY unexpected error code: ", readInt7));
                        return false;
                    }
                    t8 t8Var = t8.i;
                    if (i14 > 0) {
                        t8Var = this.f.c(i14);
                    }
                    t8Var.getClass();
                    t8Var.a();
                    no noVar4 = ioVar.g;
                    synchronized (noVar4) {
                        array = noVar4.g.values().toArray(new uo[0]);
                        noVar4.k = true;
                    }
                    uo[] uoVarArr = (uo[]) array;
                    int length3 = uoVarArr.length;
                    while (r2 < length3) {
                        uo uoVar = uoVarArr[r2];
                        if (uoVar.a > readInt6 && uoVar.f()) {
                            synchronized (uoVar) {
                                if (uoVar.m == 0) {
                                    uoVar.m = 8;
                                    uoVar.notifyAll();
                                }
                            }
                            ioVar.g.o(uoVar.a);
                        }
                        r2++;
                    }
                    break;
                case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                    if (q != 4) {
                        o8.x(o30.e("TYPE_WINDOW_UPDATE length !=4: ", q));
                        return false;
                    }
                    long readInt8 = 2147483647L & this.f.readInt();
                    if (readInt8 == 0) {
                        o8.x("windowSizeIncrement was 0");
                        return false;
                    }
                    no noVar5 = ioVar.g;
                    if (i6 == 0) {
                        synchronized (noVar5) {
                            noVar5.z += readInt8;
                            noVar5.notifyAll();
                        }
                        return true;
                    }
                    uo n = noVar5.n(i6);
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

    public final void n(io ioVar, int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        if (i4 == 0) {
            o8.x("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            o8.x("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = y70.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int V = vw.V(i2, i3, i5);
        r8 r8Var = this.f;
        r8Var.getClass();
        no noVar = ioVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            p8 p8Var = new p8();
            long j = V;
            r8Var.h(j);
            r8Var.b(j, p8Var);
            noVar.n.c(new jo(noVar.h + '[' + i4 + "] onData", noVar, i4, p8Var, V, z3), 0L);
        } else {
            uo n = noVar.n(i4);
            if (n == null) {
                ioVar.g.s(i4, 2);
                long j2 = V;
                ioVar.g.q(j2);
                r8Var.skip(j2);
            } else {
                byte[] bArr2 = y70.a;
                so soVar = n.i;
                long j3 = V;
                soVar.getClass();
                long j4 = j3;
                while (true) {
                    if (j4 <= 0) {
                        soVar.m(j3);
                        break;
                    }
                    synchronized (soVar.k) {
                        z = soVar.g;
                        z2 = soVar.i.g + j4 > soVar.f;
                    }
                    if (z2) {
                        r8Var.skip(j4);
                        soVar.k.e(4);
                        break;
                    }
                    if (z) {
                        r8Var.skip(j4);
                        break;
                    }
                    long b = r8Var.b(j4, soVar.h);
                    if (b == -1) {
                        throw new EOFException();
                    }
                    j4 -= b;
                    uo uoVar = soVar.k;
                    synchronized (uoVar) {
                        try {
                            if (soVar.j) {
                                p8 p8Var2 = soVar.h;
                                p8Var2.skip(p8Var2.g);
                            } else {
                                p8 p8Var3 = soVar.i;
                                boolean z4 = p8Var3.g == 0;
                                p8Var3.v(soVar.h);
                                if (z4) {
                                    uoVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    n.h(y70.b, true);
                }
            }
        }
        this.f.skip(i5);
    }

    public final List o(int i2, int i3, int i4, int i5) {
        po poVar = this.g;
        poVar.j = i2;
        poVar.g = i2;
        poVar.k = i3;
        poVar.h = i4;
        poVar.i = i5;
        un unVar = this.h;
        ry ryVar = unVar.c;
        ArrayList arrayList = unVar.b;
        while (!ryVar.m()) {
            byte readByte = ryVar.readByte();
            byte[] bArr = y70.a;
            int i6 = readByte & 255;
            if (i6 == 128) {
                o8.x("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int e = unVar.e(i6, 127);
                int i7 = e - 1;
                if (i7 >= 0) {
                    mn[] mnVarArr = wn.a;
                    if (i7 <= mnVarArr.length - 1) {
                        arrayList.add(mnVarArr[i7]);
                    }
                }
                int length = unVar.e + 1 + (i7 - wn.a.length);
                if (length >= 0) {
                    mn[] mnVarArr2 = unVar.d;
                    if (length < mnVarArr2.length) {
                        mn mnVar = mnVarArr2[length];
                        mnVar.getClass();
                        arrayList.add(mnVar);
                    }
                }
                o8.x(o30.e("Header index too large ", e));
                return null;
            }
            if (i6 == 64) {
                mn[] mnVarArr3 = wn.a;
                t8 d = unVar.d();
                wn.a(d);
                unVar.c(new mn(d, unVar.d()));
            } else if ((readByte & 64) == 64) {
                unVar.c(new mn(unVar.b(unVar.e(i6, 63) - 1), unVar.d()));
            } else if ((readByte & 32) == 32) {
                int e2 = unVar.e(i6, 31);
                unVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + unVar.a);
                }
                int i8 = unVar.g;
                if (e2 < i8) {
                    if (e2 == 0) {
                        mn[] mnVarArr4 = unVar.d;
                        h7.i0(mnVarArr4, 0, mnVarArr4.length);
                        unVar.e = unVar.d.length - 1;
                        unVar.f = 0;
                        unVar.g = 0;
                    } else {
                        unVar.a(i8 - e2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                mn[] mnVarArr5 = wn.a;
                t8 d2 = unVar.d();
                wn.a(d2);
                arrayList.add(new mn(d2, unVar.d()));
            } else {
                arrayList.add(new mn(unVar.b(unVar.e(i6, 15) - 1), unVar.d()));
            }
        }
        List f0 = db.f0(arrayList);
        arrayList.clear();
        return f0;
    }

    public final void p(io ioVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            o8.x("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i6 = 1;
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = y70.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            r8 r8Var = this.f;
            r8Var.readInt();
            r8Var.readByte();
            byte[] bArr2 = y70.a;
            i2 -= 5;
        }
        List o = o(vw.V(i2, i3, i5), i5, i3, i4);
        no noVar = ioVar.g;
        if (i4 != 0 && (i4 & 1) == 0) {
            z = true;
        }
        if (z) {
            noVar.n.c(new ko(noVar.h + '[' + i4 + "] onHeaders", noVar, i4, o, z2), 0L);
            return;
        }
        synchronized (noVar) {
            uo n = noVar.n(i4);
            if (n != null) {
                n.h(y70.s(o), z2);
                return;
            }
            if (noVar.k) {
                return;
            }
            if (i4 <= noVar.i) {
                return;
            }
            if (i4 % 2 == noVar.j % 2) {
                return;
            }
            uo uoVar = new uo(i4, noVar, false, z2, y70.s(o));
            noVar.i = i4;
            noVar.g.put(Integer.valueOf(i4), uoVar);
            noVar.l.e().c(new go(noVar.h + '[' + i4 + "] onStream", noVar, uoVar, i6), 0L);
        }
    }

    public final void q(io ioVar, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            o8.x("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i3 & 8) != 0) {
            byte readByte = this.f.readByte();
            byte[] bArr = y70.a;
            i5 = readByte & 255;
        } else {
            i5 = 0;
        }
        int readInt = this.f.readInt() & Integer.MAX_VALUE;
        List o = o(vw.V(i2 - 4, i3, i5), i5, i3, i4);
        no noVar = ioVar.g;
        synchronized (noVar) {
            if (noVar.D.contains(Integer.valueOf(readInt))) {
                noVar.s(readInt, 2);
                return;
            }
            noVar.D.add(Integer.valueOf(readInt));
            noVar.n.c(new ko(noVar.h + '[' + readInt + "] onRequest", noVar, readInt, o), 0L);
        }
    }
}
