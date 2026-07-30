package Y4;

import b5.C0278a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import v5.C0978d;

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final File f2917d;

    /* renamed from: e, reason: collision with root package name */
    public final C0278a f2918e;

    /* renamed from: l, reason: collision with root package name */
    public final long f2920l;

    /* renamed from: m, reason: collision with root package name */
    public final FileOutputStream f2921m;

    /* renamed from: o, reason: collision with root package name */
    public int f2923o;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2922n = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final C0978d f2919i = C0978d.f8235a;

    public b(File file, long j, C0278a c0278a) {
        this.f2917d = file;
        this.f2918e = c0278a;
        this.f2920l = j + c0278a.f4157a;
        this.f2923o = (int) file.length();
        this.f2921m = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f2922n.compareAndSet(false, true)) {
            this.f2921m.close();
        }
    }

    public final String toString() {
        return "WritableFile{file=" + this.f2917d + '}';
    }
}
