package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class bz2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cz2 f3643a;

    bz2(cz2 cz2Var) {
        this.f3643a = cz2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            cz2.b(this.f3643a, true);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            cz2.b(this.f3643a, false);
        } else {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                return;
            }
            cz2.b(this.f3643a, false);
        }
    }
}
