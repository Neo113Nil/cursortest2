package r4;

import O4.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import u4.C0693a;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final File f5854f;

    /* renamed from: g, reason: collision with root package name */
    public final C0693a f5855g;

    /* renamed from: i, reason: collision with root package name */
    public final long f5857i;

    /* renamed from: j, reason: collision with root package name */
    public final FileOutputStream f5858j;

    /* renamed from: l, reason: collision with root package name */
    public int f5860l;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f5859k = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final d f5856h = d.f1793a;

    public C0619b(File file, long j4, C0693a c0693a) {
        this.f5854f = file;
        this.f5855g = c0693a;
        this.f5857i = j4 + c0693a.f6036a;
        this.f5860l = (int) file.length();
        this.f5858j = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5859k.compareAndSet(false, true)) {
            this.f5858j.close();
        }
    }

    public final String toString() {
        return "WritableFile{file=" + this.f5854f + '}';
    }
}
