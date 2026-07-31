package okio;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements f {

    /* renamed from: b, reason: collision with root package name */
    public final z f43296b;

    /* renamed from: c, reason: collision with root package name */
    public final C3372e f43297c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43298d;

    public u(z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f43296b = sink;
        this.f43297c = new C3372e();
    }

    @Override // okio.f
    public f C(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.C(string);
        return y();
    }

    @Override // okio.f
    public long F(B source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j4 = 0;
        while (true) {
            long read = source.read(this.f43297c, 8192L);
            if (read == -1) {
                return j4;
            }
            j4 += read;
            y();
        }
    }

    @Override // okio.f
    public f G(long j4) {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.G(j4);
        return y();
    }

    @Override // okio.f
    public f L(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.L(source);
        return y();
    }

    @Override // okio.f
    public f M(h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.M(byteString);
        return y();
    }

    @Override // okio.f
    public f P(long j4) {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.P(j4);
        return y();
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f43298d) {
            return;
        }
        try {
            if (this.f43297c.l0() > 0) {
                z zVar = this.f43296b;
                C3372e c3372e = this.f43297c;
                zVar.write(c3372e, c3372e.l0());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f43296b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f43298d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.f, okio.z, java.io.Flushable
    public void flush() {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        if (this.f43297c.l0() > 0) {
            z zVar = this.f43296b;
            C3372e c3372e = this.f43297c;
            zVar.write(c3372e, c3372e.l0());
        }
        this.f43296b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f43298d;
    }

    @Override // okio.f
    public C3372e q() {
        return this.f43297c;
    }

    @Override // okio.f
    public f r() {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        long l02 = this.f43297c.l0();
        if (l02 > 0) {
            this.f43296b.write(this.f43297c, l02);
        }
        return this;
    }

    @Override // okio.f
    public f s(int i4) {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.s(i4);
        return y();
    }

    @Override // okio.f
    public f t(int i4) {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.t(i4);
        return y();
    }

    @Override // okio.z
    public C timeout() {
        return this.f43296b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f43296b + ')';
    }

    @Override // okio.f
    public f w(int i4) {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        this.f43297c.w(i4);
        return y();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        int write = this.f43297c.write(source);
        y();
        return write;
    }

    @Override // okio.f
    public f y() {
        if (this.f43298d) {
            throw new IllegalStateException("closed");
        }
        long o4 = this.f43297c.o();
        if (o4 > 0) {
            this.f43296b.write(this.f43297c, o4);
        }
        return this;
    }

    @Override // okio.z
    public void write(C3372e source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f43298d) {
            this.f43297c.write(source, j4);
            y();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f write(byte[] source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f43298d) {
            this.f43297c.write(source, i4, i5);
            return y();
        }
        throw new IllegalStateException("closed");
    }
}
