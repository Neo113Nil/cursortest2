package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

@RestrictTo
/* loaded from: classes5.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {
    private final Handler mHandler = HandlerCompat.createAsync(Looper.getMainLooper());

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long j, Runnable runnable) {
        this.mHandler.postDelayed(runnable, j);
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
