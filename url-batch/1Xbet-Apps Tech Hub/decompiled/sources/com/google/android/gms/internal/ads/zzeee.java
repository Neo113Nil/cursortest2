package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeee {
    private final zzayp zza;
    private final Context zzb;
    private final zzedi zzc;
    private final zzcbt zzd;
    private final String zze;
    private final zzfje zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzi();

    public zzeee(Context context, zzcbt zzcbtVar, zzayp zzaypVar, zzedi zzediVar, String str, zzfje zzfjeVar) {
        this.zzb = context;
        this.zzd = zzcbtVar;
        this.zza = zzaypVar;
        this.zzc = zzediVar;
        this.zze = str;
        this.zzf = zzfjeVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbay zzbayVar = (zzbay) arrayList.get(i);
            if (zzbayVar.zzw() == 2 && zzbayVar.zze() > j) {
                j = zzbayVar.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeea
                @Override // com.google.android.gms.internal.ads.zzfhx
                public final Object zza(Object obj) {
                    zzeee.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            zzcbn.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
            zzfjd zzb = zzfjd.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzedx.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzedx.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzedx.zzb(sQLiteDatabase, 2)));
            zzb.zza("oa_session_id", this.zzg.zzQ() ? "" : this.zze);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzedx.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i = 0; i < size; i++) {
                zzbay zzbayVar = (zzbay) zzc.get(i);
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzg;
                zzfjd zzb2 = zzfjd.zzb("oa_signals");
                zzb2.zza("oa_session_id", zzgVar.zzQ() ? "" : this.zze);
                zzbat zzf = zzbayVar.zzf();
                String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                String obj = zzfxi.zzb(zzbayVar.zzk(), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeed
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object apply(Object obj2) {
                        return ((zzazn) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzbayVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzbayVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzbayVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzbayVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", valueOf);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzbayVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzbayVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzbayVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzbayVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzbayVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzbayVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzedx.zzc(sQLiteDatabase);
            Context context = this.zzb;
            zzbaz zza = zzbbd.zza();
            zza.zzb(context.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzedx.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzedx.zza(sQLiteDatabase, 1));
            zza.zzc(zzedx.zza(sQLiteDatabase, 3));
            zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zza.zzf(zzedx.zzb(sQLiteDatabase, 2));
            final zzbbd zzbbdVar = (zzbbd) zza.zzal();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzeeb
                @Override // com.google.android.gms.internal.ads.zzayo
                public final void zza(zzbae zzbaeVar) {
                    zzbaeVar.zzi(zzbbd.this);
                }
            });
            zzcbt zzcbtVar = this.zzd;
            zzbbo zza2 = zzbbp.zza();
            zza2.zza(zzcbtVar.zzb);
            zza2.zzc(this.zzd.zzc);
            zza2.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzbbp zzbbpVar = (zzbbp) zza2.zzal();
            this.zza.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzeec
                @Override // com.google.android.gms.internal.ads.zzayo
                public final void zza(zzbae zzbaeVar) {
                    zzazw zzazwVar = (zzazw) zzbaeVar.zzb().zzaB();
                    zzazwVar.zzb(zzbbp.this);
                    zzbaeVar.zzg(zzazwVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzedx.zzf(sQLiteDatabase);
        return null;
    }
}
