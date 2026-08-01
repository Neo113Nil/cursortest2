package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f4495a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4496b;

    /* renamed from: c, reason: collision with root package name */
    public int f4497c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4498d;

    public m(q qVar, Inflater inflater) {
        this.f4495a = qVar;
        this.f4496b = inflater;
    }

    @Override // v1.w
    public final y a() {
        return this.f4495a.f4505a.a();
    }

    @Override // v1.w
    public final long c(f fVar, long j2) {
        long j3;
        X0.f.e(fVar, "sink");
        while (!this.f4498d) {
            q qVar = this.f4495a;
            Inflater inflater = this.f4496b;
            try {
                r q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f4510c);
                if (inflater.needsInput() && !qVar.g()) {
                    r rVar = qVar.f4506b.f4483a;
                    X0.f.b(rVar);
                    int i = rVar.f4510c;
                    int i2 = rVar.f4509b;
                    int i3 = i - i2;
                    this.f4497c = i3;
                    inflater.setInput(rVar.f4508a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f4508a, q2.f4510c, min);
                int i4 = this.f4497c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4497c -= remaining;
                    qVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f4510c += inflate;
                    j3 = inflate;
                    fVar.f4484b += j3;
                } else {
                    if (q2.f4509b == q2.f4510c) {
                        fVar.f4483a = q2.a();
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
        if (this.f4498d) {
            return;
        }
        this.f4496b.end();
        this.f4498d = true;
        this.f4495a.close();
    }
}
