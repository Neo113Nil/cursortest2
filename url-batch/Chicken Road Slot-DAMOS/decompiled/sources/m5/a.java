package m5;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f6559e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6560a;

    /* renamed from: b, reason: collision with root package name */
    public final File f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f6562c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f6563d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        str.getClass();
        this.f6560a = z10;
        this.f6561b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f6559e;
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
        this.f6562c = lock;
    }

    public final void a(boolean z10) {
        this.f6562c.lock();
        if (z10) {
            File file = this.f6561b;
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
                this.f6563d = channel;
            } catch (IOException e2) {
                this.f6563d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f6563d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f6562c.unlock();
    }
}
