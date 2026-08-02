package com.startapp.flutter.sdk;

import android.util.SparseArray;

/* loaded from: classes.dex */
public class StartAppKeeper<T> {
    private final SparseArray<T> instances = new SparseArray<>();
    private final StartAppSequence sequence;

    public StartAppKeeper(StartAppSequence startAppSequence) {
        this.sequence = startAppSequence;
    }

    public int add(T t4) {
        int next = this.sequence.next();
        if (next <= 0) {
            return 0;
        }
        synchronized (this.instances) {
            this.instances.put(next, t4);
        }
        return next;
    }

    public T get(int i4) {
        T t4;
        synchronized (this.instances) {
            t4 = this.instances.get(i4);
        }
        return t4;
    }

    public void remove(int i4) {
        synchronized (this.instances) {
            this.instances.remove(i4);
        }
    }
}
