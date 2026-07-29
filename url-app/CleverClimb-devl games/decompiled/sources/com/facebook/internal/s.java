package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* compiled from: LockOnGetVariable.java */
/* loaded from: classes.dex */
public class s<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f6183a;

    /* renamed from: b, reason: collision with root package name */
    private CountDownLatch f6184b = new CountDownLatch(1);

    public s(final Callable<T> callable) {
        com.facebook.l.d().execute(new FutureTask(new Callable<Void>() { // from class: com.facebook.internal.s.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                try {
                    s.this.f6183a = callable.call();
                    s.this.f6184b.countDown();
                    return null;
                } catch (Throwable th) {
                    s.this.f6184b.countDown();
                    throw th;
                }
            }
        }));
    }

    public T a() {
        b();
        return this.f6183a;
    }

    private void b() {
        if (this.f6184b == null) {
            return;
        }
        try {
            this.f6184b.await();
        } catch (InterruptedException unused) {
        }
    }
}
