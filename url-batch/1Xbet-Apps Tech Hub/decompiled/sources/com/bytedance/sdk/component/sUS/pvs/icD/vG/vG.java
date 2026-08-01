package com.bytedance.sdk.component.sUS.pvs.icD.vG;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.sUS.pvs.NB;
import com.bytedance.sdk.component.sUS.pvs.pvs.Jd;
import com.bytedance.sdk.component.sUS.pvs.so;
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

/* compiled from: AdPriorityLogThread.java */
/* loaded from: classes.dex */
public class vG extends HandlerThread implements Handler.Callback {
    private static int cR = 200;
    private static int vA = 10;
    private final List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> IP;
    private com.bytedance.sdk.component.sUS.pvs.icD.vG Jd;
    private volatile Handler Ju;
    private final AtomicInteger Mxy;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> NB;
    private final long Wyp;
    private final AtomicInteger bNS;
    private volatile boolean icD;
    private final AtomicInteger kj;
    private final AtomicInteger mnm;
    protected Jd pvs;
    private final long qh;
    private final int rCZ;
    private volatile int sUS;
    private volatile long so;
    private final int uc;
    private final Object vG;
    private volatile long yiw;
    private final int zM;

    public static void pvs(int i) {
        vA = i;
    }

    public static void icD(int i) {
        cR = i;
    }

    public vG(PriorityBlockingQueue<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> priorityBlockingQueue) {
        super("csj_log");
        this.icD = true;
        this.vG = new Object();
        this.yiw = 0L;
        this.so = 0L;
        this.Mxy = new AtomicInteger(0);
        this.Wyp = 5000L;
        this.qh = 5000000000L;
        this.kj = new AtomicInteger(0);
        this.IP = new ArrayList();
        this.bNS = new AtomicInteger(0);
        this.mnm = new AtomicInteger(0);
        this.zM = 1;
        this.uc = 2;
        this.rCZ = 3;
        this.NB = priorityBlockingQueue;
        this.pvs = new com.bytedance.sdk.component.sUS.pvs.pvs.icD();
    }

    public void pvs(boolean z) {
        this.icD = z;
    }

