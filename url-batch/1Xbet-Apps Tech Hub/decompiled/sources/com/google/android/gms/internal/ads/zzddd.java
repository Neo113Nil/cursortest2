package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzddd implements zzdbc {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbf)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final synchronized void zzbt(zzfeh zzfehVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbg)).booleanValue()) {
            try {
                this.zza = zzfehVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
