package T2;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class o implements F {

    /* renamed from: d, reason: collision with root package name */
    public byte f4429d;

    /* renamed from: e, reason: collision with root package name */
    public final z f4430e;

    /* renamed from: f, reason: collision with root package name */
    public final Inflater f4431f;

    /* renamed from: g, reason: collision with root package name */
    public final p f4432g;

    /* renamed from: h, reason: collision with root package name */
    public final CRC32 f4433h;

    public o(F f3) {
        f2.j.f(f3, "source");
        z zVar = new z(f3);
        this.f4430e = zVar;
        Inflater inflater = new Inflater(true);
        this.f4431f = inflater;
        this.f4432g = new p(zVar, inflater);
        this.f4433h = new CRC32();
    }

    public static void a(int i3, int i4, String str) {
        if (i4 != i3) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i4), Integer.valueOf(i3)}, 3)));
        }
    }

    public final void b(C0231f c0231f, long j3, long j4) {
        A a3 = c0231f.f4408d;
        f2.j.c(a3);
        while (true) {
            int i3 = a3.f4374c;
            int i4 = a3.f4373b;
            if (j3 < i3 - i4) {
                break;
            }
            j3 -= i3 - i4;
            a3 = a3.f4377f;
            f2.j.c(a3);
        }
        while (j4 > 0) {
            int min = (int) Math.min(a3.f4374c - r6, j4);
            this.f4433h.update(a3.f4372a, (int) (a3.f4373b + j3), min);
            j4 -= min;
            a3 = a3.f4377f;
            f2.j.c(a3);
            j3 = 0;
        }
    }

    @Override // T2.F
    public final H c() {
        return this.f4430e.f4453d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4432g.close();
    }

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        z zVar;
        C0231f c0231f2;
        long j4;
        f2.j.f(c0231f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (j3 == 0) {
            return 0L;
        }
        byte b3 = this.f4429d;
        CRC32 crc32 = this.f4433h;
        z zVar2 = this.f4430e;
        if (b3 == 0) {
            zVar2.w(10L);
            C0231f c0231f3 = zVar2.f4454e;
            byte b4 = c0231f3.b(3L);
            boolean z3 = ((b4 >> 1) & 1) == 1;
            if (z3) {
                b(c0231f3, 0L, 10L);
            }
            a(8075, zVar2.q(), "ID1ID2");
            zVar2.x(8L);
            if (((b4 >> 2) & 1) == 1) {
                zVar2.w(2L);
                if (z3) {
                    b(c0231f3, 0L, 2L);
                }
                long s3 = c0231f3.s() & 65535;
                zVar2.w(s3);
                if (z3) {
                    b(c0231f3, 0L, s3);
                    j4 = s3;
                } else {
                    j4 = s3;
                }
                zVar2.x(j4);
            }
            if (((b4 >> 3) & 1) == 1) {
                c0231f2 = c0231f3;
                long b5 = zVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b5 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    zVar = zVar2;
                    b(c0231f2, 0L, b5 + 1);
                } else {
                    zVar = zVar2;
                }
                zVar.x(b5 + 1);
            } else {
                c0231f2 = c0231f3;
                zVar = zVar2;
            }
            if (((b4 >> 4) & 1) == 1) {
                long b6 = zVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b6 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    b(c0231f2, 0L, b6 + 1);
                }
                zVar.x(b6 + 1);
            }
            if (z3) {
                a(zVar.r(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f4429d = (byte) 1;
        } else {
            zVar = zVar2;
        }
        if (this.f4429d == 1) {
            long j5 = c0231f.f4409e;
            long f3 = this.f4432g.f(c0231f, j3);
            if (f3 != -1) {
                b(c0231f, j5, f3);
                return f3;
            }
            this.f4429d = (byte) 2;
        }
        if (this.f4429d != 2) {
            return -1L;
        }
        a(zVar.l(), (int) crc32.getValue(), "CRC");
        a(zVar.l(), (int) this.f4431f.getBytesWritten(), "ISIZE");
        this.f4429d = (byte) 3;
        if (zVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
