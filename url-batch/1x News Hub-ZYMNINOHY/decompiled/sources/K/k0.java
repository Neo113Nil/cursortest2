package K;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class k0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f790a;

    public k0(FileOutputStream fileOutputStream) {
        this.f790a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f790a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f790a.write(i3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b3) {
        kotlin.jvm.internal.j.e(b3, "b");
        this.f790a.write(b3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i3, int i4) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f790a.write(bytes, i3, i4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
