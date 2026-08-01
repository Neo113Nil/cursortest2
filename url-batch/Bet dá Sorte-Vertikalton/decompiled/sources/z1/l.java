package z1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f4278a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4279b;

    /* renamed from: c, reason: collision with root package name */
    public int f4280c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f4278a = pVar;
        this.f4279b = inflater;
    }

    @Override // z1.v
    public final x a() {
        return this.f4278a.f4287a.a();
    }

    @Override // z1.v
    public final long b(f fVar, long j2) {
        long j3;
        b1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f4278a;
            Inflater inflater = this.f4279b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f4292c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f4288b.f4268a;
                    b1.d.b(qVar);
                    int i = qVar.f4292c;
                    int i2 = qVar.f4291b;
                    int i3 = i - i2;
                    this.f4280c = i3;
                    inflater.setInput(qVar.f4290a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f4290a, q2.f4292c, min);
                int i4 = this.f4280c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4280c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f4292c += inflate;
                    j3 = inflate;
                    fVar.f4269b += j3;
                } else {
                    if (q2.f4291b == q2.f4292c) {
                        fVar.f4268a = q2.a();
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
        this.f4279b.end();
        this.d = true;
        this.f4278a.close();
    }
}
