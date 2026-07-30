package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzefy implements zzeek {
    final /* synthetic */ zzegb zza;

    zzefy(zzegb zzegbVar) {
        Objects.requireNonNull(zzegbVar);
        this.zza = zzegbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpB)).booleanValue()) {
            zzdxy zza = this.zza.zzd().zza();
            zza.zzc("action", "ptard");
            zza.zzc("ptard", "r");
            zza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }
}
