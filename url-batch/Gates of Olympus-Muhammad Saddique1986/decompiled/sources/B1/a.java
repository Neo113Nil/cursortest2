package B1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f475e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f476a;

    /* renamed from: b, reason: collision with root package name */
    public final File f477b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f478c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f479d;

    public a(String str, File file, boolean z3) {
        Lock lock;
        this.f476a = z3;
        this.f477b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f475e;
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
        this.f478c = lock;
    }

    public final void a(boolean z3) {
        this.f478c.lock();
        if (z3) {
            File file = this.f477b;
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
                this.f479d = channel;
            } catch (IOException e3) {
                this.f479d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e3);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f479d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f478c.unlock();
    }
}
