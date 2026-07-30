package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdsa {
    private final Executor zza;
    private final zzctc zzb;
    private final zzdjg zzc;
    private final zzcrv zzd;
    private final zzczz zze;

    zzdsa(Executor executor, zzctc zzctcVar, zzdjg zzdjgVar, zzcrv zzcrvVar, zzczz zzczzVar) {
        this.zza = executor;
        this.zzc = zzdjgVar;
        this.zzb = zzctcVar;
        this.zzd = zzcrvVar;
        this.zze = zzczzVar;
    }

    public final void zza(final zzcjl zzcjlVar) {
        if (zzcjlVar == null) {
            return;
        }
        zzdjg zzdjgVar = this.zzc;
        zzdjgVar.zza(zzcjlVar.zzE());
        zzbde zzbdeVar = new zzbde() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // com.google.android.gms.internal.ads.zzbde
            public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
                Rect rect = zzbddVar.zzd;
                zzcjl.this.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdjgVar.zzq(zzbdeVar, executor);
        zzdjgVar.zzq(new zzbde() { // from class: com.google.android.gms.internal.ads.zzdrw
            @Override // com.google.android.gms.internal.ads.zzbde
            public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzbddVar.zzj ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                zzcjl.this.zze("onAdVisibilityChanged", hashMap);
            }
        }, executor);
        zzctc zzctcVar = this.zzb;
        zzdjgVar.zzq(zzctcVar, executor);
        zzctcVar.zza(zzcjlVar);
        zzclj zzP = zzcjlVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlD)).booleanValue() && zzP != null) {
            zzcrv zzcrvVar = this.zzd;
            zzP.zzc(zzcrvVar);
            zzP.zze(zzcrvVar, null, null);
        }
        zzcjlVar.zzab("/trackActiveViewUnit", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdrx
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdsa.this.zzb((zzcjl) obj, map);
            }
        });
        zzcjlVar.zzab("/untrackActiveViewUnit", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdsa.this.zzc((zzcjl) obj, map);
            }
        });
        zzcjlVar.zzP().zzJ(this.zze);
    }

    final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzd();
    }

    final /* synthetic */ void zzc(zzcjl zzcjlVar, Map map) {
        this.zzb.zzb();
    }
}
