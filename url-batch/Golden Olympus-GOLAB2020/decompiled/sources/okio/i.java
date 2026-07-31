package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements z {

    /* renamed from: b, reason: collision with root package name */
    private final f f43275b;

    /* renamed from: c, reason: collision with root package name */
    private final Deflater f43276c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43277d;

    public i(f sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f43275b = sink;
        this.f43276c = deflater;
    }

    private final void a(boolean z4) {
        w o02;
        int deflate;
        C3372e q4 = this.f43275b.q();
        while (true) {
            o02 = q4.o0(1);
            if (z4) {
                try {
                    Deflater deflater = this.f43276c;
                    byte[] bArr = o02.f43304a;
                    int i4 = o02.f43306c;
                    deflate = deflater.deflate(bArr, i4, 8192 - i4, 2);
                } catch (NullPointerException e4) {
                    throw new IOException("Deflater already closed", e4);
                }
            } else {
                Deflater deflater2 = this.f43276c;
                byte[] bArr2 = o02.f43304a;
                int i5 = o02.f43306c;
                deflate = deflater2.deflate(bArr2, i5, 8192 - i5);
            }
            if (deflate > 0) {
                o02.f43306c += deflate;
                q4.k0(q4.l0() + deflate);
                this.f43275b.y();
            } else if (this.f43276c.needsInput()) {
                break;
            }
        }
        if (o02.f43305b == o02.f43306c) {
            q4.f43260b = o02.b();
            x.b(o02);
        }
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f43277d) {
            return;
        }
        try {
            m();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f43276c.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f43275b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f43277d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.z, java.io.Flushable
    public void flush() {
        a(true);
        this.f43275b.flush();
    }

    public final void m() {
        this.f43276c.finish();
        a(false);
    }

    @Override // okio.z
    public C timeout() {
        return this.f43275b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f43275b + ')';
    }

    @Override // okio.z
    public void write(C3372e source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC3369b.b(source.l0(), 0L, j4);
        while (j4 > 0) {
            w wVar = source.f43260b;
            Intrinsics.checkNotNull(wVar);
            int min = (int) Math.min(j4, wVar.f43306c - wVar.f43305b);
            this.f43276c.setInput(wVar.f43304a, wVar.f43305b, min);
            a(false);
            long j5 = min;
            source.k0(source.l0() - j5);
            int i4 = wVar.f43305b + min;
            wVar.f43305b = i4;
            if (i4 == wVar.f43306c) {
                source.f43260b = wVar.b();
                x.b(wVar);
            }
            j4 -= j5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(z sink, Deflater deflater) {
        this(p.c(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
