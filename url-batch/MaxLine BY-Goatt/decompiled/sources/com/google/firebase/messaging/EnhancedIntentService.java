package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.WithinAppServiceBinder;
import defpackage.jt2;
import defpackage.kt2;
import defpackage.lv;
import defpackage.mi2;
import defpackage.s50;
import defpackage.th;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, jt2 jt2Var) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, kt2 kt2Var) {
        try {
            handleIntent(intent);
        } finally {
            kt2Var.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jt2 processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return mi2.j(null);
        }
        kt2 kt2Var = new kt2();
        this.executor.execute(new s50(this, intent, kt2Var, 3));
        return kt2Var.a;
    }

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
                this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                    @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                    public jt2 handle(Intent intent2) {
                        return EnhancedIntentService.this.processIntent(intent2);
                    }
                });
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
        synchronized (this.lock) {
            this.lastStartId = i2;
            i3 = 1;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        jt2 processIntent = processIntent(startCommandIntent);
        if (processIntent.l()) {
            finishTask(intent);
            return 2;
        }
        processIntent.c(new th(1), new lv(i3, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
