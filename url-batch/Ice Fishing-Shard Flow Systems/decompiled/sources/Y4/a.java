package Y4;

import a5.C0182a;
import b5.C0278a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import v5.C0978d;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final File f2911d;

    /* renamed from: e, reason: collision with root package name */
    public final C0182a f2912e;

    /* renamed from: i, reason: collision with root package name */
    public final Z4.a f2913i;

    /* renamed from: m, reason: collision with root package name */
    public final long f2915m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2916n = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final C0978d f2914l = C0978d.f8235a;

    public a(File file, long j, C0278a c0278a) {
        this.f2911d = file;
        this.f2915m = j + c0278a.f4159c;
        int i2 = C0182a.f3101i;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        FileChannel channel = randomAccessFile.getChannel();
        channel.force(false);
        C0182a c0182a = new C0182a(randomAccessFile, channel);
        this.f2912e = c0182a;
        this.f2913i = new Z4.a(c0182a);
    }

    public final synchronized void a() {
        close();
        if (!this.f2911d.delete()) {
            throw new IOException("Could not delete file: " + this.f2911d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f2916n.compareAndSet(false, true)) {
            this.f2913i.close();
        }
    }

    public final synchronized void d() {
        C0182a c0182a = this.f2912e;
        FileChannel fileChannel = c0182a.f3103e;
        RandomAccessFile randomAccessFile = c0182a.f3102d;
        long filePointer = randomAccessFile.getFilePointer();
        if (filePointer != 0) {
            long size = fileChannel.size() - filePointer;
            if (size > 0) {
                byte[] bArr = new byte[(int) size];
                randomAccessFile.read(bArr);
                randomAccessFile.seek(0L);
                fileChannel.truncate(size);
                randomAccessFile.write(bArr);
                randomAccessFile.seek(0L);
            } else {
                fileChannel.truncate(0L);
            }
        }
        if (this.f2912e.f3103e.size() == 0) {
            a();
        }
    }

    public final String toString() {
        return "ReadableFile{file=" + this.f2911d + '}';
    }
}
