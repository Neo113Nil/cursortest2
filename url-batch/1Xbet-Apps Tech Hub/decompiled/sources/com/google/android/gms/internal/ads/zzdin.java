package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdin implements zzctu {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhec zzd;
    private final zzdkv zze;

    zzdin(Map map, Map map2, Map map3, zzhec zzhecVar, zzdkv zzdkvVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhecVar;
        this.zze = zzdkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final zzefv zza(int i, String str) {
        zzefv zza;
        zzefv zzefvVar = (zzefv) this.zza.get(str);
        if (zzefvVar != null) {
            return zzefvVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzeij zzeijVar = (zzeij) this.zzc.get(str);
            if (zzeijVar != null) {
                return new zzefw(zzeijVar, new zzftn() { // from class: com.google.android.gms.internal.ads.zzctw
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object apply(Object obj) {
                        return new zzctz((List) obj);
                    }
                });
            }
            zza = (zzefv) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zza = ((zzctu) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzefw(zza, new zzftn() { // from class: com.google.android.gms.internal.ads.zzctx
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return new zzctz((zzctr) obj);
            }
        });
    }
}
