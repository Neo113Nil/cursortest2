package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdkh {
    private final zzdpi zza;
    private final zzdnx zzb;
    private final zzcnp zzc;
    private final zzdjc zzd;

    public zzdkh(zzdpi zzdpiVar, zzdnx zzdnxVar, zzcnp zzcnpVar, zzdjc zzdjcVar) {
        this.zza = zzdpiVar;
        this.zzb = zzdnxVar;
        this.zzc = zzcnpVar;
        this.zzd = zzdjcVar;
    }

    public final View zza() throws zzcez {
        zzcek zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(8);
        zza.zzab("/sendMessageToSdk", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkh.this.zzb((zzcek) obj, map);
            }
        });
        zza.zzab("/adMuted", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkh.this.zzc((zzcek) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zza);
        zzbjl zzbjlVar = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzcgi zzP = zzcekVar.zzP();
                final zzdkh zzdkhVar = zzdkh.this;
                zzP.zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdkf
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                        zzdkh.this.zzf(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcekVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcekVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdnx zzdnxVar = this.zzb;
        zzdnxVar.zzh(weakReference, "/loadHtml", zzbjlVar);
        zzdnxVar.zzh(new WeakReference(zza), "/showOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkh.this.zzd((zzcek) obj, map);
            }
        });
        zzdnxVar.zzh(new WeakReference(zza), "/hideOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkh.this.zze((zzcek) obj, map);
            }
        });
        return zza.zzE();
    }

    final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcek zzcekVar, Map map) {
        this.zzd.zzt();
    }

    final /* synthetic */ void zzd(zzcek zzcekVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzcekVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zze(zzcek zzcekVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzcekVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzf(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
