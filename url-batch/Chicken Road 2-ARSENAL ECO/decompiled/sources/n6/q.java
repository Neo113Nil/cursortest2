package n6;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: f, reason: collision with root package name */
    public final w f5547f;

    /* renamed from: g, reason: collision with root package name */
    public final f f5548g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5549h;

    public q(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f5547f = source;
        this.f5548g = new f();
    }

    @Override // n6.h
    public final void C(long j4) {
        if (!e(j4)) {
            throw new EOFException();
        }
    }

    public final boolean a() {
        if (this.f5549h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f5548g;
        return fVar.d() && this.f5547f.i(8192L, fVar) == -1;
    }

    @Override // n6.w
    public final y b() {
        return this.f5547f.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f5549h) {
            return;
        }
        this.f5549h = true;
        this.f5547f.close();
        f fVar = this.f5548g;
        fVar.skip(fVar.f5524g);
    }

    public final long d(byte b7, long j4, long j7) {
        if (this.f5549h) {
            throw new IllegalStateException("closed");
        }
        if (0 > j7) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j7).toString());
        }
        long j8 = 0;
        while (j8 < j7) {
            f fVar = this.f5548g;
            byte b8 = b7;
            long j9 = j7;
            long g7 = fVar.g(b8, j8, j9);
            if (g7 == -1) {
                long j10 = fVar.f5524g;
                if (j10 >= j9 || this.f5547f.i(8192L, fVar) == -1) {
                    break;
                }
                j8 = Math.max(j8, j10);
                b7 = b8;
                j7 = j9;
            } else {
                return g7;
            }
        }
        return -1L;
    }

    public final boolean e(long j4) {
        f fVar;
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f5549h) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f5548g;
            if (fVar.f5524g >= j4) {
                return true;
            }
        } while (this.f5547f.i(8192L, fVar) != -1);
        return false;
    }

    @Override // n6.h
    public final i f(long j4) {
        C(j4);
        return this.f5548g.f(j4);
    }

    @Override // n6.w
    public final long i(long j4, f sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f5549h) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f5548g;
        if (fVar.f5524g == 0) {
            if (j4 == 0) {
                return 0L;
            }
            if (this.f5547f.i(8192L, fVar) == -1) {
                return -1L;
            }
        }
        return fVar.i(Math.min(j4, fVar.f5524g), sink);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5549h;
    }

    @Override // n6.h
    public final byte[] q() {
        w wVar = this.f5547f;
        f fVar = this.f5548g;
        fVar.H(wVar);
        return fVar.h(fVar.f5524g);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        f fVar = this.f5548g;
        if (fVar.f5524g == 0 && this.f5547f.i(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(sink);
    }

    @Override // n6.h
    public final byte readByte() {
        C(1L);
        return this.f5548g.readByte();
    }

    @Override // n6.h
    public final int readInt() {
        C(4L);
        return this.f5548g.readInt();
    }

    @Override // n6.h
    public final short readShort() {
        C(2L);
        return this.f5548g.readShort();
    }

    @Override // n6.h
    public final void skip(long j4) {
        if (this.f5549h) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            f fVar = this.f5548g;
            if (fVar.f5524g == 0 && this.f5547f.i(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, fVar.f5524g);
            fVar.skip(min);
            j4 -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f5547f + ')';
    }

    @Override // n6.h
    public final String w(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j7 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long d7 = d((byte) 10, 0L, j7);
        f fVar = this.f5548g;
        if (d7 != -1) {
            return o6.a.a(d7, fVar);
        }
        if (j7 < Long.MAX_VALUE && e(j7) && fVar.e(j7 - 1) == 13 && e(j7 + 1) && fVar.e(j7) == 10) {
            return o6.a.a(j7, fVar);
        }
        f fVar2 = new f();
        fVar.a(fVar2, 0L, Math.min(32, fVar.f5524g));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f5524g, j4) + " content=" + fVar2.f(fVar2.f5524g).b() + (char) 8230);
    }
}
