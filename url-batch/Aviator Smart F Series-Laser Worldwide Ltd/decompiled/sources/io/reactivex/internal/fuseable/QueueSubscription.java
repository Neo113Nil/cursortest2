package io.reactivex.internal.fuseable;

import p7.d;

/* loaded from: classes2.dex */
public interface QueueSubscription<T> extends QueueFuseable<T>, d {
    @Override // p7.d
    /* synthetic */ void cancel();

    @Override // p7.d
    /* synthetic */ void request(long j8);
}
