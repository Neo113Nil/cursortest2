package r4;

import O4.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.C0632a;
import t4.C0664a;
import u4.C0693a;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618a implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final File f5848f;

    /* renamed from: g, reason: collision with root package name */
    public final C0664a f5849g;

    /* renamed from: h, reason: collision with root package name */
    public final C0632a f5850h;

    /* renamed from: j, reason: collision with root package name */
    public final long f5852j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f5853k = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final d f5851i = d.f1793a;

    public C0618a(File file, long j4, C0693a c0693a) {
        this.f5848f = file;
        this.f5852j = j4 + c0693a.f6038c;
        int i7 = C0664a.f5960h;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        FileChannel channel = randomAccessFile.getChannel();
        channel.force(false);
        C0664a c0664a = new C0664a(randomAccessFile, channel);
        this.f5849g = c0664a;
        this.f5850h = new C0632a(c0664a);
    }

    public final synchronized void a() {
        close();
        if (!this.f5848f.delete()) {
            throw new IOException("Could not delete file: " + this.f5848f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5853k.compareAndSet(false, true)) {
            this.f5850h.close();
        }
    }

    public final synchronized void d() {
        C0664a c0664a = this.f5849g;
        FileChannel fileChannel = c0664a.f5962g;
        RandomAccessFile randomAccessFile = c0664a.f5961f;
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
        if (this.f5849g.f5962g.size() == 0) {
            a();
        }
    }

    public final String toString() {
        return "ReadableFile{file=" + this.f5848f + '}';
    }
}
