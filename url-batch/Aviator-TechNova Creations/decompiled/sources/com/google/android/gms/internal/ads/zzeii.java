package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeii {
    private final zzbgd zza;
    private final Context zzb;
    private final zzehn zzc;
    private final VersionInfoParcel zzd;

    public zzeii(Context context, VersionInfoParcel versionInfoParcel, zzbgd zzbgdVar, zzehn zzehnVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbgdVar;
        this.zzc = zzehnVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeih
                @Override // com.google.android.gms.internal.ads.zzfmu
                public final /* synthetic */ Object zza(Object obj) {
                    zzeii.this.zzb(z, (SQLiteDatabase) obj);
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
                    arrayList.add(zzbgj.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzicg e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbgj.zzaf.zzc zzB = zzbgj.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(Build.MODEL);
            zzB.zzo(zzeic.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(zzeic.zzc(sQLiteDatabase, 1));
            zzB.zzQ(zzeic.zzc(sQLiteDatabase, 3));
            zzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzB.zzM(zzeic.zzd(sQLiteDatabase, 2));
            final zzbgj.zzaf zzbu = zzB.zzbu();
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbgj.zzaf.zza zzaVar = (zzbgj.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbgj.zzq.ENUM_TRUE && zzaVar.zzb() > j) {
                    j = zzaVar.zzb();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbgd zzbgdVar = this.zza;
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzeif
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzbgj.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbgj.zzar.zza zzs = zzbgj.zzar.zzs();
            zzs.zzc(versionInfoParcel.buddyApkVersion);
            zzs.zzg(versionInfoParcel.clientJarVersion);
            zzs.zzk(true != versionInfoParcel.isClientJar ? 2 : 0);
            final zzbgj.zzar zzbu2 = zzs.zzbu();
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzeig
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar2) {
                    zzbgj.zzm.zza zzcc = zzaVar2.zzG().zzcc();
                    zzcc.zzs(zzbgj.zzar.this);
                    zzaVar2.zzI(zzcc);
                }
            });
            zzbgdVar.zzc(10004);
            zzeic.zzb(sQLiteDatabase);
        }
        return null;
    }
}
