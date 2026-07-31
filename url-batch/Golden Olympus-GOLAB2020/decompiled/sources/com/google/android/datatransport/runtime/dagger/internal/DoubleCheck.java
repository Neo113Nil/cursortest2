package com.google.android.datatransport.runtime.dagger.internal;

import V1.a;

/* loaded from: classes.dex */
public final class DoubleCheck<T> implements a {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile a provider;

    private DoubleCheck(a aVar) {
        this.provider = aVar;
    }

    public static <P extends a, T> a provider(P p4) {
        Preconditions.checkNotNull(p4);
        return p4 instanceof DoubleCheck ? p4 : new DoubleCheck(p4);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED) {
            return obj2;
        }
        if (obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // V1.a
    public T get() {
        T t4;
        T t5 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t5 != obj) {
            return t5;
        }
        synchronized (this) {
            try {
                t4 = (T) this.instance;
                if (t4 == obj) {
                    t4 = (T) this.provider.get();
                    this.instance = reentrantCheck(this.instance, t4);
                    this.provider = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t4;
    }
}
