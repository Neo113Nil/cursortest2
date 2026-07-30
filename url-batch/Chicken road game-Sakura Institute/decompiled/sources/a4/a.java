package a4;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f486d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f487a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f488b;

    /* renamed from: c, reason: collision with root package name */
    public FileChannel f489c;

    public a(String str, File file) {
        Lock lock;
        this.f487a = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f486d;
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
        this.f488b = lock;
    }

    public final void a(boolean z8) {
        this.f488b.lock();
        if (z8) {
            File file = this.f487a;
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
                this.f489c = channel;
            } catch (IOException e9) {
                this.f489c = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e9);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f489c;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f488b.unlock();
    }
}
