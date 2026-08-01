package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbju implements zzbkd {
    zzbju() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        if (zzcgvVar.zzJ() != null) {
            zzcgvVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzcgvVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzM = zzcgvVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzcbn.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
