package com.google.firebase.installations;

import defpackage.jt2;
import defpackage.uu1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class AwaitListener implements uu1 {
    private final CountDownLatch latch = new CountDownLatch(1);

    public boolean await(long j, TimeUnit timeUnit) {
        return this.latch.await(j, timeUnit);
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        this.latch.countDown();
    }

    public void onSuccess() {
        this.latch.countDown();
    }
}
