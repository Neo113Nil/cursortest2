package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes3.dex */
public final class F2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final BiConsumer f37495a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f37496b;

    public F2(C2480a3 c2480a3, ICommonExecutor iCommonExecutor) {
        this.f37495a = c2480a3;
        this.f37496b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f37496b.execute(new E2(this, context, intent));
    }
}
