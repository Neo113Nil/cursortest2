package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzecb {
    private final zzbbh zza;
    private final Context zzb;
    private final zzebg zzc;
    private final VersionInfoParcel zzd;

    public zzecb(Context context, VersionInfoParcel versionInfoParcel, zzbbh zzbbhVar, zzebg zzebgVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbbhVar;
        this.zzc = zzebgVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // com.google.android.gms.internal.ads.zzfgm
                public final /* synthetic */ Object zza(Object obj) {
                    zzecb.this.zzb(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String valueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbbn.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhiw e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbbn.zzaf.zzc zzB = zzbbn.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(Build.MODEL);
            zzB.zzo(zzebv.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(zzebv.zzc(sQLiteDatabase, 1));
            zzB.zzQ(zzebv.zzc(sQLiteDatabase, 3));
            zzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzB.zzM(zzebv.zzd(sQLiteDatabase, 2));
            final zzbbn.zzaf zzbu = zzB.zzbu();
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbbn.zzaf.zza zzaVar = (zzbbn.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbbn.zzq.ENUM_TRUE && zzaVar.zzb() > j) {
                    j = zzaVar.zzb();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbbh zzbbhVar = this.zza;
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzeby
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzbbn.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbn.zzar.zza zzs = zzbbn.zzar.zzs();
            zzs.zzc(versionInfoParcel.buddyApkVersion);
            zzs.zzg(versionInfoParcel.clientJarVersion);
            zzs.zzk(true != versionInfoParcel.isClientJar ? 2 : 0);
            final zzbbn.zzar zzbu2 = zzs.zzbu();
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzebz
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar2) {
                    zzbbn.zzm.zza zzcc = zzaVar2.zzG().zzcc();
                    zzcc.zzs(zzbbn.zzar.this);
                    zzaVar2.zzI(zzcc);
                }
            });
            zzbbhVar.zzc(10004);
            zzebv.zzb(sQLiteDatabase);
        }
        return null;
    }
}
