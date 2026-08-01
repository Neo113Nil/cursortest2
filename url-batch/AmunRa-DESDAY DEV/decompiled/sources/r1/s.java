package r1;

import X.V;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0285e;

/* loaded from: classes.dex */
public final class s implements Closeable {
    public static final Logger d;

    /* renamed from: a, reason: collision with root package name */
    public final x1.p f3605a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3606b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3607c;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        Z0.d.d(logger, "getLogger(Http2::class.java.name)");
        d = logger;
    }

    public s(x1.p pVar) {
        Z0.d.e(pVar, "source");
        this.f3605a = pVar;
        r rVar = new r(pVar);
        this.f3606b = rVar;
        this.f3607c = new c(rVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3605a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0241, code lost:
    
        throw new java.io.IOException(X.V.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(boolean z2, k kVar) {
        int i;
        int i2;
        Object[] array;
        Z0.d.e(kVar, "handler");
        int i3 = 0;
        try {
            this.f3605a.q(9L);
            int r2 = l1.b.r(this.f3605a);
            if (r2 > 16384) {
                throw new IOException(V.d("FRAME_SIZE_ERROR: ", r2));
            }
            int i4 = this.f3605a.i() & 255;
            byte i5 = this.f3605a.i();
            int i6 = i5 & 255;
            int l2 = this.f3605a.l();
            int i7 = Integer.MAX_VALUE & l2;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i7, r2, i4, i6));
            }
            if (z2 && i4 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f3551b;
                sb.append(i4 < strArr.length ? strArr[i4] : l1.b.g("0x%02x", Integer.valueOf(i4)));
                throw new IOException(sb.toString());
            }
            switch (i4) {
                case 0:
                    h(kVar, r2, i6, i7);
                    return true;
                case 1:
                    j(kVar, r2, i6, i7);
                    return true;
                case 2:
                    if (r2 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + r2 + " != 5");
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    x1.p pVar = this.f3605a;
                    pVar.l();
                    pVar.i();
                    return true;
                case 3:
                    if (r2 != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + r2 + " != 4");
                    }
                    if (i7 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int l3 = this.f3605a.l();
                    int[] b2 = AbstractC0285e.b(14);
                    int length = b2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            i = b2[i8];
                            if (AbstractC0285e.a(i) != l3) {
                                i8++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(V.d("TYPE_RST_STREAM unexpected error code: ", l3));
                    }
                    o oVar = kVar.f3561b;
                    oVar.getClass();
                    if (i7 != 0 && (l2 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        oVar.i.c(new j(oVar.f3574c + '[' + i7 + "] onReset", oVar, i7, i, 1), 0L);
                    } else {
                        w i9 = oVar.i(i7);
                        if (i9 != null) {
                            i9.j(i);
                        }
                    }
                    return true;
                case 4:
                    if (i7 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i5 & 1) != 0) {
                        if (r2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (r2 % 6 != 0) {
                            throw new IOException(V.d("TYPE_SETTINGS length % 6 != 0: ", r2));
                        }
                        H.j jVar = new H.j();
                        d1.a g02 = s1.l.g0(s1.l.i0(0, r2), 6);
                        int i10 = g02.f1982a;
                        int i11 = g02.f1983b;
                        int i12 = g02.f1984c;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            while (true) {
                                x1.p pVar2 = this.f3605a;
                                short n2 = pVar2.n();
                                byte[] bArr = l1.b.f3252a;
                                int i13 = n2 & 65535;
                                int l4 = pVar2.l();
                                if (i13 != 2) {
                                    if (i13 == 3) {
                                        i13 = 4;
                                    } else if (i13 != 4) {
                                        if (i13 == 5 && (l4 < 16384 || l4 > 16777215)) {
                                        }
                                    } else {
                                        if (l4 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i13 = 7;
                                    }
                                } else if (l4 != 0 && l4 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                jVar.f(i13, l4);
                                if (i10 != i11) {
                                    i10 += i12;
                                }
                            }
                        }
                        o oVar2 = kVar.f3561b;
                        oVar2.h.c(new i(oVar2.f3574c + " applyAndAckSettings", kVar, jVar, 2), 0L);
                    }
                    return true;
                case 5:
                    k(kVar, r2, i6, i7);
                    return true;
                case 6:
                    if (r2 != 8) {
                        throw new IOException(V.d("TYPE_PING length != 8: ", r2));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int l5 = this.f3605a.l();
                    int l6 = this.f3605a.l();
                    if ((i5 & 1) != 0) {
                        o oVar3 = kVar.f3561b;
                        synchronized (oVar3) {
                            try {
                                if (l5 == 1) {
                                    oVar3.f3580l++;
                                } else if (l5 == 2) {
                                    oVar3.f3582n++;
                                } else if (l5 == 3) {
                                    oVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        kVar.f3561b.h.c(new j(kVar.f3561b.f3574c + " ping", kVar.f3561b, l5, l6, 0), 0L);
                    }
                    return true;
                case 7:
                    if (r2 < 8) {
                        throw new IOException(V.d("TYPE_GOAWAY length < 8: ", r2));
                    }
                    if (i7 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int l7 = this.f3605a.l();
                    int l8 = this.f3605a.l();
                    int i14 = r2 - 8;
                    int[] b3 = AbstractC0285e.b(14);
                    int length2 = b3.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            i2 = b3[i15];
                            if (AbstractC0285e.a(i2) != l8) {
                                i15++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(V.d("TYPE_GOAWAY unexpected error code: ", l8));
                    }
                    x1.i iVar = x1.i.d;
                    if (i14 > 0) {
                        iVar = this.f3605a.j(i14);
                    }
                    Z0.d.e(iVar, "debugData");
                    iVar.a();
                    o oVar4 = kVar.f3561b;
                    synchronized (oVar4) {
                        array = oVar4.f3573b.values().toArray(new w[0]);
                        oVar4.f3576f = true;
                    }
                    w[] wVarArr = (w[]) array;
                    int length3 = wVarArr.length;
                    while (i3 < length3) {
                        w wVar = wVarArr[i3];
                        if (wVar.f3617a > l7 && wVar.g()) {
                            wVar.j(8);
                            kVar.f3561b.i(wVar.f3617a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    if (r2 != 4) {
                        throw new IOException(V.d("TYPE_WINDOW_UPDATE length !=4: ", r2));
                    }
                    long l9 = this.f3605a.l() & 2147483647L;
                    if (l9 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i7 == 0) {
                        o oVar5 = kVar.f3561b;
                        synchronized (oVar5) {
                            oVar5.f3589u += l9;
                            oVar5.notifyAll();
                        }
                    } else {
                        w h = kVar.f3561b.h(i7);
                        if (h != null) {
                            synchronized (h) {
                                h.f3621f += l9;
                                if (l9 > 0) {
                                    h.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f3605a.r(r2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void h(k kVar, int i, int i2, int i3) {
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
            byte i6 = this.f3605a.i();
            byte[] bArr = l1.b.f3252a;
            i5 = i6 & 255;
            i4 = i;
        } else {
            i4 = i;
            i5 = 0;
        }
        int a2 = q.a(i4, i2, i5);
        x1.p pVar = this.f3605a;
        kVar.getClass();
        Z0.d.e(pVar, "source");
        kVar.f3561b.getClass();
        long j2 = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            o oVar = kVar.f3561b;
            oVar.getClass();
            x1.f fVar = new x1.f();
            long j3 = a2;
            pVar.q(j3);
            pVar.b(fVar, j3);
            oVar.i.c(new l(oVar.f3574c + '[' + i3 + "] onData", oVar, i3, fVar, a2, z4), 0L);
        } else {
            w h = kVar.f3561b.h(i3);
            if (h == null) {
                kVar.f3561b.m(i3, 2);
                long j4 = a2;
                kVar.f3561b.k(j4);
                pVar.r(j4);
            } else {
                byte[] bArr2 = l1.b.f3252a;
                u uVar = h.i;
                long j5 = a2;
                uVar.getClass();
                long j6 = j5;
                while (true) {
                    if (j6 <= j2) {
                        wVar = h;
                        uVar.f(j5);
                        break;
                    }
                    synchronized (uVar.f3615f) {
                        z2 = uVar.f3612b;
                        wVar = h;
                        z3 = uVar.d.f4236b + j6 > uVar.f3611a;
                    }
                    if (z3) {
                        pVar.r(j6);
                        uVar.f3615f.e(4);
                        break;
                    }
                    if (z2) {
                        pVar.r(j6);
                        break;
                    }
                    long b2 = pVar.b(uVar.f3613c, j6);
                    if (b2 == -1) {
                        throw new EOFException();
                    }
                    j6 -= b2;
                    w wVar2 = uVar.f3615f;
                    synchronized (wVar2) {
                        try {
                            if (uVar.f3614e) {
                                x1.f fVar2 = uVar.f3613c;
                                fVar2.o(fVar2.f4236b);
                                j2 = 0;
                            } else {
                                x1.f fVar3 = uVar.d;
                                j2 = 0;
                                boolean z5 = fVar3.f4236b == 0;
                                fVar3.t(uVar.f3613c);
                                if (z5) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    h = wVar;
                }
                if (z4) {
                    wVar.i(l1.b.f3253b, true);
                }
            }
        }
        this.f3605a.r(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f3536a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List i(int i, int i2, int i3, int i4) {
        int e2;
        r rVar = this.f3606b;
        rVar.f3603e = i;
        rVar.f3601b = i;
        rVar.f3604f = i2;
        rVar.f3602c = i3;
        rVar.d = i4;
        while (true) {
            c cVar = this.f3607c;
            x1.p pVar = cVar.f3538c;
            boolean f2 = pVar.f();
            ArrayList arrayList = cVar.f3537b;
            if (f2) {
                List q02 = R0.h.q0(arrayList);
                arrayList.clear();
                return q02;
            }
            byte i5 = pVar.i();
            byte[] bArr = l1.b.f3252a;
            int i6 = i5 & 255;
            if (i6 == 128) {
                throw new IOException("index == 0");
            }
            if ((i5 & 128) == 128) {
                e2 = cVar.e(i6, 127);
                int i7 = e2 - 1;
                if (i7 >= 0) {
                    C0291b[] c0291bArr = e.f3548a;
                    if (i7 <= c0291bArr.length - 1) {
                        arrayList.add(c0291bArr[i7]);
                    }
                }
                int length = cVar.f3539e + 1 + (i7 - e.f3548a.length);
                if (length < 0) {
                    break;
                }
                C0291b[] c0291bArr2 = cVar.d;
                if (length >= c0291bArr2.length) {
                    break;
                }
                C0291b c0291b = c0291bArr2[length];
                Z0.d.b(c0291b);
                arrayList.add(c0291b);
            } else if (i6 == 64) {
                C0291b[] c0291bArr3 = e.f3548a;
                x1.i d2 = cVar.d();
                e.a(d2);
                cVar.c(new C0291b(d2, cVar.d()));
            } else if ((i5 & 64) == 64) {
                cVar.c(new C0291b(cVar.b(cVar.e(i6, 63) - 1), cVar.d()));
            } else if ((i5 & 32) == 32) {
                int e3 = cVar.e(i6, 31);
                cVar.f3536a = e3;
                if (e3 < 0 || e3 > 4096) {
                    break;
                }
                int i8 = cVar.f3541g;
                if (e3 < i8) {
                    if (e3 == 0) {
                        C0291b[] c0291bArr4 = cVar.d;
                        R0.g.q0(c0291bArr4, 0, c0291bArr4.length);
                        cVar.f3539e = cVar.d.length - 1;
                        cVar.f3540f = 0;
                        cVar.f3541g = 0;
                    } else {
                        cVar.a(i8 - e3);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                C0291b[] c0291bArr5 = e.f3548a;
                x1.i d3 = cVar.d();
                e.a(d3);
                arrayList.add(new C0291b(d3, cVar.d()));
            } else {
                arrayList.add(new C0291b(cVar.b(cVar.e(i6, 15) - 1), cVar.d()));
            }
        }
        throw new IOException(V.d("Header index too large ", e2));
    }

    public final void j(k kVar, int i, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte i6 = this.f3605a.i();
            byte[] bArr = l1.b.f3252a;
            i4 = i6 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            x1.p pVar = this.f3605a;
            pVar.l();
            pVar.i();
            byte[] bArr2 = l1.b.f3252a;
            kVar.getClass();
            i -= 5;
        }
        List i7 = i(q.a(i, i2, i4), i4, i2, i3);
        kVar.getClass();
        kVar.f3561b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            o oVar = kVar.f3561b;
            oVar.getClass();
            oVar.i.c(new m(oVar.f3574c + '[' + i3 + "] onHeaders", oVar, i3, i7, z3), 0L);
            return;
        }
        o oVar2 = kVar.f3561b;
        synchronized (oVar2) {
            w h = oVar2.h(i3);
            if (h != null) {
                h.i(l1.b.t(i7), z3);
                return;
            }
            if (oVar2.f3576f) {
                return;
            }
            if (i3 <= oVar2.d) {
                return;
            }
            if (i3 % 2 == oVar2.f3575e % 2) {
                return;
            }
            w wVar = new w(i3, oVar2, false, z3, l1.b.t(i7));
            oVar2.d = i3;
            oVar2.f3573b.put(Integer.valueOf(i3), wVar);
            oVar2.f3577g.e().c(new i(oVar2.f3574c + '[' + i3 + "] onStream", oVar2, wVar, i5), 0L);
        }
    }

    public final void k(k kVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte i5 = this.f3605a.i();
            byte[] bArr = l1.b.f3252a;
            i4 = i5 & 255;
        } else {
            i4 = 0;
        }
        int l2 = this.f3605a.l() & Integer.MAX_VALUE;
        List i6 = i(q.a(i - 4, i2, i4), i4, i2, i3);
        kVar.getClass();
        o oVar = kVar.f3561b;
        oVar.getClass();
        synchronized (oVar) {
            if (oVar.f3593y.contains(Integer.valueOf(l2))) {
                oVar.m(l2, 2);
                return;
            }
            oVar.f3593y.add(Integer.valueOf(l2));
            oVar.i.c(new m(oVar.f3574c + '[' + l2 + "] onRequest", oVar, l2, i6), 0L);
        }
    }
}
