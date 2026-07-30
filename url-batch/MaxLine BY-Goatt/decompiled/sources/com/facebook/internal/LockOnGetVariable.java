package com.facebook.internal;

import com.facebook.FacebookSdk;
import defpackage.kk0;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LockOnGetVariable<T> {
    private CountDownLatch initLatch;
    private T storedValue;

    public LockOnGetVariable(Callable<T> callable) {
        callable.getClass();
        this.initLatch = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new kk0(1, this, callable)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void _init_$lambda$0(LockOnGetVariable lockOnGetVariable, Callable callable) {
        lockOnGetVariable.getClass();
        callable.getClass();
        try {
            lockOnGetVariable.storedValue = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = lockOnGetVariable.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void waitOnInit() {
        CountDownLatch countDownLatch = this.initLatch;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public final T getValue() {
        waitOnInit();
        return this.storedValue;
    }

    public LockOnGetVariable(T t) {
        this.storedValue = t;
    }
}
