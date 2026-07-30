package f4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.fragment.app.C0471d;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4797a;

/* loaded from: classes2.dex */
public abstract class f extends Service {

    /* renamed from: n, reason: collision with root package name */
    public final ExecutorService f37736n;

    /* renamed from: u, reason: collision with root package name */
    public y f37737u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f37738v;

    /* renamed from: w, reason: collision with root package name */
    public int f37739w;

    /* renamed from: x, reason: collision with root package name */
    public int f37740x;

    public f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new T2.a("Firebase-Messaging-Intent-Handle", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f37736n = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f37738v = new Object();
        this.f37740x = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            x.b(intent);
        }
        synchronized (this.f37738v) {
            try {
                int i = this.f37740x - 1;
                this.f37740x = i;
                if (i == 0) {
                    stopSelfResult(this.f37739w);
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
            if (this.f37737u == null) {
                this.f37737u = new y(new h4.c(26, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37737u;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f37736n.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i4) {
        synchronized (this.f37738v) {
            this.f37739w = i4;
            this.f37740x++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) p.f().f37766x).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        h3.h hVar = new h3.h();
        this.f37736n.execute(new a7.b(this, intent2, hVar, 8));
        h3.n nVar = hVar.f38206a;
        if (nVar.h()) {
            a(intent);
            return 2;
        }
        nVar.a(new ExecutorC4797a(1), new C0471d(3, this, intent));
        return 3;
    }
}
