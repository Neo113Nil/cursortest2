package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzdow implements com.google.android.gms.ads.internal.client.zza, zzbit, com.google.android.gms.ads.internal.overlay.zzo, zzbiv, com.google.android.gms.ads.internal.overlay.zzz {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbit zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbiv zzd;
    private com.google.android.gms.ads.internal.overlay.zzz zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbit
    public final synchronized void zza(String str, Bundle bundle) {
        zzbit zzbitVar = this.zzb;
        if (zzbitVar != null) {
            zzbitVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final synchronized void zzb(String str, String str2) {
        zzbiv zzbivVar = this.zzd;
        if (zzbivVar != null) {
            zzbivVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbM() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbp() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbp();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbw() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbw();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbz(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbz(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zze;
        if (zzzVar != null) {
            zzzVar.zzg();
        }
    }

    protected final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbit zzbitVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar) {
        this.zza = zzaVar;
        this.zzb = zzbitVar;
        this.zzc = zzoVar;
        this.zzd = zzbivVar;
        this.zze = zzzVar;
    }
}
