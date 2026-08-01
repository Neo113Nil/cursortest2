package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class dn implements q30 {
    public byte f;
    public final ry g;
    public final Inflater h;
    public final ep i;
    public final CRC32 j;

    public dn(q30 q30Var) {
        q30Var.getClass();
        ry ryVar = new ry(q30Var);
        this.g = ryVar;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new ep(ryVar, inflater);
        this.j = new CRC32();
    }

    public static void m(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.g.f.a();
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        long j2;
        dn dnVar = this;
        byte b = dnVar.f;
        CRC32 crc32 = dnVar.j;
        ry ryVar = dnVar.g;
        if (b == 0) {
            ryVar.h(10L);
            p8 p8Var2 = ryVar.g;
            byte o = p8Var2.o(3L);
            boolean z = ((o >> 1) & 1) == 1;
            if (z) {
                dnVar.n(p8Var2, 0L, 10L);
            }
            m("ID1ID2", 8075, ryVar.readShort());
            ryVar.skip(8L);
            if (((o >> 2) & 1) == 1) {
                ryVar.h(2L);
                if (z) {
                    n(p8Var2, 0L, 2L);
                }
                short readShort = p8Var2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                ryVar.h(j3);
                if (z) {
                    n(p8Var2, 0L, j3);
                }
                ryVar.skip(j3);
            }
            if (((o >> 3) & 1) == 1) {
                long n = ryVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    n(p8Var2, 0L, n + 1);
                } else {
                    j2 = 2;
                }
                ryVar.skip(n + 1);
            } else {
                j2 = 2;
            }
            if (((o >> 4) & 1) == 1) {
                long j4 = j2;
                long n2 = ryVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    dnVar = this;
                    dnVar.n(p8Var2, 0L, n2 + 1);
                } else {
                    dnVar = this;
                    j2 = j4;
                }
                ryVar.skip(n2 + 1);
            } else {
                dnVar = this;
            }
            if (z) {
                ryVar.h(j2);
                short readShort2 = p8Var2.readShort();
                m("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            dnVar.f = (byte) 1;
        }
        if (dnVar.f == 1) {
            long j5 = p8Var.g;
            long b2 = dnVar.i.b(8192L, p8Var);
            if (b2 != -1) {
                dnVar.n(p8Var, j5, b2);
                return b2;
            }
            dnVar.f = (byte) 2;
        }
        if (dnVar.f == 2) {
            m("CRC", ryVar.o(), (int) crc32.getValue());
            m("ISIZE", ryVar.o(), (int) dnVar.h.getBytesWritten());
            dnVar.f = (byte) 3;
            if (!ryVar.m()) {
                o8.x("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    public final void n(p8 p8Var, long j, long j2) {
        f20 f20Var = p8Var.f;
        f20Var.getClass();
        while (true) {
            int i = f20Var.c;
            int i2 = f20Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            f20Var = f20Var.f;
            f20Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(f20Var.c - r6, j2);
            this.j.update(f20Var.a, (int) (f20Var.b + j), min);
            j2 -= min;
            f20Var = f20Var.f;
            f20Var.getClass();
            j = 0;
        }
    }
}
