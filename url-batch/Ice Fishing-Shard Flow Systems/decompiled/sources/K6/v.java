package K6;

import j6.C0588e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f1594l;

    /* renamed from: d, reason: collision with root package name */
    public final T6.h f1595d;

    /* renamed from: e, reason: collision with root package name */
    public final u f1596e;

    /* renamed from: i, reason: collision with root package name */
    public final C0134e f1597i;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f1594l = logger;
    }

    public v(T6.q source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1595d = source;
        u uVar = new u(source);
        this.f1596e = uVar;
        this.f1597i = new C0134e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0253, code lost:
    
        throw new java.io.IOException(C4.p.g(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z7, q handler) {
        Object[] array;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.f1595d.y(9L);
            int k7 = E6.c.k(this.f1595d);
            if (k7 > 16384) {
                throw new IOException(C4.p.g(k7, "FRAME_SIZE_ERROR: "));
            }
            int readByte = this.f1595d.readByte() & 255;
            byte readByte2 = this.f1595d.readByte();
            int i2 = readByte2 & 255;
            int readInt = this.f1595d.readInt();
            int i5 = Integer.MAX_VALUE & readInt;
            int i7 = 1;
            if (readByte != 8) {
                Logger logger = f1594l;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(true, i5, k7, readByte, i2));
                }
            }
            if (z7 && readByte != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(readByte));
            }
            EnumC0131b errorCode = null;
            switch (readByte) {
                case 0:
                    d(handler, k7, i2, i5);
                    return true;
                case 1:
                    h(handler, k7, i2, i5);
                    return true;
                case 2:
                    if (k7 != 5) {
                        throw new IOException(C4.p.h(k7, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    T6.h hVar = this.f1595d;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (k7 != 4) {
                        throw new IOException(C4.p.h(k7, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i5 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.f1595d.readInt();
                    EnumC0131b.f1490e.getClass();
                    EnumC0131b[] values = EnumC0131b.values();
                    int length = values.length;
                    while (true) {
                        if (r0 < length) {
                            EnumC0131b enumC0131b = values[r0];
                            if (enumC0131b.f1498d == readInt2) {
                                errorCode = enumC0131b;
                            } else {
                                r0++;
                            }
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(C4.p.g(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    r rVar = handler.f1553e;
                    if (i5 == 0 || (readInt & 1) != 0) {
                        z g7 = rVar.g(i5);
                        if (g7 != null) {
                            g7.k(errorCode);
                        }
                        return true;
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    G6.c.c(rVar.f1570q, rVar.f1564i + '[' + i5 + "] onReset", new j(rVar, i5, errorCode, 1));
                    return true;
                case 4:
                    T6.h hVar2 = this.f1595d;
                    if (i5 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (k7 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (k7 % 6 != 0) {
                        throw new IOException(C4.p.g(k7, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    E settings = new E();
                    kotlin.ranges.a b7 = C0588e.b(C0588e.c(0, k7), 6);
                    int i8 = b7.f6173d;
                    int i9 = b7.f6174e;
                    int i10 = b7.f6175i;
                    if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                        while (true) {
                            short readShort = hVar2.readShort();
                            byte[] bArr = E6.c.f709a;
                            int i11 = readShort & 65535;
                            int readInt3 = hVar2.readInt();
                            if (i11 != 2) {
                                if (i11 != 4) {
                                    if (i11 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    }
                                } else if (readInt3 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.c(i11, readInt3);
                            if (i8 != i9) {
                                i8 += i10;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(settings, "settings");
                    r rVar2 = handler.f1553e;
                    G6.c.c(rVar2.f1569p, r4.f.f(new StringBuilder(), rVar2.f1564i, " applyAndAckSettings"), new p(handler, i7, settings));
                    return true;
                case 5:
                    j(handler, k7, i2, i5);
                    return true;
                case 6:
                    if (k7 != 8) {
                        throw new IOException(C4.p.g(k7, "TYPE_PING length != 8: "));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int readInt4 = this.f1595d.readInt();
                    final int readInt5 = this.f1595d.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        G6.c cVar = handler.f1553e.f1569p;
                        String f7 = r4.f.f(new StringBuilder(), handler.f1553e.f1564i, " ping");
                        final r rVar3 = handler.f1553e;
                        G6.c.c(cVar, f7, new Function0() { // from class: K6.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                r rVar4 = r.this;
                                try {
                                    rVar4.f1559E.s(readInt4, readInt5, true);
                                } catch (IOException e7) {
                                    EnumC0131b enumC0131b2 = EnumC0131b.f1492l;
                                    rVar4.a(enumC0131b2, enumC0131b2, e7);
                                }
                                return Unit.f6114a;
                            }
                        });
                        return true;
                    }
                    r rVar4 = handler.f1553e;
                    synchronized (rVar4) {
                        try {
                            if (readInt4 == 1) {
                                rVar4.f1573t++;
                            } else if (readInt4 != 2) {
                                if (readInt4 == 3) {
                                    rVar4.notifyAll();
                                }
                                Unit unit = Unit.f6114a;
                            } else {
                                rVar4.f1575v++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (k7 < 8) {
                        throw new IOException(C4.p.g(k7, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i5 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.f1595d.readInt();
                    int readInt7 = this.f1595d.readInt();
                    int i12 = k7 - 8;
                    EnumC0131b.f1490e.getClass();
                    EnumC0131b[] values2 = EnumC0131b.values();
                    int length2 = values2.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            EnumC0131b enumC0131b2 = values2[i13];
                            if (enumC0131b2.f1498d == readInt7) {
                                errorCode = enumC0131b2;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(C4.p.g(readInt7, "TYPE_GOAWAY unexpected error code: "));
                    }
                    T6.i debugData = T6.i.f2618l;
                    if (i12 > 0) {
                        debugData = this.f1595d.e(i12);
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    Intrinsics.checkNotNullParameter(debugData, "debugData");
                    debugData.a();
                    r rVar5 = handler.f1553e;
                    synchronized (rVar5) {
                        array = rVar5.f1563e.values().toArray(new z[0]);
                        rVar5.f1567n = true;
                        Unit unit2 = Unit.f6114a;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (r0 < length3) {
                        z zVar = zVarArr[r0];
                        if (zVar.f1609d > readInt6 && zVar.h()) {
                            zVar.k(EnumC0131b.f1495o);
                            handler.f1553e.g(zVar.f1609d);
                        }
                        r0++;
                    }
                    return true;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        if (k7 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k7);
                        }
                        long readInt8 = 2147483647L & this.f1595d.readInt();
                        if (readInt8 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f1594l;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(true, i5, k7, readInt8));
                        }
                        if (i5 == 0) {
                            r rVar6 = handler.f1553e;
                            synchronized (rVar6) {
                                rVar6.f1557C += readInt8;
                                rVar6.notifyAll();
                                Unit unit3 = Unit.f6114a;
                            }
                            return true;
                        }
                        z d7 = handler.f1553e.d(i5);
                        if (d7 != null) {
                            synchronized (d7) {
                                d7.f1613m += readInt8;
                                if (readInt8 > 0) {
                                    d7.notifyAll();
                                }
                                Unit unit4 = Unit.f6114a;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e7) {
                        f1594l.fine(h.b(true, i5, k7, 8, i2));
                        throw e7;
                    }
                default:
                    this.f1595d.skip(k7);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1595d.close();
    }

    public final void d(q qVar, int i2, int i5, final int i7) {
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z10 = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f1595d.readByte();
            byte[] bArr = E6.c.f709a;
            i8 = readByte & 255;
        } else {
            i8 = 0;
        }
        final int a7 = t.a(i2, i5, i8);
        T6.h source = this.f1595d;
        Intrinsics.checkNotNullParameter(source, "source");
        final r rVar = qVar.f1553e;
        if (i7 == 0 || (i7 & 1) != 0) {
            z d7 = rVar.d(i7);
            if (d7 == null) {
                qVar.f1553e.t(i7, EnumC0131b.f1492l);
                long j = a7;
                qVar.f1553e.j(j);
                source.skip(j);
            } else {
                Intrinsics.checkNotNullParameter(source, "source");
                TimeZone timeZone = E6.e.f712a;
                x xVar = d7.f1616p;
                long j7 = a7;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                long j8 = j7;
                while (true) {
                    if (j8 <= 0) {
                        z7 = z10;
                        z zVar = xVar.f1607n;
                        TimeZone timeZone2 = E6.e.f712a;
                        zVar.f1610e.j(j7);
                        z zVar2 = xVar.f1607n;
                        C0132c c0132c = zVar2.f1610e.f1577x;
                        L6.a windowCounter = zVar2.f1611i;
                        c0132c.getClass();
                        Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
                        break;
                    }
                    synchronized (xVar.f1607n) {
                        z8 = xVar.f1603e;
                        z7 = z10;
                        z9 = xVar.f1605l.f2617e + j8 > xVar.f1602d;
                        Unit unit = Unit.f6114a;
                    }
                    if (z9) {
                        source.skip(j8);
                        xVar.f1607n.f(EnumC0131b.f1494n);
                        break;
                    }
                    if (z8) {
                        source.skip(j8);
                        break;
                    }
                    long o7 = source.o(j8, xVar.f1604i);
                    if (o7 == -1) {
                        throw new EOFException();
                    }
                    j8 -= o7;
                    z zVar3 = xVar.f1607n;
                    synchronized (zVar3) {
                        try {
                            if (xVar.f1606m) {
                                T6.f fVar = xVar.f1604i;
                                fVar.skip(fVar.f2617e);
                            } else {
                                T6.f fVar2 = xVar.f1605l;
                                boolean z11 = fVar2.f2617e == 0;
                                fVar2.G(xVar.f1604i);
                                if (z11) {
                                    zVar3.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z10 = z7;
                }
                if (z7) {
                    d7.j(D6.q.f552e, true);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(source, "source");
            final T6.f fVar3 = new T6.f();
            long j9 = a7;
            source.y(j9);
            source.o(j9, fVar3);
            G6.c.c(rVar.f1570q, rVar.f1564i + '[' + i7 + "] onData", new Function0(i7, fVar3, a7, z10) { // from class: K6.k

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f1538e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ T6.f f1539i;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f1540l;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    r rVar2 = r.this;
                    int i9 = this.f1538e;
                    T6.f source2 = this.f1539i;
                    int i10 = this.f1540l;
                    try {
                        rVar2.f1572s.getClass();
                        Intrinsics.checkNotNullParameter(source2, "source");
                        source2.skip(i10);
                        rVar2.f1559E.t(i9, EnumC0131b.f1496p);
                        synchronized (rVar2) {
                            rVar2.f1561G.remove(Integer.valueOf(i9));
                            Unit unit2 = Unit.f6114a;
                        }
                    } catch (IOException unused) {
                    }
                    return Unit.f6114a;
                }
            });
        }
        this.f1595d.skip(i8);
    }

    public final List g(int i2, int i5, int i7, int i8) {
        u uVar = this.f1596e;
        uVar.f1592m = i2;
        uVar.f1589e = i2;
        uVar.f1593n = i5;
        uVar.f1590i = i7;
        uVar.f1591l = i8;
        C0134e c0134e = this.f1597i;
        T6.q qVar = c0134e.f1511c;
        ArrayList arrayList = c0134e.f1510b;
        while (!qVar.a()) {
            byte readByte = qVar.readByte();
            byte[] bArr = E6.c.f709a;
            int i9 = readByte & 255;
            if (i9 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e7 = c0134e.e(i9, 127);
                int i10 = e7 - 1;
                if (i10 >= 0) {
                    C0133d[] c0133dArr = g.f1524a;
                    if (i10 <= c0133dArr.length - 1) {
                        arrayList.add(c0133dArr[i10]);
                    }
                }
                int length = c0134e.f1513e + 1 + (i10 - g.f1524a.length);
                if (length >= 0) {
                    C0133d[] c0133dArr2 = c0134e.f1512d;
                    if (length < c0133dArr2.length) {
                        C0133d c0133d = c0133dArr2[length];
                        Intrinsics.b(c0133d);
                        arrayList.add(c0133d);
                    }
                }
                throw new IOException(C4.p.g(e7, "Header index too large "));
            }
            if (i9 == 64) {
                C0133d[] c0133dArr3 = g.f1524a;
                T6.i d7 = c0134e.d();
                g.a(d7);
                c0134e.c(new C0133d(d7, c0134e.d()));
            } else if ((readByte & 64) == 64) {
                c0134e.c(new C0133d(c0134e.b(c0134e.e(i9, 63) - 1), c0134e.d()));
            } else if ((readByte & 32) == 32) {
                int e8 = c0134e.e(i9, 31);
                c0134e.f1509a = e8;
                if (e8 < 0 || e8 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c0134e.f1509a);
                }
                int i11 = c0134e.f1515g;
                if (e8 < i11) {
                    if (e8 == 0) {
                        C0133d[] c0133dArr4 = c0134e.f1512d;
                        kotlin.collections.o.i(c0133dArr4, 0, c0133dArr4.length);
                        c0134e.f1513e = c0134e.f1512d.length - 1;
                        c0134e.f1514f = 0;
                        c0134e.f1515g = 0;
                    } else {
                        c0134e.a(i11 - e8);
                    }
                }
            } else if (i9 == 16 || i9 == 0) {
                C0133d[] c0133dArr5 = g.f1524a;
                T6.i d8 = c0134e.d();
                g.a(d8);
                arrayList.add(new C0133d(d8, c0134e.d()));
            } else {
                arrayList.add(new C0133d(c0134e.b(c0134e.e(i9, 15) - 1), c0134e.d()));
            }
        }
        List z7 = CollectionsKt.z(arrayList);
        arrayList.clear();
        return z7;
    }

    public final void h(q qVar, int i2, int i5, int i7) {
        int i8;
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i9 = 0;
        boolean z7 = (i5 & 1) != 0;
        if ((i5 & 8) != 0) {
            byte readByte = this.f1595d.readByte();
            byte[] bArr = E6.c.f709a;
            i8 = readByte & 255;
        } else {
            i8 = 0;
        }
        if ((i5 & 32) != 0) {
            T6.h hVar = this.f1595d;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = E6.c.f709a;
            i2 -= 5;
        }
        List requestHeaders = g(t.a(i2, i5, i8), i8, i5, i7);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        r rVar = qVar.f1553e;
        if (i7 != 0 && (i7 & 1) == 0) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            G6.c.c(rVar.f1570q, rVar.f1564i + '[' + i7 + "] onHeaders", new l(rVar, i7, requestHeaders, z7));
            return;
        }
        synchronized (rVar) {
            z d7 = rVar.d(i7);
            if (d7 != null) {
                Unit unit = Unit.f6114a;
                d7.j(E6.e.g(requestHeaders), z7);
                return;
            }
            if (rVar.f1567n) {
                return;
            }
            if (i7 <= rVar.f1565l) {
                return;
            }
            if (i7 % 2 == rVar.f1566m % 2) {
                return;
            }
            z zVar = new z(i7, rVar, false, z7, E6.e.g(requestHeaders));
            rVar.f1565l = i7;
            rVar.f1563e.put(Integer.valueOf(i7), zVar);
            G6.c.c(rVar.f1568o.d(), rVar.f1564i + '[' + i7 + "] onStream", new p(rVar, i9, zVar));
        }
    }

    public final void j(q qVar, int i2, int i5, int i7) {
        int i8;
        if (i7 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i5 & 8) != 0) {
            byte readByte = this.f1595d.readByte();
            byte[] bArr = E6.c.f709a;
            i8 = readByte & 255;
        } else {
            i8 = 0;
        }
        int readInt = this.f1595d.readInt() & Integer.MAX_VALUE;
        List requestHeaders = g(t.a(i2 - 4, i5, i8), i8, i5, i7);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        r rVar = qVar.f1553e;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (rVar) {
            if (rVar.f1561G.contains(Integer.valueOf(readInt))) {
                rVar.t(readInt, EnumC0131b.f1492l);
                return;
            }
            rVar.f1561G.add(Integer.valueOf(readInt));
            G6.c.c(rVar.f1570q, rVar.f1564i + '[' + readInt + "] onRequest", new l(rVar, readInt, requestHeaders));
        }
    }
}
