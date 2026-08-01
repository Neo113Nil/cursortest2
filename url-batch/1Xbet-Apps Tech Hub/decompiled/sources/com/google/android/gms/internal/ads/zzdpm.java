package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpm extends zzdow implements zzdge {
    private zzdge zza;

    @Override // com.google.android.gms.internal.ads.zzdge
    public final synchronized void zzbL() {
        zzdge zzdgeVar = this.zza;
        if (zzdgeVar != null) {
            zzdgeVar.zzbL();
        }
    }

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbit zzbitVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, zzdge zzdgeVar) {
        super.zzh(zzaVar, zzbitVar, zzoVar, zzbivVar, zzzVar);
        this.zza = zzdgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final synchronized void zzs() {
        zzdge zzdgeVar = this.zza;
        if (zzdgeVar != null) {
            zzdgeVar.zzs();
        }
    }
}
