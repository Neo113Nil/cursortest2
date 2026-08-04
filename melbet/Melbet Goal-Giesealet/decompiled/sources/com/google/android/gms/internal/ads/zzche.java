package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzche implements zzhpx {
    private final zzcgx zza;

    private zzche(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzche zzc(zzcgx zzcgxVar) {
        return new zzche(zzcgxVar);
    }

    public static WeakReference zzd(zzcgx zzcgxVar) {
        WeakReference zzc = zzcgxVar.zzc();
        zzhqf.zzb(zzc);
        return zzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
