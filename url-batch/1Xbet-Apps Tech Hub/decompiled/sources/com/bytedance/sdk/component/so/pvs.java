package com.bytedance.sdk.component.so;

import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.bytedance.sdk.component.utils.Ju;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ADThreadPoolExecutor.java */
/* loaded from: classes.dex */
class pvs extends ThreadPoolExecutor {
    private String pvs;

    public pvs(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.pvs = str;
    }

    private void pvs(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            pvs(runnable, e);
        } catch (Throwable th) {
            pvs(runnable, th);
        }
    }

    private void pvs(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        pvs(runnable, (Throwable) outOfMemoryError);
    }

    private void pvs(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                Ju.pvs("", "try exc failed", th2);
            }
        }
    }

    private void pvs(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            Object[] objArr = new Object[6];
            Integer.valueOf(getCorePoolSize());
            Integer.valueOf(getMaximumPoolSize());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void pvs(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i2) {
            return;
        }
        try {
            setCorePoolSize(i);
            Object[] objArr = new Object[6];
            Integer.valueOf(getCorePoolSize());
            Integer.valueOf(getMaximumPoolSize());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof so) {
            pvs(new icD((so) runnable, this));
        } else {
            pvs(new icD(new so(EnvironmentCompat.MEDIA_UNKNOWN) { // from class: com.bytedance.sdk.component.so.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!sUS.yiw() || TextUtils.isEmpty(this.pvs) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.pvs;
        str.hashCode();
        switch (str) {
            case "io":
                pvs(queue, sUS.pvs + 2, getCorePoolSize() * 2);
                break;
            case "log":
                pvs(queue, 8, 8);
                break;
            case "aidl":
                pvs(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!sUS.yiw() || TextUtils.isEmpty(this.pvs) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.pvs;
        str.hashCode();
        switch (str) {
            case "io":
                pvs(queue, 2);
                break;
            case "log":
                pvs(queue, 4);
                break;
            case "aidl":
                pvs(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("io".equals(this.pvs) || "aidl".equals(this.pvs)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.pvs) || "aidl".equals(this.pvs)) {
            return;
        }
        super.shutdown();
    }

    public String pvs() {
        return this.pvs;
    }

    /* compiled from: ADThreadPoolExecutor.java */
    /* renamed from: com.bytedance.sdk.component.so.pvs$pvs, reason: collision with other inner class name */
    public static class C0055pvs {
        private RejectedExecutionHandler so;
        private String pvs = "io";
        private int icD = 1;
        private long vG = 30;
        private TimeUnit Jd = TimeUnit.SECONDS;
        private int NB = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> sUS = null;
        private ThreadFactory yiw = null;
        private int Mxy = 5;

        public C0055pvs pvs(String str) {
            this.pvs = str;
            return this;
        }

        public C0055pvs pvs(int i) {
            this.icD = i;
            return this;
        }

        public C0055pvs pvs(long j) {
            this.vG = j;
            return this;
        }

        public C0055pvs pvs(TimeUnit timeUnit) {
            this.Jd = timeUnit;
            return this;
        }

        public C0055pvs pvs(BlockingQueue<Runnable> blockingQueue) {
            this.sUS = blockingQueue;
            return this;
        }

        public C0055pvs pvs(ThreadFactory threadFactory) {
            this.yiw = threadFactory;
            return this;
        }

        public C0055pvs pvs(RejectedExecutionHandler rejectedExecutionHandler) {
            this.so = rejectedExecutionHandler;
            return this;
        }

        public C0055pvs icD(int i) {
            this.Mxy = i;
            return this;
        }

        public pvs pvs() {
            if (this.yiw == null) {
                this.yiw = NB.pvs().createThreadFactory(this.Mxy, this.pvs);
            }
            if (this.so == null) {
                this.so = sUS.so();
            }
            if (this.sUS == null) {
                this.sUS = new LinkedBlockingQueue();
            }
            return new pvs(this.pvs, this.icD, this.NB, this.vG, this.Jd, this.sUS, this.yiw, this.so);
        }
    }
}
