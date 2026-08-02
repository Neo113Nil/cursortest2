package defpackage;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ani {
    public static final Map a = new HashMap();
    public final boolean b;
    private final File c;
    private final Lock d;
    private FileChannel e;

    public ani(String str, File file) {
        Lock lock;
        str.getClass();
        this.b = false;
        this.c = file != null ? new File(file, str.concat(".lck")) : null;
        Map map = a;
        synchronized (map) {
            Object obj = map.get(str);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(str, obj);
            }
            lock = (Lock) obj;
        }
        this.d = lock;
    }

    public final void a(boolean z) {
        this.d.lock();
        if (z) {
            try {
                File file = this.c;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(file).getChannel());
                convertMaybeLegacyFileChannelFromLibrary.lock();
                this.e = convertMaybeLegacyFileChannelFromLibrary;
            } catch (IOException e) {
                this.e = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.d.unlock();
    }
}
