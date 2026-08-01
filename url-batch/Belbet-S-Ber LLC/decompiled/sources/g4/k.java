package g4;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: f, reason: collision with root package name */
    public byte f1939f;

    /* renamed from: g, reason: collision with root package name */
    public final p f1940g;
    public final Inflater h;
    public final l i;

    /* renamed from: j, reason: collision with root package name */
    public final CRC32 f1941j;

    public k(v vVar) {
        i3.d.e(vVar, "source");
        p pVar = new p(vVar);
        this.f1940g = pVar;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new l(pVar, inflater);
        this.f1941j = new CRC32();
    }

    public static void m(String str, int i, int i4) {
        if (i4 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i4), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // g4.v
    public final x a() {
        return this.f1940g.f1949f.a();
    }

    @Override // g4.v
    public final long c(long j2, f fVar) {
        long j4;
        k kVar = this;
        byte b2 = kVar.f1939f;
        CRC32 crc32 = kVar.f1941j;
        p pVar = kVar.f1940g;
        if (b2 == 0) {
            pVar.i(10L);
            f fVar2 = pVar.f1950g;
            byte o4 = fVar2.o(3L);
            boolean z4 = ((o4 >> 1) & 1) == 1;
            if (z4) {
                kVar.n(fVar2, 0L, 10L);
            }
            m("ID1ID2", 8075, pVar.readShort());
            pVar.skip(8L);
            if (((o4 >> 2) & 1) == 1) {
                pVar.i(2L);
                if (z4) {
                    n(fVar2, 0L, 2L);
                }
                short readShort = fVar2.readShort();
                long j5 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                pVar.i(j5);
                if (z4) {
                    n(fVar2, 0L, j5);
                }
                pVar.skip(j5);
            }
            if (((o4 >> 3) & 1) == 1) {
                long n4 = pVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n4 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    j4 = 2;
                    n(fVar2, 0L, n4 + 1);
                } else {
                    j4 = 2;
                }
                pVar.skip(n4 + 1);
            } else {
                j4 = 2;
            }
            if (((o4 >> 4) & 1) == 1) {
                long j6 = j4;
                long n5 = pVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n5 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    j4 = j6;
                    kVar = this;
                    kVar.n(fVar2, 0L, n5 + 1);
                } else {
                    kVar = this;
                    j4 = j6;
                }
                pVar.skip(n5 + 1);
            } else {
                kVar = this;
            }
            if (z4) {
                pVar.i(j4);
                short readShort2 = fVar2.readShort();
                m("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            kVar.f1939f = (byte) 1;
        }
        if (kVar.f1939f == 1) {
            long j7 = fVar.f1935g;
            long c5 = kVar.i.c(8192L, fVar);
            if (c5 != -1) {
                kVar.n(fVar, j7, c5);
                return c5;
            }
            kVar.f1939f = (byte) 2;
        }
        if (kVar.f1939f == 2) {
            m("CRC", pVar.o(), (int) crc32.getValue());
            m("ISIZE", pVar.o(), (int) kVar.h.getBytesWritten());
            kVar.f1939f = (byte) 3;
            if (!pVar.m()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    public final void n(f fVar, long j2, long j4) {
        q qVar = fVar.f1934f;
        i3.d.b(qVar);
        while (true) {
            int i = qVar.f1953c;
            int i4 = qVar.f1952b;
            if (j2 < i - i4) {
                break;
            }
            j2 -= i - i4;
            qVar = qVar.f1955f;
            i3.d.b(qVar);
        }
        while (j4 > 0) {
            int min = (int) Math.min(qVar.f1953c - r6, j4);
            this.f1941j.update(qVar.f1951a, (int) (qVar.f1952b + j2), min);
            j4 -= min;
            qVar = qVar.f1955f;
            i3.d.b(qVar);
            j2 = 0;
        }
    }
}
