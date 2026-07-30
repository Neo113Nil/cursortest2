package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfjv {
    public static zzboh zza(final zzeiu zzeiuVar, final zzfqk zzfqkVar, final zzcrv zzcrvVar, final zzdjm zzdjmVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzfju
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjm.this);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzeiu zzeiuVar2 = zzeiuVar;
                    zzfqk zzfqkVar2 = zzfqkVar;
                    zzgzo.zzr(zzbog.zza(zzcjlVar, str), new zzfjs(zzcjlVar, zzcrvVar, zzfqkVar2, zzeiuVar2), zzcei.zza);
                }
            }
        };
    }

    public static zzboh zzb(final zzeiu zzeiuVar, final zzfqk zzfqkVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzfjt
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjc zzcjcVar = (zzcjc) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfir zzC = zzcjcVar.zzC();
                if (zzC != null && !zzC.zzai) {
                    zzfqk.this.zzb(str, zzC.zzax, null, null);
                    return;
                }
                zzfiu zzaC = ((zzcks) zzcjcVar).zzaC();
                if (zzaC != null) {
                    zzeiuVar.zze(new zzeiw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
