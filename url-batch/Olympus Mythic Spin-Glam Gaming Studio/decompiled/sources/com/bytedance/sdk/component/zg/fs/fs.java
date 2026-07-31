package com.bytedance.sdk.component.zg.fs;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes6.dex */
public class fs<V> extends FutureTask<V> implements Comparable<fs<V>> {
    private int fs;
    private int zmn;

    public fs(Callable<V> callable, int i, int i2) {
        super(callable);
        this.zmn = i == -1 ? 5 : i;
        this.fs = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public int compareTo(fs fsVar) {
        if (zmn() < fsVar.zmn()) {
            return 1;
        }
        return zmn() > fsVar.zmn() ? -1 : 0;
    }

    public int zmn() {
        return this.zmn;
    }
}
