package D;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class o0 extends OutputStream {

    /* renamed from: e, reason: collision with root package name */
    public final FileOutputStream f251e;

    public o0(FileOutputStream fileOutputStream) {
        this.f251e = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f251e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f251e.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        F0.i.e(bArr, "b");
        this.f251e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        F0.i.e(bArr, "bytes");
        this.f251e.write(bArr, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
