package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964t2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final BiConsumer f12764a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f12765b;

    public C0964t2(N2 n22, ICommonExecutor iCommonExecutor) {
        this.f12764a = n22;
        this.f12765b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f12765b.execute(new RunnableC0938s2(this, context, intent));
    }
}
