package M1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f832a;

    /* renamed from: b, reason: collision with root package name */
    public final p f833b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f834c;

    /* renamed from: d, reason: collision with root package name */
    public final l f835d;
    public final CRC32 e;

    public k(v vVar) {
        j1.h.e(vVar, "source");
        p pVar = new p(vVar);
        this.f833b = pVar;
        Inflater inflater = new Inflater(true);
        this.f834c = inflater;
        this.f835d = new l(pVar, inflater);
        this.e = new CRC32();
    }

    public static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // M1.v
    public final x b() {
        return this.f833b.f846a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f835d.close();
    }

    public final void d(f fVar, long j, long j2) {
        q qVar = fVar.f826a;
        j1.h.b(qVar);
        while (true) {
            int i = qVar.f851c;
            int i2 = qVar.f850b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            qVar = qVar.f853f;
            j1.h.b(qVar);
        }
        while (j2 > 0) {
            int min = (int) Math.min(qVar.f851c - r6, j2);
            this.e.update(qVar.f849a, (int) (qVar.f850b + j), min);
            j2 -= min;
            qVar = qVar.f853f;
            j1.h.b(qVar);
            j = 0;
        }
    }

    @Override // M1.v
    public final long h(f fVar, long j) {
        p pVar;
        f fVar2;
        long j2;
        j1.h.e(fVar, "sink");
        byte b2 = this.f832a;
        CRC32 crc32 = this.e;
        p pVar2 = this.f833b;
        if (b2 == 0) {
            pVar2.I(10L);
            f fVar3 = pVar2.f847b;
            byte d2 = fVar3.d(3L);
            boolean z2 = ((d2 >> 1) & 1) == 1;
            if (z2) {
                d(fVar3, 0L, 10L);
            }
            a("ID1ID2", 8075, pVar2.F());
            pVar2.J(8L);
            if (((d2 >> 2) & 1) == 1) {
                pVar2.I(2L);
                if (z2) {
                    d(fVar3, 0L, 2L);
                }
                short E2 = fVar3.E();
                long j3 = ((short) (((E2 & 255) << 8) | ((E2 & 65280) >>> 8))) & 65535;
                pVar2.I(j3);
                if (z2) {
                    d(fVar3, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                pVar2.J(j2);
            }
            if (((d2 >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long d3 = pVar2.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    pVar = pVar2;
                    d(fVar2, 0L, d3 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.J(d3 + 1);
            } else {
                pVar = pVar2;
                fVar2 = fVar3;
            }
            if (((d2 >> 4) & 1) == 1) {
                long d4 = pVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    d(fVar2, 0L, d4 + 1);
                }
                pVar.J(d4 + 1);
            }
            if (z2) {
                pVar.I(2L);
                short E3 = fVar2.E();
                a("FHCRC", (short) (((E3 & 255) << 8) | ((E3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f832a = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f832a == 1) {
            long j4 = fVar.f827b;
            long h2 = this.f835d.h(fVar, 8192L);
            if (h2 != -1) {
                d(fVar, j4, h2);
                return h2;
            }
            this.f832a = (byte) 2;
        }
        if (this.f832a != 2) {
            return -1L;
        }
        a("CRC", pVar.E(), (int) crc32.getValue());
        a("ISIZE", pVar.E(), (int) this.f834c.getBytesWritten());
        this.f832a = (byte) 3;
        if (pVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
