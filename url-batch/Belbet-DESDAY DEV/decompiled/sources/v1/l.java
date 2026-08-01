package v1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f4083a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f4084b;

    /* renamed from: c, reason: collision with root package name */
    public int f4085c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f4083a = pVar;
        this.f4084b = inflater;
    }

    @Override // v1.v
    public final x a() {
        return this.f4083a.f4091a.a();
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        long j3;
        X0.d.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f4083a;
            Inflater inflater = this.f4084b;
            try {
                q o2 = fVar.o(1);
                int min = (int) Math.min(8192L, 8192 - o2.f4096c);
                if (inflater.needsInput() && !pVar.e()) {
                    q qVar = pVar.f4092b.f4073a;
                    X0.d.b(qVar);
                    int i = qVar.f4096c;
                    int i2 = qVar.f4095b;
                    int i3 = i - i2;
                    this.f4085c = i3;
                    inflater.setInput(qVar.f4094a, i2, i3);
                }
                int inflate = inflater.inflate(o2.f4094a, o2.f4096c, min);
                int i4 = this.f4085c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f4085c -= remaining;
                    pVar.p(remaining);
                }
                if (inflate > 0) {
                    o2.f4096c += inflate;
                    j3 = inflate;
                    fVar.f4074b += j3;
                } else {
                    if (o2.f4095b == o2.f4096c) {
                        fVar.f4073a = o2.a();
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
        this.f4084b.end();
        this.d = true;
        this.f4083a.close();
    }
}
