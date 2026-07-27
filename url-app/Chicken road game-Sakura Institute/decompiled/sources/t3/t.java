package t3;

import A.AbstractC0017m;
import A1.L0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1436t;
import z3.C1448f;
import z3.C1451i;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f10848j;

    /* renamed from: d, reason: collision with root package name */
    public final z3.z f10849d;

    /* renamed from: e, reason: collision with root package name */
    public final s f10850e;

    /* renamed from: i, reason: collision with root package name */
    public final d f10851i;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f10848j = logger;
    }

    public t(z3.z source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f10849d = source;
        s sVar = new s(source);
        this.f10850e = sVar;
        this.f10851i = new d(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x025f, code lost:
    
        throw new java.io.IOException(A.AbstractC0017m.g(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z4, L0 handler) {
        EnumC1211b errorCode;
        EnumC1211b errorCode2;
        Object[] array;
        int i2 = 2;
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i4 = 0;
        try {
            this.f10849d.t(9L);
            int s4 = n3.b.s(this.f10849d);
            if (s4 > 16384) {
                throw new IOException(AbstractC0017m.g(s4, "FRAME_SIZE_ERROR: "));
            }
            int d4 = this.f10849d.d() & 255;
            byte d5 = this.f10849d.d();
            int i5 = d5 & 255;
            int h4 = this.f10849d.h();
            int i6 = Integer.MAX_VALUE & h4;
            Logger logger = f10848j;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, i6, s4, d4, i5));
            }
            if (z4 && d4 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f10784b;
                sb.append(d4 < strArr.length ? strArr[d4] : n3.b.h("0x%02x", Integer.valueOf(d4)));
                throw new IOException(sb.toString());
            }
            switch (d4) {
                case 0:
                    b(handler, s4, i5, i6);
                    return true;
                case 1:
                    f(handler, s4, i5, i6);
                    return true;
                case 2:
                    if (s4 != 5) {
                        throw new IOException(AbstractC0017m.h(s4, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    z3.z zVar = this.f10849d;
                    zVar.h();
                    zVar.d();
                    handler.getClass();
                    return true;
                case 3:
                    if (s4 != 4) {
                        throw new IOException(AbstractC0017m.h(s4, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int h5 = this.f10849d.h();
                    EnumC1211b[] values = EnumC1211b.values();
                    int length = values.length;
                    while (true) {
                        if (i4 < length) {
                            errorCode = values[i4];
                            if (errorCode.f10755d != h5) {
                                i4++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(AbstractC0017m.g(h5, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    handler.getClass();
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    p pVar = (p) handler.f499i;
                    pVar.getClass();
                    if (i6 == 0 || (h4 & 1) != 0) {
                        x f4 = pVar.f(i6);
                        if (f4 != null) {
                            f4.j(errorCode);
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                        pVar.f10822o.c(new n(pVar.f10816i + '[' + i6 + "] onReset", pVar, i6, errorCode, 0), 0L);
                    }
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((d5 & 1) != 0) {
                        if (s4 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        handler.getClass();
                    } else {
                        if (s4 % 6 != 0) {
                            throw new IOException(AbstractC0017m.g(s4, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        B settings = new B();
                        kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, s4), 6);
                        int i7 = g4.f7505d;
                        int i8 = g4.f7506e;
                        int i9 = g4.f7507i;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                z3.z zVar2 = this.f10849d;
                                short k4 = zVar2.k();
                                byte[] bArr = n3.b.f8558a;
                                int i10 = k4 & 65535;
                                int h6 = zVar2.h();
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        i10 = 4;
                                    } else if (i10 != 4) {
                                        if (i10 == 5 && (h6 < 16384 || h6 > 16777215)) {
                                        }
                                    } else {
                                        if (h6 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i10 = 7;
                                    }
                                } else if (h6 != 0 && h6 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                settings.c(i10, h6);
                                if (i7 != i8) {
                                    i7 += i9;
                                }
                            }
                        }
                        handler.getClass();
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        p pVar2 = (p) handler.f499i;
                        pVar2.f10821n.c(new j(AbstractC0017m.n(new StringBuilder(), pVar2.f10816i, " applyAndAckSettings"), handler, settings, i2), 0L);
                    }
                    return true;
                case 5:
                    g(handler, s4, i5, i6);
                    return true;
                case 6:
                    if (s4 != 8) {
                        throw new IOException(AbstractC0017m.g(s4, "TYPE_PING length != 8: "));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int h7 = this.f10849d.h();
                    int h8 = this.f10849d.h();
                    if ((d5 & 1) != 0) {
                        p pVar3 = (p) handler.f499i;
                        synchronized (pVar3) {
                            try {
                                if (h7 == 1) {
                                    pVar3.f10825r++;
                                } else if (h7 != 2) {
                                    if (h7 == 3) {
                                        pVar3.notifyAll();
                                    }
                                    Unit unit = Unit.f7487a;
                                } else {
                                    pVar3.f10827t++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        ((p) handler.f499i).f10821n.c(new k(AbstractC0017m.n(new StringBuilder(), ((p) handler.f499i).f10816i, " ping"), (p) handler.f499i, h7, h8), 0L);
                    }
                    return true;
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (s4 < 8) {
                        throw new IOException(AbstractC0017m.g(s4, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int h9 = this.f10849d.h();
                    int h10 = this.f10849d.h();
                    int i11 = s4 - 8;
                    EnumC1211b[] values2 = EnumC1211b.values();
                    int length2 = values2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            errorCode2 = values2[i12];
                            if (errorCode2.f10755d != h10) {
                                i12++;
                            }
                        } else {
                            errorCode2 = null;
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(AbstractC0017m.g(h10, "TYPE_GOAWAY unexpected error code: "));
                    }
                    C1451i debugData = C1451i.f12000j;
                    if (i11 > 0) {
                        debugData = this.f10849d.f(i11);
                    }
                    handler.getClass();
                    Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                    Intrinsics.checkNotNullParameter(debugData, "debugData");
                    debugData.c();
                    p pVar4 = (p) handler.f499i;
                    synchronized (pVar4) {
                        array = pVar4.f10815e.values().toArray(new x[0]);
                        pVar4.f10819l = true;
                        Unit unit2 = Unit.f7487a;
                    }
                    x[] xVarArr = (x[]) array;
                    int length3 = xVarArr.length;
                    while (i4 < length3) {
                        x xVar = xVarArr[i4];
                        if (xVar.f10863a > h9 && xVar.g()) {
                            xVar.j(EnumC1211b.REFUSED_STREAM);
                            ((p) handler.f499i).f(xVar.f10863a);
                        }
                        i4++;
                    }
                    return true;
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (s4 != 4) {
                        throw new IOException(AbstractC0017m.g(s4, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long h11 = this.f10849d.h() & 2147483647L;
                    if (h11 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i6 == 0) {
                        p pVar5 = (p) handler.f499i;
                        synchronized (pVar5) {
                            pVar5.f10810A += h11;
                            pVar5.notifyAll();
                            Unit unit3 = Unit.f7487a;
                        }
                    } else {
                        x d6 = ((p) handler.f499i).d(i6);
                        if (d6 != null) {
                            synchronized (d6) {
                                d6.f10868f += h11;
                                if (h11 > 0) {
                                    d6.notifyAll();
                                }
                                Unit unit4 = Unit.f7487a;
                            }
                        }
                    }
                    return true;
                default:
                    this.f10849d.u(s4);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        if (r8 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r18.i(n3.b.f8559b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(L0 l02, int i2, int i4, int i5) {
        int i6;
        int i7;
        x xVar;
        boolean z4;
        boolean z5;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i4 & 8) != 0) {
            byte d4 = this.f10849d.d();
            byte[] bArr = n3.b.f8558a;
            i7 = d4 & 255;
            i6 = i2;
        } else {
            i6 = i2;
            i7 = 0;
        }
        int a4 = r.a(i6, i4, i7);
        z3.z source = this.f10849d;
        l02.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        ((p) l02.f499i).getClass();
        long j4 = 0;
        if (!(i5 != 0 && (i5 & 1) == 0)) {
            x d5 = ((p) l02.f499i).d(i5);
            if (d5 != null) {
                Intrinsics.checkNotNullParameter(source, "source");
                byte[] bArr2 = n3.b.f8558a;
                v vVar = d5.f10871i;
                long j5 = a4;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                long j6 = j5;
                while (true) {
                    if (j6 <= j4) {
                        xVar = d5;
                        byte[] bArr3 = n3.b.f8558a;
                        vVar.f10861l.f10864b.h(j5);
                        break;
                    }
                    synchronized (vVar.f10861l) {
                        z4 = vVar.f10857e;
                        xVar = d5;
                        z5 = vVar.f10859j.f11999e + j6 > vVar.f10856d;
                        Unit unit = Unit.f7487a;
                    }
                    if (z5) {
                        source.u(j6);
                        vVar.f10861l.e(EnumC1211b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z4) {
                        source.u(j6);
                        break;
                    }
                    long l4 = source.l(vVar.f10858i, j6);
                    if (l4 == -1) {
                        throw new EOFException();
                    }
                    j6 -= l4;
                    x xVar2 = vVar.f10861l;
                    synchronized (xVar2) {
                        try {
                            if (vVar.f10860k) {
                                C1448f c1448f = vVar.f10858i;
                                c1448f.s(c1448f.f11999e);
                                j4 = 0;
                            } else {
                                C1448f c1448f2 = vVar.f10859j;
                                j4 = 0;
                                boolean z7 = c1448f2.f11999e == 0;
                                c1448f2.x(vVar.f10858i);
                                if (z7) {
                                    xVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    d5 = xVar;
                }
            } else {
                ((p) l02.f499i).j(i5, EnumC1211b.PROTOCOL_ERROR);
                long j7 = a4;
                ((p) l02.f499i).h(j7);
                source.u(j7);
            }
        } else {
            p pVar = (p) l02.f499i;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            C1448f c1448f3 = new C1448f();
            long j8 = a4;
            source.t(j8);
            source.l(c1448f3, j8);
            pVar.f10822o.c(new l(pVar.f10816i + '[' + i5 + "] onData", pVar, i5, c1448f3, a4, z6), 0L);
        }
        this.f10849d.u(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10849d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f10765a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(int i2, int i4, int i5, int i6) {
        int e4;
        s sVar = this.f10850e;
        sVar.f10846k = i2;
        sVar.f10843e = i2;
        sVar.f10847l = i4;
        sVar.f10844i = i5;
        sVar.f10845j = i6;
        while (true) {
            d dVar = this.f10851i;
            z3.z zVar = dVar.f10767c;
            boolean a4 = zVar.a();
            ArrayList arrayList = dVar.f10766b;
            if (a4) {
                List H3 = C1403G.H(arrayList);
                arrayList.clear();
                return H3;
            }
            byte d4 = zVar.d();
            byte[] bArr = n3.b.f8558a;
            int i7 = d4 & 255;
            if (i7 == 128) {
                throw new IOException("index == 0");
            }
            if ((d4 & 128) == 128) {
                e4 = dVar.e(i7, 127);
                int i8 = e4 - 1;
                if (i8 >= 0) {
                    C1212c[] c1212cArr = f.f10781a;
                    if (i8 <= c1212cArr.length - 1) {
                        arrayList.add(c1212cArr[i8]);
                    }
                }
                int length = dVar.f10769e + 1 + (i8 - f.f10781a.length);
                if (length < 0) {
                    break;
                }
                C1212c[] c1212cArr2 = dVar.f10768d;
                if (length >= c1212cArr2.length) {
                    break;
                }
                C1212c c1212c = c1212cArr2[length];
                Intrinsics.c(c1212c);
                arrayList.add(c1212c);
            } else if (i7 == 64) {
                C1212c[] c1212cArr3 = f.f10781a;
                C1451i d5 = dVar.d();
                f.a(d5);
                dVar.c(new C1212c(d5, dVar.d()));
            } else if ((d4 & 64) == 64) {
                dVar.c(new C1212c(dVar.b(dVar.e(i7, 63) - 1), dVar.d()));
            } else if ((d4 & 32) == 32) {
                int e5 = dVar.e(i7, 31);
                dVar.f10765a = e5;
                if (e5 < 0 || e5 > 4096) {
                    break;
                }
                int i9 = dVar.f10771g;
                if (e5 < i9) {
                    if (e5 == 0) {
                        C1436t.k(r7, 0, dVar.f10768d.length);
                        dVar.f10769e = dVar.f10768d.length - 1;
                        dVar.f10770f = 0;
                        dVar.f10771g = 0;
                    } else {
                        dVar.a(i9 - e5);
                    }
                }
            } else if (i7 == 16 || i7 == 0) {
                C1212c[] c1212cArr4 = f.f10781a;
                C1451i d6 = dVar.d();
                f.a(d6);
                arrayList.add(new C1212c(d6, dVar.d()));
            } else {
                arrayList.add(new C1212c(dVar.b(dVar.e(i7, 15) - 1), dVar.d()));
            }
        }
        throw new IOException(AbstractC0017m.g(e4, "Header index too large "));
    }

    public final void f(L0 l02, int i2, int i4, int i5) {
        int i6;
        int i7 = 1;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z4 = false;
        boolean z5 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte d4 = this.f10849d.d();
            byte[] bArr = n3.b.f8558a;
            i6 = d4 & 255;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            z3.z zVar = this.f10849d;
            zVar.h();
            zVar.d();
            byte[] bArr2 = n3.b.f8558a;
            l02.getClass();
            i2 -= 5;
        }
        List requestHeaders = d(r.a(i2, i4, i6), i6, i4, i5);
        l02.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        ((p) l02.f499i).getClass();
        if (i5 != 0 && (i5 & 1) == 0) {
            z4 = true;
        }
        if (z4) {
            p pVar = (p) l02.f499i;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            pVar.f10822o.c(new m(pVar.f10816i + '[' + i5 + "] onHeaders", pVar, i5, requestHeaders, z5), 0L);
            return;
        }
        p pVar2 = (p) l02.f499i;
        synchronized (pVar2) {
            x d5 = pVar2.d(i5);
            if (d5 != null) {
                Unit unit = Unit.f7487a;
                d5.i(n3.b.u(requestHeaders), z5);
            } else if (!pVar2.f10819l) {
                if (i5 > pVar2.f10817j) {
                    if (i5 % 2 != pVar2.f10818k % 2) {
                        x xVar = new x(i5, pVar2, false, z5, n3.b.u(requestHeaders));
                        pVar2.f10817j = i5;
                        pVar2.f10815e.put(Integer.valueOf(i5), xVar);
                        pVar2.f10820m.e().c(new j(pVar2.f10816i + '[' + i5 + "] onStream", pVar2, xVar, i7), 0L);
                    }
                }
            }
        }
    }

    public final void g(L0 l02, int i2, int i4, int i5) {
        int i6;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte d4 = this.f10849d.d();
            byte[] bArr = n3.b.f8558a;
            i6 = d4 & 255;
        } else {
            i6 = 0;
        }
        int h4 = this.f10849d.h() & Integer.MAX_VALUE;
        List requestHeaders = d(r.a(i2 - 4, i4, i6), i6, i4, i5);
        l02.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        p pVar = (p) l02.f499i;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (pVar) {
            if (pVar.f10813E.contains(Integer.valueOf(h4))) {
                pVar.j(h4, EnumC1211b.PROTOCOL_ERROR);
                return;
            }
            pVar.f10813E.add(Integer.valueOf(h4));
            pVar.f10822o.c(new m(pVar.f10816i + '[' + h4 + "] onRequest", pVar, h4, requestHeaders), 0L);
        }
    }
}
