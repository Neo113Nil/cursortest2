package com.bykv.vk.openvk.component.video.pvs.icD;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bykv.vk.openvk.component.video.pvs.icD.icD;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Preloader.java */
/* loaded from: classes.dex */
public class Jd {
    private static volatile Jd NB;
    private volatile boolean IP;
    private final ExecutorService Jd;
    private volatile String Ju;
    private final HashSet<pvs> Mxy;
    private final icD.InterfaceC0020icD Wyp;
    private final SparseArray<Map<String, com.bykv.vk.openvk.component.video.pvs.icD.icD>> icD;
    private volatile vG kj;
    private volatile int pvs = 163840;
    private volatile vG qh;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.icD.vG sUS;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.icD so;
    private final icD<Runnable> vG;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG yiw;

    void pvs(com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG vGVar) {
        this.yiw = vGVar;
    }

    void pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar) {
        this.sUS = vGVar;
    }

    public void pvs(int i) {
        if (i > 0) {
            this.pvs = i;
        }
        if (NB.vG) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: ".concat(String.valueOf(i)));
        }
    }

    private Jd() {
        SparseArray<Map<String, com.bykv.vk.openvk.component.video.pvs.icD.icD>> sparseArray = new SparseArray<>(2);
        this.icD = sparseArray;
        this.Mxy = new HashSet<>();
        this.Wyp = new icD.InterfaceC0020icD() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.1
            @Override // com.bykv.vk.openvk.component.video.pvs.icD.icD.InterfaceC0020icD
            public void pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD icd) {
                int sUS = icd.sUS();
                synchronized (Jd.this.icD) {
                    Map map = (Map) Jd.this.icD.get(sUS);
                    if (map != null) {
                        map.remove(icd.so);
                    }
                }
                if (NB.vG) {
                    Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + icd.so);
                }
            }
        };
        icD<Runnable> icd = new icD<>();
        this.vG = icd;
        ExecutorService pvs2 = pvs(icd);
        this.Jd = pvs2;
        icd.pvs((ThreadPoolExecutor) pvs2);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    vG pvs() {
        return this.qh;
    }

    vG icD() {
        return this.kj;
    }

    public static Jd vG() {
        if (NB == null) {
            synchronized (Jd.class) {
                if (NB == null) {
                    NB = new Jd();
                }
            }
        }
        return NB;
    }

    void pvs(boolean z, String str) {
        com.bykv.vk.openvk.component.video.pvs.icD.icD remove;
        this.Ju = str;
        this.IP = z;
        if (NB.vG) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(String.valueOf(str)));
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        if (str == null) {
            synchronized (this.Mxy) {
                if (!this.Mxy.isEmpty()) {
                    hashSet2 = new HashSet(this.Mxy);
                    this.Mxy.clear();
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    pvs pvsVar = (pvs) it.next();
                    pvs(pvsVar.pvs, pvsVar.icD, pvsVar.vG, pvsVar.Jd, pvsVar.NB, pvsVar.sUS);
                    if (NB.vG) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + pvsVar.Jd);
                    }
                }
                return;
            }
            return;
        }
        int i = NB.so;
        if (i != 3 && i != 2) {
            if (i == 1) {
                synchronized (this.icD) {
                    Map<String, com.bykv.vk.openvk.component.video.pvs.icD.icD> map = this.icD.get(com.bykv.vk.openvk.component.video.pvs.icD.icD.icD.pvs(z));
                    remove = map != null ? map.remove(str) : null;
                }
                if (remove != null) {
                    remove.pvs();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.icD) {
            int size = this.icD.size();
            for (int i2 = 0; i2 < size; i2++) {
                SparseArray<Map<String, com.bykv.vk.openvk.component.video.pvs.icD.icD>> sparseArray = this.icD;
                Map<String, com.bykv.vk.openvk.component.video.pvs.icD.icD> map2 = sparseArray.get(sparseArray.keyAt(i2));
                if (map2 != null) {
                    Collection<com.bykv.vk.openvk.component.video.pvs.icD.icD> values = map2.values();
                    if (values != null && !values.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.addAll(values);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            com.bykv.vk.openvk.component.video.pvs.icD.icD icd = (com.bykv.vk.openvk.component.video.pvs.icD.icD) it2.next();
            icd.pvs();
            if (NB.vG) {
                Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + icd.yiw);
            }
        }
        if (i == 3) {
            synchronized (this.Mxy) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    pvs pvsVar2 = (pvs) ((com.bykv.vk.openvk.component.video.pvs.icD.icD) it3.next()).IP;
                    if (pvsVar2 != null) {
                        this.Mxy.add(pvsVar2);
                    }
                }
            }
        }
    }

    public void pvs(boolean z, boolean z2, int i, String str, String... strArr) {
        pvs(z, z2, i, str, null, strArr);
    }

    public void pvs(boolean z, boolean z2, int i, String str, Map<String, String> map, String... strArr) {
        ArrayList arrayList;
        if (NB.vG) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs pvsVar = z ? this.so : this.yiw;
        com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar = this.sUS;
        if (pvsVar == null || vGVar == null) {
            if (NB.vG) {
                Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i2 = i <= 0 ? this.pvs : i;
        String pvs2 = z2 ? str : com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(str);
        File Jd = pvsVar.Jd(pvs2);
        if (Jd != null && Jd.length() >= i2) {
            if (NB.vG) {
                Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + Jd.length() + ", need preload size: " + i2);
                return;
            }
            return;
        }
        if (sUS.pvs().pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.icD.pvs(z), pvs2)) {
            if (NB.vG) {
                Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: ".concat(String.valueOf(str)));
                return;
            }
            return;
        }
        synchronized (this.icD) {
            Map<String, com.bykv.vk.openvk.component.video.pvs.icD.icD> map2 = this.icD.get(z ? 1 : 0);
            if (map2.containsKey(pvs2)) {
                return;
            }
            int i3 = i2;
            pvs pvsVar2 = new pvs(z, z2, i2, str, map, strArr);
            String str2 = this.Ju;
            if (str2 != null) {
                int i4 = NB.so;
                if (i4 == 3) {
                    synchronized (this.Mxy) {
                        this.Mxy.add(pvsVar2);
                    }
                    if (NB.vG) {
                        Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                    }
                    return;
                }
                if (i4 == 2) {
                    if (NB.vG) {
                        Log.w("TAG_PROXY_Preloader", "cancel preload: ".concat(String.valueOf(str)));
                    }
                    return;
                } else if (i4 == 1 && this.IP == z && str2.equals(pvs2)) {
                    if (NB.vG) {
                        Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                    }
                    return;
                }
            }
            List<Mxy.icD> pvs3 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(map));
            if (pvs3 != null) {
                arrayList = new ArrayList(pvs3.size());
                int size = pvs3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Mxy.icD icd = pvs3.get(i5);
                    if (icd != null) {
                        arrayList.add(new Mxy.icD(icd.pvs, icd.icD));
                    }
                }
            } else {
                arrayList = null;
            }
            com.bykv.vk.openvk.component.video.pvs.icD.icD pvs4 = new icD.pvs().pvs(pvsVar).pvs(vGVar).pvs(str).icD(pvs2).pvs(new kj(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(strArr))).pvs((List<Mxy.icD>) arrayList).pvs(i3).pvs(this.Wyp).pvs(pvsVar2).pvs();
            map2.put(pvs2, pvs4);
            this.Jd.execute(pvs4);
        }
    }

    public void pvs(String str) {
        pvs(false, false, str);
    }

    public void pvs(final boolean z, final boolean z2, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(new com.bytedance.sdk.component.so.so("cancel b b S") { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.component.video.pvs.icD.icD icd;
                synchronized (Jd.this.icD) {
                    Map map = (Map) Jd.this.icD.get(com.bykv.vk.openvk.component.video.pvs.icD.icD.icD.pvs(z));
                    if (map != null) {
                        icd = (com.bykv.vk.openvk.component.video.pvs.icD.icD) map.remove(z2 ? str : com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(str));
                    } else {
                        icd = null;
                    }
                }
                if (icd != null) {
                    icd.pvs();
                }
            }
        });
    }

    public void Jd() {
        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(new com.bytedance.sdk.component.so.so("cancelAll") { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<com.bykv.vk.openvk.component.video.pvs.icD.icD> arrayList = new ArrayList();
                synchronized (Jd.this.icD) {
                    int size = Jd.this.icD.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) Jd.this.icD.get(Jd.this.icD.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    Jd.this.vG.clear();
                }
                for (com.bykv.vk.openvk.component.video.pvs.icD.icD icd : arrayList) {
                    icd.pvs();
                    if (NB.vG) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + icd + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* compiled from: Preloader.java */
    private static final class pvs {
        final String Jd;
        final Map<String, String> NB;
        final boolean icD;
        final boolean pvs;
        final String[] sUS;
        final int vG;

        pvs(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.pvs = z;
            this.icD = z2;
            this.vG = i;
            this.Jd = str;
            this.NB = map;
            this.sUS = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            pvs pvsVar = (pvs) obj;
            if (this.pvs == pvsVar.pvs && this.icD == pvsVar.icD && this.vG == pvsVar.vG) {
                return this.Jd.equals(pvsVar.Jd);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.pvs ? 1 : 0) * 31) + (this.icD ? 1 : 0)) * 31) + this.vG) * 31) + this.Jd.hashCode();
        }
    }

    /* compiled from: Preloader.java */
    private static final class icD<T> extends LinkedBlockingDeque<T> {
        private ThreadPoolExecutor pvs;

        private icD() {
        }

        public void pvs(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.pvs != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
                if (threadPoolExecutor == null) {
                    throw new NullPointerException("executor argument can't be null!");
                }
                this.pvs = threadPoolExecutor;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t) {
            synchronized (this) {
                int poolSize = this.pvs.getPoolSize();
                int activeCount = this.pvs.getActiveCount();
                int maximumPoolSize = this.pvs.getMaximumPoolSize();
                if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                    if (NB.vG) {
                        Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                }
                return offerFirst(t);
            }
        }
    }

    private static ExecutorService pvs(final icD<Runnable> icd) {
        int i;
        int pvs2 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs();
        if (pvs2 <= 0) {
            pvs2 = 1;
        } else if (pvs2 > 4) {
            i = 4;
            return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, icd, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (NB.vG) {
                        Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                    }
                    return thread;
                }
            }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        icD.this.offerFirst(runnable);
                        if (NB.vG) {
                            Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        i = pvs2;
        return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, icd, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.4.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (NB.vG) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.Jd.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    icD.this.offerFirst(runnable);
                    if (NB.vG) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
