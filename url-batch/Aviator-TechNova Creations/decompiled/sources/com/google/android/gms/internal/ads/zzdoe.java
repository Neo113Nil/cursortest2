package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdoe {
    private zzbkp zza;

    public zzdoe(zzdnp zzdnpVar) {
        this.zza = zzdnpVar;
    }

    public final synchronized zzbkp zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbkp zzbkpVar) {
        this.zza = zzbkpVar;
    }
}
