package com.bytedance.sdk.component.so;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: TTFutureTask.java */
/* loaded from: classes.dex */
public class yiw<V> extends FutureTask<V> implements Comparable<yiw<V>> {
    private int icD;
    private int pvs;

    public yiw(Callable<V> callable, int i, int i2) {
        super(callable);
        this.pvs = i == -1 ? 5 : i;
        this.icD = i2;
    }

    public yiw(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.pvs = i == -1 ? 5 : i;
        this.icD = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(yiw yiwVar) {
        if (pvs() < yiwVar.pvs()) {
            return 1;
        }
        return pvs() > yiwVar.pvs() ? -1 : 0;
    }

    public int pvs() {
        return this.pvs;
    }
}
