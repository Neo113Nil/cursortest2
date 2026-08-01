package M1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f808a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f809b;

    /* renamed from: c, reason: collision with root package name */
    public int f810c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f808a = pVar;
        this.f809b = inflater;
    }

    @Override // M1.v
    public final x b() {
        return this.f808a.f817a.b();
    }

    @Override // M1.v
    public final long c(f fVar, long j2) {
        long j3;
        k1.e.e(fVar, "sink");
        while (!this.d) {
            p pVar = this.f808a;
            Inflater inflater = this.f809b;
            try {
                q w2 = fVar.w(1);
                int min = (int) Math.min(8192L, 8192 - w2.f822c);
                if (inflater.needsInput() && !pVar.a()) {
                    q qVar = pVar.f818b.f798a;
                    k1.e.b(qVar);
                    int i = qVar.f822c;
                    int i2 = qVar.f821b;
                    int i3 = i - i2;
                    this.f810c = i3;
                    inflater.setInput(qVar.f820a, i2, i3);
                }
                int inflate = inflater.inflate(w2.f820a, w2.f822c, min);
                int i4 = this.f810c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f810c -= remaining;
                    pVar.x(remaining);
                }
                if (inflate > 0) {
                    w2.f822c += inflate;
                    j3 = inflate;
                    fVar.f799b += j3;
                } else {
                    if (w2.f821b == w2.f822c) {
                        fVar.f798a = w2.a();
                        r.a(w2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.a()) {
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
        this.f809b.end();
        this.d = true;
        this.f808a.close();
    }
}
