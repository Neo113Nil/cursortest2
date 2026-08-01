package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements u {

    /* renamed from: a, reason: collision with root package name */
    public byte f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f4059c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f4060e;

    public k(u uVar) {
        X0.e.e(uVar, "source");
        o oVar = new o(uVar);
        this.f4058b = oVar;
        Inflater inflater = new Inflater(true);
        this.f4059c = inflater;
        this.d = new l(oVar, inflater);
        this.f4060e = new CRC32();
    }

    public static void e(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // v1.u
    public final w a() {
        return this.f4058b.f4068a.a();
    }

    @Override // v1.u
    public final long b(f fVar, long j2) {
        o oVar;
        f fVar2;
        long j3;
        X0.e.e(fVar, "sink");
        byte b2 = this.f4057a;
        CRC32 crc32 = this.f4060e;
        o oVar2 = this.f4058b;
        if (b2 == 0) {
            oVar2.o(10L);
            f fVar3 = oVar2.f4069b;
            byte f2 = fVar3.f(3L);
            boolean z2 = ((f2 >> 1) & 1) == 1;
            if (z2) {
                f(fVar3, 0L, 10L);
            }
            e("ID1ID2", 8075, oVar2.l());
            oVar2.p(8L);
            if (((f2 >> 2) & 1) == 1) {
                oVar2.o(2L);
                if (z2) {
                    f(fVar3, 0L, 2L);
                }
                short k2 = fVar3.k();
                long j4 = ((short) (((k2 & 255) << 8) | ((k2 & 65280) >>> 8))) & 65535;
                oVar2.o(j4);
                if (z2) {
                    f(fVar3, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                oVar2.p(j3);
            }
            if (((f2 >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long f3 = oVar2.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    oVar = oVar2;
                    f(fVar2, 0L, f3 + 1);
                } else {
                    oVar = oVar2;
                }
                oVar.p(f3 + 1);
            } else {
                oVar = oVar2;
                fVar2 = fVar3;
            }
            if (((f2 >> 4) & 1) == 1) {
                long f4 = oVar.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    f(fVar2, 0L, f4 + 1);
                }
                oVar.p(f4 + 1);
            }
            if (z2) {
                oVar.o(2L);
                short k3 = fVar2.k();
                e("FHCRC", (short) (((k3 & 255) << 8) | ((k3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f4057a = (byte) 1;
        } else {
            oVar = oVar2;
        }
        if (this.f4057a == 1) {
            long j5 = fVar.f4052b;
            long b3 = this.d.b(fVar, 8192L);
            if (b3 != -1) {
                f(fVar, j5, b3);
                return b3;
            }
            this.f4057a = (byte) 2;
        }
        if (this.f4057a != 2) {
            return -1L;
        }
        e("CRC", oVar.k(), (int) crc32.getValue());
        e("ISIZE", oVar.k(), (int) this.f4059c.getBytesWritten());
        this.f4057a = (byte) 3;
        if (oVar.e()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void f(f fVar, long j2, long j3) {
        p pVar = fVar.f4051a;
        X0.e.b(pVar);
        while (true) {
            int i = pVar.f4073c;
            int i2 = pVar.f4072b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            pVar = pVar.f4075f;
            X0.e.b(pVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(pVar.f4073c - r6, j3);
            this.f4060e.update(pVar.f4071a, (int) (pVar.f4072b + j2), min);
            j3 -= min;
            pVar = pVar.f4075f;
            X0.e.b(pVar);
            j2 = 0;
        }
    }
}
