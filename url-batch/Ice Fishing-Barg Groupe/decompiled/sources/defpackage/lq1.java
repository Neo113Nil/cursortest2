package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lq1 {
    private static final kq1 Companion = new kq1();
    public static final HashMap e9gEMXR7LXtO = new HashMap();
    public final boolean PxuCJdSBwIXG;
    public final Lock TSizfFm2Yiuu;
    public FileChannel Y1f8riQaR6yg;
    public final File lS5Rgt96tfkO;

    public lq1(String str, File file, boolean z) {
        Lock lock;
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = file != null ? new File(file, str.concat(".lck")) : null;
        Companion.getClass();
        HashMap hashMap = e9gEMXR7LXtO;
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
        this.TSizfFm2Yiuu = lock;
    }

    public final void PxuCJdSBwIXG(boolean z) {
        this.TSizfFm2Yiuu.lock();
        if (z) {
            File file = this.lS5Rgt96tfkO;
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
                this.Y1f8riQaR6yg = channel;
            } catch (IOException e) {
                this.Y1f8riQaR6yg = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void lS5Rgt96tfkO() {
        try {
            FileChannel fileChannel = this.Y1f8riQaR6yg;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.TSizfFm2Yiuu.unlock();
    }
}
