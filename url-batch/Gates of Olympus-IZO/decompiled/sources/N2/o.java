package N2;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class o implements F {

    /* renamed from: d, reason: collision with root package name */
    public byte f2949d;

    /* renamed from: e, reason: collision with root package name */
    public final z f2950e;

    /* renamed from: f, reason: collision with root package name */
    public final Inflater f2951f;

    /* renamed from: g, reason: collision with root package name */
    public final p f2952g;

    /* renamed from: h, reason: collision with root package name */
    public final CRC32 f2953h;

    public o(F f3) {
        Z1.i.f(f3, "source");
        z zVar = new z(f3);
        this.f2950e = zVar;
        Inflater inflater = new Inflater(true);
        this.f2951f = inflater;
        this.f2952g = new p(zVar, inflater);
        this.f2953h = new CRC32();
    }

    public static void a(int i3, int i4, String str) {
        if (i4 != i3) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i4), Integer.valueOf(i3)}, 3)));
        }
    }

    public final void b(C0150f c0150f, long j3, long j4) {
        A a3 = c0150f.f2928d;
        Z1.i.c(a3);
        while (true) {
            int i3 = a3.f2894c;
            int i4 = a3.f2893b;
            if (j3 < i3 - i4) {
                break;
            }
            j3 -= i3 - i4;
            a3 = a3.f2897f;
            Z1.i.c(a3);
        }
        while (j4 > 0) {
            int min = (int) Math.min(a3.f2894c - r6, j4);
            this.f2953h.update(a3.f2892a, (int) (a3.f2893b + j3), min);
            j4 -= min;
            a3 = a3.f2897f;
            Z1.i.c(a3);
            j3 = 0;
        }
    }

    @Override // N2.F
    public final H c() {
        return this.f2950e.f2973d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2952g.close();
    }

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        z zVar;
        C0150f c0150f2;
        long j4;
        Z1.i.f(c0150f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (j3 == 0) {
            return 0L;
        }
        byte b2 = this.f2949d;
        CRC32 crc32 = this.f2953h;
        z zVar2 = this.f2950e;
        if (b2 == 0) {
            zVar2.z(10L);
            C0150f c0150f3 = zVar2.f2974e;
            byte b3 = c0150f3.b(3L);
            boolean z3 = ((b3 >> 1) & 1) == 1;
            if (z3) {
                b(c0150f3, 0L, 10L);
            }
            a(8075, zVar2.o(), "ID1ID2");
            zVar2.D(8L);
            if (((b3 >> 2) & 1) == 1) {
                zVar2.z(2L);
                if (z3) {
                    b(c0150f3, 0L, 2L);
                }
                long r3 = c0150f3.r() & 65535;
                zVar2.z(r3);
                if (z3) {
                    b(c0150f3, 0L, r3);
                    j4 = r3;
                } else {
                    j4 = r3;
                }
                zVar2.D(j4);
            }
            if (((b3 >> 3) & 1) == 1) {
                c0150f2 = c0150f3;
                long b4 = zVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b4 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    zVar = zVar2;
                    b(c0150f2, 0L, b4 + 1);
                } else {
                    zVar = zVar2;
                }
                zVar.D(b4 + 1);
            } else {
                c0150f2 = c0150f3;
                zVar = zVar2;
            }
            if (((b3 >> 4) & 1) == 1) {
                long b5 = zVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b5 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    b(c0150f2, 0L, b5 + 1);
                }
                zVar.D(b5 + 1);
            }
            if (z3) {
                a(zVar.p(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f2949d = (byte) 1;
        } else {
            zVar = zVar2;
        }
        if (this.f2949d == 1) {
            long j5 = c0150f.f2929e;
            long l3 = this.f2952g.l(c0150f, j3);
            if (l3 != -1) {
                b(c0150f, j5, l3);
                return l3;
            }
            this.f2949d = (byte) 2;
        }
        if (this.f2949d != 2) {
            return -1L;
        }
        a(zVar.k(), (int) crc32.getValue(), "CRC");
        a(zVar.k(), (int) this.f2951f.getBytesWritten(), "ISIZE");
        this.f2949d = (byte) 3;
        if (zVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
