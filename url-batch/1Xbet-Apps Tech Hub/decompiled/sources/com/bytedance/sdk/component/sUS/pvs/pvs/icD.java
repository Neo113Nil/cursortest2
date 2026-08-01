package com.bytedance.sdk.component.sUS.pvs.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: CacheManager.java */
/* loaded from: classes.dex */
public class icD extends pvs {
    private final vG icD;
    private final Jd pvs;
    private final Queue<String> vG;

    public icD() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.vG = concurrentLinkedQueue;
        this.pvs = new sUS(concurrentLinkedQueue);
        this.icD = new vG();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public synchronized void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        Jd jd;
        if (i != 5) {
            if (so.yiw().mnm().pvs(so.yiw().sUS()) && (jd = this.pvs) != null && pvsVar != null) {
                jd.pvs(pvsVar, i);
            }
        }
        vG vGVar = this.icD;
        if (vGVar != null && pvsVar != null) {
            vGVar.pvs(pvsVar, i);
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public synchronized void pvs(int i, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
        Iterator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> it = list.iterator();
        while (it.hasNext()) {
            this.vG.remove(it.next().vG());
        }
        Jd jd = this.pvs;
        if (jd != null) {
            jd.pvs(i, list);
        }
        vG vGVar = this.icD;
        if (vGVar != null) {
            vGVar.pvs(i, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r9 == 2) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list2;
        boolean z;
        List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs = this.pvs.pvs(i, i2, list);
        if (pvs != 0 && pvs.size() != 0) {
            pvs.size();
            if (i != 1) {
                list2 = pvs;
            }
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> icD = this.icD.icD((com.bytedance.sdk.component.sUS.pvs.Jd.pvs) pvs.get(0), pvs.size());
            list2 = pvs;
            if (icD != null) {
                list2 = pvs;
                if (icD.size() != 0) {
                    icD.size();
                    HashMap hashMap = new HashMap();
                    for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar : icD) {
                        hashMap.put(pvsVar.vG(), pvsVar);
                    }
                    ArrayList arrayList = new ArrayList(this.vG);
                    for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar2 : icD) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (TextUtils.equals(pvsVar2.vG(), (String) it.next())) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            hashMap.remove(pvsVar2.vG());
                        }
                    }
                    for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar3 : pvs) {
                        hashMap.put(pvsVar3.vG(), pvsVar3);
                    }
                    pvs.clear();
                    Iterator it2 = hashMap.keySet().iterator();
                    while (it2.hasNext()) {
                        pvs.add(hashMap.get((String) it2.next()));
                    }
                    icD.clear();
                    list2 = pvs;
                }
            }
        } else {
            ArrayList<String> arrayList2 = new ArrayList(this.vG);
            if (list != null && !list.isEmpty()) {
                arrayList2.addAll(list);
            }
            List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs2 = this.icD.pvs(i, i2, arrayList2);
            if (pvs2 != 0 && pvs2.size() != 0) {
                HashMap hashMap2 = new HashMap();
                for (com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar4 : pvs2) {
                    hashMap2.put(pvsVar4.vG(), pvsVar4);
                }
                arrayList2.size();
                if (arrayList2.size() != 0) {
                    for (String str : arrayList2) {
                        if (hashMap2.get(str) != null) {
                            hashMap2.remove(str);
                        }
                    }
                }
                pvs2.clear();
                Iterator it3 = hashMap2.keySet().iterator();
                while (it3.hasNext()) {
                    pvs2.add(hashMap2.get((String) it3.next()));
                }
            }
            list2 = pvs2;
        }
        if (list2 != null && !list2.isEmpty()) {
            Iterator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> it4 = list2.iterator();
            while (it4.hasNext()) {
                this.vG.offer(it4.next().vG());
            }
            return list2;
        }
        return new ArrayList();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public synchronized boolean pvs(int i, boolean z) {
        if (this.pvs.pvs(i, z)) {
            com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.jlb(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.icD.pvs(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(com.bytedance.sdk.component.sUS.pvs.icD.Jd.Jd.dx(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.pvs.Jd
    public void pvs(int i, long j) {
        this.icD.pvs(i, j);
        this.pvs.pvs(i, j);
    }
}
