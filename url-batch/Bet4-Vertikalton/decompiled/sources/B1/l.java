package B1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f78a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f79b;

    /* renamed from: c, reason: collision with root package name */
    public int f80c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f78a = pVar;
        this.f79b = inflater;
    }

    @Override // B1.v
    public final x a() {
        return this.f78a.f87a.a();
    }

    @Override // B1.v
    public final long c(f fVar, long j2) {
        long j3;
        d1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f78a;
            Inflater inflater = this.f79b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f92c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f88b.f68a;
                    d1.d.b(qVar);
                    int i = qVar.f92c;
                    int i2 = qVar.f91b;
                    int i3 = i - i2;
                    this.f80c = i3;
                    inflater.setInput(qVar.f90a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f90a, q2.f92c, min);
                int i4 = this.f80c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f80c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f92c += inflate;
                    j3 = inflate;
                    fVar.f69b += j3;
                } else {
                    if (q2.f91b == q2.f92c) {
                        fVar.f68a = q2.a();
                        r.a(q2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.g()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f79b.end();
        this.d = true;
        this.f78a.close();
    }
}
