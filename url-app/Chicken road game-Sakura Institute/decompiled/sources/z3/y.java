package z3;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f12043d;

    public y(z zVar) {
        this.f12043d = zVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        z zVar = this.f12043d;
        if (zVar.f12046i) {
            throw new IOException("closed");
        }
        return (int) Math.min(zVar.f12045e.f11999e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12043d.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        z zVar = this.f12043d;
        if (zVar.f12046i) {
            throw new IOException("closed");
        }
        C1448f c1448f = zVar.f12045e;
        if (c1448f.f11999e == 0 && zVar.f12044d.l(c1448f, 8192L) == -1) {
            return -1;
        }
        return c1448f.h() & 255;
    }

    public final String toString() {
        return this.f12043d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i2, int i4) {
        Intrinsics.checkNotNullParameter(data, "data");
        z zVar = this.f12043d;
        if (!zVar.f12046i) {
            m3.s.g(data.length, i2, i4);
            C1448f c1448f = zVar.f12045e;
            if (c1448f.f11999e == 0 && zVar.f12044d.l(c1448f, 8192L) == -1) {
                return -1;
            }
            return c1448f.g(data, i2, i4);
        }
        throw new IOException("closed");
    }
}
