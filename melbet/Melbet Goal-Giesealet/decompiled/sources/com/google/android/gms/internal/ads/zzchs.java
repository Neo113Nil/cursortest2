package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzchs implements zzhpx {
    private final zzcgx zza;

    private zzchs(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzchs zzc(zzcgx zzcgxVar) {
        return new zzchs(zzcgxVar);
    }

    public static VersionInfoParcel zzd(zzcgx zzcgxVar) {
        VersionInfoParcel zzd = zzcgxVar.zzd();
        zzhqf.zzb(zzd);
        return zzd;
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
