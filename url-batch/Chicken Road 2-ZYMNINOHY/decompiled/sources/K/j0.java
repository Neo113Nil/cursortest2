package K;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class j0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f1379a;

    public j0(FileOutputStream fileOutputStream) {
        this.f1379a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f1379a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i4) {
        this.f1379a.write(i4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b4) {
        kotlin.jvm.internal.i.e(b4, "b");
        this.f1379a.write(b4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i4, int i5) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.f1379a.write(bytes, i4, i5);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
