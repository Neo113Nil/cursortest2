package com.google.android.exoplayer2.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
public final class VersionTable {
    private static final String COLUMN_FEATURE = "feature";
    private static final String COLUMN_INSTANCE_UID = "instance_uid";
    private static final String COLUMN_VERSION = "version";
    public static final int FEATURE_CACHE_CONTENT_METADATA = 1;
    public static final int FEATURE_CACHE_FILE_METADATA = 2;
    public static final int FEATURE_EXTERNAL = 1000;
    public static final int FEATURE_OFFLINE = 0;
    private static final String PRIMARY_KEY = "PRIMARY KEY (feature, instance_uid)";
    private static final String SQL_CREATE_TABLE_IF_NOT_EXISTS = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";
    private static final String TABLE_NAME = "ExoPlayerVersions";
    public static final int VERSION_UNSET = -1;
    private static final String WHERE_FEATURE_AND_INSTANCE_UID_EQUALS = "feature = ? AND instance_uid = ?";

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.database");
    }

    private VersionTable() {
    }

    private static String[] featureAndInstanceUidArguments(int i8, String str) {
        return new String[]{Integer.toString(i8), str};
    }

    public static int getVersion(SQLiteDatabase sQLiteDatabase, int i8, String str) {
        try {
            if (!Util.tableExists(sQLiteDatabase, TABLE_NAME)) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query(TABLE_NAME, new String[]{COLUMN_VERSION}, WHERE_FEATURE_AND_INSTANCE_UID_EQUALS, featureAndInstanceUidArguments(i8, str), null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i9 = query.getInt(0);
                query.close();
                return i9;
            } finally {
            }
        } catch (SQLException e8) {
            throw new DatabaseIOException(e8);
        }
    }

    public static void removeVersion(SQLiteDatabase sQLiteDatabase, int i8, String str) {
        try {
            if (Util.tableExists(sQLiteDatabase, TABLE_NAME)) {
                sQLiteDatabase.delete(TABLE_NAME, WHERE_FEATURE_AND_INSTANCE_UID_EQUALS, featureAndInstanceUidArguments(i8, str));
            }
        } catch (SQLException e8) {
            throw new DatabaseIOException(e8);
        }
    }

    public static void setVersion(SQLiteDatabase sQLiteDatabase, int i8, String str, int i9) {
        try {
            sQLiteDatabase.execSQL(SQL_CREATE_TABLE_IF_NOT_EXISTS);
            ContentValues contentValues = new ContentValues();
            contentValues.put(COLUMN_FEATURE, Integer.valueOf(i8));
            contentValues.put(COLUMN_INSTANCE_UID, str);
            contentValues.put(COLUMN_VERSION, Integer.valueOf(i9));
            sQLiteDatabase.replaceOrThrow(TABLE_NAME, null, contentValues);
        } catch (SQLException e8) {
            throw new DatabaseIOException(e8);
        }
    }
}
