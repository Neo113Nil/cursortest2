package H2;

import N2.C0150f;
import N2.C0153i;
import e2.AbstractC0381e;
import e2.C0378b;
import h1.C0438i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f2020g;

    /* renamed from: d, reason: collision with root package name */
    public final N2.z f2021d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2022e;

    /* renamed from: f, reason: collision with root package name */
    public final C0082d f2023f;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Z1.i.e(logger, "getLogger(Http2::class.java.name)");
        f2020g = logger;
    }

    public t(N2.z zVar) {
        Z1.i.f(zVar, "source");
        this.f2021d = zVar;
        s sVar = new s(zVar);
        this.f2022e = sVar;
        this.f2023f = new C0082d(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0254, code lost:
    
        throw new java.io.IOException(H2.AbstractC0080b.h("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z3, H1.q qVar) {
        int i3;
        int i4;
        Object[] array;
        Z1.i.f(qVar, "handler");
        int i5 = 0;
        try {
            this.f2021d.z(9L);
            int s3 = B2.c.s(this.f2021d);
            if (s3 > 16384) {
                throw new IOException(AbstractC0080b.h("FRAME_SIZE_ERROR: ", s3));
            }
            int e3 = this.f2021d.e() & 255;
            byte e4 = this.f2021d.e();
            int i6 = e4 & 255;
            int j3 = this.f2021d.j();
            int i7 = Integer.MAX_VALUE & j3;
            Logger logger = f2020g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i7, s3, e3, i6));
            }
            if (z3 && e3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f1956b;
                sb.append(e3 < strArr.length ? strArr[e3] : B2.c.h("0x%02x", Integer.valueOf(e3)));
                throw new IOException(sb.toString());
            }
            switch (e3) {
                case 0:
                    b(qVar, s3, i6, i7);
                    return true;
                case 1:
                    h(qVar, s3, i6, i7);
                    return true;
                case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (s3 != 5) {
                        throw new IOException(AbstractC0080b.i("TYPE_PRIORITY length: ", s3, " != 5"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    N2.z zVar = this.f2021d;
                    zVar.j();
                    zVar.e();
                    return true;
                case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (s3 != 4) {
                        throw new IOException(AbstractC0080b.i("TYPE_RST_STREAM length: ", s3, " != 4"));
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int j4 = this.f2021d.j();
                    int[] b2 = AbstractC0600j.b(14);
                    int length = b2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            i3 = b2[i8];
                            if (AbstractC0600j.a(i3) != j4) {
                                i8++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i3 == 0) {
                        throw new IOException(AbstractC0080b.h("TYPE_RST_STREAM unexpected error code: ", j4));
                    }
                    p pVar = (p) qVar.f1896f;
                    pVar.getClass();
                    if (i7 != 0 && (j3 & 1) == 0) {
                        i5 = 1;
                    }
                    if (i5 != 0) {
                        pVar.f1992l.c(new l(pVar.f1986f + '[' + i7 + "] onReset", pVar, i7, i3, 1), 0L);
                    } else {
                        x e5 = pVar.e(i7);
                        if (e5 != null) {
                            e5.j(i3);
                        }
                    }
                    return true;
                case C0438i.LONG_FIELD_NUMBER /* 4 */:
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((e4 & 1) != 0) {
                        if (s3 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (s3 % 6 != 0) {
                            throw new IOException(AbstractC0080b.h("TYPE_SETTINGS length % 6 != 0: ", s3));
                        }
                        C c3 = new C();
                        C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, s3), 6);
                        int i9 = L2.f4768d;
                        int i10 = L2.f4769e;
                        int i11 = L2.f4770f;
                        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                            while (true) {
                                N2.z zVar2 = this.f2021d;
                                short o3 = zVar2.o();
                                byte[] bArr = B2.c.f415a;
                                int i12 = o3 & 65535;
                                int j5 = zVar2.j();
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        i12 = 4;
                                    } else if (i12 != 4) {
                                        if (i12 == 5 && (j5 < 16384 || j5 > 16777215)) {
                                        }
                                    } else {
                                        if (j5 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i12 = 7;
                                    }
                                } else if (j5 != 0 && j5 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                c3.c(i12, j5);
                                if (i9 != i10) {
                                    i9 += i11;
                                }
                            }
                        }
                        p pVar2 = (p) qVar.f1896f;
                        pVar2.f1991k.c(new k(pVar2.f1986f + " applyAndAckSettings", qVar, c3, 2), 0L);
                    }
                    return true;
                case 5:
                    i(qVar, s3, i6, i7);
                    return true;
                case 6:
                    if (s3 != 8) {
                        throw new IOException(AbstractC0080b.h("TYPE_PING length != 8: ", s3));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int j6 = this.f2021d.j();
                    int j7 = this.f2021d.j();
                    if ((e4 & 1) != 0) {
                        p pVar3 = (p) qVar.f1896f;
                        synchronized (pVar3) {
                            try {
                                if (j6 == 1) {
                                    pVar3.f1995o++;
                                } else if (j6 == 2) {
                                    pVar3.f1996q++;
                                } else if (j6 == 3) {
                                    pVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        ((p) qVar.f1896f).f1991k.c(new l(((p) qVar.f1896f).f1986f + " ping", (p) qVar.f1896f, j6, j7, 0), 0L);
                    }
                    return true;
                case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (s3 < 8) {
                        throw new IOException(AbstractC0080b.h("TYPE_GOAWAY length < 8: ", s3));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int j8 = this.f2021d.j();
                    int j9 = this.f2021d.j();
                    int i13 = s3 - 8;
                    int[] b3 = AbstractC0600j.b(14);
                    int length2 = b3.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            i4 = b3[i14];
                            if (AbstractC0600j.a(i4) != j9) {
                                i14++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    if (i4 == 0) {
                        throw new IOException(AbstractC0080b.h("TYPE_GOAWAY unexpected error code: ", j9));
                    }
                    C0153i c0153i = C0153i.f2930g;
                    if (i13 > 0) {
                        c0153i = this.f2021d.h(i13);
                    }
                    Z1.i.f(c0153i, "debugData");
                    c0153i.b();
                    p pVar4 = (p) qVar.f1896f;
                    synchronized (pVar4) {
                        array = pVar4.f1985e.values().toArray(new x[0]);
                        pVar4.f1989i = true;
                    }
                    x[] xVarArr = (x[]) array;
                    int length3 = xVarArr.length;
                    while (i5 < length3) {
                        x xVar = xVarArr[i5];
                        if (xVar.f2035a > j8 && xVar.g()) {
                            xVar.j(8);
                            ((p) qVar.f1896f).e(xVar.f2035a);
                        }
                        i5++;
                    }
                    return true;
                case 8:
                    if (s3 != 4) {
                        throw new IOException(AbstractC0080b.h("TYPE_WINDOW_UPDATE length !=4: ", s3));
                    }
                    long j10 = this.f2021d.j() & 2147483647L;
                    if (j10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i7 == 0) {
                        p pVar5 = (p) qVar.f1896f;
                        synchronized (pVar5) {
                            pVar5.f2003x += j10;
                            pVar5.notifyAll();
                        }
                    } else {
                        x b4 = ((p) qVar.f1896f).b(i7);
                        if (b4 != null) {
                            synchronized (b4) {
                                b4.f2040f += j10;
                                if (j10 > 0) {
                                    b4.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f2021d.D(s3);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(H1.q qVar, int i3, int i4, int i5) {
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
            byte e3 = this.f2021d.e();
            byte[] bArr = B2.c.f415a;
            i7 = e3 & 255;
            i6 = i3;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int a3 = r.a(i6, i4, i7);
        N2.z zVar = this.f2021d;
        qVar.getClass();
        Z1.i.f(zVar, "source");
        ((p) qVar.f1896f).getClass();
        long j3 = 0;
        if (i5 != 0 && (i5 & 1) == 0) {
            p pVar = (p) qVar.f1896f;
            pVar.getClass();
            C0150f c0150f = new C0150f();
            long j4 = a3;
            zVar.z(j4);
            zVar.l(c0150f, j4);
            pVar.f1992l.c(new m(pVar.f1986f + '[' + i5 + "] onData", pVar, i5, c0150f, a3, z5), 0L);
        } else {
            x b2 = ((p) qVar.f1896f).b(i5);
            if (b2 == null) {
                ((p) qVar.f1896f).k(i5, 2);
                long j5 = a3;
                ((p) qVar.f1896f).i(j5);
                zVar.D(j5);
            } else {
                byte[] bArr2 = B2.c.f415a;
                v vVar = b2.f2043i;
                long j6 = a3;
                vVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= j3) {
                        xVar = b2;
                        byte[] bArr3 = B2.c.f415a;
                        vVar.f2033i.f2036b.i(j6);
                        break;
                    }
                    synchronized (vVar.f2033i) {
                        z3 = vVar.f2029e;
                        xVar = b2;
                        z4 = vVar.f2031g.f2929e + j7 > vVar.f2028d;
                    }
                    if (z4) {
                        zVar.D(j7);
                        vVar.f2033i.e(4);
                        break;
                    }
                    if (z3) {
                        zVar.D(j7);
                        break;
                    }
                    long l3 = zVar.l(vVar.f2030f, j7);
                    if (l3 == -1) {
                        throw new EOFException();
                    }
                    j7 -= l3;
                    x xVar2 = vVar.f2033i;
                    synchronized (xVar2) {
                        try {
                            if (vVar.f2032h) {
                                C0150f c0150f2 = vVar.f2030f;
                                c0150f2.x(c0150f2.f2929e);
                                j3 = 0;
                            } else {
                                C0150f c0150f3 = vVar.f2031g;
                                j3 = 0;
                                boolean z6 = c0150f3.f2929e == 0;
                                c0150f3.P(vVar.f2030f);
                                if (z6) {
                                    xVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    b2 = xVar;
                }
                if (z5) {
                    xVar.i(B2.c.f416b, true);
                }
            }
        }
        this.f2021d.D(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2021d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f1937a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List e(int i3, int i4, int i5, int i6) {
        int e3;
        s sVar = this.f2022e;
        sVar.f2018h = i3;
        sVar.f2015e = i3;
        sVar.f2019i = i4;
        sVar.f2016f = i5;
        sVar.f2017g = i6;
        while (true) {
            C0082d c0082d = this.f2023f;
            N2.z zVar = c0082d.f1939c;
            boolean a3 = zVar.a();
            ArrayList arrayList = c0082d.f1938b;
            if (a3) {
                List C02 = M1.l.C0(arrayList);
                arrayList.clear();
                return C02;
            }
            byte e4 = zVar.e();
            byte[] bArr = B2.c.f415a;
            int i7 = e4 & 255;
            if (i7 == 128) {
                throw new IOException("index == 0");
            }
            if ((e4 & 128) == 128) {
                e3 = c0082d.e(i7, 127);
                int i8 = e3 - 1;
                if (i8 >= 0) {
                    C0081c[] c0081cArr = f.f1953a;
                    if (i8 <= c0081cArr.length - 1) {
                        arrayList.add(c0081cArr[i8]);
                    }
                }
                int length = c0082d.f1941e + 1 + (i8 - f.f1953a.length);
                if (length < 0) {
                    break;
                }
                C0081c[] c0081cArr2 = c0082d.f1940d;
                if (length >= c0081cArr2.length) {
                    break;
                }
                C0081c c0081c = c0081cArr2[length];
                Z1.i.c(c0081c);
                arrayList.add(c0081c);
            } else if (i7 == 64) {
                C0081c[] c0081cArr3 = f.f1953a;
                C0153i d3 = c0082d.d();
                f.a(d3);
                c0082d.c(new C0081c(d3, c0082d.d()));
            } else if ((e4 & 64) == 64) {
                c0082d.c(new C0081c(c0082d.b(c0082d.e(i7, 63) - 1), c0082d.d()));
            } else if ((e4 & 32) == 32) {
                int e5 = c0082d.e(i7, 31);
                c0082d.f1937a = e5;
                if (e5 < 0 || e5 > 4096) {
                    break;
                }
                int i9 = c0082d.f1943g;
                if (e5 < i9) {
                    if (e5 == 0) {
                        M1.k.c0(r7, 0, c0082d.f1940d.length);
                        c0082d.f1941e = c0082d.f1940d.length - 1;
                        c0082d.f1942f = 0;
                        c0082d.f1943g = 0;
                    } else {
                        c0082d.a(i9 - e5);
                    }
                }
            } else if (i7 == 16 || i7 == 0) {
                C0081c[] c0081cArr4 = f.f1953a;
                C0153i d4 = c0082d.d();
                f.a(d4);
                arrayList.add(new C0081c(d4, c0082d.d()));
            } else {
                arrayList.add(new C0081c(c0082d.b(c0082d.e(i7, 15) - 1), c0082d.d()));
            }
        }
        throw new IOException(AbstractC0080b.h("Header index too large ", e3));
    }

    public final void h(H1.q qVar, int i3, int i4, int i5) {
        int i6;
        int i7 = 1;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = false;
        boolean z4 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte e3 = this.f2021d.e();
            byte[] bArr = B2.c.f415a;
            i6 = e3 & 255;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            N2.z zVar = this.f2021d;
            zVar.j();
            zVar.e();
            byte[] bArr2 = B2.c.f415a;
            qVar.getClass();
            i3 -= 5;
        }
        List e4 = e(r.a(i3, i4, i6), i6, i4, i5);
        qVar.getClass();
        ((p) qVar.f1896f).getClass();
        if (i5 != 0 && (i5 & 1) == 0) {
            z3 = true;
        }
        if (z3) {
            p pVar = (p) qVar.f1896f;
            pVar.getClass();
            pVar.f1992l.c(new n(pVar.f1986f + '[' + i5 + "] onHeaders", pVar, i5, e4, z4), 0L);
            return;
        }
        p pVar2 = (p) qVar.f1896f;
        synchronized (pVar2) {
            x b2 = pVar2.b(i5);
            if (b2 != null) {
                b2.i(B2.c.u(e4), z4);
                return;
            }
            if (pVar2.f1989i) {
                return;
            }
            if (i5 <= pVar2.f1987g) {
                return;
            }
            if (i5 % 2 == pVar2.f1988h % 2) {
                return;
            }
            x xVar = new x(i5, pVar2, false, z4, B2.c.u(e4));
            pVar2.f1987g = i5;
            pVar2.f1985e.put(Integer.valueOf(i5), xVar);
            pVar2.f1990j.e().c(new k(pVar2.f1986f + '[' + i5 + "] onStream", pVar2, xVar, i7), 0L);
        }
    }

    public final void i(H1.q qVar, int i3, int i4, int i5) {
        int i6;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte e3 = this.f2021d.e();
            byte[] bArr = B2.c.f415a;
            i6 = e3 & 255;
        } else {
            i6 = 0;
        }
        int j3 = this.f2021d.j() & Integer.MAX_VALUE;
        List e4 = e(r.a(i3 - 4, i4, i6), i6, i4, i5);
        qVar.getClass();
        p pVar = (p) qVar.f1896f;
        pVar.getClass();
        synchronized (pVar) {
            if (pVar.B.contains(Integer.valueOf(j3))) {
                pVar.k(j3, 2);
                return;
            }
            pVar.B.add(Integer.valueOf(j3));
            pVar.f1992l.c(new n(pVar.f1986f + '[' + j3 + "] onRequest", pVar, j3, e4), 0L);
        }
    }
}
