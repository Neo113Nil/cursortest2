package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeep extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgbl zzb;

    public zzeep(Context context, zzgbl zzgblVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzij)).intValue());
        this.zza = context;
        this.zzb = zzgblVar;
    }

    static /* synthetic */ Void zzb(zzcbs zzcbsVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzcbsVar);
        return null;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcbs zzcbsVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcbsVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzcbs zzcbsVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ImagesContract.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzcbsVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final /* synthetic */ Void zza(zzeer zzeerVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeerVar.zza));
        contentValues.put("gws_query_id", zzeerVar.zzb);
        contentValues.put(ImagesContract.URL, zzeerVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeerVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(this.zza);
        if (zzy != null) {
            try {
                zzy.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                zzeep.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzeer zzeerVar) {
        zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                zzeep.this.zza(zzeerVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void zze(zzfhx zzfhxVar) {
        zzgbb.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeep.this.getWritableDatabase();
            }
        }), new zzeeo(this, zzfhxVar), this.zzb);
    }

    final void zzg(final SQLiteDatabase sQLiteDatabase, final zzcbs zzcbsVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // java.lang.Runnable
            public final void run() {
                zzeep.zzf(sQLiteDatabase, str, zzcbsVar);
            }
        });
    }

    public final void zzh(final zzcbs zzcbsVar, final String str) {
        zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                zzeep.this.zzg((SQLiteDatabase) obj, zzcbsVar, str);
                return null;
            }
        });
    }
}
