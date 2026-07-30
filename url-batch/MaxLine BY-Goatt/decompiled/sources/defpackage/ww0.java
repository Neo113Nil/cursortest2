package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ww0 implements pn2 {
    public byte m;
    public final p62 n;
    public final Inflater o;
    public final e21 p;
    public final CRC32 q;

    public ww0(pn2 pn2Var) {
        pn2Var.getClass();
        p62 p62Var = new p62(pn2Var);
        this.n = p62Var;
        Inflater inflater = new Inflater(true);
        this.o = inflater;
        this.p = new e21(p62Var, inflater);
        this.q = new CRC32();
    }

    public static void b(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + up2.A(8, o70.N(i2)) + " != expected 0x" + up2.A(8, o70.N(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.close();
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.n.m.e();
    }

    public final void f(fq fqVar, long j, long j2) {
        ug2 ug2Var = fqVar.m;
        ug2Var.getClass();
        while (true) {
            int i = ug2Var.c;
            int i2 = ug2Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            ug2Var = ug2Var.f;
            ug2Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(ug2Var.c - r6, j2);
            this.q.update(ug2Var.a, (int) (ug2Var.b + j), min);
            j2 -= min;
            ug2Var = ug2Var.f;
            ug2Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.pn2
    public final long h(long j, fq fqVar) {
        ww0 ww0Var = this;
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = ww0Var.m;
        CRC32 crc32 = ww0Var.q;
        p62 p62Var = ww0Var.n;
        if (b == 0) {
            p62Var.F(10L);
            fq fqVar2 = p62Var.n;
            byte n = fqVar2.n(3L);
            boolean z = ((n >> 1) & 1) == 1;
            if (z) {
                ww0Var.f(fqVar2, 0L, 10L);
            }
            b("ID1ID2", 8075, p62Var.readShort());
            p62Var.skip(8L);
            if (((n >> 2) & 1) == 1) {
                p62Var.F(2L);
                if (z) {
                    f(fqVar2, 0L, 2L);
                }
                long v = fqVar2.v() & 65535;
                p62Var.F(v);
                if (z) {
                    f(fqVar2, 0L, v);
                }
                p62Var.skip(v);
            }
            if (((n >> 3) & 1) == 1) {
                long f = p62Var.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f == -1) {
                    throw new EOFException();
                }
                if (z) {
                    f(fqVar2, 0L, f + 1);
                }
                p62Var.skip(f + 1);
            }
            if (((n >> 4) & 1) == 1) {
                long f2 = p62Var.f((byte) 0, 0L, Long.MAX_VALUE);
                if (f2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    ww0Var = this;
                    ww0Var.f(fqVar2, 0L, f2 + 1);
                } else {
                    ww0Var = this;
                }
                p62Var.skip(f2 + 1);
            } else {
                ww0Var = this;
            }
            if (z) {
                b("FHCRC", p62Var.o(), (short) crc32.getValue());
                crc32.reset();
            }
            ww0Var.m = (byte) 1;
        }
        if (ww0Var.m == 1) {
            long j2 = fqVar.n;
            long h = ww0Var.p.h(j, fqVar);
            if (h != -1) {
                ww0Var.f(fqVar, j2, h);
                return h;
            }
            ww0Var.m = (byte) 2;
        }
        if (ww0Var.m == 2) {
            b("CRC", p62Var.m(), (int) crc32.getValue());
            b("ISIZE", p62Var.m(), (int) ww0Var.o.getBytesWritten());
            ww0Var.m = (byte) 3;
            if (!p62Var.b()) {
                dm0.j("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}
