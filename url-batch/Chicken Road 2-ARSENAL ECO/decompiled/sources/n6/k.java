package n6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements w {

    /* renamed from: f, reason: collision with root package name */
    public byte f5530f;

    /* renamed from: g, reason: collision with root package name */
    public final q f5531g;

    /* renamed from: h, reason: collision with root package name */
    public final Inflater f5532h;

    /* renamed from: i, reason: collision with root package name */
    public final l f5533i;

    /* renamed from: j, reason: collision with root package name */
    public final CRC32 f5534j;

    public k(h source) {
        kotlin.jvm.internal.i.e(source, "source");
        q qVar = new q(source);
        this.f5531g = qVar;
        Inflater inflater = new Inflater(true);
        this.f5532h = inflater;
        this.f5533i = new l(qVar, inflater);
        this.f5534j = new CRC32();
    }

    public static void a(String str, int i7, int i8) {
        if (i8 == i7) {
            return;
        }
        throw new IOException(str + ": actual 0x" + F5.j.W(b.g(i8), 8) + " != expected 0x" + F5.j.W(b.g(i7), 8));
    }

    @Override // n6.w
    public final y b() {
        return this.f5531g.f5547f.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5533i.close();
    }

    public final void d(f fVar, long j4, long j7) {
        r rVar = fVar.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        while (true) {
            int i7 = rVar.f5552c;
            int i8 = rVar.f5551b;
            if (j4 < i7 - i8) {
                break;
            }
            j4 -= i7 - i8;
            rVar = rVar.f5555f;
            kotlin.jvm.internal.i.b(rVar);
        }
        while (j7 > 0) {
            int min = (int) Math.min(rVar.f5552c - r6, j7);
            this.f5534j.update(rVar.f5550a, (int) (rVar.f5551b + j4), min);
            j7 -= min;
            rVar = rVar.f5555f;
            kotlin.jvm.internal.i.b(rVar);
            j4 = 0;
        }
    }

    @Override // n6.w
    public final long i(long j4, f fVar) {
        long j7;
        k kVar = this;
        byte b7 = kVar.f5530f;
        CRC32 crc32 = kVar.f5534j;
        q qVar = kVar.f5531g;
        if (b7 == 0) {
            qVar.C(10L);
            f fVar2 = qVar.f5548g;
            byte e4 = fVar2.e(3L);
            boolean z5 = ((e4 >> 1) & 1) == 1;
            if (z5) {
                kVar.d(fVar2, 0L, 10L);
            }
            a("ID1ID2", 8075, qVar.readShort());
            qVar.skip(8L);
            if (((e4 >> 2) & 1) == 1) {
                qVar.C(2L);
                if (z5) {
                    d(fVar2, 0L, 2L);
                }
                short readShort = fVar2.readShort();
                long j8 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                qVar.C(j8);
                if (z5) {
                    d(fVar2, 0L, j8);
                }
                qVar.skip(j8);
            }
            if (((e4 >> 3) & 1) == 1) {
                long d7 = qVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d7 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j7 = 2;
                    d(fVar2, 0L, d7 + 1);
                } else {
                    j7 = 2;
                }
                qVar.skip(d7 + 1);
            } else {
                j7 = 2;
            }
            if (((e4 >> 4) & 1) == 1) {
                long j9 = j7;
                long d8 = qVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d8 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    j7 = j9;
                    kVar = this;
                    kVar.d(fVar2, 0L, d8 + 1);
                } else {
                    kVar = this;
                    j7 = j9;
                }
                qVar.skip(d8 + 1);
            } else {
                kVar = this;
            }
            if (z5) {
                qVar.C(j7);
                short readShort2 = fVar2.readShort();
                a("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            kVar.f5530f = (byte) 1;
        }
        if (kVar.f5530f == 1) {
            long j10 = fVar.f5524g;
            long i7 = kVar.f5533i.i(8192L, fVar);
            if (i7 != -1) {
                kVar.d(fVar, j10, i7);
                return i7;
            }
            kVar.f5530f = (byte) 2;
        }
        if (kVar.f5530f == 2) {
            qVar.C(4L);
            f fVar3 = qVar.f5548g;
            a("CRC", b.e(fVar3.readInt()), (int) crc32.getValue());
            qVar.C(4L);
            a("ISIZE", b.e(fVar3.readInt()), (int) kVar.f5532h.getBytesWritten());
            kVar.f5530f = (byte) 3;
            if (!qVar.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
