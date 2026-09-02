package n6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: f, reason: collision with root package name */
    public final q f5535f;

    /* renamed from: g, reason: collision with root package name */
    public final Inflater f5536g;

    /* renamed from: h, reason: collision with root package name */
    public int f5537h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5538i;

    public l(q qVar, Inflater inflater) {
        this.f5535f = qVar;
        this.f5536g = inflater;
    }

    @Override // n6.w
    public final y b() {
        return this.f5535f.f5547f.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5538i) {
            return;
        }
        this.f5536g.end();
        this.f5538i = true;
        this.f5535f.close();
    }

    @Override // n6.w
    public final long i(long j4, f fVar) {
        long j7;
        Inflater inflater = this.f5536g;
        while (!this.f5538i) {
            try {
                r F6 = fVar.F(1);
                int min = (int) Math.min(8192L, 8192 - F6.f5552c);
                boolean needsInput = inflater.needsInput();
                q qVar = this.f5535f;
                if (needsInput && !qVar.a()) {
                    r rVar = qVar.f5548g.f5523f;
                    kotlin.jvm.internal.i.b(rVar);
                    int i7 = rVar.f5552c;
                    int i8 = rVar.f5551b;
                    int i9 = i7 - i8;
                    this.f5537h = i9;
                    inflater.setInput(rVar.f5550a, i8, i9);
                }
                int inflate = inflater.inflate(F6.f5550a, F6.f5552c, min);
                int i10 = this.f5537h;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f5537h -= remaining;
                    qVar.skip(remaining);
                }
                if (inflate > 0) {
                    F6.f5552c += inflate;
                    j7 = inflate;
                    fVar.f5524g += j7;
                } else {
                    if (F6.f5551b == F6.f5552c) {
                        fVar.f5523f = F6.a();
                        s.a(F6);
                    }
                    j7 = 0;
                }
                if (j7 > 0) {
                    return j7;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (qVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
        throw new IllegalStateException("closed");
    }
}
