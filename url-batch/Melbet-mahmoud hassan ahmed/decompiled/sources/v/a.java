package v;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Lock> f22544e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final File f22545a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f22546b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22547c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f22548d;

    public a(String str, File file, boolean z6) {
        File file2 = new File(file, str + ".lck");
        this.f22545a = file2;
        this.f22546b = a(file2.getAbsolutePath());
        this.f22547c = z6;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f22544e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f22546b.lock();
        if (this.f22547c) {
            try {
                FileChannel channel = new FileOutputStream(this.f22545a).getChannel();
                this.f22548d = channel;
                channel.lock();
            } catch (IOException e7) {
                throw new IllegalStateException("Unable to grab copy lock.", e7);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f22548d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f22546b.unlock();
    }
}
