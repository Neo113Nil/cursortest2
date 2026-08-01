package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ap implements h60 {
    public byte f;
    public final e10 g;
    public final Inflater h;
    public final ar i;
    public final CRC32 j;

    public ap(h60 h60Var) {
        h60Var.getClass();
        e10 e10Var = new e10(h60Var);
        this.g = e10Var;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new ar(e10Var, inflater);
        this.j = new CRC32();
    }

    public static void f(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.g.f.a();
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        long j2;
        ap apVar = this;
        byte b = apVar.f;
        CRC32 crc32 = apVar.j;
        e10 e10Var = apVar.g;
        if (b == 0) {
            e10Var.l(10L);
            h9 h9Var2 = e10Var.g;
            byte h = h9Var2.h(3L);
            boolean z = ((h >> 1) & 1) == 1;
            if (z) {
                apVar.g(h9Var2, 0L, 10L);
            }
            f("ID1ID2", 8075, e10Var.readShort());
            e10Var.skip(8L);
            if (((h >> 2) & 1) == 1) {
                e10Var.l(2L);
                if (z) {
                    g(h9Var2, 0L, 2L);
                }
                short readShort = h9Var2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                e10Var.l(j3);
                if (z) {
                    g(h9Var2, 0L, j3);
                }
                e10Var.skip(j3);
            }
            if (((h >> 3) & 1) == 1) {
                long g = e10Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (g == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    g(h9Var2, 0L, g + 1);
                } else {
                    j2 = 2;
                }
                e10Var.skip(g + 1);
            } else {
                j2 = 2;
            }
            if (((h >> 4) & 1) == 1) {
                long j4 = j2;
                long g2 = e10Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (g2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    apVar = this;
                    apVar.g(h9Var2, 0L, g2 + 1);
                } else {
                    apVar = this;
                    j2 = j4;
                }
                e10Var.skip(g2 + 1);
            } else {
                apVar = this;
            }
            if (z) {
                e10Var.l(j2);
                short readShort2 = h9Var2.readShort();
                f("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            apVar.f = (byte) 1;
        }
        if (apVar.f == 1) {
            long j5 = h9Var.g;
            long b2 = apVar.i.b(8192L, h9Var);
            if (b2 != -1) {
                apVar.g(h9Var, j5, b2);
                return b2;
            }
            apVar.f = (byte) 2;
        }
        if (apVar.f == 2) {
            f("CRC", e10Var.h(), (int) crc32.getValue());
            f("ISIZE", e10Var.h(), (int) apVar.h.getBytesWritten());
            apVar.f = (byte) 3;
            if (!e10Var.f()) {
                g9.w("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    public final void g(h9 h9Var, long j, long j2) {
        u40 u40Var = h9Var.f;
        u40Var.getClass();
        while (true) {
            int i = u40Var.c;
            int i2 = u40Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            u40Var = u40Var.f;
            u40Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(u40Var.c - r6, j2);
            this.j.update(u40Var.a, (int) (u40Var.b + j), min);
            j2 -= min;
            u40Var = u40Var.f;
            u40Var.getClass();
            j = 0;
        }
    }
}
