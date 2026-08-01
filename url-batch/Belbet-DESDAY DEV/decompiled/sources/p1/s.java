package p1;

import X.V;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0290e;

/* loaded from: classes.dex */
public final class s implements Closeable {
    public static final Logger d;

    /* renamed from: a, reason: collision with root package name */
    public final v1.p f3478a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3479b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3480c;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        X0.d.d(logger, "getLogger(Http2::class.java.name)");
        d = logger;
    }

    public s(v1.p pVar) {
        X0.d.e(pVar, "source");
        this.f3478a = pVar;
        r rVar = new r(pVar);
        this.f3479b = rVar;
        this.f3480c = new c(rVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3478a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0241, code lost:
    
        throw new java.io.IOException(X.V.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z2, k kVar) {
        int i;
        int i2;
        Object[] array;
        X0.d.e(kVar, "handler");
        int i3 = 0;
        try {
            this.f3478a.o(9L);
            int q2 = j1.b.q(this.f3478a);
            if (q2 > 16384) {
                throw new IOException(V.d("FRAME_SIZE_ERROR: ", q2));
            }
            int g2 = this.f3478a.g() & 255;
            byte g3 = this.f3478a.g();
            int i4 = g3 & 255;
            int j2 = this.f3478a.j();
            int i5 = Integer.MAX_VALUE & j2;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i5, q2, g2, i4));
            }
            if (z2 && g2 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f3424b;
                sb.append(g2 < strArr.length ? strArr[g2] : j1.b.g("0x%02x", Integer.valueOf(g2)));
                throw new IOException(sb.toString());
            }
            switch (g2) {
                case 0:
                    f(kVar, q2, i4, i5);
                    return true;
                case 1:
                    h(kVar, q2, i4, i5);
                    return true;
                case 2:
                    if (q2 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + q2 + " != 5");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    v1.p pVar = this.f3478a;
                    pVar.j();
                    pVar.g();
                    return true;
                case 3:
                    if (q2 != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + q2 + " != 4");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int j3 = this.f3478a.j();
                    int[] b2 = AbstractC0290e.b(14);
                    int length = b2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i = b2[i6];
                            if (AbstractC0290e.a(i) != j3) {
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(V.d("TYPE_RST_STREAM unexpected error code: ", j3));
                    }
                    o oVar = kVar.f3434b;
                    oVar.getClass();
                    if (i5 != 0 && (j2 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        oVar.i.c(new j(oVar.f3447c + '[' + i5 + "] onReset", oVar, i5, i, 1), 0L);
                    } else {
                        w g4 = oVar.g(i5);
                        if (g4 != null) {
                            g4.j(i);
                        }
                    }
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((g3 & 1) != 0) {
                        if (q2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (q2 % 6 != 0) {
                            throw new IOException(V.d("TYPE_SETTINGS length % 6 != 0: ", q2));
                        }
                        H.j jVar = new H.j();
                        b1.a t02 = q1.d.t0(q1.d.u0(0, q2), 6);
                        int i7 = t02.f1505a;
                        int i8 = t02.f1506b;
                        int i9 = t02.f1507c;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                v1.p pVar2 = this.f3478a;
                                short l2 = pVar2.l();
                                byte[] bArr = j1.b.f2604a;
                                int i10 = l2 & 65535;
                                int j4 = pVar2.j();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (j4 < 16384 || j4 > 16777215)) {
                                        }
                                    } else {
                                        if (j4 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (j4 != 0 && j4 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                jVar.f(i10, j4);
                                if (i7 != i8) {
                                    i7 += i9;
                                }
                            }
                        }
                        o oVar2 = kVar.f3434b;
                        oVar2.h.c(new i(oVar2.f3447c + " applyAndAckSettings", kVar, jVar, 2), 0L);
                    }
                    return true;
                case 5:
                    i(kVar, q2, i4, i5);
                    return true;
                case 6:
                    if (q2 != 8) {
                        throw new IOException(V.d("TYPE_PING length != 8: ", q2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int j5 = this.f3478a.j();
                    int j6 = this.f3478a.j();
                    if ((g3 & 1) != 0) {
                        o oVar3 = kVar.f3434b;
                        synchronized (oVar3) {
                            try {
                                if (j5 == 1) {
                                    oVar3.f3453l++;
                                } else if (j5 == 2) {
                                    oVar3.f3455n++;
                                } else if (j5 == 3) {
                                    oVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        kVar.f3434b.h.c(new j(kVar.f3434b.f3447c + " ping", kVar.f3434b, j5, j6, 0), 0L);
                    }
                    return true;
                case 7:
                    if (q2 < 8) {
                        throw new IOException(V.d("TYPE_GOAWAY length < 8: ", q2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int j7 = this.f3478a.j();
                    int j8 = this.f3478a.j();
                    int i11 = q2 - 8;
                    int[] b3 = AbstractC0290e.b(14);
                    int length2 = b3.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            i2 = b3[i12];
                            if (AbstractC0290e.a(i2) != j8) {
                                i12++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(V.d("TYPE_GOAWAY unexpected error code: ", j8));
                    }
                    v1.i iVar = v1.i.d;
                    if (i11 > 0) {
                        iVar = this.f3478a.h(i11);
                    }
                    X0.d.e(iVar, "debugData");
                    iVar.a();
                    o oVar4 = kVar.f3434b;
                    synchronized (oVar4) {
                        array = oVar4.f3446b.values().toArray(new w[0]);
                        oVar4.f3449f = true;
                    }
                    w[] wVarArr = (w[]) array;
                    int length3 = wVarArr.length;
                    while (i3 < length3) {
                        w wVar = wVarArr[i3];
                        if (wVar.f3490a > j7 && wVar.g()) {
                            wVar.j(8);
                            kVar.f3434b.g(wVar.f3490a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    if (q2 != 4) {
                        throw new IOException(V.d("TYPE_WINDOW_UPDATE length !=4: ", q2));
                    }
                    long j9 = this.f3478a.j() & 2147483647L;
                    if (j9 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        o oVar5 = kVar.f3434b;
                        synchronized (oVar5) {
                            oVar5.f3462u += j9;
                            oVar5.notifyAll();
                        }
                    } else {
                        w f2 = kVar.f3434b.f(i5);
                        if (f2 != null) {
                            synchronized (f2) {
                                f2.f3494f += j9;
                                if (j9 > 0) {
                                    f2.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f3478a.p(q2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void f(k kVar, int i, int i2, int i3) {
        int i4;
        int i5;
        w wVar;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte g2 = this.f3478a.g();
            byte[] bArr = j1.b.f2604a;
            i5 = g2 & 255;
            i4 = i;
        } else {
            i4 = i;
            i5 = 0;
        }
        int a2 = q.a(i4, i2, i5);
        v1.p pVar = this.f3478a;
        kVar.getClass();
        X0.d.e(pVar, "source");
        kVar.f3434b.getClass();
        long j2 = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            o oVar = kVar.f3434b;
            oVar.getClass();
            v1.f fVar = new v1.f();
            long j3 = a2;
            pVar.o(j3);
            pVar.b(fVar, j3);
            oVar.i.c(new l(oVar.f3447c + '[' + i3 + "] onData", oVar, i3, fVar, a2, z4), 0L);
        } else {
            w f2 = kVar.f3434b.f(i3);
            if (f2 == null) {
                kVar.f3434b.k(i3, 2);
                long j4 = a2;
                kVar.f3434b.i(j4);
                pVar.p(j4);
            } else {
                byte[] bArr2 = j1.b.f2604a;
                u uVar = f2.i;
                long j5 = a2;
                uVar.getClass();
                long j6 = j5;
                while (true) {
                    if (j6 <= j2) {
                        wVar = f2;
                        uVar.e(j5);
                        break;
                    }
                    synchronized (uVar.f3488f) {
                        z2 = uVar.f3485b;
                        wVar = f2;
                        z3 = uVar.d.f4074b + j6 > uVar.f3484a;
                    }
                    if (z3) {
                        pVar.p(j6);
                        uVar.f3488f.e(4);
                        break;
                    }
                    if (z2) {
                        pVar.p(j6);
                        break;
                    }
                    long b2 = pVar.b(uVar.f3486c, j6);
                    if (b2 == -1) {
                        throw new EOFException();
                    }
                    j6 -= b2;
                    w wVar2 = uVar.f3488f;
                    synchronized (wVar2) {
                        try {
                            if (uVar.f3487e) {
                                v1.f fVar2 = uVar.f3486c;
                                fVar2.m(fVar2.f4074b);
                                j2 = 0;
                            } else {
                                v1.f fVar3 = uVar.d;
                                j2 = 0;
                                boolean z5 = fVar3.f4074b == 0;
                                fVar3.r(uVar.f3486c);
                                if (z5) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    f2 = wVar;
                }
                if (z4) {
                    wVar.i(j1.b.f2605b, true);
                }
            }
        }
        this.f3478a.p(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f3409a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g(int i, int i2, int i3, int i4) {
        int e2;
        r rVar = this.f3479b;
        rVar.f3476e = i;
        rVar.f3474b = i;
        rVar.f3477f = i2;
        rVar.f3475c = i3;
        rVar.d = i4;
        while (true) {
            c cVar = this.f3480c;
            v1.p pVar = cVar.f3411c;
            boolean e3 = pVar.e();
            ArrayList arrayList = cVar.f3410b;
            if (e3) {
                List A02 = Q0.h.A0(arrayList);
                arrayList.clear();
                return A02;
            }
            byte g2 = pVar.g();
            byte[] bArr = j1.b.f2604a;
            int i5 = g2 & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((g2 & 128) == 128) {
                e2 = cVar.e(i5, 127);
                int i6 = e2 - 1;
                if (i6 >= 0) {
                    C0285b[] c0285bArr = e.f3421a;
                    if (i6 <= c0285bArr.length - 1) {
                        arrayList.add(c0285bArr[i6]);
                    }
                }
                int length = cVar.f3412e + 1 + (i6 - e.f3421a.length);
                if (length < 0) {
                    break;
                }
                C0285b[] c0285bArr2 = cVar.d;
                if (length >= c0285bArr2.length) {
                    break;
                }
                C0285b c0285b = c0285bArr2[length];
                X0.d.b(c0285b);
                arrayList.add(c0285b);
            } else if (i5 == 64) {
                C0285b[] c0285bArr3 = e.f3421a;
                v1.i d2 = cVar.d();
                e.a(d2);
                cVar.c(new C0285b(d2, cVar.d()));
            } else if ((g2 & 64) == 64) {
                cVar.c(new C0285b(cVar.b(cVar.e(i5, 63) - 1), cVar.d()));
            } else if ((g2 & 32) == 32) {
                int e4 = cVar.e(i5, 31);
                cVar.f3409a = e4;
                if (e4 < 0 || e4 > 4096) {
                    break;
                }
                int i7 = cVar.f3414g;
                if (e4 < i7) {
                    if (e4 == 0) {
                        C0285b[] c0285bArr4 = cVar.d;
                        Q0.g.g0(c0285bArr4, 0, c0285bArr4.length);
                        cVar.f3412e = cVar.d.length - 1;
                        cVar.f3413f = 0;
                        cVar.f3414g = 0;
                    } else {
                        cVar.a(i7 - e4);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C0285b[] c0285bArr5 = e.f3421a;
                v1.i d3 = cVar.d();
                e.a(d3);
                arrayList.add(new C0285b(d3, cVar.d()));
            } else {
                arrayList.add(new C0285b(cVar.b(cVar.e(i5, 15) - 1), cVar.d()));
            }
        }
        throw new IOException(V.d("Header index too large ", e2));
    }

    public final void h(k kVar, int i, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte g2 = this.f3478a.g();
            byte[] bArr = j1.b.f2604a;
            i4 = g2 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            v1.p pVar = this.f3478a;
            pVar.j();
            pVar.g();
            byte[] bArr2 = j1.b.f2604a;
            kVar.getClass();
            i -= 5;
        }
        List g3 = g(q.a(i, i2, i4), i4, i2, i3);
        kVar.getClass();
        kVar.f3434b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            o oVar = kVar.f3434b;
            oVar.getClass();
            oVar.i.c(new m(oVar.f3447c + '[' + i3 + "] onHeaders", oVar, i3, g3, z3), 0L);
            return;
        }
        o oVar2 = kVar.f3434b;
        synchronized (oVar2) {
            w f2 = oVar2.f(i3);
            if (f2 != null) {
                f2.i(j1.b.s(g3), z3);
                return;
            }
            if (oVar2.f3449f) {
                return;
            }
            if (i3 <= oVar2.d) {
                return;
            }
            if (i3 % 2 == oVar2.f3448e % 2) {
                return;
            }
            w wVar = new w(i3, oVar2, false, z3, j1.b.s(g3));
            oVar2.d = i3;
            oVar2.f3446b.put(Integer.valueOf(i3), wVar);
            oVar2.f3450g.e().c(new i(oVar2.f3447c + '[' + i3 + "] onStream", oVar2, wVar, i5), 0L);
        }
    }

    public final void i(k kVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte g2 = this.f3478a.g();
            byte[] bArr = j1.b.f2604a;
            i4 = g2 & 255;
        } else {
            i4 = 0;
        }
        int j2 = this.f3478a.j() & Integer.MAX_VALUE;
        List g3 = g(q.a(i - 4, i2, i4), i4, i2, i3);
        kVar.getClass();
        o oVar = kVar.f3434b;
        oVar.getClass();
        synchronized (oVar) {
            if (oVar.f3466y.contains(Integer.valueOf(j2))) {
                oVar.k(j2, 2);
                return;
            }
            oVar.f3466y.add(Integer.valueOf(j2));
            oVar.i.c(new m(oVar.f3447c + '[' + j2 + "] onRequest", oVar, j2, g3), 0L);
        }
    }
}
