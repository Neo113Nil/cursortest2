package p3;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: f, reason: collision with root package name */
    public byte f3032f;
    public final p g;
    public final Inflater h;

    /* renamed from: i, reason: collision with root package name */
    public final l f3033i;

    /* renamed from: j, reason: collision with root package name */
    public final CRC32 f3034j;

    public k(v vVar) {
        u2.c.e(vVar, "source");
        p pVar = new p(vVar);
        this.g = pVar;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.f3033i = new l(pVar, inflater);
        this.f3034j = new CRC32();
    }

    public static void m(String str, int i4, int i5) {
        if (i5 != i4) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i4)}, 3)));
        }
    }

    @Override // p3.v
    public final x a() {
        return this.g.f3040f.a();
    }

    @Override // p3.v
    public final long c(long j4, f fVar) {
        long j5;
        k kVar = this;
        byte b2 = kVar.f3032f;
        CRC32 crc32 = kVar.f3034j;
        p pVar = kVar.g;
        if (b2 == 0) {
            pVar.i(10L);
            f fVar2 = pVar.g;
            byte o4 = fVar2.o(3L);
            boolean z3 = ((o4 >> 1) & 1) == 1;
            if (z3) {
                kVar.n(fVar2, 0L, 10L);
            }
            m("ID1ID2", 8075, pVar.readShort());
            pVar.skip(8L);
            if (((o4 >> 2) & 1) == 1) {
                pVar.i(2L);
                if (z3) {
                    n(fVar2, 0L, 2L);
                }
                short readShort = fVar2.readShort();
                long j6 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                pVar.i(j6);
                if (z3) {
                    n(fVar2, 0L, j6);
                }
                pVar.skip(j6);
            }
            if (((o4 >> 3) & 1) == 1) {
                long n3 = pVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n3 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    j5 = 2;
                    n(fVar2, 0L, n3 + 1);
                } else {
                    j5 = 2;
                }
                pVar.skip(n3 + 1);
            } else {
                j5 = 2;
            }
            if (((o4 >> 4) & 1) == 1) {
                long j7 = j5;
                long n4 = pVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n4 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    j5 = j7;
                    kVar = this;
                    kVar.n(fVar2, 0L, n4 + 1);
                } else {
                    kVar = this;
                    j5 = j7;
                }
                pVar.skip(n4 + 1);
            } else {
                kVar = this;
            }
            if (z3) {
                pVar.i(j5);
                short readShort2 = fVar2.readShort();
                m("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            kVar.f3032f = (byte) 1;
        }
        if (kVar.f3032f == 1) {
            long j8 = fVar.g;
            long c = kVar.f3033i.c(8192L, fVar);
            if (c != -1) {
                kVar.n(fVar, j8, c);
                return c;
            }
            kVar.f3032f = (byte) 2;
        }
        if (kVar.f3032f == 2) {
            m("CRC", pVar.o(), (int) crc32.getValue());
            m("ISIZE", pVar.o(), (int) kVar.h.getBytesWritten());
            kVar.f3032f = (byte) 3;
            if (!pVar.m()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3033i.close();
    }

    public final void n(f fVar, long j4, long j5) {
        q qVar = fVar.f3028f;
        u2.c.b(qVar);
        while (true) {
            int i4 = qVar.c;
            int i5 = qVar.f3042b;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            qVar = qVar.f3045f;
            u2.c.b(qVar);
        }
        while (j5 > 0) {
            int min = (int) Math.min(qVar.c - r6, j5);
            this.f3034j.update(qVar.f3041a, (int) (qVar.f3042b + j4), min);
            j5 -= min;
            qVar = qVar.f3045f;
            u2.c.b(qVar);
            j4 = 0;
        }
    }
}
