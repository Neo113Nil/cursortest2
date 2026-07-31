package n6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: f, reason: collision with root package name */
    public final InputStream f5539f;

    /* renamed from: g, reason: collision with root package name */
    public final y f5540g;

    public m(InputStream inputStream, y yVar) {
        this.f5539f = inputStream;
        this.f5540g = yVar;
    }

    @Override // n6.w
    public final y b() {
        return this.f5540g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5539f.close();
    }

    @Override // n6.w
    public final long i(long j4, f fVar) {
        try {
            this.f5540g.f();
            r F6 = fVar.F(1);
            int read = this.f5539f.read(F6.f5550a, F6.f5552c, (int) Math.min(8192L, 8192 - F6.f5552c));
            if (read != -1) {
                F6.f5552c += read;
                long j7 = read;
                fVar.f5524g += j7;
                return j7;
            }
            if (F6.f5551b != F6.f5552c) {
                return -1L;
            }
            fVar.f5523f = F6.a();
            s.a(F6);
            return -1L;
        } catch (AssertionError e4) {
            if (o6.f.a(e4)) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }

    public final String toString() {
        return "source(" + this.f5539f + ')';
    }
}
