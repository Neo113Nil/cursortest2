package M1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final p f836a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f837b;

    /* renamed from: c, reason: collision with root package name */
    public int f838c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f839d;

    public l(p pVar, Inflater inflater) {
        this.f836a = pVar;
        this.f837b = inflater;
    }

    @Override // M1.v
    public final x b() {
        return this.f836a.f846a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f839d) {
            return;
        }
        this.f837b.end();
        this.f839d = true;
        this.f836a.close();
    }

    @Override // M1.v
    public final long h(f fVar, long j) {
        long j2;
        j1.h.e(fVar, "sink");
        while (!this.f839d) {
            p pVar = this.f836a;
            Inflater inflater = this.f837b;
            try {
                q I2 = fVar.I(1);
                int min = (int) Math.min(8192L, 8192 - I2.f851c);
                if (inflater.needsInput() && !pVar.a()) {
                    q qVar = pVar.f847b.f826a;
                    j1.h.b(qVar);
                    int i = qVar.f851c;
                    int i2 = qVar.f850b;
                    int i3 = i - i2;
                    this.f838c = i3;
                    inflater.setInput(qVar.f849a, i2, i3);
                }
                int inflate = inflater.inflate(I2.f849a, I2.f851c, min);
                int i4 = this.f838c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f838c -= remaining;
                    pVar.J(remaining);
                }
                if (inflate > 0) {
                    I2.f851c += inflate;
                    j2 = inflate;
                    fVar.f827b += j2;
                } else {
                    if (I2.f850b == I2.f851c) {
                        fVar.f826a = I2.a();
                        r.a(I2);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }
}
