package com.king.zxing;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
final class p {
    private static final long INACTIVITY_DELAY_MS = 300000;
    private final Activity activity;
    private AsyncTask<Object, Object, Object> inactivityTask;
    private final BroadcastReceiver powerStatusReceiver = new b(this);
    private boolean registered = false;

    private static class a extends AsyncTask {
        private WeakReference<Activity> weakReference;

        public a(Activity activity) {
            this.weakReference = new WeakReference<>(activity);
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                b5.b.i("Finishing activity due to inactivity");
                Activity activity = this.weakReference.get();
                if (activity == null) {
                    return null;
                }
                activity.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    private static class b extends BroadcastReceiver {
        private WeakReference<p> weakReference;

        public b(p pVar) {
            this.weakReference = new WeakReference<>(pVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            p pVar;
            if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction()) || (pVar = this.weakReference.get()) == null) {
                return;
            }
            if (intent.getIntExtra("plugged", -1) <= 0) {
                pVar.onActivity();
            } else {
                pVar.cancel();
            }
        }
    }

    p(Activity activity) {
        this.activity = activity;
        onActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancel() {
        AsyncTask<Object, Object, Object> asyncTask = this.inactivityTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.inactivityTask = null;
        }
    }

    void onActivity() {
        cancel();
        a aVar = new a(this.activity);
        this.inactivityTask = aVar;
        try {
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } catch (RejectedExecutionException unused) {
            b5.b.w("Couldn't schedule inactivity task; ignoring");
        }
    }

    void onPause() {
        cancel();
        if (!this.registered) {
            b5.b.w("PowerStatusReceiver was never registered?");
        } else {
            this.activity.unregisterReceiver(this.powerStatusReceiver);
            this.registered = false;
        }
    }

    void onResume() {
        if (this.registered) {
            b5.b.w("PowerStatusReceiver was already registered?");
        } else {
            this.activity.registerReceiver(this.powerStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.registered = true;
        }
        onActivity();
    }

    void shutdown() {
        cancel();
    }
}
