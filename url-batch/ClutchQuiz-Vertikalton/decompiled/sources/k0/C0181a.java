package k0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181a {
    public static final HashMap d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f2815a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f2816b;

    /* renamed from: c, reason: collision with root package name */
    public FileChannel f2817c;

    public C0181a(String str, File file) {
        Lock lock;
        this.f2815a = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = d;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2816b = lock;
    }

    public final void a(boolean z2) {
        this.f2816b.lock();
        if (z2) {
            File file = this.f2815a;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f2817c = channel;
            } catch (IOException e2) {
                this.f2817c = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f2817c;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f2816b.unlock();
    }
}
