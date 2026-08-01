package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzavo extends BroadcastReceiver {
    final /* synthetic */ zzavr zza;

    zzavo(zzavr zzavrVar) {
        this.zza = zzavrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
