package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v13 extends OutputStream {
    public final FileOutputStream m;

    public v13(FileOutputStream fileOutputStream) {
        this.m = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.m.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.m.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.m.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.m.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
