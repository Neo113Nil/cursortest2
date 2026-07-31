package F;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class n0 extends OutputStream {

    /* renamed from: e, reason: collision with root package name */
    public final FileOutputStream f413e;

    public n0(FileOutputStream fileOutputStream) {
        this.f413e = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f413e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f413e.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        P0.h.e(bArr, "b");
        this.f413e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        P0.h.e(bArr, "bytes");
        this.f413e.write(bArr, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
