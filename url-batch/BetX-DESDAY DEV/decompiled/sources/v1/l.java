package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    public byte f4494a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4495b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f4496c;

    /* renamed from: d, reason: collision with root package name */
    public final m f4497d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f4498e;

    public l(w wVar) {
        X0.f.e(wVar, "source");
        q qVar = new q(wVar);
        this.f4495b = qVar;
        Inflater inflater = new Inflater(true);
        this.f4496c = inflater;
        this.f4497d = new m(qVar, inflater);
        this.f4498e = new CRC32();
    }

    public static void g(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // v1.w
    public final y a() {
        return this.f4495b.f4509a.a();
    }

    @Override // v1.w
    public final long c(f fVar, long j2) {
        q qVar;
        f fVar2;
        long j3;
        X0.f.e(fVar, "sink");
        byte b2 = this.f4494a;
        CRC32 crc32 = this.f4498e;
        q qVar2 = this.f4495b;
        if (b2 == 0) {
            qVar2.q(10L);
            f fVar3 = qVar2.f4510b;
            byte h = fVar3.h(3L);
            boolean z2 = ((h >> 1) & 1) == 1;
            if (z2) {
                h(fVar3, 0L, 10L);
            }
            g("ID1ID2", 8075, qVar2.n());
            qVar2.r(8L);
            if (((h >> 2) & 1) == 1) {
                qVar2.q(2L);
                if (z2) {
                    h(fVar3, 0L, 2L);
                }
                short m2 = fVar3.m();
                long j4 = ((short) (((m2 & 255) << 8) | ((m2 & 65280) >>> 8))) & 65535;
                qVar2.q(j4);
                if (z2) {
                    h(fVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                qVar2.r(j3);
            }
            if (((h >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long h2 = qVar2.h((byte) 0, 0L, Long.MAX_VALUE);
                if (h2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    qVar = qVar2;
                    h(fVar2, 0L, h2 + 1);
                } else {
                    qVar = qVar2;
                }
                qVar.r(h2 + 1);
            } else {
                qVar = qVar2;
                fVar2 = fVar3;
            }
            if (((h >> 4) & 1) == 1) {
                long h3 = qVar.h((byte) 0, 0L, Long.MAX_VALUE);
                if (h3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    h(fVar2, 0L, h3 + 1);
                }
                qVar.r(h3 + 1);
            }
            if (z2) {
                qVar.q(2L);
                short m3 = fVar2.m();
                g("FHCRC", (short) (((m3 & 255) << 8) | ((m3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f4494a = (byte) 1;
        } else {
            qVar = qVar2;
        }
        if (this.f4494a == 1) {
            long j5 = fVar.f4488b;
            long c2 = this.f4497d.c(fVar, 8192L);
            if (c2 != -1) {
                h(fVar, j5, c2);
                return c2;
            }
            this.f4494a = (byte) 2;
        }
        if (this.f4494a != 2) {
            return -1L;
        }
        g("CRC", qVar.m(), (int) crc32.getValue());
        g("ISIZE", qVar.m(), (int) this.f4496c.getBytesWritten());
        this.f4494a = (byte) 3;
        if (qVar.g()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4497d.close();
    }

    public final void h(f fVar, long j2, long j3) {
        r rVar = fVar.f4487a;
        X0.f.b(rVar);
        while (true) {
            int i = rVar.f4514c;
            int i2 = rVar.f4513b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            rVar = rVar.f4517f;
            X0.f.b(rVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(rVar.f4514c - r6, j3);
            this.f4498e.update(rVar.f4512a, (int) (rVar.f4513b + j2), min);
            j3 -= min;
            rVar = rVar.f4517f;
            X0.f.b(rVar);
            j2 = 0;
        }
    }
}
