package defpackage;

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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class xv extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public xv() {
        po0 po0Var = new po0("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), po0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static Task access$000(xv xvVar, Intent intent) {
        if (xvVar.handleIntentOnMainThread(intent)) {
            return t80.p(null);
        }
        ng1 ng1Var = new ng1();
        xvVar.executor.execute(new lq(xvVar, intent, ng1Var, 2));
        return ng1Var.a;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            op.v(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
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
                this.binder = new dq1(new s40(23, this));
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
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        zu1 zu1Var;
        synchronized (this.lock) {
            this.lastStartId = i2;
            i3 = 1;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        int i4 = 2;
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            zu1Var = t80.p(null);
        } else {
            ng1 ng1Var = new ng1();
            this.executor.execute(new lq(this, startCommandIntent, ng1Var, i4));
            zu1Var = ng1Var.a;
        }
        if (zu1Var.j()) {
            a(intent);
            return 2;
        }
        zu1Var.b(new kz0(), new bk(this, i3, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
