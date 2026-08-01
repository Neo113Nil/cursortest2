package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f4499a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4500b;

    /* renamed from: c, reason: collision with root package name */
    public int f4501c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4502d;

    public m(q qVar, Inflater inflater) {
        this.f4499a = qVar;
        this.f4500b = inflater;
    }

    @Override // v1.w
    public final y a() {
        return this.f4499a.f4509a.a();
    }

    @Override // v1.w
    public final long c(f fVar, long j2) {
        long j3;
        X0.f.e(fVar, "sink");
        while (!this.f4502d) {
            q qVar = this.f4499a;
            Inflater inflater = this.f4500b;
            try {
                r q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f4514c);
                if (inflater.needsInput() && !qVar.g()) {
                    r rVar = qVar.f4510b.f4487a;
                    X0.f.b(rVar);
                    int i = rVar.f4514c;
                    int i2 = rVar.f4513b;
                    int i3 = i - i2;
                    this.f4501c = i3;
                    inflater.setInput(rVar.f4512a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f4512a, q2.f4514c, min);
                int i4 = this.f4501c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4501c -= remaining;
                    qVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f4514c += inflate;
                    j3 = inflate;
                    fVar.f4488b += j3;
                } else {
                    if (q2.f4513b == q2.f4514c) {
                        fVar.f4487a = q2.a();
                        s.a(q2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (qVar.g()) {
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
        if (this.f4502d) {
            return;
        }
        this.f4500b.end();
        this.f4502d = true;
        this.f4499a.close();
    }
}
