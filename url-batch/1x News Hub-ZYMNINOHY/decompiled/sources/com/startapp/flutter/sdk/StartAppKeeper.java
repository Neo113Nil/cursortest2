package com.startapp.flutter.sdk;

import android.util.SparseArray;

/* loaded from: classes.dex */
public class StartAppKeeper<T> {
    private final SparseArray<T> instances = new SparseArray<>();
    private final StartAppSequence sequence;

    public StartAppKeeper(StartAppSequence startAppSequence) {
        this.sequence = startAppSequence;
    }

    public int add(T t3) {
        int next = this.sequence.next();
        if (next <= 0) {
            return 0;
        }
        synchronized (this.instances) {
            this.instances.put(next, t3);
        }
        return next;
    }

    public T get(int i3) {
        T t3;
        synchronized (this.instances) {
            t3 = this.instances.get(i3);
        }
        return t3;
    }

    public void remove(int i3) {
        synchronized (this.instances) {
            this.instances.remove(i3);
        }
    }
}
