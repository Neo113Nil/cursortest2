package G1;

import a.AbstractC0058a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import n1.C0316a;
import s.AbstractC0380e;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f429d;

    /* renamed from: a, reason: collision with root package name */
    public final M1.p f430a;

    /* renamed from: b, reason: collision with root package name */
    public final t f431b;

    /* renamed from: c, reason: collision with root package name */
    public final C0003d f432c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        j1.h.d(logger, "getLogger(Http2::class.java.name)");
        f429d = logger;
    }

    public u(M1.p pVar) {
        j1.h.e(pVar, "source");
        this.f430a = pVar;
        t tVar = new t(pVar);
        this.f431b = tVar;
        this.f432c = new C0003d(tVar);
    }

    public final void B(m mVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte q2 = this.f430a.q();
            byte[] bArr = A1.c.f19a;
            i4 = q2 & 255;
        } else {
            i4 = 0;
        }
        int D2 = this.f430a.D() & Integer.MAX_VALUE;
        List q3 = q(s.a(i - 4, i2, i4), i4, i2, i3);
        mVar.getClass();
        q qVar = mVar.f386b;
        qVar.getClass();
        synchronized (qVar) {
            if (qVar.f416y.contains(Integer.valueOf(D2))) {
                qVar.E(D2, 2);
                return;
            }
            qVar.f416y.add(Integer.valueOf(D2));
            qVar.i.c(new o(qVar.f397c + '[' + D2 + "] onRequest", qVar, D2, q3), 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x023b, code lost:
    
        throw new java.io.IOException(G1.AbstractC0001b.e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z2, m mVar) {
        int i;
        int i2;
        Object[] array;
        j1.h.e(mVar, "handler");
        int i3 = 0;
        try {
            this.f430a.I(9L);
            int r2 = A1.c.r(this.f430a);
            if (r2 > 16384) {
                throw new IOException(AbstractC0001b.e("FRAME_SIZE_ERROR: ", r2));
            }
            int q2 = this.f430a.q() & 255;
            byte q3 = this.f430a.q();
            int i4 = q3 & 255;
            int D2 = this.f430a.D();
            int i5 = Integer.MAX_VALUE & D2;
            Logger logger = f429d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i5, r2, q2, i4));
            }
            if (z2 && q2 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f371b;
                sb.append(q2 < strArr.length ? strArr[q2] : A1.c.g("0x%02x", Integer.valueOf(q2)));
                throw new IOException(sb.toString());
            }
            switch (q2) {
                case 0:
                    d(mVar, r2, i4, i5);
                    return true;
                case 1:
                    z(mVar, r2, i4, i5);
                    return true;
                case 2:
                    if (r2 != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + r2 + " != 5");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    M1.p pVar = this.f430a;
                    pVar.D();
                    pVar.q();
                    return true;
                case 3:
                    if (r2 != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + r2 + " != 4");
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int D3 = this.f430a.D();
                    int[] b2 = AbstractC0380e.b(14);
                    int length = b2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i = b2[i6];
                            if (AbstractC0380e.a(i) != D3) {
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(AbstractC0001b.e("TYPE_RST_STREAM unexpected error code: ", D3));
                    }
                    q qVar = mVar.f386b;
                    qVar.getClass();
                    if (i5 != 0 && (D2 & 1) == 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        qVar.i.c(new l(qVar.f397c + '[' + i5 + "] onReset", qVar, i5, i, 1), 0L);
                    } else {
                        y q4 = qVar.q(i5);
                        if (q4 != null) {
                            q4.j(i);
                        }
                    }
                    return true;
                case 4:
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((q3 & 1) != 0) {
                        if (r2 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (r2 % 6 != 0) {
                            throw new IOException(AbstractC0001b.e("TYPE_SETTINGS length % 6 != 0: ", r2));
                        }
                        D d2 = new D();
                        C0316a c02 = AbstractC0058a.c0(AbstractC0058a.e0(0, r2), 6);
                        int i7 = c02.f3755a;
                        int i8 = c02.f3756b;
                        int i9 = c02.f3757c;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                M1.p pVar2 = this.f430a;
                                short F2 = pVar2.F();
                                byte[] bArr = A1.c.f19a;
                                int i10 = F2 & 65535;
                                int D4 = pVar2.D();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (D4 < 16384 || D4 > 16777215)) {
                                        }
                                    } else {
                                        if (D4 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (D4 != 0 && D4 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                d2.c(i10, D4);
                                if (i7 != i8) {
                                    i7 += i9;
                                }
                            }
                        }
                        q qVar2 = mVar.f386b;
                        qVar2.f401h.c(new k(AbstractC0001b.g(new StringBuilder(), qVar2.f397c, " applyAndAckSettings"), mVar, d2, 2), 0L);
                    }
                    return true;
                case 5:
                    B(mVar, r2, i4, i5);
                    return true;
                case 6:
                    if (r2 != 8) {
                        throw new IOException(AbstractC0001b.e("TYPE_PING length != 8: ", r2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int D5 = this.f430a.D();
                    int D6 = this.f430a.D();
                    if ((q3 & 1) != 0) {
                        q qVar3 = mVar.f386b;
                        synchronized (qVar3) {
                            try {
                                if (D5 == 1) {
                                    qVar3.f403l++;
                                } else if (D5 == 2) {
                                    qVar3.f405n++;
                                } else if (D5 == 3) {
                                    qVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        mVar.f386b.f401h.c(new l(AbstractC0001b.g(new StringBuilder(), mVar.f386b.f397c, " ping"), mVar.f386b, D5, D6, 0), 0L);
                    }
                    return true;
                case 7:
                    if (r2 < 8) {
                        throw new IOException(AbstractC0001b.e("TYPE_GOAWAY length < 8: ", r2));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int D7 = this.f430a.D();
                    int D8 = this.f430a.D();
                    int i11 = r2 - 8;
                    int[] b3 = AbstractC0380e.b(14);
                    int length2 = b3.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            i2 = b3[i12];
                            if (AbstractC0380e.a(i2) != D8) {
                                i12++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        throw new IOException(AbstractC0001b.e("TYPE_GOAWAY unexpected error code: ", D8));
                    }
                    M1.i iVar = M1.i.f828d;
                    if (i11 > 0) {
                        iVar = this.f430a.z(i11);
                    }
                    j1.h.e(iVar, "debugData");
                    iVar.a();
                    q qVar4 = mVar.f386b;
                    synchronized (qVar4) {
                        array = qVar4.f396b.values().toArray(new y[0]);
                        qVar4.f399f = true;
                    }
                    y[] yVarArr = (y[]) array;
                    int length3 = yVarArr.length;
                    while (i3 < length3) {
                        y yVar = yVarArr[i3];
                        if (yVar.f443a > D7 && yVar.g()) {
                            yVar.j(8);
                            mVar.f386b.q(yVar.f443a);
                        }
                        i3++;
                    }
                    return true;
                case 8:
                    if (r2 != 4) {
                        throw new IOException(AbstractC0001b.e("TYPE_WINDOW_UPDATE length !=4: ", r2));
                    }
                    long D9 = this.f430a.D() & 2147483647L;
                    if (D9 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i5 == 0) {
                        q qVar5 = mVar.f386b;
                        synchronized (qVar5) {
                            qVar5.f412u += D9;
                            qVar5.notifyAll();
                        }
                    } else {
                        y d3 = mVar.f386b.d(i5);
                        if (d3 != null) {
                            synchronized (d3) {
                                d3.f447f += D9;
                                if (D9 > 0) {
                                    d3.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f430a.J(r2);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f430a.close();
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
            byte q2 = this.f430a.q();
            byte[] bArr = A1.c.f19a;
            i5 = q2 & 255;
            i4 = i;
        } else {
            i4 = i;
            i5 = 0;
        }
        int a2 = s.a(i4, i2, i5);
        M1.p pVar = this.f430a;
        mVar.getClass();
        j1.h.e(pVar, "source");
        mVar.f386b.getClass();
        long j = 0;
        if (i3 != 0 && (i3 & 1) == 0) {
            q qVar = mVar.f386b;
            qVar.getClass();
            M1.f fVar = new M1.f();
            long j2 = a2;
            pVar.I(j2);
            pVar.h(fVar, j2);
            qVar.i.c(new n(qVar.f397c + '[' + i3 + "] onData", qVar, i3, fVar, a2, z4), 0L);
        } else {
            y d2 = mVar.f386b.d(i3);
            if (d2 == null) {
                mVar.f386b.E(i3, 2);
                long j3 = a2;
                mVar.f386b.B(j3);
                pVar.J(j3);
            } else {
                byte[] bArr2 = A1.c.f19a;
                w wVar = d2.i;
                long j4 = a2;
                wVar.getClass();
                long j5 = j4;
                while (true) {
                    if (j5 <= j) {
                        yVar = d2;
                        wVar.a(j4);
                        break;
                    }
                    synchronized (wVar.f441f) {
                        z2 = wVar.f438b;
                        yVar = d2;
                        z3 = wVar.f440d.f827b + j5 > wVar.f437a;
                    }
                    if (z3) {
                        pVar.J(j5);
                        wVar.f441f.e(4);
                        break;
                    }
                    if (z2) {
                        pVar.J(j5);
                        break;
                    }
                    long h2 = pVar.h(wVar.f439c, j5);
                    if (h2 == -1) {
                        throw new EOFException();
                    }
                    j5 -= h2;
                    y yVar2 = wVar.f441f;
                    synchronized (yVar2) {
                        try {
                            if (wVar.e) {
                                M1.f fVar2 = wVar.f439c;
                                fVar2.G(fVar2.f827b);
                                j = 0;
                            } else {
                                M1.f fVar3 = wVar.f440d;
                                j = 0;
                                boolean z5 = fVar3.f827b == 0;
                                fVar3.L(wVar.f439c);
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
                    yVar.i(A1.c.f20b, true);
                }
            }
        }
        this.f430a.J(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f355a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List q(int i, int i2, int i3, int i4) {
        int e;
        t tVar = this.f431b;
        tVar.e = i;
        tVar.f425b = i;
        tVar.f428f = i2;
        tVar.f426c = i3;
        tVar.f427d = i4;
        while (true) {
            C0003d c0003d = this.f432c;
            M1.p pVar = c0003d.f357c;
            boolean a2 = pVar.a();
            ArrayList arrayList = c0003d.f356b;
            if (a2) {
                List s0 = X0.k.s0(arrayList);
                arrayList.clear();
                return s0;
            }
            byte q2 = pVar.q();
            byte[] bArr = A1.c.f19a;
            int i5 = q2 & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((q2 & 128) == 128) {
                e = c0003d.e(i5, 127);
                int i6 = e - 1;
                if (i6 >= 0) {
                    C0002c[] c0002cArr = f.f368a;
                    if (i6 <= c0002cArr.length - 1) {
                        arrayList.add(c0002cArr[i6]);
                    }
                }
                int length = c0003d.e + 1 + (i6 - f.f368a.length);
                if (length < 0) {
                    break;
                }
                C0002c[] c0002cArr2 = c0003d.f358d;
                if (length >= c0002cArr2.length) {
                    break;
                }
                C0002c c0002c = c0002cArr2[length];
                j1.h.b(c0002c);
                arrayList.add(c0002c);
            } else if (i5 == 64) {
                C0002c[] c0002cArr3 = f.f368a;
                M1.i d2 = c0003d.d();
                f.a(d2);
                c0003d.c(new C0002c(d2, c0003d.d()));
            } else if ((q2 & 64) == 64) {
                c0003d.c(new C0002c(c0003d.b(c0003d.e(i5, 63) - 1), c0003d.d()));
            } else if ((q2 & 32) == 32) {
                int e2 = c0003d.e(i5, 31);
                c0003d.f355a = e2;
                if (e2 < 0 || e2 > 4096) {
                    break;
                }
                int i7 = c0003d.f360g;
                if (e2 < i7) {
                    if (e2 == 0) {
                        C0002c[] c0002cArr4 = c0003d.f358d;
                        X0.j.o0(c0002cArr4, 0, c0002cArr4.length);
                        c0003d.e = c0003d.f358d.length - 1;
                        c0003d.f359f = 0;
                        c0003d.f360g = 0;
                    } else {
                        c0003d.a(i7 - e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C0002c[] c0002cArr5 = f.f368a;
                M1.i d3 = c0003d.d();
                f.a(d3);
                arrayList.add(new C0002c(d3, c0003d.d()));
            } else {
                arrayList.add(new C0002c(c0003d.b(c0003d.e(i5, 15) - 1), c0003d.d()));
            }
        }
        throw new IOException(AbstractC0001b.e("Header index too large ", e));
    }

    public final void z(m mVar, int i, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte q2 = this.f430a.q();
            byte[] bArr = A1.c.f19a;
            i4 = q2 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            M1.p pVar = this.f430a;
            pVar.D();
            pVar.q();
            byte[] bArr2 = A1.c.f19a;
            mVar.getClass();
            i -= 5;
        }
        List q3 = q(s.a(i, i2, i4), i4, i2, i3);
        mVar.getClass();
        mVar.f386b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            q qVar = mVar.f386b;
            qVar.getClass();
            qVar.i.c(new o(qVar.f397c + '[' + i3 + "] onHeaders", qVar, i3, q3, z3), 0L);
            return;
        }
        q qVar2 = mVar.f386b;
        synchronized (qVar2) {
            y d2 = qVar2.d(i3);
            if (d2 != null) {
                d2.i(A1.c.t(q3), z3);
                return;
            }
            if (qVar2.f399f) {
                return;
            }
            if (i3 <= qVar2.f398d) {
                return;
            }
            if (i3 % 2 == qVar2.e % 2) {
                return;
            }
            y yVar = new y(i3, qVar2, false, z3, A1.c.t(q3));
            qVar2.f398d = i3;
            qVar2.f396b.put(Integer.valueOf(i3), yVar);
            qVar2.f400g.e().c(new k(qVar2.f397c + '[' + i3 + "] onStream", qVar2, yVar, i5), 0L);
        }
    }
}
