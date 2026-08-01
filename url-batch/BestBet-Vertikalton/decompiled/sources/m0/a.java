package m0;

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
    public static final HashMap f3534e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3535a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3536b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f3537c;
    public FileChannel d;

    public a(String str, File file, boolean z2) {
        Lock lock;
        this.f3535a = z2;
        this.f3536b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f3534e;
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
        this.f3537c = lock;
    }

    public final void a(boolean z2) {
        this.f3537c.lock();
        if (z2) {
            File file = this.f3536b;
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
                this.d = channel;
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3537c.unlock();
    }
}
