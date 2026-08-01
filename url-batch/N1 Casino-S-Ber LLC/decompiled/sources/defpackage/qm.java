package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qm implements f30 {
    public byte f;
    public final cy g;
    public final Inflater h;
    public final po i;
    public final CRC32 j;

    public qm(f30 f30Var) {
        f30Var.getClass();
        cy cyVar = new cy(f30Var);
        this.g = cyVar;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.i = new po(cyVar, inflater);
        this.j = new CRC32();
    }

    public static void m(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.g.f.a();
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        long j2;
        qm qmVar = this;
        byte b = qmVar.f;
        CRC32 crc32 = qmVar.j;
        cy cyVar = qmVar.g;
        if (b == 0) {
            cyVar.h(10L);
            u8 u8Var2 = cyVar.g;
            byte o = u8Var2.o(3L);
            boolean z = ((o >> 1) & 1) == 1;
            if (z) {
                qmVar.n(u8Var2, 0L, 10L);
            }
            m("ID1ID2", 8075, cyVar.readShort());
            cyVar.skip(8L);
            if (((o >> 2) & 1) == 1) {
                cyVar.h(2L);
                if (z) {
                    n(u8Var2, 0L, 2L);
                }
                short readShort = u8Var2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                cyVar.h(j3);
                if (z) {
                    n(u8Var2, 0L, j3);
                }
                cyVar.skip(j3);
            }
            if (((o >> 3) & 1) == 1) {
                long n = cyVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    n(u8Var2, 0L, n + 1);
                } else {
                    j2 = 2;
                }
                cyVar.skip(n + 1);
            } else {
                j2 = 2;
            }
            if (((o >> 4) & 1) == 1) {
                long j4 = j2;
                long n2 = cyVar.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    qmVar = this;
                    qmVar.n(u8Var2, 0L, n2 + 1);
                } else {
                    qmVar = this;
                    j2 = j4;
                }
                cyVar.skip(n2 + 1);
            } else {
                qmVar = this;
            }
            if (z) {
                cyVar.h(j2);
                short readShort2 = u8Var2.readShort();
                m("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            qmVar.f = (byte) 1;
        }
        if (qmVar.f == 1) {
            long j5 = u8Var.g;
            long b2 = qmVar.i.b(8192L, u8Var);
            if (b2 != -1) {
                qmVar.n(u8Var, j5, b2);
                return b2;
            }
            qmVar.f = (byte) 2;
        }
        if (qmVar.f == 2) {
            m("CRC", cyVar.o(), (int) crc32.getValue());
            m("ISIZE", cyVar.o(), (int) qmVar.h.getBytesWritten());
            qmVar.f = (byte) 3;
            if (!cyVar.m()) {
                t8.y("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    public final void n(u8 u8Var, long j, long j2) {
        v10 v10Var = u8Var.f;
        v10Var.getClass();
        while (true) {
            int i = v10Var.c;
            int i2 = v10Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            v10Var = v10Var.f;
            v10Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(v10Var.c - r6, j2);
            this.j.update(v10Var.a, (int) (v10Var.b + j), min);
            j2 -= min;
            v10Var = v10Var.f;
            v10Var.getClass();
            j = 0;
        }
    }
}
