package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements B {

    /* renamed from: b, reason: collision with root package name */
    private final g f43284b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f43285c;

    /* renamed from: d, reason: collision with root package name */
    private int f43286d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43287e;

    public n(g source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f43284b = source;
        this.f43285c = inflater;
    }

    private final void n() {
        int i4 = this.f43286d;
        if (i4 == 0) {
            return;
        }
        int remaining = i4 - this.f43285c.getRemaining();
        this.f43286d -= remaining;
        this.f43284b.H(remaining);
    }

    public final long a(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f43287e) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return 0L;
        }
        try {
            w o02 = sink.o0(1);
            int min = (int) Math.min(j4, 8192 - o02.f43306c);
            m();
            int inflate = this.f43285c.inflate(o02.f43304a, o02.f43306c, min);
            n();
            if (inflate > 0) {
                o02.f43306c += inflate;
                long j5 = inflate;
                sink.k0(sink.l0() + j5);
                return j5;
            }
            if (o02.f43305b == o02.f43306c) {
                sink.f43260b = o02.b();
                x.b(o02);
            }
            return 0L;
        } catch (DataFormatException e4) {
            throw new IOException(e4);
        }
    }

    @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f43287e) {
            return;
        }
        this.f43285c.end();
        this.f43287e = true;
        this.f43284b.close();
    }

    public final boolean m() {
        if (!this.f43285c.needsInput()) {
            return false;
        }
        if (this.f43284b.v()) {
            return true;
        }
        w wVar = this.f43284b.q().f43260b;
        Intrinsics.checkNotNull(wVar);
        int i4 = wVar.f43306c;
        int i5 = wVar.f43305b;
        int i6 = i4 - i5;
        this.f43286d = i6;
        this.f43285c.setInput(wVar.f43304a, i5, i6);
        return false;
    }

    @Override // okio.B
    public long read(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long a4 = a(sink, j4);
            if (a4 > 0) {
                return a4;
            }
            if (this.f43285c.finished() || this.f43285c.needsDictionary()) {
                return -1L;
            }
        } while (!this.f43284b.v());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.B
    public C timeout() {
        return this.f43284b.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(B source, Inflater inflater) {
        this(p.d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
