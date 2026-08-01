package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzemc {
    private final zzdhy zza;

    public zzemc(zzdhy zzdhyVar) {
        this.zza = zzdhyVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, View view, zzely zzelyVar) {
        zzema zzemaVar = new zzema(this, new zzdig() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
            }
        });
        zzdgy zze = this.zza.zze(new zzcuh(zzfehVar, zzfduVar, null), zzemaVar);
        zzelyVar.zzd(new zzemb(this, zze));
        return zze.zzg();
    }
}
