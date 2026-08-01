package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qs implements ke0 {
    public byte f;
    public final j70 g;
    public final Inflater h;
    public final av i;
    public final CRC32 j;

    public qs(ke0 ke0Var) {
        ke0Var.getClass();
        j70 j70Var = new j70(ke0Var);
        this.g = j70Var;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new av(j70Var, inflater);
        this.j = new CRC32();
    }

    public static void i(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.g.f.a();
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        long j2;
        qs qsVar = this;
        byte b = qsVar.f;
        CRC32 crc32 = qsVar.j;
        j70 j70Var = qsVar.g;
        if (b == 0) {
            j70Var.H(10L);
            t9 t9Var2 = j70Var.g;
            byte r = t9Var2.r(3L);
            boolean z = ((r >> 1) & 1) == 1;
            if (z) {
                qsVar.n(t9Var2, 0L, 10L);
            }
            i("ID1ID2", 8075, j70Var.readShort());
            j70Var.skip(8L);
            if (((r >> 2) & 1) == 1) {
                j70Var.H(2L);
                if (z) {
                    n(t9Var2, 0L, 2L);
                }
                short readShort = t9Var2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                j70Var.H(j3);
                if (z) {
                    n(t9Var2, 0L, j3);
                }
                j70Var.skip(j3);
            }
            if (((r >> 3) & 1) == 1) {
                long n = j70Var.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    n(t9Var2, 0L, n + 1);
                } else {
                    j2 = 2;
                }
                j70Var.skip(n + 1);
            } else {
                j2 = 2;
            }
            if (((r >> 4) & 1) == 1) {
                long j4 = j2;
                long n2 = j70Var.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    qsVar = this;
                    qsVar.n(t9Var2, 0L, n2 + 1);
                } else {
                    qsVar = this;
                    j2 = j4;
                }
                j70Var.skip(n2 + 1);
            } else {
                qsVar = this;
            }
            if (z) {
                j70Var.H(j2);
                short readShort2 = t9Var2.readShort();
                i("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            qsVar.f = (byte) 1;
        }
        if (qsVar.f == 1) {
            long j5 = t9Var.g;
            long c = qsVar.i.c(8192L, t9Var);
            if (c != -1) {
                qsVar.n(t9Var, j5, c);
                return c;
            }
            qsVar.f = (byte) 2;
        }
        if (qsVar.f == 2) {
            i("CRC", j70Var.r(), (int) crc32.getValue());
            i("ISIZE", j70Var.r(), (int) qsVar.h.getBytesWritten());
            qsVar.f = (byte) 3;
            if (!j70Var.i()) {
                s9.w("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    public final void n(t9 t9Var, long j, long j2) {
        kc0 kc0Var = t9Var.f;
        kc0Var.getClass();
        while (true) {
            int i = kc0Var.c;
            int i2 = kc0Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            kc0Var = kc0Var.f;
            kc0Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(kc0Var.c - r6, j2);
            this.j.update(kc0Var.a, (int) (kc0Var.b + j), min);
            j2 -= min;
            kc0Var = kc0Var.f;
            kc0Var.getClass();
            j = 0;
        }
    }
}
