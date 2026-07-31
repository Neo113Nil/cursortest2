package com.bytedance.sdk.component.hhw.zmn.fs.fs;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.hhw.zmn.btk;
import com.bytedance.sdk.component.hhw.zmn.nps;
import com.bytedance.sdk.component.hhw.zmn.zmn.fb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zn extends HandlerThread implements Handler.Callback {
    private static int kw = 200;
    private static int olo = 10;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.hhw.zmn.fb.zmn> btk;
    private final AtomicInteger bvs;
    private final AtomicInteger cn;
    private final AtomicInteger cyb;
    private final int doe;
    private com.bytedance.sdk.component.hhw.zmn.fs.zn fb;
    private volatile boolean fs;
    private volatile int hhw;
    private final int iqz;
    private final long iv;
    private long kgc;
    private final AtomicInteger klz;
    private volatile Handler mw;
    private volatile long nps;
    private final int phc;
    private final long rc;
    private final List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> rt;
    private volatile long zg;
    protected fb zmn;
    private final Object zn;

    public static void zmn(int i) {
        olo = i;
    }

    public static void fs(int i) {
        kw = i;
    }

    public zn(PriorityBlockingQueue<com.bytedance.sdk.component.hhw.zmn.fb.zmn> priorityBlockingQueue) {
        super("csj_log");
        this.fs = true;
        this.zn = new Object();
        this.nps = 0L;
        this.zg = 0L;
        this.bvs = new AtomicInteger(0);
        this.iv = 5000L;
        this.rc = 5000000000L;
        this.klz = new AtomicInteger(0);
        this.rt = new ArrayList();
        this.cn = new AtomicInteger(0);
        this.cyb = new AtomicInteger(0);
        this.kgc = 60000L;
        this.iqz = 1;
        this.phc = 2;
        this.doe = 3;
        this.btk = priorityBlockingQueue;
        this.zmn = new com.bytedance.sdk.component.hhw.zmn.zmn.fs();
        if (com.bytedance.sdk.component.hhw.zmn.fs.fs()) {
            return;
        }
        long klz = nps.hhw().cn().klz();
        if (klz > 0) {
            this.kgc = klz;
        }
    }

    public void zmn(boolean z) {
        this.fs = z;
    }

    public boolean zmn() {
        return this.fs;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i == 1) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.bvs(), 1);
            fs();
            zmn(true);
            btk();
        } else {
            if (i != 2 && i != 3) {
                if (i == 11) {
                    ArrayList arrayList = new ArrayList(this.rt);
                    this.rt.clear();
                    zmn((List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>) arrayList, false, "timeout_dispatch");
                    iv();
                }
                return true;
            }
            zn();
        }
        return true;
    }

    private void fs() {
        long cyb = nps.hhw().cyb();
        if (cyb <= 0) {
            return;
        }
        this.zmn.zmn(Integer.MAX_VALUE, cyb);
    }

    private void zn() {
        fb();
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.hgd(), 1);
        zn(1);
    }

    private void fb() {
        if (!isAlive()) {
            com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.fb();
        } else {
            if (zmn()) {
                return;
            }
            zn(6);
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.mw = new Handler(getLooper(), this);
        com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.zmn(this.mw);
        this.mw.sendEmptyMessage(1);
    }

    public boolean zmn(int i, boolean z) {
        btk cn = nps.hhw().cn();
        if (cn == null || !cn.zmn(nps.hhw().btk())) {
            return false;
        }
        return this.zmn.zmn(i, z);
    }

    public void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, boolean z) {
        if (zmnVar == null) {
            return;
        }
        zmnVar.fb();
        if (z) {
            if (this.mw != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(zmnVar);
                zmn((List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.btk.add(zmnVar);
        btk(2);
    }

    public void zn(int i) {
        try {
            boolean zmn = zmn(i, com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.fs);
            if (i == 6 || zmn) {
                com.bytedance.sdk.component.hhw.zmn.fb.fs fsVar = new com.bytedance.sdk.component.hhw.zmn.fb.fs();
                fsVar.zmn(i);
                this.btk.add(fsVar);
                btk(3);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar, int i) {
        this.bvs.set(0);
        if (i == 0) {
            this.hhw = ((com.bytedance.sdk.component.hhw.zmn.fb.fs) zmnVar).iv();
            if (this.hhw != 6) {
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.vlj(), 1);
                fs(zmnVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.fb.fs fsVar = (com.bytedance.sdk.component.hhw.zmn.fb.fs) zmnVar;
        if (fsVar.iv() == 1) {
            this.hhw = 1;
            fs(zmnVar);
        } else if (fsVar.iv() == 2) {
            nps();
            this.hhw = 2;
            fs(zmnVar);
        }
    }

    private void btk() {
        while (zmn()) {
            try {
                com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn zmnVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.fb;
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.zg(), 1);
                com.bytedance.sdk.component.hhw.zmn.fb.zmn poll = this.btk.poll(this.kgc, TimeUnit.MILLISECONDS);
                int size = this.btk.size();
                if (poll instanceof com.bytedance.sdk.component.hhw.zmn.fb.fs) {
                    zmn(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.bvs.incrementAndGet();
                    com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.yof(), 1);
                    if (fb(incrementAndGet)) {
                        hhw();
                        return;
                    } else if (incrementAndGet < 4) {
                        this.hhw = 1;
                        fs((com.bytedance.sdk.component.hhw.zmn.fb.zmn) null);
                    }
                } else {
                    zmn(poll);
                    fs(poll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.ww(), 1);
            }
        }
    }

    private boolean fb(int i) {
        if (i < 4 || this.klz.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.hhw.zmn.fs.fb fbVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn;
        return (fbVar.fs || fbVar.zn) ? false : true;
    }

    private void hhw() {
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.doe(), 1);
        zmn(false);
        com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.zn();
    }

    private void nps() {
        if (this.btk.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.hhw.zmn.fb.zmn poll = this.btk.poll();
                if (!(poll instanceof com.bytedance.sdk.component.hhw.zmn.fb.fs) && poll != null) {
                    zmn(poll);
                }
            }
        }
    }

    private void zmn(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        this.bvs.set(0);
        com.bytedance.sdk.component.hhw.zmn.fs.fb fbVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn;
        if (fbVar.fs) {
            this.hhw = 5;
        } else if (fbVar.zn) {
            this.hhw = 7;
        } else {
            this.hhw = 4;
        }
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.na(), 1);
        this.zmn.zmn(zmnVar, this.hhw);
        com.bytedance.sdk.component.hhw.zmn.zn.zmn.nps(zmnVar);
    }

    private boolean zg() {
        if (com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.fs) {
            return this.hhw == 4 || this.hhw == 7 || this.hhw == 6 || this.hhw == 5 || this.hhw == 2;
        }
        return false;
    }

    private void fs(com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar) {
        if (com.bytedance.sdk.component.hhw.zmn.zn.zmn.fs() && nps.hhw().zmn()) {
            return;
        }
        int i = 0;
        if (zg()) {
            com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(this.hhw);
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.klz(), 1);
            if (this.btk.size() != 0) {
                return;
            }
            if (!this.mw.hasMessages(2)) {
                com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.fs = false;
                this.zg = 0L;
                this.nps = 0L;
                this.cn.set(0);
                this.cyb.set(0);
            } else {
                zmn(false);
                return;
            }
        }
        do {
            boolean zmn = zmn(this.hhw, com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn.fs);
            com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(zmn, this.hhw, zmnVar);
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.mw(), 1);
            if (zmn) {
                List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn2 = this.zmn.zmn(this.hhw, -1, null);
                if (zmn2 != null) {
                    zmn2.size();
                    zmn(zmn2);
                } else {
                    bvs();
                }
            } else {
                bvs();
            }
            i++;
            if (!zmn) {
                return;
            }
        } while (i <= 6);
    }

    private void bvs() {
        try {
            if (this.btk.size() == 0 && this.mw.hasMessages(11) && zmn()) {
                zmn(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void zmn(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, String str) {
        zmn(str);
        zmn(list, false, str);
        iv();
    }

    private void zmn(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(list, this.btk.size());
            if (list.size() > 1 || com.bytedance.sdk.component.hhw.zmn.zn.zmn.zn()) {
                zmn(list, "batchRead");
                return;
            }
            com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar = list.get(0);
            if (zmnVar != null) {
                if (zmnVar.btk() == 1) {
                    zmn(list, "highPriority");
                    return;
                }
                if (zmnVar.fb() == 0 && zmnVar.btk() == 2) {
                    if (zmnVar.fs() == 3) {
                        zmn(list, "version_v3");
                        return;
                    } else {
                        fs(list);
                        return;
                    }
                }
                if (zmnVar.fb() == 1) {
                    zmn(list, "stats");
                    return;
                } else if (zmnVar.fb() == 3) {
                    zmn(list, "adType_v3");
                    return;
                } else {
                    if (zmnVar.fb() == 2) {
                        zmn(list, "other");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        bvs();
    }

    private void fs(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        this.rt.addAll(list);
        this.rt.size();
        btk cn = nps.hhw().cn();
        if (cn != null && cn.rc() != null) {
            olo = cn.rc().fs();
        }
        if (this.rt.size() >= olo) {
            if (this.mw.hasMessages(11)) {
                this.mw.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.rt);
            this.rt.clear();
            zmn((List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>) arrayList, false, "max_size_dispatch");
            iv();
            return;
        }
        if (this.btk.size() == 0) {
            zmn(false);
            if (this.mw.hasMessages(11)) {
                this.mw.removeMessages(11);
            }
            if (this.mw.hasMessages(1)) {
                this.mw.removeMessages(1);
            }
            long j = kw;
            if (cn != null && cn.rc() != null) {
                j = cn.rc().zmn();
            }
            this.mw.sendEmptyMessageDelayed(11, j);
            return;
        }
        this.rt.size();
    }

    private void zmn(String str) {
        if (this.mw.hasMessages(11)) {
            this.mw.removeMessages(11);
        }
        if (this.rt.size() != 0) {
            ArrayList arrayList = new ArrayList(this.rt);
            this.rt.clear();
            zmn((List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>) arrayList, false, "before_".concat(String.valueOf(str)));
            iv();
            arrayList.size();
        }
    }

    private void zmn(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, boolean z, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(list, this.hhw, str);
        com.bytedance.sdk.component.hhw.zmn.fs.zn nps = nps.hhw().nps();
        this.fb = nps;
        if (nps != null) {
            fs(list, z, currentTimeMillis);
        } else {
            zmn(list, z, currentTimeMillis);
        }
    }

    private void zmn(final List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, final boolean z, final long j) {
        btk cn = nps.hhw().cn();
        if (cn != null) {
            Executor btk = cn.btk();
            if (list.get(0).btk() == 1) {
                btk = cn.fb();
            }
            if (btk == null) {
                return;
            }
            this.klz.incrementAndGet();
            btk.execute(new com.bytedance.sdk.component.hhw.zmn.btk.btk("csj_log_upload") { // from class: com.bytedance.sdk.component.hhw.zmn.fs.fs.zn.1
                @Override // java.lang.Runnable
                public void run() {
                    zn znVar = zn.this;
                    znVar.zmn((List<com.bytedance.sdk.component.hhw.zmn.fb.zmn>) list, z, j, znVar.hhw);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, boolean z, long j, int i) {
        fs zmn;
        try {
            com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar = list.get(0);
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.io(), 1);
            if (zmnVar.fb() == 0) {
                zmn = nps.fb().zmn(list);
                zmn(zmn, list);
                if (zmn != null) {
                    com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(list, zmn.fb);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().hhw());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e) {
                    e.getMessage();
                }
                zmn = nps.fb().zmn(jSONObject);
            }
            fs fsVar = zmn;
            this.klz.decrementAndGet();
            zmn(z, fsVar, list, j);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.ww(), 1);
            this.klz.decrementAndGet();
        }
    }

    private void fs(List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, final boolean z, final long j) {
        this.klz.incrementAndGet();
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.io(), 1);
        try {
            HashMap hashMap = new HashMap();
            Iterator<com.bytedance.sdk.component.hhw.zmn.fb.zmn> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.hhw.zmn.fb.zmn next = it.next();
                int bvs = next == null ? 0 : next.bvs();
                if (hashMap.get(Integer.valueOf(bvs)) == null) {
                    hashMap.put(Integer.valueOf(bvs), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(bvs))).add(next);
            }
            for (Integer num : hashMap.keySet()) {
                if (num.intValue() != 0 && nps.hhw().fs() != null && nps.hhw().fs().get(num) != null) {
                    nps.hhw().fs().get(num).zmn(list, new com.bytedance.sdk.component.hhw.zmn.fs.fs() { // from class: com.bytedance.sdk.component.hhw.zmn.fs.fs.zn.3
                        @Override // com.bytedance.sdk.component.hhw.zmn.fs.fs
                        public void zmn(List<zmn> list2) {
                            try {
                                zn.this.klz.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    zmn zmnVar = list2.get(i);
                                    if (zmnVar != null) {
                                        zn.this.zmn(z, zmnVar.zmn(), zmnVar.fs(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                this.fb.zmn(list, new com.bytedance.sdk.component.hhw.zmn.fs.fs() { // from class: com.bytedance.sdk.component.hhw.zmn.fs.fs.zn.2
                    @Override // com.bytedance.sdk.component.hhw.zmn.fs.fs
                    public void zmn(List<zmn> list2) {
                        try {
                            zn.this.klz.decrementAndGet();
                            if (list2 == null || list2.size() == 0) {
                                return;
                            }
                            int size = list2.size();
                            for (int i = 0; i < size; i++) {
                                zmn zmnVar = list2.get(i);
                                if (zmnVar != null) {
                                    zn.this.zmn(z, zmnVar.zmn(), zmnVar.fs(), j);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.ww(), 1);
            this.klz.decrementAndGet();
        }
    }

    private void btk(int i) {
        if (!zmn()) {
            if (this.mw == null) {
                return;
            }
            com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn zmnVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.fb;
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.zn(), 1);
            if (this.mw.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.hhw(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.fb(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.btk(), 1);
            }
            this.mw.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.zmn(), 1);
    }

    private void zmn(fs fsVar, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
        if (fsVar == null || !fsVar.zmn) {
            return;
        }
        List<Object> zmn = com.bytedance.sdk.component.hhw.zmn.fs.zmn();
        if (list == null || zmn == null || zmn.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar : list) {
            if (zmnVar.btk() == 1) {
                com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(zmnVar);
                com.bytedance.sdk.component.hhw.zmn.zn.zmn.btk(zmnVar);
                Iterator<Object> it = zmn.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private void iv() {
        long nanoTime;
        com.bytedance.sdk.component.hhw.zmn.fs.fb fbVar;
        if (this.mw.hasMessages(11)) {
            bvs();
        } else {
            btk(1);
        }
        com.bytedance.sdk.component.hhw.zmn.fs.zmn.zmn zmnVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.fb;
        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.fs(), 1);
        if (this.hhw == 2) {
            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.nps(), 1);
            synchronized (this.zn) {
                try {
                    try {
                        long nanoTime2 = System.nanoTime();
                        this.zn.wait(5000L);
                        nanoTime = System.nanoTime() - nanoTime2;
                        fbVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn;
                        if (!fbVar.fs) {
                            boolean z = fbVar.zn;
                        }
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!fbVar.fs && !fbVar.zn) {
                            com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.nu(), 1);
                            zn(2);
                            return;
                        }
                        com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.rc(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(zmnVar.iv(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z, fs fsVar, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, long j) {
        if (z || fsVar == null) {
            return;
        }
        int i = fsVar.fs;
        int i2 = -2;
        if (fsVar.btk) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (fsVar.zmn || ((i < 500 || i >= 509) && i <= 513 && i != 404)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.klz.get();
        }
        zmn(i2, list, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x0005, B:11:0x000b, B:21:0x00e4, B:23:0x00e8, B:24:0x00ed, B:27:0x0030, B:29:0x003e, B:31:0x0043, B:33:0x0050, B:35:0x0052, B:37:0x0060, B:38:0x0065, B:39:0x006a, B:41:0x0070, B:43:0x0074, B:45:0x0080, B:46:0x0085, B:48:0x008d, B:49:0x0092, B:50:0x00af, B:52:0x00bd, B:54:0x00bf, B:56:0x00cc, B:58:0x00ce, B:60:0x00dc, B:61:0x00e1, B:4:0x00f4), top: B:7:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(int i, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list, long j) {
        synchronized (this.zn) {
            if (list != null) {
                try {
                    if (this.mw != null) {
                        com.bytedance.sdk.component.hhw.zmn.zn.zmn.zmn(i, list, j);
                        this.zmn.zmn(i, list);
                        nps.hhw().cn();
                        if (i != -2) {
                            if (i != -1) {
                                if (i != 0) {
                                    if (i != 200) {
                                        if (i == 509) {
                                            com.bytedance.sdk.component.hhw.zmn.fs.fb fbVar = com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn;
                                            fbVar.fs = true;
                                            fbVar.zn = false;
                                            if (this.mw.hasMessages(2)) {
                                                return;
                                            }
                                            if (System.currentTimeMillis() - this.nps < 30000) {
                                                return;
                                            }
                                            this.nps = System.currentTimeMillis();
                                            if (this.mw.hasMessages(3)) {
                                                this.mw.removeMessages(3);
                                            }
                                            zmn(2, 30000L);
                                        }
                                        if (this.hhw == 2) {
                                            this.zn.notify();
                                        }
                                        this.btk.size();
                                    }
                                }
                            }
                            com.bytedance.sdk.component.hhw.zmn.fs.fb fbVar2 = com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn;
                            if (fbVar2.fs || fbVar2.zn) {
                                fbVar2.fs = false;
                                fbVar2.zn = false;
                                if (this.mw.hasMessages(2)) {
                                    this.mw.removeMessages(2);
                                }
                                if (this.mw.hasMessages(3)) {
                                    this.mw.removeMessages(3);
                                }
                                this.zg = 0L;
                                this.nps = 0L;
                                this.cn.set(0);
                                this.cyb.set(0);
                                com.bytedance.sdk.component.hhw.zmn.zn.fs.zmn(com.bytedance.sdk.component.hhw.zmn.fs.fb.fb.oub(), 1);
                                zn(2);
                            }
                            if (this.hhw == 2) {
                            }
                            this.btk.size();
                        }
                        com.bytedance.sdk.component.hhw.zmn.fs.fb fbVar3 = com.bytedance.sdk.component.hhw.zmn.fs.fb.zmn;
                        fbVar3.fs = false;
                        fbVar3.zn = true;
                        if (this.mw.hasMessages(3)) {
                            return;
                        }
                        if (System.currentTimeMillis() - this.zg < 15000) {
                            return;
                        }
                        this.zg = System.currentTimeMillis();
                        if (this.mw.hasMessages(2)) {
                            this.mw.removeMessages(2);
                        }
                        zmn(3, 15000L);
                        if (this.hhw == 2) {
                        }
                        this.btk.size();
                    }
                } finally {
                }
            }
        }
    }

    public void zmn(int i, long j) {
        if (this.mw == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        if (i == 2) {
            this.mw.sendMessageDelayed(obtain, (((this.cn.incrementAndGet() - 1) % 4) + 1) * j);
        } else if (i == 3) {
            this.mw.sendMessageDelayed(obtain, (((this.cyb.incrementAndGet() - 1) % 4) + 1) * j);
        }
    }
}
