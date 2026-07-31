package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzax {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[Catch: SQLiteException -> 0x00a4, TryCatch #3 {SQLiteException -> 0x00a4, blocks: (B:14:0x0046, B:17:0x006c, B:19:0x007a, B:21:0x0082, B:23:0x0085, B:24:0x00a3, B:28:0x00a9, B:30:0x00ac, B:32:0x00b4, B:34:0x00bb, B:37:0x00be, B:39:0x00c4, B:44:0x00d5, B:45:0x00d9, B:16:0x0065), top: B:13:0x0046, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[Catch: SQLiteException -> 0x00a4, LOOP:1: B:28:0x00a9->B:34:0x00bb, LOOP_START, PHI: r0
      0x00a9: PHI (r0v11 int) = (r0v10 int), (r0v12 int) binds: [B:27:0x00a7, B:34:0x00bb] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {SQLiteException -> 0x00a4, blocks: (B:14:0x0046, B:17:0x006c, B:19:0x007a, B:21:0x0082, B:23:0x0085, B:24:0x00a3, B:28:0x00a9, B:30:0x00ac, B:32:0x00b4, B:34:0x00bb, B:37:0x00be, B:39:0x00c4, B:44:0x00d5, B:45:0x00d9, B:16:0x0065), top: B:13:0x0046, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: SQLiteException -> 0x00a4, TryCatch #3 {SQLiteException -> 0x00a4, blocks: (B:14:0x0046, B:17:0x006c, B:19:0x007a, B:21:0x0082, B:23:0x0085, B:24:0x00a3, B:28:0x00a9, B:30:0x00ac, B:32:0x00b4, B:34:0x00bb, B:37:0x00be, B:39:0x00c4, B:44:0x00d5, B:45:0x00d9, B:16:0x0065), top: B:13:0x0046, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void zza(zzhe zzheVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursor;
        HashSet hashSet;
        Cursor rawQuery;
        if (zzheVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
            }
        } catch (SQLiteException e4) {
            e = e4;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e5) {
                    e = e5;
                    zzheVar.zzk().zzc("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    try {
                        hashSet = new HashSet();
                        rawQuery = sQLiteDatabase2.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(StringUtils.COMMA)) {
                                if (!hashSet.remove(str4)) {
                                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                                }
                            }
                            if (strArr != null) {
                                for (int i4 = 0; i4 < strArr.length; i4 += 2) {
                                    if (!hashSet.remove(strArr[i4])) {
                                        sQLiteDatabase2.execSQL(strArr[i4 + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                zzheVar.zzk().zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                            }
                        } catch (Throwable th3) {
                            rawQuery.close();
                            throw th3;
                        }
                    } catch (SQLiteException e6) {
                        zzheVar.zze().zzb("Failed to verify columns on table that was just created", str);
                        throw e6;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursor = null;
            zzheVar.zzk().zzc("Error querying for table", str, e);
            if (cursor != null) {
            }
            sQLiteDatabase2.execSQL(str2);
            hashSet = new HashSet();
            rawQuery = sQLiteDatabase2.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            rawQuery.close();
            while (r1 < r14) {
            }
            if (strArr != null) {
            }
            if (hashSet.isEmpty()) {
            }
        }
    }

    static void zzb(zzhe zzheVar, SQLiteDatabase sQLiteDatabase) {
        if (zzheVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.zzbx.zza();
        String path = sQLiteDatabase.getPath();
        int i4 = com.google.android.gms.internal.measurement.zzcc.zzb;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            zzheVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzheVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzheVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzheVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}
