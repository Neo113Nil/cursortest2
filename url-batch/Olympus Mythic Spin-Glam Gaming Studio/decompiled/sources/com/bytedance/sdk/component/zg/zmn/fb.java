package com.bytedance.sdk.component.zg.zmn;

import com.bytedance.sdk.component.zg.zmn.zn;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class fb<T extends zn> {
    private BlockingQueue<T> fs = new LinkedBlockingQueue();
    private int zmn;

    public static fb zmn(int i) {
        return new fb(i);
    }

    private fb(int i) {
        this.zmn = i;
    }

    public T zmn() {
        return this.fs.poll();
    }

    public boolean zmn(T t) {
        if (t == null) {
            return false;
        }
        t.zmn();
        if (this.fs.size() >= this.zmn) {
            return false;
        }
        return this.fs.offer(t);
    }
}
