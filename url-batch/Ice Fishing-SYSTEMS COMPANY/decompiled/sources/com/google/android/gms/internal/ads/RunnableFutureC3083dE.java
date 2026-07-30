package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.dE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableFutureC3083dE extends ID implements RunnableFuture {

    /* renamed from: A, reason: collision with root package name */
    public volatile QD f29990A;

    public RunnableFutureC3083dE(Callable callable) {
        this.f29990A = new C3028cE(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final void f() {
        QD qd;
        if (m() && (qd = this.f29990A) != null) {
            qd.g();
        }
        this.f29990A = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String g() {
        QD qd = this.f29990A;
        if (qd == null) {
            return super.g();
        }
        String qd2 = qd.toString();
        return D.y.o(new StringBuilder(qd2.length() + 7), "task=[", qd2, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        QD qd = this.f29990A;
        if (qd != null) {
            qd.run();
        }
        this.f29990A = null;
    }
}
