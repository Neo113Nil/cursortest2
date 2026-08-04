package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbis implements zzbjl {
    zzbis() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (zzcekVar.zzaz() != null) {
            zzcekVar.zzaz().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzcekVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzM = zzcekVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
