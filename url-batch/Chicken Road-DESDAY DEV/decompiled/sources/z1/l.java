package z1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f4277a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4278b;

    /* renamed from: c, reason: collision with root package name */
    public int f4279c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f4277a = pVar;
        this.f4278b = inflater;
    }

    @Override // z1.v
    public final x a() {
        return this.f4277a.f4286a.a();
    }

    @Override // z1.v
    public final long b(f fVar, long j2) {
        long j3;
        b1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f4277a;
            Inflater inflater = this.f4278b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f4291c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f4287b.f4267a;
                    b1.d.b(qVar);
                    int i = qVar.f4291c;
                    int i2 = qVar.f4290b;
                    int i3 = i - i2;
                    this.f4279c = i3;
                    inflater.setInput(qVar.f4289a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f4289a, q2.f4291c, min);
                int i4 = this.f4279c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4279c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f4291c += inflate;
                    j3 = inflate;
                    fVar.f4268b += j3;
                } else {
                    if (q2.f4290b == q2.f4291c) {
                        fVar.f4267a = q2.a();
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
        this.f4278b.end();
        this.d = true;
        this.f4277a.close();
    }
}
