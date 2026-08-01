package E1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f212a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f213b;

    /* renamed from: c, reason: collision with root package name */
    public int f214c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f212a = pVar;
        this.f213b = inflater;
    }

    @Override // E1.v
    public final x a() {
        return this.f212a.f221a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.f213b.end();
        this.d = true;
        this.f212a.close();
    }

    @Override // E1.v
    public final long d(f fVar, long j2) {
        long j3;
        g1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f212a;
            Inflater inflater = this.f213b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f226c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f222b.f202a;
                    g1.d.b(qVar);
                    int i = qVar.f226c;
                    int i2 = qVar.f225b;
                    int i3 = i - i2;
                    this.f214c = i3;
                    inflater.setInput(qVar.f224a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f224a, q2.f226c, min);
                int i4 = this.f214c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f214c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f226c += inflate;
                    j3 = inflate;
                    fVar.f203b += j3;
                } else {
                    if (q2.f225b == q2.f226c) {
                        fVar.f202a = q2.a();
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
