package g4;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: f, reason: collision with root package name */
    public final p f1942f;

    /* renamed from: g, reason: collision with root package name */
    public final Inflater f1943g;
    public int h;
    public boolean i;

    public l(p pVar, Inflater inflater) {
        this.f1942f = pVar;
        this.f1943g = inflater;
    }

    @Override // g4.v
    public final x a() {
        return this.f1942f.f1949f.a();
    }

    @Override // g4.v
    public final long c(long j2, f fVar) {
        long j4;
        Inflater inflater = this.f1943g;
        while (!this.i) {
            try {
                q t4 = fVar.t(1);
                int min = (int) Math.min(8192L, 8192 - t4.f1953c);
                boolean needsInput = inflater.needsInput();
                p pVar = this.f1942f;
                if (needsInput && !pVar.m()) {
                    q qVar = pVar.f1950g.f1934f;
                    i3.d.b(qVar);
                    int i = qVar.f1953c;
                    int i4 = qVar.f1952b;
                    int i5 = i - i4;
                    this.h = i5;
                    inflater.setInput(qVar.f1951a, i4, i5);
                }
                int inflate = inflater.inflate(t4.f1951a, t4.f1953c, min);
                int i6 = this.h;
                if (i6 != 0) {
                    int remaining = i6 - inflater.getRemaining();
                    this.h -= remaining;
                    pVar.skip(remaining);
                }
                if (inflate > 0) {
                    t4.f1953c += inflate;
                    j4 = inflate;
                    fVar.f1935g += j4;
                } else {
                    if (t4.f1952b == t4.f1953c) {
                        fVar.f1934f = t4.a();
                        r.a(t4);
                    }
                    j4 = 0;
                }
                if (j4 > 0) {
                    return j4;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.m()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.f1943g.end();
        this.i = true;
        this.f1942f.close();
    }
}
