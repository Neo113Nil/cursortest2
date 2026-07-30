package N1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final long f1954n;

    /* renamed from: u, reason: collision with root package name */
    public int f1955u;

    public d(InputStream inputStream, long j9) {
        super(inputStream);
        this.f1954n = j9;
    }

    public final void a(int i) {
        if (i >= 0) {
            this.f1955u += i;
            return;
        }
        long j9 = this.f1955u;
        long j10 = this.f1954n;
        if (j10 - j9 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j10 + ", but read: " + this.f1955u);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f1954n - this.f1955u, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i4) {
        int read;
        read = super.read(bArr, i, i4);
        a(read);
        return read;
    }
}
