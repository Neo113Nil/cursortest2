package s5;

import java.io.InputStream;

/* loaded from: classes4.dex */
public class b extends InputStream {
    private final com.yanzhenjie.kalle.connect.b mConnection;
    private final InputStream mStream;

    public b(com.yanzhenjie.kalle.connect.b bVar, InputStream inputStream) {
        this.mConnection = bVar;
        this.mStream = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.yanzhenjie.kalle.util.a.closeQuietly(this.mStream);
        com.yanzhenjie.kalle.util.a.closeQuietly(this.mConnection);
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i8) {
        this.mStream.mark(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.mStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.mStream.read();
    }

    @Override // java.io.InputStream
    public void reset() {
        this.mStream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        return this.mStream.skip(j8);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.mStream.read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        return this.mStream.read(bArr, i8, i9);
    }
}
