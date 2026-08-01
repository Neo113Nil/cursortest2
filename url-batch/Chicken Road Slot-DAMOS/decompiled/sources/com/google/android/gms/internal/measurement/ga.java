package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ga extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f8.x0 f2330c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f2331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f2332e;

    public ga(AtomicBoolean atomicBoolean, Context context, f8.x0 x0Var, v5 v5Var, Executor executor) {
        this.f2328a = atomicBoolean;
        this.f2329b = context;
        this.f2330c = x0Var;
        this.f2331d = v5Var;
        this.f2332e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f2328a.compareAndSet(false, true)) {
            try {
                this.f2329b.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
            }
            f8.x0 x0Var = this.f2330c;
            v5 v5Var = this.f2331d;
            Executor executor = this.f2332e;
            f8.z0 z0Var = new f8.z0();
            z0Var.f4204w = new f8.y0(z0Var, v5Var);
            executor.execute(z0Var);
            x0Var.n(z0Var);
        }
    }
}
