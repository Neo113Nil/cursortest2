package u8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class k implements x {

    /* renamed from: n, reason: collision with root package name */
    public final r f41288n;

    /* renamed from: u, reason: collision with root package name */
    public final Inflater f41289u;

    /* renamed from: v, reason: collision with root package name */
    public int f41290v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41291w;

    public k(r rVar, Inflater inflater) {
        this.f41288n = rVar;
        this.f41289u = inflater;
    }

    @Override // u8.x
    public final z L() {
        return this.f41288n.f41308n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41291w) {
            return;
        }
        this.f41289u.end();
        this.f41291w = true;
        this.f41288n.close();
    }

    @Override // u8.x
    public final long f(long j9, e sink) {
        long j10;
        kotlin.jvm.internal.h.e(sink, "sink");
        while (!this.f41291w) {
            r rVar = this.f41288n;
            Inflater inflater = this.f41289u;
            try {
                s J = sink.J(1);
                int min = (int) Math.min(8192L, 8192 - J.f41313c);
                if (inflater.needsInput() && !rVar.b()) {
                    s sVar = rVar.f41309u.f41276n;
                    kotlin.jvm.internal.h.b(sVar);
                    int i = sVar.f41313c;
                    int i4 = sVar.f41312b;
                    int i9 = i - i4;
                    this.f41290v = i9;
                    inflater.setInput(sVar.f41311a, i4, i9);
                }
                int inflate = inflater.inflate(J.f41311a, J.f41313c, min);
                int i10 = this.f41290v;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f41290v -= remaining;
                    rVar.E(remaining);
                }
                if (inflate > 0) {
                    J.f41313c += inflate;
                    j10 = inflate;
                    sink.f41277u += j10;
                } else {
                    if (J.f41312b == J.f41313c) {
                        sink.f41276n = J.a();
                        t.a(J);
                    }
                    j10 = 0;
                }
                if (j10 > 0) {
                    return j10;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (rVar.b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e6) {
                throw new IOException(e6);
            }
        }
        throw new IllegalStateException("closed");
    }
}
