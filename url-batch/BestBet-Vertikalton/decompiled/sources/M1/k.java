package M1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f804a;

    /* renamed from: b, reason: collision with root package name */
    public final p f805b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f806c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f807e;

    public k(v vVar) {
        k1.e.e(vVar, "source");
        p pVar = new p(vVar);
        this.f805b = pVar;
        Inflater inflater = new Inflater(true);
        this.f806c = inflater;
        this.d = new l(pVar, inflater);
        this.f807e = new CRC32();
    }

    public static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // M1.v
    public final x b() {
        return this.f805b.f817a.b();
    }

    @Override // M1.v
    public final long c(f fVar, long j2) {
        p pVar;
        f fVar2;
        long j3;
        k1.e.e(fVar, "sink");
        byte b2 = this.f804a;
        CRC32 crc32 = this.f807e;
        p pVar2 = this.f805b;
        if (b2 == 0) {
            pVar2.w(10L);
            f fVar3 = pVar2.f818b;
            byte d = fVar3.d(3L);
            boolean z2 = ((d >> 1) & 1) == 1;
            if (z2) {
                d(fVar3, 0L, 10L);
            }
            a("ID1ID2", 8075, pVar2.t());
            pVar2.x(8L);
            if (((d >> 2) & 1) == 1) {
                pVar2.w(2L);
                if (z2) {
                    d(fVar3, 0L, 2L);
                }
                short s2 = fVar3.s();
                long j4 = ((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8))) & 65535;
                pVar2.w(j4);
                if (z2) {
                    d(fVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                pVar2.x(j3);
            }
            if (((d >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long d2 = pVar2.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    pVar = pVar2;
                    d(fVar2, 0L, d2 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.x(d2 + 1);
            } else {
                pVar = pVar2;
                fVar2 = fVar3;
            }
            if (((d >> 4) & 1) == 1) {
                long d3 = pVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    d(fVar2, 0L, d3 + 1);
                }
                pVar.x(d3 + 1);
            }
            if (z2) {
                pVar.w(2L);
                short s3 = fVar2.s();
                a("FHCRC", (short) (((s3 & 255) << 8) | ((s3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f804a = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f804a == 1) {
            long j5 = fVar.f799b;
            long c2 = this.d.c(fVar, 8192L);
            if (c2 != -1) {
                d(fVar, j5, c2);
                return c2;
            }
            this.f804a = (byte) 2;
        }
        if (this.f804a != 2) {
            return -1L;
        }
        a("CRC", pVar.s(), (int) crc32.getValue());
        a("ISIZE", pVar.s(), (int) this.f806c.getBytesWritten());
        this.f804a = (byte) 3;
        if (pVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void d(f fVar, long j2, long j3) {
        q qVar = fVar.f798a;
        k1.e.b(qVar);
        while (true) {
            int i = qVar.f822c;
            int i2 = qVar.f821b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            qVar = qVar.f824f;
            k1.e.b(qVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(qVar.f822c - r6, j3);
            this.f807e.update(qVar.f820a, (int) (qVar.f821b + j2), min);
            j3 -= min;
            qVar = qVar.f824f;
            k1.e.b(qVar);
            j2 = 0;
        }
    }
}
