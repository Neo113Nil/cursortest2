package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class zb extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15060a = true;

    zb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    final boolean a() {
        return this.f15060a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z6;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            z6 = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            return;
        } else {
            z6 = false;
        }
        this.f15060a = z6;
    }
}
