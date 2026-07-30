package f8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final a0 f3633f;

    /* renamed from: g, reason: collision with root package name */
    public final Inflater f3634g;

    /* renamed from: h, reason: collision with root package name */
    public int f3635h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3636i;

    public q(a0 a0Var, Inflater inflater) {
        this.f3633f = a0Var;
        this.f3634g = inflater;
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f3633f.f3568f.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3636i) {
            return;
        }
        this.f3634g.end();
        this.f3636i = true;
        this.f3633f.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // f8.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(long j8, f fVar) {
        long j9;
        r6.k.f(fVar, "sink");
        while (j8 >= 0) {
            if (this.f3636i) {
                throw new IllegalStateException("closed");
            }
            a0 a0Var = this.f3633f;
            Inflater inflater = this.f3634g;
            if (j8 != 0) {
                try {
                    b0 F = fVar.F(1);
                    int min = (int) Math.min(j8, 8192 - F.f3573c);
                    if (inflater.needsInput() && !a0Var.b()) {
                        b0 b0Var = a0Var.f3569g.f3597f;
                        r6.k.c(b0Var);
                        int i7 = b0Var.f3573c;
                        int i8 = b0Var.f3572b;
                        int i9 = i7 - i8;
                        this.f3635h = i9;
                        inflater.setInput(b0Var.f3571a, i8, i9);
                    }
                    int inflate = inflater.inflate(F.f3571a, F.f3573c, min);
                    int i10 = this.f3635h;
                    if (i10 != 0) {
                        int remaining = i10 - inflater.getRemaining();
                        this.f3635h -= remaining;
                        a0Var.skip(remaining);
                    }
                    if (inflate > 0) {
                        F.f3573c += inflate;
                        j9 = inflate;
                        fVar.f3598g += j9;
                        if (j9 <= 0) {
                            return j9;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (a0Var.b()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (F.f3572b == F.f3573c) {
                        fVar.f3597f = F.a();
                        c0.a(F);
                    }
                } catch (DataFormatException e9) {
                    throw new IOException(e9);
                }
            }
            j9 = 0;
            if (j9 <= 0) {
            }
        }
        throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
    }
}
