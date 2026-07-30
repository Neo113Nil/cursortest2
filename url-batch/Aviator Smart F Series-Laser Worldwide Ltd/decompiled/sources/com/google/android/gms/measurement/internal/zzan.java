package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.baidu.ar.util.SystemInfoUtil;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzan {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r3 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void zza(zzeu zzeuVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteException e8;
        Cursor cursor;
        if (zzeuVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e9) {
                    e8 = e9;
                    zzeuVar.zzk().zzc("Error querying for table", str, e8);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    try {
                        HashSet hashSet = new HashSet();
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(SystemInfoUtil.COMMA)) {
                                if (!hashSet.remove(str4)) {
                                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                                }
                            }
                            if (strArr != null) {
                                for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                                    if (!hashSet.remove(strArr[i8])) {
                                        sQLiteDatabase.execSQL(strArr[i8 + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            zzeuVar.zzk().zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    } catch (SQLiteException e10) {
                        zzeuVar.zzd().zzb("Failed to verify columns on table that was just created", str);
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e8 = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    static void zzb(zzeu zzeuVar, SQLiteDatabase sQLiteDatabase) {
        if (zzeuVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzeuVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzeuVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzeuVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzeuVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}
