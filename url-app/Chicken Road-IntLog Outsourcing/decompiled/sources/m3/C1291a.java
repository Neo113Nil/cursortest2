package m3;

import J3.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.C1343a;
import o3.C1375a;
import p3.C1382a;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1291a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f11194a;

    /* renamed from: b, reason: collision with root package name */
    public final C1375a f11195b;

    /* renamed from: c, reason: collision with root package name */
    public final C1343a f11196c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11197d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11198e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11199f;

    public C1291a(File file, long j2, C1382a c1382a) {
        d dVar = d.f1367a;
        this.f11199f = new AtomicBoolean(false);
        this.f11194a = file;
        this.f11197d = dVar;
        this.f11198e = j2 + c1382a.f11641c;
        int i2 = C1375a.f11612c;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        FileChannel channel = randomAccessFile.getChannel();
        channel.force(false);
        C1375a c1375a = new C1375a(randomAccessFile, channel);
        this.f11195b = c1375a;
        this.f11196c = new C1343a(c1375a);
    }

    public final synchronized void a() {
        close();
        if (!this.f11194a.delete()) {
            throw new IOException("Could not delete file: " + this.f11194a);
        }
    }

    public final synchronized void b() {
        C1375a c1375a = this.f11195b;
        RandomAccessFile randomAccessFile = c1375a.f11613a;
        long filePointer = randomAccessFile.getFilePointer();
        if (filePointer != 0) {
            FileChannel fileChannel = c1375a.f11614b;
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
        if (this.f11195b.f11614b.size() == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f11199f.compareAndSet(false, true)) {
            this.f11196c.close();
        }
    }

    public final String toString() {
        return "ReadableFile{file=" + this.f11194a + '}';
    }
}
