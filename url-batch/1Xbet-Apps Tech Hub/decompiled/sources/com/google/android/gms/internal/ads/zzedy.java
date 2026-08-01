package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzedy implements zzfiv {
    private final zzedm zza;
    private final zzedq zzb;

    zzedy(zzedm zzedmVar, zzedq zzedqVar) {
        this.zza = zzedmVar;
        this.zzb = zzedqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbH(zzfio zzfioVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbI(zzfio zzfioVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue() && zzfio.RENDERER == zzfioVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzbJ(zzfio zzfioVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue()) {
            if (zzfio.RENDERER == zzfioVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                return;
            }
            if (zzfio.PRELOADED_LOADER == zzfioVar || zzfio.SERVER_TRANSACTION == zzfioVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                final zzedq zzedqVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzedqVar.zza.zza(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzedp
                    @Override // com.google.android.gms.internal.ads.zzfhx
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzedq.this.zzf()) {
                            return null;
                        }
                        long j = zzd;
                        zzbax zzg = zzbay.zzg();
                        zzg.zzh(j);
                        byte[] zzax = ((zzbay) zzg.zzal()).zzax();
                        zzedx.zzg(sQLiteDatabase, false, false);
                        zzedx.zzd(sQLiteDatabase, j, zzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzd(zzfio zzfioVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue() && zzfio.RENDERER == zzfioVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
