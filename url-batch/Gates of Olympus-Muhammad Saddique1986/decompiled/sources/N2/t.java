package N2;

import T2.C0231f;
import T2.C0234i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.C0570b;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f3677g;

    /* renamed from: d, reason: collision with root package name */
    public final T2.z f3678d;

    /* renamed from: e, reason: collision with root package name */
    public final s f3679e;

    /* renamed from: f, reason: collision with root package name */
    public final C0205c f3680f;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        f2.j.e(logger, "getLogger(Http2::class.java.name)");
        f3677g = logger;
    }

    public t(T2.z zVar) {
        f2.j.f(zVar, "source");
        this.f3678d = zVar;
        s sVar = new s(zVar);
        this.f3679e = sVar;
        this.f3680f = new C0205c(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0254, code lost:
    
        throw new java.io.IOException(A.k.h("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z3, l lVar) {
        int i3;
        int i4;
        Object[] array;
        f2.j.f(lVar, "handler");
        int i5 = 0;
        try {
            this.f3678d.w(9L);
            int s3 = H2.b.s(this.f3678d);
            if (s3 > 16384) {
                throw new IOException(A.k.h("FRAME_SIZE_ERROR: ", s3));
            }
            int d3 = this.f3678d.d() & 255;
            byte d4 = this.f3678d.d();
            int i6 = d4 & 255;
            int h3 = this.f3678d.h();
            int i7 = Integer.MAX_VALUE & h3;
            Logger logger = f3677g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i7, s3, d3, i6));
            }
            if (z3 && d3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f3608b;
                sb.append(d3 < strArr.length ? strArr[d3] : H2.b.h("0x%02x", Integer.valueOf(d3)));
                throw new IOException(sb.toString());
            }
            switch (d3) {
                case 0:
                    b(lVar, s3, i6, i7);
                    return true;
                case 1:
                    e(lVar, s3, i6, i7);
                    return true;
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (s3 != 5) {
                        throw new IOException(A.k.g(s3, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    T2.z zVar = this.f3678d;
                    zVar.h();
                    zVar.d();
                    return true;
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (s3 != 4) {
                        throw new IOException(A.k.g(s3, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int h4 = this.f3678d.h();
                    int[] c2 = AbstractC0625j.c(14);
                    int length = c2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            i3 = c2[i8];
                            if (AbstractC0625j.b(i3) != h4) {
                                i8++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i3 == 0) {
                        throw new IOException(A.k.h("TYPE_RST_STREAM unexpected error code: ", h4));
                    }
                    p pVar = (p) lVar.f3627f;
                    pVar.getClass();
                    if (i7 != 0 && (h3 & 1) == 0) {
                        i5 = 1;
                    }
                    if (i5 != 0) {
                        pVar.f3648l.c(new k(pVar.f3642f + '[' + i7 + "] onReset", pVar, i7, i3, 1), 0L);
                    } else {
                        x d5 = pVar.d(i7);
                        if (d5 != null) {
                            d5.j(i3);
                        }
                    }
                    return true;
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((d4 & 1) != 0) {
                        if (s3 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (s3 % 6 != 0) {
                            throw new IOException(A.k.h("TYPE_SETTINGS length % 6 != 0: ", s3));
                        }
                        C c3 = new C();
                        C0570b e02 = O2.d.e0(O2.d.g0(0, s3), 6);
                        int i9 = e02.f6419d;
                        int i10 = e02.f6420e;
                        int i11 = e02.f6421f;
                        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                            while (true) {
                                T2.z zVar2 = this.f3678d;
                                short q3 = zVar2.q();
                                byte[] bArr = H2.b.f2632a;
                                int i12 = q3 & 65535;
                                int h5 = zVar2.h();
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        i12 = 4;
                                    } else if (i12 != 4) {
                                        if (i12 == 5 && (h5 < 16384 || h5 > 16777215)) {
                                        }
                                    } else {
                                        if (h5 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i12 = 7;
                                    }
                                } else if (h5 != 0 && h5 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                c3.c(i12, h5);
                                if (i9 != i10) {
                                    i9 += i11;
                                }
                            }
                        }
                        p pVar2 = (p) lVar.f3627f;
                        pVar2.f3647k.c(new j(pVar2.f3642f + " applyAndAckSettings", lVar, c3, 2), 0L);
                    }
                    return true;
                case 5:
                    g(lVar, s3, i6, i7);
                    return true;
                case 6:
                    if (s3 != 8) {
                        throw new IOException(A.k.h("TYPE_PING length != 8: ", s3));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int h6 = this.f3678d.h();
                    int h7 = this.f3678d.h();
                    if ((d4 & 1) != 0) {
                        p pVar3 = (p) lVar.f3627f;
                        synchronized (pVar3) {
                            try {
                                if (h6 == 1) {
                                    pVar3.f3651o++;
                                } else if (h6 == 2) {
                                    pVar3.f3653q++;
                                } else if (h6 == 3) {
                                    pVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        ((p) lVar.f3627f).f3647k.c(new k(((p) lVar.f3627f).f3642f + " ping", (p) lVar.f3627f, h6, h7, 0), 0L);
                    }
                    return true;
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (s3 < 8) {
                        throw new IOException(A.k.h("TYPE_GOAWAY length < 8: ", s3));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int h8 = this.f3678d.h();
                    int h9 = this.f3678d.h();
                    int i13 = s3 - 8;
                    int[] c4 = AbstractC0625j.c(14);
                    int length2 = c4.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            i4 = c4[i14];
                            if (AbstractC0625j.b(i4) != h9) {
                                i14++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        throw new IOException(A.k.h("TYPE_GOAWAY unexpected error code: ", h9));
                    }
                    C0234i c0234i = C0234i.f4410g;
                    if (i13 > 0) {
                        c0234i = this.f3678d.e(i13);
                    }
                    f2.j.f(c0234i, "debugData");
                    c0234i.b();
                    p pVar4 = (p) lVar.f3627f;
                    synchronized (pVar4) {
                        array = pVar4.f3641e.values().toArray(new x[0]);
                        pVar4.f3645i = true;
                    }
                    x[] xVarArr = (x[]) array;
                    int length3 = xVarArr.length;
                    while (i5 < length3) {
                        x xVar = xVarArr[i5];
                        if (xVar.f3692a > h8 && xVar.g()) {
                            xVar.j(8);
                            ((p) lVar.f3627f).d(xVar.f3692a);
                        }
                        i5++;
                    }
                    return true;
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (s3 != 4) {
                        throw new IOException(A.k.h("TYPE_WINDOW_UPDATE length !=4: ", s3));
                    }
                    long h10 = this.f3678d.h() & 2147483647L;
                    if (h10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i7 == 0) {
                        p pVar5 = (p) lVar.f3627f;
                        synchronized (pVar5) {
                            pVar5.f3660x += h10;
                            pVar5.notifyAll();
                        }
                    } else {
                        x b3 = ((p) lVar.f3627f).b(i7);
                        if (b3 != null) {
                            synchronized (b3) {
                                b3.f3697f += h10;
                                if (h10 > 0) {
                                    b3.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f3678d.x(s3);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(l lVar, int i3, int i4, int i5) {
        int i6;
        int i7;
        x xVar;
        boolean z3;
        boolean z4;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i4 & 8) != 0) {
            byte d3 = this.f3678d.d();
            byte[] bArr = H2.b.f2632a;
            i7 = d3 & 255;
            i6 = i3;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int a3 = r.a(i6, i4, i7);
        T2.z zVar = this.f3678d;
        lVar.getClass();
        f2.j.f(zVar, "source");
        ((p) lVar.f3627f).getClass();
        long j3 = 0;
        if (i5 != 0 && (i5 & 1) == 0) {
            p pVar = (p) lVar.f3627f;
            pVar.getClass();
            C0231f c0231f = new C0231f();
            long j4 = a3;
            zVar.w(j4);
            zVar.f(c0231f, j4);
            pVar.f3648l.c(new m(pVar.f3642f + '[' + i5 + "] onData", pVar, i5, c0231f, a3, z5), 0L);
        } else {
            x b3 = ((p) lVar.f3627f).b(i5);
            if (b3 == null) {
                ((p) lVar.f3627f).l(i5, 2);
                long j5 = a3;
                ((p) lVar.f3627f).g(j5);
                zVar.x(j5);
            } else {
                byte[] bArr2 = H2.b.f2632a;
                v vVar = b3.f3700i;
                long j6 = a3;
                vVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= j3) {
                        xVar = b3;
                        byte[] bArr3 = H2.b.f2632a;
                        vVar.f3690i.f3693b.g(j6);
                        break;
                    }
                    synchronized (vVar.f3690i) {
                        z3 = vVar.f3686e;
                        xVar = b3;
                        z4 = vVar.f3688g.f4409e + j7 > vVar.f3685d;
                    }
                    if (z4) {
                        zVar.x(j7);
                        vVar.f3690i.e(4);
                        break;
                    }
                    if (z3) {
                        zVar.x(j7);
                        break;
                    }
                    long f3 = zVar.f(vVar.f3687f, j7);
                    if (f3 == -1) {
                        throw new EOFException();
                    }
                    j7 -= f3;
                    x xVar2 = vVar.f3690i;
                    synchronized (xVar2) {
                        try {
                            if (vVar.f3689h) {
                                C0231f c0231f2 = vVar.f3687f;
                                c0231f2.v(c0231f2.f4409e);
                                j3 = 0;
                            } else {
                                C0231f c0231f3 = vVar.f3688g;
                                j3 = 0;
                                boolean z6 = c0231f3.f4409e == 0;
                                c0231f3.D(vVar.f3687f);
                                if (z6) {
                                    xVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    b3 = xVar;
                }
                if (z5) {
                    xVar.i(H2.b.f2633b, true);
                }
            }
        }
        this.f3678d.x(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3678d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f3589a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(int i3, int i4, int i5, int i6) {
        int e3;
        s sVar = this.f3679e;
        sVar.f3675h = i3;
        sVar.f3672e = i3;
        sVar.f3676i = i4;
        sVar.f3673f = i5;
        sVar.f3674g = i6;
        while (true) {
            C0205c c0205c = this.f3680f;
            T2.z zVar = c0205c.f3591c;
            boolean a3 = zVar.a();
            ArrayList arrayList = c0205c.f3590b;
            if (a3) {
                List a12 = S1.l.a1(arrayList);
                arrayList.clear();
                return a12;
            }
            byte d3 = zVar.d();
            byte[] bArr = H2.b.f2632a;
            int i7 = d3 & 255;
            if (i7 == 128) {
                throw new IOException("index == 0");
            }
            if ((d3 & 128) == 128) {
                e3 = c0205c.e(i7, 127);
                int i8 = e3 - 1;
                if (i8 >= 0) {
                    C0204b[] c0204bArr = e.f3605a;
                    if (i8 <= c0204bArr.length - 1) {
                        arrayList.add(c0204bArr[i8]);
                    }
                }
                int length = c0205c.f3593e + 1 + (i8 - e.f3605a.length);
                if (length < 0) {
                    break;
                }
                C0204b[] c0204bArr2 = c0205c.f3592d;
                if (length >= c0204bArr2.length) {
                    break;
                }
                C0204b c0204b = c0204bArr2[length];
                f2.j.c(c0204b);
                arrayList.add(c0204b);
            } else if (i7 == 64) {
                C0204b[] c0204bArr3 = e.f3605a;
                C0234i d4 = c0205c.d();
                e.a(d4);
                c0205c.c(new C0204b(d4, c0205c.d()));
            } else if ((d3 & 64) == 64) {
                c0205c.c(new C0204b(c0205c.b(c0205c.e(i7, 63) - 1), c0205c.d()));
            } else if ((d3 & 32) == 32) {
                int e4 = c0205c.e(i7, 31);
                c0205c.f3589a = e4;
                if (e4 < 0 || e4 > 4096) {
                    break;
                }
                int i9 = c0205c.f3595g;
                if (e4 < i9) {
                    if (e4 == 0) {
                        S1.k.r0(r7, null, 0, c0205c.f3592d.length);
                        c0205c.f3593e = c0205c.f3592d.length - 1;
                        c0205c.f3594f = 0;
                        c0205c.f3595g = 0;
                    } else {
                        c0205c.a(i9 - e4);
                    }
                }
            } else if (i7 == 16 || i7 == 0) {
                C0204b[] c0204bArr4 = e.f3605a;
                C0234i d5 = c0205c.d();
                e.a(d5);
                arrayList.add(new C0204b(d5, c0205c.d()));
            } else {
                arrayList.add(new C0204b(c0205c.b(c0205c.e(i7, 15) - 1), c0205c.d()));
            }
        }
        throw new IOException(A.k.h("Header index too large ", e3));
    }

    public final void e(l lVar, int i3, int i4, int i5) {
        int i6;
        int i7 = 1;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = false;
        boolean z4 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte d3 = this.f3678d.d();
            byte[] bArr = H2.b.f2632a;
            i6 = d3 & 255;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            T2.z zVar = this.f3678d;
            zVar.h();
            zVar.d();
            byte[] bArr2 = H2.b.f2632a;
            lVar.getClass();
            i3 -= 5;
        }
        List d4 = d(r.a(i3, i4, i6), i6, i4, i5);
        lVar.getClass();
        ((p) lVar.f3627f).getClass();
        if (i5 != 0 && (i5 & 1) == 0) {
            z3 = true;
        }
        if (z3) {
            p pVar = (p) lVar.f3627f;
            pVar.getClass();
            pVar.f3648l.c(new n(pVar.f3642f + '[' + i5 + "] onHeaders", pVar, i5, d4, z4), 0L);
            return;
        }
        p pVar2 = (p) lVar.f3627f;
        synchronized (pVar2) {
            x b3 = pVar2.b(i5);
            if (b3 != null) {
                b3.i(H2.b.u(d4), z4);
                return;
            }
            if (pVar2.f3645i) {
                return;
            }
            if (i5 <= pVar2.f3643g) {
                return;
            }
            if (i5 % 2 == pVar2.f3644h % 2) {
                return;
            }
            x xVar = new x(i5, pVar2, false, z4, H2.b.u(d4));
            pVar2.f3643g = i5;
            pVar2.f3641e.put(Integer.valueOf(i5), xVar);
            pVar2.f3646j.e().c(new j(pVar2.f3642f + '[' + i5 + "] onStream", pVar2, xVar, i7), 0L);
        }
    }

    public final void g(l lVar, int i3, int i4, int i5) {
        int i6;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte d3 = this.f3678d.d();
            byte[] bArr = H2.b.f2632a;
            i6 = d3 & 255;
        } else {
            i6 = 0;
        }
        int h3 = this.f3678d.h() & Integer.MAX_VALUE;
        List d4 = d(r.a(i3 - 4, i4, i6), i6, i4, i5);
        lVar.getClass();
        p pVar = (p) lVar.f3627f;
        pVar.getClass();
        synchronized (pVar) {
            if (pVar.f3639B.contains(Integer.valueOf(h3))) {
                pVar.l(h3, 2);
                return;
            }
            pVar.f3639B.add(Integer.valueOf(h3));
            pVar.f3648l.c(new n(pVar.f3642f + '[' + h3 + "] onRequest", pVar, h3, d4), 0L);
        }
    }
}
