package com.bytedance.sdk.component.so.vG;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.utils.Ju;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PagThreadPoolExecutor.java */
/* loaded from: classes.dex */
public class sUS extends ThreadPoolExecutor {
    private int Jd;
    private int NB;
    private int icD;
    private final String pvs;
    private int sUS;
    private LinkedHashMap<String, com.bytedance.sdk.component.so.vG.pvs.pvs> so;
    private int vG;
    private boolean yiw;

    private sUS(pvs pvsVar) {
        super(pvsVar.icD, Integer.MAX_VALUE, pvsVar.NB, pvsVar.yiw, (BlockingQueue<Runnable>) pvsVar.qh, pvsVar.kj);
        this.yiw = false;
        Object[] objArr = new Object[16];
        String unused = pvsVar.pvs;
        Integer.valueOf(pvsVar.icD);
        Integer.valueOf(pvsVar.vG);
        Long.valueOf(pvsVar.NB);
        Integer.valueOf(pvsVar.Jd);
        Integer.valueOf(pvsVar.Mxy);
        Boolean.valueOf(pvsVar.Wyp);
        BlockingQueue unused2 = pvsVar.qh;
        this.pvs = pvsVar.pvs;
        this.Jd = pvsVar.icD;
        this.NB = pvsVar.vG;
        this.sUS = pvsVar.Jd;
        allowCoreThreadTimeOut(pvsVar.sUS);
        this.icD = pvsVar.so;
        this.vG = pvsVar.Mxy;
        this.yiw = pvsVar.Wyp;
        if (yiw()) {
            final int i = this.vG + 4;
            this.so = new LinkedHashMap<String, com.bytedance.sdk.component.so.vG.pvs.pvs>(i, 0.75f, true) { // from class: com.bytedance.sdk.component.so.vG.sUS.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.so.vG.pvs.pvs> entry) {
                    return size() > i;
                }
            };
        }
    }

    public void pvs(pvs pvsVar) {
        try {
            if (pvsVar.icD >= 0 && this.Jd != pvsVar.icD) {
                int i = pvsVar.icD;
                this.Jd = i;
                setCorePoolSize(i);
            }
            this.NB = pvsVar.vG;
            this.sUS = pvsVar.Jd;
            allowCoreThreadTimeOut(pvsVar.sUS);
            this.icD = pvsVar.so;
            this.vG = pvsVar.Mxy;
            this.yiw = pvsVar.Wyp;
        } catch (Throwable th) {
            Ju.pvs("PAGThreadPoolExecutor", th.getMessage());
        }
        Object[] objArr = new Object[16];
        String unused = pvsVar.pvs;
        Integer.valueOf(pvsVar.icD);
        Integer.valueOf(pvsVar.vG);
        Long.valueOf(pvsVar.NB);
        Integer.valueOf(pvsVar.Jd);
        Integer.valueOf(pvsVar.Mxy);
        Boolean.valueOf(pvsVar.Wyp);
        BlockingQueue unused2 = pvsVar.qh;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof icD) {
            ((icD) runnable).icD(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof icD;
        if (z) {
            ((icD) runnable).vG(SystemClock.elapsedRealtime());
            try {
                if (yiw() && this.so != null) {
                    pvs((icD) runnable);
                    sUS();
                }
            } catch (Exception e) {
                Ju.pvs("PAGThreadPoolExecutor", e.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        if (z) {
            icD icd = (icD) runnable;
            Object[] objArr = new Object[13];
            icd.icD();
            Integer.valueOf(icd.pvs());
            Long.valueOf(icd.vG());
            Long.valueOf(icd.Jd());
            Long.valueOf(icd.NB());
        }
        NB();
    }

    private void Jd() {
        int corePoolSize;
        try {
            if (this.Jd != 0 && (corePoolSize = getCorePoolSize()) < this.NB) {
                int size = getQueue().size();
                if (getActiveCount() < this.Jd || size < this.sUS) {
                    return;
                }
                setCorePoolSize(this.NB);
                Object[] objArr = new Object[7];
                Integer.valueOf(size);
                Integer.valueOf(corePoolSize);
                Integer.valueOf(this.NB);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void NB() {
        int corePoolSize;
        int size;
        try {
            if (this.Jd != 0 && (corePoolSize = getCorePoolSize()) > this.Jd && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.Jd);
                Object[] objArr = new Object[7];
                Integer.valueOf(size);
                Integer.valueOf(corePoolSize);
                Integer.valueOf(this.Jd);
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
        if (runnable instanceof icD) {
            icD icd = (icD) runnable;
            i = icd.pvs();
            str = icd.icD();
        } else {
            i = 6;
            str = "";
        }
        if (i == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new icD(i, str) { // from class: com.bytedance.sdk.component.so.vG.sUS.2
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.so.vG.pvs icD;
        if (!(runnable instanceof icD)) {
            runnable = new icD(EnvironmentCompat.MEDIA_UNKNOWN, runnable) { // from class: com.bytedance.sdk.component.so.vG.sUS.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable so = so();
                    if (so != null) {
                        so.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.pvs)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(Jd.pvs(this.pvs)) && (icD = vG.icD()) != null) {
                icD.pvs(this, (icD) runnable);
            }
        }
        ((icD) runnable).pvs(SystemClock.elapsedRealtime());
        super.execute(runnable);
        Jd();
    }

    private void pvs(icD icd) {
        LinkedHashMap<String, com.bytedance.sdk.component.so.vG.pvs.pvs> linkedHashMap = this.so;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.so.vG.pvs.pvs pvsVar = linkedHashMap.get(icd.icD());
            if (pvsVar == null) {
                synchronized (linkedHashMap) {
                    pvsVar = linkedHashMap.get(icd.icD());
                    if (pvsVar == null) {
                        pvsVar = new com.bytedance.sdk.component.so.vG.pvs.pvs();
                        linkedHashMap.put(icd.icD(), pvsVar);
                    }
                }
            }
            pvsVar.pvs(icd);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.so.vG.pvs.pvs> pvs() {
        return this.so;
    }

    private void sUS() {
        if (getCompletedTaskCount() > this.icD) {
            NB pvs2 = vG.pvs();
            if (pvs2 != null) {
                pvs2.pvs(this);
            }
            this.icD = -1;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.pvs)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.pvs)) {
            return;
        }
        super.shutdown();
    }

    public String icD() {
        return this.pvs;
    }

    private boolean yiw() {
        return this.icD > 0;
    }

    public boolean vG() {
        return this.yiw;
    }

    /* compiled from: PagThreadPoolExecutor.java */
    public static class pvs {
        private String pvs = "cache";
        private int icD = 4;
        private int vG = 100;
        private int Jd = 0;
        private long NB = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        private boolean sUS = false;
        private TimeUnit yiw = TimeUnit.MILLISECONDS;
        private int so = -1;
        private int Mxy = 20;
        private boolean Wyp = false;
        private BlockingQueue<Runnable> qh = new PriorityBlockingQueue();
        private ThreadFactory kj = null;

        public pvs pvs(String str) {
            this.pvs = str;
            return this;
        }

        public pvs pvs(int i) {
            this.icD = i;
            return this;
        }

        public pvs icD(int i) {
            this.vG = i;
            return this;
        }

        public pvs vG(int i) {
            this.Jd = i;
            return this;
        }

        public pvs pvs(long j) {
            this.NB = j;
            return this;
        }

        public pvs pvs(boolean z) {
            this.sUS = z;
            return this;
        }

        public pvs Jd(int i) {
            this.Mxy = i;
            return this;
        }

        public pvs NB(int i) {
            this.so = i;
            return this;
        }

        public pvs icD(boolean z) {
            this.Wyp = z;
            return this;
        }

        public sUS pvs() {
            if (this.kj == null) {
                this.kj = new Jd(this.pvs);
            }
            if (this.icD < 0) {
                this.icD = 8;
            }
            if (this.icD == 0) {
                this.qh = new SynchronousQueue();
            }
            if (this.qh == null) {
                this.qh = new LinkedBlockingQueue();
            }
            if (this.vG > 100) {
                this.vG = 100;
            }
            int i = this.vG;
            int i2 = this.icD;
            if (i < i2) {
                this.vG = i2;
            }
            if (this.Mxy < 0) {
                this.Mxy = 20;
            }
            if (this.Mxy > 100) {
                this.Mxy = 100;
            }
            return new sUS(this);
        }
    }
}