    public boolean pvs() {
        return this.icD;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i == 1) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.Mxy(), 1);
            icD();
            pvs(true);
            NB();
        } else {
            if (i != 2 && i != 3) {
                if (i == 11) {
                    ArrayList arrayList = new ArrayList(this.IP);
                    this.IP.clear();
                    pvs((List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>) arrayList, false, "timeout_dispatch");
                    Wyp();
                }
                return true;
            }
            vG();
        }
        return true;
    }

    private void icD() {
        long vA2 = so.yiw().vA();
        if (vA2 <= 0) {
            return;
        }
        this.pvs.pvs(Integer.MAX_VALUE, vA2);
    }

    private void vG() {
        Jd();
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.sP(), 1);
        vG(1);
    }

    private void Jd() {
        if (!isAlive()) {
            com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.Jd();
        } else {
            if (pvs()) {
                return;
            }
            vG(6);
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.Ju = new Handler(getLooper(), this);
        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.pvs(this.Ju);
        this.Ju.sendEmptyMessage(1);
    }

    public boolean pvs(int i, boolean z) {
        NB mnm = so.yiw().mnm();
        if (mnm == null || !mnm.pvs(so.yiw().sUS())) {
            return false;
        }
        return this.pvs.pvs(i, z);
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, boolean z) {
        if (pvsVar == null) {
            return;
        }
        pvsVar.Jd();
        if (z) {
            if (this.Ju != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(pvsVar);
                pvs((List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.NB.add(pvsVar);
        NB(2);
    }

    public void vG(int i) {
        try {
            boolean pvs = pvs(i, com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD);
            if (i == 6 || pvs) {
                com.bytedance.sdk.component.sUS.pvs.Jd.icD icd = new com.bytedance.sdk.component.sUS.pvs.Jd.icD();
                icd.icD(i);
                this.NB.add(icd);
                NB(3);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        this.Mxy.set(0);
        if (i == 0) {
            this.sUS = ((com.bytedance.sdk.component.sUS.pvs.Jd.icD) pvsVar).qh();
            if (this.sUS != 6) {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.jhZ(), 1);
                icD(pvsVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.Jd.icD icd = (com.bytedance.sdk.component.sUS.pvs.Jd.icD) pvsVar;
        if (icd.qh() == 1) {
            this.sUS = 1;
            icD(pvsVar);
        } else if (icd.qh() == 2) {
            yiw();
            this.sUS = 2;
            icD(pvsVar);
        }
    }

    private void NB() {
        while (pvs()) {
            try {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.so(), 1);
                com.bytedance.sdk.component.sUS.pvs.Jd.pvs poll = this.NB.poll(60000L, TimeUnit.MILLISECONDS);
                int size = this.NB.size();
                if (poll instanceof com.bytedance.sdk.component.sUS.pvs.Jd.icD) {
                    pvs(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.Mxy.incrementAndGet();
                    com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.SE(), 1);
                    if (Jd(incrementAndGet)) {
                        sUS();
                        return;
                    } else if (incrementAndGet < 4) {
                        this.sUS = 1;
                        icD((com.bytedance.sdk.component.sUS.pvs.Jd.pvs) null);
                    }
                } else {
                    pvs(poll);
                    icD(poll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.qD(), 1);
            }
        }
    }

    private boolean Jd(int i) {
        return i >= 4 && this.kj.get() == 0 && !com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD && !com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG;
    }

    private void sUS() {
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.OT(), 1);
        pvs(false);
        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG();
    }

    private void yiw() {
        if (this.NB.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.sUS.pvs.Jd.pvs poll = this.NB.poll();
                if (!(poll instanceof com.bytedance.sdk.component.sUS.pvs.Jd.icD) && poll != null) {
                    pvs(poll);
                }
            }
        }
    }

    private void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        this.Mxy.set(0);
        if (com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD) {
            this.sUS = 5;
        } else if (com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG) {
            this.sUS = 7;
        } else {
            this.sUS = 4;
        }
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.BSi(), 1);
        this.pvs.pvs(pvsVar, this.sUS);
        com.bytedance.sdk.component.sUS.pvs.vG.pvs.yiw(pvsVar);
    }

    private boolean so() {
        if (com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD) {
            return this.sUS == 4 || this.sUS == 7 || this.sUS == 6 || this.sUS == 5 || this.sUS == 2;
        }
        return false;
    }

    private void icD(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        if (com.bytedance.sdk.component.sUS.pvs.vG.pvs.icD() && so.yiw().pvs()) {
            return;
        }
        int i = 0;
        if (so()) {
            com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(this.sUS);
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.kj(), 1);
            if (this.NB.size() != 0) {
                return;
            }
            if (!this.Ju.hasMessages(2)) {
                com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD = false;
                this.so = 0L;
                this.yiw = 0L;
                this.bNS.set(0);
                this.mnm.set(0);
            } else {
                pvs(false);
                return;
            }
        }
        do {
            boolean pvs = pvs(this.sUS, com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD);
            com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(pvs, this.sUS, pvsVar);
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.Ju(), 1);
            if (pvs) {
                List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs2 = this.pvs.pvs(this.sUS, -1, null);
                if (pvs2 != null) {
                    pvs2.size();
                    pvs(pvs2);
                } else {
                    Mxy();
                }
            } else {
                Mxy();
            }
            i++;
            if (!pvs) {
                return;
            }
        } while (i <= 6);
    }

    private void Mxy() {
        try {
            if (this.NB.size() == 0 && this.Ju.hasMessages(11) && pvs()) {
                pvs(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void pvs(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, String str) {
        pvs(str);
        pvs(list, false, str);
        Wyp();
    }

    private void pvs(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(list, this.NB.size());
            if (list.size() > 1 || com.bytedance.sdk.component.sUS.pvs.vG.pvs.vG()) {
                pvs(list, "batchRead");
                return;
            }
            com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar = list.get(0);
            if (pvsVar != null) {
                if (pvsVar.NB() == 1) {
                    pvs(list, "highPriority");
                    return;
                }
                if (pvsVar.Jd() == 0 && pvsVar.NB() == 2) {
                    if (pvsVar.icD() == 3) {
                        pvs(list, "version_v3");
                        return;
                    } else {
                        icD(list);
                        return;
                    }
                }
                if (pvsVar.Jd() == 1) {
                    pvs(list, "stats");
                    return;
                } else if (pvsVar.Jd() == 3) {
                    pvs(list, "adType_v3");
                    return;
                } else {
                    if (pvsVar.Jd() == 2) {
                        pvs(list, "other");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Mxy();
    }

    private void icD(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        this.IP.addAll(list);
        this.IP.size();
        NB mnm = so.yiw().mnm();
        if (mnm != null && mnm.kj() != null) {
            vA = mnm.kj().icD();
        }
        if (this.IP.size() >= vA) {
            if (this.Ju.hasMessages(11)) {
                this.Ju.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.IP);
            this.IP.clear();
            pvs((List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>) arrayList, false, "max_size_dispatch");
            Wyp();
            return;
        }
        if (this.NB.size() == 0) {
            pvs(false);
            if (this.Ju.hasMessages(11)) {
                this.Ju.removeMessages(11);
            }
            if (this.Ju.hasMessages(1)) {
                this.Ju.removeMessages(1);
            }
            long j = cR;
            if (mnm != null && mnm.kj() != null) {
                j = mnm.kj().pvs();
            }
            this.Ju.sendEmptyMessageDelayed(11, j);
            return;
        }
        this.IP.size();
    }

    private void pvs(String str) {
        if (this.Ju.hasMessages(11)) {
            this.Ju.removeMessages(11);
        }
        if (this.IP.size() != 0) {
            ArrayList arrayList = new ArrayList(this.IP);
            this.IP.clear();
            pvs((List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>) arrayList, false, "before_".concat(String.valueOf(str)));
            Wyp();
            arrayList.size();
        }
    }

    private void pvs(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, boolean z, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(list, this.sUS, str);
        com.bytedance.sdk.component.sUS.pvs.icD.vG so = so.yiw().so();
        this.Jd = so;
        if (so != null) {
            icD(list, z, currentTimeMillis);
        } else {
            pvs(list, z, currentTimeMillis);
        }
    }

    private void pvs(final List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, final boolean z, final long j) {
        NB mnm = so.yiw().mnm();
        if (mnm != null) {
            Executor NB = mnm.NB();
            if (list.get(0).NB() == 1) {
                NB = mnm.Jd();
            }
            if (NB == null) {
                return;
            }
            this.kj.incrementAndGet();
            NB.execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("csj_log_upload") { // from class: com.bytedance.sdk.component.sUS.pvs.icD.vG.vG.1
                @Override // java.lang.Runnable
                public void run() {
                    vG vGVar = vG.this;
                    vGVar.pvs((List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>) list, z, j, vGVar.sUS);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, boolean z, long j, int i) {
        icD pvs;
        try {
            com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar = list.get(0);
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.cGU(), 1);
            if (pvsVar.Jd() == 0) {
                pvs = so.NB().pvs(list);
                pvs(pvs, list);
                if (pvs != null) {
                    com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(list, pvs.Jd);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().yiw());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e) {
                    e.getMessage();
                }
                pvs = so.NB().pvs(jSONObject);
            }
            icD icd = pvs;
            this.kj.decrementAndGet();
            pvs(z, icd, list, j);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.qD(), 1);
            this.kj.decrementAndGet();
        }
    }

    private void icD(List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, final boolean z, final long j) {
        this.kj.incrementAndGet();
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.cGU(), 1);
        try {
            HashMap hashMap = new HashMap();
            Iterator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.sUS.pvs.Jd.pvs next = it.next();
                int Wyp = next == null ? 0 : next.Wyp();
                if (hashMap.get(Integer.valueOf(Wyp)) == null) {
                    hashMap.put(Integer.valueOf(Wyp), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(Wyp))).add(next);
            }
            Iterator it2 = hashMap.keySet().iterator();
            while (it2.hasNext()) {
                int intValue = ((Integer) it2.next()).intValue();
                if (intValue != 0 && so.yiw().vG() != null && so.yiw().vG().get(Integer.valueOf(intValue)) != null) {
                    so.yiw().vG().get(Integer.valueOf(intValue)).pvs(list, new com.bytedance.sdk.component.sUS.pvs.icD.icD() { // from class: com.bytedance.sdk.component.sUS.pvs.icD.vG.vG.3
                        @Override // com.bytedance.sdk.component.sUS.pvs.icD.icD
                        public void pvs(List<pvs> list2) {
                            try {
                                vG.this.kj.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    pvs pvsVar = list2.get(i);
                                    if (pvsVar != null) {
                                        vG.this.pvs(z, pvsVar.pvs(), pvsVar.icD(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                this.Jd.pvs(list, new com.bytedance.sdk.component.sUS.pvs.icD.icD() { // from class: com.bytedance.sdk.component.sUS.pvs.icD.vG.vG.2
                    @Override // com.bytedance.sdk.component.sUS.pvs.icD.icD
                    public void pvs(List<pvs> list2) {
                        try {
                            vG.this.kj.decrementAndGet();
                            if (list2 == null || list2.size() == 0) {
                                return;
                            }
                            int size = list2.size();
                            for (int i = 0; i < size; i++) {
                                pvs pvsVar = list2.get(i);
                                if (pvsVar != null) {
                                    vG.this.pvs(z, pvsVar.pvs(), pvsVar.icD(), j);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.qD(), 1);
            this.kj.decrementAndGet();
        }
    }

    private void NB(int i) {
        if (!pvs()) {
            if (this.Ju == null) {
                return;
            }
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.vG(), 1);
            if (this.Ju.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.sUS(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.Jd(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.NB(), 1);
            }
            this.Ju.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.pvs(), 1);
    }

    private void pvs(icD icd, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        if (icd == null || !icd.pvs) {
            return;
        }
        List<Object> pvs = com.bytedance.sdk.component.sUS.pvs.icD.pvs();
        if (list == null || pvs == null || pvs.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar : list) {
            if (pvsVar.NB() == 1) {
                com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(pvsVar);
                com.bytedance.sdk.component.sUS.pvs.vG.pvs.NB(pvsVar);
                Iterator<Object> it = pvs.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private void Wyp() {
        long nanoTime;
        if (this.Ju.hasMessages(11)) {
            Mxy();
        } else {
            NB(1);
        }
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.icD(), 1);
        if (this.sUS == 2) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.yiw(), 1);
            synchronized (this.vG) {
                try {
                    try {
                        long nanoTime2 = System.nanoTime();
                        this.vG.wait(5000L);
                        nanoTime = System.nanoTime() - nanoTime2;
                        if (!com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD) {
                            boolean z = com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG;
                        }
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD && !com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG) {
                            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.gSd(), 1);
                            vG(2);
                            return;
                        }
                        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.qh(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.Wyp(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(boolean z, icD icd, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, long j) {
        if (z || icd == null) {
            return;
        }
        int i = icd.icD;
        int i2 = -2;
        if (icd.NB) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (icd.pvs || ((i < 500 || i >= 509) && i <= 513)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.kj.get();
        }
        pvs(i2, list, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:8:0x0005, B:11:0x000b, B:21:0x00eb, B:23:0x00ef, B:24:0x00f4, B:27:0x0030, B:29:0x0040, B:31:0x0042, B:33:0x004f, B:35:0x0051, B:37:0x005f, B:38:0x0064, B:39:0x0069, B:41:0x006f, B:43:0x0075, B:45:0x0085, B:46:0x008a, B:48:0x0092, B:49:0x0097, B:50:0x00b4, B:52:0x00c4, B:54:0x00c6, B:56:0x00d3, B:58:0x00d5, B:60:0x00e3, B:61:0x00e8, B:4:0x00fb), top: B:7:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(int i, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list, long j) {
        synchronized (this.vG) {
            if (list != null) {
                if (this.Ju != null) {
                    com.bytedance.sdk.component.sUS.pvs.vG.pvs.pvs(i, list, j);
                    this.pvs.pvs(i, list);
                    so.yiw().mnm();
                    if (i != -2) {
                        if (i != -1) {
                            if (i != 0) {
                                if (i != 200) {
                                    if (i == 509) {
                                        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD = true;
                                        com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG = false;
                                        if (this.Ju.hasMessages(2)) {
                                            return;
                                        }
                                        if (System.currentTimeMillis() - this.yiw < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                                            return;
                                        }
                                        this.yiw = System.currentTimeMillis();
                                        if (this.Ju.hasMessages(3)) {
                                            this.Ju.removeMessages(3);
                                        }
                                        pvs(2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                                    }
                                    if (this.sUS == 2) {
                                        this.vG.notify();
                                    }
                                    this.NB.size();
                                }
                            }
                        }
                        if (com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD || com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG) {
                            com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD = false;
                            com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG = false;
                            if (this.Ju.hasMessages(2)) {
                                this.Ju.removeMessages(2);
                            }
                            if (this.Ju.hasMessages(3)) {
                                this.Ju.removeMessages(3);
                            }
                            this.so = 0L;
                            this.yiw = 0L;
                            this.bNS.set(0);
                            this.mnm.set(0);
                            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.od(), 1);
                            vG(2);
                        }
                        if (this.sUS == 2) {
                        }
                        this.NB.size();
                    }
                    com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.icD = false;
                    com.bytedance.sdk.component.sUS.pvs.icD.Jd.pvs.vG = true;
                    if (this.Ju.hasMessages(3)) {
                        return;
                    }
                    if (System.currentTimeMillis() - this.so < 15000) {
                        return;
                    }
                    this.so = System.currentTimeMillis();
                    if (this.Ju.hasMessages(2)) {
                        this.Ju.removeMessages(2);
                    }
                    pvs(3, 15000L);
                    if (this.sUS == 2) {
                    }
                    this.NB.size();
                }
            }
        }
    }

    public void pvs(int i, long j) {
        if (this.Ju == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        if (i == 2) {
            this.Ju.sendMessageDelayed(obtain, (((this.bNS.incrementAndGet() - 1) % 4) + 1) * j);
        } else if (i == 3) {
            this.Ju.sendMessageDelayed(obtain, (((this.mnm.incrementAndGet() - 1) % 4) + 1) * j);
        }
    }
}
