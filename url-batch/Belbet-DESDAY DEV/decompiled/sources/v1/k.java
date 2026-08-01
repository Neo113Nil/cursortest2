package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public byte f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4080b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f4081c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f4082e;

    public k(v vVar) {
        X0.d.e(vVar, "source");
        p pVar = new p(vVar);
        this.f4080b = pVar;
        Inflater inflater = new Inflater(true);
        this.f4081c = inflater;
        this.d = new l(pVar, inflater);
        this.f4082e = new CRC32();
    }

    public static void e(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // v1.v
    public final x a() {
        return this.f4080b.f4091a.a();
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        p pVar;
        f fVar2;
        long j3;
        X0.d.e(fVar, "sink");
        byte b2 = this.f4079a;
        CRC32 crc32 = this.f4082e;
        p pVar2 = this.f4080b;
        if (b2 == 0) {
            pVar2.o(10L);
            f fVar3 = pVar2.f4092b;
            byte f2 = fVar3.f(3L);
            boolean z2 = ((f2 >> 1) & 1) == 1;
            if (z2) {
                f(fVar3, 0L, 10L);
            }
            e("ID1ID2", 8075, pVar2.l());
            pVar2.p(8L);
            if (((f2 >> 2) & 1) == 1) {
                pVar2.o(2L);
                if (z2) {
                    f(fVar3, 0L, 2L);
                }
                short k2 = fVar3.k();
                long j4 = ((short) (((k2 & 255) << 8) | ((k2 & 65280) >>> 8))) & 65535;
                pVar2.o(j4);
                if (z2) {
                    f(fVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                pVar2.p(j3);
            }
            if (((f2 >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long f3 = pVar2.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    pVar = pVar2;
                    f(fVar2, 0L, f3 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.p(f3 + 1);
            } else {
                pVar = pVar2;
                fVar2 = fVar3;
            }
            if (((f2 >> 4) & 1) == 1) {
                long f4 = pVar.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    f(fVar2, 0L, f4 + 1);
                }
                pVar.p(f4 + 1);
            }
            if (z2) {
                pVar.o(2L);
                short k3 = fVar2.k();
                e("FHCRC", (short) (((k3 & 255) << 8) | ((k3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f4079a = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f4079a == 1) {
            long j5 = fVar.f4074b;
            long b3 = this.d.b(fVar, 8192L);
            if (b3 != -1) {
                f(fVar, j5, b3);
                return b3;
            }
            this.f4079a = (byte) 2;
        }
        if (this.f4079a != 2) {
            return -1L;
        }
        e("CRC", pVar.k(), (int) crc32.getValue());
        e("ISIZE", pVar.k(), (int) this.f4081c.getBytesWritten());
        this.f4079a = (byte) 3;
        if (pVar.e()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void f(f fVar, long j2, long j3) {
        q qVar = fVar.f4073a;
        X0.d.b(qVar);
        while (true) {
            int i = qVar.f4096c;
            int i2 = qVar.f4095b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            qVar = qVar.f4098f;
            X0.d.b(qVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(qVar.f4096c - r6, j3);
            this.f4082e.update(qVar.f4094a, (int) (qVar.f4095b + j2), min);
            j3 -= min;
            qVar = qVar.f4098f;
            X0.d.b(qVar);
            j2 = 0;
        }
    }
}
