package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzedh implements zzgax {
    final /* synthetic */ zzfhx zza;

    zzedh(zzedi zzediVar, zzfhx zzfhxVar) {
        this.zza = zzfhxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzcbn.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzcbn.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
