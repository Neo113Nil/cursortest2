package s5;

import java.io.InputStream;

/* loaded from: classes4.dex */
public class a extends InputStream {
    private final com.yanzhenjie.kalle.connect.b mConnection;

    public a(com.yanzhenjie.kalle.connect.b bVar) {
        this.mConnection = bVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.yanzhenjie.kalle.util.a.closeQuietly(this.mConnection);
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() {
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        return 0;
    }
}
