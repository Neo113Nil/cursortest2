package C1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f191a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f192b;

    /* renamed from: c, reason: collision with root package name */
    public int f193c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f191a = pVar;
        this.f192b = inflater;
    }

    @Override // C1.v
    public final x a() {
        return this.f191a.f200a.a();
    }

    @Override // C1.v
    public final long b(f fVar, long j2) {
        long j3;
        e1.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f191a;
            Inflater inflater = this.f192b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f205c);
                if (inflater.needsInput() && !pVar.g()) {
                    q qVar = pVar.f201b.f181a;
                    e1.d.b(qVar);
                    int i = qVar.f205c;
                    int i2 = qVar.f204b;
                    int i3 = i - i2;
                    this.f193c = i3;
                    inflater.setInput(qVar.f203a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f203a, q2.f205c, min);
                int i4 = this.f193c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f193c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f205c += inflate;
                    j3 = inflate;
                    fVar.f182b += j3;
                } else {
                    if (q2.f204b == q2.f205c) {
                        fVar.f181a = q2.a();
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
        this.f192b.end();
        this.d = true;
        this.f191a.close();
    }
}
