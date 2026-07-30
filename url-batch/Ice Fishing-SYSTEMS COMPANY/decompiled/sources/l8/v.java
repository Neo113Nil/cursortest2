package l8;

import a.AbstractC0415a;
import com.google.android.gms.internal.ads.CL;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import r7.AbstractC4978i;
import r7.AbstractC4979j;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class v implements Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f39196w;

    /* renamed from: n, reason: collision with root package name */
    public final u8.r f39197n;

    /* renamed from: u, reason: collision with root package name */
    public final u f39198u;

    /* renamed from: v, reason: collision with root package name */
    public final C4713e f39199v;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        kotlin.jvm.internal.h.d(logger, "getLogger(...)");
        f39196w = logger;
    }

    public v(u8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39197n = source;
        u uVar = new u(source);
        this.f39198u = uVar;
        this.f39199v = new C4713e(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0250, code lost:
    
        throw new java.io.IOException(com.google.android.gms.internal.ads.CL.i(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z8, q qVar) {
        EnumC4710b enumC4710b;
        EnumC4710b enumC4710b2;
        Object[] array;
        int i = 1;
        int i4 = 0;
        try {
            this.f39197n.D(9L);
            int k6 = f8.c.k(this.f39197n);
            if (k6 > 16384) {
                throw new IOException(CL.i(k6, "FRAME_SIZE_ERROR: "));
            }
            int j9 = this.f39197n.j() & 255;
            byte j10 = this.f39197n.j();
            int i9 = j10 & 255;
            int z9 = this.f39197n.z();
            int i10 = Integer.MAX_VALUE & z9;
            if (j9 != 8) {
                Logger logger = f39196w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.b(i10, k6, j9, i9, true));
                }
            }
            if (z8 && j9 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + h.a(j9));
            }
            switch (j9) {
                case 0:
                    b(qVar, k6, i9, i10);
                    return true;
                case 1:
                    i(qVar, k6, i9, i10);
                    return true;
                case 2:
                    if (k6 != 5) {
                        throw new IOException(D.y.i(k6, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    u8.r rVar = this.f39197n;
                    rVar.z();
                    rVar.j();
                    return true;
                case 3:
                    if (k6 != 4) {
                        throw new IOException(D.y.i(k6, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int z10 = this.f39197n.z();
                    EnumC4710b.f39098u.getClass();
                    EnumC4710b[] values = EnumC4710b.values();
                    int length = values.length;
                    while (true) {
                        if (i4 < length) {
                            EnumC4710b enumC4710b3 = values[i4];
                            if (enumC4710b3.f39104n == z10) {
                                enumC4710b = enumC4710b3;
                            } else {
                                i4++;
                            }
                        } else {
                            enumC4710b = null;
                        }
                    }
                    if (enumC4710b == null) {
                        throw new IOException(CL.i(z10, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    r rVar2 = qVar.f39156u;
                    rVar2.getClass();
                    if (i10 == 0 || (z9 & 1) != 0) {
                        z g9 = rVar2.g(i10);
                        if (g9 != null) {
                            synchronized (g9) {
                                if (g9.g() == null) {
                                    g9.f39215E = enumC4710b;
                                    g9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    h8.c.c(rVar2.f39159B, rVar2.f39177v + '[' + i10 + "] onReset", new l(rVar2, i10, enumC4710b, i));
                    return true;
                case 4:
                    if (i10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((j10 & 1) != 0) {
                        if (k6 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (k6 % 6 != 0) {
                        throw new IOException(CL.i(k6, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    D d2 = new D();
                    J7.a C7 = AbstractC0415a.C(AbstractC0415a.E(0, k6), 6);
                    int i11 = C7.f1464n;
                    int i12 = C7.f1465u;
                    int i13 = C7.f1466v;
                    if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                        while (true) {
                            u8.r rVar3 = this.f39197n;
                            short B8 = rVar3.B();
                            byte[] bArr = f8.c.f37814a;
                            int i14 = B8 & 65535;
                            int z11 = rVar3.z();
                            if (i14 != 2) {
                                if (i14 != 4) {
                                    if (i14 == 5 && (z11 < 16384 || z11 > 16777215)) {
                                    }
                                } else if (z11 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (z11 != 0 && z11 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            d2.c(i14, z11);
                            if (i11 != i12) {
                                i11 += i13;
                            }
                        }
                    }
                    r rVar4 = qVar.f39156u;
                    h8.c.c(rVar4.f39158A, AbstractC5051n.g(new StringBuilder(), rVar4.f39177v, " applyAndAckSettings"), new p(i, qVar, d2));
                    return true;
                case 5:
                    j(qVar, k6, i9, i10);
                    return true;
                case 6:
                    if (k6 != 8) {
                        throw new IOException(CL.i(k6, "TYPE_PING length != 8: "));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int z12 = this.f39197n.z();
                    final int z13 = this.f39197n.z();
                    if ((j10 & 1) == 0) {
                        h8.c cVar = qVar.f39156u.f39158A;
                        String g10 = AbstractC5051n.g(new StringBuilder(), qVar.f39156u.f39177v, " ping");
                        final r rVar5 = qVar.f39156u;
                        h8.c.c(cVar, g10, new E7.a() { // from class: l8.o
                            @Override // E7.a
                            public final Object invoke() {
                                int i15 = z12;
                                int i16 = z13;
                                r rVar6 = r.this;
                                rVar6.getClass();
                                try {
                                    rVar6.f39172P.k(i15, i16, true);
                                } catch (IOException e6) {
                                    EnumC4710b enumC4710b4 = EnumC4710b.f39100w;
                                    rVar6.a(enumC4710b4, enumC4710b4, e6);
                                }
                                return q7.v.f40183a;
                            }
                        });
                        return true;
                    }
                    r rVar6 = qVar.f39156u;
                    synchronized (rVar6) {
                        try {
                            if (z12 == 1) {
                                rVar6.f39162E++;
                            } else if (z12 == 2) {
                                rVar6.f39164G++;
                            } else if (z12 == 3) {
                                rVar6.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (k6 < 8) {
                        throw new IOException(CL.i(k6, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int z14 = this.f39197n.z();
                    int z15 = this.f39197n.z();
                    int i15 = k6 - 8;
                    EnumC4710b.f39098u.getClass();
                    EnumC4710b[] values2 = EnumC4710b.values();
                    int length2 = values2.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length2) {
                            EnumC4710b enumC4710b4 = values2[i16];
                            if (enumC4710b4.f39104n == z15) {
                                enumC4710b2 = enumC4710b4;
                            } else {
                                i16++;
                            }
                        } else {
                            enumC4710b2 = null;
                        }
                    }
                    if (enumC4710b2 == null) {
                        throw new IOException(CL.i(z15, "TYPE_GOAWAY unexpected error code: "));
                    }
                    u8.h debugData = u8.h.f41278w;
                    if (i15 > 0) {
                        debugData = this.f39197n.k(i15);
                    }
                    kotlin.jvm.internal.h.e(debugData, "debugData");
                    debugData.a();
                    r rVar7 = qVar.f39156u;
                    synchronized (rVar7) {
                        array = rVar7.f39176u.values().toArray(new z[0]);
                        rVar7.f39180y = true;
                    }
                    z[] zVarArr = (z[]) array;
                    int length3 = zVarArr.length;
                    while (i4 < length3) {
                        z zVar = zVarArr[i4];
                        if (zVar.f39217n > z14 && zVar.h()) {
                            EnumC4710b enumC4710b5 = EnumC4710b.f39103z;
                            synchronized (zVar) {
                                if (zVar.g() == null) {
                                    zVar.f39215E = enumC4710b5;
                                    zVar.notifyAll();
                                }
                            }
                            qVar.f39156u.g(zVar.f39217n);
                        }
                        i4++;
                    }
                    return true;
                case 8:
                    try {
                        if (k6 != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k6);
                        }
                        long z16 = this.f39197n.z() & 2147483647L;
                        if (z16 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f39196w;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(h.c(i10, k6, z16, true));
                        }
                        if (i10 == 0) {
                            r rVar8 = qVar.f39156u;
                            synchronized (rVar8) {
                                rVar8.f39170N += z16;
                                rVar8.notifyAll();
                            }
                            return true;
                        }
                        z b9 = qVar.f39156u.b(i10);
                        if (b9 != null) {
                            synchronized (b9) {
                                b9.f39221x += z16;
                                if (z16 > 0) {
                                    b9.notifyAll();
                                }
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e6) {
                        f39196w.fine(h.b(i10, k6, 8, i9, true));
                        throw e6;
                    }
                default:
                    this.f39197n.E(k6);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(q qVar, int i, int i4, final int i9) {
        int i10;
        boolean z8;
        boolean z9;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final boolean z10 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i4 & 8) != 0) {
            byte j9 = this.f39197n.j();
            byte[] bArr = f8.c.f37814a;
            i10 = j9 & 255;
        } else {
            i10 = 0;
        }
        final int a9 = t.a(i, i4, i10);
        u8.r source = this.f39197n;
        kotlin.jvm.internal.h.e(source, "source");
        qVar.f39156u.getClass();
        if (i9 == 0 || (i9 & 1) != 0) {
            z b9 = qVar.f39156u.b(i9);
            if (b9 == null) {
                qVar.f39156u.m(i9, EnumC4710b.f39100w);
                long j10 = a9;
                qVar.f39156u.j(j10);
                source.E(j10);
            } else {
                TimeZone timeZone = f8.d.f37815a;
                x xVar = b9.f39211A;
                long j11 = a9;
                xVar.getClass();
                long j12 = j11;
                while (true) {
                    if (j12 <= 0) {
                        TimeZone timeZone2 = f8.d.f37815a;
                        xVar.f39209y.f39218u.j(j11);
                        xVar.f39209y.f39218u.f39166I.getClass();
                        break;
                    }
                    synchronized (xVar.f39209y) {
                        z8 = xVar.f39205u;
                        z9 = xVar.f39207w.f41277u + j12 > xVar.f39204n;
                    }
                    if (z9) {
                        source.E(j12);
                        xVar.f39209y.f(EnumC4710b.f39102y);
                        break;
                    }
                    if (z8) {
                        source.E(j12);
                        break;
                    }
                    long f6 = source.f(j12, xVar.f39206v);
                    if (f6 == -1) {
                        throw new EOFException();
                    }
                    j12 -= f6;
                    z zVar = xVar.f39209y;
                    synchronized (zVar) {
                        try {
                            if (xVar.f39208x) {
                                u8.e eVar = xVar.f39206v;
                                eVar.H(eVar.f41277u);
                            } else {
                                u8.e eVar2 = xVar.f39207w;
                                boolean z11 = eVar2.f41277u == 0;
                                eVar2.W(xVar.f39206v);
                                if (z11) {
                                    zVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z10) {
                    b9.k(e8.m.f37427u, true);
                }
            }
        } else {
            final r rVar = qVar.f39156u;
            rVar.getClass();
            final u8.e eVar3 = new u8.e();
            long j13 = a9;
            source.D(j13);
            source.f(j13, eVar3);
            h8.c.c(rVar.f39159B, rVar.f39177v + '[' + i9 + "] onData", new E7.a(i9, eVar3, a9, z10) { // from class: l8.k

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f39142u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ u8.e f39143v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f39144w;

                @Override // E7.a
                public final Object invoke() {
                    r rVar2 = r.this;
                    int i11 = this.f39142u;
                    u8.e eVar4 = this.f39143v;
                    int i12 = this.f39144w;
                    try {
                        rVar2.f39161D.getClass();
                        eVar4.H(i12);
                        rVar2.f39172P.m(i11, EnumC4710b.f39096A);
                        synchronized (rVar2) {
                            rVar2.f39174R.remove(Integer.valueOf(i11));
                        }
                    } catch (IOException unused) {
                    }
                    return q7.v.f40183a;
                }
            });
        }
        this.f39197n.E(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39197n.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f39114a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g(int i, int i4, int i9, int i10) {
        int e6;
        u uVar = this.f39198u;
        uVar.f39194x = i;
        uVar.f39191u = i;
        uVar.f39195y = i4;
        uVar.f39192v = i9;
        uVar.f39193w = i10;
        while (true) {
            C4713e c4713e = this.f39199v;
            u8.r rVar = c4713e.f39116c;
            boolean b9 = rVar.b();
            ArrayList arrayList = c4713e.f39115b;
            if (b9) {
                List R8 = AbstractC4979j.R(arrayList);
                arrayList.clear();
                return R8;
            }
            byte j9 = rVar.j();
            byte[] bArr = f8.c.f37814a;
            int i11 = j9 & 255;
            if (i11 == 128) {
                throw new IOException("index == 0");
            }
            if ((j9 & com.anythink.core.common.s.a.c.f16474a) == 128) {
                e6 = c4713e.e(i11, com.anythink.expressad.video.module.a.a.f21886R);
                int i12 = e6 - 1;
                if (i12 >= 0) {
                    C4712d[] c4712dArr = g.f39129a;
                    if (i12 <= c4712dArr.length - 1) {
                        arrayList.add(c4712dArr[i12]);
                    }
                }
                int length = c4713e.f39118e + 1 + (i12 - g.f39129a.length);
                if (length < 0) {
                    break;
                }
                C4712d[] c4712dArr2 = c4713e.f39117d;
                if (length >= c4712dArr2.length) {
                    break;
                }
                C4712d c4712d = c4712dArr2[length];
                kotlin.jvm.internal.h.b(c4712d);
                arrayList.add(c4712d);
            } else if (i11 == 64) {
                C4712d[] c4712dArr3 = g.f39129a;
                u8.h d2 = c4713e.d();
                g.a(d2);
                c4713e.c(new C4712d(d2, c4713e.d()));
            } else if ((j9 & com.anythink.core.common.s.a.c.f16475b) == 64) {
                c4713e.c(new C4712d(c4713e.b(c4713e.e(i11, 63) - 1), c4713e.d()));
            } else if ((j9 & 32) == 32) {
                int e9 = c4713e.e(i11, 31);
                c4713e.f39114a = e9;
                if (e9 < 0 || e9 > 4096) {
                    break;
                }
                int i13 = c4713e.f39120g;
                if (e9 < i13) {
                    if (e9 == 0) {
                        C4712d[] c4712dArr4 = c4713e.f39117d;
                        AbstractC4978i.M(c4712dArr4, 0, c4712dArr4.length);
                        c4713e.f39118e = c4713e.f39117d.length - 1;
                        c4713e.f39119f = 0;
                        c4713e.f39120g = 0;
                    } else {
                        c4713e.a(i13 - e9);
                    }
                }
            } else if (i11 == 16 || i11 == 0) {
                C4712d[] c4712dArr5 = g.f39129a;
                u8.h d3 = c4713e.d();
                g.a(d3);
                arrayList.add(new C4712d(d3, c4713e.d()));
            } else {
                arrayList.add(new C4712d(c4713e.b(c4713e.e(i11, 15) - 1), c4713e.d()));
            }
        }
        throw new IOException(CL.i(e6, "Header index too large "));
    }

    public final void i(q qVar, int i, int i4, int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z8 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte j9 = this.f39197n.j();
            byte[] bArr = f8.c.f37814a;
            i10 = j9 & 255;
        } else {
            i10 = 0;
        }
        if ((i4 & 32) != 0) {
            u8.r rVar = this.f39197n;
            rVar.z();
            rVar.j();
            byte[] bArr2 = f8.c.f37814a;
            i -= 5;
        }
        List g9 = g(t.a(i, i4, i10), i10, i4, i9);
        qVar.f39156u.getClass();
        if (i9 != 0 && (i9 & 1) == 0) {
            r rVar2 = qVar.f39156u;
            rVar2.getClass();
            h8.c.c(rVar2.f39159B, rVar2.f39177v + '[' + i9 + "] onHeaders", new l(rVar2, i9, g9, z8));
            return;
        }
        r rVar3 = qVar.f39156u;
        synchronized (rVar3) {
            z b9 = rVar3.b(i9);
            if (b9 != null) {
                b9.k(f8.d.h(g9), z8);
                return;
            }
            if (rVar3.f39180y) {
                return;
            }
            if (i9 <= rVar3.f39178w) {
                return;
            }
            if (i9 % 2 == rVar3.f39179x % 2) {
                return;
            }
            z zVar = new z(i9, rVar3, false, z8, f8.d.h(g9));
            rVar3.f39178w = i9;
            rVar3.f39176u.put(Integer.valueOf(i9), zVar);
            h8.c.c(rVar3.f39181z.d(), rVar3.f39177v + '[' + i9 + "] onStream", new p(i11, rVar3, zVar));
        }
    }

    public final void j(q qVar, int i, int i4, int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte j9 = this.f39197n.j();
            byte[] bArr = f8.c.f37814a;
            i10 = j9 & 255;
        } else {
            i10 = 0;
        }
        int z8 = this.f39197n.z() & Integer.MAX_VALUE;
        List g9 = g(t.a(i - 4, i4, i10), i10, i4, i9);
        r rVar = qVar.f39156u;
        rVar.getClass();
        synchronized (rVar) {
            if (rVar.f39174R.contains(Integer.valueOf(z8))) {
                rVar.m(z8, EnumC4710b.f39100w);
                return;
            }
            rVar.f39174R.add(Integer.valueOf(z8));
            h8.c.c(rVar.f39159B, rVar.f39177v + '[' + z8 + "] onRequest", new l(rVar, z8, g9, i11));
        }
    }
}
