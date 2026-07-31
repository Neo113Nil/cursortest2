package N2;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f2972d;

    public y(z zVar) {
        this.f2972d = zVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        z zVar = this.f2972d;
        if (zVar.f2975f) {
            throw new IOException("closed");
        }
        return (int) Math.min(zVar.f2974e.f2929e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2972d.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        z zVar = this.f2972d;
        if (zVar.f2975f) {
            throw new IOException("closed");
        }
        C0150f c0150f = zVar.f2974e;
        if (c0150f.f2929e == 0 && zVar.f2973d.l(c0150f, 8192L) == -1) {
            return -1;
        }
        return c0150f.j() & 255;
    }

    public final String toString() {
        return this.f2972d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        Z1.i.f(bArr, "data");
        z zVar = this.f2972d;
        if (!zVar.f2975f) {
            I2.d.q(bArr.length, i3, i4);
            C0150f c0150f = zVar.f2974e;
            if (c0150f.f2929e == 0 && zVar.f2973d.l(c0150f, 8192L) == -1) {
                return -1;
            }
            return c0150f.i(bArr, i3, i4);
        }
        throw new IOException("closed");
    }
}
