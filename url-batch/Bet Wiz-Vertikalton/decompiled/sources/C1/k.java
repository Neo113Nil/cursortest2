package C1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f187a;

    /* renamed from: b, reason: collision with root package name */
    public final p f188b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f189c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f190e;

    public k(v vVar) {
        e1.d.e(vVar, "source");
        p pVar = new p(vVar);
        this.f188b = pVar;
        Inflater inflater = new Inflater(true);
        this.f189c = inflater;
        this.d = new l(pVar, inflater);
        this.f190e = new CRC32();
    }

    public static void g(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // C1.v
    public final x a() {
        return this.f188b.f200a.a();
    }

    @Override // C1.v
    public final long b(f fVar, long j2) {
        p pVar;
        f fVar2;
        long j3;
        e1.d.e(fVar, "sink");
        byte b2 = this.f187a;
        CRC32 crc32 = this.f190e;
        p pVar2 = this.f188b;
        if (b2 == 0) {
            pVar2.q(10L);
            f fVar3 = pVar2.f201b;
            byte h = fVar3.h(3L);
            boolean z2 = ((h >> 1) & 1) == 1;
            if (z2) {
                h(fVar3, 0L, 10L);
            }
            g("ID1ID2", 8075, pVar2.n());
            pVar2.r(8L);
            if (((h >> 2) & 1) == 1) {
                pVar2.q(2L);
                if (z2) {
                    h(fVar3, 0L, 2L);
                }
                short m2 = fVar3.m();
                long j4 = ((short) (((m2 & 255) << 8) | ((m2 & 65280) >>> 8))) & 65535;
                pVar2.q(j4);
                if (z2) {
                    h(fVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                pVar2.r(j3);
            }
            if (((h >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long h2 = pVar2.h((byte) 0, 0L, Long.MAX_VALUE);
                if (h2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    pVar = pVar2;
                    h(fVar2, 0L, h2 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.r(h2 + 1);
            } else {
                pVar = pVar2;
                fVar2 = fVar3;
            }
            if (((h >> 4) & 1) == 1) {
                long h3 = pVar.h((byte) 0, 0L, Long.MAX_VALUE);
                if (h3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    h(fVar2, 0L, h3 + 1);
                }
                pVar.r(h3 + 1);
            }
            if (z2) {
                pVar.q(2L);
                short m3 = fVar2.m();
                g("FHCRC", (short) (((m3 & 255) << 8) | ((m3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f187a = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f187a == 1) {
            long j5 = fVar.f182b;
            long b3 = this.d.b(fVar, 8192L);
            if (b3 != -1) {
                h(fVar, j5, b3);
                return b3;
            }
            this.f187a = (byte) 2;
        }
        if (this.f187a != 2) {
            return -1L;
        }
        g("CRC", pVar.m(), (int) crc32.getValue());
        g("ISIZE", pVar.m(), (int) this.f189c.getBytesWritten());
        this.f187a = (byte) 3;
        if (pVar.g()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void h(f fVar, long j2, long j3) {
        q qVar = fVar.f181a;
        e1.d.b(qVar);
        while (true) {
            int i = qVar.f205c;
            int i2 = qVar.f204b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            qVar = qVar.f207f;
            e1.d.b(qVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(qVar.f205c - r6, j3);
            this.f190e.update(qVar.f203a, (int) (qVar.f204b + j2), min);
            j3 -= min;
            qVar = qVar.f207f;
            e1.d.b(qVar);
            j2 = 0;
        }
    }
}
