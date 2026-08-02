package T3;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f2981a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2982b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f2983c;

    /* renamed from: d, reason: collision with root package name */
    public final m f2984d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f2985e;

    public l(v source) {
        kotlin.jvm.internal.i.e(source, "source");
        p pVar = new p(source);
        this.f2982b = pVar;
        Inflater inflater = new Inflater(true);
        this.f2983c = inflater;
        this.f2984d = new m(pVar, inflater);
        this.f2985e = new CRC32();
    }

    public static void a(int i4, int i5, String str) {
        if (i5 != i4) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i4)}, 3)));
        }
    }

    public final void b(g gVar, long j4, long j5) {
        q qVar = gVar.f2974a;
        kotlin.jvm.internal.i.b(qVar);
        while (true) {
            int i4 = qVar.f2999c;
            int i5 = qVar.f2998b;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            qVar = qVar.f3002f;
            kotlin.jvm.internal.i.b(qVar);
        }
        while (j5 > 0) {
            int min = (int) Math.min(qVar.f2999c - r6, j5);
            this.f2985e.update(qVar.f2997a, (int) (qVar.f2998b + j4), min);
            j5 -= min;
            qVar = qVar.f3002f;
            kotlin.jvm.internal.i.b(qVar);
            j4 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2984d.close();
    }

    @Override // T3.v
    public final x d() {
        return this.f2982b.f2994a.d();
    }

    @Override // T3.v
    public final long j(g sink, long j4) {
        long j5;
        l lVar = this;
        kotlin.jvm.internal.i.e(sink, "sink");
        byte b4 = lVar.f2981a;
        CRC32 crc32 = lVar.f2985e;
        p pVar = lVar.f2982b;
        if (b4 == 0) {
            pVar.p(10L);
            g gVar = pVar.f2995b;
            byte e4 = gVar.e(3L);
            boolean z = ((e4 >> 1) & 1) == 1;
            if (z) {
                lVar.b(gVar, 0L, 10L);
            }
            a(8075, pVar.readShort(), "ID1ID2");
            pVar.skip(8L);
            if (((e4 >> 2) & 1) == 1) {
                pVar.p(2L);
                if (z) {
                    b(gVar, 0L, 2L);
                }
                short readShort = gVar.readShort();
                long j6 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                pVar.p(j6);
                if (z) {
                    b(gVar, 0L, j6);
                }
                pVar.skip(j6);
            }
            if (((e4 >> 3) & 1) == 1) {
                long b5 = pVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b5 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j5 = 2;
                    b(gVar, 0L, b5 + 1);
                } else {
                    j5 = 2;
                }
                pVar.skip(b5 + 1);
            } else {
                j5 = 2;
            }
            if (((e4 >> 4) & 1) == 1) {
                long j7 = j5;
                long b6 = pVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b6 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j5 = j7;
                    lVar = this;
                    lVar.b(gVar, 0L, b6 + 1);
                } else {
                    lVar = this;
                    j5 = j7;
                }
                pVar.skip(b6 + 1);
            } else {
                lVar = this;
            }
            if (z) {
                pVar.p(j5);
                short readShort2 = gVar.readShort();
                a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            lVar.f2981a = (byte) 1;
        }
        if (lVar.f2981a == 1) {
            long j8 = sink.f2975b;
            long j9 = lVar.f2984d.j(sink, 8192L);
            if (j9 != -1) {
                lVar.b(sink, j8, j9);
                return j9;
            }
            lVar.f2981a = (byte) 2;
        }
        if (lVar.f2981a == 2) {
            a(pVar.e(), (int) crc32.getValue(), "CRC");
            a(pVar.e(), (int) lVar.f2983c.getBytesWritten(), "ISIZE");
            lVar.f2981a = (byte) 3;
            if (!pVar.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
