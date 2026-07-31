package W;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f2783e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2784a;

    /* renamed from: b, reason: collision with root package name */
    public final File f2785b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f2786c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f2787d;

    public a(String str, File file, boolean z5) {
        Lock lock;
        this.f2784a = z5;
        File file2 = new File(file, str.concat(".lck"));
        this.f2785b = file2;
        String absolutePath = file2.getAbsolutePath();
        i.d(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f2783e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(absolutePath);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(absolutePath, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2786c = lock;
    }

    public final void a(boolean z5) {
        File file = this.f2785b;
        this.f2786c.lock();
        if (z5) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f2787d = channel;
            } catch (IOException e4) {
                this.f2787d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f2787d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f2786c.unlock();
    }
}
