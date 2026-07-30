package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oj0 extends InputStream {
    public final InputStream m;
    public int n = 1073741824;

    public oj0(InputStream inputStream) {
        this.m = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.n;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.m.read();
        if (read == -1) {
            this.n = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.m.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.m.read(bArr);
        if (read == -1) {
            this.n = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.m.read(bArr, i, i2);
        if (read == -1) {
            this.n = 0;
        }
        return read;
    }
}
