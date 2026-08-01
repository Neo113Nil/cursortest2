package x1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f4245a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4246b;

    /* renamed from: c, reason: collision with root package name */
    public int f4247c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f4245a = pVar;
        this.f4246b = inflater;
    }

    @Override // x1.v
    public final x a() {
        return this.f4245a.f4254a.a();
    }

    @Override // x1.v
    public final long b(f fVar, long j2) {
        long j3;
        Z0.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f4245a;
            Inflater inflater = this.f4246b;
            try {
                q q2 = fVar.q(1);
                int min = (int) Math.min(8192L, 8192 - q2.f4259c);
                if (inflater.needsInput() && !pVar.f()) {
                    q qVar = pVar.f4255b.f4235a;
                    Z0.d.b(qVar);
                    int i = qVar.f4259c;
                    int i2 = qVar.f4258b;
                    int i3 = i - i2;
                    this.f4247c = i3;
                    inflater.setInput(qVar.f4257a, i2, i3);
                }
                int inflate = inflater.inflate(q2.f4257a, q2.f4259c, min);
                int i4 = this.f4247c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4247c -= remaining;
                    pVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f4259c += inflate;
                    j3 = inflate;
                    fVar.f4236b += j3;
                } else {
                    if (q2.f4258b == q2.f4259c) {
                        fVar.f4235a = q2.a();
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
                if (pVar.f()) {
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
        this.f4246b.end();
        this.d = true;
        this.f4245a.close();
    }
}
