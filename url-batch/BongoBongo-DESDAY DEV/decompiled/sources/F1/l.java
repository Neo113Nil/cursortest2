package F1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f256a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f257b;

    /* renamed from: c, reason: collision with root package name */
    public int f258c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f256a = pVar;
        this.f257b = inflater;
    }

    @Override // F1.v
    public final x a() {
        return this.f256a.f265a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f257b.end();
        this.d = true;
        this.f256a.close();
    }

    @Override // F1.v
    public final long d(f fVar, long j2) {
        long j3;
        h1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f256a;
            Inflater inflater = this.f257b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f270c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f266b.f246a;
                    h1.d.b(qVar);
                    int i = qVar.f270c;
                    int i2 = qVar.f269b;
                    int i3 = i - i2;
                    this.f258c = i3;
                    inflater.setInput(qVar.f268a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f268a, q2.f270c, min);
                int i4 = this.f258c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f258c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f270c += inflate;
                    j3 = inflate;
                    fVar.f247b += j3;
                } else {
                    if (q2.f269b == q2.f270c) {
                        fVar.f246a = q2.a();
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
}
