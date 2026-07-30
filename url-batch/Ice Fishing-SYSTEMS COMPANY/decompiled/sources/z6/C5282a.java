package z6;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5282a extends InputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f42176v = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f42177n;

    /* renamed from: u, reason: collision with root package name */
    public final FileChannel f42178u;

    public C5282a(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.f42177n = randomAccessFile;
        this.f42178u = fileChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42178u.close();
        this.f42177n.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f42177n.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f42177n.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        return this.f42177n.read(bArr, i, i4);
    }
}
