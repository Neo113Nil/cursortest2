package z3;

import A.AbstractC0017m;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements F {

    /* renamed from: d, reason: collision with root package name */
    public byte f12019d;

    /* renamed from: e, reason: collision with root package name */
    public final z f12020e;

    /* renamed from: i, reason: collision with root package name */
    public final Inflater f12021i;

    /* renamed from: j, reason: collision with root package name */
    public final p f12022j;

    /* renamed from: k, reason: collision with root package name */
    public final CRC32 f12023k;

    public o(F source) {
        Intrinsics.checkNotNullParameter(source, "source");
        z zVar = new z(source);
        this.f12020e = zVar;
        Inflater inflater = new Inflater(true);
        this.f12021i = inflater;
        this.f12022j = new p(zVar, inflater);
        this.f12023k = new CRC32();
    }

    public static void a(String str, int i2, int i4) {
        if (i4 == i2) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i4), Integer.valueOf(i2)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        throw new IOException(format);
    }

    public final void b(C1448f c1448f, long j4, long j5) {
        A a4 = c1448f.f11998d;
        Intrinsics.c(a4);
        while (true) {
            int i2 = a4.f11964c;
            int i4 = a4.f11963b;
            if (j4 < i2 - i4) {
                break;
            }
            j4 -= i2 - i4;
            a4 = a4.f11967f;
            Intrinsics.c(a4);
        }
        while (j5 > 0) {
            int min = (int) Math.min(a4.f11964c - r6, j5);
            this.f12023k.update(a4.f11962a, (int) (a4.f11963b + j4), min);
            j5 -= min;
            a4 = a4.f11967f;
            Intrinsics.c(a4);
            j4 = 0;
        }
    }

    @Override // z3.F
    public final H c() {
        return this.f12020e.f12044d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12022j.close();
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        z zVar;
        C1448f c1448f;
        long j5;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        if (j4 == 0) {
            return 0L;
        }
        byte b4 = this.f12019d;
        CRC32 crc32 = this.f12023k;
        z zVar2 = this.f12020e;
        if (b4 == 0) {
            zVar2.t(10L);
            C1448f c1448f2 = zVar2.f12045e;
            byte b5 = c1448f2.b(3L);
            boolean z4 = ((b5 >> 1) & 1) == 1;
            if (z4) {
                b(c1448f2, 0L, 10L);
            }
            a("ID1ID2", 8075, zVar2.k());
            zVar2.u(8L);
            if (((b5 >> 2) & 1) == 1) {
                zVar2.t(2L);
                if (z4) {
                    b(c1448f2, 0L, 2L);
                }
                long p4 = c1448f2.p() & 65535;
                zVar2.t(p4);
                if (z4) {
                    b(c1448f2, 0L, p4);
                    j5 = p4;
                } else {
                    j5 = p4;
                }
                zVar2.u(j5);
            }
            if (((b5 >> 3) & 1) == 1) {
                c1448f = c1448f2;
                long b6 = zVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b6 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    zVar = zVar2;
                    b(c1448f, 0L, b6 + 1);
                } else {
                    zVar = zVar2;
                }
                zVar.u(b6 + 1);
            } else {
                c1448f = c1448f2;
                zVar = zVar2;
            }
            if (((b5 >> 4) & 1) == 1) {
                long b7 = zVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b7 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    b(c1448f, 0L, b7 + 1);
                }
                zVar.u(b7 + 1);
            }
            if (z4) {
                a("FHCRC", zVar.n(), (short) crc32.getValue());
                crc32.reset();
            }
            this.f12019d = (byte) 1;
        } else {
            zVar = zVar2;
        }
        if (this.f12019d == 1) {
            long j6 = sink.f11999e;
            long l4 = this.f12022j.l(sink, j4);
            if (l4 != -1) {
                b(sink, j6, l4);
                return l4;
            }
            this.f12019d = (byte) 2;
        }
        if (this.f12019d != 2) {
            return -1L;
        }
        a("CRC", zVar.i(), (int) crc32.getValue());
        a("ISIZE", zVar.i(), (int) this.f12021i.getBytesWritten());
        this.f12019d = (byte) 3;
        if (zVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
