package E1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f211a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f212b;

    /* renamed from: c, reason: collision with root package name */
    public int f213c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f211a = pVar;
        this.f212b = inflater;
    }

    @Override // E1.v
    public final x a() {
        return this.f211a.f220a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f212b.end();
        this.d = true;
        this.f211a.close();
    }

    @Override // E1.v
    public final long d(f fVar, long j2) {
        long j3;
        g1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f211a;
            Inflater inflater = this.f212b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f225c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f221b.f201a;
                    g1.d.b(qVar);
                    int i = qVar.f225c;
                    int i2 = qVar.f224b;
                    int i3 = i - i2;
                    this.f213c = i3;
                    inflater.setInput(qVar.f223a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f223a, q2.f225c, min);
                int i4 = this.f213c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f213c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f225c += inflate;
                    j3 = inflate;
                    fVar.f202b += j3;
                } else {
                    if (q2.f224b == q2.f225c) {
                        fVar.f201a = q2.a();
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
