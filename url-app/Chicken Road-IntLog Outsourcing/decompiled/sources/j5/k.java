package j5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements w {

    /* renamed from: a, reason: collision with root package name */
    public byte f10501a;

    /* renamed from: b, reason: collision with root package name */
    public final q f10502b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f10503c;

    /* renamed from: d, reason: collision with root package name */
    public final l f10504d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f10505e;

    public k(h source) {
        kotlin.jvm.internal.i.e(source, "source");
        q qVar = new q(source);
        this.f10502b = qVar;
        Inflater inflater = new Inflater(true);
        this.f10503c = inflater;
        this.f10504d = new l(qVar, inflater);
        this.f10505e = new CRC32();
    }

    public static void a(String str, int i2, int i3) {
        if (i3 == i2) {
            return;
        }
        throw new IOException(str + ": actual 0x" + B4.k.c0(8, b.g(i3)) + " != expected 0x" + B4.k.c0(8, b.g(i2)));
    }

    public final void b(f fVar, long j2, long j6) {
        r rVar = fVar.f10494a;
        kotlin.jvm.internal.i.b(rVar);
        while (true) {
            int i2 = rVar.f10523c;
            int i3 = rVar.f10522b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            rVar = rVar.f10526f;
            kotlin.jvm.internal.i.b(rVar);
        }
        while (j6 > 0) {
            int min = (int) Math.min(rVar.f10523c - r6, j6);
            this.f10505e.update(rVar.f10521a, (int) (rVar.f10522b + j2), min);
            j6 -= min;
            rVar = rVar.f10526f;
            kotlin.jvm.internal.i.b(rVar);
            j2 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10504d.close();
    }

    @Override // j5.w
    public final y d() {
        return this.f10502b.f10518a.d();
    }

    @Override // j5.w
    public final long s(f sink, long j2) {
        q qVar;
        f fVar;
        long j6;
        kotlin.jvm.internal.i.e(sink, "sink");
        byte b6 = this.f10501a;
        CRC32 crc32 = this.f10505e;
        q qVar2 = this.f10502b;
        if (b6 == 0) {
            qVar2.A(10L);
            f fVar2 = qVar2.f10519b;
            byte b7 = fVar2.b(3L);
            boolean z = ((b7 >> 1) & 1) == 1;
            if (z) {
                b(fVar2, 0L, 10L);
            }
            a("ID1ID2", 8075, qVar2.p());
            qVar2.C(8L);
            if (((b7 >> 2) & 1) == 1) {
                qVar2.A(2L);
                if (z) {
                    b(fVar2, 0L, 2L);
                }
                short y5 = fVar2.y();
                long j7 = ((short) (((y5 & 255) << 8) | ((y5 & 65280) >>> 8))) & 65535;
                qVar2.A(j7);
                if (z) {
                    b(fVar2, 0L, j7);
                    j6 = j7;
                } else {
                    j6 = j7;
                }
                qVar2.C(j6);
            }
            if (((b7 >> 3) & 1) == 1) {
                fVar = fVar2;
                long b8 = qVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b8 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    qVar = qVar2;
                    b(fVar, 0L, b8 + 1);
                } else {
                    qVar = qVar2;
                }
                qVar.C(b8 + 1);
            } else {
                qVar = qVar2;
                fVar = fVar2;
            }
            if (((b7 >> 4) & 1) == 1) {
                long b9 = qVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b9 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    b(fVar, 0L, b9 + 1);
                }
                qVar.C(b9 + 1);
            }
            if (z) {
                qVar.A(2L);
                short y6 = fVar.y();
                a("FHCRC", (short) (((y6 & 255) << 8) | ((y6 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f10501a = (byte) 1;
        } else {
            qVar = qVar2;
        }
        if (this.f10501a == 1) {
            long j8 = sink.f10495b;
            long s2 = this.f10504d.s(sink, 8192L);
            if (s2 != -1) {
                b(sink, j8, s2);
                return s2;
            }
            this.f10501a = (byte) 2;
        }
        if (this.f10501a != 2) {
            return -1L;
        }
        qVar.A(4L);
        f fVar3 = qVar.f10519b;
        a("CRC", b.e(fVar3.q()), (int) crc32.getValue());
        qVar.A(4L);
        a("ISIZE", b.e(fVar3.q()), (int) this.f10503c.getBytesWritten());
        this.f10501a = (byte) 3;
        if (qVar.a()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
