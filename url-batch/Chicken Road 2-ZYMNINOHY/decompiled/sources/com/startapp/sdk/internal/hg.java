package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hg extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ig f7062a;

    public hg(ig igVar) {
        this.f7062a = igVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f7062a.o.isInitialStickyBroadcast() && intent.getExtras() != null) {
            int i4 = intent.getExtras().getInt("plugged");
            this.f7062a.f7111l = i4 == 1;
        } else if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED") || Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.f7062a.a(false);
        }
    }
}
