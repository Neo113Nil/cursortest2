package t4;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664a extends InputStream {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5960h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final RandomAccessFile f5961f;

    /* renamed from: g, reason: collision with root package name */
    public final FileChannel f5962g;

    public C0664a(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.f5961f = randomAccessFile;
        this.f5962g = fileChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5962g.close();
        this.f5961f.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f5961f.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f5961f.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        return this.f5961f.read(bArr, i7, i8);
    }
}
