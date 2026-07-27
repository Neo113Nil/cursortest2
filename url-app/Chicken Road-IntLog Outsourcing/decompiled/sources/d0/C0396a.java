package d0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f5475e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5476a;

    /* renamed from: b, reason: collision with root package name */
    public final File f5477b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f5478c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f5479d;

    public C0396a(String str, File file, boolean z) {
        Lock lock;
        this.f5476a = z;
        File file2 = new File(file, str.concat(".lck"));
        this.f5477b = file2;
        String absolutePath = file2.getAbsolutePath();
        i.d(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f5475e;
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
        this.f5478c = lock;
    }

    public final void a(boolean z) {
        this.f5478c.lock();
        if (z) {
            File file = this.f5477b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f5479d = channel;
            } catch (IOException e3) {
                this.f5479d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e3);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f5479d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f5478c.unlock();
    }
}
