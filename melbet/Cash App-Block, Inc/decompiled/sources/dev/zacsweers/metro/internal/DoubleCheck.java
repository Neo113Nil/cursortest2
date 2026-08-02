package dev.zacsweers.metro.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DoubleCheck implements Provider, Lazy {
    public volatile Object _value;
    public final ReentrantLock lock;
    public Provider provider;

    public DoubleCheck(Provider provider) {
        provider.getClass();
        this.provider = provider;
        this._value = BaseDoubleCheckKt.UNINITIALIZED;
        this.lock = new ReentrantLock();
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this._value;
        Object obj2 = BaseDoubleCheckKt.UNINITIALIZED;
        if (obj != obj2) {
            return obj;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object obj3 = this._value;
            if (obj3 == obj2) {
                Provider provider = this.provider;
                provider.getClass();
                obj3 = provider.invoke();
                Object obj4 = this._value;
                if (obj4 != obj2 && !Intrinsics.areEqual(obj4, obj3)) {
                    throw new IllegalStateException(("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj3 + ". This is likely due to a circular dependency.").toString());
                }
                this._value = obj3;
                this.provider = null;
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return getValue();
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this._value != BaseDoubleCheckKt.UNINITIALIZED;
    }

    public final String toString() {
        return isInitialized() ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DoubleCheck(value=", ")", this._value) : "DoubleCheck(value=<not initialized>)";
    }
}
