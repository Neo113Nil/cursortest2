package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final class ya2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34968a = 0;

    static {
        k60.a("goog.exo.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i4, String str) {
        try {
            if (!u82.a(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i4), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i5 = query.getInt(0);
                query.close();
                return i5;
            } finally {
            }
        } catch (SQLException e4) {
            throw new nv(e4);
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i4, String str, int i5) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i4));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i5));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e4) {
            throw new nv(e4);
        }
    }
}
