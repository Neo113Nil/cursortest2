package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qf extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf f393a;

    public qf(rf rfVar) {
        this.f393a = rfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f393a.o.isInitialStickyBroadcast() && intent.getExtras() != null) {
            int i = intent.getExtras().getInt("plugged");
            this.f393a.l = i == 1;
        } else if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED") || Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.f393a.a(false);
        }
    }
}
