package T6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: d, reason: collision with root package name */
    public final u f2637d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2638e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2639i;

    public p(u sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f2637d = sink;
        this.f2638e = new f();
    }

    @Override // T6.g
    public final g A(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.N(string);
        a();
        return this;
    }

    public final g a() {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f2638e;
        long j = fVar.f2617e;
        if (j == 0) {
            j = 0;
        } else {
            r rVar = fVar.f2616d;
            Intrinsics.b(rVar);
            r rVar2 = rVar.f2649g;
            Intrinsics.b(rVar2);
            if (rVar2.f2645c < 8192 && rVar2.f2647e) {
                j -= r6 - rVar2.f2644b;
            }
        }
        if (j > 0) {
            this.f2637d.x(j, fVar);
        }
        return this;
    }

    @Override // T6.u
    public final y b() {
        return this.f2637d.b();
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f2637d;
        if (this.f2639i) {
            return;
        }
        try {
            f fVar = this.f2638e;
            long j = fVar.f2617e;
            if (j > 0) {
                uVar.x(j, fVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f2639i = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // T6.g, T6.u, java.io.Flushable
    public final void flush() {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f2638e;
        long j = fVar.f2617e;
        u uVar = this.f2637d;
        if (j > 0) {
            uVar.x(j, fVar);
        }
        uVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2639i;
    }

    @Override // T6.g
    public final g k(long j) {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.L(j);
        a();
        return this;
    }

    @Override // T6.g
    public final g q(int i2) {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.K(b.e(i2));
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f2637d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        int write = this.f2638e.write(source);
        a();
        return write;
    }

    @Override // T6.g
    public final g writeByte(int i2) {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.H(i2);
        a();
        return this;
    }

    @Override // T6.g
    public final g writeInt(int i2) {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.K(i2);
        a();
        return this;
    }

    @Override // T6.g
    public final g writeShort(int i2) {
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.M(i2);
        a();
        return this;
    }

    @Override // T6.u
    public final void x(long j, f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.x(j, source);
        a();
    }

    @Override // T6.g
    public final g z(i byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f2639i) {
            throw new IllegalStateException("closed");
        }
        this.f2638e.F(byteString);
        a();
        return this;
    }

    @Override // T6.g
    public final g write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f2639i) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f2638e.write(source, 0, source.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
