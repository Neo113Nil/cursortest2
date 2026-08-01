package com.bytedance.sdk.component.sUS.pvs.pvs.icD;

import com.bytedance.sdk.component.sUS.pvs.Jd.pvs;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: EventMemoryCacheManager.java */
/* loaded from: classes.dex */
public abstract class Jd<T extends com.bytedance.sdk.component.sUS.pvs.Jd.pvs> {
    private String Jd;
    private Queue<T> icD = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvs;
    private Queue<String> vG;

    public Jd(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar, Queue<String> queue, String str) {
        this.pvs = pvsVar;
        this.vG = queue;
        this.Jd = str;
    }

    public void pvs(T t) {
        Queue<T> queue = this.icD;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs(int i, int i2) {
        if (!icD(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.pvs.pvs());
        do {
            T poll = this.icD.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        } while (arrayList.size() != this.pvs.icD());
        return arrayList;
    }

    public synchronized void pvs(int i, List<T> list) {
        if (i == -1 || i == 200 || i == 509) {
            this.icD.size();
        } else {
            this.icD.addAll(list);
        }
    }

    public synchronized boolean icD(int i, int i2) {
        int size = this.icD.size();
        int pvs = this.pvs.pvs();
        return (i == 2 || i == 1) ? com.bytedance.sdk.component.sUS.pvs.vG.pvs.vG() ? size > 0 : size >= pvs : size >= pvs;
    }
}
