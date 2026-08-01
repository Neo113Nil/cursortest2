package F1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f252a;

    /* renamed from: b, reason: collision with root package name */
    public final p f253b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f254c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f255e;

    public k(v vVar) {
        h1.d.e(vVar, "source");
        p pVar = new p(vVar);
        this.f253b = pVar;
        Inflater inflater = new Inflater(true);
        this.f254c = inflater;
        this.d = new l(pVar, inflater);
        this.f255e = new CRC32();
    }

    public static void g(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // F1.v
    public final x a() {
        return this.f253b.f265a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // F1.v
    public final long d(f fVar, long j2) {
        p pVar;
        f fVar2;
        long j3;
        h1.d.e(fVar, "sink");
        byte b2 = this.f252a;
        CRC32 crc32 = this.f255e;
        p pVar2 = this.f253b;
        if (b2 == 0) {
            pVar2.q(10L);
            f fVar3 = pVar2.f266b;
            byte h2 = fVar3.h(3L);
            boolean z2 = ((h2 >> 1) & 1) == 1;
            if (z2) {
                h(fVar3, 0L, 10L);
            }
            g("ID1ID2", 8075, pVar2.n());
            pVar2.r(8L);
            if (((h2 >> 2) & 1) == 1) {
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
            if (((h2 >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long h3 = pVar2.h((byte) 0, 0L, Long.MAX_VALUE);
                if (h3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    pVar = pVar2;
                    h(fVar2, 0L, h3 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.r(h3 + 1);
            } else {
                pVar = pVar2;
                fVar2 = fVar3;
            }
            if (((h2 >> 4) & 1) == 1) {
                long h4 = pVar.h((byte) 0, 0L, Long.MAX_VALUE);
                if (h4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    h(fVar2, 0L, h4 + 1);
                }
                pVar.r(h4 + 1);
            }
            if (z2) {
                pVar.q(2L);
                short m3 = fVar2.m();
                g("FHCRC", (short) (((m3 & 255) << 8) | ((m3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f252a = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f252a == 1) {
            long j5 = fVar.f247b;
            long d = this.d.d(fVar, 8192L);
            if (d != -1) {
                h(fVar, j5, d);
                return d;
            }
            this.f252a = (byte) 2;
        }
        if (this.f252a != 2) {
            return -1L;
        }
        g("CRC", pVar.m(), (int) crc32.getValue());
        g("ISIZE", pVar.m(), (int) this.f254c.getBytesWritten());
        this.f252a = (byte) 3;
        if (pVar.g()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    public final void h(f fVar, long j2, long j3) {
        q qVar = fVar.f246a;
        h1.d.b(qVar);
        while (true) {
            int i = qVar.f270c;
            int i2 = qVar.f269b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            qVar = qVar.f272f;
            h1.d.b(qVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(qVar.f270c - r6, j3);
            this.f255e.update(qVar.f268a, (int) (qVar.f269b + j2), min);
            j3 -= min;
            qVar = qVar.f272f;
            h1.d.b(qVar);
            j2 = 0;
        }
    }
}
