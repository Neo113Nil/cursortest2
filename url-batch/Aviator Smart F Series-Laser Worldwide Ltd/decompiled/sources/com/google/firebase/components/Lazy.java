package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    Lazy(T t7) {
        this.instance = UNINITIALIZED;
        this.instance = t7;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t7 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t7 == obj) {
            synchronized (this) {
                try {
                    t7 = (T) this.instance;
                    if (t7 == obj) {
                        t7 = this.provider.get();
                        this.instance = t7;
                        this.provider = null;
                    }
                } finally {
                }
            }
        }
        return t7;
    }

    @VisibleForTesting
    boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }
}
