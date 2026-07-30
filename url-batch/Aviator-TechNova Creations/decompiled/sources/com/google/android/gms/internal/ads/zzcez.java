package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcez implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcfi zzb;

    zzcez(zzcfi zzcfiVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcfiVar);
        this.zzb = zzcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfi zzcfiVar = this.zzb;
        zzcfiVar.zzs(this.zza);
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzb();
        }
    }
}
