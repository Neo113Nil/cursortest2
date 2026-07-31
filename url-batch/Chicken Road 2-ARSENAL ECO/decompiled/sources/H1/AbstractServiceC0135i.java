package H1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: H1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0135i extends Service {

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f962f;

    /* renamed from: g, reason: collision with root package name */
    public L f963g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f964h;

    /* renamed from: i, reason: collision with root package name */
    public int f965i;

    /* renamed from: j, reason: collision with root package name */
    public int f966j;

    public AbstractServiceC0135i() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z0.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f962f = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f964h = new Object();
        this.f966j = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            K.b(intent);
        }
        synchronized (this.f964h) {
            try {
                int i7 = this.f966j - 1;
                this.f966j = i7;
                if (i7 == 0) {
                    stopSelfResult(this.f965i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f963g == null) {
                this.f963g = new L(new D3.M(5, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f963g;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f962f.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        synchronized (this.f964h) {
            this.f965i = i8;
            this.f966j++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) A.b().f879d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        k1.h hVar = new k1.h();
        this.f962f.execute(new RunnableC0134h(this, intent2, hVar, 0));
        k1.n nVar = hVar.f5157a;
        if (nVar.g()) {
            a(intent);
            return 2;
        }
        nVar.a(new P.c(0), new C0133g(this, 0, intent));
        return 3;
    }
}
