package a5;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182a extends InputStream {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3101i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f3102d;

    /* renamed from: e, reason: collision with root package name */
    public final FileChannel f3103e;

    public C0182a(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.f3102d = randomAccessFile;
        this.f3103e = fileChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3103e.close();
        this.f3102d.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f3102d.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f3102d.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i5) {
        return this.f3102d.read(bArr, i2, i5);
    }
}
