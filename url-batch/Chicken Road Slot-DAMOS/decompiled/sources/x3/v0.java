package x3;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public final FileOutputStream f10474d;

    public v0(FileOutputStream fileOutputStream) {
        this.f10474d = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f10474d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.f10474d.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f10474d.write(i3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        bArr.getClass();
        this.f10474d.write(bArr, i3, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
