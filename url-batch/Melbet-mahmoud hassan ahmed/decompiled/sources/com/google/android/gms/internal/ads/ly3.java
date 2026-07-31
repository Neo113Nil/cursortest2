package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
final class ly3 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny3 f8129a;

    /* synthetic */ ly3(ny3 ny3Var, ky3 ky3Var) {
        this.f8129a = ny3Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler;
        handler = this.f8129a.f9394b;
        final ny3 ny3Var = this.f8129a;
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jy3
            @Override // java.lang.Runnable
            public final void run() {
                ny3.this.h();
            }
        });
    }
}
