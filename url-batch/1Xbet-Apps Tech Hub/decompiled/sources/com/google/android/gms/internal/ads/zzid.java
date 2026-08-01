package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzid extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzif zza;
    private final zzie zzb;
    private final Handler zzc;

    public zzid(zzif zzifVar, Handler handler, zzie zzieVar) {
        this.zza = zzifVar;
        this.zzc = handler;
        this.zzb = zzieVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
