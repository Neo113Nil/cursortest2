package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbjb implements zzbkd {
    public final /* synthetic */ zzdge zza;
    public final /* synthetic */ zzcpo zzb;

    public /* synthetic */ zzbjb(zzdge zzdgeVar, zzcpo zzcpoVar) {
        this.zza = zzdgeVar;
        this.zzb = zzcpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        zzbkc.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzcbn.zzj("URL missing from click GMSG.");
        } else {
            final zzcpo zzcpoVar = this.zzb;
            zzgbb.zzr(zzgbb.zzn(zzgas.zzu(zzbkc.zza(zzcgvVar, str)), new zzgai() { // from class: com.google.android.gms.internal.ads.zzbjd
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj2) {
                    zzcpo zzcpoVar2;
                    String str2 = (String) obj2;
                    zzbkd zzbkdVar = zzbkc.zza;
                    return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjB)).booleanValue() || (zzcpoVar2 = zzcpo.this) == null) ? zzgbb.zzh(str2) : zzcpoVar2.zzc(str2, com.google.android.gms.ads.internal.client.zzay.zze());
                }
            }, zzcca.zza), new zzbjr(zzcgvVar), zzcca.zza);
        }
    }
}
