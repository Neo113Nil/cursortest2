package com.facebook.ads.internal.q.a;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class w<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<T> f5440a;

    public w(T t) {
        this.f5440a = new WeakReference<>(t);
    }

    public T a() {
        return this.f5440a.get();
    }
}
