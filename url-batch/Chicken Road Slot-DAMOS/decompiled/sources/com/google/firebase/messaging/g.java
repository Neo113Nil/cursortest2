package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public g() {
        h7.a aVar = new h7.a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static Task access$000(g gVar, Intent intent) {
        if (gVar.handleIntentOnMainThread(intent)) {
            return z4.w.q(null);
        }
        w7.g gVar2 = new w7.g();
        gVar.executor.execute(new c4.m(gVar, intent, gVar2, 4));
        return gVar2.f10117a;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            e0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i3 = this.runningTasks - 1;
                this.runningTasks = i3;
                if (i3 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new f0(new d9.c(10, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        w7.n nVar;
        synchronized (this.lock) {
            this.lastStartId = i10;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            nVar = z4.w.q(null);
        } else {
            w7.g gVar = new w7.g();
            this.executor.execute(new c4.m(this, startCommandIntent, gVar, 4));
            nVar = gVar.f10117a;
        }
        if (nVar.j()) {
            a(intent);
            return 2;
        }
        nVar.b(new n.a(1), new f(0, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i3) {
        return stopSelfResult(i3);
    }
}
