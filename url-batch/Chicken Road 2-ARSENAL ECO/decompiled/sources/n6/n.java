package n6;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class n implements u {

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f5541f;

    /* renamed from: g, reason: collision with root package name */
    public final y f5542g;

    public n(OutputStream out, y yVar) {
        kotlin.jvm.internal.i.e(out, "out");
        this.f5541f = out;
        this.f5542g = yVar;
    }

    @Override // n6.u
    public final y b() {
        return this.f5542g;
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5541f.close();
    }

    @Override // n6.u, java.io.Flushable
    public final void flush() {
        this.f5541f.flush();
    }

    @Override // n6.u
    public final void l(long j4, f fVar) {
        b.d(fVar.f5524g, 0L, j4);
        while (j4 > 0) {
            this.f5542g.f();
            r rVar = fVar.f5523f;
            kotlin.jvm.internal.i.b(rVar);
            int min = (int) Math.min(j4, rVar.f5552c - rVar.f5551b);
            this.f5541f.write(rVar.f5550a, rVar.f5551b, min);
            int i7 = rVar.f5551b + min;
            rVar.f5551b = i7;
            long j7 = min;
            j4 -= j7;
            fVar.f5524g -= j7;
            if (i7 == rVar.f5552c) {
                fVar.f5523f = rVar.a();
                s.a(rVar);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.f5541f + ')';
    }
}
