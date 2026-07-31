package e6;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import l5.AbstractC0505i;
import l5.AbstractC0506j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class v implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f4138i;

    /* renamed from: f, reason: collision with root package name */
    public final n6.h f4139f;

    /* renamed from: g, reason: collision with root package name */
    public final u f4140g;

    /* renamed from: h, reason: collision with root package name */
    public final C0359e f4141h;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(...)");
        f4138i = logger;
    }

    public v(n6.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f4139f = source;
        u uVar = new u(source);
        this.f4140g = uVar;
        this.f4141h = new C0359e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0251, code lost:
    
        throw new java.io.IOException(W4.o.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z5, q qVar) {
        Object[] array;
        try {
            this.f4139f.C(9L);
            int k4 = Y5.c.k(this.f4139f);
            if (k4 > 16384) {
                throw new IOException(W4.o.c("FRAME_SIZE_ERROR: ", k4));
            }
            int readByte = this.f4139f.readByte() & 255;
            byte readByte2 = this.f4139f.readByte();
            int i7 = readByte2 & 255;
            int readInt = this.f4139f.readInt();
            int i8 = Integer.MAX_VALUE & readInt;
            int i9 = 1;
            if (readByte != 8) {
                Logger logger = f4138i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(true, i8, k4, readByte, i7));
                }
            }
            if (z5 && readByte != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(readByte));
            }
            EnumC0356b enumC0356b = null;
            switch (readByte) {
                case 0:
                    d(qVar, k4, i7, i8);
                    return true;
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    g(qVar, k4, i7, i8);
                    return true;
                case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                    if (k4 != 5) {
                        throw new IOException(C1.c.g("TYPE_PRIORITY length: ", k4, " != 5"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    n6.h hVar = this.f4139f;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (k4 != 4) {
                        throw new IOException(C1.c.g("TYPE_RST_STREAM length: ", k4, " != 4"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.f4139f.readInt();
                    EnumC0356b.f4037g.getClass();
                    EnumC0356b[] values = EnumC0356b.values();
                    int length = values.length;
                    while (true) {
                        if (r0 < length) {
                            EnumC0356b enumC0356b2 = values[r0];
                            if (enumC0356b2.f4045f == readInt2) {
                                enumC0356b = enumC0356b2;
                            } else {
                                r0++;
                            }
                        }
                    }
                    if (enumC0356b == null) {
                        throw new IOException(W4.o.c("TYPE_RST_STREAM unexpected error code: ", readInt2));
                    }
                    r rVar = qVar.f4098g;
                    if (i8 == 0 || (readInt & 1) != 0) {
                        z e4 = rVar.e(i8);
                        if (e4 != null) {
                            synchronized (e4) {
                                if (e4.h() == null) {
                                    e4.f4164q = enumC0356b;
                                    e4.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    a6.c.c(rVar.f4112n, rVar.f4106h + '[' + i8 + "] onReset", new l(rVar, i8, enumC0356b, i9));
                    return true;
                case 4:
                    n6.h hVar2 = this.f4139f;
                    if (i8 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (k4 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (k4 % 6 != 0) {
                        throw new IOException(W4.o.c("TYPE_SETTINGS length % 6 != 0: ", k4));
                    }
                    D d7 = new D();
                    C5.a A6 = i6.g.A(i6.g.B(0, k4), 6);
                    int i10 = A6.f228f;
                    int i11 = A6.f229g;
                    int i12 = A6.f230h;
                    if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                        while (true) {
                            short readShort = hVar2.readShort();
                            byte[] bArr = Y5.c.f3099a;
                            int i13 = readShort & 65535;
                            int readInt3 = hVar2.readInt();
                            if (i13 != 2) {
                                if (i13 != 4) {
                                    if (i13 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    }
                                } else if (readInt3 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            d7.c(i13, readInt3);
                            if (i10 != i11) {
                                i10 += i12;
                            }
                        }
                    }
                    r rVar2 = qVar.f4098g;
                    a6.c.c(rVar2.f4111m, N.p.b(new StringBuilder(), rVar2.f4106h, " applyAndAckSettings"), new p(qVar, i9, d7));
                    return true;
                case 5:
                    h(qVar, k4, i7, i8);
                    return true;
                case 6:
                    if (k4 != 8) {
                        throw new IOException(W4.o.c("TYPE_PING length != 8: ", k4));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int readInt4 = this.f4139f.readInt();
                    final int readInt5 = this.f4139f.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        a6.c cVar = qVar.f4098g.f4111m;
                        String b7 = N.p.b(new StringBuilder(), qVar.f4098g.f4106h, " ping");
                        final r rVar3 = qVar.f4098g;
                        a6.c.c(cVar, b7, new InterfaceC0732a() { // from class: e6.o
                            @Override // x5.InterfaceC0732a
                            public final Object invoke() {
                                r rVar4 = r.this;
                                try {
                                    rVar4.f4101B.m(readInt4, readInt5, true);
                                } catch (IOException e7) {
                                    EnumC0356b enumC0356b3 = EnumC0356b.f4039i;
                                    rVar4.a(enumC0356b3, enumC0356b3, e7);
                                }
                                return k5.v.f5219a;
                            }
                        });
                        return true;
                    }
                    r rVar4 = qVar.f4098g;
                    synchronized (rVar4) {
                        try {
                            if (readInt4 == 1) {
                                rVar4.f4115q++;
                            } else if (readInt4 == 2) {
                                rVar4.f4117s++;
                            } else if (readInt4 == 3) {
                                rVar4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (k4 < 8) {
                        throw new IOException(W4.o.c("TYPE_GOAWAY length < 8: ", k4));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.f4139f.readInt();
                    int readInt7 = this.f4139f.readInt();
                    int i14 = k4 - 8;
                    EnumC0356b.f4037g.getClass();
                    EnumC0356b[] values2 = EnumC0356b.values();
                    int length2 = values2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            EnumC0356b enumC0356b3 = values2[i15];
                            if (enumC0356b3.f4045f == readInt7) {
                                enumC0356b = enumC0356b3;
                            } else {
                                i15++;
                            }
                        }
                    }
                    if (enumC0356b == null) {
                        throw new IOException(W4.o.c("TYPE_GOAWAY unexpected error code: ", readInt7));
                    }
                    n6.i debugData = n6.i.f5525i;
                    if (i14 > 0) {
                        debugData = this.f4139f.f(i14);
                    }
                    kotlin.jvm.internal.i.e(debugData, "debugData");
                    debugData.a();
                    r rVar5 = qVar.f4098g;
                    synchronized (rVar5) {
                        array = rVar5.f4105g.values().toArray(new z[0]);
                        rVar5.f4109k = true;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (r0 < length3) {
                        z zVar = zVarArr[r0];
                        if (zVar.f4153f > readInt6 && zVar.i()) {
                            EnumC0356b enumC0356b4 = EnumC0356b.f4042l;
                            synchronized (zVar) {
                                if (zVar.h() == null) {
                                    zVar.f4164q = enumC0356b4;
                                    zVar.notifyAll();
                                }
                            }
                            qVar.f4098g.e(zVar.f4153f);
                        }
                        r0++;
                    }
                    return true;
                case 8:
                    try {
                        if (k4 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k4);
                        }
                        long readInt8 = 2147483647L & this.f4139f.readInt();
                        if (readInt8 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f4138i;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(true, i8, k4, readInt8));
                        }
                        if (i8 == 0) {
                            r rVar6 = qVar.f4098g;
                            synchronized (rVar6) {
                                rVar6.f4123z += readInt8;
                                rVar6.notifyAll();
                            }
                            return true;
                        }
                        z d8 = qVar.f4098g.d(i8);
                        if (d8 != null) {
                            synchronized (d8) {
                                d8.f4157j += readInt8;
                                if (readInt8 > 0) {
                                    d8.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e7) {
                        f4138i.fine(h.b(true, i8, k4, 8, i7));
                        throw e7;
                    }
                default:
                    this.f4139f.skip(k4);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4139f.close();
    }

    public final void d(q qVar, int i7, int i8, final int i9) {
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z8 = (i8 & 1) != 0;
        if ((i8 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i8 & 8) != 0) {
            byte readByte = this.f4139f.readByte();
            byte[] bArr = Y5.c.f3099a;
            i10 = readByte & 255;
        } else {
            i10 = 0;
        }
        final int a7 = t.a(i7, i8, i10);
        n6.h source = this.f4139f;
        kotlin.jvm.internal.i.e(source, "source");
        final r rVar = qVar.f4098g;
        if (i9 == 0 || (i9 & 1) != 0) {
            z d7 = rVar.d(i9);
            if (d7 == null) {
                qVar.f4098g.n(i9, EnumC0356b.f4039i);
                long j4 = a7;
                qVar.f4098g.h(j4);
                source.skip(j4);
            } else {
                TimeZone timeZone = Y5.e.f3102a;
                x xVar = d7.f4160m;
                long j7 = a7;
                xVar.getClass();
                long j8 = j7;
                while (true) {
                    if (j8 <= 0) {
                        z5 = z8;
                        z zVar = xVar.f4151k;
                        TimeZone timeZone2 = Y5.e.f3102a;
                        zVar.f4154g.h(j7);
                        xVar.f4151k.f4154g.f4119u.getClass();
                        break;
                    }
                    synchronized (xVar.f4151k) {
                        z6 = xVar.f4147g;
                        z5 = z8;
                        z7 = xVar.f4149i.f5524g + j8 > xVar.f4146f;
                    }
                    if (z7) {
                        source.skip(j8);
                        xVar.f4151k.g(EnumC0356b.f4041k);
                        break;
                    }
                    if (z6) {
                        source.skip(j8);
                        break;
                    }
                    long i11 = source.i(j8, xVar.f4148h);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    j8 -= i11;
                    z zVar2 = xVar.f4151k;
                    synchronized (zVar2) {
                        try {
                            if (xVar.f4150j) {
                                n6.f fVar = xVar.f4148h;
                                fVar.skip(fVar.f5524g);
                            } else {
                                n6.f fVar2 = xVar.f4149i;
                                boolean z9 = fVar2.f5524g == 0;
                                fVar2.H(xVar.f4148h);
                                if (z9) {
                                    zVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z8 = z5;
                }
                if (z5) {
                    d7.k(X5.n.f2972g, true);
                }
            }
        } else {
            final n6.f fVar3 = new n6.f();
            long j9 = a7;
            source.C(j9);
            source.i(j9, fVar3);
            a6.c.c(rVar.f4112n, rVar.f4106h + '[' + i9 + "] onData", new InterfaceC0732a(i9, fVar3, a7, z8) { // from class: e6.k

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f4084g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ n6.f f4085h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ int f4086i;

                @Override // x5.InterfaceC0732a
                public final Object invoke() {
                    r rVar2 = r.this;
                    int i12 = this.f4084g;
                    n6.f fVar4 = this.f4085h;
                    int i13 = this.f4086i;
                    try {
                        rVar2.f4114p.getClass();
                        fVar4.skip(i13);
                        rVar2.f4101B.n(i12, EnumC0356b.f4043m);
                        synchronized (rVar2) {
                            rVar2.f4103D.remove(Integer.valueOf(i12));
                        }
                    } catch (IOException unused) {
                    }
                    return k5.v.f5219a;
                }
            });
        }
        this.f4139f.skip(i10);
    }

    public final List e(int i7, int i8, int i9, int i10) {
        u uVar = this.f4140g;
        uVar.f4136j = i7;
        uVar.f4133g = i7;
        uVar.f4137k = i8;
        uVar.f4134h = i9;
        uVar.f4135i = i10;
        C0359e c0359e = this.f4141h;
        n6.q qVar = c0359e.f4058c;
        ArrayList arrayList = c0359e.f4057b;
        while (!qVar.a()) {
            byte readByte = qVar.readByte();
            byte[] bArr = Y5.c.f3099a;
            int i11 = readByte & 255;
            if (i11 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e4 = c0359e.e(i11, 127);
                int i12 = e4 - 1;
                if (i12 >= 0) {
                    C0358d[] c0358dArr = g.f4071a;
                    if (i12 <= c0358dArr.length - 1) {
                        arrayList.add(c0358dArr[i12]);
                    }
                }
                int length = c0359e.f4060e + 1 + (i12 - g.f4071a.length);
                if (length >= 0) {
                    C0358d[] c0358dArr2 = c0359e.f4059d;
                    if (length < c0358dArr2.length) {
                        C0358d c0358d = c0358dArr2[length];
                        kotlin.jvm.internal.i.b(c0358d);
                        arrayList.add(c0358d);
                    }
                }
                throw new IOException(W4.o.c("Header index too large ", e4));
            }
            if (i11 == 64) {
                C0358d[] c0358dArr3 = g.f4071a;
                n6.i d7 = c0359e.d();
                g.a(d7);
                c0359e.c(new C0358d(d7, c0359e.d()));
            } else if ((readByte & 64) == 64) {
                c0359e.c(new C0358d(c0359e.b(c0359e.e(i11, 63) - 1), c0359e.d()));
            } else if ((readByte & 32) == 32) {
                int e7 = c0359e.e(i11, 31);
                c0359e.f4056a = e7;
                if (e7 < 0 || e7 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c0359e.f4056a);
                }
                int i13 = c0359e.f4062g;
                if (e7 < i13) {
                    if (e7 == 0) {
                        C0358d[] c0358dArr4 = c0359e.f4059d;
                        AbstractC0505i.J(0, c0358dArr4.length, c0358dArr4);
                        c0359e.f4060e = c0359e.f4059d.length - 1;
                        c0359e.f4061f = 0;
                        c0359e.f4062g = 0;
                    } else {
                        c0359e.a(i13 - e7);
                    }
                }
            } else if (i11 == 16 || i11 == 0) {
                C0358d[] c0358dArr5 = g.f4071a;
                n6.i d8 = c0359e.d();
                g.a(d8);
                arrayList.add(new C0358d(d8, c0359e.d()));
            } else {
                arrayList.add(new C0358d(c0359e.b(c0359e.e(i11, 15) - 1), c0359e.d()));
            }
        }
        List P6 = AbstractC0506j.P(arrayList);
        arrayList.clear();
        return P6;
    }

    public final void g(q qVar, int i7, int i8, int i9) {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i11 = 0;
        boolean z5 = (i8 & 1) != 0;
        if ((i8 & 8) != 0) {
            byte readByte = this.f4139f.readByte();
            byte[] bArr = Y5.c.f3099a;
            i10 = readByte & 255;
        } else {
            i10 = 0;
        }
        if ((i8 & 32) != 0) {
            n6.h hVar = this.f4139f;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = Y5.c.f3099a;
            i7 -= 5;
        }
        List e4 = e(t.a(i7, i8, i10), i10, i8, i9);
        r rVar = qVar.f4098g;
        if (i9 != 0 && (i9 & 1) == 0) {
            a6.c.c(rVar.f4112n, rVar.f4106h + '[' + i9 + "] onHeaders", new l(rVar, i9, e4, z5));
            return;
        }
        synchronized (rVar) {
            z d7 = rVar.d(i9);
            if (d7 != null) {
                d7.k(Y5.e.g(e4), z5);
                return;
            }
            if (rVar.f4109k) {
                return;
            }
            if (i9 <= rVar.f4107i) {
                return;
            }
            if (i9 % 2 == rVar.f4108j % 2) {
                return;
            }
            z zVar = new z(i9, rVar, false, z5, Y5.e.g(e4));
            rVar.f4107i = i9;
            rVar.f4105g.put(Integer.valueOf(i9), zVar);
            a6.c.c(rVar.f4110l.d(), rVar.f4106h + '[' + i9 + "] onStream", new p(rVar, i11, zVar));
        }
    }

    public final void h(q qVar, int i7, int i8, int i9) {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i11 = 0;
        if ((i8 & 8) != 0) {
            byte readByte = this.f4139f.readByte();
            byte[] bArr = Y5.c.f3099a;
            i10 = readByte & 255;
        } else {
            i10 = 0;
        }
        int readInt = this.f4139f.readInt() & Integer.MAX_VALUE;
        List e4 = e(t.a(i7 - 4, i8, i10), i10, i8, i9);
        r rVar = qVar.f4098g;
        synchronized (rVar) {
            if (rVar.f4103D.contains(Integer.valueOf(readInt))) {
                rVar.n(readInt, EnumC0356b.f4039i);
                return;
            }
            rVar.f4103D.add(Integer.valueOf(readInt));
            a6.c.c(rVar.f4112n, rVar.f4106h + '[' + readInt + "] onRequest", new l(rVar, readInt, e4, i11));
        }
    }
}
