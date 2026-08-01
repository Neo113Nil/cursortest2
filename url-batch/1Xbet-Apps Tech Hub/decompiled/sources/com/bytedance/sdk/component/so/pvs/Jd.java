package com.bytedance.sdk.component.so.pvs;

import com.bytedance.sdk.component.so.pvs.vG;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: RecyclePool.java */
/* loaded from: classes.dex */
public class Jd<T extends vG> {
    private BlockingQueue<T> icD = new LinkedBlockingQueue();
    private int pvs;

    public static Jd pvs(int i) {
        return new Jd(i);
    }

    private Jd(int i) {
        this.pvs = i;
    }

    public T pvs() {
        return this.icD.poll();
    }

    public boolean pvs(T t) {
        if (t == null) {
            return false;
        }
        t.pvs();
        if (this.icD.size() >= this.pvs) {
            return false;
        }
        return this.icD.offer(t);
    }
}
