package f2;

import M2.C0097a;
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

/* renamed from: f2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0423g extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5601a;

    /* renamed from: b, reason: collision with root package name */
    public E f5602b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5603c;

    /* renamed from: d, reason: collision with root package name */
    public int f5604d;

    /* renamed from: e, reason: collision with root package name */
    public int f5605e;

    public AbstractServiceC0423g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new G0.y("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5601a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f5603c = new Object();
        this.f5605e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            D.b(intent);
        }
        synchronized (this.f5603c) {
            try {
                int i2 = this.f5605e - 1;
                this.f5605e = i2;
                if (i2 == 0) {
                    stopSelfResult(this.f5604d);
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
            if (this.f5602b == null) {
                this.f5602b = new E(new U.e((Object) this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5602b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f5601a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.f5603c) {
            this.f5604d = i3;
            this.f5605e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) t.c().f5639d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        I1.h hVar = new I1.h();
        this.f5601a.execute(new J0.a(this, intent2, hVar, 4));
        I1.o oVar = hVar.f1248a;
        if (oVar.d()) {
            a(intent);
            return 2;
        }
        oVar.f(new U.d(0), new C0097a(this, 8, intent));
        return 3;
    }
}
