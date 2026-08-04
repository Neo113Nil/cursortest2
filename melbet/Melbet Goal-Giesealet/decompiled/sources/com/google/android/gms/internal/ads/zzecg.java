package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzecg implements zzgoq {
    final /* synthetic */ zzfgm zza;

    zzecg(zzecn zzecnVar, zzfgm zzfgmVar) {
        this.zza = zzfgmVar;
        Objects.requireNonNull(zzecnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        String message = th.getMessage();
        String.valueOf(message);
        String valueOf = String.valueOf(message);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline buffered ping database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String valueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline buffered ping database: ".concat(valueOf));
        }
    }
}
