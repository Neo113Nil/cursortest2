package N2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: d, reason: collision with root package name */
    public final z f2954d;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f2955e;

    /* renamed from: f, reason: collision with root package name */
    public int f2956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2957g;

    public p(z zVar, Inflater inflater) {
        this.f2954d = zVar;
        this.f2955e = inflater;
    }

    @Override // N2.F
    public final H c() {
        return this.f2954d.f2973d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2957g) {
            return;
        }
        this.f2955e.end();
        this.f2957g = true;
        this.f2954d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // N2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l(C0150f c0150f, long j3) {
        long j4;
        Z1.i.f(c0150f, "sink");
        while (j3 >= 0) {
            if (this.f2957g) {
                throw new IllegalStateException("closed");
            }
            z zVar = this.f2954d;
            Inflater inflater = this.f2955e;
            if (j3 != 0) {
                try {
                    A D = c0150f.D(1);
                    int min = (int) Math.min(j3, 8192 - D.f2894c);
                    if (inflater.needsInput() && !zVar.a()) {
                        A a3 = zVar.f2974e.f2928d;
                        Z1.i.c(a3);
                        int i3 = a3.f2894c;
                        int i4 = a3.f2893b;
                        int i5 = i3 - i4;
                        this.f2956f = i5;
                        inflater.setInput(a3.f2892a, i4, i5);
                    }
                    int inflate = inflater.inflate(D.f2892a, D.f2894c, min);
                    int i6 = this.f2956f;
                    if (i6 != 0) {
                        int remaining = i6 - inflater.getRemaining();
                        this.f2956f -= remaining;
                        zVar.D(remaining);
                    }
                    if (inflate > 0) {
                        D.f2894c += inflate;
                        j4 = inflate;
                        c0150f.f2929e += j4;
                        if (j4 <= 0) {
                            return j4;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (zVar.a()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (D.f2893b == D.f2894c) {
                        c0150f.f2928d = D.a();
                        B.a(D);
                    }
                } catch (DataFormatException e3) {
                    throw new IOException(e3);
                }
            }
            j4 = 0;
            if (j4 <= 0) {
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }
}
