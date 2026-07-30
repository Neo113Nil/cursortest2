package com.king.zxing.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
final class a implements Camera.AutoFocusCallback {
    private static final long AUTO_FOCUS_INTERVAL_MS = 1200;
    private static final Collection<String> FOCUS_MODES_CALLING_AF;
    private final Camera camera;
    private boolean focusing;
    private AsyncTask<?, ?, ?> outstandingTask;
    private boolean stopped;
    private final boolean useAutoFocus;

    /* renamed from: com.king.zxing.camera.a$a, reason: collision with other inner class name */
    private static class AsyncTaskC0288a extends AsyncTask {
        private WeakReference<a> weakReference;

        public AsyncTaskC0288a(a aVar) {
            this.weakReference = new WeakReference<>(aVar);
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(a.AUTO_FOCUS_INTERVAL_MS);
            } catch (InterruptedException unused) {
            }
            a aVar = this.weakReference.get();
            if (aVar == null) {
                return null;
            }
            aVar.start();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        FOCUS_MODES_CALLING_AF = arrayList;
        arrayList.add(TtmlNode.TEXT_EMPHASIS_AUTO);
        arrayList.add("macro");
    }

    a(Context context, Camera camera) {
        this.camera = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        boolean z7 = defaultSharedPreferences.getBoolean("preferences_auto_focus", true) && FOCUS_MODES_CALLING_AF.contains(focusMode);
        this.useAutoFocus = z7;
        b5.b.i("Current focus mode '" + focusMode + "'; use auto focus? " + z7);
        start();
    }

    private synchronized void autoFocusAgainLater() {
        if (!this.stopped && this.outstandingTask == null) {
            AsyncTaskC0288a asyncTaskC0288a = new AsyncTaskC0288a(this);
            try {
                asyncTaskC0288a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.outstandingTask = asyncTaskC0288a;
            } catch (RejectedExecutionException e8) {
                b5.b.w("Could not request auto focus", e8);
            }
        }
    }

    private synchronized void cancelOutstandingTask() {
        try {
            AsyncTask<?, ?, ?> asyncTask = this.outstandingTask;
            if (asyncTask != null) {
                if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                    this.outstandingTask.cancel(true);
                }
                this.outstandingTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z7, Camera camera) {
        this.focusing = false;
        autoFocusAgainLater();
    }

    synchronized void start() {
        if (this.useAutoFocus) {
            this.outstandingTask = null;
            if (!this.stopped && !this.focusing) {
                try {
                    this.camera.autoFocus(this);
                    this.focusing = true;
                } catch (RuntimeException e8) {
                    b5.b.w("Unexpected exception while focusing", e8);
                    autoFocusAgainLater();
                }
            }
        }
    }

    synchronized void stop() {
        this.stopped = true;
        if (this.useAutoFocus) {
            cancelOutstandingTask();
            try {
                this.camera.cancelAutoFocus();
            } catch (RuntimeException e8) {
                b5.b.w("Unexpected exception while cancelling focusing", e8);
            }
        }
    }
}
