package f8;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public byte f3628f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f3629g;

    /* renamed from: h, reason: collision with root package name */
    public final Inflater f3630h;

    /* renamed from: i, reason: collision with root package name */
    public final q f3631i;

    /* renamed from: j, reason: collision with root package name */
    public final CRC32 f3632j;

    public p(g0 g0Var) {
        r6.k.f(g0Var, "source");
        a0 a0Var = new a0(g0Var);
        this.f3629g = a0Var;
        Inflater inflater = new Inflater(true);
        this.f3630h = inflater;
        this.f3631i = new q(a0Var, inflater);
        this.f3632j = new CRC32();
    }

    public static void b(int i7, int i8, String str) {
        if (i8 != i7) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i7)}, 3)));
        }
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f3629g.f3568f.a();
    }

    public final void c(f fVar, long j8, long j9) {
        b0 b0Var = fVar.f3597f;
        r6.k.c(b0Var);
        while (true) {
            int i7 = b0Var.f3573c;
            int i8 = b0Var.f3572b;
            if (j8 < i7 - i8) {
                break;
            }
            j8 -= i7 - i8;
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
        }
        while (j9 > 0) {
            int min = (int) Math.min(b0Var.f3573c - r6, j9);
            this.f3632j.update(b0Var.f3571a, (int) (b0Var.f3572b + j8), min);
            j9 -= min;
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
            j8 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3631i.close();
    }

    @Override // f8.g0
    public final long v(long j8, f fVar) {
        p pVar = this;
        r6.k.f(fVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
        }
        if (j8 == 0) {
            return 0L;
        }
        byte b9 = pVar.f3628f;
        CRC32 crc32 = pVar.f3632j;
        a0 a0Var = pVar.f3629g;
        if (b9 == 0) {
            a0Var.J(10L);
            f fVar2 = a0Var.f3569g;
            byte k8 = fVar2.k(3L);
            boolean z8 = ((k8 >> 1) & 1) == 1;
            if (z8) {
                pVar.c(fVar2, 0L, 10L);
            }
            b(8075, a0Var.readShort(), "ID1ID2");
            a0Var.skip(8L);
            if (((k8 >> 2) & 1) == 1) {
                a0Var.J(2L);
                if (z8) {
                    c(fVar2, 0L, 2L);
                }
                long z9 = fVar2.z() & 65535;
                a0Var.J(z9);
                if (z8) {
                    c(fVar2, 0L, z9);
                }
                a0Var.skip(z9);
            }
            if (((k8 >> 3) & 1) == 1) {
                long c4 = a0Var.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c4 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    c(fVar2, 0L, c4 + 1);
                }
                a0Var.skip(c4 + 1);
            }
            if (((k8 >> 4) & 1) == 1) {
                long c6 = a0Var.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c6 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    pVar = this;
                    pVar.c(fVar2, 0L, c6 + 1);
                } else {
                    pVar = this;
                }
                a0Var.skip(c6 + 1);
            } else {
                pVar = this;
            }
            if (z8) {
                b(a0Var.t(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            pVar.f3628f = (byte) 1;
        }
        if (pVar.f3628f == 1) {
            long j9 = fVar.f3598g;
            long v5 = pVar.f3631i.v(j8, fVar);
            if (v5 != -1) {
                pVar.c(fVar, j9, v5);
                return v5;
            }
            pVar.f3628f = (byte) 2;
        }
        if (pVar.f3628f == 2) {
            b(a0Var.k(), (int) crc32.getValue(), "CRC");
            b(a0Var.k(), (int) pVar.f3630h.getBytesWritten(), "ISIZE");
            pVar.f3628f = (byte) 3;
            if (!a0Var.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
