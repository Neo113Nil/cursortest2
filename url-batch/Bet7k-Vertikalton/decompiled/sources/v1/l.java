package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f4082a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4083b;

    /* renamed from: c, reason: collision with root package name */
    public int f4084c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f4082a = pVar;
        this.f4083b = inflater;
    }

    @Override // v1.v
    public final x a() {
        return this.f4082a.f4090a.a();
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        long j3;
        X0.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f4082a;
            Inflater inflater = this.f4083b;
            try {
                q o2 = fVar.o(1);
                int min = (int) Math.min(8192L, 8192 - o2.f4095c);
                if (inflater.needsInput() && !pVar.e()) {
                    q qVar = pVar.f4091b.f4072a;
                    X0.d.b(qVar);
                    int i = qVar.f4095c;
                    int i2 = qVar.f4094b;
                    int i3 = i - i2;
                    this.f4084c = i3;
                    inflater.setInput(qVar.f4093a, i2, i3);
                }
                int inflate = inflater.inflate(o2.f4093a, o2.f4095c, min);
                int i4 = this.f4084c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4084c -= remaining;
                    pVar.p(remaining);
                }
                if (inflate > 0) {
                    o2.f4095c += inflate;
                    j3 = inflate;
                    fVar.f4073b += j3;
                } else {
                    if (o2.f4094b == o2.f4095c) {
                        fVar.f4072a = o2.a();
                        r.a(o2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.e()) {
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
        this.f4083b.end();
        this.d = true;
        this.f4082a.close();
    }
}
