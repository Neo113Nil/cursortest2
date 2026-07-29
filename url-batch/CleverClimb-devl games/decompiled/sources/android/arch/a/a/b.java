package android.arch.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1321a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f1322b = Executors.newFixedThreadPool(2);

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f1323c;

    @Override // android.arch.a.a.c
    public void a(Runnable runnable) {
        this.f1322b.execute(runnable);
    }

    @Override // android.arch.a.a.c
    public void b(Runnable runnable) {
        if (this.f1323c == null) {
            synchronized (this.f1321a) {
                if (this.f1323c == null) {
                    this.f1323c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f1323c.post(runnable);
    }

    @Override // android.arch.a.a.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
