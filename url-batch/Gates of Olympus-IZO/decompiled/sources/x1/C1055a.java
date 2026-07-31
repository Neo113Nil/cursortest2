package x1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055a {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f8723d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f8724a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f8725b;

    /* renamed from: c, reason: collision with root package name */
    public FileChannel f8726c;

    public C1055a(String str, File file) {
        Lock lock;
        this.f8724a = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f8723d;
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
        this.f8725b = lock;
    }

    public final void a(boolean z3) {
        this.f8725b.lock();
        if (z3) {
            File file = this.f8724a;
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
                this.f8726c = channel;
            } catch (IOException e3) {
                this.f8726c = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e3);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f8726c;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f8725b.unlock();
    }
}
