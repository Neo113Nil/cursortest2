package com.bytedance.sdk.component.zg.fs;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class nps extends ThreadPoolExecutor {
    private boolean btk;
    private int fb;
    private int fs;
    private final String zmn;
    private int zn;

    private nps(zmn zmnVar) {
        super(zmnVar.fs, Integer.MAX_VALUE, zmnVar.btk, zmnVar.nps, (BlockingQueue<Runnable>) zmnVar.bvs, zmnVar.iv);
        this.btk = false;
        String unused = zmnVar.zmn;
        int unused2 = zmnVar.fs;
        int unused3 = zmnVar.zn;
        long unused4 = zmnVar.btk;
        int unused5 = zmnVar.fb;
        boolean unused6 = zmnVar.zg;
        BlockingQueue unused7 = zmnVar.bvs;
        this.zmn = zmnVar.zmn;
        this.fs = zmnVar.fs;
        this.zn = zmnVar.zn;
        this.fb = zmnVar.fb;
        allowCoreThreadTimeOut(zmnVar.hhw);
        this.btk = zmnVar.zg;
    }

    public void zmn(zmn zmnVar) {
        try {
            if (zmnVar.fs >= 0 && this.fs != zmnVar.fs) {
                int i = zmnVar.fs;
                this.fs = i;
                setCorePoolSize(i);
            }
            this.zn = zmnVar.zn;
            this.fb = zmnVar.fb;
            allowCoreThreadTimeOut(zmnVar.hhw);
            this.btk = zmnVar.zg;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = zmnVar.zmn;
        int unused2 = zmnVar.fs;
        int unused3 = zmnVar.zn;
        long unused4 = zmnVar.btk;
        int unused5 = zmnVar.fb;
        boolean unused6 = zmnVar.zg;
        BlockingQueue unused7 = zmnVar.bvs;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof zn) {
            ((zn) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof zn;
        if (z) {
            ((zn) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            zn znVar = (zn) runnable;
            znVar.getName();
            znVar.getPriority();
            znVar.getSubmitTimestamp();
            znVar.getBeforeTimestamp();
            znVar.getAfterTimestamp();
        }
        fb();
    }

    private void zn() {
        try {
            if (this.fs != 0 && getCorePoolSize() < this.zn) {
                int size = getQueue().size();
                if (getActiveCount() < this.fs || size < this.fb) {
                    return;
                }
                setCorePoolSize(this.zn);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void fb() {
        try {
            if (this.fs != 0 && getCorePoolSize() > this.fs && getQueue().size() == 0) {
                setCorePoolSize(this.fs);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (!(runnable instanceof zn)) {
            i = 6;
            str = "";
        } else {
            zn znVar = (zn) runnable;
            i = znVar.getPriority();
            str = znVar.getName();
        }
        if (i == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new zn(str, i) { // from class: com.bytedance.sdk.component.zg.fs.nps.1
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.zg.fs.zmn zmn2;
        if (!(runnable instanceof zn)) {
            runnable = new zn("unknown", runnable) { // from class: com.bytedance.sdk.component.zg.fs.nps.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.zmn)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(btk.zmn(this.zmn)) && (zmn2 = fb.zmn()) != null) {
                zmn2.zmn(this, (zn) runnable);
            }
        }
        ((zn) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            zn();
        } catch (Throwable th) {
            zmn(runnable, th);
        }
    }

    private void zmn(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler fs = fb.fs();
                if (fs != null) {
                    fs.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.zmn)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.zmn)) {
            return;
        }
        super.shutdown();
    }

    public int zmn() {
        return this.zn;
    }

    public boolean fs() {
        return this.btk;
    }

    public static class zmn {
        private String zmn = "cache";
        private int fs = 4;
        private int zn = 100;
        private int fb = 0;
        private long btk = 30000;
        private boolean hhw = false;
        private TimeUnit nps = TimeUnit.MILLISECONDS;
        private boolean zg = false;
        private BlockingQueue<Runnable> bvs = new PriorityBlockingQueue();
        private ThreadFactory iv = null;

        public zmn btk(int i) {
            return this;
        }

        public zmn fb(int i) {
            return this;
        }

        public zmn zmn(String str) {
            this.zmn = str;
            return this;
        }

        public zmn zmn(int i) {
            this.fs = i;
            return this;
        }

        public zmn fs(int i) {
            this.zn = i;
            return this;
        }

        public zmn zn(int i) {
            this.fb = i;
            return this;
        }

        public zmn zmn(long j) {
            this.btk = j;
            return this;
        }

        public zmn zmn(boolean z) {
            this.hhw = z;
            return this;
        }

        public zmn zmn(BlockingQueue<Runnable> blockingQueue) {
            this.bvs = blockingQueue;
            return this;
        }

        public zmn fs(boolean z) {
            this.zg = z;
            return this;
        }

        public nps zmn() {
            if (this.iv == null) {
                this.iv = new btk(this.zmn);
            }
            if (this.fs < 0) {
                this.fs = 8;
            }
            if (this.fs == 0) {
                this.bvs = new SynchronousQueue();
            }
            if (this.bvs == null) {
                this.bvs = new LinkedBlockingQueue();
            }
            if (this.zn > 100) {
                this.zn = 100;
            }
            int i = this.zn;
            int i2 = this.fs;
            if (i < i2) {
                this.zn = i2;
            }
            return new nps(this);
        }
    }
}
