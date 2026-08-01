package m0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243a {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f3418d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f3419a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f3420b;

    /* renamed from: c, reason: collision with root package name */
    public FileChannel f3421c;

    public C0243a(String str, File file) {
        Lock lock;
        this.f3419a = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f3418d;
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
        this.f3420b = lock;
    }

    public final void a(boolean z2) {
        this.f3420b.lock();
        if (z2) {
            File file = this.f3419a;
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
                this.f3421c = channel;
            } catch (IOException e) {
                this.f3421c = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f3421c;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3420b.unlock();
    }
}
