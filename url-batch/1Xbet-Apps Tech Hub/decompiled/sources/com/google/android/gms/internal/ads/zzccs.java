package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzccs implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcda zzb;

    zzccs(zzcda zzcdaVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcdaVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdb zzcdbVar;
        zzcdb zzcdbVar2;
        zzcda.zzl(this.zzb, this.zza);
        zzcda zzcdaVar = this.zzb;
        zzcdbVar = zzcdaVar.zzq;
        if (zzcdbVar != null) {
            zzcdbVar2 = zzcdaVar.zzq;
            zzcdbVar2.zzf();
        }
    }
}
