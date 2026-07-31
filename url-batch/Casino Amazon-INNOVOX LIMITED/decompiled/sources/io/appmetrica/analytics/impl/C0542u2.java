package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0542u2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final BiConsumer f1508a;
    public final ICommonExecutor b;

    public C0542u2(O2 o2, ICommonExecutor iCommonExecutor) {
        this.f1508a = o2;
        this.b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b.execute(new RunnableC0517t2(this, context, intent));
    }
}
