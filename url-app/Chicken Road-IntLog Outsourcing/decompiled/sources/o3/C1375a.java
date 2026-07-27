package o3;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375a extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11612c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f11613a;

    /* renamed from: b, reason: collision with root package name */
    public final FileChannel f11614b;

    public C1375a(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.f11613a = randomAccessFile;
        this.f11614b = fileChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11614b.close();
        this.f11613a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f11613a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f11613a.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        return this.f11613a.read(bArr, i2, i3);
    }
}
