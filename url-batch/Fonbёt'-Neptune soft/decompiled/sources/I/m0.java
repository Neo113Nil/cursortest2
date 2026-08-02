package I;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m0 extends OutputStream {

    /* renamed from: e, reason: collision with root package name */
    public final FileOutputStream f688e;

    public m0(FileOutputStream fileOutputStream) {
        this.f688e = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f688e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f688e.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Q0.h.e(bArr, "b");
        this.f688e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        Q0.h.e(bArr, "bytes");
        this.f688e.write(bArr, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
