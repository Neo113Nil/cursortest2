package com.bytedance.sdk.component.hhw.zmn.zmn.fs;

import com.bytedance.sdk.component.hhw.zmn.fb.zmn;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes10.dex */
public abstract class fb<T extends com.bytedance.sdk.component.hhw.zmn.fb.zmn> {
    private String fb;
    private Queue<T> fs = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmn;
    private Queue<String> zn;

    public fb(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar, Queue<String> queue, String str) {
        this.zmn = zmnVar;
        this.zn = queue;
        this.fb = str;
    }

    public void zmn(T t) {
        Queue<T> queue = this.fs;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> zmn(int i, int i2) {
        if (!fs(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.zmn.zmn());
        do {
            T poll = this.fs.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        } while (arrayList.size() != this.zmn.fs());
        return arrayList;
    }

    public synchronized void zmn(int i, List<T> list) {
        if (i == -1 || i == 200 || i == 509) {
            this.fs.size();
        } else {
            this.fs.addAll(list);
        }
    }

    public synchronized boolean fs(int i, int i2) {
        int size = this.fs.size();
        int zmn = this.zmn.zmn();
        return (i == 2 || i == 1) ? com.bytedance.sdk.component.hhw.zmn.zn.zmn.zn() ? size > 0 : size >= zmn : size >= zmn;
    }
}
