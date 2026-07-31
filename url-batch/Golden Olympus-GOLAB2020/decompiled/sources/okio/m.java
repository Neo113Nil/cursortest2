package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements B {

    /* renamed from: b, reason: collision with root package name */
    private byte f43279b;

    /* renamed from: c, reason: collision with root package name */
    private final v f43280c;

    /* renamed from: d, reason: collision with root package name */
    private final Inflater f43281d;

    /* renamed from: e, reason: collision with root package name */
    private final n f43282e;

    /* renamed from: f, reason: collision with root package name */
    private final CRC32 f43283f;

    public m(B source) {
        Intrinsics.checkNotNullParameter(source, "source");
        v vVar = new v(source);
        this.f43280c = vVar;
        Inflater inflater = new Inflater(true);
        this.f43281d = inflater;
        this.f43282e = new n((g) vVar, inflater);
        this.f43283f = new CRC32();
    }

    private final void a(String str, int i4, int i5) {
        if (i5 == i4) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i4)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void m() {
        this.f43280c.O(10L);
        byte U3 = this.f43280c.f43300c.U(3L);
        boolean z4 = ((U3 >> 1) & 1) == 1;
        if (z4) {
            o(this.f43280c.f43300c, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f43280c.readShort());
        this.f43280c.H(8L);
        if (((U3 >> 2) & 1) == 1) {
            this.f43280c.O(2L);
            if (z4) {
                o(this.f43280c.f43300c, 0L, 2L);
            }
            long g02 = this.f43280c.f43300c.g0() & 65535;
            this.f43280c.O(g02);
            if (z4) {
                o(this.f43280c.f43300c, 0L, g02);
            }
            this.f43280c.H(g02);
        }
        if (((U3 >> 3) & 1) == 1) {
            long a4 = this.f43280c.a((byte) 0);
            if (a4 == -1) {
                throw new EOFException();
            }
            if (z4) {
                o(this.f43280c.f43300c, 0L, a4 + 1);
            }
            this.f43280c.H(a4 + 1);
        }
        if (((U3 >> 4) & 1) == 1) {
            long a5 = this.f43280c.a((byte) 0);
            if (a5 == -1) {
                throw new EOFException();
            }
            if (z4) {
                o(this.f43280c.f43300c, 0L, a5 + 1);
            }
            this.f43280c.H(a5 + 1);
        }
        if (z4) {
            a("FHCRC", this.f43280c.n(), (short) this.f43283f.getValue());
            this.f43283f.reset();
        }
    }

    private final void n() {
        a("CRC", this.f43280c.m(), (int) this.f43283f.getValue());
        a("ISIZE", this.f43280c.m(), (int) this.f43281d.getBytesWritten());
    }

    private final void o(C3372e c3372e, long j4, long j5) {
        w wVar = c3372e.f43260b;
        Intrinsics.checkNotNull(wVar);
        while (true) {
            int i4 = wVar.f43306c;
            int i5 = wVar.f43305b;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
        }
        while (j5 > 0) {
            int min = (int) Math.min(wVar.f43306c - r6, j5);
            this.f43283f.update(wVar.f43304a, (int) (wVar.f43305b + j4), min);
            j5 -= min;
            wVar = wVar.f43309f;
            Intrinsics.checkNotNull(wVar);
            j4 = 0;
        }
    }

    @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43282e.close();
    }

    @Override // okio.B
    public long read(C3372e sink, long j4) {
        m mVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (j4 == 0) {
            return 0L;
        }
        if (this.f43279b == 0) {
            m();
            this.f43279b = (byte) 1;
        }
        if (this.f43279b == 1) {
            long l02 = sink.l0();
            long read = this.f43282e.read(sink, j4);
            if (read != -1) {
                o(sink, l02, read);
                return read;
            }
            mVar = this;
            mVar.f43279b = (byte) 2;
        } else {
            mVar = this;
        }
        if (mVar.f43279b == 2) {
            n();
            mVar.f43279b = (byte) 3;
            if (!mVar.f43280c.v()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.B
    public C timeout() {
        return this.f43280c.timeout();
    }
}
