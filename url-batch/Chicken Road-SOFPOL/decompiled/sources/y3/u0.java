package y3;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final FileOutputStream f8948d;

    public u0(FileOutputStream fileOutputStream) {
        this.f8948d = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f8948d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f8948d.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        q6.i.e(bArr, "b");
        this.f8948d.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i8) {
        q6.i.e(bArr, "bytes");
        this.f8948d.write(bArr, i, i8);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
