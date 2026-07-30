package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzerw implements zzese {
    final /* synthetic */ zzerx zza;

    zzerw(zzerx zzerxVar) {
        Objects.requireNonNull(zzerxVar);
        this.zza = zzerxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzerx zzerxVar = this.zza;
        synchronized (zzerxVar) {
            zzerxVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzerx zzerxVar = this.zza;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzerxVar) {
            zzerxVar.zzM(zzdknVar);
            zzerxVar.zzL().zzj();
        }
    }
}
