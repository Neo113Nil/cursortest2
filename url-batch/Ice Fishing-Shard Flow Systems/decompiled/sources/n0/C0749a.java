package n0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import r4.f;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f6969e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6970a;

    /* renamed from: b, reason: collision with root package name */
    public final File f6971b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f6972c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f6973d;

    public C0749a(String name, File lockDir, boolean z7) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.f6970a = z7;
        File file = new File(lockDir, f.c(name, ".lck"));
        this.f6971b = file;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f6969e;
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
        this.f6972c = lock;
    }

    public final void a(boolean z7) {
        File file = this.f6971b;
        this.f6972c.lock();
        if (z7) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f6973d = channel;
            } catch (IOException e7) {
                this.f6973d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e7);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f6973d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f6972c.unlock();
    }
}
