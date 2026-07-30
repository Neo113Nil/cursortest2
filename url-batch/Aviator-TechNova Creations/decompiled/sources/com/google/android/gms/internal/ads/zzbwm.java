package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbwm implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwo zza;

    zzbwm(zzbwo zzbwoVar) {
        Objects.requireNonNull(zzbwoVar);
        this.zza = zzbwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbwo zzbwoVar = this.zza;
        Intent zzb = zzbwoVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzaa(zzbwoVar.zzc(), zzb);
    }
}
