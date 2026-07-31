package T2;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class w extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f4448d;

    public w(x xVar) {
        this.f4448d = xVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4448d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        x xVar = this.f4448d;
        if (xVar.f4451f) {
            return;
        }
        xVar.flush();
    }

    public final String toString() {
        return this.f4448d + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        x xVar = this.f4448d;
        if (xVar.f4451f) {
            throw new IOException("closed");
        }
        xVar.f4450e.E((byte) i3);
        xVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        f2.j.f(bArr, "data");
        x xVar = this.f4448d;
        if (!xVar.f4451f) {
            xVar.f4450e.z(bArr, i3, i4);
            xVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
