package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbc extends zzar implements Closeable {
    private static final String zzwp = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzwq = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzbd zzwr;
    private final zzcz zzws;
    private final zzcz zzwt;

    zzbc(zzat zzatVar) {
        super(zzatVar);
        this.zzws = new zzcz(zzbt());
        this.zzwt = new zzcz(zzbt());
        this.zzwr = new zzbd(this, zzatVar.getContext(), "google_analytics_v4.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.measurement.zzaq, com.google.android.gms.internal.measurement.zzbc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zza(String str, String[] strArr) {
        SQLiteException e;
        ?? writableDatabase = getWritableDatabase();
        try {
            try {
                Cursor rawQuery = writableDatabase.rawQuery(str, null);
                try {
                    if (!rawQuery.moveToFirst()) {
                        throw new SQLiteException("Database returned empty set");
                    }
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzd("Database error", str, e);
                    throw e;
                }
            } catch (Throwable th) {
                th = th;
                if (writableDatabase != 0) {
                    writableDatabase.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            writableDatabase = 0;
            if (writableDatabase != 0) {
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            try {
                rawQuery = getWritableDatabase().rawQuery(str, strArr);
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery == null) {
                return 0L;
            }
            rawQuery.close();
            return 0L;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = rawQuery;
            zzd("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            cursor = rawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final List<Long> zzc(long j) {
        Cursor query;
        zzk.zzab();
        zzch();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                query = writableDatabase.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(Long.valueOf(query.getLong(0)));
                } while (query.moveToNext());
            }
            if (query != null) {
                query.close();
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = query;
            zzd("Error selecting hit ids", e);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    private final long zzcr() {
        zzk.zzab();
        zzch();
        return zza("SELECT COUNT(*) FROM hits2", (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzcz() {
        return "google_analytics_v4.db";
    }

    @VisibleForTesting
    private final Map<String, String> zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            return HttpUtils.parse(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            zze("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @VisibleForTesting
    private final Map<String, String> zzw(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            return HttpUtils.parse(new URI(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")), "UTF-8");
        } catch (URISyntaxException e) {
            zze("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    public final void beginTransaction() {
        zzch();
        getWritableDatabase().beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        String str;
        try {
            this.zzwr.close();
        } catch (SQLiteException e) {
            e = e;
            str = "Sql error closing database";
            zze(str, e);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "Error closing database";
            zze(str, e);
        }
    }

    public final void endTransaction() {
        zzch();
        getWritableDatabase().endTransaction();
    }

    @VisibleForTesting
    final SQLiteDatabase getWritableDatabase() {
        try {
            return this.zzwr.getWritableDatabase();
        } catch (SQLiteException e) {
            zzd("Error opening database", e);
            throw e;
        }
    }

    final boolean isEmpty() {
        return zzcr() == 0;
    }

    public final void setTransactionSuccessful() {
        zzch();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final long zza(long j, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzch();
        zzk.zzab();
        return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0L);
    }

    public final void zza(List<Long> list) {
        Preconditions.checkNotNull(list);
        zzk.zzab();
        zzch();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = list.get(i);
            if (l == null || l.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(l);
        }
        sb.append(")");
        String sb2 = sb.toString();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            zza("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = writableDatabase.delete("hits2", sb2, null);
            if (delete != list.size()) {
                zzb("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
            }
        } catch (SQLiteException e) {
            zze("Error deleting hits", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final void zzc(zzch zzchVar) {
        Preconditions.checkNotNull(zzchVar);
        zzk.zzab();
        zzch();
        Preconditions.checkNotNull(zzchVar);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : zzchVar.zzcs().entrySet()) {
            String key = entry.getKey();
            if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key)) {
                builder.appendQueryParameter(key, entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            zzbu().zza(zzchVar, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = zzcc.zzyk.get().intValue();
        long zzcr = zzcr();
        if (zzcr > intValue - 1) {
            List<Long> zzc = zzc((zzcr - intValue) + 1);
            zzd("Store full, deleting hits to make room, count", Integer.valueOf(zzc.size()));
            zza(zzc);
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(zzchVar.zzen()));
        contentValues.put("hit_app_id", Integer.valueOf(zzchVar.zzel()));
        contentValues.put("hit_url", zzchVar.zzeo() ? zzbu.zzdz() : zzbu.zzea());
        try {
            long insert = writableDatabase.insert("hits2", null, contentValues);
            if (insert == -1) {
                zzu("Failed to insert a hit (got -1)");
            } else {
                zzb("Hit saved to database. db-id, hit", Long.valueOf(insert), zzchVar);
            }
        } catch (SQLiteException e) {
            zze("Error storing a hit", e);
        }
    }

    public final int zzcx() {
        zzk.zzab();
        zzch();
        if (!this.zzws.zzj(86400000L)) {
            return 0;
        }
        this.zzws.start();
        zzq("Deleting stale hits (if any)");
        int delete = getWritableDatabase().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzbt().currentTimeMillis() - 2592000000L)});
        zza("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final long zzcy() {
        zzk.zzab();
        zzch();
        return zza(zzwq, (String[]) null, 0L);
    }

    public final List<zzch> zzd(long j) {
        int i;
        int i2;
        int i3;
        Cursor query;
        int i4 = 0;
        Preconditions.checkArgument(j >= 0);
        zzk.zzab();
        zzch();
        Cursor cursor = null;
        try {
            try {
                i = 2;
                i2 = 3;
                i3 = 4;
                query = getWritableDatabase().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (query.moveToFirst()) {
                while (true) {
                    arrayList.add(new zzch(this, zzv(query.getString(i)), query.getLong(1), zzdd.zzah(query.getString(i2)), query.getLong(i4), query.getInt(i3)));
                    if (!query.moveToNext()) {
                        break;
                    }
                    i4 = 0;
                    i2 = 3;
                    i3 = 4;
                    i = 2;
                }
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = query;
            zze("Error loading hits from the database", e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zze(long j) {
        zzk.zzab();
        zzch();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        zza("Deleting hit, id", Long.valueOf(j));
        zza(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzaw> zzf(long j) {
        Cursor cursor;
        Cursor cursor2;
        zzch();
        zzk.zzab();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int intValue = zzcc.zzym.get().intValue();
            Cursor query = writableDatabase.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(intValue));
            try {
                ArrayList arrayList = new ArrayList();
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        boolean z = query.getInt(2) != 0;
                        long j2 = query.getInt(3);
                        Map<String, String> zzw = zzw(query.getString(4));
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            arrayList.add(new zzaw(0L, string, string2, z, j2, zzw));
                        }
                        zzc("Read property with empty client id or tracker id", string, string2);
                    } while (query.moveToNext());
                }
                if (arrayList.size() >= intValue) {
                    zzt("Sending hits to too many properties. Campaign report might be incorrect");
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor2 = query;
                try {
                    zze("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }
}
