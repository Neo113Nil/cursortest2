package T2;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4452d;

    public y(z zVar) {
        this.f4452d = zVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        z zVar = this.f4452d;
        if (zVar.f4455f) {
            throw new IOException("closed");
        }
        return (int) Math.min(zVar.f4454e.f4409e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4452d.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        z zVar = this.f4452d;
        if (zVar.f4455f) {
            throw new IOException("closed");
        }
        C0231f c0231f = zVar.f4454e;
        if (c0231f.f4409e == 0 && zVar.f4453d.f(c0231f, 8192L) == -1) {
            return -1;
        }
        return c0231f.h() & 255;
    }

    public final String toString() {
        return this.f4452d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        f2.j.f(bArr, "data");
        z zVar = this.f4452d;
        if (!zVar.f4455f) {
            O2.l.R(bArr.length, i3, i4);
            C0231f c0231f = zVar.f4454e;
            if (c0231f.f4409e == 0 && zVar.f4453d.f(c0231f, 8192L) == -1) {
                return -1;
            }
            return c0231f.g(bArr, i3, i4);
        }
        throw new IOException("closed");
    }
}
