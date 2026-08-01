package com.bytedance.sdk.component.so;

import com.bytedance.sdk.component.so.pvs;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: TTExecutor.java */
/* loaded from: classes.dex */
public class sUS extends NB {
    private static volatile ThreadPoolExecutor Mxy;
    private static volatile ThreadPoolExecutor NB;
    private static volatile ThreadPoolExecutor Wyp;
    public static vG icD;
    private static volatile ScheduledExecutorService qh;
    private static volatile ThreadPoolExecutor sUS;
    private static volatile ThreadPoolExecutor so;
    private static volatile ThreadPoolExecutor yiw;
    public static final int pvs = Runtime.getRuntime().availableProcessors();
    public static int vG = 120;
    public static boolean Jd = true;

    public static ExecutorService icD() {
        if (NB == null) {
            synchronized (sUS.class) {
                if (NB == null) {
                    NB = new pvs.C0055pvs().pvs("init").pvs(0).icD(10).pvs(5L).pvs(TimeUnit.SECONDS).pvs(new SynchronousQueue()).pvs(so()).pvs(pvs().createThreadFactory(10, "init")).pvs();
                }
            }
        }
        return NB;
    }

    public static void pvs(so soVar) {
        if (NB == null) {
            icD();
        }
        if (soVar == null || NB == null) {
            return;
        }
        NB.execute(soVar);
    }

    public static ExecutorService vG() {
        return pvs(10);
    }

    public static ExecutorService pvs(int i) {
        if (sUS == null) {
            synchronized (sUS.class) {
                if (sUS == null) {
                    pvs pvs2 = new pvs.C0055pvs().pvs("io").pvs(2).icD(i).pvs(20L).pvs(TimeUnit.SECONDS).pvs(new LinkedBlockingQueue()).pvs(so()).pvs(pvs().createThreadFactory(i, "io")).pvs();
                    sUS = pvs2;
                    pvs2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return sUS;
    }

    public static void icD(so soVar) {
        if (sUS == null) {
            vG();
        }
        if (sUS != null) {
            sUS.execute(soVar);
        }
    }

    public static void pvs(so soVar, int i) {
        icD(soVar);
    }

    public static void pvs(so soVar, int i, int i2) {
        if (sUS == null) {
            pvs(i2);
        }
        if (soVar == null || sUS == null) {
            return;
        }
        soVar.setPriority(i);
        sUS.execute(soVar);
    }

    public static ExecutorService Jd() {
        if (so == null) {
            synchronized (sUS.class) {
                if (so == null) {
                    pvs pvs2 = new pvs.C0055pvs().pvs("log").icD(10).pvs(4).pvs(20L).pvs(TimeUnit.SECONDS).pvs(new PriorityBlockingQueue()).pvs(so()).pvs(pvs().createThreadFactory(10, "log")).pvs();
                    so = pvs2;
                    pvs2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return so;
    }

    public static void vG(so soVar) {
        if (so == null) {
            Jd();
        }
        if (soVar == null || so == null) {
            return;
        }
        so.execute(soVar);
    }

    public static void icD(so soVar, int i) {
        if (soVar != null) {
            soVar.setPriority(i);
        }
        vG(soVar);
    }

    public static ExecutorService NB() {
        if (Wyp == null) {
            synchronized (sUS.class) {
                if (Wyp == null) {
                    pvs pvs2 = new pvs.C0055pvs().pvs("aidl").icD(10).pvs(2).pvs(30L).pvs(TimeUnit.SECONDS).pvs(new PriorityBlockingQueue()).pvs(so()).pvs(pvs().createThreadFactory(10, "aidl")).pvs();
                    Wyp = pvs2;
                    pvs2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return Wyp;
    }

    public static void Jd(so soVar) {
        if (Wyp == null) {
            NB();
        }
        if (soVar == null || Wyp == null) {
            return;
        }
        Wyp.execute(soVar);
    }

    public static void vG(so soVar, int i) {
        if (soVar != null) {
            soVar.setPriority(i);
        }
        Jd(soVar);
    }

    public static ScheduledExecutorService sUS() {
        if (qh == null) {
            synchronized (sUS.class) {
                if (qh == null) {
                    qh = Executors.newSingleThreadScheduledExecutor(pvs().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return qh;
    }

    public static boolean yiw() {
        return Jd;
    }

    public static void pvs(boolean z) {
        Jd = z;
    }

    public static RejectedExecutionHandler so() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.so.sUS.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static vG Mxy() {
        return icD;
    }

    public static void pvs(vG vGVar) {
        icD = vGVar;
    }

    public static ExecutorService icD(int i) {
        if (yiw == null) {
            synchronized (sUS.class) {
                if (yiw == null) {
                    pvs pvs2 = new pvs.C0055pvs().pvs("ad").pvs(2).icD(i).pvs(20L).pvs(TimeUnit.SECONDS).pvs(new LinkedBlockingQueue()).pvs(so()).pvs(pvs().createThreadFactory(i, "ad")).pvs();
                    yiw = pvs2;
                    pvs2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return yiw;
    }

    public static void NB(so soVar) {
        if (yiw == null) {
            icD(5);
        }
        if (soVar == null || yiw == null) {
            return;
        }
        yiw.execute(soVar);
    }

    public static ExecutorService Wyp() {
        if (Mxy == null) {
            synchronized (sUS.class) {
                if (Mxy == null) {
                    pvs pvs2 = new pvs.C0055pvs().pvs("computation").pvs(3).icD(10).pvs(20L).pvs(TimeUnit.SECONDS).pvs(new PriorityBlockingQueue()).pvs(so()).pvs(pvs().createThreadFactory(10, "computation")).pvs();
                    Mxy = pvs2;
                    pvs2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return Mxy;
    }

    public static void vG(int i) {
        vG = i;
    }
}
