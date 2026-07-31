package T2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: d, reason: collision with root package name */
    public final z f4434d;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f4435e;

    /* renamed from: f, reason: collision with root package name */
    public int f4436f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4437g;

    public p(z zVar, Inflater inflater) {
        this.f4434d = zVar;
        this.f4435e = inflater;
    }

    @Override // T2.F
    public final H c() {
        return this.f4434d.f4453d.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4437g) {
            return;
        }
        this.f4435e.end();
        this.f4437g = true;
        this.f4434d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // T2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(C0231f c0231f, long j3) {
        long j4;
        f2.j.f(c0231f, "sink");
        while (j3 >= 0) {
            if (this.f4437g) {
                throw new IllegalStateException("closed");
            }
            z zVar = this.f4434d;
            Inflater inflater = this.f4435e;
            if (j3 != 0) {
                try {
                    A x3 = c0231f.x(1);
                    int min = (int) Math.min(j3, 8192 - x3.f4374c);
                    if (inflater.needsInput() && !zVar.a()) {
                        A a3 = zVar.f4454e.f4408d;
                        f2.j.c(a3);
                        int i3 = a3.f4374c;
                        int i4 = a3.f4373b;
                        int i5 = i3 - i4;
                        this.f4436f = i5;
                        inflater.setInput(a3.f4372a, i4, i5);
                    }
                    int inflate = inflater.inflate(x3.f4372a, x3.f4374c, min);
                    int i6 = this.f4436f;
                    if (i6 != 0) {
                        int remaining = i6 - inflater.getRemaining();
                        this.f4436f -= remaining;
                        zVar.x(remaining);
                    }
                    if (inflate > 0) {
                        x3.f4374c += inflate;
                        j4 = inflate;
                        c0231f.f4409e += j4;
                        if (j4 <= 0) {
                            return j4;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (zVar.a()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (x3.f4373b == x3.f4374c) {
                        c0231f.f4408d = x3.a();
                        B.a(x3);
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
