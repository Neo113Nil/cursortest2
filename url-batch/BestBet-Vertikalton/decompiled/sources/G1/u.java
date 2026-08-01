package G1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.AbstractC0309e;

/* loaded from: classes.dex */
public final class u implements Closeable {
    public static final Logger d;

    /* renamed from: a, reason: collision with root package name */
    public final M1.p f446a;

    /* renamed from: b, reason: collision with root package name */
    public final t f447b;

    /* renamed from: c, reason: collision with root package name */
    public final C0003d f448c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        k1.e.d(logger, "getLogger(Http2::class.java.name)");
        d = logger;
    }

    public u(M1.p pVar) {
        k1.e.e(pVar, "source");
        this.f446a = pVar;
        t tVar = new t(pVar);
        this.f447b = tVar;
        this.f448c = new C0003d(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0241, code lost:
    
        throw new java.io.IOException(G1.AbstractC0001b.f("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z2, m mVar) {
        int i;
        int i2;
        Object[] array;
        k1.e.e(mVar, "handler");
        int i3 = 0;
        try {
            this.f446a.w(9L);
            int r2 = A1.c.r(this.f446a);
            if (r2 > 16384) {
                throw new IOException(AbstractC0001b.f("FRAME_SIZE_ERROR: ", r2));
            }
            int j2 = this.f446a.j() & 255;
            byte j3 = this.f446a.j();
            int i4 = j3 & 255;
            int r3 = this.f446a.r();
            int i5 = Integer.MAX_VALUE & r3;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i5, r2, j2, i4));
            }
            if (z2 && j2 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f387b;
                sb.append(j2 < strArr.length ? strArr[j2] : A1.c.g("0x%02x", Integer.valueOf(j2)));
                throw new IOException(sb.toString());
            }
            switch (j2) {
                case 0:
                    d(mVar, r2, i4, i5);
                    return true;
                case 1:
                    k(mVar, r2, i4, i5);
                    return true;
                case 2:
                    if (r2 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + r2 + " != 5");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    M1.p pVar = this.f446a;
                    pVar.r();
                    pVar.j();
                    return true;
                case 3:
                    if (r2 != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + r2 + " != 4");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int r4 = this.f446a.r();
                    int[] b2 = AbstractC0309e.b(14);
                    int length = b2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i = b2[i6];
                            if (AbstractC0309e.a(i) != r4) {
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(AbstractC0001b.f("TYPE_RST_STREAM unexpected error code: ", r4));
                    }
                    q qVar = mVar.f402b;
                    qVar.getClass();
                    if (i5 != 0 && (r3 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        qVar.i.c(new l(qVar.f415c + '[' + i5 + "] onReset", qVar, i5, i, 1), 0L);
                    } else {
                        y j4 = qVar.j(i5);
                        if (j4 != null) {
                            j4.j(i);
                        }
                    }
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((j3 & 1) != 0) {
                        if (r2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (r2 % 6 != 0) {
                            throw new IOException(AbstractC0001b.f("TYPE_SETTINGS length % 6 != 0: ", r2));
                        }
                        D d2 = new D();
                        o1.a B2 = b1.g.B(b1.g.C(0, r2), 6);
                        int i7 = B2.f3595a;
                        int i8 = B2.f3596b;
                        int i9 = B2.f3597c;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                M1.p pVar2 = this.f446a;
                                short t2 = pVar2.t();
                                byte[] bArr = A1.c.f13a;
                                int i10 = t2 & 65535;
                                int r5 = pVar2.r();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (r5 < 16384 || r5 > 16777215)) {
                                        }
                                    } else {
                                        if (r5 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (r5 != 0 && r5 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                d2.c(i10, r5);
                                if (i7 != i8) {
                                    i7 += i9;
                                }
                            }
                        }
                        q qVar2 = mVar.f402b;
                        qVar2.h.c(new k(qVar2.f415c + " applyAndAckSettings", mVar, d2, 2), 0L);
                    }
                    return true;
                case 5:
                    p(mVar, r2, i4, i5);
                    return true;
                case 6:
                    if (r2 != 8) {
                        throw new IOException(AbstractC0001b.f("TYPE_PING length != 8: ", r2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int r6 = this.f446a.r();
                    int r7 = this.f446a.r();
                    if ((j3 & 1) != 0) {
                        q qVar3 = mVar.f402b;
                        synchronized (qVar3) {
                            try {
                                if (r6 == 1) {
                                    qVar3.f421l++;
                                } else if (r6 == 2) {
                                    qVar3.f423n++;
                                } else if (r6 == 3) {
                                    qVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        mVar.f402b.h.c(new l(mVar.f402b.f415c + " ping", mVar.f402b, r6, r7, 0), 0L);
                    }
                    return true;
                case 7:
                    if (r2 < 8) {
                        throw new IOException(AbstractC0001b.f("TYPE_GOAWAY length < 8: ", r2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int r8 = this.f446a.r();
                    int r9 = this.f446a.r();
                    int i11 = r2 - 8;
                    int[] b3 = AbstractC0309e.b(14);
                    int length2 = b3.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            i2 = b3[i12];
                            if (AbstractC0309e.a(i2) != r9) {
                                i12++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(AbstractC0001b.f("TYPE_GOAWAY unexpected error code: ", r9));
                    }
                    M1.i iVar = M1.i.d;
                    if (i11 > 0) {
                        iVar = this.f446a.k(i11);
                    }
                    k1.e.e(iVar, "debugData");
                    iVar.a();
                    q qVar4 = mVar.f402b;
                    synchronized (qVar4) {
                        array = qVar4.f414b.values().toArray(new y[0]);
                        qVar4.f417f = true;
                    }
                    y[] yVarArr = (y[]) array;
                    int length3 = yVarArr.length;
                    while (i3 < length3) {
                        y yVar = yVarArr[i3];
                        if (yVar.f458a > r8 && yVar.g()) {
                            yVar.j(8);
                            mVar.f402b.j(yVar.f458a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    if (r2 != 4) {
                        throw new IOException(AbstractC0001b.f("TYPE_WINDOW_UPDATE length !=4: ", r2));
                    }
                    long r10 = this.f446a.r() & 2147483647L;
                    if (r10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        q qVar5 = mVar.f402b;
                        synchronized (qVar5) {
                            qVar5.f430u += r10;
                            qVar5.notifyAll();
                        }
                    } else {
                        y d3 = mVar.f402b.d(i5);
                        if (d3 != null) {
                            synchronized (d3) {
                                d3.f462f += r10;
                                if (r10 > 0) {
                                    d3.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f446a.x(r2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f446a.close();
    }

    public final void d(m mVar, int i, int i2, int i3) {
        int i4;
        int i5;
        y yVar;
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
            byte j2 = this.f446a.j();
            byte[] bArr = A1.c.f13a;
            i5 = j2 & 255;
            i4 = i;
        } else {
            i4 = i;
            i5 = 0;
        }
        int a2 = s.a(i4, i2, i5);
        M1.p pVar = this.f446a;
        mVar.getClass();
        k1.e.e(pVar, "source");
        mVar.f402b.getClass();
        long j3 = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            q qVar = mVar.f402b;
            qVar.getClass();
            M1.f fVar = new M1.f();
            long j4 = a2;
            pVar.w(j4);
            pVar.c(fVar, j4);
            qVar.i.c(new n(qVar.f415c + '[' + i3 + "] onData", qVar, i3, fVar, a2, z4), 0L);
        } else {
            y d2 = mVar.f402b.d(i3);
            if (d2 == null) {
                mVar.f402b.s(i3, 2);
                long j5 = a2;
                mVar.f402b.p(j5);
                pVar.x(j5);
            } else {
                byte[] bArr2 = A1.c.f13a;
                w wVar = d2.i;
                long j6 = a2;
                wVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= j3) {
                        yVar = d2;
                        wVar.a(j6);
                        break;
                    }
                    synchronized (wVar.f456f) {
                        z2 = wVar.f453b;
                        yVar = d2;
                        z3 = wVar.d.f799b + j7 > wVar.f452a;
                    }
                    if (z3) {
                        pVar.x(j7);
                        wVar.f456f.e(4);
                        break;
                    }
                    if (z2) {
                        pVar.x(j7);
                        break;
                    }
                    long c2 = pVar.c(wVar.f454c, j7);
                    if (c2 == -1) {
                        throw new EOFException();
                    }
                    j7 -= c2;
                    y yVar2 = wVar.f456f;
                    synchronized (yVar2) {
                        try {
                            if (wVar.f455e) {
                                M1.f fVar2 = wVar.f454c;
                                fVar2.u(fVar2.f799b);
                                j3 = 0;
                            } else {
                                M1.f fVar3 = wVar.d;
                                j3 = 0;
                                boolean z5 = fVar3.f799b == 0;
                                fVar3.z(wVar.f454c);
                                if (z5) {
                                    yVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    d2 = yVar;
                }
                if (z4) {
                    yVar.i(A1.c.f14b, true);
                }
            }
        }
        this.f446a.x(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f372a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j(int i, int i2, int i3, int i4) {
        int e2;
        t tVar = this.f447b;
        tVar.f444e = i;
        tVar.f442b = i;
        tVar.f445f = i2;
        tVar.f443c = i3;
        tVar.d = i4;
        while (true) {
            C0003d c0003d = this.f448c;
            M1.p pVar = c0003d.f374c;
            boolean a2 = pVar.a();
            ArrayList arrayList = c0003d.f373b;
            if (a2) {
                List D02 = Y0.j.D0(arrayList);
                arrayList.clear();
                return D02;
            }
            byte j2 = pVar.j();
            byte[] bArr = A1.c.f13a;
            int i5 = j2 & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((j2 & 128) == 128) {
                e2 = c0003d.e(i5, 127);
                int i6 = e2 - 1;
                if (i6 >= 0) {
                    C0002c[] c0002cArr = f.f384a;
                    if (i6 <= c0002cArr.length - 1) {
                        arrayList.add(c0002cArr[i6]);
                    }
                }
                int length = c0003d.f375e + 1 + (i6 - f.f384a.length);
                if (length < 0) {
                    break;
                }
                C0002c[] c0002cArr2 = c0003d.d;
                if (length >= c0002cArr2.length) {
                    break;
                }
                C0002c c0002c = c0002cArr2[length];
                k1.e.b(c0002c);
                arrayList.add(c0002c);
            } else if (i5 == 64) {
                C0002c[] c0002cArr3 = f.f384a;
                M1.i d2 = c0003d.d();
                f.a(d2);
                c0003d.c(new C0002c(d2, c0003d.d()));
            } else if ((j2 & 64) == 64) {
                c0003d.c(new C0002c(c0003d.b(c0003d.e(i5, 63) - 1), c0003d.d()));
            } else if ((j2 & 32) == 32) {
                int e3 = c0003d.e(i5, 31);
                c0003d.f372a = e3;
                if (e3 < 0 || e3 > 4096) {
                    break;
                }
                int i7 = c0003d.f377g;
                if (e3 < i7) {
                    if (e3 == 0) {
                        C0002c[] c0002cArr4 = c0003d.d;
                        Y0.i.l0(c0002cArr4, 0, c0002cArr4.length);
                        c0003d.f375e = c0003d.d.length - 1;
                        c0003d.f376f = 0;
                        c0003d.f377g = 0;
                    } else {
                        c0003d.a(i7 - e3);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C0002c[] c0002cArr5 = f.f384a;
                M1.i d3 = c0003d.d();
                f.a(d3);
                arrayList.add(new C0002c(d3, c0003d.d()));
            } else {
                arrayList.add(new C0002c(c0003d.b(c0003d.e(i5, 15) - 1), c0003d.d()));
            }
        }
        throw new IOException(AbstractC0001b.f("Header index too large ", e2));
    }

    public final void k(m mVar, int i, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte j2 = this.f446a.j();
            byte[] bArr = A1.c.f13a;
            i4 = j2 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            M1.p pVar = this.f446a;
            pVar.r();
            pVar.j();
            byte[] bArr2 = A1.c.f13a;
            mVar.getClass();
            i -= 5;
        }
        List j3 = j(s.a(i, i2, i4), i4, i2, i3);
        mVar.getClass();
        mVar.f402b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            q qVar = mVar.f402b;
            qVar.getClass();
            qVar.i.c(new o(qVar.f415c + '[' + i3 + "] onHeaders", qVar, i3, j3, z3), 0L);
            return;
        }
        q qVar2 = mVar.f402b;
        synchronized (qVar2) {
            y d2 = qVar2.d(i3);
            if (d2 != null) {
                d2.i(A1.c.t(j3), z3);
                return;
            }
            if (qVar2.f417f) {
                return;
            }
            if (i3 <= qVar2.d) {
                return;
            }
            if (i3 % 2 == qVar2.f416e % 2) {
                return;
            }
            y yVar = new y(i3, qVar2, false, z3, A1.c.t(j3));
            qVar2.d = i3;
            qVar2.f414b.put(Integer.valueOf(i3), yVar);
            qVar2.f418g.e().c(new k(qVar2.f415c + '[' + i3 + "] onStream", qVar2, yVar, i5), 0L);
        }
    }

    public final void p(m mVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte j2 = this.f446a.j();
            byte[] bArr = A1.c.f13a;
            i4 = j2 & 255;
        } else {
            i4 = 0;
        }
        int r2 = this.f446a.r() & Integer.MAX_VALUE;
        List j3 = j(s.a(i - 4, i2, i4), i4, i2, i3);
        mVar.getClass();
        q qVar = mVar.f402b;
        qVar.getClass();
        synchronized (qVar) {
            if (qVar.f434y.contains(Integer.valueOf(r2))) {
                qVar.s(r2, 2);
                return;
            }
            qVar.f434y.add(Integer.valueOf(r2));
            qVar.i.c(new o(qVar.f415c + '[' + r2 + "] onRequest", qVar, r2, j3), 0L);
        }
    }
}
