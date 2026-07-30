package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdmj implements zzcwi {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzikv zzd;
    private final zzdor zze;

    zzdmj(Map map, Map map2, Map map3, zzikv zzikvVar, zzdor zzdorVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzikvVar;
        this.zze = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final zzekg zza(int i, String str) {
        zzekg zza;
        zzekg zzekgVar = (zzekg) this.zza.get(str);
        if (zzekgVar != null) {
            return zzekgVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzemm zzemmVar = (zzemm) this.zzc.get(str);
            if (zzemmVar != null) {
                return zzcwn.zza(zzemmVar);
            }
            zza = (zzekg) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zza = ((zzcwi) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcwn.zzb(zza);
    }
}
