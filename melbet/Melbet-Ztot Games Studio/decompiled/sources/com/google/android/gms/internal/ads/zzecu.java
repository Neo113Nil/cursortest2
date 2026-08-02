package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzecu {
    private final zzbav zza;
    private final Context zzb;
    private final zzebz zzc;
    private final VersionInfoParcel zzd;

    public zzecu(Context context, VersionInfoParcel versionInfoParcel, zzbav zzbavVar, zzebz zzebzVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbavVar;
        this.zzc = zzebzVar;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfio() { // from class: com.google.android.gms.internal.ads.zzecr
                @Override // com.google.android.gms.internal.ads.zzfio
                public final Object zza(Object obj) {
                    zzecu.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbbc.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyn e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbbc.zzaf.zzc zzi = zzbbc.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzeco.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzeco.zza(sQLiteDatabase, 1));
            zzi.zzx(zzeco.zza(sQLiteDatabase, 3));
            zzi.zzF(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzi.zzB(zzeco.zzb(sQLiteDatabase, 2));
            final zzbbc.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                zzbbc.zzaf.zza zzaVar = (zzbbc.zzaf.zza) arrayList.get(i);
                if (zzaVar.zzk() == zzbbc.zzq.ENUM_TRUE && zzaVar.zze() > j) {
                    j = zzaVar.zze();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzecs
                @Override // com.google.android.gms.internal.ads.zzbau
                public final void zza(zzbbc.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbbc.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbc.zzar.zza zzd = zzbbc.zzar.zzd();
            zzd.zzg(versionInfoParcel.buddyApkVersion);
            zzd.zzi(this.zzd.clientJarVersion);
            zzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final zzbbc.zzar zzbr2 = zzd.zzbr();
            this.zza.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzect
                @Override // com.google.android.gms.internal.ads.zzbau
                public final void zza(zzbbc.zzt.zza zzaVar2) {
                    zzbbc.zzm.zza zzbM = zzaVar2.zzg().zzbM();
                    zzbM.zzw(zzbbc.zzar.this);
                    zzaVar2.zzK(zzbM);
                }
            });
            this.zza.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            zzeco.zze(sQLiteDatabase);
        }
        return null;
    }
}
