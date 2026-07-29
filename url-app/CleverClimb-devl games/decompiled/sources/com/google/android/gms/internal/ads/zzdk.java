package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class zzdk extends BroadcastReceiver {
    private final /* synthetic */ zzdi zztj;

    zzdk(zzdi zzdiVar) {
        this.zztj = zzdiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zztj.zzaq();
    }
}
