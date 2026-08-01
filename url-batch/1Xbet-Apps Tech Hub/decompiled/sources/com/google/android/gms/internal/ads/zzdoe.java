package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdoe {
    private final Executor zza;
    private final zzcqv zzb;
    private final zzdfy zzc;

    zzdoe(Executor executor, zzcqv zzcqvVar, zzdfy zzdfyVar) {
        this.zza = executor;
        this.zzc = zzdfyVar;
        this.zzb = zzcqvVar;
    }

    public final void zza(final zzcgv zzcgvVar) {
        if (zzcgvVar == null) {
            return;
        }
        this.zzc.zza(zzcgvVar.zzF());
        this.zzc.zzo(new zzavq() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // com.google.android.gms.internal.ads.zzavq
            public final void zzbu(zzavp zzavpVar) {
                zzcii zzN = zzcgv.this.zzN();
                Rect rect = zzavpVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzavq() { // from class: com.google.android.gms.internal.ads.zzdob
            @Override // com.google.android.gms.internal.ads.zzavq
            public final void zzbu(zzavp zzavpVar) {
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzavpVar.zzj ? "0" : "1");
                zzcgv.this.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcgvVar);
        zzcgvVar.zzad("/trackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdoc
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdoe.this.zzb((zzcgv) obj, map);
            }
        });
        zzcgvVar.zzad("/untrackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdoe.this.zzc((zzcgv) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcgv zzcgvVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcgv zzcgvVar, Map map) {
        this.zzb.zza();
    }
}
