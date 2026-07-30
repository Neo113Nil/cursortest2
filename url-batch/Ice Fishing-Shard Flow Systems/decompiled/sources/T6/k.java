package T6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class k implements w {

    /* renamed from: d, reason: collision with root package name */
    public byte f2623d;

    /* renamed from: e, reason: collision with root package name */
    public final q f2624e;

    /* renamed from: i, reason: collision with root package name */
    public final Inflater f2625i;

    /* renamed from: l, reason: collision with root package name */
    public final l f2626l;

    /* renamed from: m, reason: collision with root package name */
    public final CRC32 f2627m;

    public k(h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        q qVar = new q(source);
        this.f2624e = qVar;
        Inflater inflater = new Inflater(true);
        this.f2625i = inflater;
        this.f2626l = new l(qVar, inflater);
        this.f2627m = new CRC32();
    }

    public static void a(String str, int i2, int i5) {
        if (i5 == i2) {
            return;
        }
        StringBuilder l7 = C4.p.l(str, ": actual 0x");
        l7.append(StringsKt.C(8, b.g(i5)));
        l7.append(" != expected 0x");
        l7.append(StringsKt.C(8, b.g(i2)));
        throw new IOException(l7.toString());
    }

    @Override // T6.w
    public final y b() {
        return this.f2624e.f2640d.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2626l.close();
    }

    public final void d(f fVar, long j, long j7) {
        r rVar = fVar.f2616d;
        Intrinsics.b(rVar);
        while (true) {
            int i2 = rVar.f2645c;
            int i5 = rVar.f2644b;
            if (j < i2 - i5) {
                break;
            }
            j -= i2 - i5;
            rVar = rVar.f2648f;
            Intrinsics.b(rVar);
        }
        while (j7 > 0) {
            int min = (int) Math.min(rVar.f2645c - r6, j7);
            this.f2627m.update(rVar.f2643a, (int) (rVar.f2644b + j), min);
            j7 -= min;
            rVar = rVar.f2648f;
            Intrinsics.b(rVar);
            j = 0;
        }
    }

    @Override // T6.w
    public final long o(long j, f sink) {
        long j7;
        k kVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        byte b7 = kVar.f2623d;
        CRC32 crc32 = kVar.f2627m;
        q qVar = kVar.f2624e;
        if (b7 == 0) {
            qVar.y(10L);
            f fVar = qVar.f2641e;
            byte g7 = fVar.g(3L);
            boolean z7 = ((g7 >> 1) & 1) == 1;
            if (z7) {
                kVar.d(fVar, 0L, 10L);
            }
            a("ID1ID2", 8075, qVar.readShort());
            qVar.skip(8L);
            if (((g7 >> 2) & 1) == 1) {
                qVar.y(2L);
                if (z7) {
                    d(fVar, 0L, 2L);
                }
                short readShort = fVar.readShort();
                long j8 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                qVar.y(j8);
                if (z7) {
                    d(fVar, 0L, j8);
                }
                qVar.skip(j8);
            }
            if (((g7 >> 3) & 1) == 1) {
                long d7 = qVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d7 == -1) {
                    throw new EOFException();
                }
                if (z7) {
                    j7 = 2;
                    d(fVar, 0L, d7 + 1);
                } else {
                    j7 = 2;
                }
                qVar.skip(d7 + 1);
            } else {
                j7 = 2;
            }
            if (((g7 >> 4) & 1) == 1) {
                long j9 = j7;
                long d8 = qVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d8 == -1) {
                    throw new EOFException();
                }
                if (z7) {
                    j7 = j9;
                    kVar = this;
                    kVar.d(fVar, 0L, d8 + 1);
                } else {
                    kVar = this;
                    j7 = j9;
                }
                qVar.skip(d8 + 1);
            } else {
                kVar = this;
            }
            if (z7) {
                qVar.y(j7);
                short readShort2 = fVar.readShort();
                a("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            kVar.f2623d = (byte) 1;
        }
        if (kVar.f2623d == 1) {
            long j10 = sink.f2617e;
            long o7 = kVar.f2626l.o(8192L, sink);
            if (o7 != -1) {
                kVar.d(sink, j10, o7);
                return o7;
            }
            kVar.f2623d = (byte) 2;
        }
        if (kVar.f2623d == 2) {
            qVar.y(4L);
            f fVar2 = qVar.f2641e;
            a("CRC", b.e(fVar2.readInt()), (int) crc32.getValue());
            qVar.y(4L);
            a("ISIZE", b.e(fVar2.readInt()), (int) kVar.f2625i.getBytesWritten());
            kVar.f2623d = (byte) 3;
            if (!qVar.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
